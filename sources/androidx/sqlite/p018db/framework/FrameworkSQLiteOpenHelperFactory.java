package androidx.sqlite.p018db.framework;

import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FrameworkSQLiteOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    /* JADX INFO: renamed from: e */
    public final SupportSQLiteOpenHelper mo189e(SupportSQLiteOpenHelper.Configuration configuration) {
        return new FrameworkSQLiteOpenHelper(configuration.f32100a, configuration.f32101b, configuration.f32102c, configuration.f32103d, configuration.f32104e);
    }
}
