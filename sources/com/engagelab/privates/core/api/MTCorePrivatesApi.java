package com.engagelab.privates.core.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.C2483k;
import com.engagelab.privates.common.C2485m;
import com.engagelab.privates.common.annotation.AllAPI;
import com.engagelab.privates.common.annotation.EngagelabAPI;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllAPI
public class MTCorePrivatesApi {

    @AllAPI
    public static final int SDK_VERSION_CODE = 440;

    @AllAPI
    public static final String SDK_VERSION_NAME = "4.4.0";
    private static final String TAG = "MTCorePrivatesApi";

    @AllAPI
    public static void configAppChannel(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configAppChannel context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "configAppChannel appChannel can't be empty, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString(MTCoreConstants.Config.APP_CHANNEL, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.SET_CONFIG, bundle);
            MTGlobal.setAppChannel(str);
        }
    }

    @AllAPI
    public static void configAppKey(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configAppKey context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "configAppKey appKey can't be empty, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString(MTCoreConstants.Config.APP_KEY, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.SET_CONFIG, bundle);
            MTGlobal.setAppKey(str);
        }
    }

    @AllAPI
    public static void configAppSiteName(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configAppSiteName context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "configAppSiteName appSiteName can't be empty, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString(MTCoreConstants.Config.APP_SITE_NAME, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.SET_CONFIG, bundle);
            MTGlobal.setAppSiteName(str);
        }
    }

    @AllAPI
    public static void configConnectRetryCount(Context context, int i) {
        if (context == null) {
            MTCoreGlobal.setConnectRetryCount(i);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setConnectRetryCount(i);
        }
    }

    @AllAPI
    public static void configDebugMode(Context context, boolean z2) {
        if (context == null) {
            MTGlobal.setDebugMode(z2);
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MTCoreConstants.Config.DEBUG_MODE, z2);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.SET_CONFIG, bundle);
            MTGlobal.setDebugMode(z2);
        }
    }

    @AllAPI
    public static void configHeartbeatInterval(Context context, long j) {
        if (context == null) {
            MTCoreGlobal.setHeartbeatInterval(j);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setHeartbeatInterval(j);
        }
    }

    @AllAPI
    public static void configSM4(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configSM4 context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.setEncryptType(2);
        }
    }

    @AllAPI
    public static void configWakeAndBeWake(Context context, boolean z2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configWakeAndBeWake context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setWakeAndBeWakeState(z2);
        }
    }

    @AllAPI
    public static int getLoginCode(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getLoginCode context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getLoginCode(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return C2485m.m13037f(context.getApplicationContext());
        }
        return 0;
    }

    @AllAPI
    public static String getPassword(Context context) {
        if (context != null) {
            return MTGlobal.isMainProcess(context.getApplicationContext()) ? MTCoreGlobal.getPassword(context) : MTGlobal.isRemoteProcess(context.getApplicationContext()) ? C2485m.m13038g(context.getApplicationContext()) : "";
        }
        MTCommonLog.m13011e(TAG, "getPassword context can't be null, please check it");
        return "";
    }

    @AllAPI
    public static int getRegisterCode(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getRegisterCode context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getRegisterCode(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return C2485m.m13040i(context.getApplicationContext());
        }
        return 0;
    }

    @AllAPI
    public static String getRegistrationId(Context context) {
        if (context != null) {
            return MTGlobal.isMainProcess(context.getApplicationContext()) ? MTCoreGlobal.getRegistrationId(context) : MTGlobal.isRemoteProcess(context.getApplicationContext()) ? C2485m.m13041j(context.getApplicationContext()) : "";
        }
        MTCommonLog.m13011e(TAG, "getRegistrationId context can't be null, please check it");
        return "";
    }

    @AllAPI
    public static int getSeedId(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getSeedId context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getSeedId(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return C2485m.m13042k(context.getApplicationContext());
        }
        return 0;
    }

    @AllAPI
    public static long getServerTime(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getServerTime context can't be null, please check it");
            return 0L;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getServerTime(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return C2485m.m13043l(context.getApplicationContext());
        }
        return 0L;
    }

    @AllAPI
    public static long getUserId(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getUserId context can't be null, please check it");
            return 0L;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getUserId(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return C2485m.m13049r(context.getApplicationContext());
        }
        return 0L;
    }

    @AllAPI
    public static boolean isConnectContinue(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "isConnectContinue context can't be null, please check it");
            return false;
        }
        if (!MTGlobal.isMainProcess(context.getApplicationContext()) && !MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return false;
        }
        for (String str : MTObservable.getInstance().observeNameQueue) {
            if (TextUtils.equals(str, "com.engagelab.privates.push.MTPush") || TextUtils.equals(str, "com.engagelab.privates.message.MTMessage")) {
                return true;
            }
        }
        return false;
    }

    @AllAPI
    public static void setReportCacheFileMaximum(int i) {
        if (i >= 0) {
            C2483k.f35141c = i;
        }
    }

    @EngagelabAPI
    @Deprecated
    public static void setTcpSSl(boolean z2) {
        if (MTGlobal.IS_FOR_ENGAGELAB) {
            MTGlobal.setTcpSSL(z2);
        }
    }

    @AllAPI
    @Deprecated
    public static void setWakeAndBeWakeEnable(Context context, boolean z2) {
        configWakeAndBeWake(context, z2);
    }

    public static void testConfigGoogle(Context context, boolean z2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "testConfigGoogle context can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCommonLog.m13011e(TAG, "testConfigGoogle, Can only be used in the debugging version, please do not call the release version");
            if (z2) {
                MTGlobal.setCountryCode("US");
            } else {
                MTGlobal.setCountryCode("CN");
            }
        }
    }

    public static void setTcpSSl(Context context, boolean z2) {
        if (MTGlobal.IS_FOR_ENGAGELAB) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MTCoreConstants.Config.IS_SSL, z2);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.SET_CONFIG, bundle);
            MTGlobal.setTcpSSL(z2);
        }
    }
}
