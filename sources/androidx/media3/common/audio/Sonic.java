package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import com.king.logx.logger.Logger;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Sonic {

    /* JADX INFO: renamed from: a */
    public final int f25458a;

    /* JADX INFO: renamed from: b */
    public final int f25459b;

    /* JADX INFO: renamed from: c */
    public final float f25460c;

    /* JADX INFO: renamed from: d */
    public final float f25461d;

    /* JADX INFO: renamed from: e */
    public final float f25462e;

    /* JADX INFO: renamed from: f */
    public final int f25463f;

    /* JADX INFO: renamed from: g */
    public final int f25464g;

    /* JADX INFO: renamed from: h */
    public final int f25465h;

    /* JADX INFO: renamed from: i */
    public final short[] f25466i;

    /* JADX INFO: renamed from: j */
    public short[] f25467j;

    /* JADX INFO: renamed from: k */
    public int f25468k;

    /* JADX INFO: renamed from: l */
    public short[] f25469l;

    /* JADX INFO: renamed from: m */
    public int f25470m;

    /* JADX INFO: renamed from: n */
    public short[] f25471n;

    /* JADX INFO: renamed from: o */
    public int f25472o;

    /* JADX INFO: renamed from: p */
    public int f25473p;

    /* JADX INFO: renamed from: q */
    public int f25474q;

    /* JADX INFO: renamed from: r */
    public int f25475r;

    /* JADX INFO: renamed from: s */
    public int f25476s;

    /* JADX INFO: renamed from: t */
    public int f25477t;

    /* JADX INFO: renamed from: u */
    public int f25478u;

    /* JADX INFO: renamed from: v */
    public int f25479v;

    /* JADX INFO: renamed from: w */
    public double f25480w;

    public Sonic(float f, int i, float f2, int i2, int i3) {
        this.f25458a = i;
        this.f25459b = i2;
        this.f25460c = f;
        this.f25461d = f2;
        this.f25462e = i / i3;
        this.f25463f = i / CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        int i4 = i / 65;
        this.f25464g = i4;
        int i5 = i4 * 2;
        this.f25465h = i5;
        this.f25466i = new short[i5];
        this.f25467j = new short[i5 * i2];
        this.f25469l = new short[i5 * i2];
        this.f25471n = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: e */
    public static void m9447e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9448a(short[] sArr, int i, int i2) {
        short[] sArrM9450c = m9450c(this.f25469l, this.f25470m, i2);
        this.f25469l = sArrM9450c;
        int i3 = this.f25459b;
        System.arraycopy(sArr, i * i3, sArrM9450c, this.f25470m * i3, i3 * i2);
        this.f25470m += i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m9449b(short[] sArr, int i, int i2) {
        int i3 = this.f25465h / i2;
        int i4 = this.f25459b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f25466i[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m9450c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f25459b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: d */
    public final int m9451d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f25459b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f25478u = i6 / i7;
        this.f25479v = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: f */
    public final void m9452f() {
        float f;
        double d;
        int iM9451d;
        int i;
        int i2;
        int iRound;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6 = this.f25470m;
        float f2 = this.f25460c;
        float f3 = this.f25461d;
        double d2 = f2 / f3;
        float f4 = this.f25462e * f3;
        int i7 = this.f25458a;
        int i8 = this.f25459b;
        int i9 = 0;
        int i10 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i11 = this.f25468k;
            int i12 = this.f25465h;
            if (i11 >= i12) {
                int i13 = 0;
                while (true) {
                    int i14 = this.f25475r;
                    if (i14 > 0) {
                        int iMin = Math.min(i12, i14);
                        m9448a(this.f25467j, i13, iMin);
                        this.f25475r -= iMin;
                        i13 += iMin;
                        f = f4;
                        d = d2;
                    } else {
                        short[] sArr = this.f25467j;
                        int i15 = i7 > 4000 ? i7 / Logger.MAX_LOG_LENGTH : i10;
                        int i16 = this.f25464g;
                        int i17 = this.f25463f;
                        if (i8 == i10 && i15 == i10) {
                            iM9451d = m9451d(sArr, i13, i17, i16);
                            f = f4;
                            d = d2;
                        } else {
                            m9449b(sArr, i13, i15);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.f25466i;
                            int iM9451d2 = m9451d(sArr2, i9, i17 / i15, i16 / i15);
                            if (i15 != 1) {
                                int i18 = iM9451d2 * i15;
                                int i19 = i15 * 4;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                if (i20 >= i17) {
                                    i17 = i20;
                                }
                                if (i21 <= i16) {
                                    i16 = i21;
                                }
                                if (i8 == 1) {
                                    iM9451d = m9451d(sArr, i13, i17, i16);
                                } else {
                                    m9449b(sArr, i13, 1);
                                    iM9451d = m9451d(sArr2, i9, i17, i16);
                                }
                            } else {
                                iM9451d = iM9451d2;
                            }
                        }
                        int i22 = this.f25478u;
                        int i23 = this.f25479v;
                        if (i22 == 0 || (i = this.f25476s) == 0 || i23 > i22 * 3 || i22 * 2 <= this.f25477t * 3) {
                            i = iM9451d;
                        }
                        this.f25477t = i22;
                        this.f25476s = iM9451d;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f25467j;
                            if (d >= 2.0d) {
                                double d3 = (((double) i) / (d - 1.0d)) + this.f25480w;
                                iRound = (int) Math.round(d3);
                                this.f25480w = d3 - ((double) iRound);
                            } else {
                                double d4 = (((2.0d - d) * ((double) i)) / (d - 1.0d)) + this.f25480w;
                                int iRound2 = (int) Math.round(d4);
                                this.f25475r = iRound2;
                                this.f25480w = d4 - ((double) iRound2);
                                iRound = i;
                            }
                            short[] sArrM9450c = m9450c(this.f25469l, this.f25470m, iRound);
                            this.f25469l = sArrM9450c;
                            int i24 = i13 + i;
                            int i25 = i13;
                            int i26 = iRound;
                            m9447e(i26, this.f25459b, sArrM9450c, this.f25470m, sArr3, i25, sArr3, i24);
                            this.f25470m += i26;
                            i13 = i + i26 + i25;
                        } else {
                            int i27 = i13;
                            short[] sArr4 = this.f25467j;
                            if (d < 0.5d) {
                                double d5 = ((((double) i) * d) / (1.0d - d)) + this.f25480w;
                                int iRound3 = (int) Math.round(d5);
                                this.f25480w = d5 - ((double) iRound3);
                                i2 = iRound3;
                            } else {
                                double d6 = ((((d * 2.0d) - 1.0d) * ((double) i)) / (1.0d - d)) + this.f25480w;
                                int iRound4 = (int) Math.round(d6);
                                this.f25475r = iRound4;
                                this.f25480w = d6 - ((double) iRound4);
                                i2 = i;
                            }
                            int i28 = i + i2;
                            short[] sArrM9450c2 = m9450c(this.f25469l, this.f25470m, i28);
                            this.f25469l = sArrM9450c2;
                            System.arraycopy(sArr4, i27 * i8, sArrM9450c2, this.f25470m * i8, i * i8);
                            m9447e(i2, this.f25459b, this.f25469l, this.f25470m + i, sArr4, i27 + i, sArr4, i27);
                            this.f25470m += i28;
                            i13 = i27 + i2;
                        }
                    }
                    if (i13 + i12 > i11) {
                        break;
                    }
                    i9 = 0;
                    i10 = 1;
                    f4 = f;
                    d2 = d;
                }
                int i29 = this.f25468k - i13;
                short[] sArr5 = this.f25467j;
                System.arraycopy(sArr5, i13 * i8, sArr5, 0, i29 * i8);
                this.f25468k = i29;
            }
            if (f != 1.0f || this.f25470m == i6) {
            }
            long j3 = (long) (i7 / f);
            long j4 = i7;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i30 = this.f25470m - i6;
            short[] sArrM9450c3 = m9450c(this.f25471n, this.f25472o, i30);
            this.f25471n = sArrM9450c3;
            System.arraycopy(this.f25469l, i6 * i8, sArrM9450c3, this.f25472o * i8, i30 * i8);
            this.f25470m = i6;
            this.f25472o += i30;
            int i31 = 0;
            while (true) {
                i3 = this.f25472o;
                i4 = i3 - 1;
                if (i31 >= i4) {
                    break;
                }
                while (true) {
                    i5 = this.f25473p + 1;
                    j = i5;
                    long j5 = j * j3;
                    j2 = this.f25474q;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f25469l = m9450c(this.f25469l, this.f25470m, 1);
                    int i32 = 0;
                    while (i32 < i8) {
                        short[] sArr6 = this.f25469l;
                        int i33 = (this.f25470m * i8) + i32;
                        short[] sArr7 = this.f25471n;
                        int i34 = (i31 * i8) + i32;
                        short s = sArr7[i34];
                        short s2 = sArr7[i34 + i8];
                        long j6 = ((long) this.f25474q) * j4;
                        int i35 = this.f25473p;
                        long j7 = j3;
                        int i36 = i31;
                        long j8 = ((long) (i35 + 1)) * j7;
                        long j9 = j8 - j6;
                        long j10 = j8 - (((long) i35) * j7);
                        sArr6[i33] = (short) ((((j10 - j9) * ((long) s2)) + (((long) s) * j9)) / j10);
                        i32++;
                        i31 = i36;
                        j3 = j7;
                    }
                    this.f25474q++;
                    this.f25470m++;
                    i31 = i31;
                    j3 = j3;
                }
                long j11 = j3;
                int i37 = i31;
                this.f25473p = i5;
                if (j == j4) {
                    this.f25473p = 0;
                    Assertions.m9464e(j2 == j11);
                    this.f25474q = 0;
                }
                i31 = i37 + 1;
                j3 = j11;
            }
            if (i4 == 0) {
                return;
            }
            short[] sArr8 = this.f25471n;
            System.arraycopy(sArr8, i4 * i8, sArr8, 0, (i3 - i4) * i8);
            this.f25472o -= i4;
            return;
        }
        m9448a(this.f25467j, 0, this.f25468k);
        this.f25468k = 0;
        f = f4;
        if (f != 1.0f) {
        }
    }
}
