package com.exchange.allin.utils;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p044io.CloseableKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/utils/VersionHelper$completeReceiver$1", "Landroid/content/BroadcastReceiver;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class VersionHelper$completeReceiver$1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IOException {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(intent, "intent");
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            VersionHelper$completeReceiver$1 versionHelper$completeReceiver$1 = VersionHelper.f41617a;
            if (0 == intent.getLongExtra("extra_download_id", -1L)) {
                LoggerKt.m14181a(13, "下载完成。。。", "VersionHelper");
                context.unregisterReceiver(VersionHelper.f41617a);
                Object systemService = context.getSystemService("download");
                Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(0);
                Cursor cursorQuery = ((DownloadManager) systemService).query(query);
                try {
                    Cursor cursor = cursorQuery;
                    if (cursor.moveToFirst()) {
                        Uri uri = Uri.parse(cursor.getString(cursor.getColumnIndex("local_uri")));
                        Intrinsics.m18598f(uri, "parse(...)");
                        VersionHelper.m14188b(context, uri);
                    }
                    CloseableKt.m18567a(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m18567a(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        }
    }
}
