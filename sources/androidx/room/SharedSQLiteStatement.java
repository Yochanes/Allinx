package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f31988a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f31989b;

    /* JADX INFO: renamed from: c */
    public final Lazy f31990c;

    public SharedSQLiteStatement(RoomDatabase database) {
        Intrinsics.m18599g(database, "database");
        this.f31988a = database;
        this.f31989b = new AtomicBoolean(false);
        this.f31990c = LazyKt.m18299b(new SharedSQLiteStatement$stmt$2(this));
    }

    /* JADX INFO: renamed from: a */
    public final SupportSQLiteStatement m11845a() {
        this.f31988a.m11810a();
        return this.f31989b.compareAndSet(false, true) ? (SupportSQLiteStatement) this.f31990c.getValue() : m11846b();
    }

    /* JADX INFO: renamed from: b */
    public final SupportSQLiteStatement m11846b() {
        String strMo11847c = mo11847c();
        RoomDatabase roomDatabase = this.f31988a;
        roomDatabase.getClass();
        roomDatabase.m11810a();
        roomDatabase.m11811b();
        return roomDatabase.m11816g().mo11760c0().mo11778y(strMo11847c);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo11847c();

    /* JADX INFO: renamed from: d */
    public final void m11848d(SupportSQLiteStatement statement) {
        Intrinsics.m18599g(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.f31990c.getValue())) {
            this.f31989b.set(false);
        }
    }
}
