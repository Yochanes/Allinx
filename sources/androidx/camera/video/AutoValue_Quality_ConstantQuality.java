package androidx.camera.video;

import androidx.camera.video.Quality;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {

    /* JADX INFO: renamed from: j */
    public final int f3290j;

    /* JADX INFO: renamed from: k */
    public final String f3291k;

    public AutoValue_Quality_ConstantQuality(int i, String str) {
        this.f3290j = i;
        this.f3291k = str;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    /* JADX INFO: renamed from: a */
    public final String mo1809a() {
        return this.f3291k;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    /* JADX INFO: renamed from: b */
    public final int mo1810b() {
        return this.f3290j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.ConstantQuality)) {
            return false;
        }
        Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
        return this.f3290j == constantQuality.mo1810b() && this.f3291k.equals(constantQuality.mo1809a());
    }

    public final int hashCode() {
        return ((this.f3290j ^ 1000003) * 1000003) ^ this.f3291k.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.f3290j);
        sb.append(", name=");
        return AbstractC0000a.m19p(sb, this.f3291k, "}");
    }
}
