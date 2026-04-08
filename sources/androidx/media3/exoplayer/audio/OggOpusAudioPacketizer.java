package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OggOpusAudioPacketizer {

    /* JADX INFO: renamed from: d */
    public static final byte[] f26714d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.f42537FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, UnsignedBytes.MAX_POWER_OF_TWO, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f26715e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.f42547VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f26716a;

    /* JADX INFO: renamed from: b */
    public int f26717b;

    /* JADX INFO: renamed from: c */
    public int f26718c;

    /* JADX INFO: renamed from: a */
    public static void m10280a(ByteBuffer byteBuffer, long j, int i, int i2, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z2 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(UnsignedBytes.checkedCast(i2));
    }
}
