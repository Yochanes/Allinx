package com.engagelab.privates.common.binder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.engagelab.privates.common.observer.MTObservable;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MainMessengerHandler extends Handler {
    private static final String TAG = "MainMessengerHandler";
    private final Context context;

    public MainMessengerHandler(Context context, Looper looper) {
        super(looper);
        this.context = context;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            MTObservable.getInstance().dispatchMessage(this.context, message.what, message.getData());
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("handleMessage failed "), th);
        }
    }
}
