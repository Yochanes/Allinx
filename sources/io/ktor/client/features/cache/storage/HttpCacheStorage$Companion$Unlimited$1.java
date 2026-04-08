package io.ktor.client.features.cache.storage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lio/ktor/client/features/cache/storage/UnlimitedCacheStorage;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class HttpCacheStorage$Companion$Unlimited$1 extends Lambda implements Function0<UnlimitedCacheStorage> {

    /* JADX INFO: renamed from: a */
    public static final HttpCacheStorage$Companion$Unlimited$1 f45347a = new HttpCacheStorage$Companion$Unlimited$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new UnlimitedCacheStorage();
    }
}
