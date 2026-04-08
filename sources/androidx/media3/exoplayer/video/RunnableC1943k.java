package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1943k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f28013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DecoderCounters f28014c;

    public /* synthetic */ RunnableC1943k(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f28012a = i;
        this.f28013b = eventDispatcher;
        this.f28014c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28012a) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.f28013b;
                eventDispatcher.getClass();
                int i = Util.f25665a;
                eventDispatcher.f27989b.mo9855l(this.f28014c);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.f28013b;
                DecoderCounters decoderCounters = this.f28014c;
                eventDispatcher2.getClass();
                synchronized (decoderCounters) {
                }
                VideoRendererEventListener videoRendererEventListener = eventDispatcher2.f27989b;
                int i2 = Util.f25665a;
                videoRendererEventListener.mo9862s(decoderCounters);
                break;
        }
    }
}
