package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1939g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaybackVideoGraphWrapper.InputVideoSink f28003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ VideoSink.Listener f28004c;

    public /* synthetic */ RunnableC1939g(PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink, VideoSink.Listener listener, int i) {
        this.f28002a = i;
        this.f28003b = inputVideoSink;
        this.f28004c = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28002a) {
            case 0:
                this.f28003b.getClass();
                this.f28004c.mo10716b();
                break;
            default:
                this.f28003b.getClass();
                this.f28004c.mo10717c();
                break;
        }
    }
}
