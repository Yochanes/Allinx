package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* JADX INFO: compiled from: Proguard */
    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Distance distance) {
            return compareTo2(distance);
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
        double[][] dArr;
        char c2 = 1;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i2 = 0;
        for (int i3 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i3));
            if (num == null) {
                dArr2[i2] = pointProviderLab.fromInt(i3);
                iArr3[i2] = i3;
                i2++;
                linkedHashMap.put(Integer.valueOf(i3), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i3), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr4[i4] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i4]))).intValue();
        }
        int iMin = Math.min(i, i2);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            dArr3[i6] = pointProviderLab.fromInt(iArr2[i6]);
            i5++;
        }
        int i7 = iMin - i5;
        if (i7 > 0) {
            for (int i8 = 0; i8 < i7; i8++) {
            }
        }
        int[] iArr5 = new int[i2];
        for (int i9 = 0; i9 < i2; i9++) {
            iArr5[i9] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i10 = 0; i10 < iMin; i10++) {
            iArr6[i10] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i11 = 0; i11 < iMin; i11++) {
            distanceArr[i11] = new Distance[iMin];
            for (int i12 = 0; i12 < iMin; i12++) {
                distanceArr[i11][i12] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i13 = 0;
        while (true) {
            if (i13 >= 10) {
                dArr = dArr3;
                break;
            }
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = i14 + 1;
                int i16 = i15;
                while (i16 < iMin) {
                    char c3 = c2;
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr3[i14], dArr3[i16]);
                    Distance distance = distanceArr[i16][i14];
                    distance.distance = dDistance;
                    distance.index = i14;
                    Distance distance2 = distanceArr[i14][i16];
                    distance2.distance = dDistance;
                    distance2.index = i16;
                    i16++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c2 = c3;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c4 = c2;
                Arrays.sort(distanceArr[i14]);
                for (int i17 = 0; i17 < iMin; i17++) {
                    iArr6[i14][i17] = distanceArr[i14][i17].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i14 = i15;
                c2 = c4;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c5 = c2;
            int i18 = 0;
            int i19 = 0;
            while (i18 < i2) {
                double[] dArr4 = dArr2[i18];
                int i20 = iArr12[i18];
                double dDistance2 = pointProviderLab.distance(dArr4, dArr3[i20]);
                int i21 = i18;
                double d = dDistance2;
                int i22 = -1;
                int i23 = 0;
                while (i23 < iMin) {
                    int i24 = i19;
                    double[][] dArr5 = dArr2;
                    double[][] dArr6 = dArr3;
                    if (distanceArr[i20][i23].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr4, dArr6[i23]);
                        if (dDistance3 < d) {
                            d = dDistance3;
                            i22 = i23;
                        }
                    }
                    i23++;
                    dArr2 = dArr5;
                    i19 = i24;
                    dArr3 = dArr6;
                }
                int i25 = i19;
                double[][] dArr7 = dArr2;
                double[][] dArr8 = dArr3;
                if (i22 == -1 || Math.abs(Math.sqrt(d) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i19 = i25;
                } else {
                    i19 = i25 + 1;
                    iArr12[i21] = i22;
                }
                i18 = i21 + 1;
                dArr2 = dArr7;
                dArr3 = dArr8;
            }
            double[][] dArr9 = dArr2;
            dArr = dArr3;
            if (i19 == 0 && i13 != 0) {
                break;
            }
            double[] dArr10 = new double[iMin];
            double[] dArr11 = new double[iMin];
            double[] dArr12 = new double[iMin];
            char c6 = 0;
            Arrays.fill(iArr7, 0);
            int i26 = 0;
            while (i26 < i2) {
                int i27 = iArr12[i26];
                double[] dArr13 = dArr9[i26];
                int i28 = iArr11[i26];
                iArr7[i27] = iArr7[i27] + i28;
                double d2 = i28;
                dArr10[i27] = (dArr13[c6] * d2) + dArr10[i27];
                dArr11[i27] = (dArr13[c5] * d2) + dArr11[i27];
                dArr12[i27] = (dArr13[2] * d2) + dArr12[i27];
                i26++;
                distanceArr = distanceArr;
                c6 = 0;
            }
            Distance[][] distanceArr2 = distanceArr;
            for (int i29 = 0; i29 < iMin; i29++) {
                int i30 = iArr7[i29];
                if (i30 == 0) {
                    dArr[i29] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d3 = i30;
                    double d4 = dArr10[i29] / d3;
                    double d5 = dArr11[i29] / d3;
                    double d6 = dArr12[i29] / d3;
                    double[] dArr14 = dArr[i29];
                    dArr14[0] = d4;
                    dArr14[c5] = d5;
                    dArr14[2] = d6;
                }
            }
            i13++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            distanceArr = distanceArr2;
            c2 = c5;
            dArr2 = dArr9;
            dArr3 = dArr;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i31 = 0; i31 < iMin; i31++) {
            int i32 = iArr7[i31];
            if (i32 != 0) {
                int i33 = pointProviderLab.toInt(dArr[i31]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i33))) {
                    linkedHashMap2.put(Integer.valueOf(i33), Integer.valueOf(i32));
                }
            }
        }
        return linkedHashMap2;
    }
}
