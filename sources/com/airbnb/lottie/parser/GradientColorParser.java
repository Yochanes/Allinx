package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {

    /* JADX INFO: renamed from: a */
    public int f34782a;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        int i;
        int i2;
        int iArgb;
        int iArgb2;
        float fM12748d;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z2 = jsonReader.mo12714z() == JsonReader.Token.f34826a;
        if (z2) {
            jsonReader.mo12704a();
        }
        while (jsonReader.mo12708h()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo12710j()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f34782a = 2;
        }
        if (z2) {
            jsonReader.mo12706d();
        }
        if (this.f34782a == -1) {
            this.f34782a = arrayList.size() / 4;
        }
        int i5 = this.f34782a;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f34782a * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i4;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i3) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f2) {
                    fArr[i9] = f2 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            }
            i6++;
            i4 = i10;
            i3 = 1;
        }
        int i12 = i4;
        GradientColor gradientColor = new GradientColor(iArr, fArr);
        if (arrayList.size() <= i) {
            return gradientColor;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                i13++;
            }
            i++;
        }
        float[] fArrCopyOf = gradientColor.f34537a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f3 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f4 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f4) || f3 < f4) {
                    fArr4[i14] = f3;
                    i16++;
                } else if (Float.isNaN(f3) || f4 < f3) {
                    fArr4[i14] = f4;
                    i17++;
                } else {
                    fArr4[i14] = f3;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f5 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f5);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f5);
            int[] iArr3 = gradientColor.f34538b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f6 = fArr3[iBinarySearch2];
                if (iArr3.length >= 2 && f5 != fArr[i12]) {
                    for (int i19 = 1; i19 < i5; i19++) {
                        float f7 = fArr[i19];
                        if (f7 >= f5 || i19 == i5 - 1) {
                            int i20 = i19 - 1;
                            float f8 = fArr[i20];
                            float f9 = (f5 - f8) / (f7 - f8);
                            int i21 = iArr3[i19];
                            int i22 = iArr3[i20];
                            i2 = i5;
                            iArgb = Color.argb((int) (f6 * 255.0f), GammaEvaluator.m12734c(Color.red(i22), f9, Color.red(i21)), GammaEvaluator.m12734c(Color.green(i22), f9, Color.green(i21)), GammaEvaluator.m12734c(Color.blue(i22), f9, Color.blue(i21)));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i2 = i5;
                iArgb = iArr3[i12];
                iArr2[i18] = iArgb;
            } else {
                int i23 = iArr3[iBinarySearch];
                if (size >= 2 && f5 > fArr2[i12]) {
                    for (int i24 = 1; i24 < size; i24++) {
                        float f10 = fArr2[i24];
                        if (f10 >= f5 || i24 == size - 1) {
                            if (f10 <= f5) {
                                fM12748d = fArr3[i24];
                            } else {
                                int i25 = i24 - 1;
                                float f11 = fArr2[i25];
                                fM12748d = MiscUtils.m12748d(fArr3[i25], fArr3[i24], (f5 - f11) / (f10 - f11));
                            }
                            iArgb2 = Color.argb((int) (fM12748d * 255.0f), Color.red(i23), Color.green(i23), Color.blue(i23));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i23), Color.green(i23), Color.blue(i23));
                iArr2[i18] = iArgb2;
                i2 = i5;
            }
            i18++;
            i5 = i2;
        }
        return new GradientColor(iArr2, fArrCopyOf);
    }
}
