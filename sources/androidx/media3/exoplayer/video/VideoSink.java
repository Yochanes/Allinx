package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.Renderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoSink {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VideoFrameHandler {
        /* JADX INFO: renamed from: a */
        void mo10718a(long j);

        /* JADX INFO: renamed from: b */
        void mo10719b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class VideoSinkException extends Exception {

        /* JADX INFO: renamed from: a */
        public final Format f27991a;

        public VideoSinkException(Exception exc, Format format) {
            super(exc);
            this.f27991a = format;
        }
    }

    /* JADX INFO: renamed from: d */
    void mo10694d();

    /* JADX INFO: renamed from: e */
    void mo10695e(long j, long j2);

    /* JADX INFO: renamed from: f */
    void mo10696f(Renderer.WakeupListener wakeupListener);

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {

        /* JADX INFO: renamed from: a */
        public static final Listener f27990a = new C19321();

        /* JADX INFO: renamed from: a */
        void mo10715a(VideoSize videoSize);

        /* JADX INFO: renamed from: b */
        void mo10716b();

        /* JADX INFO: renamed from: c */
        void mo10717c();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$Listener$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C19321 implements Listener {
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            /* JADX INFO: renamed from: b */
            public final void mo10716b() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            /* JADX INFO: renamed from: c */
            public final void mo10717c() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            /* JADX INFO: renamed from: a */
            public final void mo10715a(VideoSize videoSize) {
            }
        }
    }
}
