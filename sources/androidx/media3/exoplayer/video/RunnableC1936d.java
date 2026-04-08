package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1936d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f27996c;

    public /* synthetic */ RunnableC1936d(int i, Object obj, Object obj2) {
        this.f27994a = i;
        this.f27996c = obj;
        this.f27995b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f27995b;
        Object obj2 = this.f27996c;
        switch (this.f27994a) {
            case 0:
                DefaultVideoSink.this.f27795h.mo10715a((VideoSize) obj);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher = (VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher.getClass();
                int i = Util.f25665a;
                eventDispatcher.f27989b.mo9844a((VideoSize) obj);
                break;
            case 2:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher2.getClass();
                int i2 = Util.f25665a;
                eventDispatcher2.f27989b.mo9866w((Exception) obj);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher3 = (VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher3.getClass();
                int i3 = Util.f25665a;
                eventDispatcher3.f27989b.mo9846c((String) obj);
                break;
        }
    }
}
