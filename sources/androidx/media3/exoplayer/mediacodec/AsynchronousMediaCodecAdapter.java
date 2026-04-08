package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.compose.p013ui.text.android.AbstractC1330c;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f26900a;

    /* JADX INFO: renamed from: b */
    public final AsynchronousMediaCodecCallback f26901b;

    /* JADX INFO: renamed from: c */
    public final MediaCodecBufferEnqueuer f26902c;

    /* JADX INFO: renamed from: d */
    public final LoudnessCodecController f26903d;

    /* JADX INFO: renamed from: e */
    public boolean f26904e;

    /* JADX INFO: renamed from: f */
    public int f26905f = 0;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements MediaCodecAdapter.Factory {

        /* JADX INFO: renamed from: a */
        public final C1844b f26906a;

        /* JADX INFO: renamed from: b */
        public final C1844b f26907b;

        public Factory(C1844b c1844b, C1844b c1844b2) {
            this.f26906a = c1844b;
            this.f26907b = c1844b2;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ MediaCodecAdapter mo10361a(MediaCodecAdapter.Configuration configuration) {
            return m10362b(configuration);
        }

        /* JADX INFO: renamed from: b */
        public final AsynchronousMediaCodecAdapter m10362b(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = configuration.f26946a.f26953a;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.f26906a.get(), new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (HandlerThread) this.f26907b.get()), configuration.f26951f);
                    try {
                        Trace.endSection();
                        Surface surface = configuration.f26949d;
                        AsynchronousMediaCodecAdapter.m10344p(asynchronousMediaCodecAdapter2, configuration.f26947b, surface, configuration.f26950e, (surface == null && configuration.f26946a.f26960h && Util.f25665a >= 35) ? 8 : 0);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e) {
                        e = e;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, LoudnessCodecController loudnessCodecController) {
        this.f26900a = mediaCodec;
        this.f26901b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f26902c = mediaCodecBufferEnqueuer;
        this.f26903d = loudnessCodecController;
    }

    /* JADX INFO: renamed from: p */
    public static void m10344p(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        LoudnessCodecController loudnessCodecController;
        android.media.LoudnessCodecController loudnessCodecController2;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.f26901b;
        Assertions.m9464e(asynchronousMediaCodecCallback.f26924c == null);
        HandlerThread handlerThread = asynchronousMediaCodecCallback.f26923b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.f26900a;
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.f26924c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        asynchronousMediaCodecAdapter.f26902c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Util.f25665a >= 35 && (loudnessCodecController = asynchronousMediaCodecAdapter.f26903d) != null && ((loudnessCodecController2 = loudnessCodecController.f26943c) == null || AbstractC1330c.m6485i(loudnessCodecController2, mediaCodec))) {
            Assertions.m9464e(loudnessCodecController.f26941a.add(mediaCodec));
        }
        asynchronousMediaCodecAdapter.f26905f = 1;
    }

    /* JADX INFO: renamed from: q */
    public static String m10345q(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: a */
    public final void mo10346a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        this.f26902c.mo10364a(i, cryptoInfo, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: b */
    public final void mo10347b(Bundle bundle) {
        this.f26902c.mo10365b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: c */
    public final void mo10348c(int i, int i2, int i3, long j) {
        this.f26902c.mo10366c(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: d */
    public final boolean mo10349d(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            asynchronousMediaCodecCallback.f26936o = onBufferAvailableListener;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: e */
    public final void mo10350e(int i) {
        this.f26900a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: f */
    public final void mo10351f(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f26900a.setOnFrameRenderedListener(new C1843a(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f26902c.flush();
        this.f26900a.flush();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            asynchronousMediaCodecCallback.f26933l++;
            Handler handler = asynchronousMediaCodecCallback.f26924c;
            int i = Util.f25665a;
            handler.post(new RunnableC1845c(asynchronousMediaCodecCallback));
        }
        this.f26900a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: g */
    public final MediaFormat mo10352g() {
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            try {
                mediaFormat = asynchronousMediaCodecCallback.f26929h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: h */
    public final void mo10353h() {
        AbstractC1330c.m6482f(this.f26900a);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: i */
    public final void mo10354i(int i, long j) {
        this.f26900a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: j */
    public final int mo10355j() {
        this.f26902c.mo10367d();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f26935n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f26935n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.f26931j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.f26931j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.f26932k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.f26932k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (asynchronousMediaCodecCallback.f26933l > 0 || asynchronousMediaCodecCallback.f26934m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.f26925d;
                int i2 = circularIntArray.f3651b;
                int i3 = circularIntArray.f3652c;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = circularIntArray.f3650a[i2];
                    circularIntArray.f3651b = (i2 + 1) & circularIntArray.f3653d;
                }
                return i;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: k */
    public final int mo10356k(MediaCodec.BufferInfo bufferInfo) {
        this.f26902c.mo10367d();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f26935n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f26935n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.f26931j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.f26931j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.f26932k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.f26932k = null;
                    throw cryptoException;
                }
                if (asynchronousMediaCodecCallback.f26933l > 0 || asynchronousMediaCodecCallback.f26934m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.f26926e;
                int i = circularIntArray.f3651b;
                int i2 = circularIntArray.f3652c;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = circularIntArray.f3650a[i];
                circularIntArray.f3651b = circularIntArray.f3653d & (i + 1);
                if (i3 >= 0) {
                    Assertions.m9466g(asynchronousMediaCodecCallback.f26929h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) asynchronousMediaCodecCallback.f26927f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    asynchronousMediaCodecCallback.f26929h = (MediaFormat) asynchronousMediaCodecCallback.f26928g.remove();
                }
                return i3;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: l */
    public final void mo10357l(int i) {
        this.f26900a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: m */
    public final ByteBuffer mo10358m(int i) {
        return this.f26900a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: n */
    public final void mo10359n(Surface surface) {
        this.f26900a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: o */
    public final ByteBuffer mo10360o(int i) {
        return this.f26900a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.f26905f == 1) {
                this.f26902c.shutdown();
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f26901b;
                synchronized (asynchronousMediaCodecCallback.f26922a) {
                    asynchronousMediaCodecCallback.f26934m = true;
                    asynchronousMediaCodecCallback.f26923b.quit();
                    asynchronousMediaCodecCallback.m10368a();
                }
            }
            this.f26905f = 2;
            if (this.f26904e) {
                return;
            }
            try {
                int i = Util.f25665a;
                if (i >= 30 && i < 33) {
                    this.f26900a.stop();
                }
                if (i >= 35 && (loudnessCodecController2 = this.f26903d) != null) {
                    loudnessCodecController2.m10371a(this.f26900a);
                }
                this.f26900a.release();
                this.f26904e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f26904e) {
                try {
                    int i2 = Util.f25665a;
                    if (i2 >= 30 && i2 < 33) {
                        this.f26900a.stop();
                    }
                    if (i2 >= 35 && (loudnessCodecController = this.f26903d) != null) {
                        loudnessCodecController.m10371a(this.f26900a);
                    }
                    this.f26900a.release();
                    this.f26904e = true;
                } finally {
                }
            }
            throw th;
        }
    }
}
