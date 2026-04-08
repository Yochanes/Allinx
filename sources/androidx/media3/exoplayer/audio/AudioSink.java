package androidx.media3.exoplayer.audio;

import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface AudioSink {

    /* JADX INFO: compiled from: Proguard */
    public static final class AudioTrackConfig {

        /* JADX INFO: renamed from: a */
        public final int f26523a;

        /* JADX INFO: renamed from: b */
        public final int f26524b;

        /* JADX INFO: renamed from: c */
        public final int f26525c;

        /* JADX INFO: renamed from: d */
        public final boolean f26526d;

        /* JADX INFO: renamed from: e */
        public final boolean f26527e;

        /* JADX INFO: renamed from: f */
        public final int f26528f;

        public AudioTrackConfig(int i, int i2, int i3, int i4, boolean z2, boolean z3) {
            this.f26523a = i;
            this.f26524b = i2;
            this.f26525c = i3;
            this.f26526d = z2;
            this.f26527e = z3;
            this.f26528f = i4;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f26530a;

        /* JADX INFO: renamed from: b */
        public final boolean f26531b;

        /* JADX INFO: renamed from: c */
        public final Format f26532c;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i4, Format format, boolean z2, RuntimeException runtimeException) {
            StringBuilder sbM24u = AbstractC0000a.m24u("AudioTrack init failed ", " Config(", ", ", i, i2);
            sbM24u.append(i3);
            sbM24u.append(", ");
            sbM24u.append(i4);
            sbM24u.append(") ");
            sbM24u.append(format);
            sbM24u.append(z2 ? " (recoverable)" : "");
            super(sbM24u.toString(), runtimeException);
            this.f26530a = i;
            this.f26531b = z2;
            this.f26532c = format;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnexpectedDiscontinuityException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f26533a;

        /* JADX INFO: renamed from: b */
        public final boolean f26534b;

        /* JADX INFO: renamed from: c */
        public final Format f26535c;

        public WriteException(int i, Format format, boolean z2) {
            super(AbstractC0000a.m9f(i, "AudioTrack write failed: "));
            this.f26534b = z2;
            this.f26533a = i;
            this.f26535c = format;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a */
        public final Format f26529a;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, Format format) {
            super(unhandledAudioFormatException);
            this.f26529a = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.f26529a = format;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: b */
        default void mo10214b(AudioTrackConfig audioTrackConfig) {
        }
    }
}
