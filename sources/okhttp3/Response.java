package okhttp3;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Request f57229a;

    /* JADX INFO: renamed from: b */
    public final Protocol f57230b;

    /* JADX INFO: renamed from: c */
    public final String f57231c;

    /* JADX INFO: renamed from: d */
    public final int f57232d;

    /* JADX INFO: renamed from: f */
    public final Handshake f57233f;

    /* JADX INFO: renamed from: g */
    public final Headers f57234g;

    /* JADX INFO: renamed from: i */
    public final ResponseBody f57235i;

    /* JADX INFO: renamed from: j */
    public final Response f57236j;

    /* JADX INFO: renamed from: n */
    public final Response f57237n;

    /* JADX INFO: renamed from: o */
    public final Response f57238o;

    /* JADX INFO: renamed from: p */
    public final long f57239p;

    /* JADX INFO: renamed from: q */
    public final long f57240q;

    /* JADX INFO: renamed from: r */
    public final Exchange f57241r;

    /* JADX INFO: renamed from: s */
    public CacheControl f57242s;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Response$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public Request f57243a;

        /* JADX INFO: renamed from: b */
        public Protocol f57244b;

        /* JADX INFO: renamed from: d */
        public String f57246d;

        /* JADX INFO: renamed from: e */
        public Handshake f57247e;

        /* JADX INFO: renamed from: g */
        public ResponseBody f57249g;

        /* JADX INFO: renamed from: h */
        public Response f57250h;

        /* JADX INFO: renamed from: i */
        public Response f57251i;

        /* JADX INFO: renamed from: j */
        public Response f57252j;

        /* JADX INFO: renamed from: k */
        public long f57253k;

        /* JADX INFO: renamed from: l */
        public long f57254l;

        /* JADX INFO: renamed from: m */
        public Exchange f57255m;

        /* JADX INFO: renamed from: c */
        public int f57245c = -1;

        /* JADX INFO: renamed from: f */
        public Headers.Builder f57248f = new Headers.Builder();

        /* JADX INFO: renamed from: b */
        public static void m21310b(String str, Response response) {
            if (response != null) {
                if (response.f57235i != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (response.f57236j != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f57237n != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.f57238o != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final Response m21311a() {
            int i = this.f57245c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.f57245c).toString());
            }
            Request request = this.f57243a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f57244b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f57246d;
            if (str != null) {
                return new Response(request, protocol, str, i, this.f57247e, this.f57248f.m21249e(), this.f57249g, this.f57250h, this.f57251i, this.f57252j, this.f57253k, this.f57254l, this.f57255m);
            }
            throw new IllegalStateException("message == null");
        }

        /* JADX INFO: renamed from: c */
        public final void m21312c(Headers headers) {
            Intrinsics.m18599g(headers, "headers");
            this.f57248f = headers.m21242f();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        Intrinsics.m18599g(request, "request");
        Intrinsics.m18599g(protocol, "protocol");
        Intrinsics.m18599g(message, "message");
        this.f57229a = request;
        this.f57230b = protocol;
        this.f57231c = message;
        this.f57232d = i;
        this.f57233f = handshake;
        this.f57234g = headers;
        this.f57235i = responseBody;
        this.f57236j = response;
        this.f57237n = response2;
        this.f57238o = response3;
        this.f57239p = j;
        this.f57240q = j2;
        this.f57241r = exchange;
    }

    /* JADX INFO: renamed from: b */
    public static String m21306b(String str, Response response) {
        response.getClass();
        String strM21240c = response.f57234g.m21240c(str);
        if (strM21240c == null) {
            return null;
        }
        return strM21240c;
    }

    /* JADX INFO: renamed from: a */
    public final CacheControl m21307a() {
        CacheControl cacheControl = this.f57242s;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.f57013n;
        CacheControl cacheControlM21186a = CacheControl.Companion.m21186a(this.f57234g);
        this.f57242s = cacheControlM21186a;
        return cacheControlM21186a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f57235i;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21308d() {
        int i = this.f57232d;
        return 200 <= i && i < 300;
    }

    /* JADX INFO: renamed from: g */
    public final Builder m21309g() {
        Builder builder = new Builder();
        builder.f57243a = this.f57229a;
        builder.f57244b = this.f57230b;
        builder.f57245c = this.f57232d;
        builder.f57246d = this.f57231c;
        builder.f57247e = this.f57233f;
        builder.f57248f = this.f57234g.m21242f();
        builder.f57249g = this.f57235i;
        builder.f57250h = this.f57236j;
        builder.f57251i = this.f57237n;
        builder.f57252j = this.f57238o;
        builder.f57253k = this.f57239p;
        builder.f57254l = this.f57240q;
        builder.f57255m = this.f57241r;
        return builder;
    }

    public final String toString() {
        return "Response{protocol=" + this.f57230b + ", code=" + this.f57232d + ", message=" + this.f57231c + ", url=" + this.f57229a.f57210a + '}';
    }
}
