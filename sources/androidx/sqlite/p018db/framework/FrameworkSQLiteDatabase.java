package androidx.sqlite.p018db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p018db.SimpleSQLiteQuery;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Api30Impl", "Companion", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: b */
    public static final String[] f32110b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    public static final String[] f32111c = new String[0];

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase f32112a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api30Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final void m11938a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] bindArgs) {
            Intrinsics.m18599g(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.m18599g(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.f32112a = sQLiteDatabase;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: D0 */
    public final boolean mo11761D0() {
        return this.f32112a.inTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: J */
    public final boolean mo11762J() {
        return this.f32112a.isReadOnly();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: K0 */
    public final boolean mo11763K0() {
        SQLiteDatabase sQLiteDatabase = this.f32112a;
        Intrinsics.m18599g(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: P */
    public final void mo11764P(Object[] bindArgs) {
        Intrinsics.m18599g(bindArgs, "bindArgs");
        this.f32112a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: P0 */
    public final void mo11765P0(long j) {
        this.f32112a.setPageSize(j);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: Q */
    public final void mo11766Q() {
        this.f32112a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: T */
    public final long mo11767T() {
        return this.f32112a.getMaximumSize();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: T0 */
    public final int mo11768T0(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f32110b[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementMo11778y = mo11778y(string);
        int length2 = objArr2.length;
        int i3 = 0;
        while (i3 < length2) {
            Object obj = objArr2[i3];
            i3++;
            if (obj == null) {
                supportSQLiteStatementMo11778y.mo11780A0(i3);
            } else if (obj instanceof byte[]) {
                supportSQLiteStatementMo11778y.mo11783Y(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteStatementMo11778y.mo11787v0(((Number) obj).floatValue(), i3);
            } else if (obj instanceof Double) {
                supportSQLiteStatementMo11778y.mo11787v0(((Number) obj).doubleValue(), i3);
            } else if (obj instanceof Long) {
                supportSQLiteStatementMo11778y.mo11781O(i3, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteStatementMo11778y.mo11781O(i3, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteStatementMo11778y.mo11781O(i3, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteStatementMo11778y.mo11781O(i3, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteStatementMo11778y.mo11786s(i3, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                supportSQLiteStatementMo11778y.mo11781O(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((FrameworkSQLiteStatement) supportSQLiteStatementMo11778y).f32140b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: U */
    public final void mo11769U() {
        this.f32112a.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: a */
    public final Cursor m11937a(String query) {
        Intrinsics.m18599g(query, "query");
        return mo11779z0(new SimpleSQLiteQuery(query));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32112a.close();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: d0 */
    public final boolean mo11770d0() {
        return this.f32112a.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.f32112a.getPageSize();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public final String getPath() {
        return this.f32112a.getPath();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.f32112a.getVersion();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: l */
    public final void mo11771l() {
        this.f32112a.beginTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: m0 */
    public final boolean mo11772m0() {
        return this.f32112a.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: n0 */
    public final void mo11773n0() {
        this.f32112a.endTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: p */
    public final List mo11774p() {
        return this.f32112a.getAttachedDbs();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: q */
    public final void mo11775q(int i) {
        this.f32112a.setVersion(i);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: r */
    public final void mo11776r(String sql) {
        Intrinsics.m18599g(sql, "sql");
        this.f32112a.execSQL(sql);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: v */
    public final boolean mo11777v() {
        return this.f32112a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: y */
    public final SupportSQLiteStatement mo11778y(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f32112a.compileStatement(str);
        Intrinsics.m18598f(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: z0 */
    public final Cursor mo11779z0(SupportSQLiteQuery supportSQLiteQuery) {
        Cursor cursorRawQueryWithFactory = this.f32112a.rawQueryWithFactory(new C2198a(new FrameworkSQLiteDatabase$query$cursorFactory$1(supportSQLiteQuery)), supportSQLiteQuery.getF32098a(), f32111c, null);
        Intrinsics.m18598f(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }
}
