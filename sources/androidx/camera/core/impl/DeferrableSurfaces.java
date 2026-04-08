package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class DeferrableSurfaces {

    /* JADX INFO: renamed from: androidx.camera.core.impl.DeferrableSurfaces$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02711 implements FutureCallback<List<Surface>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f2705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScheduledFuture f2706b;

        public C02711(CallbackToFutureAdapter.Completer completer, ScheduledFuture scheduledFuture) {
            this.f2705a = completer;
            this.f2706b = scheduledFuture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            this.f2705a.m6742b(Collections.unmodifiableList(Collections.EMPTY_LIST));
            this.f2706b.cancel(true);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            this.f2705a.m6742b(new ArrayList((List) obj));
            this.f2706b.cancel(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1482a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((DeferrableSurface) it.next()).m1478b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1483b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((DeferrableSurface) list.get(i)).m1480d();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((DeferrableSurface) list.get(i2)).m1478b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    /* JADX INFO: renamed from: c */
    public static ListenableFuture m1484c(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.m1631h(((DeferrableSurface) it.next()).m1479c()));
        }
        return CallbackToFutureAdapter.m6740a(new C0278d(arrayList, scheduledExecutorService, executor));
    }
}
