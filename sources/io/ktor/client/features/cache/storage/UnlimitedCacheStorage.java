package io.ktor.client.features.cache.storage;

import io.ktor.client.features.cache.HttpCacheEntry;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/cache/storage/UnlimitedCacheStorage;", "Lio/ktor/client/features/cache/storage/HttpCacheStorage;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class UnlimitedCacheStorage extends HttpCacheStorage {

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f45352b = new ConcurrentMap(null, 0, 3);

    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: a */
    public final HttpCacheEntry mo16906a(Url url, Map map) {
        Object next;
        Intrinsics.m18599g(url, "url");
        Iterator it = ((Set) this.f45352b.m17187c(url, UnlimitedCacheStorage$find$data$1.f45353a)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.m18594b(((HttpCacheEntry) next).f45337c, map)) {
                break;
            }
        }
        return (HttpCacheEntry) next;
    }

    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: b */
    public final Set mo16907b(Url url) {
        Intrinsics.m18599g(url, "url");
        Set set = (Set) this.f45352b.get(url);
        return set != null ? set : EmptySet.f51498a;
    }

    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: c */
    public final void mo16908c(Url url, HttpCacheEntry value) {
        Intrinsics.m18599g(url, "url");
        Intrinsics.m18599g(value, "value");
        Set set = (Set) this.f45352b.m17187c(url, UnlimitedCacheStorage$store$data$1.f45354a);
        if (set.add(value)) {
            return;
        }
        set.remove(value);
        set.add(value);
    }
}
