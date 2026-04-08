package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Floats;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SmtaMetadataEntry implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final float f28535a;

    /* JADX INFO: renamed from: b */
    public final int f28536b;

    public SmtaMetadataEntry(float f, int i) {
        this.f28535a = f;
        this.f28536b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.f28535a == smtaMetadataEntry.f28535a && this.f28536b == smtaMetadataEntry.f28536b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Floats.hashCode(this.f28535a) + 527) * 31) + this.f28536b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f28535a + ", svcTemporalLayerCount=" + this.f28536b;
    }
}
