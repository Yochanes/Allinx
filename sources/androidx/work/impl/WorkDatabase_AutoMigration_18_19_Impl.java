package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WorkDatabase_AutoMigration_18_19_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo11776r("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
