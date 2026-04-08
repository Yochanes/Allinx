package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4OrientationData implements Metadata.Entry {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4OrientationData)) {
            return false;
        }
        ((Mp4OrientationData) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + 527;
    }

    public final String toString() {
        return "Orientation= 0";
    }
}
