package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.camera.core.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0244c implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ThreadFactory threadFactory = CameraExecutor.f2200c;
        Logger.m1282c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
