package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ProgressBarRangeInfo {

    /* JADX INFO: renamed from: d */
    public static final ProgressBarRangeInfo f19728d = new ProgressBarRangeInfo(0.0f, RangesKt.m18661h(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a */
    public final float f19729a;

    /* JADX INFO: renamed from: b */
    public final ClosedFloatingPointRange f19730b;

    /* JADX INFO: renamed from: c */
    public final int f19731c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.f19729a = f;
        this.f19730b = closedFloatingPointRange;
        this.f19731c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.f19729a == progressBarRangeInfo.f19729a && Intrinsics.m18594b(this.f19730b, progressBarRangeInfo.f19730b) && this.f19731c == progressBarRangeInfo.f19731c;
    }

    public final int hashCode() {
        return ((this.f19730b.hashCode() + (Float.hashCode(this.f19729a) * 31)) * 31) + this.f19731c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f19729a);
        sb.append(", range=");
        sb.append(this.f19730b);
        sb.append(", steps=");
        return AbstractC0000a.m17n(sb, this.f19731c, ')');
    }
}
