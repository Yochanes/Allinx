package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {

    /* JADX INFO: compiled from: Proguard */
    public interface ReleaseCallback<T extends ChunkSource> {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: a */
    public final boolean mo10476a() {
        if (m10586v()) {
            return false;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    /* JADX INFO: renamed from: b */
    public final void mo10537b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: c */
    public final boolean mo10464c(LoadingInfo loadingInfo) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    /* JADX INFO: renamed from: d */
    public final Loader.LoadErrorAction mo10538d(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public final long mo10465e() {
        if (m10586v()) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: h */
    public final void mo10477h() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: j */
    public final int mo10478j(long j) {
        if (m10586v()) {
            return 0;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    /* JADX INFO: renamed from: l */
    public final void mo10539l(Loader.Loadable loadable, long j, long j2, int i) {
        Chunk chunk = (Chunk) loadable;
        if (i != 0) {
            chunk.getClass();
            throw null;
        }
        chunk.getClass();
        new LoadEventInfo(0L, (DataSpec) null);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    /* JADX INFO: renamed from: n */
    public final int mo10479n(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    /* JADX INFO: renamed from: q */
    public final void mo10541q(Loader.Loadable loadable, long j, long j2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: r */
    public final long mo10473r() {
        if (m10586v()) {
            return 0L;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: t */
    public final void mo10475t(long j) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    /* JADX INFO: renamed from: u */
    public final void mo10542u(Loader.Loadable loadable, long j, long j2, boolean z2) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10586v() {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class EmbeddedSampleStream implements SampleStream {
        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: a */
        public final boolean mo10476a() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: j */
        public final int mo10478j(long j) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: n */
        public final int mo10479n(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: h */
        public final void mo10477h() {
        }
    }
}
