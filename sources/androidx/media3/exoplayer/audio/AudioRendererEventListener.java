package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface AudioRendererEventListener {

    /* JADX INFO: compiled from: Proguard */
    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a */
        public final Handler f26521a;

        /* JADX INFO: renamed from: b */
        public final AudioRendererEventListener f26522b;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.f26521a = handler;
            this.f26522b = audioRendererEventListener;
        }

        /* JADX INFO: renamed from: a */
        public final void m10213a(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f26521a;
            if (handler != null) {
                handler.post(new RunnableC1805a(this, decoderCounters, 1));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    default void mo9845b(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    /* JADX INFO: renamed from: f */
    default void mo9849f(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    /* JADX INFO: renamed from: h */
    default void mo9851h(String str) {
    }

    /* JADX INFO: renamed from: k */
    default void mo9854k(DecoderCounters decoderCounters) {
    }

    /* JADX INFO: renamed from: o */
    default void mo9858o(boolean z2) {
    }

    /* JADX INFO: renamed from: q */
    default void mo9860q(Exception exc) {
    }

    /* JADX INFO: renamed from: t */
    default void mo9863t(long j) {
    }

    /* JADX INFO: renamed from: v */
    default void mo9865v(Exception exc) {
    }

    /* JADX INFO: renamed from: y */
    default void mo9868y(DecoderCounters decoderCounters) {
    }

    /* JADX INFO: renamed from: u */
    default void mo9864u(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    /* JADX INFO: renamed from: g */
    default void mo9850g(long j, long j2, int i) {
    }

    /* JADX INFO: renamed from: i */
    default void mo9852i(String str, long j, long j2) {
    }
}
