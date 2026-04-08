package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p018db.SupportSQLiteProgram;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Binding", "Companion", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* JADX INFO: renamed from: n */
    public static final TreeMap f31979n = new TreeMap();

    /* JADX INFO: renamed from: a */
    public final int f31980a;

    /* JADX INFO: renamed from: b */
    public volatile String f31981b;

    /* JADX INFO: renamed from: c */
    public final long[] f31982c;

    /* JADX INFO: renamed from: d */
    public final double[] f31983d;

    /* JADX INFO: renamed from: f */
    public final String[] f31984f;

    /* JADX INFO: renamed from: g */
    public final byte[][] f31985g;

    /* JADX INFO: renamed from: i */
    public final int[] f31986i;

    /* JADX INFO: renamed from: j */
    public int f31987j;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface Binding {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m18302d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static RoomSQLiteQuery m11844a(int i, String query) {
            Intrinsics.m18599g(query, "query");
            TreeMap treeMap = RoomSQLiteQuery.f31979n;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i);
                    roomSQLiteQuery.f31981b = query;
                    roomSQLiteQuery.f31987j = i;
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery roomSQLiteQuery2 = (RoomSQLiteQuery) entryCeilingEntry.getValue();
                roomSQLiteQuery2.getClass();
                roomSQLiteQuery2.f31981b = query;
                roomSQLiteQuery2.f31987j = i;
                return roomSQLiteQuery2;
            }
        }
    }

    public RoomSQLiteQuery(int i) {
        this.f31980a = i;
        int i2 = i + 1;
        this.f31986i = new int[i2];
        this.f31982c = new long[i2];
        this.f31983d = new double[i2];
        this.f31984f = new String[i2];
        this.f31985g = new byte[i2][];
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: A0 */
    public final void mo11780A0(int i) {
        this.f31986i[i] = 1;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: O */
    public final void mo11781O(int i, long j) {
        this.f31986i[i] = 2;
        this.f31982c[i] = j;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: Y */
    public final void mo11783Y(int i, byte[] bArr) {
        this.f31986i[i] = 5;
        this.f31985g[i] = bArr;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
    /* JADX INFO: renamed from: a */
    public final String getF32098a() {
        String str = this.f31981b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
    /* JADX INFO: renamed from: b */
    public final void mo11843b(SupportSQLiteProgram supportSQLiteProgram) {
        int i = this.f31987j;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f31986i[i2];
            if (i3 == 1) {
                supportSQLiteProgram.mo11780A0(i2);
            } else if (i3 == 2) {
                supportSQLiteProgram.mo11781O(i2, this.f31982c[i2]);
            } else if (i3 == 3) {
                supportSQLiteProgram.mo11787v0(this.f31983d[i2], i2);
            } else if (i3 == 4) {
                String str = this.f31984f[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.mo11786s(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f31985g[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteProgram.mo11783Y(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void release() {
        TreeMap treeMap = f31979n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f31980a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.m18598f(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: s */
    public final void mo11786s(int i, String value) {
        Intrinsics.m18599g(value, "value");
        this.f31986i[i] = 4;
        this.f31984f[i] = value;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: v0 */
    public final void mo11787v0(double d, int i) {
        this.f31986i[i] = 3;
        this.f31983d[i] = d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
