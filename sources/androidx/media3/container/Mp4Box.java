package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class Mp4Box {

    /* JADX INFO: renamed from: a */
    public final int f25690a;

    /* JADX INFO: compiled from: Proguard */
    public static final class ContainerBox extends Mp4Box {

        /* JADX INFO: renamed from: b */
        public final long f25691b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f25692c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f25693d;

        public ContainerBox(int i, long j) {
            super(i);
            this.f25691b = j;
            this.f25692c = new ArrayList();
            this.f25693d = new ArrayList();
        }

        /* JADX INFO: renamed from: b */
        public final ContainerBox m9641b(int i) {
            ArrayList arrayList = this.f25693d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContainerBox containerBox = (ContainerBox) arrayList.get(i2);
                if (containerBox.f25690a == i) {
                    return containerBox;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final LeafBox m9642c(int i) {
            ArrayList arrayList = this.f25692c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LeafBox leafBox = (LeafBox) arrayList.get(i2);
                if (leafBox.f25690a == i) {
                    return leafBox;
                }
            }
            return null;
        }

        @Override // androidx.media3.container.Mp4Box
        public final String toString() {
            return Mp4Box.m9640a(this.f25690a) + " leaves: " + Arrays.toString(this.f25692c.toArray()) + " containers: " + Arrays.toString(this.f25693d.toArray());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LeafBox extends Mp4Box {

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f25694b;

        public LeafBox(int i, ParsableByteArray parsableByteArray) {
            super(i);
            this.f25694b = parsableByteArray;
        }
    }

    public Mp4Box(int i) {
        this.f25690a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m9640a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return m9640a(this.f25690a);
    }
}
