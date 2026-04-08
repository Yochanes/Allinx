package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup {

    /* JADX INFO: renamed from: a */
    public final int f25365a;

    /* JADX INFO: renamed from: b */
    public final String f25366b;

    /* JADX INFO: renamed from: c */
    public final int f25367c;

    /* JADX INFO: renamed from: d */
    public final Format[] f25368d;

    /* JADX INFO: renamed from: e */
    public int f25369e;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.m9460a(formatArr.length > 0);
        this.f25366b = str;
        this.f25368d = formatArr;
        this.f25365a = formatArr.length;
        int iM9337h = MimeTypes.m9337h(formatArr[0].f25161n);
        this.f25367c = iM9337h == -1 ? MimeTypes.m9337h(formatArr[0].f25160m) : iM9337h;
        String str2 = formatArr[0].f25151d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = formatArr[0].f25153f | 16384;
        for (int i2 = 1; i2 < formatArr.length; i2++) {
            String str3 = formatArr[i2].f25151d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m9379a("languages", i2, formatArr[0].f25151d, formatArr[i2].f25151d);
                return;
            } else {
                if (i != (formatArr[i2].f25153f | 16384)) {
                    m9379a("role flags", i2, Integer.toBinaryString(formatArr[0].f25153f), Integer.toBinaryString(formatArr[i2].f25153f));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9379a(String str, int i, String str2, String str3) {
        StringBuilder sbM25v = AbstractC0000a.m25v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM25v.append(str3);
        sbM25v.append("' (track ");
        sbM25v.append(i);
        sbM25v.append(")");
        Log.m9508d("TrackGroup", "", new IllegalStateException(sbM25v.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f25366b.equals(trackGroup.f25366b) && Arrays.equals(this.f25368d, trackGroup.f25368d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25369e == 0) {
            this.f25369e = Arrays.hashCode(this.f25368d) + AbstractC0000a.m5b(527, 31, this.f25366b);
        }
        return this.f25369e;
    }

    public final String toString() {
        return this.f25366b + ": " + Arrays.toString(this.f25368d);
    }
}
