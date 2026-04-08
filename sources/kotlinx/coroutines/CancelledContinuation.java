package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CancelledContinuation extends CompletedExceptionally {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55267c = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public CancelledContinuation(CancellableContinuationImpl cancellableContinuationImpl, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + cancellableContinuationImpl + " was cancelled normally");
        }
        super(z2, th);
        this._resumed$volatile = 0;
    }
}
