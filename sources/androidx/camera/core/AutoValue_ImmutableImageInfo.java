package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {

    /* JADX INFO: renamed from: a */
    public final TagBundle f2180a;

    /* JADX INFO: renamed from: b */
    public final long f2181b;

    /* JADX INFO: renamed from: c */
    public final int f2182c;

    /* JADX INFO: renamed from: d */
    public final Matrix f2183d;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle, long j, int i, Matrix matrix) {
        if (tagBundle == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f2180a = tagBundle;
        this.f2181b = j;
        this.f2182c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f2183d = matrix;
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: a */
    public final TagBundle mo1195a() {
        return this.f2180a;
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: c */
    public final long mo1196c() {
        return this.f2181b;
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: d */
    public final int mo1197d() {
        return this.f2182c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        AutoValue_ImmutableImageInfo autoValue_ImmutableImageInfo = (AutoValue_ImmutableImageInfo) immutableImageInfo;
        if (this.f2180a.equals(autoValue_ImmutableImageInfo.f2180a)) {
            return this.f2181b == autoValue_ImmutableImageInfo.f2181b && this.f2182c == autoValue_ImmutableImageInfo.f2182c && this.f2183d.equals(immutableImageInfo.mo1198f());
        }
        return false;
    }

    @Override // androidx.camera.core.ImmutableImageInfo
    /* JADX INFO: renamed from: f */
    public final Matrix mo1198f() {
        return this.f2183d;
    }

    public final int hashCode() {
        int iHashCode = (this.f2180a.hashCode() ^ 1000003) * 1000003;
        long j = this.f2181b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f2182c) * 1000003) ^ this.f2183d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2180a + ", timestamp=" + this.f2181b + ", rotationDegrees=" + this.f2182c + ", sensorToBufferTransformMatrix=" + this.f2183d + "}";
    }
}
