package okhttp3;

import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Request {

    /* JADX INFO: renamed from: a */
    public final HttpUrl f57210a;

    /* JADX INFO: renamed from: b */
    public final String f57211b;

    /* JADX INFO: renamed from: c */
    public final Headers f57212c;

    /* JADX INFO: renamed from: d */
    public final RequestBody f57213d;

    /* JADX INFO: renamed from: e */
    public final Map f57214e;

    /* JADX INFO: renamed from: f */
    public CacheControl f57215f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Request$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public HttpUrl f57216a;

        /* JADX INFO: renamed from: d */
        public RequestBody f57219d;

        /* JADX INFO: renamed from: e */
        public LinkedHashMap f57220e = new LinkedHashMap();

        /* JADX INFO: renamed from: b */
        public String f57217b = "GET";

        /* JADX INFO: renamed from: c */
        public Headers.Builder f57218c = new Headers.Builder();

        /* JADX INFO: renamed from: a */
        public final void m21296a(String str, String value) {
            Intrinsics.m18599g(value, "value");
            this.f57218c.m21245a(str, value);
        }

        /* JADX INFO: renamed from: b */
        public final Request m21297b() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f57216a;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f57217b;
            Headers headersM21249e = this.f57218c.m21249e();
            RequestBody requestBody = this.f57219d;
            LinkedHashMap linkedHashMap = this.f57220e;
            byte[] bArr = Util.f57274a;
            Intrinsics.m18599g(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = MapsKt.m18481d();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                Intrinsics.m18598f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new Request(httpUrl, str, headersM21249e, requestBody, mapUnmodifiableMap);
        }

        /* JADX INFO: renamed from: c */
        public final void m21298c(CacheControl cacheControl) {
            Intrinsics.m18599g(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.f57218c.m21251g(HttpHeaders.CACHE_CONTROL);
            } else {
                m21299d(HttpHeaders.CACHE_CONTROL, string);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m21299d(String str, String value) {
            Intrinsics.m18599g(value, "value");
            Headers.Builder builder = this.f57218c;
            builder.getClass();
            Headers.Companion.m21252a(str);
            Headers.Companion.m21253b(value, str);
            builder.m21251g(str);
            builder.m21247c(str, value);
        }

        /* JADX INFO: renamed from: e */
        public final void m21300e(String method, RequestBody requestBody) {
            Intrinsics.m18599g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(AbstractC0000a.m3D("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.m21433b(method)) {
                throw new IllegalArgumentException(AbstractC0000a.m3D("method ", method, " must not have a request body.").toString());
            }
            this.f57217b = method;
            this.f57219d = requestBody;
        }

        /* JADX INFO: renamed from: f */
        public final void m21301f(Class type, Object obj) {
            Intrinsics.m18599g(type, "type");
            if (obj == null) {
                this.f57220e.remove(type);
                return;
            }
            if (this.f57220e.isEmpty()) {
                this.f57220e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f57220e;
            Object objCast = type.cast(obj);
            Intrinsics.m18596d(objCast);
            linkedHashMap.put(type, objCast);
        }

        /* JADX INFO: renamed from: g */
        public final void m21302g(String url) {
            Intrinsics.m18599g(url, "url");
            if (StringsKt.m20416N(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (StringsKt.m20416N(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.m18598f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            this.f57216a = HttpUrl.Companion.m21276c(url);
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map map) {
        Intrinsics.m18599g(url, "url");
        Intrinsics.m18599g(method, "method");
        this.f57210a = url;
        this.f57211b = method;
        this.f57212c = headers;
        this.f57213d = requestBody;
        this.f57214e = map;
    }

    /* JADX INFO: renamed from: a */
    public final CacheControl m21294a() {
        CacheControl cacheControl = this.f57215f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.f57013n;
        CacheControl cacheControlM21186a = CacheControl.Companion.m21186a(this.f57212c);
        this.f57215f = cacheControlM21186a;
        return cacheControlM21186a;
    }

    /* JADX INFO: renamed from: b */
    public final Builder m21295b() {
        Builder builder = new Builder();
        builder.f57220e = new LinkedHashMap();
        builder.f57216a = this.f57210a;
        builder.f57217b = this.f57211b;
        builder.f57219d = this.f57213d;
        Map map = this.f57214e;
        builder.f57220e = map.isEmpty() ? new LinkedHashMap() : MapsKt.m18492o(map);
        builder.f57218c = this.f57212c.m21242f();
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f57211b);
        sb.append(", url=");
        sb.append(this.f57210a);
        Headers headers = this.f57212c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.m18455s0();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f51426a;
                String str2 = (String) pair2.f51427b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.f57214e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
