package com.ipower365.saas.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.web.multipart.MultipartFile;





import com.ipower365.saas.basic.constants.SystemConstants;

public final class FileUtils {
	private static Logger log = LoggerFactory.getLogger(FileUtils.class);

	private FileUtils() {
	}

	/**
	 * 创建文件夹
	 * 
	 * @param path
	 */
	public static boolean createFolder(String path) {
		boolean success = false;
		if (CommonUtil.isEmpty(path))
			return success;
		try {
			File file = new File(path);
			if (!file.exists()) {
				success = file.mkdirs();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	/**
	 * 创建文件
	 * 
	 * @param path
	 * @param content
	 *            内容
	 * @return
	 */
	public boolean createFile(String path, String content) {
		boolean success = false;
		try {
			File file = new File(path);
			if (!file.exists()) {
				success = file.createNewFile();
			}
			if (success && CommonUtil.isNotEmpty(content)) {
				FileWriter fw = new FileWriter(file);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(content);
				pw.close();
				pw.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
	
	public static void writeContent(String fileurl,String filename, String conent) {
		BufferedWriter out = null;
		try {
			File filepath=new File(fileurl);
			if(!filepath.exists()){
				filepath.mkdirs();
			}
			String file=fileurl+filename;
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file, true)));
			out.write(conent + "\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 删除文件（删除其和其下所有文件）
	 * 
	 * @param path
	 * @return
	 */
	public static boolean removeFile(String path) {
		boolean success = false;
		if (CommonUtil.isEmpty(path)) {
			return success;
		}
		File file = new File(path);
		if (file.exists()) {
			if (file.isDirectory()) {
				String[] list = file.list();
				for (String name : list) {
					removeFile(path + File.separator + name);
				}
				success = file.delete();
			} else {
				success = file.delete();
			}
		}
		return success;
	}

	/**
	 * 拷贝文件或者文件夹
	 * 
	 * @param origPath
	 *            源
	 * @param destPath
	 *            目标
	 */
	public static void copyFile(String origPath, String destPath) {
		try {
			(new File(destPath)).mkdirs();
			File a = new File(origPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (origPath.endsWith(File.separator)) {
					temp = new File(origPath + file[i]);
				} else {
					temp = new File(origPath + File.separator + file[i]);
				}
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(destPath + File.separator + (temp.getName()));
					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				} else if (temp.isDirectory()) {
					copyFile(origPath + File.separator + file[i], destPath + File.separator + file[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFile(File origFile,String destFileUrl,boolean isDeleteOrig){
		copyFile(origFile, destFileUrl);
		if(origFile!=null && isDeleteOrig){
			origFile.delete();
		}
	}
	
	/**
	 * 拷贝文件-不支持目录
	 * 
	 * @param origFile
	 *            源
	 * @param destFileUrl
	 *            目标
	 */
	public static void copyFile(File origFile, String destFileUrl) {
		try {
			File destFile=new File(destFileUrl);
			File pardir=destFile.getParentFile();
			if(!pardir.exists())
				pardir.mkdirs();
			if (origFile!=null && origFile.isFile()) {
				FileInputStream input = new FileInputStream(origFile);
				FileOutputStream output = new FileOutputStream(destFile);
				byte[] b = new byte[1024 * 5];
				int len;
				while ((len = input.read(b)) != -1) {
					output.write(b, 0, len);
				}
				output.flush();
				output.close();
				input.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 移动文件或者文件夹，源会被删除
	 * 
	 * @param origPath
	 *            源
	 * @param destPath
	 *            目标
	 */
	public static void moveFile(String origPath, String destPath) {
		copyFile(origPath, destPath);
		removeFile(origPath);
	}

	/**
	 * 压缩文件
	 * 
	 * @param origPath
	 *            源
	 * @param destPath
	 *            目标
	 * @return
	 */
	public static boolean compress(String origPath, String destPath) {
		boolean success = false;
		if (CommonUtil.isEmpty(origPath) || CommonUtil.isEmpty(destPath))
			return success;
		File srcdir = new File(origPath);
		if (!srcdir.exists())
			return success;
		Project prj = new Project();
		Zip zip = new Zip();
		zip.setProject(prj);
		zip.setDestFile(new File(destPath));
		FileSet fileSet = new FileSet();
		fileSet.setProject(prj);
		fileSet.setDir(srcdir);
		zip.addFileset(fileSet);
		zip.execute();
		success = true;
		return success;
	}

	/**
	 * 解压
	 * 
	 * @param zipFilePath
	 *            源
	 * @param destPath
	 *            目标
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean unCompress(String zipFilePath, String destPath) {
		boolean success = false;
		try {
			ZipFile zipFile = new ZipFile(zipFilePath);
			Enumeration e = zipFile.getEntries();
			ZipEntry zipEntry = null;
			createFolder(destPath);
			while (e.hasMoreElements()) {
				zipEntry = (ZipEntry) e.nextElement();
				if (zipEntry.isDirectory()) {
					String name = zipEntry.getName();
					name = name.substring(0, name.length() - 1);
					createFolder(destPath + File.separator + name);
				} else {
					File f = new File(destPath + File.separator + zipEntry.getName());
					String fileName = zipEntry.getName();
					fileName = fileName.replace('\\', '/');
					if (fileName.indexOf("/") != -1) {
						createDirectory(destPath, fileName.substring(0, fileName.lastIndexOf("/")));
					}
					f.createNewFile();
					InputStream in = zipFile.getInputStream(zipEntry);
					FileOutputStream out = new FileOutputStream(f);
					byte[] by = new byte[1024];
					int c;
					while ((c = in.read(by)) != -1) {
						out.write(by, 0, c);
					}
					out.close();
					in.close();
				}
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	private static void createDirectory(String directory, String subDirectory) {
		String dir[];
		File fl = new File(directory);
		try {
			if (subDirectory == "" && !fl.exists())
				createFolder(directory);
			else if (subDirectory != "") {
				dir = subDirectory.replace('\\', '/').split("/");
				for (int i = 0; i < dir.length; i++) {
					File subFile = new File(directory + File.separator + dir[i]);
					if (!subFile.exists())
						createFolder(directory + File.separator + dir[i]);
					directory += File.separator + dir[i];
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 批量上传文件
	 * 
	 * @param files
	 *            文件信息
	 * @param descUrl
	 *            存放路径
	 * @return
	 */
	/*public static String uploadFiles(MultipartFile[] files, String destUrl) throws IOException {
		if (files == null || files.length == 0) {
			return "upload files is null ";
		}

		boolean isSuc = false;
		String res = null;
		for (MultipartFile file : files) {
			
			 * String
			 * fullPath=destUrl+File.separator+file.getOriginalFilename();
			 * file.transferTo(new File(fullPath));
			 
			res = uploadFile(file, destUrl);
			log.info("-->" + res);
			if ("success".equals(res)) {
				isSuc = true;
			}
		}
		if (isSuc) {
			return "success";
		} else {
			return res;
		}

	}*/

	/**
	 * 上传文件
	 * 
	 * @param files
	 *            文件信息
	 * @param descUrl
	 *            存放路径
	 * @return
	 */
	/*public static String uploadFile(MultipartFile file, String destUrl) throws IOException {
		if (file == null) {
			return "upload file is null ";
		}
		// 创建目录路径
		createFolder(destUrl);
		String fullPath = destUrl + File.separator + file.getOriginalFilename();
		file.transferTo(new File(fullPath));
	 
		return "success";

	}*/
	
	/**
	 * 批量上传文件
	 * 
	 * @param files
	 *            文件信息
	 * @param descUrl
	 *            存放路径
	 * @return
	 */
	public static String uploadFiles(File[] files, String destUrl,List<String> sizeList,Integer isWaterMark) throws IOException {
		if (files == null || files.length == 0) {
			return "upload files is null ";
		}

		boolean isSuc = false;
		String res = null;
		for (File file : files) {
			res = uploadFile(file, destUrl,sizeList,isWaterMark);
			log.info("-->" + res);
			if ("success".equals(res)) {
				isSuc = true;
			}
		}
		if (isSuc) {
			return "success";
		} else {
			return res;
		}

	}

	/**
	 * 上传文件
	 * 
	 * @param files
	 *            文件信息
	 * @param descUrl
	 *            存放路径
	 * @param sizelist
	 * 			   压缩尺寸           
	 * @return
	 */
	public static String uploadFile(File file, String destUrl,List<String> sizelist,Integer isWaterMark) throws IOException {
		if (file == null) {
			throw new IOException("file is null");
		}
		// 创建目录路径
		createFolder(destUrl);
		//上传后的原图文件名  系统毫秒_ORI
		String newfilename=System.currentTimeMillis()+SystemConstants.PIC_DEFINITION_ORIGINAL
				;//+file.getName().substring(file.getName().indexOf("."))
		copyFile(file, destUrl+File.separator+newfilename);
		if(isWaterMark!=null && isWaterMark==1){
			ImageUtils.signWater(destUrl+File.separator+newfilename);
		}
		log.info("start to compress");
//			List<String> sizelist=SystemConstants.getPictureCompressSize();
		if(CommonUtil.isNotEmpty(sizelist)){
			for(String size:sizelist){
				String[] sizes=size.split("_");
				int width=0,height=0;
				if(sizes.length==2){
					width=Integer.parseInt(sizes[1]);
				}else if(sizes.length==3){
					width=Integer.parseInt(sizes[1]);
					height=Integer.parseInt(sizes[2]);
				}
				log.info("width:"+width+"height:"+height);
				if(width==0){
					continue;
				}
				//压缩后文件名   系统毫秒_480
				String comname=newfilename.replace(SystemConstants.PIC_DEFINITION_ORIGINAL, size);
				try {
					//有高度设置 则按宽高比例设置
					if(height>0){
						log.info("start zipImageFile");
						ImgCompressUtil.zipImageFile(file, destUrl+File.separator+comname, 
								width, height, 1);
						/*ImgCompressUtil.ImgCompress(file, destUrl+File.separator+comname, 
								width, height, 1);*/
					}else{//按宽度等比例压缩
						log.info("start compressMinPhoto"); 
						ImgCompressUtil.compressMinPhoto(file, destUrl+File.separator+comname,
								width, 0.9d, 1f);
					}
					if(isWaterMark!=null && isWaterMark==1){
						ImageUtils.signWater(destUrl+File.separator+comname);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
					
			}
			
		}
		if(file.exists()){
			file.delete();
		}
		
		return newfilename;

	}
	
	 
	
	/**
	 * 将文件流写入文件
	 * @param inputStream
	 * @param destUrl
	 * @param fileName
	 * @throws IOException
	 */
	public static void writeFileStream(InputStream inputStream,String destUrl,String fileName)throws IOException{
		try {
			if(inputStream==null)return ;
			// 创建目录路径
			createFolder(destUrl);
			FileOutputStream output = new FileOutputStream(destUrl+ File.separator +fileName);
				byte[] b = new byte[1024 * 5];
				int len;
				while ((len = inputStream.read(b)) != -1) {
					output.write(b, 0, len);
				}
				output.flush();
				output.close();
				inputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param input
	 * @param filepath
	 */
	public static void writeFileStream(InputStream inputStream,String filepath){
		
		try {
			
			FileOutputStream output = new FileOutputStream(filepath);
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inputStream.read(b)) != -1) {
				output.write(b, 0, len);
			}
			output.flush();
			output.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	/**
	 * 获取文件扩展名
	 * @param fileName
	 * @return
	 */
    public static String getExtensionName(String fileName) {
        if ((fileName != null) && (fileName.length() > 0)) {
            int dot = fileName.lastIndexOf('.');
            if ((dot > -1) && (dot < (fileName.length() - 1))) {
                return fileName.substring(dot + 1);
            }
        }
        return fileName;
    }
    
    /**
     * 获取文件名（不含扩展名）
     * @param file
     * @return
     */
    public static String getFileName(File file){
        if(file==null) return StringUtils.EMPTY;
        if(StringUtils.isBlank(file.getName())){
            return StringUtils.EMPTY; 
        }
        String name = file.getName();
        return  name.substring(0, name.lastIndexOf("."));
    }

}
