package com.google.android.gms.internal.common;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzy {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM15l;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM15l = "null";
            } else {
                try {
                    strM15l = obj.toString();
                } catch (Exception e) {
                    String strM14k = AbstractC0000a.m14k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM14k), (Throwable) e);
                    strM15l = AbstractC0000a.m15l("<", strM14k, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM15l;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
