package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class EventLoop extends CoroutineDispatcher {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f55300g = 0;

    /* JADX INFO: renamed from: c */
    public long f55301c;

    /* JADX INFO: renamed from: d */
    public boolean f55302d;

    /* JADX INFO: renamed from: f */
    public ArrayDeque f55303f;

    /* JADX INFO: renamed from: a1 */
    public final void m20580a1(boolean z2) {
        long j = this.f55301c - (z2 ? 4294967296L : 1L);
        this.f55301c = j;
        if (j <= 0 && this.f55302d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m20581b1(DispatchedTask dispatchedTask) {
        ArrayDeque arrayDeque = this.f55303f;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.f55303f = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m20582c1(boolean z2) {
        this.f55301c = (z2 ? 4294967296L : 1L) + this.f55301c;
        if (z2) {
            return;
        }
        this.f55302d = true;
    }

    /* JADX INFO: renamed from: d1 */
    public long mo20583d1() {
        return !m20584e1() ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m20584e1() {
        ArrayDeque arrayDeque = this.f55303f;
        if (arrayDeque == null) {
            return false;
        }
        DispatchedTask dispatchedTask = (DispatchedTask) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
        if (dispatchedTask == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public void shutdown() {
    }
}
