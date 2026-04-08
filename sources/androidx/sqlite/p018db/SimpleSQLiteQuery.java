package androidx.sqlite.p018db;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Companion", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: a */
    public final String f32098a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SimpleSQLiteQuery(String query) {
        Intrinsics.m18599g(query, "query");
        this.f32098a = query;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF32098a() {
        return this.f32098a;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
    /* JADX INFO: renamed from: b */
    public final void mo11843b(SupportSQLiteProgram supportSQLiteProgram) {
    }
}
