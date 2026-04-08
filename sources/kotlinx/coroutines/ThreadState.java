package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ThreadState extends JobNode {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55363i = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: f */
    public final Thread f55364f = Thread.currentThread();

    /* JADX INFO: renamed from: g */
    public DisposableHandle f55365g;

    /* JADX INFO: renamed from: n */
    public static void m20647n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: k */
    public final boolean mo20497k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: l */
    public final void mo20498l(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f55363i;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m20647n(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f55364f.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: m */
    public final void m20648m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55363i;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m20647n(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                DisposableHandle disposableHandle = this.f55365g;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }
}
