package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/QueryInterceptorOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class QueryInterceptorOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    @Override // androidx.room.DelegatingOpenHelper
    /* JADX INFO: renamed from: a */
    public final SupportSQLiteOpenHelper mo11759a() {
        return null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: c0 */
    public final SupportSQLiteDatabase mo11760c0() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        throw null;
    }
}
