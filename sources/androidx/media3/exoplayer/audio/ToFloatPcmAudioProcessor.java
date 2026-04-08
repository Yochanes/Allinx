package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ToFloatPcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i */
    public static final int f26733i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: k */
    public static void m10284k(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f26733i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.f25449c;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 4 ? new AudioProcessor.AudioFormat(audioFormat.f25447a, audioFormat.f25448b, 4) : AudioProcessor.AudioFormat.f25446e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM9446j;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f25451b.f25449c;
        if (i2 == 21) {
            byteBufferM9446j = m9446j((i / 3) * 4);
            while (iPosition < iLimit) {
                m10284k(((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 24), byteBufferM9446j);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM9446j = m9446j(i);
            while (iPosition < iLimit) {
                m10284k((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) << 24), byteBufferM9446j);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM9446j = m9446j((i / 3) * 4);
            while (iPosition < iLimit) {
                m10284k(((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferM9446j);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM9446j = m9446j(i);
            while (iPosition < iLimit) {
                m10284k((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferM9446j);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9446j.flip();
    }
}
