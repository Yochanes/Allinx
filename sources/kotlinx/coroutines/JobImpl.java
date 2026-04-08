package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public class JobImpl extends JobSupport implements CompletableJob {

    /* JADX INFO: renamed from: c */
    public final boolean f55326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobImpl(Job job) {
        super(true);
        boolean z2 = true;
        m20626i0(job);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f55329b;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        ChildHandleNode childHandleNode = childHandle instanceof ChildHandleNode ? (ChildHandleNode) childHandle : null;
        if (childHandleNode == null) {
            z2 = false;
            break;
        }
        JobSupport jobSupportM20605j = childHandleNode.m20605j();
        while (!jobSupportM20605j.getF55326c()) {
            ChildHandle childHandle2 = (ChildHandle) atomicReferenceFieldUpdater.get(jobSupportM20605j);
            ChildHandleNode childHandleNode2 = childHandle2 instanceof ChildHandleNode ? (ChildHandleNode) childHandle2 : null;
            if (childHandleNode2 == null) {
                z2 = false;
                break;
            }
            jobSupportM20605j = childHandleNode2.m20605j();
        }
        this.f55326c = z2;
    }

    @Override // kotlinx.coroutines.CompletableJob
    /* JADX INFO: renamed from: a */
    public final boolean mo20549a() {
        return m20629m0(Unit.f51459a);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final boolean getF55326c() {
        return this.f55326c;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: c0 */
    public final boolean mo20597c0() {
        return true;
    }

    @Override // kotlinx.coroutines.CompletableJob
    /* JADX INFO: renamed from: d */
    public final boolean mo20550d(Throwable th) {
        return m20629m0(new CompletedExceptionally(false, th));
    }
}
