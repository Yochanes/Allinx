package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelCompat {

    /* JADX INFO: renamed from: a */
    public final String f22973a;

    /* JADX INFO: renamed from: b */
    public String f22974b;

    /* JADX INFO: renamed from: c */
    public final int f22975c;

    /* JADX INFO: renamed from: d */
    public String f22976d;

    /* JADX INFO: renamed from: e */
    public final Uri f22977e = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* JADX INFO: renamed from: f */
    public final AudioAttributes f22978f;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static NotificationChannel m7408a(int i, String str, String str2) {
            return new NotificationChannel(str, str2, i);
        }

        /* JADX INFO: renamed from: b */
        public static void m7409b(NotificationChannel notificationChannel) {
            notificationChannel.enableLights(false);
        }

        /* JADX INFO: renamed from: c */
        public static void m7410c(NotificationChannel notificationChannel) {
            notificationChannel.enableVibration(false);
        }

        /* JADX INFO: renamed from: d */
        public static void m7411d(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        /* JADX INFO: renamed from: e */
        public static void m7412e(NotificationChannel notificationChannel) {
            notificationChannel.setGroup(null);
        }

        /* JADX INFO: renamed from: f */
        public static void m7413f(NotificationChannel notificationChannel) {
            notificationChannel.setLightColor(0);
        }

        /* JADX INFO: renamed from: g */
        public static void m7414g(NotificationChannel notificationChannel) {
            notificationChannel.setShowBadge(true);
        }

        /* JADX INFO: renamed from: h */
        public static void m7415h(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        /* JADX INFO: renamed from: i */
        public static void m7416i(NotificationChannel notificationChannel) {
            notificationChannel.setVibrationPattern(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final NotificationChannelCompat f22979a;

        public Builder(String str) {
            this.f22979a = new NotificationChannelCompat(str);
        }
    }

    public NotificationChannelCompat(String str) {
        str.getClass();
        this.f22973a = str;
        this.f22975c = 4;
        this.f22978f = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
