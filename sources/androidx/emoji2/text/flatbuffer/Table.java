package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Table {

    /* JADX INFO: renamed from: a */
    public int f24372a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f24373b;

    /* JADX INFO: renamed from: c */
    public int f24374c;

    /* JADX INFO: renamed from: d */
    public int f24375d;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.Table$1 */
    /* JADX INFO: compiled from: Proguard */
    class C16411 implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            throw null;
        }
    }

    public Table() {
        if (Utf8.f24376a == null) {
            Utf8.f24376a = new Utf8Safe();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8830a(int i) {
        if (i < this.f24375d) {
            return this.f24373b.getShort(this.f24374c + i);
        }
        return 0;
    }
}
