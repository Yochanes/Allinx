package kotlinx.coroutines.scheduling;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¨\u0006\t"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class WorkQueue {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56487b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56488c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56489d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56490e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f56491a = new AtomicReferenceArray(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final Task m20890a(Task task) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56488c;
        if (atomicIntegerFieldUpdater.get(this) - f56489d.get(this) == 127) {
            return task;
        }
        if (task.f56478b) {
            f56490e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f56491a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, task);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Task m20891b() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56489d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f56488c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (task = (Task) this.f56491a.getAndSet(i2, null)) != null) {
                if (task.f56478b) {
                    f56490e.decrementAndGet(this);
                }
                return task;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Task m20892c(int i, boolean z2) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f56491a;
        Task task = (Task) atomicReferenceArray.get(i2);
        if (task != null && task.f56478b == z2) {
            while (!atomicReferenceArray.compareAndSet(i2, task, null)) {
                if (atomicReferenceArray.get(i2) != task) {
                }
            }
            if (z2) {
                f56490e.decrementAndGet(this);
            }
            return task;
        }
        return null;
    }
}
