package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/WorkMigration9To10;", "Landroidx/room/migration/Migration;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class WorkMigration9To10 extends Migration {

    /* JADX INFO: renamed from: c */
    public final Context f32739c;

    public WorkMigration9To10(Context context) {
        super(9, 10);
        this.f32739c = context;
    }

    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo11776r("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f32739c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            frameworkSQLiteDatabase.mo11771l();
            try {
                frameworkSQLiteDatabase.mo11764P(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                frameworkSQLiteDatabase.mo11764P(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                frameworkSQLiteDatabase.mo11766Q();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            frameworkSQLiteDatabase.mo11771l();
            try {
                frameworkSQLiteDatabase.mo11764P(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                frameworkSQLiteDatabase.mo11764P(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                frameworkSQLiteDatabase.mo11766Q();
            } finally {
            }
        }
    }
}
