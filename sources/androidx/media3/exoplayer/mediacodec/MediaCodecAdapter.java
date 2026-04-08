package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaCodecAdapter {

    /* JADX INFO: compiled from: Proguard */
    public static final class Configuration {

        /* JADX INFO: renamed from: a */
        public final MediaCodecInfo f26946a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f26947b;

        /* JADX INFO: renamed from: c */
        public final Format f26948c;

        /* JADX INFO: renamed from: d */
        public final Surface f26949d;

        /* JADX INFO: renamed from: e */
        public final MediaCrypto f26950e;

        /* JADX INFO: renamed from: f */
        public final LoudnessCodecController f26951f;

        public Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto, LoudnessCodecController loudnessCodecController) {
            this.f26946a = mediaCodecInfo;
            this.f26947b = mediaFormat;
            this.f26948c = format;
            this.f26949d = surface;
            this.f26950e = mediaCrypto;
            this.f26951f = loudnessCodecController;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
        /* JADX INFO: renamed from: a */
        MediaCodecAdapter mo10361a(Configuration configuration);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnBufferAvailableListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnFrameRenderedListener {
        /* JADX INFO: renamed from: a */
        void mo10373a(long j);
    }

    /* JADX INFO: renamed from: a */
    void mo10346a(int i, CryptoInfo cryptoInfo, long j, int i2);

    /* JADX INFO: renamed from: b */
    void mo10347b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    void mo10348c(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: d */
    default boolean mo10349d(OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    void mo10350e(int i);

    /* JADX INFO: renamed from: f */
    void mo10351f(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void flush();

    /* JADX INFO: renamed from: g */
    MediaFormat mo10352g();

    /* JADX INFO: renamed from: h */
    void mo10353h();

    /* JADX INFO: renamed from: i */
    void mo10354i(int i, long j);

    /* JADX INFO: renamed from: j */
    int mo10355j();

    /* JADX INFO: renamed from: k */
    int mo10356k(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: l */
    void mo10357l(int i);

    /* JADX INFO: renamed from: m */
    ByteBuffer mo10358m(int i);

    /* JADX INFO: renamed from: n */
    void mo10359n(Surface surface);

    /* JADX INFO: renamed from: o */
    ByteBuffer mo10360o(int i);

    void release();
}
