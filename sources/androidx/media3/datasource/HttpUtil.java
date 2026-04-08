package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HttpUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f25892a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f25893b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX INFO: renamed from: a */
    public static String m9697a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbM22s = AbstractC0000a.m22s("bytes=", "-", j);
        if (j2 != -1) {
            sbM22s.append((j + j2) - 1);
        }
        return sbM22s.toString();
    }

    /* JADX INFO: renamed from: b */
    public static long m9698b(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.m9507c("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f25892a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            Log.m9511g("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            Log.m9507c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m9699c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f25893b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
