package okhttp3;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p044io.CloseableKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.Buffer$inputStream$1;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final DiskLruCache f56987a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: b */
        public final DiskLruCache.Snapshot f56988b;

        /* JADX INFO: renamed from: c */
        public final String f56989c;

        /* JADX INFO: renamed from: d */
        public final String f56990d;

        /* JADX INFO: renamed from: f */
        public final RealBufferedSource f56991f;

        /* JADX INFO: renamed from: okhttp3.Cache$CacheResponseBody$1 */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/Cache$CacheResponseBody$1", "Lokio/ForwardingSource;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public final class C63571 extends ForwardingSource {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CacheResponseBody f56992b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C63571(Source source, CacheResponseBody cacheResponseBody) {
                super(source);
                this.f56992b = cacheResponseBody;
            }

            @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.f56992b.f56988b.close();
                super.close();
            }
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.f56988b = snapshot;
            this.f56989c = str;
            this.f56990d = str2;
            this.f56991f = Okio.m21671d(new C63571((Source) snapshot.f57342c.get(1), this));
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: a */
        public final long getF57262c() {
            String str = this.f56990d;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = Util.f57274a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: b */
        public final MediaType getF57261b() {
            String str = this.f56989c;
            if (str == null) {
                return null;
            }
            Pattern pattern = MediaType.f57127d;
            return MediaType.Companion.m21284b(str);
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: d */
        public final BufferedSource mo21177d() {
            return this.f56991f;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m18302d2 = {"Lokhttp3/Cache$Companion;", "", "", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m21178a(HttpUrl url) {
            Intrinsics.m18599g(url, "url");
            ByteString.Companion companion = ByteString.f57840d;
            return ByteString.Companion.m21633c(url.f57117i).mo21616c("MD5").mo21618e();
        }

        /* JADX INFO: renamed from: b */
        public static int m21179b(RealBufferedSource realBufferedSource) throws IOException {
            Buffer buffer;
            byte bM21597j;
            try {
                realBufferedSource.m21692H(1L);
                long j = 0;
                while (true) {
                    long j2 = j + 1;
                    boolean zRequest = realBufferedSource.request(j2);
                    buffer = realBufferedSource.f57896b;
                    if (!zRequest) {
                        break;
                    }
                    bM21597j = buffer.m21597j(j);
                    if ((bM21597j < 48 || bM21597j > 57) && (j != 0 || bM21597j != 45)) {
                        break;
                    }
                    j = j2;
                }
                if (j == 0) {
                    CharsKt.m20380b(16);
                    String string = Integer.toString(bM21597j, 16);
                    Intrinsics.m18598f(string, "toString(...)");
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long jM21572M = buffer.m21572M();
                String strM21691C = realBufferedSource.m21691C(Long.MAX_VALUE);
                if (jM21572M >= 0 && jM21572M <= 2147483647L && strM21691C.length() <= 0) {
                    return (int) jM21572M;
                }
                throw new IOException("expected an int but was \"" + jM21572M + strM21691C + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public static Set m21180c(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (HttpHeaders.VARY.equalsIgnoreCase(headers.m21241e(i))) {
                    String strM21243g = headers.m21243g(i);
                    if (treeSet == null) {
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        Intrinsics.m18598f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = StringsKt.m20414L(strM21243g, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.m20430b0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.f51498a : treeSet;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: a */
        public final DiskLruCache.Editor f57005a;

        /* JADX INFO: renamed from: b */
        public final Sink f57006b;

        /* JADX INFO: renamed from: c */
        public final C63581 f57007c;

        /* JADX INFO: renamed from: d */
        public boolean f57008d;

        /* JADX INFO: renamed from: okhttp3.Cache$RealCacheRequest$1 */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/Cache$RealCacheRequest$1", "Lokio/ForwardingSink;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public final class C63581 extends ForwardingSink {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Cache f57010b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ RealCacheRequest f57011c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C63581(Cache cache, RealCacheRequest realCacheRequest, Sink sink) {
                super(sink);
                this.f57010b = cache;
                this.f57011c = realCacheRequest;
            }

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                Cache cache = this.f57010b;
                RealCacheRequest realCacheRequest = this.f57011c;
                synchronized (cache) {
                    if (realCacheRequest.f57008d) {
                        return;
                    }
                    realCacheRequest.f57008d = true;
                    super.close();
                    this.f57011c.f57005a.m21362b();
                }
            }
        }

        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.f57005a = editor;
            Sink sinkM21364d = editor.m21364d(1);
            this.f57006b = sinkM21364d;
            this.f57007c = new C63581(Cache.this, this, sinkM21364d);
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C63581 getF57007c() {
            return this.f57007c;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            synchronized (Cache.this) {
                if (this.f57008d) {
                    return;
                }
                this.f57008d = true;
                Util.m21320c(this.f57006b);
                try {
                    this.f57005a.m21361a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public Cache(File file) {
        this.f56987a = new DiskLruCache(file, TaskRunner.f57360i);
    }

    /* JADX INFO: renamed from: d */
    public static void m21172d(Response cached, Response response) throws Throwable {
        DiskLruCache.Editor editorM21351d;
        Intrinsics.m18599g(cached, "cached");
        Entry entry = new Entry(response);
        ResponseBody responseBody = cached.f57235i;
        Intrinsics.m18597e(responseBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        DiskLruCache.Snapshot snapshot = ((CacheResponseBody) responseBody).f56988b;
        try {
            String str = snapshot.f57340a;
            editorM21351d = snapshot.f57343d.m21351d(snapshot.f57341b, str);
            if (editorM21351d == null) {
                return;
            }
            try {
                entry.m21183c(editorM21351d);
                editorM21351d.m21362b();
            } catch (IOException unused) {
                if (editorM21351d != null) {
                    try {
                        editorM21351d.m21361a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            editorM21351d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Response m21173a(Request request) {
        Intrinsics.m18599g(request, "request");
        HttpUrl httpUrl = request.f57210a;
        try {
            DiskLruCache.Snapshot snapshotM21352g = this.f56987a.m21352g(Companion.m21178a(httpUrl));
            if (snapshotM21352g != null) {
                try {
                    Entry entry = new Entry((Source) snapshotM21352g.f57342c.get(0));
                    Headers headers = entry.f56996b;
                    String str = entry.f56997c;
                    HttpUrl url = entry.f56995a;
                    Headers headers2 = entry.f57001g;
                    String strM21240c = headers2.m21240c(HttpHeaders.CONTENT_TYPE);
                    String strM21240c2 = headers2.m21240c(HttpHeaders.CONTENT_LENGTH);
                    Request.Builder builder = new Request.Builder();
                    Intrinsics.m18599g(url, "url");
                    builder.f57216a = url;
                    builder.m21300e(str, null);
                    Intrinsics.m18599g(headers, "headers");
                    builder.f57218c = headers.m21242f();
                    Request requestM21297b = builder.m21297b();
                    Response.Builder builder2 = new Response.Builder();
                    builder2.f57243a = requestM21297b;
                    Protocol protocol = entry.f56998d;
                    Intrinsics.m18599g(protocol, "protocol");
                    builder2.f57244b = protocol;
                    builder2.f57245c = entry.f56999e;
                    String message = entry.f57000f;
                    Intrinsics.m18599g(message, "message");
                    builder2.f57246d = message;
                    builder2.m21312c(headers2);
                    builder2.f57249g = new CacheResponseBody(snapshotM21352g, strM21240c, strM21240c2);
                    builder2.f57247e = entry.f57002h;
                    builder2.f57253k = entry.f57003i;
                    builder2.f57254l = entry.f57004j;
                    Response responseM21311a = builder2.m21311a();
                    if (url.equals(httpUrl) && str.equals(request.f57211b)) {
                        Set<String> setM21180c = Companion.m21180c(responseM21311a.f57234g);
                        if (!(setM21180c instanceof Collection) || !setM21180c.isEmpty()) {
                            for (String str2 : setM21180c) {
                                if (!headers.m21244j(str2).equals(request.f57212c.m21244j(str2))) {
                                }
                            }
                        }
                        return responseM21311a;
                    }
                    ResponseBody responseBody = responseM21311a.f57235i;
                    if (responseBody != null) {
                        Util.m21320c(responseBody);
                        return null;
                    }
                } catch (IOException unused) {
                    Util.m21320c(snapshotM21352g);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final CacheRequest m21174b(Response response) throws Throwable {
        DiskLruCache.Editor editorM21351d;
        Request request = response.f57229a;
        String str = request.f57211b;
        try {
            if (HttpMethod.m21432a(str)) {
                String key = Companion.m21178a(request.f57210a);
                DiskLruCache diskLruCache = this.f56987a;
                synchronized (diskLruCache) {
                    Intrinsics.m18599g(key, "key");
                    diskLruCache.m21353h();
                    diskLruCache.m21349a();
                    DiskLruCache.m21348C(key);
                    DiskLruCache.Entry entry = (DiskLruCache.Entry) diskLruCache.f57310j.get(key);
                    if (entry == null) {
                        return null;
                    }
                    diskLruCache.m21359x(entry);
                    if (diskLruCache.f57308g <= 10485760) {
                        diskLruCache.f57316s = false;
                    }
                    return null;
                }
            }
            if (str.equals("GET") && !Companion.m21180c(response.f57234g).contains(Marker.ANY_MARKER)) {
                Entry entry2 = new Entry(response);
                try {
                    DiskLruCache diskLruCache2 = this.f56987a;
                    String strM21178a = Companion.m21178a(request.f57210a);
                    Regex regex = DiskLruCache.f57300x;
                    editorM21351d = diskLruCache2.m21351d(-1L, strM21178a);
                    if (editorM21351d != null) {
                        try {
                            entry2.m21183c(editorM21351d);
                            return new RealCacheRequest(editorM21351d);
                        } catch (IOException unused) {
                            if (editorM21351d != null) {
                                editorM21351d.m21361a();
                            }
                            return null;
                        }
                    }
                } catch (IOException unused2) {
                    editorM21351d = null;
                }
            }
        } catch (IOException unused3) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f56987a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f56987a.flush();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Entry {

        /* JADX INFO: renamed from: k */
        public static final String f56993k;

        /* JADX INFO: renamed from: l */
        public static final String f56994l;

        /* JADX INFO: renamed from: a */
        public final HttpUrl f56995a;

        /* JADX INFO: renamed from: b */
        public final Headers f56996b;

        /* JADX INFO: renamed from: c */
        public final String f56997c;

        /* JADX INFO: renamed from: d */
        public final Protocol f56998d;

        /* JADX INFO: renamed from: e */
        public final int f56999e;

        /* JADX INFO: renamed from: f */
        public final String f57000f;

        /* JADX INFO: renamed from: g */
        public final Headers f57001g;

        /* JADX INFO: renamed from: h */
        public final Handshake f57002h;

        /* JADX INFO: renamed from: i */
        public final long f57003i;

        /* JADX INFO: renamed from: j */
        public final long f57004j;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        static {
            Platform platform = Platform.f57701a;
            Platform.f57701a.getClass();
            f56993k = "OkHttp-Sent-Millis";
            Platform.f57701a.getClass();
            f56994l = "OkHttp-Received-Millis";
        }

        public Entry(Source rawSource) throws IOException {
            HttpUrl httpUrlM21276c;
            Intrinsics.m18599g(rawSource, "rawSource");
            try {
                RealBufferedSource realBufferedSourceM21671d = Okio.m21671d(rawSource);
                String strM21691C = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
                try {
                    httpUrlM21276c = HttpUrl.Companion.m21276c(strM21691C);
                } catch (IllegalArgumentException unused) {
                    httpUrlM21276c = null;
                }
                if (httpUrlM21276c == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strM21691C));
                    Platform platform = Platform.f57701a;
                    Platform.f57701a.getClass();
                    Platform.m21519i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f56995a = httpUrlM21276c;
                this.f56997c = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                int iM21179b = Companion.m21179b(realBufferedSourceM21671d);
                for (int i = 0; i < iM21179b; i++) {
                    builder.m21246b(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE));
                }
                this.f56996b = builder.m21249e();
                StatusLine statusLineM21439a = StatusLine.Companion.m21439a(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE));
                this.f56998d = statusLineM21439a.f57487a;
                this.f56999e = statusLineM21439a.f57488b;
                this.f57000f = statusLineM21439a.f57489c;
                Headers.Builder builder2 = new Headers.Builder();
                int iM21179b2 = Companion.m21179b(realBufferedSourceM21671d);
                for (int i2 = 0; i2 < iM21179b2; i2++) {
                    builder2.m21246b(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE));
                }
                String str = f56993k;
                String strM21250f = builder2.m21250f(str);
                String str2 = f56994l;
                String strM21250f2 = builder2.m21250f(str2);
                builder2.m21251g(str);
                builder2.m21251g(str2);
                this.f57003i = strM21250f != null ? Long.parseLong(strM21250f) : 0L;
                this.f57004j = strM21250f2 != null ? Long.parseLong(strM21250f2) : 0L;
                this.f57001g = builder2.m21249e();
                if (Intrinsics.m18594b(this.f56995a.f57109a, "https")) {
                    String strM21691C2 = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
                    if (strM21691C2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strM21691C2 + '\"');
                    }
                    this.f57002h = new Handshake(!realBufferedSourceM21671d.m21694a() ? TlsVersion.Companion.m21314a(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.f57041b.m21192b(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE)), Util.m21342y(m21181a(realBufferedSourceM21671d)), new Handshake$Companion$get$1(Util.m21342y(m21181a(realBufferedSourceM21671d))));
                } else {
                    this.f57002h = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m18567a(rawSource, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static List m21181a(RealBufferedSource realBufferedSource) throws IOException {
            int iM21179b = Companion.m21179b(realBufferedSource);
            if (iM21179b == -1) {
                return EmptyList.f51496a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM21179b);
                for (int i = 0; i < iM21179b; i++) {
                    String strM21691C = realBufferedSource.m21691C(Long.MAX_VALUE);
                    Buffer buffer = new Buffer();
                    ByteString.Companion companion = ByteString.f57840d;
                    ByteString byteStringM21631a = ByteString.Companion.m21631a(strM21691C);
                    if (byteStringM21631a == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    buffer.m21606x0(byteStringM21631a);
                    arrayList.add(certificateFactory.generateCertificate(new Buffer$inputStream$1(buffer)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m21182b(RealBufferedSink realBufferedSink, List list) throws IOException {
            try {
                realBufferedSink.mo21579U0(list.size());
                realBufferedSink.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    ByteString.Companion companion = ByteString.f57840d;
                    Intrinsics.m18598f(bytes, "bytes");
                    realBufferedSink.mo21585Z(ByteString.Companion.m21634d(bytes).mo21614a());
                    realBufferedSink.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m21183c(DiskLruCache.Editor editor) throws Throwable {
            HttpUrl httpUrl = this.f56995a;
            Handshake handshake = this.f57002h;
            Headers headers = this.f57001g;
            Headers headers2 = this.f56996b;
            RealBufferedSink realBufferedSinkM21670c = Okio.m21670c(editor.m21364d(0));
            try {
                realBufferedSinkM21670c.mo21585Z(httpUrl.f57117i);
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21585Z(this.f56997c);
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21579U0(headers2.size());
                realBufferedSinkM21670c.writeByte(10);
                int size = headers2.size();
                for (int i = 0; i < size; i++) {
                    realBufferedSinkM21670c.mo21585Z(headers2.m21241e(i));
                    realBufferedSinkM21670c.mo21585Z(": ");
                    realBufferedSinkM21670c.mo21585Z(headers2.m21243g(i));
                    realBufferedSinkM21670c.writeByte(10);
                }
                realBufferedSinkM21670c.mo21585Z(new StatusLine(this.f56998d, this.f56999e, this.f57000f).toString());
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21579U0(headers.size() + 2);
                realBufferedSinkM21670c.writeByte(10);
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    realBufferedSinkM21670c.mo21585Z(headers.m21241e(i2));
                    realBufferedSinkM21670c.mo21585Z(": ");
                    realBufferedSinkM21670c.mo21585Z(headers.m21243g(i2));
                    realBufferedSinkM21670c.writeByte(10);
                }
                realBufferedSinkM21670c.mo21585Z(f56993k);
                realBufferedSinkM21670c.mo21585Z(": ");
                realBufferedSinkM21670c.mo21579U0(this.f57003i);
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21585Z(f56994l);
                realBufferedSinkM21670c.mo21585Z(": ");
                realBufferedSinkM21670c.mo21579U0(this.f57004j);
                realBufferedSinkM21670c.writeByte(10);
                if (Intrinsics.m18594b(httpUrl.f57109a, "https")) {
                    realBufferedSinkM21670c.writeByte(10);
                    Intrinsics.m18596d(handshake);
                    realBufferedSinkM21670c.mo21585Z(handshake.f57100b.f57060a);
                    realBufferedSinkM21670c.writeByte(10);
                    m21182b(realBufferedSinkM21670c, handshake.m21238a());
                    m21182b(realBufferedSinkM21670c, handshake.f57101c);
                    realBufferedSinkM21670c.mo21585Z(handshake.f57099a.f57273a);
                    realBufferedSinkM21670c.writeByte(10);
                }
                realBufferedSinkM21670c.close();
            } finally {
            }
        }

        public Entry(Response response) {
            Headers headersM21249e;
            Request request = response.f57229a;
            this.f56995a = request.f57210a;
            Response response2 = response.f57236j;
            Intrinsics.m18596d(response2);
            Headers headers = response2.f57229a.f57212c;
            Headers headers2 = response.f57234g;
            Set setM21180c = Companion.m21180c(headers2);
            if (setM21180c.isEmpty()) {
                headersM21249e = Util.f57275b;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strM21241e = headers.m21241e(i);
                    if (setM21180c.contains(strM21241e)) {
                        builder.m21245a(strM21241e, headers.m21243g(i));
                    }
                }
                headersM21249e = builder.m21249e();
            }
            this.f56996b = headersM21249e;
            this.f56997c = request.f57211b;
            this.f56998d = response.f57230b;
            this.f56999e = response.f57232d;
            this.f57000f = response.f57231c;
            this.f57001g = headers2;
            this.f57002h = response.f57233f;
            this.f57003i = response.f57239p;
            this.f57004j = response.f57240q;
        }
    }
}
