package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WorkDatabase_AutoMigration_17_18_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo11776r("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        frameworkSQLiteDatabase.mo11776r("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
