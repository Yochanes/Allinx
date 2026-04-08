package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1807c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f26748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Exception f26749c;

    public /* synthetic */ RunnableC1807c(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.f26747a = i;
        this.f26748b = eventDispatcher;
        this.f26749c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.f26749c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f26748b;
        int i = this.f26747a;
        eventDispatcher.getClass();
        switch (i) {
            case 0:
                int i2 = Util.f25665a;
                eventDispatcher.f26522b.mo9865v(exc);
                break;
            default:
                int i3 = Util.f25665a;
                eventDispatcher.f26522b.mo9860q(exc);
                break;
        }
    }
}
