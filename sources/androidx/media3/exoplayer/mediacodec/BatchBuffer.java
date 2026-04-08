package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class BatchBuffer extends DecoderInputBuffer {

    /* JADX INFO: renamed from: n */
    public long f26937n;

    /* JADX INFO: renamed from: o */
    public int f26938o;

    /* JADX INFO: renamed from: p */
    public int f26939p;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    /* JADX INFO: renamed from: h */
    public final void mo9741h() {
        super.mo9741h();
        this.f26938o = 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m10369l(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        Assertions.m9460a(!decoderInputBuffer.m9735f(Ints.MAX_POWER_OF_TWO));
        Assertions.m9460a(!decoderInputBuffer.m9735f(268435456));
        Assertions.m9460a(!decoderInputBuffer.m9735f(4));
        if (m10370m()) {
            if (this.f26938o >= this.f26939p) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.f25936d;
            if (byteBuffer2 != null && (byteBuffer = this.f25936d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f26938o;
        this.f26938o = i + 1;
        if (i == 0) {
            this.f25938g = decoderInputBuffer.f25938g;
            if (decoderInputBuffer.m9735f(1)) {
                this.f25921a = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f25936d;
        if (byteBuffer3 != null) {
            m9743j(byteBuffer3.remaining());
            this.f25936d.put(byteBuffer3);
        }
        this.f26937n = decoderInputBuffer.f25938g;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10370m() {
        return this.f26938o > 0;
    }
}
