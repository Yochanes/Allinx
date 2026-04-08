package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: com.geetest.captcha.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3589i {
    /* JADX INFO: renamed from: a */
    public static void m14345a(Context context, String str, String str2) {
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putString(str, str2).apply();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14349b(String str) {
        return TextUtils.isEmpty(str) || "$unknown".equals(str);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m14347a(String str, String str2) throws IllegalAccessException, InstantiationException, ClassNotFoundException, UnsupportedEncodingException, InvocationTargetException {
        String str3 = new String(m14346a());
        byte[] bytes = str.getBytes("utf-8");
        byte[] bytes2 = str2.getBytes("utf-8");
        Object objNewInstance = Class.forName(m14344a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(str3.getBytes("utf-8"));
        Object objNewInstance2 = Class.forName(m14344a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes2, "AES");
        Class<?> cls = Class.forName(m14344a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 1, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bytes);
    }

    /* JADX INFO: renamed from: a */
    public static String m14343a(Context context, String str) {
        String string;
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArrDigest.length; i++) {
                char[] cArr = C3597m.f42255a;
                sb.append(cArr[(bArrDigest[i] >> 4) & 15]);
                sb.append(cArr[bArrDigest[i] & Ascii.f42543SI]);
            }
            string = sb.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (m14349b(string)) {
            return null;
        }
        m14345a(context, "gt_fp", string);
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m14348a(byte[] bArr, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, UnsupportedEncodingException, InvocationTargetException {
        byte[] bytes = str.getBytes("utf-8");
        Object objNewInstance = Class.forName(m14344a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(m14346a());
        Object objNewInstance2 = Class.forName(m14344a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes, "AES");
        Class<?> cls = Class.forName(m14344a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 2, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m14346a() {
        char[] charArray = new String(Base64.decode("MzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzA=", 0)).toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (iDigit > 127) {
                iDigit -= 256;
            }
            bArr[i] = (byte) iDigit;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static String m14344a(String str) {
        return new String(Base64.decode(str, 0));
    }
}
