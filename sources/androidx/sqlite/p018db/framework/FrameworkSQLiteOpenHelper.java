package androidx.sqlite.p018db.framework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Companion", "DBRefHolder", "OpenHelper", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final Context f32114a;

    /* JADX INFO: renamed from: b */
    public final String f32115b;

    /* JADX INFO: renamed from: c */
    public final SupportSQLiteOpenHelper.Callback f32116c;

    /* JADX INFO: renamed from: d */
    public final boolean f32117d;

    /* JADX INFO: renamed from: f */
    public final boolean f32118f;

    /* JADX INFO: renamed from: g */
    public final Lazy f32119g;

    /* JADX INFO: renamed from: i */
    public boolean f32120i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DBRefHolder {

        /* JADX INFO: renamed from: a */
        public FrameworkSQLiteDatabase f32121a = null;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "CallbackException", "CallbackName", "Companion", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ int f32122j = 0;

        /* JADX INFO: renamed from: a */
        public final Context f32123a;

        /* JADX INFO: renamed from: b */
        public final DBRefHolder f32124b;

        /* JADX INFO: renamed from: c */
        public final SupportSQLiteOpenHelper.Callback f32125c;

        /* JADX INFO: renamed from: d */
        public final boolean f32126d;

        /* JADX INFO: renamed from: f */
        public boolean f32127f;

        /* JADX INFO: renamed from: g */
        public final ProcessLock f32128g;

        /* JADX INFO: renamed from: i */
        public boolean f32129i;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class CallbackException extends RuntimeException {

            /* JADX INFO: renamed from: a */
            public final CallbackName f32130a;

            /* JADX INFO: renamed from: b */
            public final Throwable f32131b;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.f32130a = callbackName;
                this.f32131b = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f32131b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class CallbackName {

            /* JADX INFO: renamed from: a */
            public static final CallbackName f32132a;

            /* JADX INFO: renamed from: b */
            public static final CallbackName f32133b;

            /* JADX INFO: renamed from: c */
            public static final CallbackName f32134c;

            /* JADX INFO: renamed from: d */
            public static final CallbackName f32135d;

            /* JADX INFO: renamed from: f */
            public static final CallbackName f32136f;

            /* JADX INFO: renamed from: g */
            public static final /* synthetic */ CallbackName[] f32137g;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                f32132a = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                f32133b = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                f32134c = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                f32135d = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                f32136f = callbackName5;
                f32137g = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f32137g.clone();
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "sqlite-framework_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static FrameworkSQLiteDatabase m11942a(DBRefHolder refHolder, SQLiteDatabase sQLiteDatabase) {
                Intrinsics.m18599g(refHolder, "refHolder");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f32121a;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.f32112a.equals(sQLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
                refHolder.f32121a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, DBRefHolder dBRefHolder, SupportSQLiteOpenHelper.Callback callback, boolean z2) {
            String string;
            super(context, str, null, callback.f32099a, new C2199b(callback, dBRefHolder));
            Intrinsics.m18599g(callback, "callback");
            this.f32123a = context;
            this.f32124b = dBRefHolder;
            this.f32125c = callback;
            this.f32126d = z2;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.m18598f(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f32128g = new ProcessLock(string, context.getCacheDir(), false);
        }

        /* JADX INFO: renamed from: a */
        public final SupportSQLiteDatabase m11939a(boolean z2) {
            ProcessLock processLock = this.f32128g;
            try {
                processLock.m11943a((this.f32129i || getDatabaseName() == null) ? false : true);
                this.f32127f = false;
                SQLiteDatabase sQLiteDatabaseM11941d = m11941d(z2);
                if (!this.f32127f) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseM11942a = Companion.m11942a(this.f32124b, sQLiteDatabaseM11941d);
                    processLock.m11944b();
                    return frameworkSQLiteDatabaseM11942a;
                }
                close();
                SupportSQLiteDatabase supportSQLiteDatabaseM11939a = m11939a(z2);
                processLock.m11944b();
                return supportSQLiteDatabaseM11939a;
            } catch (Throwable th) {
                processLock.m11944b();
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public final SQLiteDatabase m11940b(boolean z2) {
            if (z2) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.m18598f(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.m18598f(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.f32128g;
            try {
                processLock.m11943a(processLock.f32145a);
                super.close();
                this.f32124b.f32121a = null;
                this.f32129i = false;
            } finally {
                processLock.m11944b();
            }
        }

        /* JADX INFO: renamed from: d */
        public final SQLiteDatabase m11941d(boolean z2) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z3 = this.f32129i;
            Context context = this.f32123a;
            if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m11940b(z2);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m11940b(z2);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        int iOrdinal = callbackException.f32130a.ordinal();
                        Throwable th2 = callbackException.f32131b;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f32126d) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return m11940b(z2);
                    } catch (CallbackException e) {
                        throw e.f32131b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db) {
            Intrinsics.m18599g(db, "db");
            boolean z2 = this.f32127f;
            SupportSQLiteOpenHelper.Callback callback = this.f32125c;
            if (!z2 && callback.f32099a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                callback.mo11829b(Companion.m11942a(this.f32124b, db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f32132a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.m18599g(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f32125c.mo11830c(Companion.m11942a(this.f32124b, sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f32133b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db, int i, int i2) {
            Intrinsics.m18599g(db, "db");
            this.f32127f = true;
            try {
                this.f32125c.mo11831d(Companion.m11942a(this.f32124b, db), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f32135d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db) {
            Intrinsics.m18599g(db, "db");
            if (!this.f32127f) {
                try {
                    this.f32125c.mo11832e(Companion.m11942a(this.f32124b, db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.f32136f, th);
                }
            }
            this.f32129i = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.m18599g(sqLiteDatabase, "sqLiteDatabase");
            this.f32127f = true;
            try {
                this.f32125c.mo11833f(Companion.m11942a(this.f32124b, sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f32134c, th);
            }
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2, boolean z3) {
        Intrinsics.m18599g(callback, "callback");
        this.f32114a = context;
        this.f32115b = str;
        this.f32116c = callback;
        this.f32117d = z2;
        this.f32118f = z3;
        this.f32119g = LazyKt.m18299b(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: c0 */
    public final SupportSQLiteDatabase mo11760c0() {
        return ((OpenHelper) this.f32119g.getValue()).m11939a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.f32119g;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getValue()).close();
        }
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        Lazy lazy = this.f32119g;
        if (lazy.isInitialized()) {
            OpenHelper sQLiteOpenHelper = (OpenHelper) lazy.getValue();
            Intrinsics.m18599g(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z2);
        }
        this.f32120i = z2;
    }
}
