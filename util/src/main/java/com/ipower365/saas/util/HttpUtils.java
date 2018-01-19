package com.ipower365.saas.util;

import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ipower365.saas.basic.constants.Constants;

/**
 * httpclient
 * 
 * @author kevin
 *
 */
public final class HttpUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

	private final static int connectionTimeOut = 30000;
	private final static int soTimeOut = 30000;
	private static PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager();
	private static RequestConfig reqCfg = RequestConfig.custom().setConnectTimeout(connectionTimeOut).setSocketTimeout(soTimeOut).build();

	private HttpUtils() {
	}

	/**
	 * http client
	 * 
	 * @return
	 */
	public static CloseableHttpClient getHttpClient() {
		return HttpClients.custom().setConnectionManager(connMgr).setConnectionManagerShared(true).setDefaultRequestConfig(reqCfg).build();
	}

	/**
	 * ssl证书类https client
	 * 
	 * @return
	 */
	public static CloseableHttpClient getHttpClient(HttpConfig c) {
		HttpClientContext context = HttpClientContext.create();
		BasicCookieStore cookieStore = new BasicCookieStore();
		context.setCookieStore(cookieStore);
		SSLConnectionSocketFactory sslsf = getSSLFactory(c);
		return HttpClients.custom().setSSLSocketFactory(sslsf).build();
	}

	private static SSLConnectionSocketFactory getSSLFactory(HttpConfig c) {
		SSLContext sslcontext = null;
		SSLConnectionSocketFactory sslsf = null;
		KeyStore keyStore = null;
		try {
			keyStore = KeyStore.getInstance(c.getKeyType());
		} catch (KeyStoreException e1) {
			e1.printStackTrace();
		}
		FileInputStream instream = null;
		try {
			instream = new FileInputStream(new File(c.getStorePath()));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			keyStore.load(instream, c.getPwd().toCharArray());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != instream)
					instream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, c.getPwd().toCharArray()).build();
			HostnameVerifier hostnameVerifier = new DefaultHostnameVerifier();
			sslsf = new SSLConnectionSocketFactory(sslcontext, c.getSupportedProtocols(), c.getSupportedCipherSuites(), hostnameVerifier);
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			logger.error("get sslcontext error", e);
		} catch (UnrecoverableKeyException e) {
			e.printStackTrace();
		}
		return sslsf;
	}

	public static CloseableHttpClient getSSLInsecureClient() {
		try {
			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, new TrustStrategy() {
				// 信任所有
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			}).build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
			return HttpClients.custom().setSSLSocketFactory(sslsf).build();
		} catch (KeyManagementException e) {
			logger.error("get sslcontext error", e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
		return HttpClients.createDefault();
	}

	/**
	 * post请求
	 * 
	 * @param url
	 *            请求地址
	 * @param obj
	 *            封装的bean或者拼接的字符串（id=x&name=x）
	 * @return
	 * @throws IOException
	 */
	public static Response post(String url, Object obj) throws IOException {
		return post(url, obj, null);
	}

	public static class HttpConfig {
		private List<NameValuePair> headers;
		private String encoding;
		private String contentType;
		private boolean https;
		private String storePath;
		private String pwd;
		private String keyType;
		private String[] supportedProtocols;
		private String[] supportedCipherSuites;

		public String getKeyType() {
			return keyType;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public boolean isHttps() {
			return https;
		}

		public void setHttps(boolean https) {
			this.https = https;
		}

		public String getStorePath() {
			return storePath;
		}

		public void setStorePath(String storePath) {
			this.storePath = storePath;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getEncoding() {
			return encoding;
		}

		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}

		public String getContentType() {
			return contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public List<NameValuePair> getHeaders() {
			return headers;
		}

		public void setHeaders(List<NameValuePair> headers) {
			this.headers = headers;
		}

		public String[] getSupportedProtocols() {
			return supportedProtocols;
		}

		public void setSupportedProtocols(String[] supportedProtocols) {
			this.supportedProtocols = supportedProtocols;
		}

		public String[] getSupportedCipherSuites() {
			return supportedCipherSuites;
		}

		public void setSupportedCipherSuites(String[] supportedCipherSuites) {
			this.supportedCipherSuites = supportedCipherSuites;
		}

	}

	/**
	 * post请求
	 * 
	 * @param List
	 *            <NameValuePair> headers HTTP头
	 * @param url
	 *            请求地址
	 * @param obj
	 *            封装的bean或者拼接的字符串（id=x&name=x）
	 * @return
	 * @throws IOException
	 */
	public static Response post(String url, Object obj, HttpConfig config) throws IOException {
		if (CommonUtil.isEmpty(url))
			return null;
		CloseableHttpClient httpclient = getHttpClient();
		if (null != config && config.isHttps()) {
			httpclient = getHttpClient(config);
		}
		HttpPost httppost = new HttpPost(url);

		Response resp = new Response();
		CloseableHttpResponse response = null;
		String str = "";
		try {
			String encoding = Constants.DEFAULT_ENCODING;
			String contentType = Constants.DEFAULT_CONTENTTYPE;
			if (null != config) {
				if (null != config.getEncoding())
					encoding = config.getEncoding();
				if (null != config.getContentType())
					contentType = config.getContentType();
				if (CommonUtil.isNotEmpty(config.getHeaders())) {
					for (NameValuePair p : config.getHeaders()) {
						httppost.addHeader(p.getName(), p.getValue());
					}
				}
			}
			if (obj instanceof String) {
				str = (String) obj;
			} else {
				List<NameValuePair> params = parseParamValue(obj);
				str = URLEncodedUtils.format(params, encoding);
				str = str.replaceAll("null", "");
			}
			StringEntity entity = new StringEntity(str, encoding);
			entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, contentType));
			httppost.setEntity(entity);
			response = httpclient.execute(httppost);
			copyProperties(resp, response, encoding);
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (CommonUtil.isNotEmpty(response))
					response.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (CommonUtil.isNotEmpty(httpclient))
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resp;
	}

	/**
	 * get请求
	 * 
	 * @param url
	 *            请求地址
	 * @return
	 * @throws IOException
	 */
	public static Response get(String url) throws IOException {
		return get(url, null);
	}

	/**
	 * get请求
	 * 
	 * @param List
	 *            <NameValuePair> headers http头
	 * @param url
	 *            请求地址
	 * @return
	 * @throws IOException
	 */
	public static Response get(String url, HttpConfig config) throws IOException {
		if (CommonUtil.isEmpty(url)) {
			return null;
		}
		CloseableHttpClient httpclient = getHttpClient();
		if (null != config && config.isHttps()) {
			httpclient = getHttpClient(config);
		}
		Response resp = new Response();
		CloseableHttpResponse response = null;
		try {
			HttpGet httpget = new HttpGet(url);
			String encoding = Constants.DEFAULT_ENCODING;
			if (null != config) {
				if (CommonUtil.isNotEmpty(config.getHeaders())) {
					for (NameValuePair p : config.getHeaders()) {
						httpget.addHeader(p.getName(), p.getValue());
					}
				}
				if (null != config.getEncoding()) {
					encoding = config.getEncoding();
				}
			}
			response = httpclient.execute(httpget);
			copyProperties(resp, response, encoding);
		} catch (ClientProtocolException e) {
			throw e;
		} catch (ParseException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (CommonUtil.isNotEmpty(response))
					response.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (CommonUtil.isNotEmpty(httpclient))
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resp;
	}

	/**
	 * 上传请求
	 * 
	 * @param url
	 *            请求地址
	 * @param file
	 *            文件
	 * @return
	 * @throws IOException
	 */
	public static Response upload(String url, File file, String encoding) throws IOException {
		if (CommonUtil.isEmpty(url) || CommonUtil.isEmpty(file))
			return null;
		CloseableHttpClient httpclient = getHttpClient();
		Response resp = new Response();
		CloseableHttpResponse response = null;
		try {
			HttpPost httppost = new HttpPost(url);
			FileBody bin = new FileBody(file);
			StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);
			HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("bin", bin).addPart("comment", comment).build();
			httppost.setEntity(reqEntity);
			response = httpclient.execute(httppost);
			copyProperties(resp, response, encoding);
		} catch (ClientProtocolException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (CommonUtil.isNotEmpty(response))
					response.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (CommonUtil.isNotEmpty(httpclient))
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resp;
	}

	@SuppressWarnings("rawtypes")
	public static Response post(String url, File[] files, Map<String, String> params, String formName) throws IOException {
		if (CommonUtil.isEmpty(url))
			return null;
		CloseableHttpClient httpclient = getHttpClient();
		Response resp = new Response();
		CloseableHttpResponse response = null;
		try {
			HttpPost httppost = new HttpPost(url);
			MultipartEntityBuilder meb = MultipartEntityBuilder.create();
			meb.setCharset(Charset.forName(Constants.DEFAULT_ENCODING));
			ContentType contentType = ContentType.create("text/plain", Charset.forName("UTF-8"));// 解决中文乱码
			if(CommonUtil.isNotEmpty(files)){
			    for (File f : files) {
	                // FileBody bin = new FileBody(f);
	                meb.addBinaryBody(formName, f);
	            } 
			}			
			if (CommonUtil.isNotEmpty(params)) {
				Iterator iterator = params.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry e = (Entry) iterator.next();
					String value = null;
					String key = null;
					if (CommonUtil.isEmpty(e.getValue()))
						continue;
					value = String.valueOf(e.getValue());
					key = String.valueOf(e.getKey());
					StringBody sb = new StringBody(value, contentType);
					meb.addPart(key, sb);
				}
			}
			HttpEntity reqEntity = meb.build();
			httppost.setEntity(reqEntity);
			response = httpclient.execute(httppost);
			copyProperties(resp, response, Constants.DEFAULT_ENCODING);
		} catch (ClientProtocolException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (CommonUtil.isNotEmpty(response))
					response.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (CommonUtil.isNotEmpty(httpclient))
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resp;
	}

	public static void copyProperties(Response resp, CloseableHttpResponse response) {
		copyProperties(resp, response, null);
	}

	public static void copyProperties(Response resp, CloseableHttpResponse response, String encoding) {
		resp.setAllHeaders(response.getAllHeaders());
		resp.setEntity(response.getEntity());
		resp.setLocale(response.getLocale());
		resp.setProtocolVersion(response.getProtocolVersion());
		resp.setStatusLine(response.getStatusLine());
		resp.setStatusCode(response.getStatusLine().getStatusCode());
		try {
			resp.setContent(EntityUtils.toString(response.getEntity(), null == encoding ? Constants.DEFAULT_ENCODING : encoding));
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public static List<NameValuePair> parseParamValue(Object obj) {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if (CommonUtil.isEmpty(obj))
			return params;
		if (obj instanceof Map) {
			Map m = (Map) obj;
			Iterator iterator = m.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry e = (Entry) iterator.next();
				String value = null;
				String key = null;
				if (CommonUtil.isEmpty(e.getValue()))
					continue;
				value = String.valueOf(e.getValue());
				key = String.valueOf(e.getKey());
				NameValuePair nvp = new BasicNameValuePair(key, value);
				params.add(nvp);
			}
		} else {
			PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(obj.getClass());
			for (PropertyDescriptor pd : propertyDescriptors) {
				if (pd.getName().equals(BeanUtils.classPropertieName)) {
					continue;
				}
				Object o = getValue(pd, obj);
				String value = null;
				if (CommonUtil.isEmpty(o))
					continue;
				if (pd.getPropertyType().equals(Date.class)) {
					value = DateUtil.format(Constants.DEFULT_DATE_FORMATTER, (Date) o);
				} else
					value = String.valueOf(o);
				NameValuePair nvp = new BasicNameValuePair(pd.getName(), value);
				params.add(nvp);
			}
		}
		return params;
	}

	private static Object getValue(PropertyDescriptor pd, Object obj) {
		if (CommonUtil.isEmpty(pd) || CommonUtil.isEmpty(obj))
			return null;
		Method readMethod = pd.getReadMethod();
		if (CommonUtil.isEmpty(readMethod))
			return null;
		return BeanUtils.invokeMethod(obj, readMethod, BeanUtils.EMPTY_OBJECT_ARRAY);
	}

	/**
	 * httpclient返回封装bean，常用方法：getStatusCode（）获取http
	 * response状态码；getContent（）获取返回值。另外还提供httpresponse原生对象获取方法。
	 * 
	 * @author kevin
	 *
	 */
	public static class Response {
		private HttpEntity entity;
		private Header[] allHeaders;
		private Locale locale;
		private ProtocolVersion protocolVersion;
		private StatusLine statusLine;
		private String content;
		private int statusCode;

		public HttpEntity getEntity() {
			return entity;
		}

		public void setEntity(HttpEntity entity) {
			this.entity = entity;
		}

		public Header[] getAllHeaders() {
			return allHeaders;
		}

		public void setAllHeaders(Header[] headers) {
			this.allHeaders = headers;
		}

		public Locale getLocale() {
			return locale;
		}

		public void setLocale(Locale locale) {
			this.locale = locale;
		}

		public ProtocolVersion getProtocolVersion() {
			return protocolVersion;
		}

		public void setProtocolVersion(ProtocolVersion protocolVersion) {
			this.protocolVersion = protocolVersion;
		}

		public StatusLine getStatusLine() {
			return statusLine;
		}

		public void setStatusLine(StatusLine statusLine) {
			this.statusLine = statusLine;
		}

		public String getContent() {
			return this.content;
		}

		public int getStatusCode() {
			return this.statusCode;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}

	}

	public static void main(String... strings) {
		String url = "http://dev.unovo.com.cn/saas20/api/2/AptGuest/free/pay/wechat/oauth";
		try {
			String encode = URLEncoder.encode(url, Constants.DEFAULT_ENCODING);
			System.out.println(encode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
