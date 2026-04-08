package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackSelectionArray {

    /* JADX INFO: renamed from: a */
    public int f27654a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public final int hashCode() {
        if (this.f27654a == 0) {
            this.f27654a = Arrays.hashCode((Object[]) null) + 527;
        }
        return this.f27654a;
    }
}
