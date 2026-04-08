package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class EventLoopImplPlatform extends EventLoop {
    /* JADX INFO: renamed from: f1 */
    public abstract Thread getF55258o();

    /* JADX INFO: renamed from: g1 */
    public void mo20568g1(long j, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.f55287o.m20588l1(j, delayedTask);
    }
}
