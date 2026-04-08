package com.engagelab.privates.common.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AESUtil {
    private static byte[] generateKeyBytes(String str, String str2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.substring(0, str.length() / 2).getBytes(str2);
        byte[] bytes2 = str.substring(str.length() / 2).getBytes(str2);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
        return bArr;
    }

    public static int generateSeed() {
        return Math.abs(new SecureRandom().nextInt()) & 16777215;
    }

    public static String get16Md5AesKey(long j) {
        long j2;
        long j3;
        switch ((int) (j % 10)) {
            case 1:
                j2 = 5 * j;
                j3 = j % 88;
                break;
            case 2:
                j2 = 23 * j;
                j3 = j % 15;
                break;
            case 3:
                j2 = 3 * j;
                j3 = j % 73;
                break;
            case 4:
                j2 = 13 * j;
                j3 = j % 96;
                break;
            case 5:
                j2 = 17 * j;
                j3 = j % 49;
                break;
            case 6:
                j2 = 7 * j;
                j3 = j % 68;
                break;
            case 7:
                j2 = 31 * j;
                j3 = j % 39;
                break;
            case 8:
                j2 = 29 * j;
                j3 = j % 41;
                break;
            case 9:
                j2 = 37 * j;
                j3 = j % 91;
                break;
            default:
                j2 = 8 * j;
                j3 = j % 74;
                break;
        }
        return StringUtil.get16MD5String("JCKP" + (j3 + j2));
    }

    public static String getIv(String str, char c2) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ c2);
        }
        return new String(bytes, 0, bytes.length);
    }

    public static String getMd5AesKey(long j) {
        long j2;
        long j3;
        switch ((int) (j % 10)) {
            case 1:
                j2 = 5 * j;
                j3 = j % 88;
                break;
            case 2:
                j2 = 23 * j;
                j3 = j % 15;
                break;
            case 3:
                j2 = 3 * j;
                j3 = j % 73;
                break;
            case 4:
                j2 = 13 * j;
                j3 = j % 96;
                break;
            case 5:
                j2 = 17 * j;
                j3 = j % 49;
                break;
            case 6:
                j2 = 7 * j;
                j3 = j % 68;
                break;
            case 7:
                j2 = 31 * j;
                j3 = j % 39;
                break;
            case 8:
                j2 = 29 * j;
                j3 = j % 41;
                break;
            case 9:
                j2 = 37 * j;
                j3 = j % 91;
                break;
            default:
                j2 = 8 * j;
                j3 = j % 74;
                break;
        }
        return StringUtil.get32MD5String("JCKP" + (j3 + j2));
    }

    private static IvParameterSpec reflectGetIv(byte[] bArr) {
        return (IvParameterSpec) ReflectUtil.invokeConstructor(IvParameterSpec.class, new Object[]{bArr}, new Class[]{byte[].class});
    }
}
