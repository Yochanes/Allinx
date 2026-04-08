package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/InvokeOnCancelling;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/atomicfu/AtomicBoolean;", "_invoked", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class InvokeOnCancelling extends JobNode {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55321g = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: f */
    public final Function1 f55322f;

    public InvokeOnCancelling(Function1 function1) {
        this.f55322f = function1;
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: k */
    public final boolean mo20497k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: l */
    public final void mo20498l(Throwable th) {
        if (f55321g.compareAndSet(this, 0, 1)) {
            this.f55322f.invoke(th);
        }
    }
}
