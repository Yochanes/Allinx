package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1805a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f26742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DecoderCounters f26743c;

    public /* synthetic */ RunnableC1805a(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f26741a = i;
        this.f26742b = eventDispatcher;
        this.f26743c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26741a) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f26742b;
                eventDispatcher.getClass();
                int i = Util.f25665a;
                eventDispatcher.f26522b.mo9854k(this.f26743c);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.f26742b;
                DecoderCounters decoderCounters = this.f26743c;
                eventDispatcher2.getClass();
                synchronized (decoderCounters) {
                }
                AudioRendererEventListener audioRendererEventListener = eventDispatcher2.f26522b;
                int i2 = Util.f25665a;
                audioRendererEventListener.mo9868y(decoderCounters);
                break;
        }
    }
}
