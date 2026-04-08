package com.chiclaim.android.downloader;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.chiclaim.android.downloader.util.InstallUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/chiclaim/android/downloader/SystemDownloadReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class SystemDownloadReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri uriForDownloadedFile;
        if (intent == null || context == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra != -1) {
                Object systemService = context.getSystemService("download");
                DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
                if (downloadManager == null || (uriForDownloadedFile = downloadManager.getUriForDownloadedFile(longExtra)) == null) {
                    return;
                }
                context.startActivity(InstallUtils.m12872a(context, uriForDownloadedFile));
            }
        }
    }
}
