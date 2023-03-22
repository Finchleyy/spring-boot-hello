package com.ypw.springboothello.encryption;

import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.springframework.util.StopWatch;

/**
 * @author hongmeng
 * @date 2023/3/22
 */
public class RSATest {
    public static void main(String[] args) {
        System.out.println("start" + System.currentTimeMillis());
        //初始化
        StopWatch stopWatch = new StopWatch();
        //开始时间统计
        stopWatch.start();
        RSA rsa = new RSA();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        System.out.println(publicKeyBase64);
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        System.out.println(privateKeyBase64);
        for (int i = 0; i < 1000; i++) {
            doProcess(rsa);
        }
        //结束时间统计
        stopWatch.stop();
        //运行时间s
        System.out.println(stopWatch.getTotalTimeSeconds());
        //运行时间ms
        System.out.println(stopWatch.getTotalTimeMillis());
        System.out.println("end" + System.currentTimeMillis());
    }

    private static void doProcess(RSA rsa) {
        String a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSP7RM+k4gHo";
        byte[] encrypt = rsa.encrypt(a, KeyType.PublicKey);
        char[] chars = HexUtil.encodeHex(encrypt);
        //System.out.println(new String(chars));

        byte[] aByte = HexUtil.decodeHex(new String(chars));
        byte[] decrypt = rsa.decrypt(aByte, KeyType.PrivateKey);
        //System.out.println(new String(decrypt));


    }
}
