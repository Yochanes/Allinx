package okhttp3;

import com.google.common.net.HttpHeaders;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/CacheControl;", "", "Builder", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class CacheControl {

    /* JADX INFO: renamed from: n */
    public static final CacheControl f57013n;

    /* JADX INFO: renamed from: o */
    public static final CacheControl f57014o;

    /* JADX INFO: renamed from: a */
    public final boolean f57015a;

    /* JADX INFO: renamed from: b */
    public final boolean f57016b;

    /* JADX INFO: renamed from: c */
    public final int f57017c;

    /* JADX INFO: renamed from: d */
    public final int f57018d;

    /* JADX INFO: renamed from: e */
    public final boolean f57019e;

    /* JADX INFO: renamed from: f */
    public final boolean f57020f;

    /* JADX INFO: renamed from: g */
    public final boolean f57021g;

    /* JADX INFO: renamed from: h */
    public final int f57022h;

    /* JADX INFO: renamed from: i */
    public final int f57023i;

    /* JADX INFO: renamed from: j */
    public final boolean f57024j;

    /* JADX INFO: renamed from: k */
    public final boolean f57025k;

    /* JADX INFO: renamed from: l */
    public final boolean f57026l;

    /* JADX INFO: renamed from: m */
    public String f57027m;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/CacheControl$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public boolean f57028a;

        /* JADX INFO: renamed from: b */
        public boolean f57029b;

        /* JADX INFO: renamed from: c */
        public int f57030c = -1;

        /* JADX INFO: renamed from: d */
        public boolean f57031d;

        /* JADX INFO: renamed from: a */
        public final CacheControl m21185a() {
            return new CacheControl(this.f57028a, this.f57029b, -1, -1, false, false, false, this.f57030c, -1, this.f57031d, false, false, null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/CacheControl$Companion;", "", "Lokhttp3/CacheControl;", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static CacheControl m21186a(Headers headers) {
            int i;
            int i2;
            String strSubstring;
            int length;
            Headers headers2 = headers;
            Intrinsics.m18599g(headers2, "headers");
            int size = headers2.size();
            boolean z2 = true;
            boolean z3 = true;
            int i3 = 0;
            String str = null;
            boolean z4 = false;
            boolean z5 = false;
            int iM21343z = -1;
            int iM21343z2 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int iM21343z3 = -1;
            int iM21343z4 = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (i3 < size) {
                String strM21241e = headers2.m21241e(i3);
                String strM21243g = headers2.m21243g(i3);
                if (StringsKt.m20442r(strM21241e, HttpHeaders.CACHE_CONTROL, z2)) {
                    if (str == null) {
                        str = strM21243g;
                    }
                    i = 0;
                    while (i < strM21243g.length()) {
                        int length2 = strM21243g.length();
                        boolean z12 = z2;
                        int length3 = i;
                        while (true) {
                            if (length3 >= length2) {
                                i2 = size;
                                length3 = strM21243g.length();
                                break;
                            }
                            i2 = size;
                            if (StringsKt.m20435k("=,;", strM21243g.charAt(length3))) {
                                break;
                            }
                            length3++;
                            size = i2;
                        }
                        String strSubstring2 = strM21243g.substring(i, length3);
                        Intrinsics.m18598f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string = StringsKt.m20430b0(strSubstring2).toString();
                        if (length3 == strM21243g.length() || strM21243g.charAt(length3) == ',' || strM21243g.charAt(length3) == ';') {
                            i = length3 + 1;
                            strSubstring = null;
                        } else {
                            int length4 = length3 + 1;
                            byte[] bArr = Util.f57274a;
                            int length5 = strM21243g.length();
                            while (true) {
                                if (length4 >= length5) {
                                    length4 = strM21243g.length();
                                    break;
                                }
                                char cCharAt = strM21243g.charAt(length4);
                                int i4 = length5;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length4++;
                                length5 = i4;
                            }
                            if (length4 >= strM21243g.length() || strM21243g.charAt(length4) != '\"') {
                                int length6 = strM21243g.length();
                                int i5 = length4;
                                while (true) {
                                    if (i5 >= length6) {
                                        length = strM21243g.length();
                                        break;
                                    }
                                    int i6 = length6;
                                    int i7 = i5;
                                    if (StringsKt.m20435k(",;", strM21243g.charAt(i5))) {
                                        length = i7;
                                        break;
                                    }
                                    i5 = i7 + 1;
                                    length6 = i6;
                                }
                                String strSubstring3 = strM21243g.substring(length4, length);
                                Intrinsics.m18598f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                String string2 = StringsKt.m20430b0(strSubstring3).toString();
                                i = length;
                                strSubstring = string2;
                            } else {
                                int i8 = length4 + 1;
                                int iM20445u = StringsKt.m20445u(strM21243g, '\"', i8, 4);
                                strSubstring = strM21243g.substring(i8, iM20445u);
                                Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                i = iM20445u + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z2 = z12;
                            z4 = z2;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z2 = z12;
                            z5 = z2;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                iM21343z = Util.m21343z(-1, strSubstring);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iM21343z2 = Util.m21343z(-1, strSubstring);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z6 = z2;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z7 = z2;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z8 = z2;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iM21343z3 = Util.m21343z(Integer.MAX_VALUE, strSubstring);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iM21343z4 = Util.m21343z(-1, strSubstring);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z9 = z2;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z10 = z2;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z2 = z12;
                                z11 = z2;
                            }
                            z2 = z12;
                        }
                        size = i2;
                    }
                    i3++;
                    headers2 = headers;
                    z2 = z2;
                    size = size;
                } else if (!StringsKt.m20442r(strM21241e, HttpHeaders.PRAGMA, z2)) {
                    i3++;
                    headers2 = headers;
                    z2 = z2;
                    size = size;
                }
                z3 = false;
                i = 0;
                while (i < strM21243g.length()) {
                }
                i3++;
                headers2 = headers;
                z2 = z2;
                size = size;
            }
            return new CacheControl(z4, z5, iM21343z, iM21343z2, z6, z7, z8, iM21343z3, iM21343z4, z9, z10, z11, !z3 ? null : str);
        }
    }

    static {
        Builder builder = new Builder();
        builder.f57028a = true;
        f57013n = builder.m21185a();
        Builder builder2 = new Builder();
        builder2.f57031d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.m18599g(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        builder2.f57030c = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        f57014o = builder2.m21185a();
    }

    public CacheControl(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f57015a = z2;
        this.f57016b = z3;
        this.f57017c = i;
        this.f57018d = i2;
        this.f57019e = z4;
        this.f57020f = z5;
        this.f57021g = z6;
        this.f57022h = i3;
        this.f57023i = i4;
        this.f57024j = z7;
        this.f57025k = z8;
        this.f57026l = z9;
        this.f57027m = str;
    }

    public final String toString() {
        String str = this.f57027m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57015a) {
            sb.append("no-cache, ");
        }
        if (this.f57016b) {
            sb.append("no-store, ");
        }
        int i = this.f57017c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f57018d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f57019e) {
            sb.append("private, ");
        }
        if (this.f57020f) {
            sb.append("public, ");
        }
        if (this.f57021g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f57022h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f57023i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f57024j) {
            sb.append("only-if-cached, ");
        }
        if (this.f57025k) {
            sb.append("no-transform, ");
        }
        if (this.f57026l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        this.f57027m = string;
        return string;
    }
}
