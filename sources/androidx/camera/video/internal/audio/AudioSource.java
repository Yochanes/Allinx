package androidx.camera.video.internal.audio;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.InputBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class AudioSource {

    /* JADX INFO: renamed from: a */
    public BufferProvider.State f3407a;

    /* JADX INFO: renamed from: b */
    public boolean f3408b;

    /* JADX INFO: renamed from: c */
    public boolean f3409c;

    /* JADX INFO: renamed from: d */
    public long f3410d;

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.AudioSource$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03831 implements Observable.Observer<BufferProvider.State> {
        @Override // androidx.camera.core.impl.Observable.Observer
        /* JADX INFO: renamed from: a */
        public final void mo1510a(Object obj) {
            Objects.requireNonNull((BufferProvider.State) obj);
            throw null;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.AudioSource$2 */
    /* JADX INFO: compiled from: Proguard */
    class C03842 implements FutureCallback<InputBuffer> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.AudioSource$3 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03853 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3411a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f3411a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3411a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3411a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface AudioSourceCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public class AudioStreamCallback implements AudioStream.AudioStreamCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class InternalState {

        /* JADX INFO: renamed from: a */
        public static final InternalState f3412a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ InternalState[] f3413b;

        /* JADX INFO: Fake field, exist only in values array */
        InternalState EF0;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            InternalState internalState2 = new InternalState("STARTED", 1);
            f3412a = internalState2;
            f3413b = new InternalState[]{internalState, internalState2, new InternalState("RELEASED", 2)};
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) f3413b.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1854a() {
        if (this.f3408b) {
            this.f3408b = false;
            Logger.m1280a("AudioSource", "stopSendingAudio");
            throw null;
        }
    }
}
