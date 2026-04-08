package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EmptySampleStream implements SampleStream {
    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: a */
    public final boolean mo10476a() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: j */
    public final int mo10478j(long j) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: n */
    public final int mo10479n(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.f25921a = 4;
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: h */
    public final void mo10477h() {
    }
}
