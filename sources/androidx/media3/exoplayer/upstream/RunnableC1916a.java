package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1916a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener f27754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f27755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f27756c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f27757d;

    public /* synthetic */ RunnableC1916a(BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener, int i, long j, long j2) {
        this.f27754a = handlerAndListener;
        this.f27755b = i;
        this.f27756c = j;
        this.f27757d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener = this.f27754a;
        handlerAndListener.f27686b.mo10121Y(this.f27756c, this.f27757d, this.f27755b);
    }
}
