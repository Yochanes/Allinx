package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1806b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f26745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AudioSink.AudioTrackConfig f26746c;

    public /* synthetic */ RunnableC1806b(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f26744a = i;
        this.f26745b = eventDispatcher;
        this.f26746c = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioSink.AudioTrackConfig audioTrackConfig = this.f26746c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f26745b;
        int i = this.f26744a;
        eventDispatcher.getClass();
        switch (i) {
            case 0:
                int i2 = Util.f25665a;
                eventDispatcher.f26522b.mo9849f(audioTrackConfig);
                break;
            default:
                int i3 = Util.f25665a;
                eventDispatcher.f26522b.mo9845b(audioTrackConfig);
                break;
        }
    }
}
