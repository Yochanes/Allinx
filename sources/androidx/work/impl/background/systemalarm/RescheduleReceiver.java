package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f32852a = Logger.m12101g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.m12100e().mo12102a(f32852a, "Received intent " + intent);
        try {
            WorkManagerImpl workManagerImplM12147a = WorkManagerImpl.m12147a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            workManagerImplM12147a.getClass();
            synchronized (WorkManagerImpl.f32727m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = workManagerImplM12147a.f32736i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    workManagerImplM12147a.f32736i = pendingResultGoAsync;
                    if (workManagerImplM12147a.f32735h) {
                        pendingResultGoAsync.finish();
                        workManagerImplM12147a.f32736i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            Logger.m12100e().mo12105d(f32852a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
