package io.ktor.utils.p043io.core;

import androidx.compose.animation.AbstractC0455a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.ChunkBuffer$Companion$Pool$1;
import io.ktor.utils.p043io.core.internal.NumbersKt;
import io.ktor.utils.p043io.core.internal.UTF8Kt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalIoApi
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/utils/io/core/AbstractOutput;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lio/ktor/utils/io/core/Output;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class AbstractOutput implements Appendable, Output {

    /* JADX INFO: renamed from: a */
    public final AbstractOutputSharedState f47339a;

    /* JADX INFO: renamed from: b */
    public final ChunkBuffer$Companion$Pool$1 f47340b;

    public AbstractOutput(ChunkBuffer$Companion$Pool$1 pool) {
        Intrinsics.m18599g(pool, "pool");
        this.f47340b = pool;
        AbstractOutputSharedState abstractOutputSharedState = new AbstractOutputSharedState();
        abstractOutputSharedState.f47343c = Memory.f47323b;
        this.f47339a = abstractOutputSharedState;
        ByteOrder byteOrder = ByteOrder.f47356b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17446C(ByteReadPacket p2) throws EOFException {
        Intrinsics.m18599g(p2, "p");
        ChunkBuffer chunkBufferM17440k = p2.m17440k();
        ChunkBuffer.f47375o.getClass();
        IoBuffer ioBuffer = IoBuffer.f47367r;
        if (chunkBufferM17440k == ioBuffer) {
            chunkBufferM17440k = null;
        } else {
            p2.m17431M(ioBuffer);
            p2.m17430L(0L);
        }
        if (chunkBufferM17440k == null) {
            p2.release();
            return;
        }
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        ChunkBuffer chunkBuffer = abstractOutputSharedState.f47342b;
        if (chunkBuffer == null) {
            m17451h(chunkBufferM17440k);
            return;
        }
        chunkBuffer.m17460b(abstractOutputSharedState.f47344d);
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        int i = bufferSharedState.f47353b;
        int i2 = i - bufferSharedState.f47352a;
        BufferSharedState bufferSharedState2 = chunkBufferM17440k.f47348a;
        int i3 = bufferSharedState2.f47353b - bufferSharedState2.f47352a;
        int i4 = PacketJVMKt.f47369a;
        int i5 = chunkBuffer.f47349b;
        if (i3 < i4) {
            int i6 = bufferSharedState.f47355d;
            if (i3 > (i6 - i) + (i5 - i6)) {
                i3 = -1;
            }
        }
        if (i2 >= i4 || i2 > bufferSharedState2.f47354c || chunkBufferM17440k.getRefCount() != 1) {
            i2 = -1;
        }
        if (i3 == -1 && i2 == -1) {
            m17451h(chunkBufferM17440k);
            return;
        }
        if (i2 == -1 || i3 <= i2) {
            int i7 = bufferSharedState.f47355d;
            BufferAppendKt.m17469a(chunkBuffer, chunkBufferM17440k, (i5 - i7) + (i7 - bufferSharedState.f47353b));
            m17447a();
            ChunkBuffer chunkBufferM17521x = chunkBufferM17440k.m17521x();
            if (chunkBufferM17521x != null) {
                m17451h(chunkBufferM17521x);
            }
            chunkBufferM17440k.mo17494M(p2.f47332c);
            return;
        }
        if (i3 != -1 && i2 >= i3) {
            throw new IllegalStateException(AbstractC0455a.m2237l(i2, i3, "prep = ", ", app = "));
        }
        int i8 = bufferSharedState.f47353b;
        int i9 = bufferSharedState.f47352a;
        int i10 = i8 - i9;
        int i11 = bufferSharedState2.f47352a;
        if (i11 < i10) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i12 = i11 - i10;
        Memory.m17406a(chunkBuffer.f47350c, chunkBufferM17440k.f47350c, i9, i10, i12);
        chunkBuffer.m17461d(i10);
        chunkBufferM17440k.m17464i(i12);
        ChunkBuffer chunkBuffer2 = abstractOutputSharedState.f47341a;
        if (chunkBuffer2 == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (chunkBuffer2 == chunkBuffer) {
            abstractOutputSharedState.f47341a = chunkBufferM17440k;
        } else {
            while (true) {
                ChunkBuffer chunkBufferM17512C = chunkBuffer2.m17512C();
                Intrinsics.m18596d(chunkBufferM17512C);
                if (chunkBufferM17512C == chunkBuffer) {
                    break;
                } else {
                    chunkBuffer2 = chunkBufferM17512C;
                }
            }
            chunkBuffer2.m17517S(chunkBufferM17440k);
        }
        chunkBuffer.mo17494M(this.f47340b);
        abstractOutputSharedState.f47342b = BuffersKt.m17478a(chunkBufferM17440k);
    }

    /* JADX INFO: renamed from: a */
    public final void m17447a() {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        ChunkBuffer chunkBuffer = abstractOutputSharedState.f47342b;
        if (chunkBuffer != null) {
            abstractOutputSharedState.f47344d = chunkBuffer.f47348a.f47353b;
        }
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c2) {
        return mo17448b(c2);
    }

    /* JADX INFO: renamed from: b */
    public AbstractOutput mo17448b(char c2) throws EOFException {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        int i = abstractOutputSharedState.f47344d;
        int i2 = 3;
        if (abstractOutputSharedState.f47345e - i >= 3) {
            ByteBuffer byteBuffer = abstractOutputSharedState.f47343c;
            if (c2 >= 0 && 127 >= c2) {
                byteBuffer.put(i, (byte) c2);
                i2 = 1;
            } else if (128 <= c2 && 2047 >= c2) {
                byteBuffer.put(i, (byte) (((c2 >> 6) & 31) | 192));
                byteBuffer.put(i + 1, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                i2 = 2;
            } else if (2048 <= c2 && 65535 >= c2) {
                byteBuffer.put(i, (byte) (((c2 >> '\f') & 15) | 224));
                byteBuffer.put(i + 1, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer.put(i + 2, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            } else {
                if (0 > c2 || 65535 < c2) {
                    UTF8Kt.m17525b(c2);
                    throw null;
                }
                byteBuffer.put(i, (byte) (((c2 >> 18) & 7) | 240));
                byteBuffer.put(i + 1, (byte) (((c2 >> '\f') & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer.put(i + 2, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer.put(i + 3, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                i2 = 4;
            }
            abstractOutputSharedState.f47344d = i + i2;
            return this;
        }
        ChunkBuffer chunkBufferM17456u = m17456u(3);
        try {
            ByteBuffer byteBuffer2 = chunkBufferM17456u.f47350c;
            int i3 = chunkBufferM17456u.f47348a.f47353b;
            if (c2 >= 0 && 127 >= c2) {
                byteBuffer2.put(i3, (byte) c2);
                i2 = 1;
            } else if (128 <= c2 && 2047 >= c2) {
                byteBuffer2.put(i3, (byte) (((c2 >> 6) & 31) | 192));
                byteBuffer2.put(i3 + 1, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                i2 = 2;
            } else if (2048 <= c2 && 65535 >= c2) {
                byteBuffer2.put(i3, (byte) (((c2 >> '\f') & 15) | 224));
                byteBuffer2.put(i3 + 1, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer2.put(i3 + 2, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            } else {
                if (0 > c2 || 65535 < c2) {
                    UTF8Kt.m17525b(c2);
                    throw null;
                }
                byteBuffer2.put(i3, (byte) (((c2 >> 18) & 7) | 240));
                byteBuffer2.put(i3 + 1, (byte) (((c2 >> '\f') & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer2.put(i3 + 2, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                byteBuffer2.put(i3 + 3, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                i2 = 4;
            }
            chunkBufferM17456u.m17459a(i2);
            if (i2 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            m17447a();
            return this;
        } catch (Throwable th) {
            m17447a();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ChunkBuffer$Companion$Pool$1 pool = this.f47340b;
            ChunkBuffer chunkBufferM17457x = m17457x();
            if (chunkBufferM17457x != null) {
                ChunkBuffer chunkBufferM17512C = chunkBufferM17457x;
                do {
                    try {
                        ByteBuffer byteBuffer = chunkBufferM17512C.f47350c;
                        BufferSharedState bufferSharedState = chunkBufferM17512C.f47348a;
                        int i = bufferSharedState.f47352a;
                        mo17454k(byteBuffer, i, bufferSharedState.f47353b - i);
                        chunkBufferM17512C = chunkBufferM17512C.m17512C();
                    } catch (Throwable th) {
                        while (true) {
                            Intrinsics.m18599g(pool, "pool");
                            if (chunkBufferM17457x == null) {
                                throw th;
                            }
                            ChunkBuffer chunkBufferM17521x = chunkBufferM17457x.m17521x();
                            chunkBufferM17457x.mo17494M(pool);
                            chunkBufferM17457x = chunkBufferM17521x;
                        }
                    }
                } while (chunkBufferM17512C != null);
                while (true) {
                    Intrinsics.m18599g(pool, "pool");
                    if (chunkBufferM17457x == null) {
                        break;
                    }
                    ChunkBuffer chunkBufferM17521x2 = chunkBufferM17457x.m17521x();
                    chunkBufferM17457x.mo17494M(pool);
                    chunkBufferM17457x = chunkBufferM17521x2;
                }
            }
        } finally {
            mo17453j();
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractOutput mo17449d(CharSequence charSequence) {
        if (charSequence == null) {
            mo17450g("null", 0, 4);
            return this;
        }
        mo17450g(charSequence, 0, charSequence.length());
        return this;
    }

    /* JADX INFO: renamed from: g */
    public AbstractOutput mo17450g(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return mo17450g("null", i, i2);
        }
        StringsKt.m17510d(this, charSequence, i, i2, Charsets.f55167a);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m17451h(ChunkBuffer chunkBuffer) throws EOFException {
        ChunkBuffer chunkBufferM17478a = BuffersKt.m17478a(chunkBuffer);
        long jM17479b = BuffersKt.m17479b(chunkBuffer);
        BufferSharedState bufferSharedState = chunkBufferM17478a.f47348a;
        long j = jM17479b - ((long) (bufferSharedState.f47353b - bufferSharedState.f47352a));
        if (j < Integer.MAX_VALUE) {
            m17452i(chunkBuffer, chunkBufferM17478a, (int) j);
        } else {
            NumbersKt.m17523a(j, "total size increase");
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17452i(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2, int i) throws EOFException {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        ChunkBuffer chunkBuffer3 = abstractOutputSharedState.f47342b;
        if (chunkBuffer3 == null) {
            abstractOutputSharedState.f47341a = chunkBuffer;
            abstractOutputSharedState.f47347g = 0;
        } else {
            chunkBuffer3.m17517S(chunkBuffer);
            int i2 = abstractOutputSharedState.f47344d;
            chunkBuffer3.m17460b(i2);
            abstractOutputSharedState.f47347g = (i2 - abstractOutputSharedState.f47346f) + abstractOutputSharedState.f47347g;
        }
        abstractOutputSharedState.f47342b = chunkBuffer2;
        abstractOutputSharedState.f47347g += i;
        ByteBuffer value = chunkBuffer2.f47350c;
        Intrinsics.m18599g(value, "value");
        abstractOutputSharedState.getClass();
        abstractOutputSharedState.f47343c = value;
        BufferSharedState bufferSharedState = chunkBuffer2.f47348a;
        abstractOutputSharedState.f47344d = bufferSharedState.f47353b;
        abstractOutputSharedState.f47346f = bufferSharedState.f47352a;
        abstractOutputSharedState.f47345e = bufferSharedState.f47355d;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo17453j();

    /* JADX INFO: renamed from: k */
    public abstract void mo17454k(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: n */
    public final int m17455n() {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        return (abstractOutputSharedState.f47344d - abstractOutputSharedState.f47346f) + abstractOutputSharedState.f47347g;
    }

    /* JADX INFO: renamed from: u */
    public final ChunkBuffer m17456u(int i) throws EOFException {
        ChunkBuffer chunkBuffer;
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        int i2 = abstractOutputSharedState.f47345e;
        int i3 = abstractOutputSharedState.f47344d;
        if (i2 - i3 >= i && (chunkBuffer = abstractOutputSharedState.f47342b) != null) {
            chunkBuffer.m17460b(i3);
            return chunkBuffer;
        }
        ChunkBuffer chunkBuffer2 = (ChunkBuffer) this.f47340b.mo17488G();
        chunkBuffer2.m17465j();
        if (chunkBuffer2.m17512C() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        m17452i(chunkBuffer2, chunkBuffer2, 0);
        return chunkBuffer2;
    }

    /* JADX INFO: renamed from: x */
    public final ChunkBuffer m17457x() throws EOFException {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        ChunkBuffer chunkBuffer = abstractOutputSharedState.f47341a;
        if (chunkBuffer == null) {
            return null;
        }
        ChunkBuffer chunkBuffer2 = abstractOutputSharedState.f47342b;
        if (chunkBuffer2 != null) {
            chunkBuffer2.m17460b(abstractOutputSharedState.f47344d);
        }
        abstractOutputSharedState.f47341a = null;
        abstractOutputSharedState.f47342b = null;
        abstractOutputSharedState.f47344d = 0;
        abstractOutputSharedState.f47345e = 0;
        abstractOutputSharedState.f47346f = 0;
        abstractOutputSharedState.f47347g = 0;
        ByteBuffer value = Memory.f47323b;
        Intrinsics.m18599g(value, "value");
        abstractOutputSharedState.getClass();
        abstractOutputSharedState.f47343c = value;
        return chunkBuffer;
    }

    /* JADX INFO: renamed from: z */
    public final void m17458z(byte b2) throws InsufficientSpaceException, EOFException {
        AbstractOutputSharedState abstractOutputSharedState = this.f47339a;
        int i = abstractOutputSharedState.f47344d;
        if (i < abstractOutputSharedState.f47345e) {
            abstractOutputSharedState.f47344d = i + 1;
            abstractOutputSharedState.f47343c.put(i, b2);
            return;
        }
        ChunkBuffer chunkBuffer = (ChunkBuffer) this.f47340b.mo17488G();
        chunkBuffer.m17465j();
        if (chunkBuffer.m17512C() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        m17452i(chunkBuffer, chunkBuffer, 0);
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        int i2 = bufferSharedState.f47353b;
        if (i2 == bufferSharedState.f47355d) {
            throw new InsufficientSpaceException("No free space in the buffer to write a byte");
        }
        chunkBuffer.f47350c.put(i2, b2);
        bufferSharedState.f47353b = i2 + 1;
        abstractOutputSharedState.f47344d++;
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        return mo17449d(charSequence);
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        return mo17450g(charSequence, i, i2);
    }
}
