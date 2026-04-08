package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "", "Center", "End", "Start", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface SnapPosition {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Center;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Center implements SnapPosition {

        /* JADX INFO: renamed from: a */
        public static final Center f6195a = new Center();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        /* JADX INFO: renamed from: a */
        public final int mo2692a(int i, int i2, int i3, int i4, int i5, int i6) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$End;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class End implements SnapPosition {
        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        /* JADX INFO: renamed from: a */
        public final int mo2692a(int i, int i2, int i3, int i4, int i5, int i6) {
            return ((i - i3) - i4) - i2;
        }

        public final String toString() {
            return "End";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Start;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Start implements SnapPosition {

        /* JADX INFO: renamed from: a */
        public static final Start f6196a = new Start();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        /* JADX INFO: renamed from: a */
        public final int mo2692a(int i, int i2, int i3, int i4, int i5, int i6) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    /* JADX INFO: renamed from: a */
    int mo2692a(int i, int i2, int i3, int i4, int i5, int i6);
}
