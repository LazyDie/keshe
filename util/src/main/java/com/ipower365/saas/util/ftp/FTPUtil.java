package com.ipower365.saas.util.ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import com.ipower365.saas.util.CommonUtil;
import com.ipower365.saas.util.FileUtils;

public final class FTPUtil {
	private FTPUtil() {
	}

	public static class FTPConfig {
		private String url;
		private Integer port;
		private String username;
		private String password;
		/**
		 * ftp文件目录
		 */
		private String pathname;
		private Integer timeout;
		private String charsetName;

		public Integer getTimeout() {
			return timeout;
		}

		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}

		public String getPathname() {
			return pathname;
		}

		public void setPathname(String pathname) {
			this.pathname = pathname;
		}

		public FTPConfig() {
			this(null, null, null, null);
		}

		public FTPConfig(String url, Integer port) {
			this(url, port, null, null);
		}

		public FTPConfig(String url, Integer port, String username, String password) {
			this.url = url;
			this.port = port;
			this.username = username;
			this.password = password;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Integer getPort() {
			return port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCharsetName() {
			return charsetName;
		}

		public void setCharsetName(String charsetName) {
			this.charsetName = charsetName;
		}

	}

	/**
	 * 获取ftp文件到本地
	 * 
	 * @param config
	 *            ftp连接配置
	 * @param fileName
	 *            要获取的文件
	 * @param localPath
	 *            存储到本地的路径
	 * @return 从ftp下载到本地的文件
	 */
	public static File get(FTPConfig config, String fileName, String localPath) {
		if (null == config || CommonUtil.isEmpty(config.getUrl()))
			return null;
		FTPClient ftp = new FTPClient();
		FTPClientConfig ftpClientConfig = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
		ftpClientConfig.setServerLanguageCode("zh");
		ftp.configure(ftpClientConfig);
		File localFile = null;
		OutputStream os = null;
		int default_time_out = 30000;
		String charsetName = CommonUtil.isEmpty(config.getCharsetName()) ? "UTF-8" : config.getCharsetName();
		Charset charset = Charset.forName(charsetName);
		ftp.setCharset(charset);
		ftp.setControlEncoding(charsetName);
		ftp.enterLocalPassiveMode();
		ftp.setDefaultTimeout(null == config.timeout ? default_time_out : config.timeout);
		try {
			int reply;
			String url = config.getUrl();
			Integer port = config.getPort();
			String username = config.getUsername();
			String password = config.getPassword();
			String pathname = config.getPathname();
			ftp.connect(url, port);
			ftp.login(username, password);
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return localFile;
			}
			if (CommonUtil.isNotEmpty(pathname))
				ftp.changeWorkingDirectory(pathname);
			FTPFile[] fs = ftp.listFiles();
			File f = new File(localPath);
			if (!f.exists()) {
				FileUtils.createFolder(localPath);
			}
			if (null != fs)
				for (FTPFile ff : fs) {
					if (ff.getName().equals(fileName)) {
						localFile = new File(localPath + File.separator + ff.getName());
						os = new FileOutputStream(localFile);
						ftp.retrieveFile(ff.getName(), os);
					}
				}
			ftp.logout();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != os)
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return localFile;
	}
}
