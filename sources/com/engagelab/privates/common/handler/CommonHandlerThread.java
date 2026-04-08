package com.engagelab.privates.common.handler;

import android.os.HandlerThread;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CommonHandlerThread extends HandlerThread {
    private static final String TAG = "CommonHandlerThread";

    public CommonHandlerThread(String str) {
        super(str);
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            super.run();
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("run failed "), th);
        }
    }
}
