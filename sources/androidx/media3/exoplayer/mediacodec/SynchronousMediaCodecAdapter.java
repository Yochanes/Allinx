package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.compose.p013ui.text.android.AbstractC1330c;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f27043a;

    /* JADX INFO: renamed from: b */
    public final LoudnessCodecController f27044b;

    /* JADX INFO: compiled from: Proguard */
    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX INFO: renamed from: b */
        public static MediaCodec m10432b(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodecInfo mediaCodecInfo = configuration.f26946a;
            StringBuilder sb = new StringBuilder("createCodec:");
            String str = mediaCodecInfo.f26953a;
            sb.append(str);
            Trace.beginSection(sb.toString());
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final MediaCodecAdapter mo10361a(MediaCodecAdapter.Configuration configuration) throws Throwable {
            MediaCodec mediaCodecM10432b = null;
            try {
                mediaCodecM10432b = m10432b(configuration);
                Trace.beginSection("configureCodec");
                Surface surface = configuration.f26949d;
                mediaCodecM10432b.configure(configuration.f26947b, surface, configuration.f26950e, (surface == null && configuration.f26946a.f26960h && Util.f25665a >= 35) ? 8 : 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecM10432b.start();
                Trace.endSection();
                return new SynchronousMediaCodecAdapter(mediaCodecM10432b, configuration.f26951f);
            } catch (IOException e) {
                e = e;
                if (mediaCodecM10432b != null) {
                    mediaCodecM10432b.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                if (mediaCodecM10432b != null) {
                }
                throw e;
            }
        }
    }

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec, LoudnessCodecController loudnessCodecController) {
        this.f27043a = mediaCodec;
        this.f27044b = loudnessCodecController;
        if (Util.f25665a < 35 || loudnessCodecController == null) {
            return;
        }
        android.media.LoudnessCodecController loudnessCodecController2 = loudnessCodecController.f26943c;
        if (loudnessCodecController2 == null || AbstractC1330c.m6485i(loudnessCodecController2, mediaCodec)) {
            Assertions.m9464e(loudnessCodecController.f26941a.add(mediaCodec));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: a */
    public final void mo10346a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        this.f27043a.queueSecureInputBuffer(i, 0, cryptoInfo.f25930i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: b */
    public final void mo10347b(Bundle bundle) {
        this.f27043a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: c */
    public final void mo10348c(int i, int i2, int i3, long j) {
        this.f27043a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: e */
    public final void mo10350e(int i) {
        this.f27043a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: f */
    public final void mo10351f(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f27043a.setOnFrameRenderedListener(new C1843a(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f27043a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: g */
    public final MediaFormat mo10352g() {
        return this.f27043a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: h */
    public final void mo10353h() {
        AbstractC1330c.m6482f(this.f27043a);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: i */
    public final void mo10354i(int i, long j) {
        this.f27043a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: j */
    public final int mo10355j() {
        return this.f27043a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: k */
    public final int mo10356k(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f27043a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: l */
    public final void mo10357l(int i) {
        this.f27043a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: m */
    public final ByteBuffer mo10358m(int i) {
        return this.f27043a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: n */
    public final void mo10359n(Surface surface) {
        this.f27043a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /* JADX INFO: renamed from: o */
    public final ByteBuffer mo10360o(int i) {
        return this.f27043a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController = this.f27044b;
        MediaCodec mediaCodec = this.f27043a;
        try {
            int i = Util.f25665a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && loudnessCodecController != null) {
                loudnessCodecController.m10371a(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Util.f25665a >= 35 && loudnessCodecController != null) {
                loudnessCodecController.m10371a(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }
}
