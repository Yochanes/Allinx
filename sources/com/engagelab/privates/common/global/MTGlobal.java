package com.engagelab.privates.common.global;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import coil.util.AbstractC2383b;
import com.engagelab.privates.common.cache.MTCommonConfig;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.component.MTCommonService;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.WakeMessage;
import com.engagelab.privates.push.api.AliasMessage;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.MobileNumberMessage;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.api.TagMessage;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTGlobal {
    private static final String APP_CHANNEL = "ENGAGELAB_PRIVATES_CHANNEL";
    private static final String APP_KEY = "ENGAGELAB_PRIVATES_APPKEY";
    private static final String APP_PROCESS = "ENGAGELAB_PRIVATES_PROCESS";
    public static final String APP_SITE_NAME_DEFAULT = "Singapore";
    private static final String APP_TRANSFER = "ENGAGELAB_PRIVATES_TRANSFER";
    private static final String INTENT_COMMON_RECEIVER = "com.engagelab.privates.intent.USER_RECEIVER";
    private static final String INTENT_COMMON_SERVICE = "com.engagelab.privates.intent.USER_SERVICE";
    public static boolean IS_FOR_BINANCE = false;
    public static boolean IS_FOR_CHINALIFE = false;
    public static boolean IS_FOR_ENGAGELAB = true;
    public static boolean IS_FOR_PINGANBANK = false;
    public static boolean IS_FOR_PINGANTECH = false;
    public static boolean IS_FOR_SGM = false;
    public static boolean IS_FOR_SPDBAND = false;
    private static AtomicBoolean IS_MAIN_PROCESS = null;
    private static final String TAG = "MTGlobal";
    private static String appChannel = null;
    private static String appKey = null;
    private static String appProcess = null;
    private static String appSiteName = null;
    private static String appTransfer = null;
    private static int appVersionCode = 0;
    private static String appVersionName = null;
    private static MTCommonReceiver commonReceiver = null;
    private static MTCommonService commonService = null;
    public static Context context = null;
    private static String countryCode = null;
    private static String currentActivityName = "";
    private static int encryptType = 2;
    private static boolean isDebugMode = false;
    public static boolean isNeedRemoteProcess = true;
    private static AtomicBoolean isRemoteProcess = null;
    private static boolean isTcpSSL = false;
    private static boolean lifecycleState = false;
    private static String networkName = "unknown";
    private static String networkRadio = "";
    private static boolean networkState = false;
    private static int networkType;

    /* JADX INFO: renamed from: com.engagelab.privates.common.global.MTGlobal$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2479a extends MTCommonReceiver {

        /* JADX INFO: renamed from: a */
        public MTCommonReceiver f35135a;

        public C2479a(MTCommonReceiver mTCommonReceiver) {
            this.f35135a = mTCommonReceiver;
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onAliasMessage(Context context, AliasMessage aliasMessage) {
            try {
                this.f35135a.onAliasMessage(context, aliasMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onAliasMessage:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onConnectStatus(Context context, boolean z2) {
            try {
                this.f35135a.onConnectStatus(context, z2);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onConnectStatus:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onCustomMessage(Context context, CustomMessage customMessage) {
            try {
                this.f35135a.onCustomMessage(context, customMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onCustomMessage:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onMobileNumber(Context context, MobileNumberMessage mobileNumberMessage) {
            try {
                this.f35135a.onMobileNumber(context, mobileNumberMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onMobileNumber:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onNotificationArrived(Context context, NotificationMessage notificationMessage) {
            try {
                this.f35135a.onNotificationArrived(context, notificationMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onNotificationArrived:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onNotificationClicked(Context context, NotificationMessage notificationMessage) {
            try {
                this.f35135a.onNotificationClicked(context, notificationMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onNotificationClicked:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onNotificationDeleted(Context context, NotificationMessage notificationMessage) {
            try {
                this.f35135a.onNotificationDeleted(context, notificationMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onNotificationDeleted:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onNotificationStatus(Context context, boolean z2) {
            try {
                this.f35135a.onNotificationStatus(context, z2);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onNotificationStatus:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onNotificationUnShow(Context context, NotificationMessage notificationMessage) {
            try {
                this.f35135a.onNotificationUnShow(context, notificationMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onNotificationUnShow:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onPlatformToken(Context context, PlatformTokenMessage platformTokenMessage) {
            try {
                this.f35135a.onPlatformToken(context, platformTokenMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onPlatformToken:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onTagMessage(Context context, TagMessage tagMessage) {
            try {
                this.f35135a.onTagMessage(context, tagMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onTagMessage:" + th);
            }
        }

        @Override // com.engagelab.privates.common.component.MTCommonReceiver
        public void onWake(Context context, WakeMessage wakeMessage) {
            try {
                this.f35135a.onWake(context, wakeMessage);
            } catch (Throwable th) {
                MTCommonLog.m13011e(MTGlobal.TAG, "onWake:" + th);
            }
        }
    }

    public static String getAppChannel(Context context2) {
        if (TextUtils.isEmpty(appChannel)) {
            appChannel = getMetaData(context2, APP_CHANNEL);
        }
        return appChannel;
    }

    public static String getAppKey(Context context2) {
        if (TextUtils.isEmpty(appKey)) {
            synchronized (MTGlobal.class) {
                try {
                    if (TextUtils.isEmpty(appKey)) {
                        appKey = getMetaData(context2, APP_KEY);
                    }
                } finally {
                }
            }
        }
        return appKey;
    }

    public static String getAppProcess(Context context2) {
        if (TextUtils.isEmpty(appProcess)) {
            appProcess = getMetaData(context2, APP_PROCESS);
        }
        return appProcess;
    }

    public static int getAppVersionCode(Context context2) {
        int i = appVersionCode;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
            appVersionCode = i2;
            return i2;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getAppVersionCode failed: "), th);
            return 0;
        }
    }

    public static String getAppVersionName(Context context2) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        try {
            String str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            appVersionName = str;
            return str;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getAppVersionName failed: "), th);
            return "";
        }
    }

    public static MTCommonReceiver getCommonReceiver(Context context2) {
        MTCommonReceiver commonReceiverImpl = getCommonReceiverImpl(context2);
        if (commonReceiverImpl == null) {
            MTCommonLog.m13013w(TAG, "getCommonReceiver is null");
        }
        return commonReceiverImpl;
    }

    private static MTCommonReceiver getCommonReceiverImpl(Context context2) {
        MTCommonReceiver mTCommonReceiver = commonReceiver;
        if (mTCommonReceiver != null) {
            return mTCommonReceiver;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_RECEIVER);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (MTCommonReceiver.class.isAssignableFrom(cls)) {
                            C2479a c2479a = new C2479a((MTCommonReceiver) cls.newInstance());
                            commonReceiver = c2479a;
                            return c2479a;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getCommonReceiver failed "), th);
            return null;
        }
    }

    public static MTCommonService getCommonService(Context context2) {
        MTCommonService commonServiceImpl = getCommonServiceImpl(context2);
        if (commonServiceImpl == null) {
            MTCommonLog.m13013w(TAG, "getCommonService is null");
        }
        return commonServiceImpl;
    }

    private static MTCommonService getCommonServiceImpl(Context context2) {
        MTCommonService mTCommonService = commonService;
        if (mTCommonService != null) {
            return mTCommonService;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_SERVICE);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryIntentServices(intent, 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (MTCommonService.class.isAssignableFrom(cls)) {
                            MTCommonService mTCommonService2 = (MTCommonService) cls.newInstance();
                            commonService = mTCommonService2;
                            return mTCommonService2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getCommonService failed "), th);
            return null;
        }
    }

    public static String getCountryCode(Context context2) {
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = SystemUtil.getCountry(context2);
        }
        return countryCode;
    }

    public static String getCurrentActivityName() {
        return currentActivityName;
    }

    private static String getCurrentProcessName(Context context2) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return AbstractC2383b.m12549e();
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th);
        }
        FileInputStream fileInputStream = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th2) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th2);
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/self/cmdline");
            try {
                byte[] bArr = new byte[256];
                int i = 0;
                while (true) {
                    int i2 = fileInputStream2.read();
                    if (i2 <= 0 || i >= 256) {
                        break;
                    }
                    bArr[i] = (byte) i2;
                    i++;
                }
                if (i > 0) {
                    String str = new String(bArr, 0, i, "UTF-8");
                    try {
                        fileInputStream2.close();
                    } catch (Throwable th3) {
                        AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th3);
                    }
                    return str;
                }
                try {
                    fileInputStream2.close();
                    return "";
                } catch (Throwable th4) {
                    AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th4);
                    return "";
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = fileInputStream2;
                try {
                    MTCommonLog.m13013w(TAG, "getCurrentProcessName failed " + th.getMessage());
                    if (fileInputStream == null) {
                        return "";
                    }
                    try {
                        fileInputStream.close();
                        return "";
                    } catch (Throwable th6) {
                        AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th6);
                        return "";
                    }
                } catch (Throwable th7) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th8) {
                            AbstractC2929c.m13709n(TAG, new StringBuilder("getCurrentProcessName failed "), th8);
                        }
                    }
                    throw th7;
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public static boolean getDebugMode() {
        return isDebugMode;
    }

    public static String getDeviceId(Context context2) {
        String str;
        String deviceId = MTCommonConfig.getDeviceId(context2);
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        try {
            str = StringUtil.get32MD5String(" " + Settings.Secure.getString(context2.getContentResolver(), "android_id") + " " + (Build.PRODUCT.toLowerCase() + "_" + Build.TIME));
        } catch (Throwable unused) {
            str = StringUtil.get32MD5String(" " + UUID.randomUUID().toString() + "  ");
        }
        MTCommonConfig.setDeviceId(context2, str);
        return str;
    }

    public static int getEncryptType() {
        return encryptType;
    }

    public static boolean getLifecycleState() {
        return lifecycleState;
    }

    private static String getMainProcessName(Context context2) {
        String str;
        try {
            str = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).processName;
        } catch (PackageManager.NameNotFoundException e) {
            MTCommonLog.m13013w(TAG, "getMainProcessName failed " + e.getMessage());
            str = "";
        }
        return TextUtils.isEmpty(str) ? context2.getPackageName() : str;
    }

    public static String getMetaData(Context context2, String str) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get(str)) == null) ? "" : String.valueOf(obj);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getMetaData failed "), th);
        }
        return "";
    }

    public static String getNetworkName() {
        return networkName;
    }

    public static String getNetworkRadio() {
        return networkRadio;
    }

    public static boolean getNetworkState() {
        return networkState;
    }

    public static int getNetworkType() {
        return networkType;
    }

    private static String getRemoteProcessName(Context context2, Class<?> cls) {
        try {
            return context2.getPackageManager().getServiceInfo(new ComponentName(context2.getPackageName(), cls.getCanonicalName()), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).processName;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getRemoteProcessName failed "), th);
            return "";
        }
    }

    public static boolean getTcpSSL() {
        return isTcpSSL;
    }

    public static String getTransfer(Context context2) {
        if (TextUtils.isEmpty(appTransfer)) {
            appTransfer = getMetaData(context2, APP_TRANSFER);
        }
        return appTransfer;
    }

    public static boolean hasPermission(Context context2, String str) {
        return context2.checkSelfPermission(str) == 0;
    }

    public static boolean isMainProcess(Context context2) {
        AtomicBoolean atomicBoolean = IS_MAIN_PROCESS;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        IS_MAIN_PROCESS = new AtomicBoolean(false);
        try {
            if (TextUtils.equals(getCurrentProcessName(context2), getMainProcessName(context2))) {
                IS_MAIN_PROCESS.set(true);
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("isMainProcess failed "), th);
        }
        return IS_MAIN_PROCESS.get();
    }

    public static boolean isRemoteProcess(Context context2) {
        AtomicBoolean atomicBoolean = isRemoteProcess;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        isRemoteProcess = new AtomicBoolean(false);
        try {
            String currentProcessName = getCurrentProcessName(context2);
            if (TextUtils.isEmpty(currentProcessName)) {
                isRemoteProcess.set(true);
            }
            if (TextUtils.equals(currentProcessName, getRemoteProcessName(context2, getCommonService(context2).getClass()))) {
                isRemoteProcess.set(true);
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("isRemoteProcess failed "), th);
        }
        return isRemoteProcess.get();
    }

    public static void setAppChannel(String str) {
        appChannel = str;
    }

    public static void setAppKey(String str) {
        appKey = str;
    }

    public static void setAppSiteName(String str) {
        appSiteName = str;
    }

    public static void setCountryCode(String str) {
        MTCommonLog.m13010d(TAG, "setCountryCode, country:" + str);
        countryCode = str;
    }

    public static void setCurrentActivityName(String str) {
        currentActivityName = str;
    }

    public static void setDebugMode(boolean z2) {
        isDebugMode = z2;
    }

    public static void setDeviceId(Context context2, String str) {
        MTCommonConfig.setDeviceId(context2, str);
    }

    public static void setEncryptType(int i) {
        encryptType = i;
    }

    public static void setLifecycleState(boolean z2) {
        lifecycleState = z2;
    }

    public static void setNetworkName(String str) {
        networkName = str;
    }

    public static void setNetworkRadio(String str) {
        networkRadio = str;
    }

    public static void setNetworkState(boolean z2) {
        networkState = z2;
    }

    public static void setNetworkType(int i) {
        networkType = i;
    }

    public static void setTcpSSL(boolean z2) {
        if (IS_FOR_ENGAGELAB) {
            isTcpSSL = z2;
        }
    }
}
