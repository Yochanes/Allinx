package com.engagelab.privates.common.business.network;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.ReceiverUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTNetworkBusiness {
    public static final int STATE_NETWORK_CONNECTED = 1;
    public static final int STATE_NETWORK_DISCONNECTED = 0;
    private static final String TAG = "MTNetworkBusiness";
    private static volatile MTNetworkBusiness instance;
    private MTNetworkListener networkListener;
    private int networkState = 0;
    private boolean init = false;

    public static MTNetworkBusiness getInstance() {
        if (instance == null) {
            synchronized (MTNetworkBusiness.class) {
                instance = new MTNetworkBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        if (this.init) {
            return;
        }
        this.init = true;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                try {
                    MTNetworkListener mTNetworkListener = new MTNetworkListener(context);
                    this.networkListener = mTNetworkListener;
                    connectivityManager.registerDefaultNetworkCallback(mTNetworkListener);
                    return;
                } catch (Throwable unused) {
                    NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                    MTNetworkListener mTNetworkListener2 = new MTNetworkListener(context);
                    this.networkListener = mTNetworkListener2;
                    connectivityManager.registerNetworkCallback(networkRequestBuild, mTNetworkListener2);
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            NetworkRequest networkRequestBuild2 = new NetworkRequest.Builder().build();
            MTNetworkListener mTNetworkListener3 = new MTNetworkListener(context);
            this.networkListener = mTNetworkListener3;
            connectivityManager.registerNetworkCallback(networkRequestBuild2, mTNetworkListener3);
        } catch (Throwable unused3) {
            MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            ReceiverUtils.registerReceiver(context, commonReceiver, intentFilter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public void onMainNetworkState(Context context, Bundle bundle) {
        NetworkInfo networkInfo = (NetworkInfo) bundle.getParcelable("networkInfo");
        ?? r10 = bundle.containsKey("state") ? bundle.getBoolean("state") : (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) ? 0 : 1;
        Bundle bundleOnMainNetworkState = onMainNetworkState(context, r10, networkInfo);
        int i = MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED;
        int i2 = MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED;
        if (r10 != 0 && this.networkState == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("state", false);
            bundle2.putInt("type", 0);
            bundle2.putString("name", "unknown");
            bundle2.putString(MTCommonConstants.Network.KEY_RADIO, "unknown");
            MTCommonLog.m13010d(TAG, "onMainNetworkState network is connecting, new network connected");
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED, bundle2);
            if (MTGlobal.isNeedRemoteProcess) {
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED, bundle2);
            }
        }
        StringBuilder sb = new StringBuilder("onMainNetworkState ");
        sb.append(r10 != 0 ? "connected" : "disConnected");
        sb.append(" currentNetwork:");
        sb.append(MTGlobal.getNetworkName());
        MTCommonLog.m13010d(TAG, sb.toString());
        this.networkState = r10;
        if (r10 != 0) {
            i2 = MTCommonConstants.MainWhat.ON_NETWORK_CONNECTED;
        }
        MTCommonPrivatesApi.sendMessageToMainProcess(context, i2, bundleOnMainNetworkState);
        if (MTGlobal.isNeedRemoteProcess) {
            if (r10 != 0) {
                i = MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED;
            }
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, i, bundleOnMainNetworkState);
        }
    }

    public void onRemoteNetworkState(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean z2 = bundle.getBoolean("state");
        int i = bundle.getInt("type");
        String string = bundle.getString("name");
        String string2 = bundle.getString(MTCommonConstants.Network.KEY_RADIO);
        MTGlobal.setNetworkState(z2);
        MTGlobal.setNetworkType(i);
        if (TextUtils.isEmpty(string)) {
            string = "unknown";
        }
        MTGlobal.setNetworkName(string);
        if (TextUtils.isEmpty(string2)) {
            string2 = "unknown";
        }
        MTGlobal.setNetworkRadio(string2);
        StringBuilder sb = new StringBuilder("onRemoteNetworkState ");
        sb.append(z2 ? "connected" : "disConnected");
        sb.append(" currentNetwork:");
        sb.append(MTGlobal.getNetworkName());
        MTCommonLog.m13010d(TAG, sb.toString());
    }

    public void release(Context context) {
        this.networkState = 0;
        ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this.networkListener);
    }

    public Bundle onMainNetworkState(Context context, boolean z2, NetworkInfo networkInfo) {
        Bundle bundle = new Bundle();
        if (!z2) {
            MTGlobal.setNetworkState(false);
            MTGlobal.setNetworkType(0);
            MTGlobal.setNetworkName("unknown");
            MTGlobal.setNetworkRadio("unknown");
            bundle.putBoolean("state", false);
            bundle.putInt("type", 0);
            bundle.putString("name", "unknown");
            bundle.putString(MTCommonConstants.Network.KEY_RADIO, "unknown");
            return bundle;
        }
        MTGlobal.setNetworkState(true);
        bundle.putBoolean("state", true);
        if (networkInfo.getType() == 1) {
            MTGlobal.setNetworkType(1);
            MTGlobal.setNetworkName("wifi");
            MTGlobal.setNetworkRadio("wifi");
            bundle.putInt("type", 1);
            bundle.putString("name", "wifi");
            bundle.putString(MTCommonConstants.Network.KEY_RADIO, "wifi");
            return bundle;
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                MTGlobal.setNetworkType(2);
                MTGlobal.setNetworkName(MTCommonConstants.Network.NAME_2G);
                MTGlobal.setNetworkRadio(MTCommonConstants.Network.RADIO_2G);
                bundle.putInt("type", 2);
                bundle.putString("name", MTCommonConstants.Network.NAME_2G);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, MTCommonConstants.Network.RADIO_2G);
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case TYPE_BYTES_VALUE:
            case 14:
            case 15:
            case 17:
                MTGlobal.setNetworkType(3);
                MTGlobal.setNetworkName(MTCommonConstants.Network.NAME_3G);
                MTGlobal.setNetworkRadio(MTCommonConstants.Network.RADIO_3G);
                bundle.putInt("type", 3);
                bundle.putString("name", MTCommonConstants.Network.NAME_3G);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, MTCommonConstants.Network.RADIO_3G);
                break;
            case 13:
            case 18:
            case 19:
                MTGlobal.setNetworkType(4);
                MTGlobal.setNetworkName(MTCommonConstants.Network.NAME_4G);
                MTGlobal.setNetworkRadio(MTCommonConstants.Network.RADIO_4G);
                bundle.putInt("type", 4);
                bundle.putString("name", MTCommonConstants.Network.NAME_4G);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, MTCommonConstants.Network.RADIO_4G);
                break;
            case 20:
                MTGlobal.setNetworkType(5);
                MTGlobal.setNetworkName(MTCommonConstants.Network.NAME_5G);
                MTGlobal.setNetworkRadio(MTCommonConstants.Network.RADIO_5G);
                bundle.putInt("type", 5);
                bundle.putString("name", MTCommonConstants.Network.NAME_5G);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, MTCommonConstants.Network.RADIO_5G);
                break;
            default:
                MTGlobal.setNetworkType(0);
                MTGlobal.setNetworkName("unknown");
                MTGlobal.setNetworkRadio("unknown");
                bundle.putInt("type", 0);
                bundle.putString("name", "unknown");
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, "unknown");
                break;
        }
        return bundle;
    }
}
