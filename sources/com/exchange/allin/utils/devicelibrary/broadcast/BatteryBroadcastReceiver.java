package com.exchange.allin.utils.devicelibrary.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.exchange.allin.utils.devicelibrary.utils.OtherUtils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class BatteryBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            intent.getIntExtra("status", 1);
            intent.getIntExtra("health", 1);
            intent.getIntExtra("plugged", 0);
            intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
            intent.getIntExtra("temperature", 0);
            int i = OtherUtils.f41620a;
            throw new NullPointerException("reflect failed.");
        }
    }
}
