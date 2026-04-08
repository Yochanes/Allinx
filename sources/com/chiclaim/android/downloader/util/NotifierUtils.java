package com.chiclaim.android.downloader.util;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.exchange.allin.R;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/NotifierUtils;", "", "Companion", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class NotifierUtils {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/NotifierUtils$Companion;", "", "", "CHANNEL_ID", "Ljava/lang/String;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m12876a(Context context, int i, int i2, int i3, CharSequence charSequence, String str, int i4, File file, String str2, int i5) {
            File file2 = (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : file;
            String str3 = (i5 & 256) == 0 ? str2 : null;
            Intrinsics.m18599g(context, "context");
            Object systemService = context.getApplicationContext().getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC2433a.m12771n();
                AbstractC2433a.m12776s(notificationManager, AbstractC2433a.m12760c(context.getString(R.string.downloader_notifier_channel_name)));
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "download_channel_normal");
            builder.f23007B.icon = i2;
            builder.f23014e = NotificationCompat.Builder.m7427b(charSequence);
            builder.m7429c(16, i4 == 8);
            builder.m7429c(2, i3 != 100);
            if (i3 >= 0) {
                builder.f23022m = NotificationCompat.Builder.m7427b(context.getString(R.string.downloader_notifier_subtext_placeholder, Integer.valueOf(i3)));
            }
            if (i4 == 2) {
                boolean z2 = i3 <= 0;
                builder.f23023n = 100;
                builder.f23024o = i3;
                builder.f23025p = z2;
            } else if (i4 != 8) {
                if (i4 == 16) {
                    Intent intent = new Intent(Intrinsics.m18604l(".file.download.DownloadService", context.getPackageName()));
                    intent.setPackage(context.getPackageName());
                    intent.putExtra(ImagesContract.URL, str3);
                    intent.putExtra("from", 2);
                    builder.f23016g = PendingIntent.getService(context, 1, intent, 201326592);
                }
            } else if (file2 != null) {
                builder.f23016g = PendingIntent.getActivity(context, 0, InstallUtils.m12873b(context, file2), 201326592);
            }
            if (str != null) {
                builder.f23015f = NotificationCompat.Builder.m7427b(str);
            }
            notificationManager.notify(i, builder.m7428a());
        }
    }
}
