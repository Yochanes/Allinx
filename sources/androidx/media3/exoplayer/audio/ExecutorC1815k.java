package androidx.media3.exoplayer.audio;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1815k implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f26767a;

    public /* synthetic */ ExecutorC1815k(Handler handler) {
        this.f26767a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26767a.post(runnable);
    }
}
