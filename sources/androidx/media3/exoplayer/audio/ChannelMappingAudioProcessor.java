package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public int[] f26584i;

    /* JADX INFO: renamed from: j */
    public int[] f26585j;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f26584i;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.f25446e;
        }
        int i = audioFormat.f25449c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int length = iArr.length;
        int i2 = audioFormat.f25448b;
        boolean z2 = i2 != length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", audioFormat);
            }
            z2 |= i4 != i3;
            i3++;
        }
        if (z2) {
            return new AudioProcessor.AudioFormat(audioFormat.f25447a, iArr.length, i);
        }
        return AudioProcessor.AudioFormat.f25446e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        int[] iArr = this.f26585j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM9446j = m9446j(((iLimit - iPosition) / this.f25451b.f25450d) * this.f25452c.f25450d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                int iM9627r = (Util.m9627r(this.f25451b.f25449c) * i) + iPosition;
                int i2 = this.f25451b.f25449c;
                if (i2 == 2) {
                    byteBufferM9446j.putShort(byteBuffer.getShort(iM9627r));
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f25451b.f25449c);
                    }
                    byteBufferM9446j.putFloat(byteBuffer.getFloat(iM9627r));
                }
            }
            iPosition += this.f25451b.f25450d;
        }
        byteBuffer.position(iLimit);
        byteBufferM9446j.flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: g */
    public final void mo9443g() {
        this.f26585j = this.f26584i;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: i */
    public final void mo9445i() {
        this.f26585j = null;
        this.f26584i = null;
    }
}
