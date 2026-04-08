package androidx.compose.foundation.layout;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PaddingValuesImpl implements PaddingValues {

    /* JADX INFO: renamed from: a */
    public final float f6525a;

    /* JADX INFO: renamed from: b */
    public final float f6526b;

    /* JADX INFO: renamed from: c */
    public final float f6527c;

    /* JADX INFO: renamed from: d */
    public final float f6528d;

    public PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.f6525a = f;
        this.f6526b = f2;
        this.f6527c = f3;
        this.f6528d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            InlineClassHelperKt.m2896a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
    public final float getF6528d() {
        return this.f6528d;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo21921calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f20569a ? this.f6525a : this.f6527c;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public final float mo21922calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f20569a ? this.f6527c : this.f6525a;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
    public final float getF6526b() {
        return this.f6526b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return C1338Dp.m6641a(this.f6525a, paddingValuesImpl.f6525a) && C1338Dp.m6641a(this.f6526b, paddingValuesImpl.f6526b) && C1338Dp.m6641a(this.f6527c, paddingValuesImpl.f6527c) && C1338Dp.m6641a(this.f6528d, paddingValuesImpl.f6528d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6528d) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f6525a) * 31, this.f6526b, 31), this.f6527c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        AbstractC0455a.m2248w(this.f6525a, ", top=", sb);
        AbstractC0455a.m2248w(this.f6526b, ", end=", sb);
        AbstractC0455a.m2248w(this.f6527c, ", bottom=", sb);
        sb.append((Object) C1338Dp.m6642b(this.f6528d));
        sb.append(')');
        return sb.toString();
    }
}
