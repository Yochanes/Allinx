package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56314a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56315b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ConcurrentLinkedListNode(Segment segment) {
        this._prev$volatile = segment;
    }

    /* JADX INFO: renamed from: a */
    public final void m20815a() {
        f56315b.set(this, null);
    }

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedListNode m20816b() {
        Object obj = f56314a.get(this);
        if (obj == ConcurrentLinkedListKt.f56313a) {
            return null;
        }
        return (ConcurrentLinkedListNode) obj;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo20817c();

    /* JADX INFO: renamed from: e */
    public final void m20818e() {
        ConcurrentLinkedListNode concurrentLinkedListNodeM20816b;
        if (m20816b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56315b;
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(this);
            while (concurrentLinkedListNode != null && concurrentLinkedListNode.mo20817c()) {
                concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(concurrentLinkedListNode);
            }
            ConcurrentLinkedListNode concurrentLinkedListNodeM20816b2 = m20816b();
            Intrinsics.m18596d(concurrentLinkedListNodeM20816b2);
            while (concurrentLinkedListNodeM20816b2.mo20817c() && (concurrentLinkedListNodeM20816b = concurrentLinkedListNodeM20816b2.m20816b()) != null) {
                concurrentLinkedListNodeM20816b2 = concurrentLinkedListNodeM20816b;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(concurrentLinkedListNodeM20816b2);
                ConcurrentLinkedListNode concurrentLinkedListNode2 = ((ConcurrentLinkedListNode) obj) == null ? null : concurrentLinkedListNode;
                while (!atomicReferenceFieldUpdater.compareAndSet(concurrentLinkedListNodeM20816b2, obj, concurrentLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater.get(concurrentLinkedListNodeM20816b2) != obj) {
                        break;
                    }
                }
            }
            if (concurrentLinkedListNode != null) {
                f56314a.set(concurrentLinkedListNode, concurrentLinkedListNodeM20816b2);
            }
            if (!concurrentLinkedListNodeM20816b2.mo20817c() || concurrentLinkedListNodeM20816b2.m20816b() == null) {
                if (concurrentLinkedListNode == null || !concurrentLinkedListNode.mo20817c()) {
                    return;
                }
            }
        }
    }
}
