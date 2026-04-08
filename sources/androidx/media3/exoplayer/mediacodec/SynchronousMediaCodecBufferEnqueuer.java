package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class SynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: a */
    public final void mo10364a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        MediaCodec.CryptoInfo cryptoInfo2 = cryptoInfo.f25930i;
        throw null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: b */
    public final void mo10365b(Bundle bundle) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: c */
    public final void mo10366c(int i, int i2, int i3, long j) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: d */
    public final void mo10367d() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
    }
}
