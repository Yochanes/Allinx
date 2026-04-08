package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.audio.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1808d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26752c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f26753d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f26754f;

    public /* synthetic */ RunnableC1808d(Object obj, String str, long j, long j2, int i) {
        this.f26750a = i;
        this.f26754f = obj;
        this.f26751b = str;
        this.f26752c = j;
        this.f26753d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f26754f;
        switch (this.f26750a) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i = Util.f25665a;
                eventDispatcher.f26522b.mo9852i(this.f26751b, this.f26752c, this.f26753d);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i2 = Util.f25665a;
                eventDispatcher2.f27989b.mo9848e(this.f26751b, this.f26752c, this.f26753d);
                break;
        }
    }
}
