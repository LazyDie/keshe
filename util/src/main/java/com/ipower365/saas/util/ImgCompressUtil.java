package com.ipower365.saas.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
//import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ipower365.saas.basic.constants.SystemConstants;
//import com.sun.image.codec.jpeg.*;
import com.sun.imageio.plugins.jpeg.JPEGImageWriter;

public class ImgCompressUtil {

	/**
     * log4j
     */
    private final static Logger logger = LoggerFactory.getLogger(ImgCompressUtil.class);
 
    
 
    /**
     * 外部调用方法
     * @param url
     * @param w
     * @param h
     */
    public static String ImgCompress(String url, String filePath, int w, int h) {
            // 压缩质量 百分比
            float JPEGcompression = 1f;
 
            // 本地图片存储路径
//            url = "/var" + url;
            String name = url.substring(url.lastIndexOf("/") + 1);
                         
            // 截取url中最后一个“/”之后的字符串为name
            logger.info("url：===========" + url);
            logger.info("name：=========" + name);
             
            //压缩主方法
             return ImgCompress(new File(url),filePath, w, h, JPEGcompression);
         
    }
     
    /**
     * 图片压缩主方法
     * 
     * @param newDir
     *            图片所在的文件夹路径
     * @param file
     *            图片路径
     * @param name
     *            图片名
     * @param w
     *            目标宽
     * @param h
     *            目标高
     * @param JPEGcompression
     *            压缩质量/百分比
     */
    public static String ImgCompress( File oriFile,String destfilePath,  
            int w, int h, float JPEGcompression) {
       
        if (!(oriFile.exists() && oriFile.canRead())) {
        	destfilePath = "not exist";
        }else{
            try {
                BufferedImage bufferedImage =  ImageIO.read(oriFile);
                int new_w = w;
                int new_h = h; 
                BufferedImage image_to_save = new BufferedImage(new_w, new_h,
                        bufferedImage.getType());
                image_to_save.getGraphics().drawImage(
                        bufferedImage.getScaledInstance(new_w, new_h, Image.SCALE_SMOOTH), 0,
                        0, null);
               File outf=new File(destfilePath);
               File parf=outf.getParentFile();
               if(!parf.exists()){
            	   parf.mkdirs();
               }
                FileOutputStream fos = new FileOutputStream(outf); // 输出到文件流
 
               
                saveAsJPEG(image_to_save, JPEGcompression, fos);
                //关闭输出流
                fos.close();
                //返回压缩后的图片地址
            } catch (IOException ex) {
            	ex.printStackTrace();
                logger.info(ex.getMessage());
                destfilePath = ex.getMessage();
            }catch (Exception e) {
				// TODO: handle exception
            	e.printStackTrace();
			}
        }
         
        return destfilePath;
         
    }
    
    
    /**
     * 等比例压缩算法：
     * 算法思想：根据压缩基数和压缩比来压缩原图，生产一张图片效果最接近原图的缩略图
     * @param srcURL 原图地址
     * @param deskURL 缩略图地址
     * @param comBase 压缩基数
     * @param scale 压缩限制(宽/高)比例  一般用1：
     * 当scale>=1,缩略图height=comBase,width按原图宽高比例;若scale<1,缩略图width=comBase,height按原图宽高比例
     * @throws Exception
     */
    public static void compressMinPhoto(File srcFile, String deskURL, int comBase,
            double scale,float JPEGcompression) throws Exception {
//        File srcFile = new java.io.File(srcURL);
    	
        Image src = ImageIO.read(srcFile);
        int srcHeight = src.getHeight(null);
        int srcWidth = src.getWidth(null);
        int deskHeight = 0;// 缩略图高
        int deskWidth = 0;// 缩略图宽
        double srcScale = (double) srcHeight / srcWidth;
        /**缩略图宽高算法*/
        if ( srcHeight > comBase || srcWidth > comBase) {
            if (srcScale >= scale || 1 / srcScale > scale) {
                if (srcScale >= scale) {
                    deskHeight = comBase;
                    deskWidth = srcWidth * deskHeight / srcHeight;
                } else {
                    deskWidth = comBase;
                    deskHeight = srcHeight * deskWidth / srcWidth;
                }
            } else {
                if (srcHeight > comBase) {
                    deskHeight = comBase;
                    deskWidth = srcWidth * deskHeight / srcHeight;
                } else {
                    deskWidth = comBase;
                    deskHeight = srcHeight * deskWidth / srcWidth;
                }
            }
        } else {
            deskHeight = srcHeight;
            deskWidth = srcWidth;
        }
        BufferedImage tag = new BufferedImage(deskWidth, deskHeight, BufferedImage.TYPE_3BYTE_BGR);
        tag.getGraphics().drawImage(src, 0, 0, deskWidth, deskHeight, null); //绘制缩小后的图
        File outf=new File(deskURL);
        File parf=outf.getParentFile();
        if(!parf.exists()){
     	   parf.mkdirs();
        }
        FileOutputStream deskImage = new FileOutputStream(outf); //输出到文件流
//        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(deskImage);
//        encoder.encode(tag); //近JPEG编码
        saveAsJPEG(tag, JPEGcompression, deskImage);
        deskImage.close();
    }
    
    
    /**
     * 直接指定压缩后的宽高：
     * (先保存原文件，再压缩、上传)
     * @param oldFile 要进行压缩的文件
     * @param deskURL 压缩后的文件 全路径+文件名
     * @param width 压缩后的宽度
     * @param height 压缩后的高度
     * @param quality 压缩质量 
     * @return 返回压缩后的文件的全路径
     */
    @SuppressWarnings("restriction")
	public static String zipImageFile(File oldFile,String deskURL, int width, int height,
            float quality) {
        if (oldFile == null) {
        	logger.info("oldFile is null");
            return null;
        }
        String newImage = null;
        try {
            /**对服务器上的临时文件进行处理 */
            Image srcFile = ImageIO.read(oldFile);
            
            /** 宽,高设定 */
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(srcFile, 0, 0, width, height, null);
//            String filePrex = oldFile.substring(0, oldFile.indexOf('.'));
            /** 压缩后的文件名 */
//            newImage = filePrex + smallIcon + oldFile.substring(filePrex.length());
            newImage=deskURL;
            /** 压缩之后临时存放位置 */
            FileOutputStream out = new FileOutputStream(newImage);
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//            JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
//            /** 压缩质量 */
//            jep.setQuality(quality, true);
//            encoder.encode(tag, jep);
            saveAsJPEG(tag, quality, out);
            out.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        return newImage;
    }
 
    /**
     * 以JPEG编码保存图片
     * 
     * @param image_to_save
     *            要处理的图像图片
     * @param JPEGcompression
     *            压缩比
     * @param fos
     *            文件输出流
     * @throws IOException
     */
    @SuppressWarnings("restriction")
	public static void saveAsJPEG(BufferedImage image_to_save,
            float JPEGcompression, FileOutputStream fos) throws IOException {

        // Image writer
        JPEGImageWriter imageWriter = (JPEGImageWriter) ImageIO
                .getImageWritersBySuffix("jpg").next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(fos);
        imageWriter.setOutput(ios);
        // and metadata
        IIOMetadata imageMetaData = imageWriter.getDefaultImageMetadata(
                new ImageTypeSpecifier(image_to_save), null);
 
        if (JPEGcompression >= 0 && JPEGcompression <= 1f) {
 
            // old compression
            // jpegEncodeParam.setQuality(JPEGcompression,false);
 
            // new Compression
            JPEGImageWriteParam jpegParams = (JPEGImageWriteParam) imageWriter.getDefaultWriteParam();
            jpegParams.setCompressionMode(JPEGImageWriteParam.MODE_EXPLICIT);
            jpegParams.setCompressionQuality(JPEGcompression);
 
        }
 
        // old write and clean
        // jpegEncoder.encode(image_to_save, jpegEncodeParam);
 
        // new Write and clean up
        imageWriter.write(imageMetaData,
                new IIOImage(image_to_save, null, null), null);
        ios.close();
        imageWriter.dispose();
 
    }
    
    /**
     * 图片压缩测试
     * 
     * @param args
     */
    public static void main(String args[]) {
        // 图片url，压缩后的宽和高
        String url = "E:/QQ图片20151019233009.jpg";
        int w = 1800;
        int h = 900;
        //压缩后的图片路径
       String newName = System.currentTimeMillis()+"";
       String newDir = "E:/imgcompress/";
     String outfile = newDir + newName + "_"
                    + w + "_" + h + url.substring(url.indexOf("."));
     File f=new File(outfile);
     File par=f.getParentFile();
     if(!par.exists())par.mkdirs();
		System.out.println(par.exists());
	 
        //压缩
//        ImgCompress(url,outfile,w,h);
//		ImgCompress(new File(url),outfile, w, h, 0.9f);
		try {
//			compressMinPhoto(new File(url), outfile, 480, 0.9d, 1f);
			String ss="_480_320";
			List<String> list=SystemConstants.getPictureCompressSize();
			
			for(String size:list){
				System.out.println(JsonUtils.toJson(size.split("_"))+"==>"+size.split("_")[1]);
			}
//			System.out.println(JsonUtils.toJson(ss.split("_"))+"--"+ss.split("_")[1]);
//			zipImageFile(url, 480, 320, 0.3f, "_480_320");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
}