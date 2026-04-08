package okhttp3.internal.cache;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Companion", "Factory", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class CacheStrategy {

    /* JADX INFO: renamed from: a */
    public final Request f57287a;

    /* JADX INFO: renamed from: b */
    public final Response f57288b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m21347a(Request request, Response response) {
            Intrinsics.m18599g(response, "response");
            Intrinsics.m18599g(request, "request");
            int i = response.f57232d;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i == 307) {
                    if (Response.m21306b(HttpHeaders.EXPIRES, response) == null && response.m21307a().f57017c == -1 && !response.m21307a().f57020f && !response.m21307a().f57019e) {
                        return false;
                    }
                } else if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.m21307a().f57016b || request.m21294a().f57016b) ? false : true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Factory {

        /* JADX INFO: renamed from: a */
        public Date f57289a;

        /* JADX INFO: renamed from: b */
        public String f57290b;

        /* JADX INFO: renamed from: c */
        public Date f57291c;

        /* JADX INFO: renamed from: d */
        public String f57292d;

        /* JADX INFO: renamed from: e */
        public Date f57293e;

        /* JADX INFO: renamed from: f */
        public long f57294f;

        /* JADX INFO: renamed from: g */
        public long f57295g;

        /* JADX INFO: renamed from: h */
        public String f57296h;

        /* JADX INFO: renamed from: i */
        public int f57297i;
    }

    public CacheStrategy(Request request, Response response) {
        this.f57287a = request;
        this.f57288b = response;
    }
}
