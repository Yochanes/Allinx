package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, m18302d2 = {"", "SnapshotId", "", "SnapshotIdArray", "runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnapshotId_jvmKt {
    /* JADX INFO: renamed from: a */
    public static final int m4802a(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
