package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getF55239c() != EmptyCoroutineContext.f51581a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF55239c() {
        return EmptyCoroutineContext.f51581a;
    }
}
