package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1942j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f28009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f28011c;

    public /* synthetic */ RunnableC1942j(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, long j) {
        this.f28009a = eventDispatcher;
        this.f28010b = obj;
        this.f28011c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f28009a;
        eventDispatcher.getClass();
        int i = Util.f25665a;
        eventDispatcher.f27989b.mo9867x(this.f28011c, this.f28010b);
    }
}
