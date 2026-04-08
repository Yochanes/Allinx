package okhttp3.internal;

import androidx.compose.p013ui.platform.AbstractC1313i;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;
import okio.Source;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okhttp"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class Util {

    /* JADX INFO: renamed from: a */
    public static final byte[] f57274a;

    /* JADX INFO: renamed from: b */
    public static final Headers f57275b = Headers.Companion.m21254c(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final ResponseBody$Companion$asResponseBody$1 f57276c;

    /* JADX INFO: renamed from: d */
    public static final Options f57277d;

    /* JADX INFO: renamed from: e */
    public static final TimeZone f57278e;

    /* JADX INFO: renamed from: f */
    public static final Regex f57279f;

    /* JADX INFO: renamed from: g */
    public static final String f57280g;

    static {
        byte[] bArr = new byte[0];
        f57274a = bArr;
        Buffer buffer = new Buffer();
        buffer.m21607y0(bArr);
        f57276c = new ResponseBody$Companion$asResponseBody$1(null, 0, buffer);
        RequestBody.Companion.m21305c(RequestBody.INSTANCE, bArr, null, 0, 7);
        ByteString.Companion companion = ByteString.f57840d;
        f57277d = Options.Companion.m21679b(ByteString.Companion.m21632b("efbbbf"), ByteString.Companion.m21632b("feff"), ByteString.Companion.m21632b("fffe"), ByteString.Companion.m21632b("0000ffff"), ByteString.Companion.m21632b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.m18596d(timeZone);
        f57278e = timeZone;
        f57279f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f57280g = StringsKt.m20407E(StringsKt.m20406D(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: A */
    public static final String m21317A(int i, int i2, String str) {
        int iM21331n = m21331n(i, i2, str);
        String strSubstring = str.substring(iM21331n, m21332o(iM21331n, i2, str));
        Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m21318a(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.m18599g(httpUrl, "<this>");
        Intrinsics.m18599g(other, "other");
        return Intrinsics.m18594b(httpUrl.f57112d, other.f57112d) && httpUrl.f57113e == other.f57113e && Intrinsics.m18594b(httpUrl.f57109a, other.f57109a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m21319b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m21320c(Closeable closeable) {
        Intrinsics.m18599g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21321d(Socket socket) {
        Intrinsics.m18599g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.m18594b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m21322e(int i, int i2, String str, String str2) {
        Intrinsics.m18599g(str, "<this>");
        while (i < i2) {
            if (StringsKt.m20435k(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m21323f(String str, char c2, int i, int i2) {
        Intrinsics.m18599g(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m21324g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m21323f(str, c2, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m21325h(Source source) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.m18599g(timeUnit, "timeUnit");
        try {
            return m21339v(source, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final String m21326i(String format, Object... objArr) {
        Intrinsics.m18599g(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m21327j(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.m18599g(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itM18576a = ArrayIteratorKt.m18576a(strArr2);
                while (itM18576a.hasNext()) {
                    if (comparator.compare(str, (String) itM18576a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final long m21328k(Response response) {
        String strM21240c = response.f57234g.m21240c(HttpHeaders.CONTENT_LENGTH);
        if (strM21240c == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM21240c);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final List m21329l(Object... elements) {
        Intrinsics.m18599g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.m18414O(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.m18598f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: m */
    public static final int m21330m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.m18601i(cCharAt, 31) <= 0 || Intrinsics.m18601i(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static final int m21331n(int i, int i2, String str) {
        Intrinsics.m18599g(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static final int m21332o(int i, int i2, String str) {
        Intrinsics.m18599g(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: p */
    public static final String[] m21333p(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.m18599g(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m21334q(String name) {
        Intrinsics.m18599g(name, "name");
        return name.equalsIgnoreCase(HttpHeaders.AUTHORIZATION) || name.equalsIgnoreCase(HttpHeaders.COOKIE) || name.equalsIgnoreCase(HttpHeaders.PROXY_AUTHORIZATION) || name.equalsIgnoreCase(HttpHeaders.SET_COOKIE);
    }

    /* JADX INFO: renamed from: r */
    public static final int m21335r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    /* JADX INFO: renamed from: s */
    public static final Charset m21336s(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.m18599g(bufferedSource, "<this>");
        Intrinsics.m18599g(charset, "default");
        int iMo21584Y0 = bufferedSource.mo21584Y0(f57277d);
        if (iMo21584Y0 == -1) {
            return charset;
        }
        if (iMo21584Y0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.m18598f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iMo21584Y0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.m18598f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iMo21584Y0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.m18598f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iMo21584Y0 == 3) {
            Charset charset2 = Charsets.f55167a;
            Charset charset3 = Charsets.f55170d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            Intrinsics.m18598f(charsetForName, "forName(...)");
            Charsets.f55170d = charsetForName;
            return charsetForName;
        }
        if (iMo21584Y0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = Charsets.f55167a;
        Charset charset5 = Charsets.f55169c;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        Intrinsics.m18598f(charsetForName2, "forName(...)");
        Charsets.f55169c = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: t */
    public static final int m21337t(RealBufferedSource realBufferedSource) {
        Intrinsics.m18599g(realBufferedSource, "<this>");
        return (realBufferedSource.m21697g() & UnsignedBytes.MAX_VALUE) | ((realBufferedSource.m21697g() & UnsignedBytes.MAX_VALUE) << 16) | ((realBufferedSource.m21697g() & UnsignedBytes.MAX_VALUE) << 8);
    }

    /* JADX INFO: renamed from: u */
    public static final int m21338u(Buffer buffer) throws EOFException {
        int i = 0;
        while (!buffer.m21595i() && buffer.m21597j(0L) == 61) {
            i++;
            buffer.m21562C();
        }
        return i;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m21339v(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.m18599g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo21653c = source.getF57877b().getF57913a() ? source.getF57877b().mo21653c() - jNanoTime : Long.MAX_VALUE;
        source.getF57877b().mo21654d(Math.min(jMo21653c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.mo12415J0(buffer, 8192L) != -1) {
                buffer.m21586a();
            }
            if (jMo21653c == Long.MAX_VALUE) {
                source.getF57877b().mo21651a();
                return true;
            }
            source.getF57877b().mo21654d(jNanoTime + jMo21653c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo21653c == Long.MAX_VALUE) {
                source.getF57877b().mo21651a();
                return false;
            }
            source.getF57877b().mo21654d(jNanoTime + jMo21653c);
            return false;
        } catch (Throwable th) {
            if (jMo21653c == Long.MAX_VALUE) {
                source.getF57877b().mo21651a();
            } else {
                source.getF57877b().mo21654d(jNanoTime + jMo21653c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Headers m21340w(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.m21247c(header.f57529a.m21629t(), header.f57530b.m21629t());
        }
        return builder.m21249e();
    }

    /* JADX INFO: renamed from: x */
    public static final String m21341x(HttpUrl httpUrl, boolean z2) {
        Intrinsics.m18599g(httpUrl, "<this>");
        String strM6244a = httpUrl.f57112d;
        if (StringsKt.m20434j(strM6244a, ":", false)) {
            strM6244a = AbstractC1313i.m6244a(']', "[", strM6244a);
        }
        int i = httpUrl.f57113e;
        if (!z2 && i == HttpUrl.Companion.m21275b(httpUrl.f57109a)) {
            return strM6244a;
        }
        return strM6244a + ':' + i;
    }

    /* JADX INFO: renamed from: y */
    public static final List m21342y(List list) {
        Intrinsics.m18599g(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.m18469z0(list));
        Intrinsics.m18598f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: z */
    public static final int m21343z(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
