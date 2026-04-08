package okhttp3;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Buffer;
import org.slf4j.Marker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class HttpUrl {

    /* JADX INFO: renamed from: k */
    public static final char[] f57108k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f57109a;

    /* JADX INFO: renamed from: b */
    public final String f57110b;

    /* JADX INFO: renamed from: c */
    public final String f57111c;

    /* JADX INFO: renamed from: d */
    public final String f57112d;

    /* JADX INFO: renamed from: e */
    public final int f57113e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f57114f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f57115g;

    /* JADX INFO: renamed from: h */
    public final String f57116h;

    /* JADX INFO: renamed from: i */
    public final String f57117i;

    /* JADX INFO: renamed from: j */
    public final boolean f57118j;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/HttpUrl$Builder;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public String f57119a;

        /* JADX INFO: renamed from: d */
        public String f57122d;

        /* JADX INFO: renamed from: f */
        public final ArrayList f57124f;

        /* JADX INFO: renamed from: g */
        public ArrayList f57125g;

        /* JADX INFO: renamed from: h */
        public String f57126h;

        /* JADX INFO: renamed from: b */
        public String f57120b = "";

        /* JADX INFO: renamed from: c */
        public String f57121c = "";

        /* JADX INFO: renamed from: e */
        public int f57123e = -1;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f57124f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: a */
        public final HttpUrl m21265a() {
            ArrayList arrayList;
            String str = this.f57119a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strM21278e = Companion.m21278e(0, 0, 7, this.f57120b);
            String strM21278e2 = Companion.m21278e(0, 0, 7, this.f57121c);
            String str2 = this.f57122d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM21275b = this.f57123e;
            if (iM21275b == -1) {
                String str3 = this.f57119a;
                Intrinsics.m18596d(str3);
                iM21275b = Companion.m21275b(str3);
            }
            ArrayList arrayList2 = this.f57124f;
            int i = iM21275b;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.m21278e(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.f57125g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.m18452r(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList5.add(str4 != null ? Companion.m21278e(0, 0, 3, str4) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str5 = this.f57126h;
            return new HttpUrl(str, strM21278e, strM21278e2, str2, i, arrayList3, arrayList, str5 != null ? Companion.m21278e(0, 0, 7, str5) : null, toString());
        }

        /* JADX INFO: renamed from: b */
        public final void m21266b(String encodedPath) throws EOFException {
            Intrinsics.m18599g(encodedPath, "encodedPath");
            if (!StringsKt.m20416N(encodedPath, RemoteSettings.FORWARD_SLASH_STRING, false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
            }
            m21272h(0, encodedPath.length(), encodedPath);
        }

        /* JADX INFO: renamed from: c */
        public final void m21267c(String host) {
            Intrinsics.m18599g(host, "host");
            String strM21316b = HostnamesKt.m21316b(Companion.m21278e(0, 0, 7, host));
            if (strM21316b == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.f57122d = strM21316b;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21268d(HttpUrl httpUrl, String input) throws EOFException {
            int i;
            char c2;
            char c3;
            int i2;
            int iM21322e;
            int i3;
            char cCharAt;
            int i4 = 1;
            Intrinsics.m18599g(input, "input");
            byte[] bArr = Util.f57274a;
            int i5 = 0;
            int iM21331n = Util.m21331n(0, input.length(), input);
            int iM21332o = Util.m21332o(iM21331n, input.length(), input);
            if (iM21332o - iM21331n < 2) {
                i = -1;
            } else {
                char cCharAt2 = input.charAt(iM21331n);
                char c4 = 'a';
                if ((Intrinsics.m18601i(cCharAt2, 97) >= 0 && Intrinsics.m18601i(cCharAt2, ModuleDescriptor.MODULE_VERSION) <= 0) || (Intrinsics.m18601i(cCharAt2, 65) >= 0 && Intrinsics.m18601i(cCharAt2, 90) <= 0)) {
                    i = iM21331n + 1;
                    while (true) {
                        if (i >= iM21332o) {
                            break;
                        }
                        char cCharAt3 = input.charAt(i);
                        if ((c4 <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i++;
                            c4 = 'a';
                        } else if (cCharAt3 != ':') {
                            break;
                        }
                    }
                    i = -1;
                }
            }
            if (i != -1) {
                if (StringsKt.m20415M(iM21331n, input, "https:", true)) {
                    this.f57119a = "https";
                    iM21331n += 6;
                } else {
                    if (!StringsKt.m20415M(iM21331n, input, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i);
                        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f57119a = "http";
                    iM21331n += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(AbstractC0000a.m13j("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? StringsKt.m20425W(6, input).concat("...") : input));
                }
                this.f57119a = httpUrl.f57109a;
            }
            int i6 = iM21331n;
            int i7 = 0;
            while (true) {
                c2 = '/';
                c3 = '\\';
                i2 = i4;
                if (i6 >= iM21332o || !((cCharAt = input.charAt(i6)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i7++;
                i6++;
                i4 = i2;
            }
            char c5 = '#';
            if (i7 >= 2 || httpUrl == null) {
                int i8 = iM21331n + i7;
                int i9 = 0;
                while (true) {
                    iM21322e = Util.m21322e(i8, iM21332o, input, "@/\\?#");
                    byte bCharAt = iM21322e != iM21332o ? input.charAt(iM21322e) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c5 || bCharAt == c2 || bCharAt == c3 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i5 == 0) {
                            int iM21323f = Util.m21323f(input, ':', i8, iM21322e);
                            String strM21274a = Companion.m21274a(input, i8, iM21323f, " \"':;<=>@[]^`{}|/\\?#", 240);
                            if (i9 != 0) {
                                strM21274a = this.f57120b + "%40" + strM21274a;
                            }
                            this.f57120b = strM21274a;
                            if (iM21323f != iM21322e) {
                                this.f57121c = Companion.m21274a(input, iM21323f + 1, iM21322e, " \"':;<=>@[]^`{}|/\\?#", 240);
                                i5 = i2;
                            }
                            i9 = i2;
                        } else {
                            this.f57121c += "%40" + Companion.m21274a(input, i8, iM21322e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        }
                        i8 = iM21322e + 1;
                        c5 = '#';
                        c2 = '/';
                        c3 = '\\';
                    }
                }
                int i10 = i8;
                while (true) {
                    if (i10 >= iM21322e) {
                        i10 = iM21322e;
                        break;
                    }
                    char cCharAt4 = input.charAt(i10);
                    if (cCharAt4 == '[') {
                        do {
                            i10++;
                            if (i10 >= iM21322e) {
                                break;
                            }
                        } while (input.charAt(i10) != ']');
                    } else if (cCharAt4 == ':') {
                        break;
                    }
                    i10++;
                }
                int i11 = i10 + 1;
                if (i11 < iM21322e) {
                    this.f57122d = HostnamesKt.m21316b(Companion.m21278e(i8, i10, 4, input));
                    try {
                        i3 = Integer.parseInt(Companion.m21274a(input, i11, iM21322e, "", 248));
                    } catch (NumberFormatException unused) {
                    }
                    if (i2 > i3 || i3 >= 65536) {
                        i3 = -1;
                    }
                    this.f57123e = i3;
                    if (i3 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i11, iM21322e);
                        Intrinsics.m18598f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    this.f57122d = HostnamesKt.m21316b(Companion.m21278e(i8, i10, 4, input));
                    String str = this.f57119a;
                    Intrinsics.m18596d(str);
                    this.f57123e = Companion.m21275b(str);
                }
                if (this.f57122d == null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i8, i10);
                    Intrinsics.m18598f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                iM21331n = iM21322e;
            } else if (Intrinsics.m18594b(httpUrl.f57109a, this.f57119a)) {
                this.f57120b = httpUrl.m21259e();
                this.f57121c = httpUrl.m21255a();
                this.f57122d = httpUrl.f57112d;
                this.f57123e = httpUrl.f57113e;
                ArrayList arrayList = this.f57124f;
                arrayList.clear();
                arrayList.addAll(httpUrl.m21257c());
                if (iM21331n == iM21332o || input.charAt(iM21331n) == '#') {
                    String strM21258d = httpUrl.m21258d();
                    this.f57125g = strM21258d != null ? Companion.m21279f(Companion.m21274a(strM21258d, 0, 0, " \"'<>#", 211)) : null;
                }
            }
            int iM21322e2 = Util.m21322e(iM21331n, iM21332o, input, "?#");
            m21272h(iM21331n, iM21322e2, input);
            if (iM21322e2 < iM21332o && input.charAt(iM21322e2) == '?') {
                int iM21323f2 = Util.m21323f(input, '#', iM21322e2, iM21332o);
                this.f57125g = Companion.m21279f(Companion.m21274a(input, iM21322e2 + 1, iM21323f2, " \"'<>#", 208));
                iM21322e2 = iM21323f2;
            }
            if (iM21322e2 >= iM21332o || input.charAt(iM21322e2) != '#') {
                return;
            }
            this.f57126h = Companion.m21274a(input, iM21322e2 + 1, iM21332o, "", 176);
        }

        /* JADX INFO: renamed from: e */
        public final void m21269e(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "unexpected port: ").toString());
            }
            this.f57123e = i;
        }

        /* JADX INFO: renamed from: f */
        public final void m21270f(String str, int i, int i2, boolean z2) throws EOFException {
            String strM21274a = Companion.m21274a(str, i, i2, " \"<>^`{}|/\\?#", 240);
            if (strM21274a.equals(".") || strM21274a.equalsIgnoreCase("%2e")) {
                return;
            }
            boolean zEquals = strM21274a.equals("..");
            ArrayList arrayList = this.f57124f;
            if (zEquals || strM21274a.equalsIgnoreCase("%2e.") || strM21274a.equalsIgnoreCase(".%2e") || strM21274a.equalsIgnoreCase("%2e%2e")) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) AbstractC0000a.m8e(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, strM21274a);
            } else {
                arrayList.add(strM21274a);
            }
            if (z2) {
                arrayList.add("");
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m21271g() {
            ArrayList arrayList = this.f57124f;
            arrayList.remove(0);
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m21272h(int i, int i2, String str) throws EOFException {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            ArrayList arrayList = this.f57124f;
            if (cCharAt == '/' || cCharAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (i < i2) {
                int iM21322e = Util.m21322e(i, i2, str, "/\\");
                boolean z2 = iM21322e < i2;
                m21270f(str, i, iM21322e, z2);
                i = z2 ? iM21322e + 1 : iM21322e;
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m21273i(String scheme) {
            Intrinsics.m18599g(scheme, "scheme");
            if (scheme.equalsIgnoreCase("http")) {
                this.f57119a = "http";
            } else {
                if (!scheme.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
                }
                this.f57119a = "https";
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f57119a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f57120b.length() > 0 || this.f57121c.length() > 0) {
                sb.append(this.f57120b);
                if (this.f57121c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f57121c);
                }
                sb.append('@');
            }
            String str2 = this.f57122d;
            if (str2 != null) {
                if (StringsKt.m20435k(str2, ':')) {
                    sb.append('[');
                    sb.append(this.f57122d);
                    sb.append(']');
                } else {
                    sb.append(this.f57122d);
                }
            }
            int iM21275b = this.f57123e;
            if (iM21275b != -1 || this.f57119a != null) {
                if (iM21275b == -1) {
                    String str3 = this.f57119a;
                    Intrinsics.m18596d(str3);
                    iM21275b = Companion.m21275b(str3);
                }
                String str4 = this.f57119a;
                if (str4 == null || iM21275b != Companion.m21275b(str4)) {
                    sb.append(':');
                    sb.append(iM21275b);
                }
            }
            ArrayList arrayList = this.f57124f;
            Intrinsics.m18599g(arrayList, "<this>");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.f57125g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.f57125g;
                Intrinsics.m18596d(arrayList2);
                Companion.m21280g(arrayList2, sb);
            }
            if (this.f57126h != null) {
                sb.append('#');
                sb.append(this.f57126h);
            }
            String string = sb.toString();
            Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, m18302d2 = {"Lokhttp3/HttpUrl$Companion;", "", "", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m21274a(String str, int i, int i2, String str2, int i3) throws EOFException {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z2 = (i3 & 8) == 0;
            boolean z3 = (i3 & 16) == 0;
            boolean z4 = (i3 & 32) == 0;
            boolean z5 = (i3 & 64) == 0;
            Intrinsics.m18599g(str, "<this>");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i5 = 32;
                int i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z5) || StringsKt.m20435k(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z2 || (z3 && !m21277d(iCharCount, length, str)))) || (iCodePointAt == 43 && z4)))) {
                    Buffer buffer = new Buffer();
                    buffer.m21574O0(i4, iCharCount, str);
                    Buffer buffer2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z4) {
                                buffer.m21578S0(z2 ? Marker.ANY_NON_NULL_MARKER : "%2B");
                            } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z5) || StringsKt.m20435k(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z2 || (z3 && !m21277d(iCharCount, length, str)))))) {
                                if (buffer2 == null) {
                                    buffer2 = new Buffer();
                                }
                                buffer2.m21581V0(iCodePointAt2);
                                while (!buffer2.m21595i()) {
                                    byte bM21562C = buffer2.m21562C();
                                    int i7 = bM21562C & UnsignedBytes.MAX_VALUE;
                                    buffer.m21563C0(37);
                                    char[] cArr = HttpUrl.f57108k;
                                    buffer.m21563C0(cArr[(i7 >> 4) & 15]);
                                    buffer.m21563C0(cArr[bM21562C & Ascii.f42543SI]);
                                }
                            } else {
                                buffer.m21581V0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i5 = 32;
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    return buffer.m21594h0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i4, length);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: b */
        public static int m21275b(String scheme) {
            Intrinsics.m18599g(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        /* JADX INFO: renamed from: c */
        public static HttpUrl m21276c(String str) throws EOFException {
            Intrinsics.m18599g(str, "<this>");
            Builder builder = new Builder();
            builder.m21268d(null, str);
            return builder.m21265a();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m21277d(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.m21335r(str.charAt(i + 1)) != -1 && Util.m21335r(str.charAt(i3)) != -1;
        }

        /* JADX INFO: renamed from: e */
        public static String m21278e(int i, int i2, int i3, String str) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            boolean z2 = (i3 & 4) == 0;
            Intrinsics.m18599g(str, "<this>");
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                    Buffer buffer = new Buffer();
                    buffer.m21574O0(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iM21335r = Util.m21335r(str.charAt(iCharCount + 1));
                            int iM21335r2 = Util.m21335r(str.charAt(i4));
                            if (iM21335r == -1 || iM21335r2 == -1) {
                                buffer.m21581V0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                buffer.m21563C0((iM21335r << 4) + iM21335r2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z2) {
                            buffer.m21563C0(32);
                            iCharCount++;
                        } else {
                            buffer.m21581V0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return buffer.m21594h0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: f */
        public static ArrayList m21279f(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iM20445u = StringsKt.m20445u(str, '&', i, 4);
                if (iM20445u == -1) {
                    iM20445u = str.length();
                }
                int iM20445u2 = StringsKt.m20445u(str, '=', i, 4);
                if (iM20445u2 == -1 || iM20445u2 > iM20445u) {
                    String strSubstring = str.substring(i, iM20445u);
                    Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iM20445u2);
                    Intrinsics.m18598f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM20445u2 + 1, iM20445u);
                    Intrinsics.m18598f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iM20445u + 1;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public static void m21280g(ArrayList arrayList, StringBuilder sb) {
            Intrinsics.m18599g(arrayList, "<this>");
            IntProgression intProgressionM18663j = RangesKt.m18663j(RangesKt.m18664k(0, arrayList.size()), 2);
            int i = intProgressionM18663j.f51685a;
            int i2 = intProgressionM18663j.f51686b;
            int i3 = intProgressionM18663j.f51687c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) arrayList.get(i);
                String str2 = (String) arrayList.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }
    }

    public HttpUrl(String scheme, String str, String str2, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        Intrinsics.m18599g(scheme, "scheme");
        Intrinsics.m18599g(host, "host");
        this.f57109a = scheme;
        this.f57110b = str;
        this.f57111c = str2;
        this.f57112d = host;
        this.f57113e = i;
        this.f57114f = arrayList;
        this.f57115g = arrayList2;
        this.f57116h = str3;
        this.f57117i = str4;
        this.f57118j = scheme.equals("https");
    }

    /* JADX INFO: renamed from: a */
    public final String m21255a() {
        if (this.f57111c.length() == 0) {
            return "";
        }
        int length = this.f57109a.length() + 3;
        String str = this.f57117i;
        String strSubstring = str.substring(StringsKt.m20445u(str, ':', length, 4) + 1, StringsKt.m20445u(str, '@', 0, 6));
        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public final String m21256b() {
        int length = this.f57109a.length() + 3;
        String str = this.f57117i;
        int iM20445u = StringsKt.m20445u(str, '/', length, 4);
        String strSubstring = str.substring(iM20445u, Util.m21322e(iM20445u, str.length(), str, "?#"));
        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m21257c() {
        int length = this.f57109a.length() + 3;
        String str = this.f57117i;
        int iM20445u = StringsKt.m20445u(str, '/', length, 4);
        int iM21322e = Util.m21322e(iM20445u, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM20445u < iM21322e) {
            int i = iM20445u + 1;
            int iM21323f = Util.m21323f(str, '/', i, iM21322e);
            String strSubstring = str.substring(i, iM21323f);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM20445u = iM21323f;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m21258d() {
        if (this.f57115g == null) {
            return null;
        }
        String str = this.f57117i;
        int iM20445u = StringsKt.m20445u(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iM20445u, Util.m21323f(str, '#', iM20445u, str.length()));
        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final String m21259e() {
        if (this.f57110b.length() == 0) {
            return "";
        }
        int length = this.f57109a.length() + 3;
        String str = this.f57117i;
        String strSubstring = str.substring(length, Util.m21322e(length, str.length(), str, ":@"));
        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.m18594b(((HttpUrl) obj).f57117i, this.f57117i);
    }

    /* JADX INFO: renamed from: f */
    public final Builder m21260f() {
        Builder builder = new Builder();
        String str = this.f57109a;
        builder.f57119a = str;
        builder.f57120b = m21259e();
        builder.f57121c = m21255a();
        builder.f57122d = this.f57112d;
        int iM21275b = Companion.m21275b(str);
        int i = this.f57113e;
        if (i == iM21275b) {
            i = -1;
        }
        builder.f57123e = i;
        ArrayList arrayList = builder.f57124f;
        arrayList.clear();
        arrayList.addAll(m21257c());
        String strM21258d = m21258d();
        String strSubstring = null;
        builder.f57125g = strM21258d != null ? Companion.m21279f(Companion.m21274a(strM21258d, 0, 0, " \"'<>#", 211)) : null;
        if (this.f57116h != null) {
            String str2 = this.f57117i;
            strSubstring = str2.substring(StringsKt.m20445u(str2, '#', 0, 6) + 1);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        builder.f57126h = strSubstring;
        return builder;
    }

    /* JADX INFO: renamed from: g */
    public final Builder m21261g(String link) throws EOFException {
        Intrinsics.m18599g(link, "link");
        try {
            Builder builder = new Builder();
            builder.m21268d(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m21262h() throws EOFException {
        Builder builderM21261g = m21261g("/...");
        Intrinsics.m18596d(builderM21261g);
        builderM21261g.f57120b = Companion.m21274a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        builderM21261g.f57121c = Companion.m21274a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return builderM21261g.m21265a().f57117i;
    }

    public final int hashCode() {
        return this.f57117i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final URI m21263i() {
        Builder builderM21260f = m21260f();
        String str = builderM21260f.f57122d;
        builderM21260f.f57122d = str != null ? new Regex("[\"<>^`{|}]").m20399e(str, "") : null;
        ArrayList arrayList = builderM21260f.f57124f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, Companion.m21274a((String) arrayList.get(i), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = builderM21260f.f57125g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? Companion.m21274a(str2, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str3 = builderM21260f.f57126h;
        builderM21260f.f57126h = str3 != null ? Companion.m21274a(str3, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = builderM21260f.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m20399e(string, ""));
                Intrinsics.m18598f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final URL m21264j() {
        try {
            return new URL(this.f57117i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF57117i() {
        return this.f57117i;
    }
}
