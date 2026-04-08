package io.ktor.client.features.cache.storage;

import io.ktor.client.features.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/cache/storage/DisabledCacheStorage;", "Lio/ktor/client/features/cache/storage/HttpCacheStorage;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DisabledCacheStorage extends HttpCacheStorage {
    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: a */
    public final HttpCacheEntry mo16906a(Url url, Map map) {
        Intrinsics.m18599g(url, "url");
        return null;
    }

    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: b */
    public final Set mo16907b(Url url) {
        Intrinsics.m18599g(url, "url");
        return EmptySet.f51498a;
    }

    @Override // io.ktor.client.features.cache.storage.HttpCacheStorage
    /* JADX INFO: renamed from: c */
    public final void mo16908c(Url url, HttpCacheEntry value) {
        Intrinsics.m18599g(url, "url");
        Intrinsics.m18599g(value, "value");
    }
}
