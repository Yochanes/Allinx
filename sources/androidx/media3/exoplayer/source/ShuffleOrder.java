package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ShuffleOrder {

    /* JADX INFO: compiled from: Proguard */
    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a */
        public final Random f27396a;

        /* JADX INFO: renamed from: b */
        public final int[] f27397b;

        /* JADX INFO: renamed from: c */
        public final int[] f27398c;

        public DefaultShuffleOrder() {
            this(new Random());
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: a */
        public final int mo10573a() {
            int[] iArr = this.f27397b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: b */
        public final ShuffleOrder mo10574b(int i) {
            int[] iArr = this.f27397b;
            int[] iArr2 = new int[iArr.length - i];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 < 0 || i4 >= i) {
                    int i5 = i3 - i2;
                    if (i4 >= 0) {
                        i4 -= i;
                    }
                    iArr2[i5] = i4;
                } else {
                    i2++;
                }
            }
            return new DefaultShuffleOrder(iArr2, new Random(this.f27396a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: c */
        public final int mo10575c(int i) {
            int i2 = this.f27398c[i] - 1;
            if (i2 >= 0) {
                return this.f27397b[i2];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: d */
        public final int mo10576d(int i) {
            int i2 = this.f27398c[i] + 1;
            int[] iArr = this.f27397b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: e */
        public final ShuffleOrder mo10577e(int i) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            int i2 = 0;
            while (true) {
                random = this.f27396a;
                iArr = this.f27397b;
                if (i2 >= i) {
                    break;
                }
                iArr2[i2] = random.nextInt(iArr.length + 1);
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr3[i2] = iArr3[iNextInt];
                iArr3[iNextInt] = i2;
                i2 = i3;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length + i; i6++) {
                if (i4 >= i || i5 != iArr2[i4]) {
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    iArr4[i6] = i8;
                    if (i8 >= 0) {
                        iArr4[i6] = i8 + i;
                    }
                    i5 = i7;
                } else {
                    iArr4[i6] = iArr3[i4];
                    i4++;
                }
            }
            return new DefaultShuffleOrder(iArr4, new Random(random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: f */
        public final int mo10578f() {
            int[] iArr = this.f27397b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: g */
        public final ShuffleOrder mo10579g() {
            return new DefaultShuffleOrder(new Random(this.f27396a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.f27397b.length;
        }

        public DefaultShuffleOrder(int[] iArr, Random random) {
            this.f27397b = iArr;
            this.f27396a = random;
            this.f27398c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f27398c[iArr[i]] = i;
            }
        }

        public DefaultShuffleOrder(Random random) {
            this(new int[0], random);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a */
        public final int f27399a;

        public UnshuffledShuffleOrder(int i) {
            this.f27399a = i;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: a */
        public final int mo10573a() {
            return this.f27399a > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: b */
        public final ShuffleOrder mo10574b(int i) {
            return new UnshuffledShuffleOrder(this.f27399a - i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: c */
        public final int mo10575c(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: d */
        public final int mo10576d(int i) {
            int i2 = i + 1;
            if (i2 < this.f27399a) {
                return i2;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: e */
        public final ShuffleOrder mo10577e(int i) {
            return new UnshuffledShuffleOrder(this.f27399a + i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: f */
        public final int mo10578f() {
            int i = this.f27399a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        /* JADX INFO: renamed from: g */
        public final ShuffleOrder mo10579g() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.f27399a;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo10573a();

    /* JADX INFO: renamed from: b */
    ShuffleOrder mo10574b(int i);

    /* JADX INFO: renamed from: c */
    int mo10575c(int i);

    /* JADX INFO: renamed from: d */
    int mo10576d(int i);

    /* JADX INFO: renamed from: e */
    ShuffleOrder mo10577e(int i);

    /* JADX INFO: renamed from: f */
    int mo10578f();

    /* JADX INFO: renamed from: g */
    ShuffleOrder mo10579g();

    int getLength();
}
