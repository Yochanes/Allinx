package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class OpusUtil {
    /* JADX INFO: renamed from: a */
    public static ArrayList m10817a(byte[] bArr) {
        long j = (((long) (((bArr[11] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[10] & UnsignedBytes.MAX_VALUE))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static long m10818b(byte b2, byte b3) {
        int i;
        int i2 = b2 & UnsignedBytes.MAX_VALUE;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i4 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }
}
