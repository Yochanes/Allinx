package com.engagelab.privates.common.observer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTObservable {
    private static final String TAG = "MTObservable";
    public static final int WHAT_OBSERVER = 101;
    private static volatile MTObservable instance;
    public ConcurrentLinkedQueue<MTObserver> observeQueue = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<String> observeNameQueue = new ConcurrentLinkedQueue<>();

    public static MTObservable getInstance() {
        if (instance == null) {
            synchronized (MTObservable.class) {
                instance = new MTObservable();
            }
        }
        return instance;
    }

    public void dispatchMessage(Context context, int i, Bundle bundle) {
        for (MTObserver mTObserver : this.observeQueue) {
            try {
                if (mTObserver.isSupport(i)) {
                    mTObserver.dispatchMessage(context, i, bundle);
                }
            } catch (Throwable th) {
                MTCommonLog.m13013w(TAG, "handleMessage dispatchMessage failed what=" + i);
                AbstractC2929c.m13709n(TAG, new StringBuilder("handleMessage dispatchMessage failed "), th);
            }
        }
    }

    public void handleMessage(Context context, int i, String str, int i2, Bundle bundle) {
        for (MTObserver mTObserver : this.observeQueue) {
            if (Arrays.asList(mTObserver.getThreadName()).contains(str) && mTObserver.isSupport(i2)) {
                if (i == 0) {
                    mTObserver.handleMessage(context, i2, bundle);
                }
                if (i == 1) {
                    mTObserver.handleDelayMessage(context, i2, bundle);
                }
            }
        }
    }

    public void observer(Context context, MTObserver mTObserver) {
        if (this.observeQueue.contains(mTObserver)) {
            return;
        }
        String canonicalName = mTObserver.getClass().getCanonicalName();
        if (this.observeNameQueue.contains(canonicalName)) {
            return;
        }
        MTCommonLog.m13010d(TAG, "observer " + canonicalName);
        this.observeQueue.add(mTObserver);
        this.observeNameQueue.add(canonicalName);
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Observer.KEY_OBSERVER_NAME, canonicalName);
        if (MTGlobal.isMainProcess(context)) {
            boolean lifecycleState = MTGlobal.getLifecycleState();
            String currentActivityName = MTGlobal.getCurrentActivityName();
            if (!TextUtils.isEmpty(currentActivityName)) {
                bundle.putBoolean("state", lifecycleState);
                bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, currentActivityName);
                if (mTObserver.isSupport(MTCommonConstants.MainWhat.TO_FOREGROUND) || mTObserver.isSupport(MTCommonConstants.MainWhat.TO_BACKGROUND)) {
                    mTObserver.dispatchMessage(context, MTCommonConstants.MainWhat.TO_FOREGROUND, null);
                }
            }
            boolean networkState = MTGlobal.getNetworkState();
            int networkType = MTGlobal.getNetworkType();
            String networkName = MTGlobal.getNetworkName();
            String networkRadio = MTGlobal.getNetworkRadio();
            if (!TextUtils.isEmpty(networkRadio)) {
                bundle.putBoolean("state", networkState);
                bundle.putInt("type", networkType);
                bundle.putString("name", networkName);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, networkRadio);
                int i = MTCommonConstants.MainWhat.ON_NETWORK_CONNECTED;
                if (mTObserver.isSupport(MTCommonConstants.MainWhat.ON_NETWORK_CONNECTED) || mTObserver.isSupport(MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED)) {
                    if (!networkState) {
                        i = 1004;
                    }
                    mTObserver.dispatchMessage(context, i, null);
                }
            }
        }
        MTMessenger.getInstance().sendMessageToRemoteProcess(context, WHAT_OBSERVER, bundle);
    }

    public void observerOnRemoteProcess(Context context, Bundle bundle) {
        try {
            String string = bundle.getString(MTCommonConstants.Observer.KEY_OBSERVER_NAME);
            if (this.observeNameQueue.contains(string)) {
                return;
            }
            Object objNewInstance = Class.forName(string).newInstance();
            if (objNewInstance instanceof MTObserver) {
                MTObserver mTObserver = (MTObserver) objNewInstance;
                observer(context, mTObserver);
                boolean z2 = bundle.getBoolean("state");
                String string2 = bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                if (!TextUtils.isEmpty(string2)) {
                    MTGlobal.setLifecycleState(z2);
                    MTGlobal.setCurrentActivityName(string2);
                    int i = MTCommonConstants.RemoteWhat.TO_FOREGROUND;
                    if (mTObserver.isSupport(MTCommonConstants.RemoteWhat.TO_FOREGROUND) || mTObserver.isSupport(MTCommonConstants.RemoteWhat.TO_BACKGROUND)) {
                        if (!z2) {
                            i = 1994;
                        }
                        mTObserver.dispatchMessage(context, i, null);
                    }
                }
                boolean z3 = bundle.getBoolean("state");
                int i2 = bundle.getInt("type");
                String string3 = bundle.getString("name");
                String string4 = bundle.getString(MTCommonConstants.Network.KEY_RADIO);
                if (TextUtils.isEmpty(string4)) {
                    return;
                }
                MTGlobal.setNetworkState(z3);
                MTGlobal.setNetworkType(i2);
                MTGlobal.setNetworkName(string3);
                MTGlobal.setNetworkRadio(string4);
                int i3 = MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED;
                if (mTObserver.isSupport(MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED) || mTObserver.isSupport(MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED)) {
                    if (!z2) {
                        i3 = 1996;
                    }
                    mTObserver.dispatchMessage(context, i3, null);
                }
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("observer failed "), th);
        }
    }
}
