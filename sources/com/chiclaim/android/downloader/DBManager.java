package com.chiclaim.android.downloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DBManager;", "", "DBHelper", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class DBManager {

    /* JADX INFO: renamed from: a */
    public static final DBManager f35030a = new DBManager();

    /* JADX INFO: renamed from: b */
    public static DBHelper f35031b;

    /* JADX INFO: renamed from: a */
    public final synchronized DBHelper m12851a(Context context) {
        DBHelper dBHelper;
        try {
            Intrinsics.m18599g(context, "context");
            if (f35031b == null) {
                f35031b = new DBHelper(context, "download_db", null, 1);
            }
            dBHelper = f35031b;
            if (dBHelper == null) {
                Intrinsics.m18606n("dbHelper");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return dBHelper;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DBManager$DBHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class DBHelper extends SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE t_download(\n    id INTEGER PRIMARY KEY AUTOINCREMENT, \n    url TEXT, \n    fileName TEXT, \n    dest_uri TEXT, \n    ignore_local NUMERIC, \n    need_install NUMERIC, \n    notifier_visibility INTEGER, \n    notifier_title TEXT, \n    notifier_content TEXT, \n    totalBytes INTEGER, \n    status INTEGER)");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}
