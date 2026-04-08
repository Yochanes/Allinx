package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1941i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28005a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f28006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f28007c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28008d;

    public /* synthetic */ RunnableC1941i(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f28006b = eventDispatcher;
        this.f28008d = i;
        this.f28007c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28008d;
        long j = this.f28007c;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f28006b;
        int i2 = this.f28005a;
        eventDispatcher.getClass();
        switch (i2) {
            case 0:
                int i3 = Util.f25665a;
                eventDispatcher.f27989b.mo9853j(i, j);
                break;
            default:
                int i4 = Util.f25665a;
                eventDispatcher.f27989b.mo9847d(i, j);
                break;
        }
    }

    public /* synthetic */ RunnableC1941i(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f28006b = eventDispatcher;
        this.f28007c = j;
        this.f28008d = i;
    }
}
