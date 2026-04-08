package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi
@RestrictTo
class MetadataListReader {

    /* JADX INFO: compiled from: Proguard */
    public static class ByteBufferReader implements OpenTypeReader {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f24331a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f24331a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* JADX INFO: renamed from: a */
        public final void m8808a(int i) {
            ByteBuffer byteBuffer = this.f24331a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OffsetInfo {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OpenTypeReader {
    }

    /* JADX INFO: renamed from: a */
    public static MetadataList m8807a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBufferDuplicate);
        byteBufferReader.m8808a(4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferReader.m8808a(6);
        int i2 = 0;
        while (true) {
            byteBuffer = byteBufferReader.f24331a;
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            byteBufferReader.m8808a(4);
            j = ((long) byteBuffer.getInt()) & 4294967295L;
            byteBufferReader.m8808a(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferReader.m8808a((int) (j - ((long) byteBuffer.position())));
            byteBufferReader.m8808a(12);
            long j2 = ((long) byteBuffer.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBuffer.getInt();
                long j3 = ((long) byteBuffer.getInt()) & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    MetadataList metadataList = new MetadataList();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    metadataList.f24373b = byteBufferDuplicate;
                    metadataList.f24372a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    metadataList.f24374c = i6;
                    metadataList.f24375d = metadataList.f24373b.getShort(i6);
                    return metadataList;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
