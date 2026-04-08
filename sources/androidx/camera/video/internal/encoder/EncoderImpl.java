package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.Encoder;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class EncoderImpl implements Encoder {

    /* JADX INFO: renamed from: b */
    public static final Range f3463b = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* JADX INFO: renamed from: a */
    public InternalState f3464a;

    /* JADX INFO: renamed from: androidx.camera.video.internal.encoder.EncoderImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03921 implements FutureCallback<InputBuffer> {

        /* JADX INFO: renamed from: androidx.camera.video.internal.encoder.EncoderImpl$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements FutureCallback<Void> {
            public AnonymousClass1() {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                boolean z2 = th instanceof MediaCodec.CodecException;
                C03921 c03921 = C03921.this;
                if (z2) {
                    c03921.getClass();
                    throw null;
                }
                c03921.getClass();
                th.getMessage();
                throw null;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.encoder.EncoderImpl$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03932 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3466a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f3466a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3466a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3466a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3466a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3466a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3466a[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3466a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3466a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3466a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Surface m1908a() {
            return MediaCodec.createPersistentInputSurface();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m1909b(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ByteBufferInput implements Encoder.ByteBufferInput {
        @Override // androidx.camera.core.impl.Observable
        /* JADX INFO: renamed from: a */
        public final void mo1474a(Observable.Observer observer) {
            throw null;
        }

        @Override // androidx.camera.core.impl.Observable
        /* JADX INFO: renamed from: b */
        public final void mo1475b(Executor executor, Observable.Observer observer) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class InternalState {

        /* JADX INFO: renamed from: a */
        public static final InternalState f3467a;

        /* JADX INFO: renamed from: b */
        public static final InternalState f3468b;

        /* JADX INFO: renamed from: c */
        public static final InternalState f3469c;

        /* JADX INFO: renamed from: d */
        public static final InternalState f3470d;

        /* JADX INFO: renamed from: f */
        public static final InternalState f3471f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InternalState[] f3472g;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            f3467a = internalState;
            InternalState internalState2 = new InternalState("STARTED", 1);
            InternalState internalState3 = new InternalState("PAUSED", 2);
            InternalState internalState4 = new InternalState("STOPPING", 3);
            InternalState internalState5 = new InternalState("PENDING_START", 4);
            f3468b = internalState5;
            InternalState internalState6 = new InternalState("PENDING_START_PAUSED", 5);
            f3469c = internalState6;
            InternalState internalState7 = new InternalState("PENDING_RELEASE", 6);
            f3470d = internalState7;
            InternalState internalState8 = new InternalState("ERROR", 7);
            f3471f = internalState8;
            f3472g = new InternalState[]{internalState, internalState2, internalState3, internalState4, internalState5, internalState6, internalState7, internalState8, new InternalState("RELEASED", 8)};
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) f3472g.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class MediaCodecCallback extends MediaCodec.Callback {

        /* JADX INFO: renamed from: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$1 */
        /* JADX INFO: compiled from: Proguard */
        class C03941 implements FutureCallback<Void> {
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                throw null;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            throw null;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            throw null;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            throw null;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SurfaceInput implements Encoder.SurfaceInput {
    }

    /* JADX INFO: renamed from: a */
    public final void m1907a(int i, String str, Throwable th) {
        switch (this.f3464a.ordinal()) {
            case 0:
                throw null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                InternalState internalState = InternalState.f3471f;
                if (this.f3464a != internalState) {
                    Logger.m1280a(null, "Transitioning encoder internal state: " + this.f3464a + " --> " + internalState);
                    this.f3464a = internalState;
                }
                new RunnableC0015a(this, i, str, th);
                new ArrayList();
                throw null;
            case 7:
                Logger.m1289j(null, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }
}
