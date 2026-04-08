package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1843a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f27046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MediaCodecAdapter f27047c;

    public /* synthetic */ C1843a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.f27045a = i;
        this.f27047c = mediaCodecAdapter;
        this.f27046b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f27045a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f27047c).getClass();
                this.f27046b.mo10373a(j);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f27047c).getClass();
                this.f27046b.mo10373a(j);
                break;
        }
    }
}
