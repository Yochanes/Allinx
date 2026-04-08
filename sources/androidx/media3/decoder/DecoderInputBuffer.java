package androidx.media3.decoder;

import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DecoderInputBuffer extends Buffer {

    /* JADX INFO: renamed from: b */
    public Format f25934b;

    /* JADX INFO: renamed from: c */
    public final CryptoInfo f25935c = new CryptoInfo();

    /* JADX INFO: renamed from: d */
    public ByteBuffer f25936d;

    /* JADX INFO: renamed from: f */
    public boolean f25937f;

    /* JADX INFO: renamed from: g */
    public long f25938g;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f25939i;

    /* JADX INFO: renamed from: j */
    public final int f25940j;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InsufficientCapacityException extends IllegalStateException {
    }

    static {
        MediaLibraryInfo.m9322a("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.f25940j = i;
    }

    /* JADX INFO: renamed from: h */
    public void mo9741h() {
        this.f25921a = 0;
        ByteBuffer byteBuffer = this.f25936d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f25939i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f25937f = false;
    }

    /* JADX INFO: renamed from: i */
    public final ByteBuffer m9742i(int i) {
        int i2 = this.f25940j;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f25936d;
        throw new InsufficientCapacityException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    /* JADX INFO: renamed from: j */
    public final void m9743j(int i) {
        ByteBuffer byteBuffer = this.f25936d;
        if (byteBuffer == null) {
            this.f25936d = m9742i(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f25936d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM9742i = m9742i(i2);
        byteBufferM9742i.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM9742i.put(byteBuffer);
        }
        this.f25936d = byteBufferM9742i;
    }

    /* JADX INFO: renamed from: k */
    public final void m9744k() {
        ByteBuffer byteBuffer = this.f25936d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f25939i;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
