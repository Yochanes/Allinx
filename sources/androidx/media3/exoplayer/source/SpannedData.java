package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SpannedData<V> {

    /* JADX INFO: renamed from: c */
    public final C1893l f27443c;

    /* JADX INFO: renamed from: b */
    public final SparseArray f27442b = new SparseArray();

    /* JADX INFO: renamed from: a */
    public int f27441a = -1;

    public SpannedData(C1893l c1893l) {
        this.f27443c = c1893l;
    }

    /* JADX INFO: renamed from: a */
    public final Object m10582a(int i) {
        SparseArray sparseArray;
        if (this.f27441a == -1) {
            this.f27441a = 0;
        }
        while (true) {
            int i2 = this.f27441a;
            sparseArray = this.f27442b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f27441a--;
        }
        while (this.f27441a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f27441a + 1)) {
            this.f27441a++;
        }
        return sparseArray.valueAt(this.f27441a);
    }
}
