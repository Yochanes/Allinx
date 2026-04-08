package com.engagelab.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTHandler {
    private static final int DEFAULT_RELEASE_INTERVAL = 300000;
    private static final String TAG = "MTHandler";
    private static volatile MTHandler instance;
    private final ConcurrentHashMap<String, CommonHandlerThread> handlerThreadMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, CommonHandler> handlerMap = new ConcurrentHashMap<>();

    public static MTHandler getInstance() {
        if (instance == null) {
            synchronized (MTHandler.class) {
                instance = new MTHandler();
            }
        }
        return instance;
    }

    public CommonHandler buildHandler(Context context, String str) {
        return buildHandler(context, str, DEFAULT_RELEASE_INTERVAL);
    }

    public void postMessageDelayed(Context context, String str, Runnable runnable, long j) {
        try {
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.postDelayed(runnable, j);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("sendMessageDelayed failed "), th);
        }
    }

    public void releaseHandler(Context context, String str) {
        try {
            if (this.handlerMap.containsKey(str)) {
                CommonHandler commonHandler = this.handlerMap.get(str);
                if (commonHandler != null) {
                    MTCommonLog.m13010d(TAG, "releaseHandler:" + str);
                    commonHandler.removeCallbacksAndMessages(null);
                }
                this.handlerMap.remove(str);
            }
            if (this.handlerThreadMap.containsKey(str)) {
                CommonHandlerThread commonHandlerThread = this.handlerThreadMap.get(str);
                if (commonHandlerThread != null) {
                    commonHandlerThread.quit();
                }
                this.handlerThreadMap.remove(str);
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("releaseHandler failed "), th);
        }
    }

    public void removeMessages(Context context, String str, int i) {
        try {
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.removeMessages(i);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("removeMessages failed "), th);
        }
    }

    public void sendMessage(Context context, String str, int i, Bundle bundle) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 0;
            messageObtain.obj = str;
            messageObtain.what = i;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.sendMessage(messageObtain);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("sendMessage failed "), th);
        }
    }

    public void sendMessageDelayed(Context context, String str, int i, Bundle bundle, long j) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 1;
            messageObtain.obj = str;
            messageObtain.what = i;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.sendMessageDelayed(messageObtain, j);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("sendMessageDelayed failed "), th);
        }
    }

    public synchronized CommonHandler buildHandler(Context context, String str, int i) {
        CommonHandler commonHandler;
        try {
            CommonHandlerThread commonHandlerThread = this.handlerThreadMap.get(str);
            if (commonHandlerThread == null) {
                commonHandlerThread = new CommonHandlerThread(str);
                this.handlerThreadMap.put(str, commonHandlerThread);
            }
            if (commonHandlerThread.getState() == Thread.State.NEW) {
                commonHandlerThread.start();
            }
            commonHandler = this.handlerMap.get(str);
            if (commonHandlerThread.getState() == Thread.State.TERMINATED) {
                if (commonHandler != null) {
                    commonHandler.removeCallbacksAndMessages(null);
                }
                commonHandlerThread = new CommonHandlerThread(str);
                commonHandlerThread.start();
                this.handlerThreadMap.put(str, commonHandlerThread);
                commonHandler = new CommonHandler(commonHandlerThread.getLooper(), context, i);
                this.handlerMap.put(str, commonHandler);
                MTCommonLog.m13010d(TAG, "buildHandler：" + str);
            }
            if (commonHandler == null) {
                commonHandler = new CommonHandler(commonHandlerThread.getLooper(), context, i);
                this.handlerMap.put(str, commonHandler);
                MTCommonLog.m13010d(TAG, "buildHandler：" + str);
            }
        } catch (Throwable th) {
            try {
                MTCommonLog.m13013w(TAG, "buildHandler failed " + th.getMessage());
                return null;
            } finally {
            }
        }
        return commonHandler;
    }
}
