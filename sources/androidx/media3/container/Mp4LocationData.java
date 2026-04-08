package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Floats;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4LocationData implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final float f25695a;

    /* JADX INFO: renamed from: b */
    public final float f25696b;

    public Mp4LocationData(float f, float f2) {
        Assertions.m9461b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f25695a = f;
        this.f25696b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.f25695a == mp4LocationData.f25695a && this.f25696b == mp4LocationData.f25696b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Floats.hashCode(this.f25696b) + ((Floats.hashCode(this.f25695a) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f25695a + ", longitude=" + this.f25696b;
    }
}
