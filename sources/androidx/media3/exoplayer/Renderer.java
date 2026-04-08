package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Renderer extends PlayerMessage.Target {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface WakeupListener {
        /* JADX INFO: renamed from: a */
        void mo9950a();

        /* JADX INFO: renamed from: b */
        void mo9951b();
    }

    /* JADX INFO: renamed from: A */
    long mo9768A();

    /* JADX INFO: renamed from: B */
    void mo9769B(long j);

    /* JADX INFO: renamed from: C */
    boolean mo9770C();

    /* JADX INFO: renamed from: D */
    MediaClock mo9771D();

    /* JADX INFO: renamed from: a */
    boolean mo9954a();

    /* JADX INFO: renamed from: b */
    boolean mo9782b();

    /* JADX INFO: renamed from: c */
    void mo9783c();

    /* JADX INFO: renamed from: f */
    int mo9784f();

    String getName();

    int getState();

    SampleStream getStream();

    /* JADX INFO: renamed from: i */
    boolean mo9786i();

    /* JADX INFO: renamed from: j */
    void mo9787j(Timeline timeline);

    /* JADX INFO: renamed from: m */
    void mo9788m();

    /* JADX INFO: renamed from: o */
    void mo9789o(int i, PlayerId playerId, SystemClock systemClock);

    /* JADX INFO: renamed from: p */
    void mo9790p(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z2, boolean z3, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    /* JADX INFO: renamed from: q */
    RendererCapabilities mo9791q();

    void reset();

    void start();

    void stop();

    /* JADX INFO: renamed from: w */
    void mo9957w(long j, long j2);

    /* JADX INFO: renamed from: y */
    void mo9795y(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    /* JADX INFO: renamed from: z */
    void mo9796z();

    /* JADX INFO: renamed from: l */
    default void mo9955l() {
    }

    default void release() {
    }

    /* JADX INFO: renamed from: t */
    default void mo9956t(float f, float f2) {
    }
}
