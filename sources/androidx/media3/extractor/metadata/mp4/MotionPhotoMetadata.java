package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Longs;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MotionPhotoMetadata implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final long f28526a;

    /* JADX INFO: renamed from: b */
    public final long f28527b;

    /* JADX INFO: renamed from: c */
    public final long f28528c;

    /* JADX INFO: renamed from: d */
    public final long f28529d;

    /* JADX INFO: renamed from: e */
    public final long f28530e;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f28526a = j;
        this.f28527b = j2;
        this.f28528c = j3;
        this.f28529d = j4;
        this.f28530e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f28526a == motionPhotoMetadata.f28526a && this.f28527b == motionPhotoMetadata.f28527b && this.f28528c == motionPhotoMetadata.f28528c && this.f28529d == motionPhotoMetadata.f28529d && this.f28530e == motionPhotoMetadata.f28530e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f28530e) + ((Longs.hashCode(this.f28529d) + ((Longs.hashCode(this.f28528c) + ((Longs.hashCode(this.f28527b) + ((Longs.hashCode(this.f28526a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f28526a + ", photoSize=" + this.f28527b + ", photoPresentationTimestampUs=" + this.f28528c + ", videoStartPosition=" + this.f28529d + ", videoSize=" + this.f28530e;
    }
}
