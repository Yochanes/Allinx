package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.activity.compose.C0044a;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.ExecutorC0154a;
import androidx.room.migration.Migration;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelperFactory;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m18302d2 = {"Landroidx/room/RoomDatabase;", "", "Builder", "Callback", "Companion", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: a */
    public volatile FrameworkSQLiteDatabase f31934a;

    /* JADX INFO: renamed from: b */
    public Executor f31935b;

    /* JADX INFO: renamed from: c */
    public SupportSQLiteOpenHelper f31936c;

    /* JADX INFO: renamed from: e */
    public boolean f31938e;

    /* JADX INFO: renamed from: f */
    public ArrayList f31939f;

    /* JADX INFO: renamed from: j */
    public final Map f31943j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f31944k;

    /* JADX INFO: renamed from: d */
    public final InvalidationTracker f31937d = mo11813d();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f31940g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final ReentrantReadWriteLock f31941h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f31942i = new ThreadLocal();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", "T", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class Builder<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a */
        public final Context f31945a;

        /* JADX INFO: renamed from: b */
        public final Class f31946b;

        /* JADX INFO: renamed from: c */
        public final String f31947c;

        /* JADX INFO: renamed from: g */
        public Executor f31951g;

        /* JADX INFO: renamed from: h */
        public Executor f31952h;

        /* JADX INFO: renamed from: i */
        public C0044a f31953i;

        /* JADX INFO: renamed from: j */
        public boolean f31954j;

        /* JADX INFO: renamed from: m */
        public boolean f31957m;

        /* JADX INFO: renamed from: q */
        public HashSet f31961q;

        /* JADX INFO: renamed from: d */
        public final ArrayList f31948d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final ArrayList f31949e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final ArrayList f31950f = new ArrayList();

        /* JADX INFO: renamed from: k */
        public final JournalMode f31955k = JournalMode.f31962a;

        /* JADX INFO: renamed from: l */
        public boolean f31956l = true;

        /* JADX INFO: renamed from: n */
        public final long f31958n = -1;

        /* JADX INFO: renamed from: o */
        public final MigrationContainer f31959o = new MigrationContainer();

        /* JADX INFO: renamed from: p */
        public final LinkedHashSet f31960p = new LinkedHashSet();

        public Builder(Context context, Class cls, String str) {
            this.f31945a = context;
            this.f31946b = cls;
            this.f31947c = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m11825a(Migration... migrationArr) {
            if (this.f31961q == null) {
                this.f31961q = new HashSet();
            }
            for (Migration migration : migrationArr) {
                HashSet hashSet = this.f31961q;
                Intrinsics.m18596d(hashSet);
                hashSet.add(Integer.valueOf(migration.f31999a));
                HashSet hashSet2 = this.f31961q;
                Intrinsics.m18596d(hashSet2);
                hashSet2.add(Integer.valueOf(migration.f32000b));
            }
            this.f31959o.m11828a((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
        }

        /* JADX INFO: renamed from: b */
        public final RoomDatabase m11826b() {
            boolean zContainsKey;
            Executor executor = this.f31951g;
            if (executor == null && this.f31952h == null) {
                ExecutorC0154a executorC0154a = ArchTaskExecutor.f1499c;
                this.f31952h = executorC0154a;
                this.f31951g = executorC0154a;
            } else if (executor != null && this.f31952h == null) {
                this.f31952h = executor;
            } else if (executor == null) {
                this.f31951g = this.f31952h;
            }
            HashSet hashSet = this.f31961q;
            LinkedHashSet linkedHashSet = this.f31960p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(AbstractC0000a.m9f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory frameworkSQLiteOpenHelperFactory = this.f31953i;
            if (frameworkSQLiteOpenHelperFactory == null) {
                frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            SupportSQLiteOpenHelper.Factory factory = frameworkSQLiteOpenHelperFactory;
            if (this.f31958n > 0) {
                if (this.f31947c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.f31948d;
            boolean z2 = this.f31954j;
            JournalMode journalMode = this.f31955k;
            journalMode.getClass();
            Context context = this.f31945a;
            JournalMode journalMode2 = JournalMode.f31962a;
            JournalMode journalMode3 = JournalMode.f31964c;
            if (journalMode == journalMode2) {
                Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.f31963b : journalMode3;
            }
            Executor executor2 = this.f31951g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f31952h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, this.f31947c, factory, this.f31959o, arrayList, z2, journalMode, executor2, executor3, this.f31956l, this.f31957m, linkedHashSet, this.f31949e, this.f31950f);
            Class cls = this.f31946b;
            Package r4 = cls.getPackage();
            Intrinsics.m18596d(r4);
            String fullPackage = r4.getName();
            String canonicalName = cls.getCanonicalName();
            Intrinsics.m18596d(canonicalName);
            Intrinsics.m18598f(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                Intrinsics.m18598f(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String strConcat = StringsKt.m20410H(canonicalName, '.', '_').concat("_Impl");
            try {
                Class<?> cls2 = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + '.' + strConcat, true, cls.getClassLoader());
                Intrinsics.m18597e(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                RoomDatabase roomDatabase = (RoomDatabase) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                roomDatabase.getClass();
                roomDatabase.f31936c = roomDatabase.mo11814e(databaseConfiguration);
                Set setMo11817h = roomDatabase.mo11817h();
                BitSet bitSet = new BitSet();
                Iterator it2 = setMo11817h.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = roomDatabase.f31940g;
                    ArrayList arrayList2 = databaseConfiguration.f31889n;
                    int i = -1;
                    if (zHasNext) {
                        Class cls3 = (Class) it2.next();
                        int size = arrayList2.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                if (cls3.isAssignableFrom(arrayList2.get(size).getClass())) {
                                    bitSet.set(size);
                                    i = size;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                        if (i < 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(cls3, arrayList2.get(i));
                    } else {
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        }
                        for (Migration migration : roomDatabase.mo11815f(linkedHashMap)) {
                            int i4 = migration.f31999a;
                            MigrationContainer migrationContainer = databaseConfiguration.f31879d;
                            LinkedHashMap linkedHashMap2 = migrationContainer.f31966a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                                Map mapM18481d = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                                if (mapM18481d == null) {
                                    mapM18481d = MapsKt.m18481d();
                                }
                                zContainsKey = mapM18481d.containsKey(Integer.valueOf(migration.f32000b));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                migrationContainer.m11828a(migration);
                            }
                        }
                        if (((AutoClosingRoomOpenHelper) RoomDatabase.m11809p(AutoClosingRoomOpenHelper.class, roomDatabase.m11816g())) != null) {
                            throw null;
                        }
                        roomDatabase.m11816g().setWriteAheadLoggingEnabled(databaseConfiguration.f31882g == journalMode3);
                        roomDatabase.f31939f = databaseConfiguration.f31880e;
                        roomDatabase.f31935b = databaseConfiguration.f31883h;
                        new TransactionExecutor(databaseConfiguration.f31884i);
                        roomDatabase.f31938e = databaseConfiguration.f31881f;
                        Map mapMo11818i = roomDatabase.mo11818i();
                        BitSet bitSet2 = new BitSet();
                        Iterator it3 = mapMo11818i.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            ArrayList arrayList3 = databaseConfiguration.f31888m;
                            if (!zHasNext2) {
                                int size3 = arrayList3.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i5 = size3 - 1;
                                        if (!bitSet2.get(size3)) {
                                            throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i5 < 0) {
                                            break;
                                        }
                                        size3 = i5;
                                    }
                                }
                                return roomDatabase;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            Class cls4 = (Class) entry.getKey();
                            for (Class cls5 : (List) entry.getValue()) {
                                int size4 = arrayList3.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i6 = size4 - 1;
                                        if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                            bitSet2.set(size4);
                                            break;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        size4 = i6;
                                    }
                                } else {
                                    size4 = -1;
                                }
                                if (!(size4 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                roomDatabase.f31944k.put(cls5, arrayList3.get(size4));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/room/RoomDatabase$Companion;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class JournalMode {

        /* JADX INFO: renamed from: a */
        public static final JournalMode f31962a;

        /* JADX INFO: renamed from: b */
        public static final JournalMode f31963b;

        /* JADX INFO: renamed from: c */
        public static final JournalMode f31964c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ JournalMode[] f31965d;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            f31962a = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            f31963b = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            f31964c = journalMode3;
            f31965d = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) f31965d.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class MigrationContainer {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f31966a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final void m11828a(Migration... migrations) {
            Intrinsics.m18599g(migrations, "migrations");
            for (Migration migration : migrations) {
                int i = migration.f31999a;
                LinkedHashMap linkedHashMap = this.f31966a;
                Integer numValueOf = Integer.valueOf(i);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i2 = migration.f32000b;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
                }
                treeMap2.put(Integer.valueOf(i2), migration);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface QueryCallback {
    }

    public RoomDatabase() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.m18598f(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f31943j = mapSynchronizedMap;
        this.f31944k = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: p */
    public static Object m11809p(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return m11809p(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).mo11759a());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m11810a() {
        if (!this.f31938e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11811b() {
        if (!m11816g().mo11760c0().mo11761D0() && this.f31942i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11812c() {
        m11810a();
        m11810a();
        SupportSQLiteDatabase supportSQLiteDatabaseMo11760c0 = m11816g().mo11760c0();
        this.f31937d.m11800e(supportSQLiteDatabaseMo11760c0);
        if (supportSQLiteDatabaseMo11760c0.mo11763K0()) {
            supportSQLiteDatabaseMo11760c0.mo11769U();
        } else {
            supportSQLiteDatabaseMo11760c0.mo11771l();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract InvalidationTracker mo11813d();

    /* JADX INFO: renamed from: e */
    public abstract SupportSQLiteOpenHelper mo11814e(DatabaseConfiguration databaseConfiguration);

    /* JADX INFO: renamed from: f */
    public List mo11815f(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.m18599g(autoMigrationSpecs, "autoMigrationSpecs");
        return EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: g */
    public final SupportSQLiteOpenHelper m11816g() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f31936c;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.m18606n("internalOpenHelper");
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public Set mo11817h() {
        return EmptySet.f51498a;
    }

    /* JADX INFO: renamed from: i */
    public Map mo11818i() {
        return MapsKt.m18481d();
    }

    /* JADX INFO: renamed from: j */
    public final void m11819j() {
        m11816g().mo11760c0().mo11773n0();
        if (m11816g().mo11760c0().mo11761D0()) {
            return;
        }
        InvalidationTracker invalidationTracker = this.f31937d;
        if (invalidationTracker.f31907f.compareAndSet(false, true)) {
            Executor executor = invalidationTracker.f31902a.f31935b;
            if (executor != null) {
                executor.execute(invalidationTracker.f31914m);
            } else {
                Intrinsics.m18606n("internalQueryExecutor");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11820k(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        InvalidationTracker invalidationTracker = this.f31937d;
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f31913l) {
            if (invalidationTracker.f31908g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            frameworkSQLiteDatabase.mo11776r("PRAGMA temp_store = MEMORY;");
            frameworkSQLiteDatabase.mo11776r("PRAGMA recursive_triggers='ON';");
            frameworkSQLiteDatabase.mo11776r("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.m11800e(frameworkSQLiteDatabase);
            invalidationTracker.f31909h = frameworkSQLiteDatabase.mo11778y("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f31908g = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Cursor m11821l(SupportSQLiteQuery supportSQLiteQuery) {
        m11810a();
        m11811b();
        return m11816g().mo11760c0().mo11779z0(supportSQLiteQuery);
    }

    /* JADX INFO: renamed from: m */
    public final Object m11822m(Callable callable) {
        m11812c();
        try {
            Object objCall = callable.call();
            m11824o();
            return objCall;
        } finally {
            m11819j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11823n(Runnable runnable) {
        m11812c();
        try {
            runnable.run();
            m11824o();
        } finally {
            m11819j();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11824o() {
        m11816g().mo11760c0().mo11766Q();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class Callback {
        /* JADX INFO: renamed from: a */
        public void mo11827a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }
}
