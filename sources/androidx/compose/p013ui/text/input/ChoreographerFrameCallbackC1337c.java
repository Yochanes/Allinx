package androidx.compose.p013ui.text.input;

import android.view.Choreographer;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1337c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f20443a;

    public /* synthetic */ ChoreographerFrameCallbackC1337c(Runnable runnable) {
        this.f20443a = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f20443a.run();
    }
}
