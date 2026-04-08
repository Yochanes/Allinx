package com.engagelab.privates.common.business.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
public class MTNetworkListener extends ConnectivityManager.NetworkCallback {
    private static final String TAG = "MTNetworkListener";
    private final Context context;

    public MTNetworkListener(Context context) {
        this.context = context;
    }

    private void onNetworkState(boolean z2, Network network) {
        try {
            MTCommonLog.m13010d(TAG, "onNetworkState state:" + z2 + ",network:" + network.toString());
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            Bundle bundle = new Bundle();
            bundle.putBoolean("state", z2);
            bundle.putParcelable("networkInfo", activeNetworkInfo);
            MTCommonPrivatesApi.sendMessageToMainProcess(this.context.getApplicationContext(), MTCommonConstants.MainWhat.ON_NETWORK_CHANGED, bundle);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("onNetworkState failed "), th);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        onNetworkState(true, network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        onNetworkState(false, network);
    }
}
