package com.engagelab.privates.push.utils;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import android.widget.RemoteViews;
import com.engagelab.privates.common.C2472c0;
import com.engagelab.privates.common.C2488p;
import com.engagelab.privates.common.component.MTCommonActivity;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.NotificationLayout;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.Adler32;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NotificationUtil {
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String NOTIFICATION_ICON = "mtpush_notification_icon";
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String TAG = "NotificationUtil";

    /* JADX INFO: renamed from: com.engagelab.privates.push.utils.NotificationUtil$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2515a {

        /* JADX INFO: renamed from: a */
        public static final Map<String, String> f35179a = new HashMap();

        static {
            m13194a();
        }

        /* JADX INFO: renamed from: a */
        public static int m13191a(int i) {
            if (i == 0 || i == 1) {
                return -2;
            }
            if (i != 2) {
                return (i == 4 || i == 5) ? 1 : 0;
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static int m13195b(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("n_importance");
            if (jSONObjectOptJSONObject != null) {
                String str = Build.MANUFACTURER;
                if (str == null) {
                    return m13193a(jSONObject, -1);
                }
                String str2 = f35179a.get(str.toLowerCase());
                if (str2 != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt(str2, -1);
                    MTCommonLog.m13010d(NotificationUtil.TAG, "im_v:" + iOptInt);
                    return iOptInt;
                }
            }
            return m13193a(jSONObject, -1);
        }

        /* JADX INFO: renamed from: c */
        public static int m13196c(JSONObject jSONObject) {
            int iM13191a;
            int iOptInt = jSONObject.optInt("n_priority", 0);
            int iM13195b = m13195b(jSONObject);
            return (-1 != iM13195b && iOptInt > (iM13191a = m13191a(iM13195b))) ? iM13191a : iOptInt;
        }

        /* JADX INFO: renamed from: a */
        public static int m13193a(JSONObject jSONObject, int i) {
            return i;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m13192a(JSONObject jSONObject) {
            return m13195b(jSONObject);
        }

        /* JADX INFO: renamed from: a */
        public static void m13194a() {
            Map<String, String> map = f35179a;
            map.put("google".toLowerCase(), "fc");
            map.put(MTPushConstants.Manufacturer.HUAWEI.toLowerCase(), "hw");
            map.put(MTPushConstants.Manufacturer.HONOR.toLowerCase(), "hn");
            map.put(MTPushConstants.Manufacturer.MEIZU.toLowerCase(), "mz");
            map.put(MTPushConstants.Manufacturer.VIVO.toLowerCase(), "vi");
            map.put(MTPushConstants.Manufacturer.OPPO.toLowerCase(), "op");
            map.put(MTPushConstants.Manufacturer.REALME.toLowerCase(), "op");
            map.put(MTPushConstants.Manufacturer.ONEPLUS.toLowerCase(), "op");
            map.put(MTPushConstants.Manufacturer.XIAOMI.toLowerCase(), "xm");
            map.put(MTPushConstants.Manufacturer.BLACKSHARK.toLowerCase(), "xm");
        }
    }

    public static String[] convertJsonToArray(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String[] strArr = new String[jSONObject.length()];
            int i = 0;
            while (itKeys.hasNext()) {
                strArr[i] = jSONObject.optString(itKeys.next());
                i++;
            }
            return strArr;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("convertJsonToArray failed "), th);
            return null;
        }
    }

    public static Bundle convertJsonToBundle(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return null;
            }
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
            return bundle;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("convertJsonToBundle failed "), th);
            return null;
        }
    }

    public static Bundle convertMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static Notification.BigPictureStyle getBigPictureStyle(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            Bitmap pictureBitmap = getPictureBitmap(context, str);
            if (pictureBitmap == null) {
                return null;
            }
            return bigPictureStyle.bigPicture(pictureBitmap);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("get bigPictureStyle failed "), th);
            return null;
        }
    }

    public static Notification.BigTextStyle getBigTextStyle(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Notification.BigTextStyle().bigText(str);
    }

    public static String getContent(Context context, NotificationMessage notificationMessage) {
        return TextUtils.isEmpty(notificationMessage.getContent()) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : notificationMessage.getContent();
    }

    public static int getDefaults(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (z2) {
            return (notificationMessage.getDefaults() & 1) == 0 ? notificationMessage.getDefaults() : notificationMessage.getDefaults() - 1;
        }
        switch (notificationMessage.getDefaults()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return notificationMessage.getDefaults();
            default:
                return -1;
        }
    }

    public static Notification.InboxStyle getInboxStyle(Context context, String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
                    for (String str : strArr) {
                        inboxStyle.addLine(str);
                    }
                    inboxStyle.setSummaryText(" + " + strArr.length + " new messages");
                    return inboxStyle;
                }
            } catch (Throwable th) {
                AbstractC2929c.m13709n(TAG, new StringBuilder("getInboxStyle failed "), th);
            }
        }
        return null;
    }

    public static Bitmap getLargeIcon(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getPictureBitmap(context, str);
    }

    private static String getLaunchActivityClassName(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                return launchIntentForPackage.getComponent().getClassName();
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(context.getPackageName());
            intent.addCategory("android.intent.category.LAUNCHER");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                resolveInfoResolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0);
            }
            return resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.name : "";
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getLaunchActivityClassName failed "), th);
            return "";
        }
    }

    public static String getMessageId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("ad_id");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObject.optString("msg_id");
        }
        return TextUtils.isEmpty(strOptString) ? jSONObject.optString("_jmsgid_") : strOptString;
    }

    public static int getNotificationId(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            MTCommonLog.m13010d(TAG, "the messageId [" + str + "] will convert to adler32");
            try {
                Adler32 adler32 = new Adler32();
                adler32.update(str.getBytes());
                int value = (int) adler32.getValue();
                return value < 0 ? Math.abs(value) : value;
            } catch (Throwable th) {
                AbstractC2929c.m13709n(TAG, new StringBuilder("getNotificationId failed "), th);
                return 0;
            }
        }
    }

    public static int getNotificationImportance(JSONObject jSONObject) {
        return C2515a.m13192a(jSONObject);
    }

    public static RemoteViews getNotificationLayout(Context context, NotificationMessage notificationMessage) {
        try {
            NotificationLayout notificationLayoutM13066a = C2488p.m13064a().m13066a(context, notificationMessage.getBuilderId());
            if (notificationLayoutM13066a == null) {
                MTCommonLog.m13010d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout is null");
                return null;
            }
            MTCommonLog.m13010d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout:" + notificationLayoutM13066a.toString());
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), notificationLayoutM13066a.getLayoutId());
            if (notificationLayoutM13066a.getIconViewId() > 0) {
                remoteViews.setImageViewResource(notificationLayoutM13066a.getIconViewId(), getSmallIcon(context));
                Icon smallIcon = getSmallIcon(context, notificationMessage);
                if (smallIcon != null) {
                    remoteViews.setImageViewIcon(notificationLayoutM13066a.getIconViewId(), smallIcon);
                }
            }
            if (notificationLayoutM13066a.getTitleViewId() > 0) {
                remoteViews.setTextViewText(notificationLayoutM13066a.getTitleViewId(), getTitle(context, notificationMessage));
            }
            if (notificationLayoutM13066a.getContentViewId() > 0) {
                remoteViews.setTextViewText(notificationLayoutM13066a.getContentViewId(), getContent(context, notificationMessage));
            }
            if (notificationLayoutM13066a.getTimeViewId() > 0) {
                remoteViews.setLong(notificationLayoutM13066a.getTimeViewId(), "setTime", System.currentTimeMillis());
            }
            return remoteViews;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getNotificationLayout failed "), th);
            return null;
        }
    }

    public static boolean getNotificationState(Context context) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return false;
            }
            return notificationManager.areNotificationsEnabled();
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getNotificationState failed "), th);
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod(CHECK_OP_NO_THROW, cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class);
                num.intValue();
                return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
            } catch (Throwable th2) {
                AbstractC2929c.m13709n(TAG, new StringBuilder("getNotificationState failed "), th2);
                return false;
            }
        }
    }

    public static PendingIntent getPendingIntent(Context context, String str, NotificationMessage notificationMessage) {
        Intent intent = new Intent();
        intent.setClass(context, MTCommonActivity.class);
        intent.setAction(str);
        intent.addFlags(276824064);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", notificationMessage);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(context, notificationMessage.getNotificationId(), intent, 67108864);
    }

    public static Bitmap getPictureBitmap(Context context, String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
            }
            byte[] bArr = new HttpUtils().get(context, str);
            if (bArr != null) {
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            MTCommonLog.m13010d(TAG, "getPicture bytes is null");
            return null;
        } catch (Throwable th) {
            try {
                MTCommonLog.m13013w(TAG, "get pictureBitmap failed " + th.getMessage());
                return null;
            } finally {
                Runtime.getRuntime().gc();
            }
        }
    }

    public static int getPriority(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (z2) {
            return -1;
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1 || priority == 0 || priority == 1 || priority == 2) {
            return notificationMessage.getPriority();
        }
        return 0;
    }

    public static int getSmallIcon(Context context) {
        int identifier = context.getResources().getIdentifier(NOTIFICATION_ICON, "drawable", context.getPackageName());
        if (identifier > 0) {
            return identifier;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        } catch (Throwable th) {
            MTCommonLog.m13013w(TAG, "get getSmallIcon failed " + th.getMessage());
            MTCommonLog.m13011e(TAG, "please put icon [mtpush_notification_icon] in res/drawable");
            return 0;
        }
    }

    public static Uri getSoundUri(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (z2) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return null;
            }
            if (context.getResources().getIdentifier(notificationMessage.getSound(), "raw", context.getPackageName()) == 0) {
                MTCommonLog.m13010d(TAG, "there are no sound resource");
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + notificationMessage.getSound());
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getSoundUri failed "), th);
            return null;
        }
    }

    public static Notification.Style getStyle(Context context, NotificationMessage notificationMessage) {
        int style = notificationMessage.getStyle();
        if (style == 1) {
            return getBigTextStyle(context, notificationMessage.getBigText());
        }
        if (style == 2) {
            return getInboxStyle(context, notificationMessage.getInbox());
        }
        if (style != 3) {
            return null;
        }
        return getBigPictureStyle(context, notificationMessage.getBigPicture());
    }

    public static String getTitle(Context context, NotificationMessage notificationMessage) {
        return TextUtils.isEmpty(notificationMessage.getTitle()) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : notificationMessage.getTitle();
    }

    public static int getVisibility(Context context, boolean z2, NotificationMessage notificationMessage) {
        int priority;
        if (z2 || (priority = notificationMessage.getPriority()) == -2 || priority == -1) {
            return -1;
        }
        return (priority == 1 || priority == 2) ? 1 : 0;
    }

    public static boolean goToAppNotificationSettings(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            return true;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("goToAppNotificationSettings failed "), th);
            return false;
        }
    }

    public static boolean setHonorBadge(Context context, int i) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
            if (TextUtils.isEmpty(contentResolver.getType(uri))) {
                uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                if (TextUtils.isEmpty(contentResolver.getType(uri))) {
                    MTCommonLog.m13011e(TAG, " setHonorBadge fail, uri is null");
                    return false;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", getLaunchActivityClassName(context));
            bundle.putInt("badgenumber", i);
            contentResolver.call(uri, "change_badge", (String) null, bundle);
            return true;
        } catch (Throwable th) {
            MTCommonLog.m13011e(TAG, " setHonorBadge wrong error:" + th);
            return false;
        }
    }

    public static void setHuaweiBadgeNumber(Context context, int i) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            String launchActivityClassName = getLaunchActivityClassName(context);
            if (TextUtils.isEmpty(launchActivityClassName)) {
                return;
            }
            MTCommonLog.m13010d(TAG, "setHuaweiBadgeNumber " + i);
            bundle.putString("class", launchActivityClassName);
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("setHuaweiBadgeNumber failed "), th);
        }
    }

    public static void setNotificationBadge(Context context, Notification notification, int i) {
        int i2;
        if (i == 0) {
            return;
        }
        int iM13065a = C2488p.m13064a().m13065a(context);
        i2 = iM13065a + i;
        C2472c0.m12920b(context, i2);
        MTCommonLog.m13010d(TAG, "setNotificationBadge cacheNotificationBadge[" + iM13065a + "]+currentNotificationBadge[" + i + "]");
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "huawei":
                setHuaweiBadgeNumber(context, i2);
                break;
            case "xiaomi":
                setXiaomiBadgeNumber(context, notification, i);
                break;
            case "honor":
                setHonorBadge(context, i2);
                break;
        }
    }

    public static void setXiaomiBadgeNumber(Context context, Notification notification, int i) {
        if (notification == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("setXiaomiBadgeNumber failed "), th);
        }
    }

    public static int getPriority(JSONObject jSONObject) {
        return C2515a.m13196c(jSONObject);
    }

    public static Icon getSmallIcon(Context context, NotificationMessage notificationMessage) {
        Bitmap pictureBitmap;
        try {
            if (TextUtils.isEmpty(notificationMessage.getSmallIcon()) || (pictureBitmap = getPictureBitmap(context, notificationMessage.getSmallIcon())) == null) {
                return null;
            }
            return Icon.createWithBitmap(pictureBitmap);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("getSmallIcon failed "), th);
            return null;
        }
    }
}
