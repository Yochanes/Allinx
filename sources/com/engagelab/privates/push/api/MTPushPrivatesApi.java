package com.engagelab.privates.push.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.C2470b0;
import com.engagelab.privates.common.C2485m;
import com.engagelab.privates.common.annotation.AllAPI;
import com.engagelab.privates.common.annotation.AllClass;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.utils.NotificationUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllAPI
public class MTPushPrivatesApi {

    @AllAPI
    public static final byte PLATFORM_DEFAULT = 0;

    @AllAPI
    public static final byte PLATFORM_GOOGLE = 8;

    @AllAPI
    public static final byte PLATFORM_HONOR = 7;

    @AllAPI
    public static final byte PLATFORM_HUAWEI = 2;

    @AllAPI
    public static final byte PLATFORM_MEIZU = 3;

    @AllAPI
    public static final byte PLATFORM_OPPO = 4;

    @AllAPI
    public static final byte PLATFORM_VIVO = 5;

    @AllAPI
    public static final byte PLATFORM_XIAOMI = 1;

    @AllAPI
    public static int SDK_VERSION_CODE = 440;

    @AllAPI
    public static String SDK_VERSION_NAME = "4.4.0";

    @AllAPI
    private static final String TAG = "MTPushPrivatesApi";

    /* JADX INFO: compiled from: Proguard */
    @AllClass
    public static class Code {
        public static int CONNECT_NOT_ENABLE = 6012;
        public static int INVALID_ALIAS = 6003;
        public static int INVALID_JSON = 6010;
        public static int INVALID_MOBILE_NUMBER = 6023;
        public static int INVALID_TAGS = 6005;
        public static int INVOKE_TOO_SOON = 6011;
        public static int NULL_TAG_AND_ALIAS = 6001;
        public static final int SUCCESS = 0;
        public static int TIMEOUT = 6002;
        public static int TOO_LONG_ALIAS = 6004;
        public static int TOO_LONG_TAG = 6006;
        public static int TOO_LONG_TAGS = 6008;
        public static int TOO_MANY_TAGS = 6007;
        public static int UNKNOWN_ERROR = 6009;
    }

    @AllAPI
    public static void addTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "addTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "addTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.m13011e(TAG, "addTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.m13011e(TAG, "addTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray(MTPushConstants.Operation.KEY_TAG, strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_ADD, bundle);
        }
    }

    @AllAPI
    public static void clearAlias(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "clearAlias context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_CLEAR, bundle);
        }
    }

    @AllAPI
    public static void clearNotification(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "clearNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Notification.KEY_NOTIFY_ID, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION, bundle);
        }
    }

    @AllAPI
    public static void configOldPushVersion(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "init context can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            SDK_VERSION_CODE = 396;
            SDK_VERSION_NAME = "3.9.6";
            MTCommonLog.m13010d(TAG, "configOldPushVersion " + SDK_VERSION_NAME);
        }
    }

    @AllAPI
    public static void configUserLanguage(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "configPushLanguage context can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            C2485m.m13032d(context, str);
            Bundle bundle = new Bundle();
            bundle.putString(MTPushConstants.SetData.SET_USER_LANGUAGE, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.SET_USER_LANGUAGE, bundle);
        }
    }

    @AllAPI
    public static void deleteAllTag(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "deleteAllTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "deleteAllTag sequence can't be 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_DELETE_ALL, bundle);
        }
    }

    @AllAPI
    public static void deleteGeofence(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "deleteGeofence context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "deleteGeofence geofenceId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.DELETE_GEOFENCE, bundle);
        }
    }

    @AllAPI
    public static void deleteTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "deleteTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "deleteTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.m13011e(TAG, "deleteTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.m13011e(TAG, "deleteTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray(MTPushConstants.Operation.KEY_TAG, strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_DELETE, bundle);
        }
    }

    @AllAPI
    public static void getAlias(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "getAlias context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_GET, bundle);
        }
    }

    @AllAPI
    public static void goToAppNotificationSettings(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "goToAppNotificationSettings context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationUtil.goToAppNotificationSettings(context.getApplicationContext());
        }
    }

    @AllAPI
    public static void init(Context context) {
        MTCommonLog.m13010d(TAG, "MTPushPrivatesApi.init 4.4.0");
        if (context == null) {
            MTCommonLog.m13011e(TAG, "init context can't be null, please check it");
            return;
        }
        if (!MTGlobal.isMainProcess(context.getApplicationContext()) && !MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCommonLog.m13011e(TAG, "Please call the MTPushPrivatesApi.init function in the main process or the push process");
            return;
        }
        MTCommonPrivatesApi.init(context.getApplicationContext(), true);
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTCore());
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTPush());
        }
    }

    @AllAPI
    public static void queryAllTag(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "queryAllTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "queryAllTag sequence can't be 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_QUERY_ALL, bundle);
        }
    }

    @AllAPI
    public static void queryTag(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "queryTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "queryTag sequence can't be 0, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "queryTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString(MTPushConstants.Operation.KEY_TAG, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_QUERY, bundle);
        }
    }

    @AllAPI
    public static void reportNotificationArrived(Context context, String str, byte b2, String str2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "reportNotificationArrived context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "reportNotificationArrived messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b2).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, bundle);
        }
    }

    @AllAPI
    public static void reportNotificationClicked(Context context, String str, byte b2, String str2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "reportNotificationClicked context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "reportNotificationClicked messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b2).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED, bundle);
        }
    }

    @AllAPI
    public static void reportNotificationDeleted(Context context, String str, byte b2, String str2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "reportNotificationDeleted context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "reportNotificationDeleted messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b2).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED, bundle);
        }
    }

    @AllAPI
    public static void reportNotificationOpened(Context context, String str, byte b2, String str2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "reportNotificationOpened context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "reportNotificationOpened messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b2).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED, bundle);
        }
    }

    @AllAPI
    public static void resetNotificationBadge(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "resetNotificationBadge context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE, null);
        }
    }

    @AllAPI
    public static void resetNotificationCount(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "resetNotificationCount context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT, null);
        }
    }

    @AllAPI
    public static void resetNotificationLayout(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "resetNotificationLayout context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    @AllAPI
    public static void resetNotificationShowTime(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "resetNotificationShowTime context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME, null);
        }
    }

    @AllAPI
    public static void resetNotificationSilenceTime(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "resetNotificationSilenceTime context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME, null);
        }
    }

    @AllAPI
    public static void setAlias(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setAlias context can't be null, please check it");
            return;
        }
        if (str == null) {
            MTCommonLog.m13011e(TAG, "setAlias alias can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString(MTPushConstants.Operation.KEY_ALIAS, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_SET, bundle);
        }
    }

    @AllAPI
    public static void setEnablePushTextToSpeech(Context context, boolean z2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setEnablePushTextToSpeech context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            C2470b0.m12902a().m12905a(context, z2);
        }
    }

    @AllAPI
    public static void setGeofenceCount(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setGeofenceCount context can't be null, please check it");
            return;
        }
        if (i <= 0 || i >= 100) {
            MTCommonLog.m13011e(TAG, "setGeofenceCount count must between 0~100, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Geofence.KEY_COUNT, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_GEOFENCE_COUNT, bundle);
        }
    }

    @AllAPI
    public static void setGeofenceInterval(Context context, long j) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setGeofenceInterval context can't be null, please check it");
            return;
        }
        if (j < 180000 || j > 86400000) {
            MTCommonLog.m13011e(TAG, "setGeofenceInterval interval must between 3 * 60 * 1000 ~ 24 * 60 * 60 * 1000, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putLong(MTPushConstants.Geofence.KEY_INTERVAL, j);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_GEOFENCE_INTERVAL, bundle);
        }
    }

    @AllAPI
    public static void setNotificationBadge(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setNotificationBadge context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationBadge.KEY_BADGE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE, bundle);
        }
    }

    @AllAPI
    public static void setNotificationCount(Context context, int i) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setNotificationCount context can't be null, please check it");
            return;
        }
        if (i < 0) {
            MTCommonLog.m13011e(TAG, "setNotificationCount count can't small than 0, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "setNotificationCount count can't equal with 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationCount.KEY_COUNT, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT, bundle);
        }
    }

    @AllAPI
    public static void setNotificationLayout(Context context, int i, NotificationLayout notificationLayout) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setNotificationLayout context can't be null, please check it");
            return;
        }
        if (notificationLayout == null) {
            MTCommonLog.m13011e(TAG, "setNotificationLayout notificationLayout can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i);
            bundle.putParcelable(MTPushConstants.NotificationLayout.KEY_NOTIFICATION_LAYOUT, notificationLayout);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    @AllAPI
    public static void setNotificationShowTime(Context context, int i, int i2, int... iArr) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime context can't be null, please check it");
            return;
        }
        if (i < 0 || i > 23) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime beginHour must between 0~23, please check it");
            return;
        }
        if (i2 < 0 || i2 > 23) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime endHour must between 0~23, please check it");
            return;
        }
        if (i > i2) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime beginHour can't large than endHour, please check it");
            return;
        }
        if (i == i2) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime beginHour can't equal with endHour, please check it");
            return;
        }
        if (iArr.length > 7) {
            MTCommonLog.m13011e(TAG, "setNotificationShowTime weekDays.length must between 0~7, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR, i);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_HOUR, i2);
            bundle.putIntArray(MTPushConstants.NotificationTime.KEY_DAYS, iArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME, bundle);
        }
    }

    @AllAPI
    public static void setNotificationSilenceTime(Context context, int i, int i2, int i3, int i4) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "setNotificationSilenceTime context can't be null, please check it");
            return;
        }
        if (i < 0 || i > 23) {
            MTCommonLog.m13011e(TAG, "setNotificationSilenceTime beginHour must between 0~23, please check it");
            return;
        }
        if (i2 < 0 || i2 > 59) {
            MTCommonLog.m13011e(TAG, "setNotificationSilenceTime beginMinute must between 0~59, please check it");
            return;
        }
        if (i3 < 0 || i3 > 23) {
            MTCommonLog.m13011e(TAG, "setNotificationSilenceTime endHour must between 0~23, please check it");
            return;
        }
        if (i4 < 0 || i4 > 59) {
            MTCommonLog.m13011e(TAG, "setNotificationSilenceTime endMinute must between 0~59, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR, i);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_MINUTE, i2);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_HOUR, i3);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_MINUTE, i4);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME, bundle);
        }
    }

    @AllAPI
    public static void showNotification(Context context, NotificationMessage notificationMessage) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "showNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", notificationMessage);
            bundle.putBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, false);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SHOW_NOTIFICATION, bundle);
        }
    }

    @AllAPI
    public static void turnOffGeofenceSwitch(Context context) {
        if (context == null) {
            MTCommonLog.m13011e("MTCommonPrivatesApi", "turnOffGeofenceSwitch context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_OFF_GEOFENCESWITCH, null);
        } else {
            MTCommonLog.m13011e("MTCommonPrivatesApi", "turnOffGeofenceSwitch should be called in main process");
        }
    }

    @AllAPI
    public static void turnOffPush(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "turnOffPush context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_OFF_PUSH, null);
        }
    }

    @AllAPI
    public static void turnOnGeofenceSwitch(Context context) {
        if (context == null) {
            MTCommonLog.m13011e("MTCommonPrivatesApi", "turnOnGeofenceSwitch context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_ON_GEOFENCESWITCH, null);
        } else {
            MTCommonLog.m13011e("MTCommonPrivatesApi", "turnOnGeofenceSwitch should be called in main process");
        }
    }

    @AllAPI
    public static void turnOnPush(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "turnOnPush context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_ON_PUSH, null);
        }
    }

    @AllAPI
    public static void updateTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "updateTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.m13011e(TAG, "updateTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.m13011e(TAG, "updateTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.m13011e(TAG, "updateTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray(MTPushConstants.Operation.KEY_TAG, strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_UPDATE, bundle);
        }
    }

    @AllAPI
    public static void uploadMobileNumber(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "uploadMobileNumber context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13011e(TAG, "uploadMobileNumber mobileNumber can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString(MTPushConstants.Operation.KEY_MOBILE_NUMBER, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_MOBILE_NUMBER, bundle);
        }
    }

    @AllAPI
    public static void uploadPlatformToken(Context context, byte b2, String str, String str2) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "onPlatformToken context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            PlatformTokenMessage region = new PlatformTokenMessage().setPlatform(b2).setToken(str).setRegion(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", region);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, bundle);
        }
    }

    @AllAPI
    public static void clearNotification(Context context) {
        if (context == null) {
            MTCommonLog.m13011e(TAG, "clearNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION, null);
        }
    }
}
