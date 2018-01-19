package com.ipower365.saas.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.XLSReadStatus;
import net.sf.jxls.reader.XLSReader;
import net.sf.jxls.transformer.XLSTransformer;
import net.sf.jxls.util.Util;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ipower365.saas.basic.constants.Constants;

/**
 * 处理Excel的工具类
 * 
 * @author Anker.du
 * @date 2014年10月22日
 */
public final class ExcelUtils {

	private static final Logger LOG = LoggerFactory.getLogger(ExcelUtils.class);
	
	public static final String EXTENS_EXCEL = ".xls";
	public static final String EXTENS_EXCEL_2007 = ".xlsx";

	private ExcelUtils() {
	}

	/**
	 * 根据Java对象创建Excel
	 * 
	 * @param tempFilePath
	 * @param beanParams
	 * @param destFilePath
	 */
	public static void genExcel(String tempFilePath, Map<String, Object> beanParams, String destFilePath) throws ParsePropertyException, InvalidFormatException, IOException {
		XLSTransformer transformer = new XLSTransformer();
		transformer.transformXLS(tempFilePath, beanParams, destFilePath);
	}

	/**
	 * 根据一组Java对象创建多Sheet的Excel
	 * 
	 * @param tempFilePath Excel模版文件路径
	 * @param entities 待写入的Java对象封装实体
	 * @param beanParams Sheet中公用的参数
	 * @param destFilePath 目标Excel文件路径
	 */
	public static void genExcelWithMultipleSheets(String tempFilePath, List<RenderEntity> entities, Map<String, Object> beanParams, String destFilePath){
		MyXLSTransformer transformer = new MyXLSTransformer();
		
		if(StringUtils.isBlank(tempFilePath) || StringUtils.isBlank(destFilePath) || CollectionUtils.isEmpty(entities)) {
			throw new IllegalArgumentException();
		}
		
		List<String> newSheetNames = new ArrayList<>();
		List<String> beanNames = new ArrayList<>();
		List<Object> objects = new ArrayList<>();
		for(RenderEntity entity : entities) {
			newSheetNames.add(entity.getSheetName());
			beanNames.add(entity.getBeanName());
			objects.add(entity.getObject());
		}
		
		// 读取和写入后关闭流
		try (InputStream is = new BufferedInputStream(new FileInputStream(tempFilePath));//
				OutputStream os = new BufferedOutputStream(new FileOutputStream(destFilePath));//
				) {
			
			org.apache.poi.ss.usermodel.Workbook workbook = 
					transformer.transformMultipleSheetsList(is, newSheetNames, beanNames, objects, beanParams);

			workbook.write(os);
		} catch (IOException e) {
			LOG.error("读取文件出错", e);
		} catch (ParsePropertyException |InvalidFormatException e) {
			LOG.error("解析文件出错", e);
		}
	}
	
	/**
	 * 解析Excel数据到Map
	 * 
	 * @param resultMap
	 *            返回结果
	 * @param xmlconfig
	 *            规则文件
	 * @param excelPath
	 * @return
	 * @throws Exception
	 */
	public static XLSReadStatus resolve(Map<String, Object> resultMap, File ruleFile, File dataFile) throws Exception {
		// 规则文件
		InputStream inputXML = new BufferedInputStream(new FileInputStream(ruleFile));
		// 数据文件
		InputStream inputXLS = new BufferedInputStream(new FileInputStream(dataFile));
		XLSReader reader = ReaderBuilder.buildFromXML(inputXML);
		// 读取文件至map
		XLSReadStatus readStatus = reader.read(inputXLS, resultMap);
		return readStatus;
	}

	/**
	 * 读取Excel数据内容
	 * 
	 * @param InputStream
	 * @return Map 包含单元格数据内容的Map对象
	 */
	public static TreeMap<Integer, String[]> readExcel(File f) {
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row;
		TreeMap<Integer, String[]> content = new TreeMap<Integer, String[]>();
		String[] value;
		InputStream fs = null;
		try {
			if (null == f)
				return content;
			fs = new FileInputStream(f);
			wb = new XSSFWorkbook(fs);
			sheet = wb.getSheetAt(0);
			int rowNum = sheet.getLastRowNum();
			row = sheet.getRow(0);
			int colNum = row.getPhysicalNumberOfCells();
			for (int i = 0; i <= rowNum; i++) {
				value = new String[colNum];
				row = sheet.getRow(i);
				int j = 0;
				while (j < colNum) {
					value[j] = getCellFormatValue(row.getCell((short) j)).trim();
					j++;
				}
				if (isEmpty(value)) {
					continue;
				}
				content.put(i, value);
				value = null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fs)
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return content;
	}

	/**
	 * 根据XSSFCell类型设置数据
	 * 
	 * @param cell
	 * @return
	 */
    public static String getCellFormatValue(Cell cell) {
        if (cell == null) {
            return StringUtils.EMPTY;
        }
        String cellValue = "";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                // 字符串格式
                cellValue = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                // 数字格式，包含日期
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    // 日期
                    Date date = cell.getDateCellValue();
                    cellValue = DateUtil.format(Constants.DEFULT_DATE_FORMATTER, date);
                } else {
                    // 数字格式，保留原始的内容
                    DataFormatter dataFormatter = new DataFormatter();
                    cellValue = dataFormatter.formatCellValue(cell);
//                    cellValue = String.valueOf(cell.getNumericCellValue());   // 直接使用numberic格式后会在末尾多个.0
                }
                break;
            case Cell.CELL_TYPE_FORMULA:
                // 公式
                switch (cell.getCachedFormulaResultType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        // 数学公式
                        cellValue = String.valueOf(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_STRING:
                        // 文本公式
                        cellValue = cell.getRichStringCellValue().getString();
                        break;
                }
                break;
        }
        return cellValue;
    }
    
    /**
     * 读取Sheet数据
     * 
     * @param filePath Excel文件路径
     * @param sheetName Excel工作表名称
     * @return
     * @throws Exception
     */
    public static  List<String[]> readSheetData(String filePath, String sheetName) {
        List<String[]> datas = new ArrayList<String[]>();       
        InputStream is = null;
        XSSFWorkbook xssfWorkbook = null;
        XSSFSheet xssfSheet = null;
        try {
            is = new FileInputStream(filePath);
            xssfWorkbook = new XSSFWorkbook(is);
            xssfSheet = xssfWorkbook.getSheet(sheetName);
            HSSFDataFormatter dataFormatter = new HSSFDataFormatter();
            
            for (int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                    int cellNum = xssfRow.getLastCellNum();
                    String[] data = new String[cellNum];
                    for (int i = 0; i < cellNum; i++) {
                        XSSFCell cell = xssfRow.getCell(i);
                        if(cell != null){
                            data[i] = dataFormatter.formatCellValue(cell);
                        }
                    }
                    datas.add(data);
                }
            }
        } catch (Exception e) {
            LOG.error("excel sheet read error", e);
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    LOG.error("InputStream close error", e);
                    return null;
                }
            }
        }
        
        return datas;
    }
    
    private static class MyXLSTransformer extends XLSTransformer {
        public org.apache.poi.ss.usermodel.Workbook transformMultipleSheetsList(//
                InputStream is, //
                List<String> newSheetNames, //
                List<String> beanNames, //
                List<Object> objects, //
                Map<String, Object> beanParams) throws ParsePropertyException, InvalidFormatException, IOException {

            if (objects == null || beanNames == null) return null;

            if (objects.size() != beanNames.size())
                throw new IllegalArgumentException("unequal size of beanNames and objects");

            if(beanParams == null) beanParams = new HashMap<String, Object>();
            
            org.apache.poi.ss.usermodel.Workbook result = WorkbookFactory.create(is);

            int nrOfSheet = result.getNumberOfSheets();
            String currentBeanName = null;
            String currentSheetName = null;
            int currentSheetNo = 0;
            Object currentBean = null;
            for (int i = 0; i < nrOfSheet; i++) {
                currentSheetNo = i + nrOfSheet;
                currentSheetName = newSheetNames.get(i);
                currentBeanName = beanNames.get(i);
                currentBean = objects.get(i);

                currentBeanName = StringUtils.defaultIfBlank(currentBeanName, "");
                currentSheetName = StringUtils.defaultIfBlank(currentSheetName, "_Sheet" + currentSheetNo);

                org.apache.poi.ss.usermodel.Sheet hssfSheet = result.getSheetAt(i);
                org.apache.poi.ss.usermodel.Sheet newSheet = result.createSheet(currentSheetName);
                Util.copySheets(newSheet, hssfSheet, currentBeanName, currentBeanName);
                result.setSheetName(currentSheetNo, currentSheetName);

                if (StringUtils.isNotBlank(currentBeanName) && currentBean != null) {
                    beanParams.put(currentBeanName, currentBean);
                }

                Util.copyPageSetup(newSheet, hssfSheet);
                Util.copyPrintSetup(newSheet, hssfSheet);
            }

            LOG.debug("current nrOfSheet=" + result.getNumberOfSheets());
            for (int i = nrOfSheet - 1; i >= 0; i--) {
                result.removeSheetAt(i);
            }

            LOG.debug("current nrOfSheet=" + result.getNumberOfSheets());
            for (int i = 0; i < result.getNumberOfSheets(); i++) {
                Util.setPrintArea(result, i);
            }

            LOG.debug("parse bean parameters with workbook");
            transformWorkbook(result, beanParams);

            return result;
        }
    }
    
    private static boolean isEmpty(String[] value) {
        boolean f = true;
        if (CommonUtil.isEmpty(value))
            return f;
        for (String s : value) {
            if (CommonUtil.isNotEmpty(s)) {
                return false;
            }
        }
        return f;
    }
    
    public static class RenderEntity {
        private String sheetName; // Sheet页名称
        private String beanName; // jxls表达式变量名
        private Object object; // 待填入jxls表达式变量名的实际Java对象
        
         public RenderEntity(String sheetName, String beanName, Object object) {
            this.sheetName = sheetName;
            this.beanName = beanName;
            this.object = object;
        }

        public String getSheetName() {
            return sheetName;
        }

        public String getBeanName() {
            return beanName;
        }

        public Object getObject() {
            return object;
        }
         
    }

}
