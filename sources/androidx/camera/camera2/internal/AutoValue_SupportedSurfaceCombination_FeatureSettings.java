package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.SupportedSurfaceCombination;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {

    /* JADX INFO: renamed from: a */
    public final int f1541a;

    /* JADX INFO: renamed from: b */
    public final int f1542b;

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i, int i2) {
        this.f1541a = i;
        this.f1542b = i2;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    /* JADX INFO: renamed from: a */
    public final int mo832a() {
        return this.f1541a;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    /* JADX INFO: renamed from: b */
    public final int mo833b() {
        return this.f1542b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportedSurfaceCombination.FeatureSettings)) {
            return false;
        }
        SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
        return this.f1541a == featureSettings.mo832a() && this.f1542b == featureSettings.mo833b();
    }

    public final int hashCode() {
        return ((this.f1541a ^ 1000003) * 1000003) ^ this.f1542b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f1541a);
        sb.append(", requiredMaxBitDepth=");
        return AbstractC0000a.m11h(this.f1542b, "}", sb);
    }
}
