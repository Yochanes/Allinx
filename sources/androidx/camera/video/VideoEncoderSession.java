package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class VideoEncoderSession {

    /* JADX INFO: renamed from: androidx.camera.video.VideoEncoderSession$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03761 implements FutureCallback<Encoder> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.m1289j("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.VideoEncoderSession$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03772 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3369a;

        static {
            int[] iArr = new int[VideoEncoderState.values().length];
            f3369a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3369a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3369a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3369a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3369a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class VideoEncoderState {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ VideoEncoderState[] f3370a = {new VideoEncoderState("NOT_INITIALIZED", 0), new VideoEncoderState("INITIALIZING", 1), new VideoEncoderState("PENDING_RELEASE", 2), new VideoEncoderState("READY", 3), new VideoEncoderState("RELEASED", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        VideoEncoderState EF5;

        public static VideoEncoderState valueOf(String str) {
            return (VideoEncoderState) Enum.valueOf(VideoEncoderState.class, str);
        }

        public static VideoEncoderState[] values() {
            return (VideoEncoderState[]) f3370a.clone();
        }
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for SURFACE_REQUEST_NOT_CONFIGURED";
    }
}
