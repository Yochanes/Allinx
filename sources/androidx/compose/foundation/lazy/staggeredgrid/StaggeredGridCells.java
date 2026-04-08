package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface StaggeredGridCells {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Adaptive implements StaggeredGridCells {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Adaptive)) {
                return false;
            }
            ((Adaptive) obj).getClass();
            return C1338Dp.m6641a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Fixed implements StaggeredGridCells {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Fixed)) {
                return false;
            }
            ((Fixed) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$FixedSize;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class FixedSize implements StaggeredGridCells {
        public final boolean equals(Object obj) {
            if (!(obj instanceof FixedSize)) {
                return false;
            }
            ((FixedSize) obj).getClass();
            return C1338Dp.m6641a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }
}
