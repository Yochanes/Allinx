package androidx.core.view;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsControllerOnControllableInsetsChangedListenerC1470f implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f23540a;

    public /* synthetic */ WindowInsetsControllerOnControllableInsetsChangedListenerC1470f(AtomicBoolean atomicBoolean) {
        this.f23540a = atomicBoolean;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f23540a.set((i & 8) != 0);
    }
}
