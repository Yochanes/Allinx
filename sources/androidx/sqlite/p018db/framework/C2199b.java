package androidx.sqlite.p018db.framework;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2199b implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SupportSQLiteOpenHelper.Callback f32142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameworkSQLiteOpenHelper.DBRefHolder f32143b;

    public /* synthetic */ C2199b(SupportSQLiteOpenHelper.Callback callback, FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder) {
        this.f32142a = callback;
        this.f32143b = dBRefHolder;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase dbObj) {
        int i = FrameworkSQLiteOpenHelper.OpenHelper.f32122j;
        SupportSQLiteOpenHelper.Callback callback = this.f32142a;
        Intrinsics.m18599g(callback, "$callback");
        FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder = this.f32143b;
        Intrinsics.m18598f(dbObj, "dbObj");
        FrameworkSQLiteDatabase frameworkSQLiteDatabaseM11942a = FrameworkSQLiteOpenHelper.OpenHelper.Companion.m11942a(dBRefHolder, dbObj);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseM11942a + ".path");
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabaseM11942a.f32112a;
        if (!sQLiteDatabase.isOpen()) {
            String path = sQLiteDatabase.getPath();
            if (path != null) {
                SupportSQLiteOpenHelper.Callback.m11935a(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                frameworkSQLiteDatabaseM11942a.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    Object obj = ((Pair) it.next()).second;
                    Intrinsics.m18598f(obj, "p.second");
                    SupportSQLiteOpenHelper.Callback.m11935a((String) obj);
                }
            } else {
                String path2 = sQLiteDatabase.getPath();
                if (path2 != null) {
                    SupportSQLiteOpenHelper.Callback.m11935a(path2);
                }
            }
        }
    }
}
