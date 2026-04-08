package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/PrioritySet;", "", AttributeType.LIST, "Landroidx/collection/MutableIntList;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class PrioritySet {
    /* JADX INFO: renamed from: a */
    public static final void m4405a(MutableIntList mutableIntList, int i) {
        if (mutableIntList.f3679b == 0 || !(mutableIntList.m1988a(0) == i || mutableIntList.m1988a(mutableIntList.f3679b - 1) == i)) {
            int i2 = mutableIntList.f3679b;
            mutableIntList.m2019c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM1988a = mutableIntList.m1988a(i3);
                if (i <= iM1988a) {
                    break;
                }
                mutableIntList.m2022f(i2, iM1988a);
                i2 = i3;
            }
            mutableIntList.m2022f(i2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m4406b(MutableIntList mutableIntList) {
        int iM1988a;
        int i = mutableIntList.f3679b;
        int iM1988a2 = mutableIntList.m1988a(0);
        while (mutableIntList.f3679b != 0 && mutableIntList.m1988a(0) == iM1988a2) {
            mutableIntList.m2022f(0, mutableIntList.m1989b());
            mutableIntList.m2021e(mutableIntList.f3679b - 1);
            int i2 = mutableIntList.f3679b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iM1988a3 = mutableIntList.m1988a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iM1988a4 = mutableIntList.m1988a(i6);
                if (i5 >= i2 || (iM1988a = mutableIntList.m1988a(i5)) <= iM1988a4) {
                    if (iM1988a4 > iM1988a3) {
                        mutableIntList.m2022f(i4, iM1988a4);
                        mutableIntList.m2022f(i6, iM1988a3);
                        i4 = i6;
                    }
                } else if (iM1988a > iM1988a3) {
                    mutableIntList.m2022f(i4, iM1988a);
                    mutableIntList.m2022f(i5, iM1988a3);
                    i4 = i5;
                }
            }
        }
        return iM1988a2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PrioritySet)) {
            return false;
        }
        ((PrioritySet) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PrioritySet(list=null)";
    }
}
