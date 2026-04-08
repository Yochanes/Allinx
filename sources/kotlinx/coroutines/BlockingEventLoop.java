package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class BlockingEventLoop extends EventLoopImplBase {

    /* JADX INFO: renamed from: o */
    public final Thread f55258o;

    public BlockingEventLoop(Thread thread) {
        this.f55258o = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* JADX INFO: renamed from: f1, reason: from getter */
    public final Thread getF55258o() {
        return this.f55258o;
    }
}
