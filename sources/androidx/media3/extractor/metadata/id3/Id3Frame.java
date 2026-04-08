package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final String f28510a;

    public Id3Frame(String str) {
        this.f28510a = str;
    }

    public String toString() {
        return this.f28510a;
    }
}
