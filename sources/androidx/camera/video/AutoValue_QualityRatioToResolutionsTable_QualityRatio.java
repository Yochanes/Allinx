package androidx.camera.video;

import androidx.camera.video.QualityRatioToResolutionsTable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends QualityRatioToResolutionsTable.QualityRatio {

    /* JADX INFO: renamed from: a */
    public final Quality f3288a;

    /* JADX INFO: renamed from: b */
    public final int f3289b;

    public AutoValue_QualityRatioToResolutionsTable_QualityRatio(Quality quality, int i) {
        if (quality == null) {
            throw new NullPointerException("Null quality");
        }
        this.f3288a = quality;
        this.f3289b = i;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    /* JADX INFO: renamed from: a */
    public final int mo1807a() {
        return this.f3289b;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    /* JADX INFO: renamed from: b */
    public final Quality mo1808b() {
        return this.f3288a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QualityRatioToResolutionsTable.QualityRatio)) {
            return false;
        }
        QualityRatioToResolutionsTable.QualityRatio qualityRatio = (QualityRatioToResolutionsTable.QualityRatio) obj;
        return this.f3288a.equals(qualityRatio.mo1808b()) && this.f3289b == qualityRatio.mo1807a();
    }

    public final int hashCode() {
        return ((this.f3288a.hashCode() ^ 1000003) * 1000003) ^ this.f3289b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.f3288a);
        sb.append(", aspectRatio=");
        return AbstractC0000a.m11h(this.f3289b, "}", sb);
    }
}
