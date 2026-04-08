package androidx.sqlite.p018db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2198a implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function4 f32141a;

    public /* synthetic */ C2198a(Function4 function4) {
        this.f32141a = function4;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Function4 tmp0 = this.f32141a;
        Intrinsics.m18599g(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
