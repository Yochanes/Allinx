package io.intercom.android.sdk.p032m5.push.p037ui;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.p032m5.push.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m18302d2 = {"createBaseNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "contentTitle", "", "contentText", "notificationChannel", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class BasePushUIKt {
    @NotNull
    public static final NotificationCompat.Builder createBaseNotificationBuilder(@NotNull Context context, @NotNull String contentTitle, @NotNull String contentText, @NotNull NotificationChannel notificationChannel) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(contentTitle, "contentTitle");
        Intrinsics.m18599g(contentText, "contentText");
        Intrinsics.m18599g(notificationChannel, "notificationChannel");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, notificationChannel.getChannelName());
        builder.f23014e = NotificationCompat.Builder.m7427b(contentTitle);
        builder.f23015f = NotificationCompat.Builder.m7427b(contentText);
        builder.f23007B.icon = C5101R.drawable.intercom_push_icon;
        builder.m7429c(16, true);
        return builder;
    }
}
