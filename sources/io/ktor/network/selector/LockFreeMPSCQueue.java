package io.ktor.network.selector;

import io.ktor.util.InternalAPI;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueue;", "", "E", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class LockFreeMPSCQueue<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45983a = AtomicReferenceFieldUpdater.newUpdater(LockFreeMPSCQueue.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new LockFreeMPSCQueueCore(8);

    /* JADX INFO: renamed from: a */
    public final boolean m17076a(Selectable element) {
        Intrinsics.m18599g(element, "element");
        while (true) {
            LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (LockFreeMPSCQueueCore) this._cur;
            int iM17080a = lockFreeMPSCQueueCore.m17080a(element);
            if (iM17080a == 0) {
                return true;
            }
            if (iM17080a == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45983a;
                LockFreeMPSCQueueCore lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCore.m17083d();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCoreM17083d) && atomicReferenceFieldUpdater.get(this) == lockFreeMPSCQueueCore) {
                }
            } else if (iM17080a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17077b() {
        while (true) {
            LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (LockFreeMPSCQueueCore) this._cur;
            if (lockFreeMPSCQueueCore.m17081b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45983a;
            LockFreeMPSCQueueCore lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCore.m17083d();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCoreM17083d) && atomicReferenceFieldUpdater.get(this) == lockFreeMPSCQueueCore) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17078c() {
        return ((LockFreeMPSCQueueCore) this._cur).m17082c();
    }

    /* JADX INFO: renamed from: d */
    public final Object m17079d() {
        while (true) {
            LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (LockFreeMPSCQueueCore) this._cur;
            Object objM17084e = lockFreeMPSCQueueCore.m17084e();
            if (objM17084e != LockFreeMPSCQueueCore.f45986f) {
                return objM17084e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45983a;
            LockFreeMPSCQueueCore lockFreeMPSCQueueCoreM17083d = lockFreeMPSCQueueCore.m17083d();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCoreM17083d) && atomicReferenceFieldUpdater.get(this) == lockFreeMPSCQueueCore) {
            }
        }
    }
}
