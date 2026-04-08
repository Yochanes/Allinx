package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class JobNode extends LockFreeLinkedListNode implements DisposableHandle, Incomplete {

    /* JADX INFO: renamed from: d */
    public JobSupport f55327d;

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        JobSupport jobSupportM20605j = m20605j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f55328a;
            Object obj = atomicReferenceFieldUpdater.get(jobSupportM20605j);
            if (!(obj instanceof JobNode)) {
                if (!(obj instanceof Incomplete) || ((Incomplete) obj).getF55338a() == null) {
                    return;
                }
                m20833i();
                return;
            }
            if (obj != this) {
                return;
            }
            Empty empty = JobSupportKt.f55354g;
            while (!atomicReferenceFieldUpdater.compareAndSet(jobSupportM20605j, obj, empty)) {
                if (atomicReferenceFieldUpdater.get(jobSupportM20605j) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: getList */
    public final NodeList getF55338a() {
        return null;
    }

    public Job getParent() {
        return m20605j();
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: isActive */
    public final boolean getF55299a() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final JobSupport m20605j() {
        JobSupport jobSupport = this.f55327d;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.m18606n("job");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo20497k();

    /* JADX INFO: renamed from: l */
    public abstract void mo20498l(Throwable th);

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.m20565a(this) + "[job@" + DebugStringsKt.m20565a(m20605j()) + ']';
    }
}
