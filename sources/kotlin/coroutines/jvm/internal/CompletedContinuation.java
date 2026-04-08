package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/CompletedContinuation;", "Lkotlin/coroutines/Continuation;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class CompletedContinuation implements Continuation<Object> {

    /* JADX INFO: renamed from: a */
    public static final CompletedContinuation f51601a = new CompletedContinuation();

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF55239c() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
