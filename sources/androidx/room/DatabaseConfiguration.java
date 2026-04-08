package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/DatabaseConfiguration;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class DatabaseConfiguration {

    /* JADX INFO: renamed from: a */
    public final Context f31876a;

    /* JADX INFO: renamed from: b */
    public final String f31877b;

    /* JADX INFO: renamed from: c */
    public final SupportSQLiteOpenHelper.Factory f31878c;

    /* JADX INFO: renamed from: d */
    public final RoomDatabase.MigrationContainer f31879d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f31880e;

    /* JADX INFO: renamed from: f */
    public final boolean f31881f;

    /* JADX INFO: renamed from: g */
    public final RoomDatabase.JournalMode f31882g;

    /* JADX INFO: renamed from: h */
    public final Executor f31883h;

    /* JADX INFO: renamed from: i */
    public final Executor f31884i;

    /* JADX INFO: renamed from: j */
    public final boolean f31885j;

    /* JADX INFO: renamed from: k */
    public final boolean f31886k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashSet f31887l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f31888m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f31889n;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, ArrayList arrayList, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z3, boolean z4, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.m18599g(migrationContainer, "migrationContainer");
        Intrinsics.m18599g(queryExecutor, "queryExecutor");
        Intrinsics.m18599g(transactionExecutor, "transactionExecutor");
        Intrinsics.m18599g(typeConverters, "typeConverters");
        Intrinsics.m18599g(autoMigrationSpecs, "autoMigrationSpecs");
        this.f31876a = context;
        this.f31877b = str;
        this.f31878c = factory;
        this.f31879d = migrationContainer;
        this.f31880e = arrayList;
        this.f31881f = z2;
        this.f31882g = journalMode;
        this.f31883h = queryExecutor;
        this.f31884i = transactionExecutor;
        this.f31885j = z3;
        this.f31886k = z4;
        this.f31887l = linkedHashSet;
        this.f31888m = typeConverters;
        this.f31889n = autoMigrationSpecs;
    }
}
