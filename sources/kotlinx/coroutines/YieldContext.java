package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/YieldContext;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class YieldContext extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: c */
    public static final Key f55375c = new Key();

    /* JADX INFO: renamed from: b */
    public boolean f55376b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/YieldContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/YieldContext;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<YieldContext> {
    }
}
