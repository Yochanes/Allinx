package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1810f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f26757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26759c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f26760d;

    public /* synthetic */ RunnableC1810f(AudioRendererEventListener.EventDispatcher eventDispatcher, int i, long j, long j2) {
        this.f26757a = eventDispatcher;
        this.f26758b = i;
        this.f26759c = j;
        this.f26760d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f26757a;
        eventDispatcher.getClass();
        int i = Util.f25665a;
        eventDispatcher.f26522b.mo9850g(this.f26759c, this.f26760d, this.f26758b);
    }
}
