package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/Migration_12_13;", "Landroidx/room/migration/Migration;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Migration_12_13 extends Migration {

    /* JADX INFO: renamed from: c */
    public static final Migration_12_13 f32668c = new Migration_12_13(12, 13);

    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo11776r("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        frameworkSQLiteDatabase.mo11776r("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
