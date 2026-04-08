package io.ktor.client.features.cache.storage;

import io.ktor.client.features.cache.HttpCacheEntry;
import io.ktor.http.Url;
import io.ktor.util.KtorExperimentalAPI;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KtorExperimentalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/features/cache/storage/HttpCacheStorage;", "", "Companion", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class HttpCacheStorage {

    /* JADX INFO: renamed from: a */
    public static final Function0 f45346a = null;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/cache/storage/HttpCacheStorage$Companion;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Function0 m16909a() {
            Function0 function0 = HttpCacheStorage.f45346a;
            return HttpCacheStorage$Companion$Unlimited$1.f45347a;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract HttpCacheEntry mo16906a(Url url, Map map);

    /* JADX INFO: renamed from: b */
    public abstract Set mo16907b(Url url);

    /* JADX INFO: renamed from: c */
    public abstract void mo16908c(Url url, HttpCacheEntry httpCacheEntry);
}
