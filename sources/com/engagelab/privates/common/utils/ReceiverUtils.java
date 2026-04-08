package com.engagelab.privates.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import io.intercom.android.sdk.utilities.AbstractC5852a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ReceiverUtils {
    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return Build.VERSION.SDK_INT >= 33 ? AbstractC5852a.m16775i(context.getApplicationContext(), broadcastReceiver, intentFilter, str, handler) : context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC5852a.m16774h(context.getApplicationContext(), broadcastReceiver, intentFilter);
        }
        return context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter);
    }
}
