package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/Migration_4_5;", "Landroidx/room/migration/Migration;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Migration_4_5 extends Migration {

    /* JADX INFO: renamed from: c */
    public static final Migration_4_5 f32673c = new Migration_4_5(4, 5);

    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo11776r("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        frameworkSQLiteDatabase.mo11776r("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
