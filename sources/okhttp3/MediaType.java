package okhttp3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.platform.AbstractC1313i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MediaType {

    /* JADX INFO: renamed from: d */
    public static final Pattern f57127d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f57128e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f57129a;

    /* JADX INFO: renamed from: b */
    public final String f57130b;

    /* JADX INFO: renamed from: c */
    public final String[] f57131c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m18302d2 = {"Lokhttp3/MediaType$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static MediaType m21283a(String str) {
            Intrinsics.m18599g(str, "<this>");
            Matcher matcher = MediaType.f57127d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(AbstractC1313i.m6244a('\"', "No subtype found for: \"", str).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.m18598f(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.m18598f(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.m18598f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.m18598f(strGroup2, "typeSubtype.group(2)");
            Intrinsics.m18598f(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f57128e.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(AbstractC0455a.m2241p(sb, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.m20416N(strGroup4, "'", false) && StringsKt.m20439o(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.m18598f(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, (String[]) arrayList.toArray(new String[0]), lowerCase);
        }

        /* JADX INFO: renamed from: b */
        public static MediaType m21284b(String str) {
            Intrinsics.m18599g(str, "<this>");
            try {
                return m21283a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public MediaType(String str, String[] strArr, String str2) {
        this.f57129a = str;
        this.f57130b = str2;
        this.f57131c = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m21282a(Charset charset) {
        String str;
        String[] strArr = this.f57131c;
        int i = 0;
        int iM18565a = ProgressionUtilKt.m18565a(0, strArr.length - 1, 2);
        if (iM18565a < 0) {
            str = null;
            break;
        }
        while (!StringsKt.m20442r(strArr[i], "charset", true)) {
            if (i == iM18565a) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.m18594b(((MediaType) obj).f57129a, this.f57129a);
    }

    public final int hashCode() {
        return this.f57129a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF57129a() {
        return this.f57129a;
    }
}
