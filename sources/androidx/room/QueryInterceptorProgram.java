package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteProgram;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31933a = new ArrayList();

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: A0 */
    public final void mo11780A0(int i) {
        m11806a(i, null);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: O */
    public final void mo11781O(int i, long j) {
        m11806a(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: Y */
    public final void mo11783Y(int i, byte[] bArr) {
        m11806a(i, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m11806a(int i, Object obj) {
        int size;
        int i2 = i - 1;
        ArrayList arrayList = this.f31933a;
        if (i2 >= arrayList.size() && (size = arrayList.size()) <= i2) {
            while (true) {
                arrayList.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i2, obj);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: s */
    public final void mo11786s(int i, String str) {
        m11806a(i, str);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    /* JADX INFO: renamed from: v0 */
    public final void mo11787v0(double d, int i) {
        m11806a(i, Double.valueOf(d));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
