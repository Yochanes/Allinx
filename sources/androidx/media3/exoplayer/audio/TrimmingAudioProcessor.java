package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TrimmingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public int f26734i;

    /* JADX INFO: renamed from: j */
    public int f26735j;

    /* JADX INFO: renamed from: k */
    public boolean f26736k;

    /* JADX INFO: renamed from: l */
    public int f26737l;

    /* JADX INFO: renamed from: m */
    public byte[] f26738m;

    /* JADX INFO: renamed from: n */
    public int f26739n;

    /* JADX INFO: renamed from: o */
    public long f26740o;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.f25449c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.f26736k = true;
        return (this.f26734i == 0 && this.f26735j == 0) ? AudioProcessor.AudioFormat.f25446e : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public final boolean mo9437b() {
        return super.mo9437b() && this.f26739n == 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final ByteBuffer mo9438c() {
        int i;
        if (super.mo9437b() && (i = this.f26739n) > 0) {
            m9446j(i).put(this.f26738m, 0, this.f26739n).flip();
            this.f26739n = 0;
        }
        return super.mo9438c();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f26737l);
        this.f26740o += (long) (iMin / this.f25451b.f25450d);
        this.f26737l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f26737l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f26739n + i2) - this.f26738m.length;
        ByteBuffer byteBufferM9446j = m9446j(length);
        int iM9618i = Util.m9618i(length, 0, this.f26739n);
        byteBufferM9446j.put(this.f26738m, 0, iM9618i);
        int iM9618i2 = Util.m9618i(length - iM9618i, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM9618i2);
        byteBufferM9446j.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM9618i2;
        int i4 = this.f26739n - iM9618i;
        this.f26739n = i4;
        byte[] bArr = this.f26738m;
        System.arraycopy(bArr, iM9618i, bArr, 0, i4);
        byteBuffer.get(this.f26738m, this.f26739n, i3);
        this.f26739n += i3;
        byteBufferM9446j.flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: g */
    public final void mo9443g() {
        if (this.f26736k) {
            this.f26736k = false;
            int i = this.f26735j;
            int i2 = this.f25451b.f25450d;
            this.f26738m = new byte[i * i2];
            this.f26737l = this.f26734i * i2;
        }
        this.f26739n = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: h */
    public final void mo9444h() {
        if (this.f26736k) {
            int i = this.f26739n;
            if (i > 0) {
                this.f26740o += (long) (i / this.f25451b.f25450d);
            }
            this.f26739n = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: i */
    public final void mo9445i() {
        this.f26738m = Util.f25667c;
    }
}
