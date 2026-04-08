package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R\u0017\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "_cur", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class LockFreeTaskQueue<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56341a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new LockFreeTaskQueueCore(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m20834a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56341a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iM20838a = lockFreeTaskQueueCore.m20838a(runnable);
            if (iM20838a == 0) {
                return true;
            }
            if (iM20838a == 1) {
                LockFreeTaskQueueCore lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore.m20840c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreM20840c) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (iM20838a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20835b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56341a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.m20839b()) {
                return;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore.m20840c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreM20840c) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m20836c() {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) f56341a.get(this);
        lockFreeTaskQueueCore.getClass();
        long j = LockFreeTaskQueueCore.f56343f.get(lockFreeTaskQueueCore);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m20837d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56341a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            Object objM20841d = lockFreeTaskQueueCore.m20841d();
            if (objM20841d != LockFreeTaskQueueCore.f56344g) {
                return objM20841d;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore.m20840c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreM20840c) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
