package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\t\nR\u0019\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u00038\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0002X\u0082\u0004¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Placeholder", "Companion", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LockFreeTaskQueueCore<E> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56342e = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f56343f = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final Symbol f56344g = new Symbol("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f56345a;

    /* JADX INFO: renamed from: b */
    public final boolean f56346b;

    /* JADX INFO: renamed from: c */
    public final int f56347c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f56348d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u0018"}, m18302d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Placeholder {

        /* JADX INFO: renamed from: a */
        public final int f56349a;

        public Placeholder(int i) {
            this.f56349a = i;
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z2) {
        this.f56345a = i;
        this.f56346b = z2;
        int i2 = i - 1;
        this.f56347c = i2;
        this.f56348d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m20838a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f56343f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f56347c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f56348d;
            if (!this.f56346b && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.f56345a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreM20840c = this;
                while ((atomicLongFieldUpdater.get(lockFreeTaskQueueCoreM20840c) & 1152921504606846976L) != 0) {
                    lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCoreM20840c.m20840c();
                    AtomicReferenceArray atomicReferenceArray2 = lockFreeTaskQueueCoreM20840c.f56348d;
                    int i5 = lockFreeTaskQueueCoreM20840c.f56347c & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof Placeholder) && ((Placeholder) obj).f56349a == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        lockFreeTaskQueueCoreM20840c = null;
                    }
                    if (lockFreeTaskQueueCoreM20840c == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20839b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f56343f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final LockFreeTaskQueueCore m20840c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore;
        while (true) {
            atomicLongFieldUpdater = f56343f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lockFreeTaskQueueCore = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56342e;
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore2 != null) {
                return lockFreeTaskQueueCore2;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore3 = new LockFreeTaskQueueCore(lockFreeTaskQueueCore.f56345a * 2, lockFreeTaskQueueCore.f56346b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = lockFreeTaskQueueCore.f56347c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object placeholder = lockFreeTaskQueueCore.f56348d.get(i4);
                if (placeholder == null) {
                    placeholder = new Placeholder(i);
                }
                lockFreeTaskQueueCore3.f56348d.set(lockFreeTaskQueueCore3.f56347c & i, placeholder);
                i++;
            }
            atomicLongFieldUpdater.set(lockFreeTaskQueueCore3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeTaskQueueCore3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20841d() {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreM20840c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f56343f;
            long j = atomicLongFieldUpdater.get(lockFreeTaskQueueCoreM20840c);
            if ((j & 1152921504606846976L) != 0) {
                return f56344g;
            }
            int i = (int) (j & 1073741823);
            int i2 = lockFreeTaskQueueCoreM20840c.f56347c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = lockFreeTaskQueueCoreM20840c.f56348d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z2 = lockFreeTaskQueueCoreM20840c.f56346b;
            if (obj == null) {
                if (z2) {
                    break;
                }
            } else {
                if (obj instanceof Placeholder) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCoreM20840c, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                lockFreeTaskQueueCoreM20840c = this;
                if (z2) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f56343f;
                        long j3 = atomicLongFieldUpdater2.get(lockFreeTaskQueueCoreM20840c);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCoreM20840c.m20840c();
                        } else {
                            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = lockFreeTaskQueueCoreM20840c;
                            lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore;
                            if (atomicLongFieldUpdater2.compareAndSet(lockFreeTaskQueueCore, j3, (j3 & (-1073741824)) | j2)) {
                                lockFreeTaskQueueCoreM20840c.f56348d.set(lockFreeTaskQueueCoreM20840c.f56347c & i5, null);
                                lockFreeTaskQueueCoreM20840c = null;
                            } else {
                                continue;
                            }
                        }
                        if (lockFreeTaskQueueCoreM20840c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
