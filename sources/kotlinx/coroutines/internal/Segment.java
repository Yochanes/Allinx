package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/NotCompleted;", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56354d = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f56355c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public Segment(long j, Segment segment, int i) {
        super(segment);
        this.f56355c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    /* JADX INFO: renamed from: c */
    public final boolean mo20817c() {
        return f56354d.get(this) == mo20713g() && m20816b() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20848f() {
        return f56354d.addAndGet(this, -65536) == mo20713g() && m20816b() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo20713g();

    /* JADX INFO: renamed from: h */
    public abstract void mo20714h(int i, CoroutineContext coroutineContext);

    /* JADX INFO: renamed from: i */
    public final void m20849i() {
        if (f56354d.incrementAndGet(this) == mo20713g()) {
            m20818e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m20850j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f56354d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo20713g() && m20816b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
