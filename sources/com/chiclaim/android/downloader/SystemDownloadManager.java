package com.chiclaim.android.downloader;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p044io.CloseableKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/SystemDownloadManager;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class SystemDownloadManager {

    /* JADX INFO: renamed from: a */
    public final Lazy f35077a;

    public SystemDownloadManager(Context context) {
        Intrinsics.m18599g(context, "context");
        this.f35077a = LazyKt.m18299b(new SystemDownloadManager$downloadManager$2(context));
    }

    /* JADX INFO: renamed from: a */
    public final DownloadInfo m12870a(long j) throws IOException {
        String string;
        int columnIndex;
        Cursor cursorQuery = ((DownloadManager) this.f35077a.getValue()).query(new DownloadManager.Query().setFilterById(j));
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            if (!cursorQuery.moveToFirst()) {
                cursor.close();
                return null;
            }
            DownloadInfo downloadInfo = new DownloadInfo();
            downloadInfo.f35037c = -1;
            int columnIndex2 = cursorQuery.getColumnIndex("bytes_so_far");
            if (columnIndex2 != -1) {
                downloadInfo.f35036b = cursorQuery.getLong(columnIndex2);
            }
            int columnIndex3 = cursorQuery.getColumnIndex("total_size");
            if (columnIndex3 != -1) {
                downloadInfo.f35035a = cursorQuery.getLong(columnIndex3);
            }
            int columnIndex4 = cursorQuery.getColumnIndex("status");
            if (columnIndex4 != -1) {
                downloadInfo.f35037c = cursorQuery.getInt(columnIndex4);
            }
            if (downloadInfo.f35037c == 16 && (columnIndex = cursorQuery.getColumnIndex("reason")) != -1) {
                downloadInfo.f35038d = cursorQuery.getString(columnIndex);
            }
            int columnIndex5 = cursorQuery.getColumnIndex("local_uri");
            if (columnIndex5 != -1 && (string = cursorQuery.getString(columnIndex5)) != null) {
                downloadInfo.f35039e = Uri.parse(string);
            }
            cursor.close();
            return downloadInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m18567a(cursor, th);
                throw th2;
            }
        }
    }
}
