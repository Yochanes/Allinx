package androidx.media3.extractor.avi;

import androidx.media3.common.Format;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class StreamFormatChunk implements AviChunk {

    /* JADX INFO: renamed from: a */
    public final Format f28369a;

    public StreamFormatChunk(Format format) {
        this.f28369a = format;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1718776947;
    }
}
