package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class SemaphoreSegment extends Segment<SemaphoreSegment> {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f56576f;

    public SemaphoreSegment(long j, SemaphoreSegment semaphoreSegment, int i) {
        super(j, semaphoreSegment, i);
        this.f56576f = new AtomicReferenceArray(SemaphoreKt.f56573f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* JADX INFO: renamed from: g */
    public final int mo20713g() {
        return SemaphoreKt.f56573f;
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* JADX INFO: renamed from: h */
    public final void mo20714h(int i, CoroutineContext coroutineContext) {
        this.f56576f.set(i, SemaphoreKt.f56572e);
        m20849i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f56355c + ", hashCode=" + hashCode() + ']';
    }
}
