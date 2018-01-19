package com.ipower365.saas.util.coder;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.ipower365.saas.basic.constants.Constants;


public class HmacSHA1Coder {
    private static final String ALGORITHM = "HmacSHA1";

    public static byte[] signature(String data, String key, String charsetName) throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException,
            UnsupportedEncodingException {

        SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(charsetName), ALGORITHM);
        Mac mac = Mac.getInstance(ALGORITHM);
        mac.init(signingKey);

        return mac.doFinal(data.getBytes(charsetName));
    }

    public static String signatureString(String data, String key, String charsetName) throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException,
            UnsupportedEncodingException {

        return new String(Base64.encodeBase64(signature(data, key, charsetName)), charsetName);
    }

    public static String signatureString(String data, String key) throws InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, UnsupportedEncodingException {

        return signatureString(data, key, Constants.DEFAULT_ENCODING);
    }

}
