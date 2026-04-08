package androidx.media3.decoder;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.exoplayer.image.ImageOutputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f25944a;

    /* JADX INFO: renamed from: e */
    public final DecoderInputBuffer[] f25948e;

    /* JADX INFO: renamed from: f */
    public final DecoderOutputBuffer[] f25949f;

    /* JADX INFO: renamed from: g */
    public int f25950g;

    /* JADX INFO: renamed from: h */
    public int f25951h;

    /* JADX INFO: renamed from: i */
    public DecoderInputBuffer f25952i;

    /* JADX INFO: renamed from: j */
    public DecoderException f25953j;

    /* JADX INFO: renamed from: k */
    public boolean f25954k;

    /* JADX INFO: renamed from: l */
    public boolean f25955l;

    /* JADX INFO: renamed from: m */
    public int f25956m;

    /* JADX INFO: renamed from: b */
    public final Object f25945b = new Object();

    /* JADX INFO: renamed from: n */
    public long f25957n = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f25946c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f25947d = new ArrayDeque();

    /* JADX INFO: renamed from: androidx.media3.decoder.SimpleDecoder$1 */
    /* JADX INFO: compiled from: Proguard */
    class C17651 extends Thread {
        public C17651() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (SimpleDecoder.this.m9752k());
        }
    }

    public SimpleDecoder(DecoderInputBuffer[] decoderInputBufferArr, DecoderOutputBuffer[] decoderOutputBufferArr) {
        this.f25948e = decoderInputBufferArr;
        this.f25950g = decoderInputBufferArr.length;
        for (int i = 0; i < this.f25950g; i++) {
            this.f25948e[i] = mo9748g();
        }
        this.f25949f = decoderOutputBufferArr;
        this.f25951h = decoderOutputBufferArr.length;
        for (int i2 = 0; i2 < this.f25951h; i2++) {
            this.f25949f[i2] = mo9749h();
        }
        C17651 c17651 = new C17651();
        this.f25944a = c17651;
        c17651.start();
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9737a() {
        return m9753l();
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9738b(Object obj) {
        m9747f((DecoderInputBuffer) obj);
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: c */
    public final void mo9739c(long j) {
        synchronized (this.f25945b) {
            try {
                Assertions.m9464e(this.f25950g == this.f25948e.length || this.f25954k);
                this.f25957n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: e */
    public final Object mo9740e() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f25945b) {
            try {
                DecoderException decoderException = this.f25953j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.m9464e(this.f25952i == null);
                int i = this.f25950g;
                if (i == 0) {
                    decoderInputBuffer = null;
                } else {
                    DecoderInputBuffer[] decoderInputBufferArr = this.f25948e;
                    int i2 = i - 1;
                    this.f25950g = i2;
                    decoderInputBuffer = decoderInputBufferArr[i2];
                }
                this.f25952i = decoderInputBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return decoderInputBuffer;
    }

    /* JADX INFO: renamed from: f */
    public final void m9747f(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.f25945b) {
            try {
                DecoderException decoderException = this.f25953j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.m9460a(decoderInputBuffer == this.f25952i);
                this.f25946c.addLast(decoderInputBuffer);
                if (!this.f25946c.isEmpty() && this.f25951h > 0) {
                    this.f25945b.notify();
                }
                this.f25952i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.f25945b) {
            try {
                this.f25954k = true;
                this.f25956m = 0;
                DecoderInputBuffer decoderInputBuffer = this.f25952i;
                if (decoderInputBuffer != null) {
                    decoderInputBuffer.mo9741h();
                    int i = this.f25950g;
                    this.f25950g = i + 1;
                    this.f25948e[i] = decoderInputBuffer;
                    this.f25952i = null;
                }
                while (!this.f25946c.isEmpty()) {
                    DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) this.f25946c.removeFirst();
                    decoderInputBuffer2.mo9741h();
                    int i2 = this.f25950g;
                    this.f25950g = i2 + 1;
                    this.f25948e[i2] = decoderInputBuffer2;
                }
                while (!this.f25947d.isEmpty()) {
                    ((DecoderOutputBuffer) this.f25947d.removeFirst()).mo9746i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract DecoderInputBuffer mo9748g();

    /* JADX INFO: renamed from: h */
    public abstract DecoderOutputBuffer mo9749h();

    /* JADX INFO: renamed from: i */
    public abstract DecoderException mo9750i(Throwable th);

    /* JADX INFO: renamed from: j */
    public abstract DecoderException mo9751j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2);

    /* JADX INFO: renamed from: k */
    public final boolean m9752k() {
        boolean z2;
        DecoderException decoderExceptionMo9750i;
        synchronized (this.f25945b) {
            while (!this.f25955l) {
                try {
                    if (!this.f25946c.isEmpty() && this.f25951h > 0) {
                        break;
                    }
                    this.f25945b.wait();
                } finally {
                }
            }
            if (this.f25955l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f25946c.removeFirst();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.f25949f;
            int i = this.f25951h - 1;
            this.f25951h = i;
            DecoderOutputBuffer decoderOutputBuffer = decoderOutputBufferArr[i];
            boolean z3 = this.f25954k;
            this.f25954k = false;
            if (decoderInputBuffer.m9735f(4)) {
                decoderOutputBuffer.m9734e(4);
            } else {
                decoderOutputBuffer.f25941b = decoderInputBuffer.f25938g;
                if (decoderInputBuffer.m9735f(134217728)) {
                    decoderOutputBuffer.m9734e(134217728);
                }
                long j = decoderInputBuffer.f25938g;
                synchronized (this.f25945b) {
                    long j2 = this.f25957n;
                    z2 = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z2) {
                    decoderOutputBuffer.f25943d = true;
                }
                try {
                    decoderExceptionMo9750i = mo9751j(decoderInputBuffer, decoderOutputBuffer, z3);
                } catch (OutOfMemoryError e) {
                    decoderExceptionMo9750i = mo9750i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionMo9750i = mo9750i(e2);
                }
                if (decoderExceptionMo9750i != null) {
                    synchronized (this.f25945b) {
                        this.f25953j = decoderExceptionMo9750i;
                    }
                    return false;
                }
            }
            synchronized (this.f25945b) {
                try {
                    if (this.f25954k) {
                        decoderOutputBuffer.mo9746i();
                    } else if (decoderOutputBuffer.f25943d) {
                        this.f25956m++;
                        decoderOutputBuffer.mo9746i();
                    } else {
                        decoderOutputBuffer.f25942c = this.f25956m;
                        this.f25956m = 0;
                        this.f25947d.addLast(decoderOutputBuffer);
                    }
                    decoderInputBuffer.mo9741h();
                    int i2 = this.f25950g;
                    this.f25950g = i2 + 1;
                    this.f25948e[i2] = decoderInputBuffer;
                } finally {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final DecoderOutputBuffer m9753l() {
        synchronized (this.f25945b) {
            try {
                DecoderException decoderException = this.f25953j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f25947d.isEmpty()) {
                    return null;
                }
                return (DecoderOutputBuffer) this.f25947d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9754m(DecoderOutputBuffer decoderOutputBuffer) {
        synchronized (this.f25945b) {
            decoderOutputBuffer.mo9745h();
            int i = this.f25951h;
            this.f25951h = i + 1;
            this.f25949f[i] = decoderOutputBuffer;
            if (!this.f25946c.isEmpty() && this.f25951h > 0) {
                this.f25945b.notify();
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void release() {
        synchronized (this.f25945b) {
            this.f25955l = true;
            this.f25945b.notify();
        }
        try {
            this.f25944a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ ImageOutputBuffer mo9737a() {
        return (ImageOutputBuffer) m9753l();
    }
}
