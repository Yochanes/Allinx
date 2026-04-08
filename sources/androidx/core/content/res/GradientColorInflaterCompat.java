package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
final class GradientColorInflaterCompat {

    /* JADX INFO: compiled from: Proguard */
    public static final class ColorStops {

        /* JADX INFO: renamed from: a */
        public final int[] f23169a;

        /* JADX INFO: renamed from: b */
        public final float[] f23170b;

        public ColorStops(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            this.f23169a = new int[size];
            this.f23170b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f23169a[i] = ((Integer) arrayList.get(i)).intValue();
                this.f23170b[i] = ((Float) arrayList2.get(i)).floatValue();
            }
        }

        public ColorStops(int i, int i2) {
            this.f23169a = new int[]{i, i2};
            this.f23170b = new float[]{0.0f, 1.0f};
        }

        public ColorStops(int i, int i2, int i3) {
            this.f23169a = new int[]{i, i2, i3};
            this.f23170b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
