package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: A0 */
    public final void mo11780A0(int i) {
        m11807a(i, null);
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: O */
    public final void mo11781O(int i, long j) {
        m11807a(i, Long.valueOf(j));
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: W0 */
    public final long mo11782W0() {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: Y */
    public final void mo11783Y(int i, byte[] bArr) {
        m11807a(i, bArr);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m11807a(int i, Object obj) {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: a0 */
    public final String mo11784a0() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public final void execute() {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: o */
    public final long mo11785o() {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: s */
    public final void mo11786s(int i, String value) {
        Intrinsics.m18599g(value, "value");
        m11807a(i, value);
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: v0 */
    public final void mo11787v0(double d, int i) {
        m11807a(i, Double.valueOf(d));
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: w */
    public final int mo11788w() {
        throw null;
    }
}
