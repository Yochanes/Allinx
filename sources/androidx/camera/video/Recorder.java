package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.AutoValue_MediaSpec;
import androidx.camera.video.AutoValue_VideoSpec;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Recorder implements VideoOutput {

    /* JADX INFO: renamed from: a */
    public static final Set f3316a = Collections.unmodifiableSet(EnumSet.of(State.f3323b, State.f3324c));

    /* JADX INFO: renamed from: b */
    public static final Set f3317b = Collections.unmodifiableSet(EnumSet.of(State.f3322a, State.f3325d, State.f3327g, State.f3326f, State.f3328i));

    /* JADX INFO: renamed from: c */
    public static final Executor f3318c;

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03621 implements FutureCallback<Encoder> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.m1280a("Recorder", "VideoEncoder Setup error: " + th);
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            Encoder encoder = (Encoder) obj;
            Logger.m1280a("Recorder", "VideoEncoder is created. " + encoder);
            if (encoder != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$2 */
    /* JADX INFO: compiled from: Proguard */
    class C03632 implements FutureCallback<Encoder> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.m1280a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            Encoder encoder = (Encoder) obj;
            Logger.m1280a("Recorder", "VideoEncoder can be released: " + encoder);
            if (encoder != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$3 */
    /* JADX INFO: compiled from: Proguard */
    class C03643 implements FutureCallback<Void> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$4 */
    /* JADX INFO: compiled from: Proguard */
    class C03654 implements EncoderCallback {
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$5 */
    /* JADX INFO: compiled from: Proguard */
    class C03665 implements AudioSource.AudioSourceCallback {
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$6 */
    /* JADX INFO: compiled from: Proguard */
    class C03676 implements EncoderCallback {
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$7 */
    /* JADX INFO: compiled from: Proguard */
    class C03687 implements FutureCallback<List<Void>> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            Logger.m1280a("Recorder", "Encodings end successfully.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$8 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03698 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3319a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3320b;

        static {
            int[] iArr = new int[AudioState.values().length];
            f3320b = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3320b[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3320b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3320b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3320b[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3320b[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[State.values().length];
            f3319a = iArr2;
            try {
                iArr2[5] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3319a[4] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3319a[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3319a[1] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3319a[7] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3319a[6] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3319a[0] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3319a[8] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3319a[3] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AudioState {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ AudioState[] f3321a = {new AudioState("INITIALIZING", 0), new AudioState("IDLING", 1), new AudioState("DISABLED", 2), new AudioState("ENABLED", 3), new AudioState("ERROR_ENCODER", 4), new AudioState("ERROR_SOURCE", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        AudioState EF5;

        public static AudioState valueOf(String str) {
            return (AudioState) Enum.valueOf(AudioState.class, str);
        }

        public static AudioState[] values() {
            return (AudioState[]) f3321a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    @RequiresApi
    public static abstract class RecordingRecord implements AutoCloseable {

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$RecordingRecord$1 */
        /* JADX INFO: compiled from: Proguard */
        class C03701 implements AudioSourceSupplier {
        }

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$RecordingRecord$2 */
        /* JADX INFO: compiled from: Proguard */
        class C03712 implements AudioSourceSupplier {
        }

        /* JADX INFO: compiled from: Proguard */
        public interface AudioSourceSupplier {
        }

        /* JADX INFO: compiled from: Proguard */
        public interface MediaMuxerSupplier {
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            Uri uri = Uri.EMPTY;
            throw null;
        }

        public final void finalize() throws Throwable {
            try {
                throw null;
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f3322a;

        /* JADX INFO: renamed from: b */
        public static final State f3323b;

        /* JADX INFO: renamed from: c */
        public static final State f3324c;

        /* JADX INFO: renamed from: d */
        public static final State f3325d;

        /* JADX INFO: renamed from: f */
        public static final State f3326f;

        /* JADX INFO: renamed from: g */
        public static final State f3327g;

        /* JADX INFO: renamed from: i */
        public static final State f3328i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ State[] f3329j;

        static {
            State state = new State("CONFIGURING", 0);
            f3322a = state;
            State state2 = new State("PENDING_RECORDING", 1);
            f3323b = state2;
            State state3 = new State("PENDING_PAUSED", 2);
            f3324c = state3;
            State state4 = new State("IDLING", 3);
            f3325d = state4;
            State state5 = new State("RECORDING", 4);
            State state6 = new State("PAUSED", 5);
            State state7 = new State("STOPPING", 6);
            f3326f = state7;
            State state8 = new State("RESETTING", 7);
            f3327g = state8;
            State state9 = new State("ERROR", 8);
            f3328i = state9;
            f3329j = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f3329j.clone();
        }
    }

    static {
        Quality quality = Quality.f3304c;
        QualitySelector qualitySelectorM1822a = QualitySelector.m1822a(Arrays.asList(quality, Quality.f3303b, Quality.f3302a), new AutoValue_FallbackStrategy_RuleStrategy(quality, 1));
        VideoSpec.Builder builderM1842a = VideoSpec.m1842a();
        ((AutoValue_VideoSpec.Builder) builderM1842a).f3297a = qualitySelectorM1822a;
        ((AutoValue_VideoSpec.Builder) builderM1842a).f3300d = -1;
        builderM1842a.mo1821a();
        AutoValue_MediaSpec.Builder builder = new AutoValue_MediaSpec.Builder();
        builder.f3287b = -1;
        builder.f3286a = AudioSpec.m1792a().mo1798a();
        VideoSpec.m1842a().mo1821a();
        builder.f3287b = -1;
        String strConcat = builder.f3286a == null ? "".concat(" audioSpec") : "";
        if (builder.f3287b == null) {
            strConcat = AbstractC0000a.m2C(strConcat, " outputFormat");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        builder.f3287b.intValue();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f3318c = CameraXExecutors.m1620f(CameraXExecutors.m1617c());
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: a */
    public final void mo1823a(SurfaceRequest surfaceRequest) {
        throw null;
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: b */
    public final VideoCapabilities mo1824b(CameraInfo cameraInfo) {
        return new RecorderVideoCapabilities((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: c */
    public final Observable mo1825c() {
        return null;
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: d */
    public final Observable mo1826d() {
        return null;
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: e */
    public final void mo1827e() {
        throw null;
    }

    @Override // androidx.camera.video.VideoOutput
    /* JADX INFO: renamed from: f */
    public final void mo1828f(SurfaceRequest surfaceRequest) {
        throw null;
    }
}
