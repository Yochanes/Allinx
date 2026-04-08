package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f32827a = Logger.m12101g("ConstraintProxy");

    /* JADX INFO: compiled from: Proguard */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.m12100e().mo12102a(f32827a, "onReceive : " + intent);
        String str = CommandHandler.f32821g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
