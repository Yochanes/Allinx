package androidx.media3.p017ui;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerNotificationManager {

    /* JADX INFO: compiled from: Proguard */
    public final class BitmapCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CustomActionReceiver {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MediaDescriptionAdapter {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MediaStyle extends NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(null);
            notificationBuilderWithBuilderAccessor.mo7407a().setStyle(mediaStyle);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface NotificationListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PlayerListener implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: E */
        public final void mo9293E(Player.Events events) {
            if (events.m9349a(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }
}
