package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.common.p027io.AbstractC4465b;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: compiled from: Proguard */
    public static class DisplayNotificationInfo {

        /* JADX INFO: renamed from: id */
        public final int f42826id;
        public final NotificationCompat.Builder notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i) {
            this.notificationBuilder = builder;
            this.tag = str;
            this.f42826id = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    @Nullable
    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(67108864);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(Ints.MAX_POWER_OF_TWO));
    }

    @Nullable
    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_RECEIVER).setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(Ints.MAX_POWER_OF_TWO));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(Constants.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w(Constants.TAG, "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(context.getColor(i));
        } catch (Resources.NotFoundException unused2) {
            Log.w(Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z2 = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r0 = z2;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r0 = (z2 ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r0 | 4 : r0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(Constants.TAG, "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC5852a.m16773g(notificationManager, str) != null) {
                    return str;
                }
                Log.w(Constants.TAG, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string2)) {
                Log.w(Constants.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (AbstractC5852a.m16773g(notificationManager, string2) != null) {
                    return string2;
                }
                Log.w(Constants.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (AbstractC4465b.m15007c(notificationManager) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e(Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                AbstractC2433a.m12776s(notificationManager, AbstractC4465b.m15008d(string));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            Log.w(Constants.TAG, "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i == 0 || !isValidIcon(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w(Constants.TAG, "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !isValidIcon(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean isValidIcon(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC4465b.m15001A(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e(Constants.TAG, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e(Constants.TAG, "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean shouldUploadMetrics(@NonNull NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            builder.f23014e = NotificationCompat.Builder.m7427b(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            builder.f23015f = NotificationCompat.Builder.m7427b(possiblyLocalizedString2);
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.f23000e = NotificationCompat.Builder.m7427b(possiblyLocalizedString2);
            builder.m7432f(bigTextStyle);
        }
        builder.f23007B.icon = getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle);
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            builder.m7431e(sound);
        }
        builder.f23016g = createContentIntent(context, notificationParams, packageName, packageManager);
        PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (pendingIntentCreateDeleteIntent != null) {
            builder.f23007B.deleteIntent = pendingIntentCreateDeleteIntent;
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            builder.f23030u = color.intValue();
        }
        builder.m7429c(16, !notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        builder.f23028s = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            builder.f23007B.tickerText = NotificationCompat.Builder.m7427b(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            builder.f23019j = notificationPriority.intValue();
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            builder.f23031v = visibility.intValue();
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            builder.f23018i = notificationCount.intValue();
        }
        Long l = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l != null) {
            builder.f23020k = true;
            builder.f23007B.when = l.longValue();
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            builder.f23007B.vibrate = vibrateTimings;
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            int i = lightSettings[0];
            int i2 = lightSettings[1];
            int i3 = lightSettings[2];
            Notification notification = builder.f23007B;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
        }
        int consolidatedDefaults = getConsolidatedDefaults(notificationParams);
        Notification notification2 = builder.f23007B;
        notification2.defaults = consolidatedDefaults;
        if ((consolidatedDefaults & 4) != 0) {
            notification2.flags |= 1;
        }
        return new DisplayNotificationInfo(builder, getTag(notificationParams), 0);
    }
}
