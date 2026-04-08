package androidx.compose.foundation.layout;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "Absolute", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PaddingValues {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class Absolute implements PaddingValues {
        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
        public final float getF6528d() {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public final float mo21921calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public final float mo21922calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
        public final float getF6526b() {
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            ((Absolute) obj).getClass();
            return C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
        }

        public final String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) C1338Dp.m6642b(0.0f)) + ", top=" + ((Object) C1338Dp.m6642b(0.0f)) + ", right=" + ((Object) C1338Dp.m6642b(0.0f)) + ", bottom=" + ((Object) C1338Dp.m6642b(0.0f)) + ')';
        }
    }

    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    float getF6528d();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    float mo21921calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    float mo21922calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    float getF6526b();
}
