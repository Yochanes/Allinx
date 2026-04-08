package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C6465SegmentedByteString;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okio"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class SegmentedByteString {
    /* JADX INFO: renamed from: a */
    public static final int m21724a(C6465SegmentedByteString c6465SegmentedByteString, int i) {
        int i2;
        Intrinsics.m18599g(c6465SegmentedByteString, "<this>");
        int i3 = i + 1;
        int length = c6465SegmentedByteString.f57909g.length;
        int[] iArr = c6465SegmentedByteString.f57910i;
        Intrinsics.m18599g(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
