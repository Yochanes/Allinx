package com.engagelab.privates.common.utils;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Guard {
    public static byte[] guard(byte[] bArr) {
        try {
            byte[] bArr2 = {32, Ascii.f42535EM, 8, Ascii.SYN, 17, 48};
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[(bArr.length + i) % 6]);
            }
            return bArr3;
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public static String string(byte[] bArr) {
        return new String(guard(bArr));
    }

    public static void test(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrGuard = guard(str.getBytes());
            String string = Arrays.toString(bArrGuard);
            Log.e("xxx", "guard=" + string);
            Log.e("xxx", "guard=Guard.string(new byte[]" + string.replace("[", "{").replace("]", "});"));
            Log.e("xxx", "reverse=".concat(new String(guard(bArrGuard))));
        } catch (Throwable th) {
            Log.e("xxx", "e:" + th);
        }
    }
}
