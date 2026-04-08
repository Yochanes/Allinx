package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ObuParser {

    /* JADX INFO: compiled from: Proguard */
    public static final class FrameHeader {

        /* JADX INFO: renamed from: a */
        public final boolean f25766a;

        public FrameHeader(SequenceHeader sequenceHeader, Obu obu) throws NotYetImplementedException {
            int i = obu.f25767a;
            Assertions.m9460a(i == 6 || i == 3);
            ByteBuffer byteBuffer = obu.f25768b;
            int iMin = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[iMin];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, iMin);
            ObuParser.m9655a(sequenceHeader.f25769a);
            if (parsableBitArray.m9529f()) {
                this.f25766a = false;
                return;
            }
            int iM9530g = parsableBitArray.m9530g(2);
            boolean zM9529f = parsableBitArray.m9529f();
            ObuParser.m9655a(sequenceHeader.f25770b);
            if (!zM9529f) {
                this.f25766a = true;
                return;
            }
            boolean zM9529f2 = (iM9530g == 3 || iM9530g == 0) ? true : parsableBitArray.m9529f();
            parsableBitArray.m9537n();
            ObuParser.m9655a(!sequenceHeader.f25772d);
            if (parsableBitArray.m9529f()) {
                ObuParser.m9655a(!sequenceHeader.f25773e);
                parsableBitArray.m9537n();
            }
            ObuParser.m9655a(sequenceHeader.f25771c);
            if (iM9530g != 3) {
                parsableBitArray.m9537n();
            }
            parsableBitArray.m9538o(sequenceHeader.f25774f);
            if (iM9530g != 2 && iM9530g != 0 && !zM9529f2) {
                parsableBitArray.m9538o(3);
            }
            this.f25766a = ((iM9530g == 3 || iM9530g == 0) ? 255 : parsableBitArray.m9530g(8)) != 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class NotYetImplementedException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Obu {

        /* JADX INFO: renamed from: a */
        public final int f25767a;

        /* JADX INFO: renamed from: b */
        public final ByteBuffer f25768b;

        public Obu(int i, ByteBuffer byteBuffer) {
            this.f25767a = i;
            this.f25768b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SequenceHeader {

        /* JADX INFO: renamed from: a */
        public final boolean f25769a;

        /* JADX INFO: renamed from: b */
        public final boolean f25770b;

        /* JADX INFO: renamed from: c */
        public final boolean f25771c;

        /* JADX INFO: renamed from: d */
        public final boolean f25772d;

        /* JADX INFO: renamed from: e */
        public final boolean f25773e;

        /* JADX INFO: renamed from: f */
        public final int f25774f;

        public SequenceHeader(Obu obu) throws NotYetImplementedException {
            Assertions.m9460a(obu.f25767a == 1);
            ByteBuffer byteBuffer = obu.f25768b;
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, iRemaining);
            parsableBitArray.m9538o(4);
            boolean zM9529f = parsableBitArray.m9529f();
            this.f25769a = zM9529f;
            ObuParser.m9655a(zM9529f);
            if (parsableBitArray.m9529f()) {
                parsableBitArray.m9538o(64);
                if (parsableBitArray.m9529f()) {
                    int i = 0;
                    while (!parsableBitArray.m9529f()) {
                        i++;
                    }
                    if (i < 32) {
                        parsableBitArray.m9538o(i);
                    }
                }
                boolean zM9529f2 = parsableBitArray.m9529f();
                this.f25770b = zM9529f2;
                if (zM9529f2) {
                    parsableBitArray.m9538o(47);
                }
            } else {
                this.f25770b = false;
            }
            boolean zM9529f3 = parsableBitArray.m9529f();
            int iM9530g = parsableBitArray.m9530g(5);
            for (int i2 = 0; i2 <= iM9530g; i2++) {
                parsableBitArray.m9538o(12);
                if (parsableBitArray.m9530g(5) > 7) {
                    parsableBitArray.m9537n();
                }
                ObuParser.m9655a(this.f25770b);
                if (zM9529f3 && parsableBitArray.m9529f()) {
                    parsableBitArray.m9538o(4);
                }
            }
            int iM9530g2 = parsableBitArray.m9530g(4);
            int iM9530g3 = parsableBitArray.m9530g(4);
            parsableBitArray.m9538o(iM9530g2 + 1);
            parsableBitArray.m9538o(iM9530g3 + 1);
            boolean zM9529f4 = parsableBitArray.m9529f();
            this.f25771c = zM9529f4;
            ObuParser.m9655a(zM9529f4);
            parsableBitArray.m9538o(3);
            parsableBitArray.m9538o(4);
            boolean zM9529f5 = parsableBitArray.m9529f();
            if (zM9529f5) {
                parsableBitArray.m9538o(2);
            }
            if (parsableBitArray.m9529f()) {
                this.f25772d = true;
            } else {
                this.f25772d = parsableBitArray.m9529f();
            }
            if (!this.f25772d || parsableBitArray.m9529f()) {
                this.f25773e = true;
            } else {
                this.f25773e = parsableBitArray.m9529f();
            }
            if (zM9529f5) {
                this.f25774f = parsableBitArray.m9530g(3) + 1;
            } else {
                this.f25774f = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9655a(boolean z2) throws NotYetImplementedException {
        if (z2) {
            throw new NotYetImplementedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m9656b(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b2 = byteBufferAsReadOnlyBuffer.get();
            int i = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b2 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b3 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b3 & Ascii.DEL) << (i2 * 7);
                    if ((b3 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new Obu(i, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
