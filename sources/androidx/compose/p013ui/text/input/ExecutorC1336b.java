package androidx.compose.p013ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1336b implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Choreographer f20442a;

    public /* synthetic */ ExecutorC1336b(Choreographer choreographer) {
        this.f20442a = choreographer;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20442a.postFrameCallback(new ChoreographerFrameCallbackC1337c(runnable));
    }
}
