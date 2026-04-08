package androidx.camera.core.impl;

import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007I.RunnableC0015a;

/* JADX INFO: renamed from: androidx.camera.core.impl.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0278d implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f2830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f2831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Executor f2832c;

    public /* synthetic */ C0278d(ArrayList arrayList, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f2830a = arrayList;
        this.f2831b = scheduledExecutorService;
        this.f2832c = executor;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        ListenableFuture listenableFutureM1633j = Futures.m1633j(this.f2830a);
        Executor executor = this.f2832c;
        ScheduledFuture<?> scheduledFutureSchedule = this.f2831b.schedule(new RunnableC0280f(executor, 1, listenableFutureM1633j, completer), 5000L, TimeUnit.MILLISECONDS);
        completer.m6741a(new RunnableC0015a(listenableFutureM1633j, 3), executor);
        Futures.m1624a(listenableFutureM1633j, new DeferrableSurfaces.C02711(completer, scheduledFutureSchedule), executor);
        return "surfaceList";
    }
}
