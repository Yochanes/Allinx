package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.f25449c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new AudioProcessor.AudioFormat(audioFormat.f25447a, audioFormat.f25448b, 2) : AudioProcessor.AudioFormat.f25446e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo9439d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f25451b.f25449c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 != 22) {
                    if (i2 != 268435456) {
                        if (i2 != 1342177280) {
                            if (i2 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            i /= 2;
                        }
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferM9446j = m9446j(i);
        int i3 = this.f25451b.f25449c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM9446j.put((byte) 0);
                byteBufferM9446j.put((byte) ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM9617h = (short) (Util.m9617h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM9446j.put((byte) (sM9617h & 255));
                byteBufferM9446j.put((byte) ((sM9617h >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM9446j.put(byteBuffer.get(iPosition + 1));
                byteBufferM9446j.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM9446j.put(byteBuffer.get(iPosition + 2));
                byteBufferM9446j.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM9446j.put(byteBuffer.get(iPosition + 1));
                byteBufferM9446j.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM9446j.put(byteBuffer.get(iPosition + 1));
                byteBufferM9446j.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM9446j.put(byteBuffer.get(iPosition + 1));
                byteBufferM9446j.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9446j.flip();
    }
}
