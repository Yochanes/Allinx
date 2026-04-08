package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class CapitalizeDecapitalizeKt {
    /* JADX INFO: renamed from: a */
    public static final String m20331a(String str) {
        char cCharAt;
        Intrinsics.m18599g(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m20332b(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX INFO: renamed from: c */
    public static final String m20333c(String str) {
        Intrinsics.m18599g(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "builder.toString()");
        return string;
    }
}
