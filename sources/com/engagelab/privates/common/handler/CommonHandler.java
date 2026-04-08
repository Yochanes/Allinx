package com.engagelab.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.engagelab.privates.common.observer.MTObservable;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CommonHandler extends Handler {
    private static final String TAG = "CommonHandler";
    private static final int WHAT_RELEASE = -1000;
    private final Context context;
    private final int releaseInterval;

    public CommonHandler(Looper looper, Context context, int i) {
        super(looper);
        this.context = context;
        this.releaseInterval = i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i = message.arg1;
            String strValueOf = String.valueOf(message.obj);
            int i2 = message.what;
            Bundle data = message.getData();
            if (i2 == WHAT_RELEASE) {
                MTHandler.getInstance().releaseHandler(this.context, getLooper().getThread().getName());
                return;
            }
            removeMessages(WHAT_RELEASE);
            sendEmptyMessageDelayed(WHAT_RELEASE, this.releaseInterval);
            MTObservable.getInstance().handleMessage(this.context, i, strValueOf, i2, data);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("handleMessage failed "), th);
        }
    }
}
