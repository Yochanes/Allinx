package androidx.media3.exoplayer.video;

import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1937e implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HandlerWrapper f27997a;

    public /* synthetic */ ExecutorC1937e(HandlerWrapper handlerWrapper) {
        this.f27997a = handlerWrapper;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27997a.mo9489e(runnable);
    }
}
