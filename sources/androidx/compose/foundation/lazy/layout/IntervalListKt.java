package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class IntervalListKt {
    /* JADX INFO: renamed from: a */
    public static final int m3027a(int i, MutableVector mutableVector) {
        int i2 = mutableVector.f16736c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = mutableVector.f16734a;
            int i5 = ((IntervalList.Interval) objArr[i4]).f7186a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((IntervalList.Interval) objArr[i3]).f7186a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
