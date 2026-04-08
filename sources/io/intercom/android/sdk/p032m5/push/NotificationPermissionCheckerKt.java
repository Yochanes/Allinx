package io.intercom.android.sdk.p032m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a$\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\nH\u0000¨\u0006\u000b"}, m18302d2 = {"showNotification", "", "context", "Landroid/content/Context;", "notificationId", "", "notification", "Landroid/app/Notification;", "showNotifications", "notifications", "", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(@NotNull Context context, int i, @NotNull Notification notification) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(notification, "notification");
        showNotifications(context, MapsKt.m18485h(new Pair(Integer.valueOf(i), notification)));
    }

    public static final void showNotifications(@NotNull Context context, @NotNull Map<Integer, ? extends Notification> notifications) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(notifications, "notifications");
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(context);
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.m7484a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            for (Map.Entry<Integer, ? extends Notification> entry : notifications.entrySet()) {
                notificationManagerCompat.m7467b(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
}
