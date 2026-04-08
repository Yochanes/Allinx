package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/CookieJar;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface CookieJar {

    /* JADX INFO: renamed from: a */
    public static final CookieJar f57085a = new Companion.NoCookies();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/CookieJar$Companion;", "", "Lokhttp3/CookieJar;", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            /* JADX INFO: renamed from: a */
            public final void mo21203a(HttpUrl url, List list) {
                Intrinsics.m18599g(url, "url");
            }

            @Override // okhttp3.CookieJar
            /* JADX INFO: renamed from: b */
            public final void mo21204b(HttpUrl url) {
                Intrinsics.m18599g(url, "url");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo21203a(HttpUrl httpUrl, List list);

    /* JADX INFO: renamed from: b */
    void mo21204b(HttpUrl httpUrl);
}
