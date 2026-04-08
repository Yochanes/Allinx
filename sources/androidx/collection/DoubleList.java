package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/DoubleList;", "", "Landroidx/collection/MutableDoubleList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class DoubleList {
    public final boolean equals(Object obj) {
        if (!(obj instanceof DoubleList)) {
            return false;
        }
        ((DoubleList) obj).getClass();
        IntRange intRangeM18664k = RangesKt.m18664k(0, 0);
        if (intRangeM18664k.f51685a > intRangeM18664k.f51686b) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        sb.append((CharSequence) "]");
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
