package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "AlignmentLineCrossAxisAlignment", "CenterCrossAxisAlignment", "Companion", "EndCrossAxisAlignment", "HorizontalCrossAxisAlignment", "StartCrossAxisAlignment", "VerticalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class CrossAxisAlignment {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {

        /* JADX INFO: renamed from: a */
        public final AlignmentLineProvider f6342a;

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            this.f6342a = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            int iMo2717a = this.f6342a.mo2717a(placeable);
            if (iMo2717a == Integer.MIN_VALUE) {
                return 0;
            }
            int i3 = i2 - iMo2717a;
            return layoutDirection == LayoutDirection.f20570b ? i - i3 : i3;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: b */
        public final Integer mo2763b(Placeable placeable) {
            return Integer.valueOf(this.f6342a.mo2717a(placeable));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return i / 2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f20569a) {
                return i;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class HorizontalCrossAxisAlignment extends CrossAxisAlignment {

        /* JADX INFO: renamed from: a */
        public final Alignment.Horizontal f6343a;

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            this.f6343a = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return this.f6343a.mo4858a(0, i, layoutDirection);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && Intrinsics.m18594b(this.f6343a, ((HorizontalCrossAxisAlignment) obj).f6343a);
        }

        public final int hashCode() {
            return this.f6343a.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f6343a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f20569a) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class VerticalCrossAxisAlignment extends CrossAxisAlignment {

        /* JADX INFO: renamed from: a */
        public final Alignment.Vertical f6344a;

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            this.f6344a = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        /* JADX INFO: renamed from: a */
        public final int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return this.f6344a.mo4859a(0, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && Intrinsics.m18594b(this.f6344a, ((VerticalCrossAxisAlignment) obj).f6344a);
        }

        public final int hashCode() {
            return this.f6344a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f6344a + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2762a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: b */
    public Integer mo2763b(Placeable placeable) {
        return null;
    }
}
