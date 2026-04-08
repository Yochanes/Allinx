package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SpliceCommand implements Metadata.Entry {
    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
