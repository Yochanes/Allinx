package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public final class MediaParserChunkExtractor implements ChunkExtractor {

    /* JADX INFO: compiled from: Proguard */
    public static class Factory implements ChunkExtractor.Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    public class TrackOutputProviderAdapter implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: h */
        public final void mo9959h() {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: j */
        public final TrackOutput mo9960j(int i, int i2) {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: a */
        public final void mo9958a(SeekMap seekMap) {
        }
    }
}
