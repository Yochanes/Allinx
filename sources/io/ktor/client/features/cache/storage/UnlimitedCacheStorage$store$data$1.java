package io.ktor.client.features.cache.storage;

import io.ktor.client.features.cache.HttpCacheEntry;
import io.ktor.util.collections.ConcurrentSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/client/features/cache/HttpCacheEntry;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class UnlimitedCacheStorage$store$data$1 extends Lambda implements Function0<Set<HttpCacheEntry>> {

    /* JADX INFO: renamed from: a */
    public static final UnlimitedCacheStorage$store$data$1 f45354a = new UnlimitedCacheStorage$store$data$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ConcurrentSet();
    }
}
