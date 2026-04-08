package com.engagelab.privates.common.component;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTCommonService extends Service {
    private static final String TAG = "MTCommonService";

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return MTMessenger.getInstance().getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        MTCommonLog.m13012i(TAG, "onService create");
        MTMessenger.getInstance().initOnRemoteProcess(getApplicationContext());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        MTCommonLog.m13012i(TAG, "onService destroy");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
