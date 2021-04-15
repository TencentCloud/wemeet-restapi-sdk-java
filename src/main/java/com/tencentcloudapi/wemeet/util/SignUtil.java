package com.tencentcloudapi.wemeet.util;

import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static java.nio.charset.StandardCharsets.UTF_8;


/**
 * <p>签名工具</p>
 *
 * @author tencent
 * @date 2021/4/13
 */
public class SignUtil {
    /**
     * 获取签名
     *
     * @param toSignStr 待签名字符串
     * @param signKey   签名key
     * @return 签名结果
     */
    public static String getSign(String toSignStr, String signKey) throws WemeetSdkException {
        String signature = DatatypeConverter.printHexBinary(hmac256(signKey.getBytes(UTF_8), toSignStr)).toLowerCase();
        return Base64.encodeBase64String(signature.getBytes(UTF_8));
    }

    public static byte[] hmac256(byte[] key, String msg) throws WemeetSdkException {
        Mac mac;
        try {
            mac = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new WemeetSdkException("HmacSHA256 is not supported." + e.getMessage());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        try {
            mac.init(secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }
        return mac.doFinal(msg.getBytes(UTF_8));
    }
}
