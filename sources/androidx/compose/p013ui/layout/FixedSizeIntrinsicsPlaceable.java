package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m5673z0((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @Override // androidx.compose.p013ui.layout.Measured
    /* JADX INFO: renamed from: X */
    public final int mo5615X(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p013ui.layout.Placeable
    /* JADX INFO: renamed from: y0 */
    public final void mo5616y0(long j, float f, Function1 function1) {
    }
}
