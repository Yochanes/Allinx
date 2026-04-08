package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1809e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f26755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f26756b;

    public /* synthetic */ RunnableC1809e(AudioRendererEventListener.EventDispatcher eventDispatcher, long j) {
        this.f26755a = eventDispatcher;
        this.f26756b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f26755a;
        eventDispatcher.getClass();
        int i = Util.f25665a;
        eventDispatcher.f26522b.mo9863t(this.f26756b);
    }
}
