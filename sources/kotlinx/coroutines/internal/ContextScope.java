package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ContextScope implements CoroutineScope {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f56316a;

    public ContextScope(CoroutineContext coroutineContext) {
        this.f56316a = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF56316a() {
        return this.f56316a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f56316a + ')';
    }
}
