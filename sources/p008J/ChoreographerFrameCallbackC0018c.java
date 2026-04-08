package p008J;

import android.view.Choreographer;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: renamed from: J.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0018c implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = HandlerDispatcherKt.f55385a;
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f56350a;
        throw null;
    }
}
