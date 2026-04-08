package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f26908g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f26909h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f26910a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f26911b;

    /* JADX INFO: renamed from: c */
    public Handler f26912c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f26913d;

    /* JADX INFO: renamed from: e */
    public final ConditionVariable f26914e;

    /* JADX INFO: renamed from: f */
    public boolean f26915f;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1 */
    /* JADX INFO: compiled from: Proguard */
    class HandlerC18381 extends Handler {
        public HandlerC18381(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = AsynchronousMediaCodecBufferEnqueuer.this;
            ArrayDeque arrayDeque = AsynchronousMediaCodecBufferEnqueuer.f26908g;
            asynchronousMediaCodecBufferEnqueuer.getClass();
            int i = message.what;
            MessageParams messageParams = null;
            if (i == 1) {
                MessageParams messageParams2 = (MessageParams) message.obj;
                try {
                    asynchronousMediaCodecBufferEnqueuer.f26910a.queueInputBuffer(messageParams2.f26917a, 0, messageParams2.f26918b, messageParams2.f26920d, messageParams2.f26921e);
                } catch (RuntimeException e) {
                    AtomicReference atomicReference = asynchronousMediaCodecBufferEnqueuer.f26913d;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                }
                messageParams = messageParams2;
            } else if (i == 2) {
                MessageParams messageParams3 = (MessageParams) message.obj;
                int i2 = messageParams3.f26917a;
                MediaCodec.CryptoInfo cryptoInfo = messageParams3.f26919c;
                long j = messageParams3.f26920d;
                int i3 = messageParams3.f26921e;
                try {
                    synchronized (AsynchronousMediaCodecBufferEnqueuer.f26909h) {
                        asynchronousMediaCodecBufferEnqueuer.f26910a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e2) {
                    AtomicReference atomicReference2 = asynchronousMediaCodecBufferEnqueuer.f26913d;
                    while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                    }
                }
                messageParams = messageParams3;
            } else if (i == 3) {
                asynchronousMediaCodecBufferEnqueuer.f26914e.m9477e();
            } else if (i != 4) {
                AtomicReference atomicReference3 = asynchronousMediaCodecBufferEnqueuer.f26913d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    asynchronousMediaCodecBufferEnqueuer.f26910a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference4 = asynchronousMediaCodecBufferEnqueuer.f26913d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
            }
            if (messageParams != null) {
                ArrayDeque arrayDeque2 = AsynchronousMediaCodecBufferEnqueuer.f26908g;
                synchronized (arrayDeque2) {
                    arrayDeque2.add(messageParams);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MessageParams {

        /* JADX INFO: renamed from: a */
        public int f26917a;

        /* JADX INFO: renamed from: b */
        public int f26918b;

        /* JADX INFO: renamed from: c */
        public final MediaCodec.CryptoInfo f26919c = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: d */
        public long f26920d;

        /* JADX INFO: renamed from: e */
        public int f26921e;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.f26910a = mediaCodec;
        this.f26911b = handlerThread;
        this.f26914e = conditionVariable;
        this.f26913d = new AtomicReference();
    }

    /* JADX INFO: renamed from: e */
    public static MessageParams m10363e() {
        ArrayDeque arrayDeque = f26908g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return (MessageParams) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: a */
    public final void mo10364a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        mo10367d();
        MessageParams messageParamsM10363e = m10363e();
        messageParamsM10363e.f26917a = i;
        messageParamsM10363e.f26918b = 0;
        messageParamsM10363e.f26920d = j;
        messageParamsM10363e.f26921e = i2;
        int i3 = cryptoInfo.f25927f;
        MediaCodec.CryptoInfo cryptoInfo2 = messageParamsM10363e.f26919c;
        cryptoInfo2.numSubSamples = i3;
        int[] iArr = cryptoInfo.f25925d;
        int[] iArrCopyOf = cryptoInfo2.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo2.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cryptoInfo.f25926e;
        int[] iArrCopyOf2 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cryptoInfo.f25923b;
        byte[] bArrCopyOf = cryptoInfo2.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo2.key = bArrCopyOf;
        byte[] bArr2 = cryptoInfo.f25922a;
        byte[] bArrCopyOf2 = cryptoInfo2.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo2.iv = bArrCopyOf2;
        cryptoInfo2.mode = cryptoInfo.f25924c;
        if (Util.f25665a >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.f25928g, cryptoInfo.f25929h));
        }
        this.f26912c.obtainMessage(2, messageParamsM10363e).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: b */
    public final void mo10365b(Bundle bundle) {
        mo10367d();
        Handler handler = this.f26912c;
        int i = Util.f25665a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: c */
    public final void mo10366c(int i, int i2, int i3, long j) {
        mo10367d();
        MessageParams messageParamsM10363e = m10363e();
        messageParamsM10363e.f26917a = i;
        messageParamsM10363e.f26918b = i2;
        messageParamsM10363e.f26920d = j;
        messageParamsM10363e.f26921e = i3;
        Handler handler = this.f26912c;
        int i4 = Util.f25665a;
        handler.obtainMessage(1, messageParamsM10363e).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    /* JADX INFO: renamed from: d */
    public final void mo10367d() {
        RuntimeException runtimeException = (RuntimeException) this.f26913d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
        if (this.f26915f) {
            try {
                Handler handler = this.f26912c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.f26914e;
                conditionVariable.m9476d();
                Handler handler2 = this.f26912c;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                conditionVariable.m9473a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
        if (this.f26915f) {
            flush();
            this.f26911b.quit();
        }
        this.f26915f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
        if (this.f26915f) {
            return;
        }
        HandlerThread handlerThread = this.f26911b;
        handlerThread.start();
        this.f26912c = new HandlerC18381(handlerThread.getLooper());
        this.f26915f = true;
    }
}
