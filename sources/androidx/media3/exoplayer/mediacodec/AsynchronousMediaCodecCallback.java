package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f26923b;

    /* JADX INFO: renamed from: c */
    public Handler f26924c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f26929h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f26930i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f26931j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f26932k;

    /* JADX INFO: renamed from: l */
    public long f26933l;

    /* JADX INFO: renamed from: m */
    public boolean f26934m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f26935n;

    /* JADX INFO: renamed from: o */
    public MediaCodecAdapter.OnBufferAvailableListener f26936o;

    /* JADX INFO: renamed from: a */
    public final Object f26922a = new Object();

    /* JADX INFO: renamed from: d */
    public final CircularIntArray f26925d = new CircularIntArray();

    /* JADX INFO: renamed from: e */
    public final CircularIntArray f26926e = new CircularIntArray();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f26927f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f26928g = new ArrayDeque();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f26923b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m10368a() {
        ArrayDeque arrayDeque = this.f26928g;
        if (!arrayDeque.isEmpty()) {
            this.f26930i = (MediaFormat) arrayDeque.getLast();
        }
        CircularIntArray circularIntArray = this.f26925d;
        circularIntArray.f3652c = circularIntArray.f3651b;
        CircularIntArray circularIntArray2 = this.f26926e;
        circularIntArray2.f3652c = circularIntArray2.f3651b;
        this.f26927f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f26922a) {
            this.f26932k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f26922a) {
            this.f26931j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f26922a) {
            this.f26925d.m1983a(i);
            MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.f26936o;
            if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.f26980K) != null) {
                wakeupListener.mo9951b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f26922a) {
            try {
                MediaFormat mediaFormat = this.f26930i;
                if (mediaFormat != null) {
                    this.f26926e.m1983a(-2);
                    this.f26928g.add(mediaFormat);
                    this.f26930i = null;
                }
                this.f26926e.m1983a(i);
                this.f26927f.add(bufferInfo);
                MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.f26936o;
                if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.f26980K) != null) {
                    wakeupListener.mo9951b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f26922a) {
            this.f26926e.m1983a(-2);
            this.f26928g.add(mediaFormat);
            this.f26930i = null;
        }
    }
}
