package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/NoOpContinuation;", "Lkotlin/coroutines/Continuation;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class NoOpContinuation implements Continuation<Object> {

    /* JADX INFO: renamed from: a */
    public static final NoOpContinuation f56291a = new NoOpContinuation();

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF56306b() {
        return EmptyCoroutineContext.f51581a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
    }
}
