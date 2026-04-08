package com.engagelab.privates.push.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.NotificationMessage;
import io.intercom.android.sdk.utilities.AbstractC5852a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelUtil {
    private static final String CHANNEL_DEFAULT = "ENGAGELAB_PRIVATES_CHANNEL_normal";
    private static final String CHANNEL_HIGH = "ENGAGELAB_PRIVATES_CHANNEL_high";
    private static final String CHANNEL_LOW = "ENGAGELAB_PRIVATES_CHANNEL_low";
    private static final String CHANNEL_SILENCE = "ENGAGELAB_PRIVATES_CHANNEL_silence";
    private static final String TAG = "NotificationChannelUtil";

    public static String getChannel(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String channelId = getChannelId(context, z2, notificationMessage);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannelM16773g = AbstractC5852a.m16773g(notificationManager, channelId);
        int channelImportance = getChannelImportance(context, z2, notificationMessage);
        if (notificationChannelM16773g != null) {
            if (-1 != notificationMessage.getImportance()) {
                AbstractC5852a.m16791y(notificationChannelM16773g, channelImportance);
                MTCommonLog.m13010d(TAG, "has channelId:" + channelId + " and set channelImportance:" + channelImportance);
            }
            MTCommonLog.m13010d(TAG, "has channelId:" + channelId);
            return channelId;
        }
        String channelName = getChannelName(context, z2, notificationMessage);
        NotificationChannel notificationChannelM16771e = AbstractC5852a.m16771e(channelImportance, channelId, channelName);
        Uri soundUri = NotificationUtil.getSoundUri(context, z2, notificationMessage);
        int defaults = NotificationUtil.getDefaults(context, z2, notificationMessage);
        AbstractC5852a.m16765C(notificationChannelM16771e, NotificationUtil.getVisibility(context, z2, notificationMessage));
        try {
            if (soundUri != null) {
                AbstractC5852a.m16792z(notificationChannelM16771e, soundUri);
            } else if ((defaults & 1) == 0) {
                AbstractC5852a.m16790x(notificationChannelM16771e);
            }
        } catch (Throwable th) {
            MTCommonLog.m13013w(TAG, "setSound fail:" + th);
        }
        AbstractC5852a.m16763A(notificationChannelM16771e, (defaults & 4) != 0);
        AbstractC5852a.m16766D(notificationChannelM16771e, (defaults & 2) != 0);
        AbstractC2433a.m12776s(notificationManager, notificationChannelM16771e);
        MTCommonLog.m13010d(TAG, "build channel channelId:" + channelId + ", channelName:" + channelName + ", channelImportance:" + channelImportance);
        return channelId;
    }

    private static String getChannelId(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (z2) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_silence_" + notificationMessage.getPriority();
        }
        if (!TextUtils.isEmpty(notificationMessage.getChannelId())) {
            return notificationMessage.getChannelId();
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_low_" + notificationMessage.getPriority();
        }
        if (priority == 1 || priority == 2) {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return "N_ENGAGELAB_PRIVATES_CHANNEL_high_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults();
            }
            return "N_ENGAGELAB_PRIVATES_CHANNEL_high_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
        }
        if (TextUtils.isEmpty(notificationMessage.getSound())) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_normal_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults();
        }
        return "N_ENGAGELAB_PRIVATES_CHANNEL_normal_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
    }

    private static int getChannelImportance(Context context, boolean z2, NotificationMessage notificationMessage) {
        return z2 ? notificationMessage.getPriority() != -2 ? 2 : 1 : getImportance(notificationMessage.getPriority());
    }

    private static String getChannelName(Context context, boolean z2, NotificationMessage notificationMessage) {
        if (z2) {
            int identifier = context.getResources().getIdentifier(CHANNEL_SILENCE, "string", context.getPackageName());
            return identifier > 0 ? context.getString(identifier) : "SILENCE";
        }
        int priority = notificationMessage.getPriority();
        int identifier2 = context.getResources().getIdentifier((priority == -2 || priority == -1) ? CHANNEL_LOW : (priority == 1 || priority == 2) ? CHANNEL_HIGH : CHANNEL_DEFAULT, "string", context.getPackageName());
        return identifier2 > 0 ? context.getString(identifier2) : "NORMAL";
    }

    private static int getImportance(int i) {
        if (i == -2) {
            return 1;
        }
        if (i == -1) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 3 : 5;
        }
        return 4;
    }
}
