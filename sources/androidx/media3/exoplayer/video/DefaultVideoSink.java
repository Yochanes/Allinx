package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.util.SystemClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DefaultVideoSink implements VideoSink {

    /* JADX INFO: renamed from: a */
    public final VideoFrameReleaseControl f27788a;

    /* JADX INFO: renamed from: b */
    public final SystemClock f27789b;

    /* JADX INFO: renamed from: c */
    public final VideoFrameRenderControl f27790c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f27791d;

    /* JADX INFO: renamed from: e */
    public Surface f27792e;

    /* JADX INFO: renamed from: f */
    public final Format f27793f;

    /* JADX INFO: renamed from: g */
    public long f27794g;

    /* JADX INFO: renamed from: h */
    public VideoSink.Listener f27795h;

    /* JADX INFO: renamed from: i */
    public Executor f27796i;

    /* JADX INFO: renamed from: j */
    public VideoFrameMetadataListener f27797j;

    /* JADX INFO: compiled from: Proguard */
    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {

        /* JADX INFO: renamed from: a */
        public Format f27798a;

        public FrameRendererImpl() {
        }
    }

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, SystemClock systemClock) {
        this.f27788a = videoFrameReleaseControl;
        videoFrameReleaseControl.f27948l = systemClock;
        this.f27789b = systemClock;
        this.f27790c = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.f27791d = new ArrayDeque();
        this.f27793f = new Format(new Format.Builder());
        this.f27794g = -9223372036854775807L;
        this.f27795h = VideoSink.Listener.f27990a;
        this.f27796i = new ExecutorC1933a();
        this.f27797j = new C1934b();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    /* JADX INFO: renamed from: d */
    public final void mo10694d() {
        VideoFrameRenderControl videoFrameRenderControl = this.f27790c;
        videoFrameRenderControl.f27985i = videoFrameRenderControl.f27983g;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    /* JADX INFO: renamed from: e */
    public final void mo10695e(long j, long j2) {
        if (j != this.f27794g) {
            VideoFrameRenderControl videoFrameRenderControl = this.f27790c;
            long j3 = videoFrameRenderControl.f27983g;
            videoFrameRenderControl.f27981e.m9578a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.f27794g = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    /* JADX INFO: renamed from: f */
    public final void mo10696f(Renderer.WakeupListener wakeupListener) {
        throw new UnsupportedOperationException();
    }
}
