package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "", "E", "Companion", "Placeholder", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
final class LockFreeMPSCQueueCore<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a */
    public final int f45987a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceArray f45988b;

    /* JADX INFO: renamed from: c */
    public final int f45989c;

    /* JADX INFO: renamed from: f */
    public static final LockFreeMPSCQueueCore$Companion$REMOVE_FROZEN$1 f45986f = new LockFreeMPSCQueueCore$Companion$REMOVE_FROZEN$1();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45984d = AtomicReferenceFieldUpdater.newUpdater(LockFreeMPSCQueueCore.class, Object.class, "_next");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f45985e = AtomicLongFieldUpdater.newUpdater(LockFreeMPSCQueueCore.class, "_state");

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, m18302d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Companion;", "", "", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "REMOVE_FROZEN", "Ljava/lang/Object;", "TAIL_MASK", "TAIL_SHIFT", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Placeholder;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Placeholder {

        /* JADX INFO: renamed from: a */
        public final int f45990a;

        public Placeholder(int i) {
            this.f45990a = i;
        }
    }

    public LockFreeMPSCQueueCore(int i) {
        this.f45989c = i;
        int i2 = i - 1;
        this.f45987a = i2;
        this.f45988b = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17080a(Selectable element) {
        long j;
        int i;
        Intrinsics.m18599g(element, "element");
        do {
            j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            i = (int) ((1152921503533105152L & j) >> 30);
            int i2 = this.f45987a;
            if (((i + 2) & i2) == (((int) (1073741823 & j)) & i2)) {
                return 1;
            }
        } while (!f45985e.compareAndSet(this, j, (((long) ((i + 1) & 1073741823)) << 30) | ((-1152921503533105153L) & j)));
        this.f45988b.set(this.f45987a & i, element);
        LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCoreM17083d = this;
        while ((lockFreeMPSCQueueCoreM17083d._state & 1152921504606846976L) != 0) {
            lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCoreM17083d.m17083d();
            AtomicReferenceArray atomicReferenceArray = lockFreeMPSCQueueCoreM17083d.f45988b;
            int i3 = lockFreeMPSCQueueCoreM17083d.f45987a & i;
            Object obj = atomicReferenceArray.get(i3);
            if ((obj instanceof Placeholder) && ((Placeholder) obj).f45990a == i) {
                atomicReferenceArray.set(i3, element);
            } else {
                lockFreeMPSCQueueCoreM17083d = null;
            }
            if (lockFreeMPSCQueueCoreM17083d == null) {
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17081b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f45985e.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17082c() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final LockFreeMPSCQueueCore m17083d() {
        long j;
        LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                lockFreeMPSCQueueCore = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            lockFreeMPSCQueueCore = this;
            if (f45985e.compareAndSet(lockFreeMPSCQueueCore, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            LockFreeMPSCQueueCore lockFreeMPSCQueueCore2 = (LockFreeMPSCQueueCore) lockFreeMPSCQueueCore._next;
            if (lockFreeMPSCQueueCore2 != null) {
                return lockFreeMPSCQueueCore2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45984d;
            LockFreeMPSCQueueCore lockFreeMPSCQueueCore3 = new LockFreeMPSCQueueCore(lockFreeMPSCQueueCore.f45989c * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = lockFreeMPSCQueueCore.f45987a;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = lockFreeMPSCQueueCore3.f45988b;
                int i5 = lockFreeMPSCQueueCore3.f45987a & i;
                Object placeholder = lockFreeMPSCQueueCore.f45988b.get(i4);
                if (placeholder == null) {
                    placeholder = new Placeholder(i);
                }
                atomicReferenceArray.set(i5, placeholder);
                i++;
            }
            lockFreeMPSCQueueCore3._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeMPSCQueueCore3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m17084e() {
        Object obj;
        long j = this._state;
        if ((j & 1152921504606846976L) != 0) {
            return f45986f;
        }
        int i = (int) (j & 1073741823);
        int i2 = this.f45987a;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = this.f45988b.get(i4)) == null || (obj instanceof Placeholder)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (f45985e.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
            this.f45988b.set(this.f45987a & i, null);
            return obj;
        }
        LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCoreM17083d = this;
        while (true) {
            long j3 = lockFreeMPSCQueueCoreM17083d._state;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((j3 & 1152921504606846976L) != 0) {
                lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCoreM17083d.m17083d();
            } else {
                LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = lockFreeMPSCQueueCoreM17083d;
                if (f45985e.compareAndSet(lockFreeMPSCQueueCore, j3, (j3 & (-1073741824)) | j2)) {
                    lockFreeMPSCQueueCore.f45988b.set(lockFreeMPSCQueueCore.f45987a & i5, null);
                    lockFreeMPSCQueueCoreM17083d = null;
                } else {
                    lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCore;
                }
            }
            if (lockFreeMPSCQueueCoreM17083d == null) {
                return obj;
            }
        }
    }
}
