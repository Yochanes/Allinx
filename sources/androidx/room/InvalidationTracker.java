package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/room/InvalidationTracker;", "", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public class InvalidationTracker {

    /* JADX INFO: renamed from: n */
    public static final String[] f31901n = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f31902a;

    /* JADX INFO: renamed from: b */
    public final HashMap f31903b;

    /* JADX INFO: renamed from: c */
    public final HashMap f31904c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f31905d;

    /* JADX INFO: renamed from: e */
    public final String[] f31906e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f31907f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public volatile boolean f31908g;

    /* JADX INFO: renamed from: h */
    public volatile SupportSQLiteStatement f31909h;

    /* JADX INFO: renamed from: i */
    public final ObservedTableTracker f31910i;

    /* JADX INFO: renamed from: j */
    public final SafeIterableMap f31911j;

    /* JADX INFO: renamed from: k */
    public final Object f31912k;

    /* JADX INFO: renamed from: l */
    public final Object f31913l;

    /* JADX INFO: renamed from: m */
    public final InvalidationTracker$refreshRunnable$1 f31914m;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m18302d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m11801a(String tableName, String triggerType) {
            Intrinsics.m18599g(tableName, "tableName");
            Intrinsics.m18599g(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "Companion", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ObservedTableTracker {

        /* JADX INFO: renamed from: a */
        public final long[] f31915a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f31916b;

        /* JADX INFO: renamed from: c */
        public final int[] f31917c;

        /* JADX INFO: renamed from: d */
        public boolean f31918d;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public ObservedTableTracker(int i) {
            this.f31915a = new long[i];
            this.f31916b = new boolean[i];
            this.f31917c = new int[i];
        }

        /* JADX INFO: renamed from: a */
        public final int[] m11802a() {
            synchronized (this) {
                try {
                    if (!this.f31918d) {
                        return null;
                    }
                    long[] jArr = this.f31915a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z2 = jArr[i] > 0;
                        boolean[] zArr = this.f31916b;
                        if (z2 != zArr[i2]) {
                            int[] iArr = this.f31917c;
                            if (!z2) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.f31917c[i2] = 0;
                        }
                        zArr[i2] = z2;
                        i++;
                        i2 = i3;
                    }
                    this.f31918d = false;
                    return (int[]) this.f31917c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class Observer {

        /* JADX INFO: renamed from: a */
        public final String[] f31919a;

        public Observer(String[] tables) {
            Intrinsics.m18599g(tables, "tables");
            this.f31919a = tables;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo11790a(Set set);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ObserverWrapper {

        /* JADX INFO: renamed from: a */
        public final Observer f31920a;

        /* JADX INFO: renamed from: b */
        public final int[] f31921b;

        /* JADX INFO: renamed from: c */
        public final String[] f31922c;

        /* JADX INFO: renamed from: d */
        public final Set f31923d;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            this.f31920a = observer;
            this.f31921b = iArr;
            this.f31922c = strArr;
            this.f31923d = strArr.length == 0 ? EmptySet.f51498a : SetsKt.m18503g(strArr[0]);
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m11803a(Set invalidatedTablesIds) {
            Intrinsics.m18599g(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f31921b;
            int length = iArr.length;
            Set setM18497a = EmptySet.f51498a;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    int length2 = iArr.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                            setBuilder.add(this.f31922c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setM18497a = SetsKt.m18497a(setBuilder);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    setM18497a = this.f31923d;
                }
            }
            if (setM18497a.isEmpty()) {
                return;
            }
            this.f31920a.mo11790a(setM18497a);
        }

        /* JADX INFO: renamed from: b */
        public final void m11804b(String[] strArr) {
            String[] strArr2 = this.f31922c;
            int length = strArr2.length;
            Set setM18497a = EmptySet.f51498a;
            if (length != 0) {
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (StringsKt.m20442r(str2, str, true)) {
                                setBuilder.add(str2);
                            }
                        }
                    }
                    setM18497a = SetsKt.m18497a(setBuilder);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        if (StringsKt.m20442r(strArr[i], strArr2[0], true)) {
                            setM18497a = this.f31923d;
                            break;
                        }
                        i++;
                    }
                }
            }
            if (setM18497a.isEmpty()) {
                return;
            }
            this.f31920a.mo11790a(setM18497a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class WeakObserver extends Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        /* JADX INFO: renamed from: a */
        public final void mo11790a(Set tables) {
            Intrinsics.m18599g(tables, "tables");
            throw null;
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f31902a = roomDatabase;
        this.f31903b = map;
        this.f31904c = map2;
        this.f31910i = new ObservedTableTracker(strArr.length);
        new InvalidationLiveDataContainer(roomDatabase);
        this.f31911j = new SafeIterableMap();
        this.f31912k = new Object();
        this.f31913l = new Object();
        this.f31905d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale US = Locale.US;
            Intrinsics.m18598f(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.m18598f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f31905d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f31903b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(US);
                Intrinsics.m18598f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f31906e = strArr2;
        for (Map.Entry entry : this.f31903b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.m18598f(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            Intrinsics.m18598f(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f31905d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(US2);
                Intrinsics.m18598f(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f31905d;
                linkedHashMap.put(lowerCase4, MapsKt.m18482e(lowerCase3, linkedHashMap));
            }
        }
        this.f31914m = new InvalidationTracker$refreshRunnable$1(this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11796a() {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = this.f31902a.f31934a;
        if (!(frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.f32112a.isOpen())) {
            return false;
        }
        if (!this.f31908g) {
            this.f31902a.m11816g().mo11760c0();
        }
        if (this.f31908g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m11797b(Observer observer) {
        ObserverWrapper observerWrapper;
        boolean z2;
        synchronized (this.f31911j) {
            observerWrapper = (ObserverWrapper) this.f31911j.mo808d(observer);
        }
        if (observerWrapper != null) {
            ObservedTableTracker observedTableTracker = this.f31910i;
            int[] iArr = observerWrapper.f31921b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            observedTableTracker.getClass();
            Intrinsics.m18599g(tableIds, "tableIds");
            synchronized (observedTableTracker) {
                z2 = false;
                for (int i : tableIds) {
                    long[] jArr = observedTableTracker.f31915a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z2 = true;
                        observedTableTracker.f31918d = true;
                    }
                }
            }
            if (z2) {
                m11799d();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11798c(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.mo11776r("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f31906e[i];
        String[] strArr = f31901n;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.m11801a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.m18598f(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.mo11776r(str3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11799d() {
        RoomDatabase roomDatabase = this.f31902a;
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = roomDatabase.f31934a;
        if (frameworkSQLiteDatabase == null || !frameworkSQLiteDatabase.f32112a.isOpen()) {
            return;
        }
        m11800e(roomDatabase.m11816g().mo11760c0());
    }

    /* JADX INFO: renamed from: e */
    public final void m11800e(SupportSQLiteDatabase database) {
        Intrinsics.m18599g(database, "database");
        if (database.mo11761D0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f31902a.f31941h.readLock();
            Intrinsics.m18598f(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f31912k) {
                    int[] iArrM11802a = this.f31910i.m11802a();
                    if (iArrM11802a != null) {
                        if (database.mo11763K0()) {
                            database.mo11769U();
                        } else {
                            database.mo11771l();
                        }
                        try {
                            int length = iArrM11802a.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = iArrM11802a[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    m11798c(database, i2);
                                } else if (i3 == 2) {
                                    String str = this.f31906e[i2];
                                    String[] strArr = f31901n;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + Companion.m11801a(str, strArr[i5]);
                                        Intrinsics.m18598f(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.mo11776r(str2);
                                    }
                                }
                                i++;
                                i2 = i4;
                            }
                            database.mo11766Q();
                            database.mo11773n0();
                        } catch (Throwable th) {
                            database.mo11773n0();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
