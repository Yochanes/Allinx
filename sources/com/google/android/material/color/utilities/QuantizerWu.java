package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C38091 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction */
        static final /* synthetic */ int[] f42437x8739cebf;

        static {
            int[] iArr = new int[Direction.values().length];
            f42437x8739cebf = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42437x8739cebf[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42437x8739cebf[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i, int i2) {
            this.resultCount = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i, double d) {
            this.cutLocation = i;
            this.maximum = d;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = C38091.f42437x8739cebf[direction.ordinal()];
        if (i3 == 1) {
            i = (-iArr[getIndex(box.f42442r0, box.f42441g1, box.f42439b1)]) + iArr[getIndex(box.f42442r0, box.f42441g1, box.f42438b0)] + iArr[getIndex(box.f42442r0, box.f42440g0, box.f42439b1)];
            i2 = iArr[getIndex(box.f42442r0, box.f42440g0, box.f42438b0)];
        } else if (i3 == 2) {
            i = (-iArr[getIndex(box.f42443r1, box.f42440g0, box.f42439b1)]) + iArr[getIndex(box.f42443r1, box.f42440g0, box.f42438b0)] + iArr[getIndex(box.f42442r0, box.f42440g0, box.f42439b1)];
            i2 = iArr[getIndex(box.f42442r0, box.f42440g0, box.f42438b0)];
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i = (-iArr[getIndex(box.f42443r1, box.f42441g1, box.f42438b0)]) + iArr[getIndex(box.f42443r1, box.f42440g0, box.f42438b0)] + iArr[getIndex(box.f42442r0, box.f42441g1, box.f42438b0)];
            i2 = iArr[getIndex(box.f42442r0, box.f42440g0, box.f42438b0)];
        }
        return i - i2;
    }

    public static int getIndex(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = C38091.f42437x8739cebf[direction.ordinal()];
        if (i4 == 1) {
            i2 = (iArr[getIndex(i, box.f42441g1, box.f42439b1)] - iArr[getIndex(i, box.f42441g1, box.f42438b0)]) - iArr[getIndex(i, box.f42440g0, box.f42439b1)];
            i3 = iArr[getIndex(i, box.f42440g0, box.f42438b0)];
        } else if (i4 == 2) {
            i2 = (iArr[getIndex(box.f42443r1, i, box.f42439b1)] - iArr[getIndex(box.f42443r1, i, box.f42438b0)]) - iArr[getIndex(box.f42442r0, i, box.f42439b1)];
            i3 = iArr[getIndex(box.f42442r0, i, box.f42438b0)];
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i2 = (iArr[getIndex(box.f42443r1, box.f42441g1, i)] - iArr[getIndex(box.f42443r1, box.f42440g0, i)]) - iArr[getIndex(box.f42442r0, box.f42441g1, i)];
            i3 = iArr[getIndex(box.f42442r0, box.f42440g0, i)];
        }
        return i2 + i3;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f42443r1, box.f42441g1, box.f42439b1)] - iArr[getIndex(box.f42443r1, box.f42441g1, box.f42438b0)]) - iArr[getIndex(box.f42443r1, box.f42440g0, box.f42439b1)]) + iArr[getIndex(box.f42443r1, box.f42440g0, box.f42438b0)]) - iArr[getIndex(box.f42442r0, box.f42441g1, box.f42439b1)]) + iArr[getIndex(box.f42442r0, box.f42441g1, box.f42438b0)]) + iArr[getIndex(box.f42442r0, box.f42440g0, box.f42439b1)]) - iArr[getIndex(box.f42442r0, box.f42440g0, box.f42438b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i = iBlueFromArgb * iBlueFromArgb;
            dArr[index] = dArr[index] + ((double) ((i + (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb)) * iIntValue2));
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i2;
        this.cubes = new Box[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.cubes[i3] = new Box(null);
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f42443r1 = 32;
        box.f42441g1 = 32;
        box.f42439b1 = 32;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i5 >= i) {
                i2 = i;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i4], boxArr[i5]).booleanValue()) {
                Box box2 = this.cubes[i4];
                dArr[i4] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i5];
                dArr[i5] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= 0.0d) {
                i2 = i5 + 1;
                break;
            }
            i5++;
            i4 = i6;
        }
        return new CreateBoxesResult(i, i2);
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int index = getIndex(i, i3, i6);
                    i4 += this.weights[index];
                    i7 += this.momentsR[index];
                    i8 += this.momentsG[index];
                    i5 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i6] = iArr[i6] + i4;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int index2 = getIndex(i - 1, i3, i6);
                    int i9 = i6;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i9];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i9];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i9];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i9];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i9];
                    i6 = i9 + 1;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            Box box = this.cubes[i2];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | (-16777216) | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f42442r0 + 1, box.f42443r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f42440g0 + 1, box.f42441g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f42438b0 + 1, box.f42439b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d = maximizeResultMaximize.maximum;
        double d2 = maximizeResultMaximize2.maximum;
        double d3 = maximizeResultMaximize3.maximum;
        if (d < d2 || d < d3) {
            if (d2 >= d && d2 >= d3) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f42443r1 = box.f42443r1;
        box2.f42441g1 = box.f42441g1;
        box2.f42439b1 = box.f42439b1;
        int i = C38091.f42437x8739cebf[direction3.ordinal()];
        if (i == 1) {
            int i2 = maximizeResultMaximize.cutLocation;
            box.f42443r1 = i2;
            box2.f42442r0 = i2;
            box2.f42440g0 = box.f42440g0;
            box2.f42438b0 = box.f42438b0;
        } else if (i == 2) {
            int i3 = maximizeResultMaximize2.cutLocation;
            box.f42441g1 = i3;
            box2.f42442r0 = box.f42442r0;
            box2.f42440g0 = i3;
            box2.f42438b0 = box.f42438b0;
        } else if (i == 3) {
            int i4 = maximizeResultMaximize3.cutLocation;
            box.f42439b1 = i4;
            box2.f42442r0 = box.f42442r0;
            box2.f42440g0 = box.f42440g0;
            box2.f42438b0 = i4;
        }
        box.vol = (box.f42439b1 - box.f42438b0) * (box.f42441g1 - box.f42440g0) * (box.f42443r1 - box.f42442r0);
        box2.vol = (box2.f42439b1 - box2.f42438b0) * (box2.f42441g1 - box2.f42440g0) * (box2.f42443r1 - box2.f42442r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i7 = -1;
        double d = 0.0d;
        int i8 = i;
        while (i8 < i2) {
            int pVar = top(box2, direction, i8, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i8, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i8, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i8, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d2 = ((double) ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar)))) / ((double) pVar4);
                int i9 = i3 - pVar;
                int i10 = i4 - pVar2;
                int i11 = i5 - pVar3;
                int i12 = i6 - pVar4;
                if (i12 != 0) {
                    double d3 = (((double) ((i11 * i11) + ((i10 * i10) + (i9 * i9)))) / ((double) i12)) + d2;
                    if (d3 > d) {
                        i7 = i8;
                        d = d3;
                    }
                }
            }
            i8++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i7, d);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int i = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f42443r1, box.f42441g1, box.f42439b1)] - this.moments[getIndex(box.f42443r1, box.f42441g1, box.f42438b0)]) - this.moments[getIndex(box.f42443r1, box.f42440g0, box.f42439b1)]) + this.moments[getIndex(box.f42443r1, box.f42440g0, box.f42438b0)]) - this.moments[getIndex(box.f42442r0, box.f42441g1, box.f42439b1)]) + this.moments[getIndex(box.f42442r0, box.f42441g1, box.f42438b0)]) + this.moments[getIndex(box.f42442r0, box.f42440g0, box.f42439b1)]) - this.moments[getIndex(box.f42442r0, box.f42440g0, box.f42438b0)]) - (((double) (i + ((iVolume2 * iVolume2) + (iVolume * iVolume)))) / ((double) volume(box, this.weights)));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Box {

        /* JADX INFO: renamed from: b0 */
        int f42438b0;

        /* JADX INFO: renamed from: b1 */
        int f42439b1;

        /* JADX INFO: renamed from: g0 */
        int f42440g0;

        /* JADX INFO: renamed from: g1 */
        int f42441g1;

        /* JADX INFO: renamed from: r0 */
        int f42442r0;

        /* JADX INFO: renamed from: r1 */
        int f42443r1;
        int vol;

        private Box() {
            this.f42442r0 = 0;
            this.f42443r1 = 0;
            this.f42440g0 = 0;
            this.f42441g1 = 0;
            this.f42438b0 = 0;
            this.f42439b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(C38091 c38091) {
            this();
        }
    }
}
