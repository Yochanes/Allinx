package io.intercom.android.sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomPushManager {
    public static final String HOST_APP_INTENT = "host_app_intent";
    public static final String INTERCOM_PUSH_KEY = "intercom_push_key";
    public static final String INTERCOM_PUSH_PATH = "intercom_push_notification_path";
    public static final String MULTIPLE_NOTIFICATIONS = "multiple_notifications";
    private static final String PREFS_SENDER_ID = "intercom_sender_id";
    public static final String PUSH_ONLY_CONVO_ID = "push_only_convo_id";
    public static final String PUSH_ONLY_INSTANCE_ID = "push_only_instance_id";
    private static final Twig TWIG = LumberMill.getLogger();

    /* JADX INFO: compiled from: Proguard */
    public enum IntercomPushIntegrationType {
        FCM,
        NONE
    }

    public static void cacheSenderId(Context context, String str) {
        context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0).edit().putString(PREFS_SENDER_ID, str).apply();
    }

    private static boolean fcmModuleInstalled() {
        return getFcmServiceClass() != null;
    }

    @Nullable
    private static Class getFcmServiceClass() {
        try {
            return Class.forName("io.intercom.android.sdk.fcm.IntercomFcmMessengerService");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static IntercomPushIntegrationType getInstalledModuleType() {
        IntercomPushIntegrationType intercomPushIntegrationType = IntercomPushIntegrationType.NONE;
        if (!fcmModuleInstalled()) {
            return intercomPushIntegrationType;
        }
        TWIG.internal("FCM is installed");
        return IntercomPushIntegrationType.FCM;
    }

    public static void initializeFcmService(Application application) {
        Class fcmServiceClass = getFcmServiceClass();
        if (fcmServiceClass != null) {
            try {
                fcmServiceClass.getDeclaredMethod("initialize", Application.class).invoke(null, application);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                TWIG.internal("FCM is installed but initialize method was not found");
            }
        }
    }
}
