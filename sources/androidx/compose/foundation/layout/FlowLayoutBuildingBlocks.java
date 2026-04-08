package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlowLayoutBuildingBlocks {

    /* JADX INFO: renamed from: a */
    public final int f6372a;

    /* JADX INFO: renamed from: b */
    public final FlowLayoutOverflowState f6373b;

    /* JADX INFO: renamed from: c */
    public final long f6374c;

    /* JADX INFO: renamed from: d */
    public final int f6375d;

    /* JADX INFO: renamed from: e */
    public final int f6376e;

    /* JADX INFO: renamed from: f */
    public final int f6377f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class WrapEllipsisInfo {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class WrapInfo {

        /* JADX INFO: renamed from: a */
        public final boolean f6378a;

        /* JADX INFO: renamed from: b */
        public final boolean f6379b;

        public WrapInfo(boolean z2, boolean z3) {
            this.f6378a = z2;
            this.f6379b = z3;
        }
    }

    public FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4) {
        this.f6372a = i;
        this.f6373b = flowLayoutOverflowState;
        this.f6374c = j;
        this.f6375d = i2;
        this.f6376e = i3;
        this.f6377f = i4;
    }

    /* JADX INFO: renamed from: a */
    public final WrapEllipsisInfo m2764a(WrapInfo wrapInfo, boolean z2, int i, int i2, int i3, int i4) {
        if (!wrapInfo.f6379b) {
            return null;
        }
        this.f6373b.getClass();
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.f6400a;
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final WrapInfo m2765b(boolean z2, int i, long j, IntIntPair intIntPair, int i2, int i3, int i4, boolean z3, boolean z4) {
        int i5 = i3 + i4;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        this.f6373b.getClass();
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.f6400a;
        FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.f6400a;
        if (i2 < this.f6375d) {
            int i6 = (int) (j & 4294967295L);
            long j2 = intIntPair.f3677a;
            if (i6 - ((int) (j2 & 4294967295L)) >= 0) {
                if (i != 0 && (i >= this.f6372a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
                    return z3 ? new WrapInfo(true, true) : new WrapInfo(true, m2765b(z2, 0, IntIntPair.m1987a(Constraints.m6617h(this.f6374c), (((int) (j & 4294967295L)) - this.f6377f) - i4), new IntIntPair(IntIntPair.m1987a(((int) (j2 >> 32)) - this.f6376e, (int) (4294967295L & j2))), i2 + 1, i5, 0, true, false).f6379b);
                }
                Math.max(i4, (int) (j2 & 4294967295L));
                return new WrapInfo(false, false);
            }
        }
        return new WrapInfo(true, true);
    }
}
