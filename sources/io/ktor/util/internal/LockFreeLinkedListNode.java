package io.ktor.util.internal;

import io.ktor.util.InternalAPI;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", "", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46608a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46609b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46610c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "PrepareOp", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    @InternalAPI
    public static abstract class AbstractAtomicDesc extends AtomicDesc {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class PrepareOp extends OpDescriptor {
            @Override // io.ktor.util.internal.OpDescriptor
            /* JADX INFO: renamed from: a */
            public final Object mo17201a(LockFreeLinkedListNode lockFreeLinkedListNode) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        private volatile /* synthetic */ Object _affectedNode;

        static {
            AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        private volatile /* synthetic */ Object _affectedNode;
        private volatile /* synthetic */ Object _originalNext;

        static {
            AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");
            AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m17206a() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo17201a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final LockFreeLinkedListNode m17207c() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM17205a;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).f46611a;
            }
            if (obj == this) {
                lockFreeLinkedListNodeM17205a = this;
                while (!(lockFreeLinkedListNodeM17205a instanceof LockFreeLinkedListHead)) {
                    lockFreeLinkedListNodeM17205a = LockFreeLinkedListKt.m17205a(lockFreeLinkedListNodeM17205a.m17206a());
                    if (lockFreeLinkedListNodeM17205a == this) {
                        throw new IllegalStateException("Cannot loop to this while looking for list head");
                    }
                }
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                }
                lockFreeLinkedListNodeM17205a = (LockFreeLinkedListNode) obj;
            }
            Removed removed = (Removed) lockFreeLinkedListNodeM17205a._removedRef;
            if (removed == null) {
                removed = new Removed(lockFreeLinkedListNodeM17205a);
                f46610c.lazySet(lockFreeLinkedListNodeM17205a, removed);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46609b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return (LockFreeLinkedListNode) obj;
        }
    }

    public void dispose() {
        mo17204g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r0.m17207c();
        r7 = io.ktor.util.internal.LockFreeLinkedListNode.f46608a;
        r6 = ((io.ktor.util.internal.Removed) r6).f46611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r7.compareAndSet(r5, r0, r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r7.get(r5) == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
    
        r8.m17207c();
        r1 = io.ktor.util.internal.LockFreeLinkedListNode.f46608a;
        r0 = ((io.ktor.util.internal.Removed) r0).f46611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r1.compareAndSet(r9, r8, r0) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        if (r1.get(r9) == r8) goto L140;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17204g() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM17205a;
        while (true) {
            Object objM17206a = m17206a();
            if ((objM17206a instanceof Removed) || objM17206a == this) {
                return false;
            }
            if (objM17206a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) objM17206a;
            Removed removed = (Removed) lockFreeLinkedListNode._removedRef;
            if (removed == null) {
                removed = new Removed(lockFreeLinkedListNode);
                f46610c.lazySet(lockFreeLinkedListNode, removed);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46608a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, objM17206a, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != objM17206a) {
                    break;
                }
            }
            LockFreeLinkedListNode lockFreeLinkedListNodeM17207c = m17207c();
            Object obj = this._next;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.internal.Removed");
            }
            LockFreeLinkedListNode lockFreeLinkedListNode2 = ((Removed) obj).f46611a;
            loop2: while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    Object objM17206a2 = lockFreeLinkedListNode2.m17206a();
                    if (!(objM17206a2 instanceof Removed)) {
                        Object objM17206a3 = lockFreeLinkedListNodeM17207c.m17206a();
                        if (!(objM17206a3 instanceof Removed)) {
                            if (objM17206a3 == this) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46608a;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeM17207c, this, lockFreeLinkedListNode2)) {
                                    if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeM17207c) != this) {
                                        break;
                                    }
                                }
                                break loop2;
                            }
                            if (objM17206a3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                            }
                            LockFreeLinkedListNode lockFreeLinkedListNode4 = (LockFreeLinkedListNode) objM17206a3;
                            if (lockFreeLinkedListNode4 == lockFreeLinkedListNode2) {
                                break loop2;
                            }
                            lockFreeLinkedListNode3 = lockFreeLinkedListNodeM17207c;
                            lockFreeLinkedListNodeM17207c = lockFreeLinkedListNode4;
                        } else {
                            if (lockFreeLinkedListNode3 != null) {
                                break;
                            }
                            lockFreeLinkedListNodeM17207c = LockFreeLinkedListKt.m17205a(lockFreeLinkedListNodeM17207c._prev);
                        }
                    } else {
                        lockFreeLinkedListNode2.m17207c();
                        lockFreeLinkedListNode2 = ((Removed) objM17206a2).f46611a;
                    }
                }
                lockFreeLinkedListNodeM17207c = lockFreeLinkedListNode3;
            }
            LockFreeLinkedListNode lockFreeLinkedListNodeM17205a2 = LockFreeLinkedListKt.m17205a(this._prev);
            lockFreeLinkedListNode.getClass();
            LockFreeLinkedListNode lockFreeLinkedListNode5 = lockFreeLinkedListNodeM17205a2;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode6 = null;
                while (true) {
                    Object obj2 = lockFreeLinkedListNode5._next;
                    if (obj2 == null) {
                        return true;
                    }
                    if (obj2 instanceof OpDescriptor) {
                        ((OpDescriptor) obj2).mo17201a(lockFreeLinkedListNode5);
                    } else {
                        if (!(obj2 instanceof Removed)) {
                            Object obj3 = lockFreeLinkedListNode._prev;
                            if (obj3 instanceof Removed) {
                                return true;
                            }
                            if (obj2 != lockFreeLinkedListNode) {
                                if (obj2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                                }
                                lockFreeLinkedListNodeM17205a = (LockFreeLinkedListNode) obj2;
                                lockFreeLinkedListNode6 = lockFreeLinkedListNode5;
                            } else {
                                if (obj3 == lockFreeLinkedListNode5) {
                                    return true;
                                }
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f46609b;
                                while (true) {
                                    if (atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, obj3, lockFreeLinkedListNode5)) {
                                        if (!(lockFreeLinkedListNode5._prev instanceof Removed)) {
                                            return true;
                                        }
                                    } else if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != obj3) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            if (lockFreeLinkedListNode6 != null) {
                                break;
                            }
                            lockFreeLinkedListNodeM17205a = LockFreeLinkedListKt.m17205a(lockFreeLinkedListNode5._prev);
                        }
                        lockFreeLinkedListNode5 = lockFreeLinkedListNodeM17205a;
                    }
                }
                lockFreeLinkedListNode5 = lockFreeLinkedListNode6;
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    @PublishedApi
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {
        @Override // io.ktor.util.internal.AtomicOp
        /* JADX INFO: renamed from: b */
        public final void mo17202b(LockFreeLinkedListNode lockFreeLinkedListNode) {
        }
    }
}
