package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/RescheduleMigration;", "Landroidx/room/migration/Migration;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RescheduleMigration extends Migration {

    /* JADX INFO: renamed from: c */
    public final Context f32689c;

    public RescheduleMigration(Context context, int i, int i2) {
        super(i, i2);
        this.f32689c = context;
    }

    @Override // androidx.room.migration.Migration
    /* JADX INFO: renamed from: a */
    public final void mo11850a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        if (this.f32000b >= 10) {
            frameworkSQLiteDatabase.mo11764P(new Object[]{"reschedule_needed", 1});
        } else {
            this.f32689c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
