package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoRendererEventListener {

    /* JADX INFO: compiled from: Proguard */
    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a */
        public final Handler f27988a;

        /* JADX INFO: renamed from: b */
        public final VideoRendererEventListener f27989b;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f27988a = handler;
            this.f27989b = videoRendererEventListener;
        }

        /* JADX INFO: renamed from: a */
        public final void m10754a(VideoSize videoSize) {
            Handler handler = this.f27988a;
            if (handler != null) {
                handler.post(new RunnableC1936d(1, this, videoSize));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    default void mo9844a(VideoSize videoSize) {
    }

    /* JADX INFO: renamed from: c */
    default void mo9846c(String str) {
    }

    /* JADX INFO: renamed from: l */
    default void mo9855l(DecoderCounters decoderCounters) {
    }

    /* JADX INFO: renamed from: s */
    default void mo9862s(DecoderCounters decoderCounters) {
    }

    /* JADX INFO: renamed from: w */
    default void mo9866w(Exception exc) {
    }

    /* JADX INFO: renamed from: d */
    default void mo9847d(int i, long j) {
    }

    /* JADX INFO: renamed from: j */
    default void mo9853j(int i, long j) {
    }

    /* JADX INFO: renamed from: p */
    default void mo9859p(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    /* JADX INFO: renamed from: x */
    default void mo9867x(long j, Object obj) {
    }

    /* JADX INFO: renamed from: e */
    default void mo9848e(String str, long j, long j2) {
    }
}
