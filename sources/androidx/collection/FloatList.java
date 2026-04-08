package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/FloatList;", "", "Landroidx/collection/MutableFloatList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class FloatList {

    /* JADX INFO: renamed from: a */
    public float[] f3665a;

    /* JADX INFO: renamed from: b */
    public int f3666b;

    public final boolean equals(Object obj) {
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i = floatList.f3666b;
            int i2 = this.f3666b;
            if (i == i2) {
                float[] fArr = this.f3665a;
                float[] fArr2 = floatList.f3665a;
                IntRange intRangeM18664k = RangesKt.m18664k(0, i2);
                int i3 = intRangeM18664k.f51685a;
                int i4 = intRangeM18664k.f51686b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f3665a;
        int i = this.f3666b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.f3665a;
        int i = this.f3666b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i2++;
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
