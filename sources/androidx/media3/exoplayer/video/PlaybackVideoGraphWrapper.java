package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@UnstableApi
public final class PlaybackVideoGraphWrapper implements VideoSinkProvider, VideoGraph.Listener {

    /* JADX INFO: renamed from: u */
    public static final ExecutorC1933a f27883u = new ExecutorC1933a();

    /* JADX INFO: renamed from: a */
    public final Context f27884a;

    /* JADX INFO: renamed from: b */
    public final TimedValueQueue f27885b = new TimedValueQueue();

    /* JADX INFO: renamed from: c */
    public final PreviewingVideoGraph.Factory f27886c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f27887d;

    /* JADX INFO: renamed from: e */
    public final ImmutableList f27888e;

    /* JADX INFO: renamed from: f */
    public final VideoCompositorSettings f27889f;

    /* JADX INFO: renamed from: g */
    public final VideoSink f27890g;

    /* JADX INFO: renamed from: h */
    public final SystemClock f27891h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArraySet f27892i;

    /* JADX INFO: renamed from: j */
    public HandlerWrapper f27893j;

    /* JADX INFO: renamed from: k */
    public PreviewingVideoGraph f27894k;

    /* JADX INFO: renamed from: l */
    public Pair f27895l;

    /* JADX INFO: renamed from: m */
    public int f27896m;

    /* JADX INFO: renamed from: n */
    public int f27897n;

    /* JADX INFO: renamed from: o */
    public Renderer.WakeupListener f27898o;

    /* JADX INFO: renamed from: p */
    public long f27899p;

    /* JADX INFO: renamed from: q */
    public boolean f27900q;

    /* JADX INFO: renamed from: r */
    public long f27901r;

    /* JADX INFO: renamed from: s */
    public int f27902s;

    /* JADX INFO: renamed from: t */
    public int f27903t;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$1 */
    /* JADX INFO: compiled from: Proguard */
    class C19311 implements VideoSink.VideoFrameHandler {
        @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
        /* JADX INFO: renamed from: a */
        public final void mo10718a(long j) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
        /* JADX INFO: renamed from: b */
        public final void mo10719b() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final Context f27904a;

        /* JADX INFO: renamed from: b */
        public final VideoFrameReleaseControl f27905b;

        /* JADX INFO: renamed from: c */
        public VideoFrameProcessor.Factory f27906c;

        /* JADX INFO: renamed from: d */
        public PreviewingVideoGraph.Factory f27907d;

        /* JADX INFO: renamed from: e */
        public final ImmutableList f27908e = ImmutableList.m14824of();

        /* JADX INFO: renamed from: f */
        public final VideoCompositorSettings f27909f = VideoCompositorSettings.f25423a;

        /* JADX INFO: renamed from: g */
        public SystemClock f27910g = Clock.f25579a;

        /* JADX INFO: renamed from: h */
        public boolean f27911h;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.f27904a = context.getApplicationContext();
            this.f27905b = videoFrameReleaseControl;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        public DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        /* JADX INFO: renamed from: a */
        public final void mo10715a(VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.f27892i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).mo10726a(videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        /* JADX INFO: renamed from: b */
        public final void mo10716b() {
            Iterator it = PlaybackVideoGraphWrapper.this.f27892i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).mo10727b();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        /* JADX INFO: renamed from: c */
        public final void mo10717c() {
            Iterator it = PlaybackVideoGraphWrapper.this.f27892i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).mo10728c();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class InputVideoSink implements VideoSink, Listener {

        /* JADX INFO: renamed from: a */
        public final int f27913a;

        /* JADX INFO: renamed from: b */
        public ImmutableList f27914b;

        /* JADX INFO: renamed from: c */
        public VideoFrameProcessor f27915c;

        /* JADX INFO: renamed from: d */
        public Format f27916d;

        /* JADX INFO: renamed from: e */
        public long f27917e;

        /* JADX INFO: renamed from: f */
        public long f27918f;

        /* JADX INFO: renamed from: g */
        public VideoSink.Listener f27919g;

        /* JADX INFO: renamed from: h */
        public Executor f27920h;

        public InputVideoSink(Context context) {
            this.f27913a = Util.m9596F(context) ? 1 : 5;
            this.f27914b = ImmutableList.m14824of();
            this.f27918f = -9223372036854775807L;
            this.f27919g = VideoSink.Listener.f27990a;
            this.f27920h = PlaybackVideoGraphWrapper.f27883u;
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        /* JADX INFO: renamed from: a */
        public final void mo10726a(VideoSize videoSize) {
            this.f27920h.execute(new RunnableC1938f(this, 0, this.f27919g, videoSize));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        /* JADX INFO: renamed from: b */
        public final void mo10727b() {
            this.f27920h.execute(new RunnableC1939g(this, this.f27919g, 0));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        /* JADX INFO: renamed from: c */
        public final void mo10728c() {
            this.f27920h.execute(new RunnableC1939g(this, this.f27919g, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        /* JADX INFO: renamed from: d */
        public final void mo10694d() {
            long j = this.f27918f;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.f27899p >= j) {
                ((DefaultVideoSink) playbackVideoGraphWrapper.f27890g).mo10694d();
                playbackVideoGraphWrapper.f27900q = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        /* JADX INFO: renamed from: e */
        public final void mo10695e(long j, long j2) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            TimedValueQueue timedValueQueue = playbackVideoGraphWrapper.f27885b;
            long j3 = this.f27918f;
            timedValueQueue.m9578a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.f27917e = j2;
            playbackVideoGraphWrapper.f27901r = j2;
            ((DefaultVideoSink) playbackVideoGraphWrapper.f27890g).mo10695e(0L, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        /* JADX INFO: renamed from: f */
        public final void mo10696f(Renderer.WakeupListener wakeupListener) {
            PlaybackVideoGraphWrapper.this.f27898o = wakeupListener;
        }

        /* JADX INFO: renamed from: g */
        public final void m10729g(boolean z2) {
            TimedValueQueue timedValueQueue;
            if (m10731i()) {
                this.f27915c.flush();
            }
            this.f27918f = -9223372036854775807L;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.f27897n == 1) {
                playbackVideoGraphWrapper.f27896m++;
                DefaultVideoSink defaultVideoSink = (DefaultVideoSink) playbackVideoGraphWrapper.f27890g;
                if (z2) {
                    VideoFrameReleaseControl videoFrameReleaseControl = defaultVideoSink.f27788a;
                    VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.f27938b;
                    videoFrameReleaseHelper.f27965m = 0L;
                    videoFrameReleaseHelper.f27968p = -1L;
                    videoFrameReleaseHelper.f27966n = -1L;
                    videoFrameReleaseControl.f27944h = -9223372036854775807L;
                    videoFrameReleaseControl.f27942f = -9223372036854775807L;
                    videoFrameReleaseControl.m10744d(1);
                    videoFrameReleaseControl.f27945i = -9223372036854775807L;
                }
                VideoFrameRenderControl videoFrameRenderControl = defaultVideoSink.f27790c;
                LongArrayQueue longArrayQueue = videoFrameRenderControl.f27982f;
                longArrayQueue.f25622a = 0;
                longArrayQueue.f25623b = 0;
                videoFrameRenderControl.f27983g = -9223372036854775807L;
                videoFrameRenderControl.f27984h = -9223372036854775807L;
                videoFrameRenderControl.f27985i = -9223372036854775807L;
                TimedValueQueue timedValueQueue2 = videoFrameRenderControl.f27981e;
                if (timedValueQueue2.m9585h() > 0) {
                    Assertions.m9460a(timedValueQueue2.m9585h() > 0);
                    while (timedValueQueue2.m9585h() > 1) {
                        timedValueQueue2.m9582e();
                    }
                    Object objM9582e = timedValueQueue2.m9582e();
                    objM9582e.getClass();
                    timedValueQueue2.m9578a(0L, (Long) objM9582e);
                }
                TimedValueQueue timedValueQueue3 = videoFrameRenderControl.f27980d;
                if (timedValueQueue3.m9585h() > 0) {
                    Assertions.m9460a(timedValueQueue3.m9585h() > 0);
                    while (timedValueQueue3.m9585h() > 1) {
                        timedValueQueue3.m9582e();
                    }
                    Object objM9582e2 = timedValueQueue3.m9582e();
                    objM9582e2.getClass();
                    timedValueQueue3.m9578a(0L, (VideoSize) objM9582e2);
                }
                defaultVideoSink.f27791d.clear();
                while (true) {
                    timedValueQueue = playbackVideoGraphWrapper.f27885b;
                    if (timedValueQueue.m9585h() <= 1) {
                        break;
                    } else {
                        timedValueQueue.m9582e();
                    }
                }
                if (timedValueQueue.m9585h() == 1) {
                    Long l = (Long) timedValueQueue.m9582e();
                    l.getClass();
                    defaultVideoSink.mo10695e(l.longValue(), playbackVideoGraphWrapper.f27901r);
                }
                playbackVideoGraphWrapper.f27899p = -9223372036854775807L;
                playbackVideoGraphWrapper.f27900q = false;
                HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.f27893j;
                Assertions.m9466g(handlerWrapper);
                handlerWrapper.mo9489e(new RunnableC1935c(playbackVideoGraphWrapper, 2));
            }
        }

        /* JADX INFO: renamed from: h */
        public final boolean m10730h(Format format) throws VideoSink.VideoSinkException {
            Assertions.m9464e(!m10731i());
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            VideoSink videoSink = playbackVideoGraphWrapper.f27890g;
            Assertions.m9464e(playbackVideoGraphWrapper.f27897n == 0);
            ColorInfo colorInfoM9239a = format.f25135B;
            if (colorInfoM9239a == null || !colorInfoM9239a.m9238d()) {
                colorInfoM9239a = ColorInfo.f25104h;
            }
            if (colorInfoM9239a.f25107c == 7 && Util.f25665a < 34) {
                ColorInfo.Builder builder = new ColorInfo.Builder();
                builder.f25112a = colorInfoM9239a.f25105a;
                builder.f25113b = colorInfoM9239a.f25106b;
                builder.f25115d = colorInfoM9239a.f25108d;
                builder.f25116e = colorInfoM9239a.f25109e;
                builder.f25117f = colorInfoM9239a.f25110f;
                builder.f25114c = 6;
                colorInfoM9239a = builder.m9239a();
            }
            ColorInfo colorInfo = colorInfoM9239a;
            Looper looperMyLooper = Looper.myLooper();
            Assertions.m9466g(looperMyLooper);
            HandlerWrapper handlerWrapperMo9469a = playbackVideoGraphWrapper.f27891h.mo9469a(looperMyLooper, null);
            playbackVideoGraphWrapper.f27893j = handlerWrapperMo9469a;
            try {
                PreviewingVideoGraph previewingVideoGraphMo9350a = ((ReflectivePreviewingSingleInputVideoGraphFactory) playbackVideoGraphWrapper.f27886c).mo9350a(playbackVideoGraphWrapper.f27884a, colorInfo, playbackVideoGraphWrapper, new ExecutorC1937e(handlerWrapperMo9469a), playbackVideoGraphWrapper.f27889f, playbackVideoGraphWrapper.f27888e);
                playbackVideoGraphWrapper.f27894k = previewingVideoGraphMo9350a;
                previewingVideoGraphMo9350a.initialize();
                Pair pair = playbackVideoGraphWrapper.f27895l;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    Size size = (Size) pair.second;
                    playbackVideoGraphWrapper.m10725a(surface, size.f25652a, size.f25653b);
                }
                videoSink.getClass();
                playbackVideoGraphWrapper.f27897n = 1;
                try {
                    PreviewingVideoGraph previewingVideoGraph = playbackVideoGraphWrapper.f27894k;
                    previewingVideoGraph.getClass();
                    previewingVideoGraph.m9399c();
                    playbackVideoGraphWrapper.f27903t++;
                    DefaultVideoSinkListener defaultVideoSinkListener = playbackVideoGraphWrapper.new DefaultVideoSinkListener();
                    HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.f27893j;
                    handlerWrapper.getClass();
                    ExecutorC1937e executorC1937e = new ExecutorC1937e(handlerWrapper);
                    DefaultVideoSink defaultVideoSink = (DefaultVideoSink) videoSink;
                    defaultVideoSink.f27795h = defaultVideoSinkListener;
                    defaultVideoSink.f27796i = executorC1937e;
                    VideoFrameProcessor videoFrameProcessorM9398b = playbackVideoGraphWrapper.f27894k.m9398b();
                    this.f27915c = videoFrameProcessorM9398b;
                    return videoFrameProcessorM9398b != null;
                } catch (VideoFrameProcessingException e) {
                    throw new VideoSink.VideoSinkException(e, format);
                }
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink.VideoSinkException(e2, format);
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m10731i() {
            return this.f27915c != null;
        }

        /* JADX INFO: renamed from: j */
        public final void m10732j(boolean z2) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.f27890g).f27788a.m10743c(z2);
        }

        /* JADX INFO: renamed from: k */
        public final void m10733k(Format format) {
            Format.Builder builderM9248a = format.m9248a();
            ColorInfo colorInfo = format.f25135B;
            if (colorInfo == null || !colorInfo.m9238d()) {
                colorInfo = ColorInfo.f25104h;
            }
            builderM9248a.f25174A = colorInfo;
            builderM9248a.m9250a();
            VideoFrameProcessor videoFrameProcessor = this.f27915c;
            Assertions.m9466g(videoFrameProcessor);
            videoFrameProcessor.m9396d();
        }

        /* JADX INFO: renamed from: l */
        public final void m10734l(int i) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.f27890g).f27788a.f27938b;
            if (videoFrameReleaseHelper.f27962j == i) {
                return;
            }
            videoFrameReleaseHelper.f27962j = i;
            videoFrameReleaseHelper.m10752d(true);
        }

        /* JADX INFO: renamed from: m */
        public final void m10735m(Surface surface, Size size) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            Pair pair = playbackVideoGraphWrapper.f27895l;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) playbackVideoGraphWrapper.f27895l.second).equals(size)) {
                return;
            }
            playbackVideoGraphWrapper.f27895l = Pair.create(surface, size);
            playbackVideoGraphWrapper.m10725a(surface, size.f25652a, size.f25653b);
        }

        /* JADX INFO: renamed from: n */
        public final void m10736n(List list) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            playbackVideoGraphWrapper.f27886c.getClass();
            this.f27914b = new ImmutableList.Builder().addAll((Iterable) list).addAll((Iterable) playbackVideoGraphWrapper.f27888e).build();
        }

        /* JADX INFO: renamed from: o */
        public final void m10737o(float f) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.f27890g).f27788a.m10748h(f);
        }

        /* JADX INFO: renamed from: p */
        public final void m10738p(List list) {
            if (this.f27914b.equals(list)) {
                return;
            }
            m10736n(list);
            Format format = this.f27916d;
            if (format != null) {
                m10733k(format);
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m10739q(VideoFrameMetadataListener videoFrameMetadataListener) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.f27890g).f27797j = videoFrameMetadataListener;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: a */
        void mo10726a(VideoSize videoSize);

        /* JADX INFO: renamed from: b */
        void mo10727b();

        /* JADX INFO: renamed from: c */
        void mo10728c();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {

        /* JADX INFO: renamed from: a */
        public static final Supplier f27922a = Suppliers.memoize(new C1940h());
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {

        /* JADX INFO: renamed from: a */
        public final VideoFrameProcessor.Factory f27923a;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.f27923a = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        /* JADX INFO: renamed from: a */
        public final PreviewingVideoGraph mo9350a(Context context, ColorInfo colorInfo, PlaybackVideoGraphWrapper playbackVideoGraphWrapper, ExecutorC1937e executorC1937e, VideoCompositorSettings videoCompositorSettings, ImmutableList immutableList) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.f27923a)).mo9350a(context, colorInfo, playbackVideoGraphWrapper, executorC1937e, videoCompositorSettings, immutableList);
            } catch (Exception e) {
                int i = VideoFrameProcessingException.f25424a;
                if (e instanceof VideoFrameProcessingException) {
                    throw ((VideoFrameProcessingException) e);
                }
                throw new VideoFrameProcessingException(e);
            }
        }
    }

    public PlaybackVideoGraphWrapper(Builder builder) {
        this.f27884a = builder.f27904a;
        PreviewingVideoGraph.Factory factory = builder.f27907d;
        Assertions.m9466g(factory);
        this.f27886c = factory;
        this.f27887d = new SparseArray();
        this.f27888e = builder.f27908e;
        this.f27889f = builder.f27909f;
        SystemClock systemClock = builder.f27910g;
        this.f27891h = systemClock;
        this.f27890g = new DefaultVideoSink(builder.f27905b, systemClock);
        this.f27892i = new CopyOnWriteArraySet();
        new Format.Builder().m9250a();
        this.f27899p = -9223372036854775807L;
        this.f27902s = -1;
        this.f27897n = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m10725a(Surface surface, int i, int i2) {
        PreviewingVideoGraph previewingVideoGraph = this.f27894k;
        if (previewingVideoGraph == null) {
            return;
        }
        VideoSink videoSink = this.f27890g;
        if (surface == null) {
            previewingVideoGraph.m9397a();
            DefaultVideoSink defaultVideoSink = (DefaultVideoSink) videoSink;
            defaultVideoSink.f27792e = null;
            defaultVideoSink.f27788a.m10747g(null);
            return;
        }
        previewingVideoGraph.m9397a();
        new Size(i, i2);
        DefaultVideoSink defaultVideoSink2 = (DefaultVideoSink) videoSink;
        defaultVideoSink2.f27792e = surface;
        defaultVideoSink2.f27788a.m10747g(surface);
    }
}
