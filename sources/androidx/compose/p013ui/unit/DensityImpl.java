package androidx.compose.p013ui.unit;

import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class DensityImpl implements Density {

    /* JADX INFO: renamed from: a */
    public final float f20554a;

    /* JADX INFO: renamed from: b */
    public final float f20555b;

    public DensityImpl(float f, float f2) {
        this.f20554a = f;
        this.f20555b = f2;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: S0, reason: from getter */
    public final float getF20555b() {
        return this.f20555b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.f20554a, densityImpl.f20554a) == 0 && Float.compare(this.f20555b, densityImpl.f20555b) == 0;
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final float getF20554a() {
        return this.f20554a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20555b) + (Float.hashCode(this.f20554a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f20554a);
        sb.append(", fontScale=");
        return AbstractC0000a.m16m(sb, this.f20555b, ')');
    }
}
