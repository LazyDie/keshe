package com.ipower365.saas.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * @author andie.wang
 * @version V1.0
 * @date 2014年9月1日－上午11:19:36
 */
public class LoadFileUtil {

	public static final String SERUPLOADPATH = "uploadfile";
	public static final String SERBACKUPPATH = "backupfile";
	public static final String TARGETDEVICE_LOGO_PATH = "targetdevice";
	public static final char DEL_PARAM_SPLIT_CHAR = '|';

	public static final char DOT_PARAM_SPLIT_CHAR = '.';

	public static final String UNDERLINE_SPLIT_CHAR = "_";

	public static final String ASKERISK_PARAM = "*";

	public static final String CONNECT_PARAM = "-";

	public static final String EXTENS_XML = ".xml";

	/**
	 * 保存普通文件调用
	 * 
	 * @param request
	 * @param filePath
	 * @return hecuihu
	 */
	public static String uploadMaxFile(byte[] data, String savePath, String newName) throws Exception {

		LoadFileUtil.isDirExist(savePath);

		try {
			File savedFile = new File(savePath, newName);
			// 创建文件输出流对象
			FileOutputStream os = new FileOutputStream(savedFile);
			// 写入输出流
			os.write(data);
			// 关闭输出流
			os.close();
		} catch (Exception e) {
			throw e;
		}
		return "";

	}

	/**
	 * 保存广告图片调用
	 * 
	 * @param request
	 * @param filePath
	 * @return hecuihu
	 */
	public static String uploadMaxPicture(byte[] data, String savePath, String newName) throws Exception {

		LoadFileUtil.isDirExist(savePath);

		try {
			File savedFile = new File(savePath, newName);
			// 创建文件输出流对象
			FileOutputStream os = new FileOutputStream(savedFile);
			// 写入输出流
			os.write(data);
			// 关闭输出流
			os.close();
		} catch (Exception e) {
			throw e;
		}
		return "";

	}

	public static boolean uploadMaxFile(HttpServletRequest request, String filePath) {
		String path = request.getSession().getServletContext().getRealPath("/") + filePath;

		LoadFileUtil.isDirExist(path);

		DiskFileItemFactory dff = new DiskFileItemFactory(1024 * 1024 * 10, new File(path));
		ServletFileUpload upload = new ServletFileUpload(dff);
		upload.setFileSizeMax(Long.MAX_VALUE);
		try {
			List<FileItem> fileList = upload.parseRequest(request);
			Iterator<FileItem> it = fileList.iterator();
			while (it.hasNext()) {
				FileItem fi = (FileItem) it.next();
				String fileName = fi.getName();
				if (fileName != null) {
					File fullFile = new File(fi.getName());
					File savedFile = new File(path + File.separator, fullFile.getName());
					fi.write(savedFile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static String[] uploadFilePicture(HttpServletRequest request, String newname, String filePath, String[] savePath) throws Exception {
		String path = request.getSession().getServletContext().getRealPath("/") + filePath;

		LoadFileUtil.isDirExist(path);

		DiskFileItemFactory dff = new DiskFileItemFactory(1024 * 1024 * 10, new File(path));
		ServletFileUpload upload = new ServletFileUpload(dff);
		upload.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> fileList = upload.parseRequest(request);

		if (fileList == null)
			return savePath;
		Iterator<FileItem> it = fileList.iterator();
		savePath = new String[fileList.size()];
		int x = 0;
		String pathtem = "";
		while (it.hasNext()) {
			DiskFileItem temfile = (DiskFileItem) it.next();
			InputStream finput = temfile.getInputStream();
			pathtem = newname == null ? temfile.getName() : (newname + temfile.getName().substring(temfile.getName().indexOf(DOT_PARAM_SPLIT_CHAR)));
			FileOutputStream fileOut = new FileOutputStream(new File(path + pathtem));
			int read = 0;
			byte[] buffer = new byte[8192];
			while ((read = finput.read(buffer, 0, 8192)) != -1) {
				fileOut.write(buffer, 0, read);
			}
			fileOut.close();
			finput.close();
			savePath[x] = (filePath + pathtem).replace("\\", "/");
			x++;
		}

		return savePath;
	}

	public static void downLoadFile(HttpServletRequest request, HttpServletResponse response, String filePath, String fileName) {
		File file = new File(filePath);
		if (file.exists()) {
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			response.setContentType("application/octet-stream");
			response.setCharacterEncoding("UTF-8");
			try {
				// ie 正常显示中文
				response.setHeader("Content-disposition", "attachment; filename=" + java.net.URLEncoder.encode(file.getName(), "UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
				System.out.println("编码错误！");
			}

			try {
				bis = new BufferedInputStream(new FileInputStream(file));
				bos = new BufferedOutputStream(response.getOutputStream());
				byte[] buff = new byte[4096];
				int bytesRead;
				int count = 0;
				while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
					bos.write(buff, 0, bytesRead);
					if (count % 100 == 0)
						bos.flush();
				}
				bis.close();
				bos.close();
			} catch (final IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (bis != null)
						bis.close();
					if (bos != null)
						bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("下载文件大小[" + file.length() / 1024 + "]k.");
			}
		} else {
			System.out.println("文件[" + file.getAbsolutePath() + "]不存在");
		}
	}

	// 备份文件压缩
	public static String generalZipFile(String filePath, String fileName, String fullPath) {

		String zipFile = filePath + fileName + ".zip";
		File file = null;
		ZipOutputStream out = null;
		InputStream ips = null;
		try {
			file = new File(zipFile);
			out = new ZipOutputStream(new FileOutputStream(file));
			ips = new FileInputStream(fullPath);
			ZipEntry zip = new ZipEntry(fileName + ".txt");
			zip.setSize(file.length());
			out.putNextEntry(zip);

			int len = 0;
			byte[] buffer = new byte[4096];
			while (-1 != (len = ips.read(buffer))) {
				out.write(buffer, 0, len);
			}

			ips.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ips != null)
					ips.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return zipFile;

	}

	public static String generalCommonZipFile(String filePath, String fileName, String fullPath) {

		String zipFile = filePath + fileName + "_" + DateUtil.format("yyyyMMdd", new Date()) + ".zip";
		File file = null;
		ZipOutputStream out = null;
		InputStream ips = null;
		try {
			file = new File(zipFile);
			out = new ZipOutputStream(new FileOutputStream(file));
			ips = new FileInputStream(fullPath);
			ZipEntry zip = new ZipEntry(fileName);
			zip.setSize(file.length());
			out.putNextEntry(zip);

			int len = 0;
			byte[] buffer = new byte[4096];
			while (-1 != (len = ips.read(buffer))) {
				out.write(buffer, 0, len);
			}

			ips.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ips != null)
					ips.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return zipFile;

	}

	/**
	 * 生成压缩文件
	 * 
	 * @param targetFolder
	 *            目标目录
	 * @param sourceFile
	 *            待压缩文件
	 * @return
	 */
	public static String zipFile(String targetFolder, File sourceFile) {
		String fileName = sourceFile.getName();
		fileName = fileName.substring(0, fileName.lastIndexOf("."));
		String zipFile = fileName + ".zip";
		File file = null;
		ZipOutputStream out = null;
		InputStream ips = null;
		try {
			file = new File(targetFolder, zipFile);
			out = new ZipOutputStream(new FileOutputStream(file));
			ips = new FileInputStream(sourceFile.getAbsoluteFile());
			ZipEntry zip = new ZipEntry(sourceFile.getName());
			zip.setSize(file.length());
			out.putNextEntry(zip);

			int len = 0;
			byte[] buffer = new byte[4096];
			while (-1 != (len = ips.read(buffer))) {
				out.write(buffer, 0, len);
			}

			ips.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ips != null)
					ips.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file.getAbsolutePath();

	}

	public static String generalFile(String filePath, String filename, List<String> result) throws Exception {

		isDirExist(filePath);

		String fullFilePath = filePath + File.separator + filename + ".txt";
		FileOutputStream fos = new FileOutputStream(fullFilePath);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
		Collections.sort(result);
		for (String str : result) {
			bw.write(str + '\n');
		}
		bw.flush();
		bw.close();

		return fullFilePath;
	}

	public static void isDirExist(String filePath) {
		File file = new File(filePath);
		if (!file.exists())
			file.mkdirs();
	}

	public static String getContextPath(HttpServletRequest request) {
		return request.getSession().getServletContext().getRealPath("/");
	}

	public static String[] handleUploadFile(HttpServletRequest request, String fileName, String destPath) throws Exception {
		String[] savePath = null;
		DiskFileItemFactory dff = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(dff);
		upload.setHeaderEncoding("UTF-8");// 解决http报头乱码，即中文文件名乱码
		upload.setFileSizeMax(1024 * 1024 * 20);
		List<FileItem> fileList = upload.parseRequest(request);
		if (fileList == null)
			return savePath;
		Iterator<FileItem> it = fileList.iterator();
		savePath = new String[fileList.size()];
		int x = 0;
		String pathtem = "";
		File destFolder = new File(destPath);
		if (!destFolder.exists()) {
			destFolder.mkdirs();
		}
		while (it.hasNext()) {
			DiskFileItem temfile = (DiskFileItem) it.next();
			InputStream finput = temfile.getInputStream();
			pathtem = fileName == null ? temfile.getName() : (fileName + temfile.getName().substring(temfile.getName().indexOf(DOT_PARAM_SPLIT_CHAR)));
			File destFile = new File(destFolder, pathtem);
			FileOutputStream fileOut = new FileOutputStream(destFile);

			int read = 0;
			byte[] buffer = new byte[8192];
			while ((read = finput.read(buffer, 0, 8192)) != -1) {
				fileOut.write(buffer, 0, read);
			}
			fileOut.close();
			finput.close();
			savePath[x] = destFile.getAbsolutePath().replace("\\", "/");
			x++;
		}
		return savePath;
	}
}
