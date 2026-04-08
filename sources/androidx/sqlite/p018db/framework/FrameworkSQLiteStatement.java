package androidx.sqlite.p018db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: b */
    public final SQLiteStatement f32140b;

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f32140b = sQLiteStatement;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: W0 */
    public final long mo11782W0() {
        return this.f32140b.executeInsert();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: a0 */
    public final String mo11784a0() {
        return this.f32140b.simpleQueryForString();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public final void execute() {
        this.f32140b.execute();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: o */
    public final long mo11785o() {
        return this.f32140b.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    /* JADX INFO: renamed from: w */
    public final int mo11788w() {
        return this.f32140b.executeUpdateDelete();
    }
}
