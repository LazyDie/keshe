package com.ipower365.saas.util.coder;


/**
 * @author Jonathan zhou
 * @version 创建时间：2014-6-16 下午3:05:44
 * 
 */
public class IDCoder {
	private static String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIT9jw1/L+kx292zL2fOEs5dNC4nZWBjARMoON9NXxw0\n\r"
			+ "TMg8903dGYu0lRwTmdsHIv2O/Yhs9/XCzHaCIXDYOg0CAwEAAQ====\n\r";
	private static String privateKey = "MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAhP2PDX8v6THb3bMvZ84Szl00Lidl\n\r"
			+ "YGMBEyg4301fHDRMyDz3Td0Zi7SVHBOZ2wci/Y79iGz39cLMdoIhcNg6DQIDAQABAkANbGZ/D0Jv\n\r"
			+ "wEeYBhkX2jYNvFyi9/kElJmsLFgpOe8KspqQljxtejgCuDgWCQGLHbeP8qo/TjSG02xe68VD2nvh\n\r"
			+ "AiEA5hU1M6r1HARFs9qKDDXceT1LT/ZcKEicOJzwhYWgNuUCIQCT+IsIpj+CvI8pxRMl2OX7sRXP\n\r"
			+ "oK0+KdgCUyiR/MxcCQIgQav3/YFkaNTHWGieUpHlFi3qmy5Ea7Md9ALHnDTh4AkCICyCvT/y0nP/\n\r"
			+ "SIlmEOZ3ombd1BPK35ItgB7i6PdRNiARAiEAt7WgIEhkjFvDHDyHan1fMwF1MU4UI4PRUynEtQbM\n\r" + "Who=\n\r";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// Map<String, Object> keyMap = RSACoder.initKey();
		//
		// publicKey = RSACoder.getPublicKey(keyMap);
		// privateKey = RSACoder.getPrivateKey(keyMap);
		long s = System.currentTimeMillis();
		
//		DSC01 关联  530  532
//		100001000800000001
//		DSC02 关联 520 523 525 
//		100001001800000001
//		DSC02 524 527 
//		100001001600000001
		String ids[] = {
				"103002000900000001",
				"103002000900000002",
				"101003001300000001",
				"101003001300000002",
				"104001001000000001",
				"104001001000000002",
				"104001001100000001",
				"106001000800000001",

				"103001000900000001",
				"103003001000000001",
				"103003001000000002",
				"103003001000000003",
				"109001000800000001",
				"109001000800000002",
				"105001000900000001",
				"106001000800000002",
				"103101000200000001",
				"103102000200000001",
				"104002000200000001",

			
				//一路触控
				"103001001000000001",
				"103001001000000002",
				//二路触控
				"103002001000000001",
				//三路触控
				"103003001200000001",
				"103003001200000002",
				"103003001200000003",
				"103003001200000004",
				"103003001200000005",
				"103003001200000006",
				"103003001200000007",
				//红外控制器
				"106001000900000001",
				"106001000900000002",
				"106001000900000003",
				"106001000900000004",
				"106001000900000005"
				};
		for (int i = 0; i < ids.length; i++) {
			String t = IDCoder.encode(ids[i]);
			decode(t);
			System.out.println(decode(t));

			System.out.println(t);
		}
		System.out.println(System.currentTimeMillis() - s);

	}

	public static String encode(String inputStr) {
		if (inputStr == null) {
			return null;
		}

		try {
			byte[] encodedData = RSACoder.encryptByPrivateKey(inputStr.getBytes(), privateKey);
			String t = RSACoder.encryptBASE64(encodedData);
			t = t.replaceAll("\r\n", "");
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public static String decode(String inputStr) {
		if (inputStr == null) {
			return null;
		}

		try {
			byte[] decodedData = RSACoder.decryptByPublicKey(RSACoder.decryptBASE64(inputStr), publicKey);
			return new String(decodedData);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
