package androidx.sqlite.p018db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p018db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: a */
    public final SQLiteProgram f32139a;

    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.f32139a = delegate;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: A0 */
    public final void mo11780A0(int i) {
        this.f32139a.bindNull(i);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: O */
    public final void mo11781O(int i, long j) {
        this.f32139a.bindLong(i, j);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: Y */
    public final void mo11783Y(int i, byte[] bArr) {
        this.f32139a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32139a.close();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: s */
    public final void mo11786s(int i, String value) {
        Intrinsics.m18599g(value, "value");
        this.f32139a.bindString(i, value);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: v0 */
    public final void mo11787v0(double d, int i) {
        this.f32139a.bindDouble(i, d);
    }
}
