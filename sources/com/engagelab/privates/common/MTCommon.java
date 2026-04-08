package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.business.lifecycle.MTLifecycleBusiness;
import com.engagelab.privates.common.business.network.MTNetworkBusiness;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.observer.MTObserver;
import com.google.android.gms.stats.CodePackage;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTCommon extends MTObserver {
    public static final String THREAD_COMMON = MTCommonConstants.getLogTag() + CodePackage.COMMON;

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        MTCommonPrivatesApi.sendMessage(context, THREAD_COMMON, i, bundle);
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{THREAD_COMMON};
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleDelayMessage(Context context, int i, Bundle bundle) {
        if (i != 1000) {
            return;
        }
        MTMessenger.getInstance().initOnMainProcess(context);
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        if (i == 1000) {
            MTMessenger.getInstance().initOnMainProcess(context);
            return;
        }
        if (i == 1013) {
            MTLifecycleBusiness.getInstance().onActivityResumed(context, bundle);
            return;
        }
        if (i == 1007) {
            MTNetworkBusiness.getInstance().onMainNetworkState(context, bundle);
            return;
        }
        if (i == 1008) {
            MTLifecycleBusiness.getInstance().onMainLifecycleState(context, bundle);
            return;
        }
        switch (i) {
            case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
            case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                MTLifecycleBusiness.getInstance().onRemoteLifecycleState(context, bundle);
                break;
            case MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
            case MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                MTNetworkBusiness.getInstance().onRemoteNetworkState(context, bundle);
                break;
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        if (i == 1000 || i == 1013 || i == 1007 || i == 1008) {
            return true;
        }
        switch (i) {
            case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
            case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
            case MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
            case MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                return true;
            default:
                return false;
        }
    }
}
