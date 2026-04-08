package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/IntList;", "", "Landroidx/collection/MutableIntList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class IntList {

    /* JADX INFO: renamed from: a */
    public int[] f3678a;

    /* JADX INFO: renamed from: b */
    public int f3679b;

    /* JADX INFO: renamed from: a */
    public final int m1988a(int i) {
        if (i >= 0 && i < this.f3679b) {
            return this.f3678a[i];
        }
        RuntimeHelpersKt.m2144b("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m1989b() {
        int i = this.f3679b;
        if (i != 0) {
            return this.f3678a[i - 1];
        }
        RuntimeHelpersKt.m2145c("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i = intList.f3679b;
            int i2 = this.f3679b;
            if (i == i2) {
                int[] iArr = this.f3678a;
                int[] iArr2 = intList.f3678a;
                IntRange intRangeM18664k = RangesKt.m18664k(0, i2);
                int i3 = intRangeM18664k.f51685a;
                int i4 = intRangeM18664k.f51686b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.f3678a;
        int i = this.f3679b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f3678a;
        int i = this.f3679b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
