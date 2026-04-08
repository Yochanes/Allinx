package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SonicAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public int f25481b;

    /* JADX INFO: renamed from: c */
    public float f25482c;

    /* JADX INFO: renamed from: d */
    public float f25483d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.AudioFormat f25484e;

    /* JADX INFO: renamed from: f */
    public AudioProcessor.AudioFormat f25485f;

    /* JADX INFO: renamed from: g */
    public AudioProcessor.AudioFormat f25486g;

    /* JADX INFO: renamed from: h */
    public AudioProcessor.AudioFormat f25487h;

    /* JADX INFO: renamed from: i */
    public boolean f25488i;

    /* JADX INFO: renamed from: j */
    public Sonic f25489j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f25490k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f25491l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f25492m;

    /* JADX INFO: renamed from: n */
    public long f25493n;

    /* JADX INFO: renamed from: o */
    public long f25494o;

    /* JADX INFO: renamed from: p */
    public boolean f25495p;

    /* JADX INFO: renamed from: a */
    public final long m9453a(long j) {
        if (this.f25494o < 1024) {
            return (long) (((double) this.f25482c) * j);
        }
        long j2 = this.f25493n;
        Sonic sonic = this.f25489j;
        sonic.getClass();
        long j3 = j2 - ((long) ((sonic.f25468k * sonic.f25459b) * 2));
        int i = this.f25487h.f25447a;
        int i2 = this.f25486g.f25447a;
        return i == i2 ? Util.m9604N(j, j3, this.f25494o, RoundingMode.DOWN) : Util.m9604N(j, j3 * ((long) i), this.f25494o * ((long) i2), RoundingMode.DOWN);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public final boolean mo9437b() {
        if (this.f25495p) {
            Sonic sonic = this.f25489j;
            if (sonic != null) {
                Assertions.m9464e(sonic.f25470m >= 0);
                if (sonic.f25470m * sonic.f25459b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final ByteBuffer mo9438c() {
        Sonic sonic = this.f25489j;
        if (sonic != null) {
            Assertions.m9464e(sonic.f25470m >= 0);
            int i = sonic.f25470m;
            int i2 = sonic.f25459b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f25490k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f25490k = byteBufferOrder;
                    this.f25491l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f25490k.clear();
                    this.f25491l.clear();
                }
                ShortBuffer shortBuffer = this.f25491l;
                Assertions.m9464e(sonic.f25470m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i2, sonic.f25470m);
                int i4 = iMin * i2;
                shortBuffer.put(sonic.f25469l, 0, i4);
                int i5 = sonic.f25470m - iMin;
                sonic.f25470m = i5;
                short[] sArr = sonic.f25469l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f25494o += (long) i3;
                this.f25490k.limit(i3);
                this.f25492m = this.f25490k;
            }
        }
        ByteBuffer byteBuffer = this.f25492m;
        this.f25492m = AudioProcessor.f25445a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.f25489j;
            sonic.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f25493n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = sonic.f25459b;
            int i2 = iRemaining2 / i;
            short[] sArrM9450c = sonic.m9450c(sonic.f25467j, sonic.f25468k, i2);
            sonic.f25467j = sArrM9450c;
            shortBufferAsShortBuffer.get(sArrM9450c, sonic.f25468k * i, ((i2 * i) * 2) / 2);
            sonic.f25468k += i2;
            sonic.m9452f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final void mo9440e() {
        Sonic sonic = this.f25489j;
        if (sonic != null) {
            int i = sonic.f25468k;
            float f = sonic.f25460c;
            float f2 = sonic.f25461d;
            double d = f / f2;
            double d2 = sonic.f25462e * f2;
            int i2 = sonic.f25475r;
            int i3 = sonic.f25470m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + sonic.f25480w) + ((double) sonic.f25472o)) / d2) + 0.5d));
            sonic.f25480w = 0.0d;
            short[] sArr = sonic.f25467j;
            int i4 = sonic.f25465h * 2;
            sonic.f25467j = sonic.m9450c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = sonic.f25459b;
                if (i5 >= i4 * i6) {
                    break;
                }
                sonic.f25467j[(i6 * i) + i5] = 0;
                i5++;
            }
            sonic.f25468k = i4 + sonic.f25468k;
            sonic.m9452f();
            if (sonic.f25470m > i3) {
                sonic.f25470m = Math.max(i3, 0);
            }
            sonic.f25468k = 0;
            sonic.f25475r = 0;
            sonic.f25472o = 0;
        }
        this.f25495p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final AudioProcessor.AudioFormat mo9441f(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f25449c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.f25481b;
        if (i == -1) {
            i = audioFormat.f25447a;
        }
        this.f25484e = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.f25448b, 2);
        this.f25485f = audioFormat2;
        this.f25488i = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.f25484e;
            this.f25486g = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f25485f;
            this.f25487h = audioFormat2;
            if (this.f25488i) {
                int i = audioFormat.f25447a;
                this.f25489j = new Sonic(this.f25482c, i, this.f25483d, audioFormat.f25448b, audioFormat2.f25447a);
            } else {
                Sonic sonic = this.f25489j;
                if (sonic != null) {
                    sonic.f25468k = 0;
                    sonic.f25470m = 0;
                    sonic.f25472o = 0;
                    sonic.f25473p = 0;
                    sonic.f25474q = 0;
                    sonic.f25475r = 0;
                    sonic.f25476s = 0;
                    sonic.f25477t = 0;
                    sonic.f25478u = 0;
                    sonic.f25479v = 0;
                    sonic.f25480w = 0.0d;
                }
            }
        }
        this.f25492m = AudioProcessor.f25445a;
        this.f25493n = 0L;
        this.f25494o = 0L;
        this.f25495p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f25485f.f25447a != -1) {
            return Math.abs(this.f25482c - 1.0f) >= 1.0E-4f || Math.abs(this.f25483d - 1.0f) >= 1.0E-4f || this.f25485f.f25447a != this.f25484e.f25447a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f25482c = 1.0f;
        this.f25483d = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f25446e;
        this.f25484e = audioFormat;
        this.f25485f = audioFormat;
        this.f25486g = audioFormat;
        this.f25487h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f25445a;
        this.f25490k = byteBuffer;
        this.f25491l = byteBuffer.asShortBuffer();
        this.f25492m = byteBuffer;
        this.f25481b = -1;
        this.f25488i = false;
        this.f25489j = null;
        this.f25493n = 0L;
        this.f25494o = 0L;
        this.f25495p = false;
    }
}
