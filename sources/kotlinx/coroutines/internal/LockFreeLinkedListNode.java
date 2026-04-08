package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001R\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002X\u0082\u0004R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "Lkotlinx/coroutines/internal/Removed;", "_removedRef", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56338a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56339b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56340c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final /* synthetic */ class C63331 extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20828a(LockFreeLinkedListNode lockFreeLinkedListNode, int i) {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM20830d = m20830d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56339b;
            if (lockFreeLinkedListNodeM20830d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lockFreeLinkedListNodeM20830d = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNodeM20830d.mo20827h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeM20830d);
                }
            }
            if (lockFreeLinkedListNodeM20830d instanceof ListClosed) {
                return (((ListClosed) lockFreeLinkedListNodeM20830d).f56337d & i) == 0 && lockFreeLinkedListNodeM20830d.m20828a(lockFreeLinkedListNode, i);
            }
            atomicReferenceFieldUpdater.set(lockFreeLinkedListNode, lockFreeLinkedListNodeM20830d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56338a;
            atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeM20830d, this, lockFreeLinkedListNode)) {
                if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeM20830d) != this) {
                    break;
                }
            }
            lockFreeLinkedListNode.m20831f(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20829c(int i) {
        m20828a(new ListClosed(i), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((kotlinx.coroutines.internal.Removed) r6).f56352a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LockFreeLinkedListNode m20830d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56339b;
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56338a;
                    Object obj = atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode) {
                                break;
                            }
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (mo20827h()) {
                        return null;
                    }
                    if (!(obj instanceof Removed)) {
                        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20831f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56339b;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (f56338a.get(this) != lockFreeLinkedListNode) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    break;
                }
            }
            if (mo20827h()) {
                lockFreeLinkedListNode.m20830d();
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: g */
    public final LockFreeLinkedListNode m20832g() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object obj = f56338a.get(this);
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        if (removed != null && (lockFreeLinkedListNode = removed.f56352a) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) obj;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo20827h() {
        return f56338a.get(this) instanceof Removed;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m20833i() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56338a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof Removed)) {
                if (obj != this) {
                    Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56340c;
                    Removed removed = (Removed) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
                    if (removed == null) {
                        removed = new Removed(lockFreeLinkedListNode2);
                        atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode2, removed);
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    lockFreeLinkedListNode2.m20830d();
                    lockFreeLinkedListNode = null;
                    break loop0;
                }
                lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                break;
            }
            lockFreeLinkedListNode = ((Removed) obj).f56352a;
            break;
        }
        return lockFreeLinkedListNode == null;
    }

    public String toString() {
        return new C63331(this, DebugStringsKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + DebugStringsKt.m20565a(this);
    }
}
