package io.ktor.utils.p043io.core;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.charsets.CharsetJVMKt;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.MalformedUTF8InputException;
import io.ktor.utils.p043io.core.internal.UTF8Kt;
import io.ktor.utils.p043io.core.internal.UnsafeKt;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/AbstractInput;", "Lio/ktor/utils/io/core/Input;", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class AbstractInput implements Input {

    /* JADX INFO: renamed from: a */
    public final AbstractInputSharedState f47330a;

    /* JADX INFO: renamed from: b */
    public boolean f47331b;

    /* JADX INFO: renamed from: c */
    public final ObjectPool f47332c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/AbstractInput$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public AbstractInput(ChunkBuffer head, long j, ObjectPool pool) {
        Intrinsics.m18599g(head, "head");
        Intrinsics.m18599g(pool, "pool");
        this.f47332c = pool;
        AbstractInputSharedState abstractInputSharedState = new AbstractInputSharedState();
        abstractInputSharedState.f47338e = head;
        abstractInputSharedState.f47334a = head.f47350c;
        BufferSharedState bufferSharedState = head.f47348a;
        int i = bufferSharedState.f47352a;
        abstractInputSharedState.f47335b = i;
        int i2 = bufferSharedState.f47353b;
        abstractInputSharedState.f47336c = i2;
        abstractInputSharedState.f47337d = j - ((long) (i2 - i));
        this.f47330a = abstractInputSharedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m17427C(AbstractInput abstractInput) throws Throwable {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        char c2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ChunkBuffer chunkBufferM17529d;
        boolean z10;
        int iPosition;
        boolean z11;
        boolean z12;
        ?? r9;
        ?? r13;
        ?? r132;
        ?? r92;
        ChunkBuffer chunkBufferM17529d2;
        boolean z13;
        char c3 = 16;
        boolean z14 = true;
        if (abstractInput.mo17435f0()) {
            return "";
        }
        long jM17441n = abstractInput.m17441n();
        if (jM17441n > 0 && Integer.MAX_VALUE >= jM17441n) {
            int i3 = (int) jM17441n;
            Charset charset = Charsets.f55167a;
            Intrinsics.m18599g(charset, "charset");
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            Intrinsics.m18598f(charsetDecoderNewDecoder, "charset.newDecoder()");
            CharBuffer charBuffer = CharsetJVMKt.f47325a;
            if (i3 == 0) {
                return "";
            }
            AbstractInputSharedState abstractInputSharedState = abstractInput.f47330a;
            if (abstractInputSharedState.f47336c - abstractInputSharedState.f47335b >= i3) {
                if (abstractInputSharedState.f47334a.hasArray()) {
                    ByteBuffer byteBuffer = abstractInputSharedState.f47334a;
                    byte[] bArrArray = byteBuffer.array();
                    Intrinsics.m18598f(bArrArray, "bb.array()");
                    int iPosition2 = byteBuffer.position() + byteBuffer.arrayOffset() + abstractInput.m17440k().f47348a.f47352a;
                    Charset charset2 = charsetDecoderNewDecoder.charset();
                    Intrinsics.m18598f(charset2, "charset()");
                    String str = new String(bArrArray, iPosition2, i3, charset2);
                    abstractInput.m17433b(i3);
                    return str;
                }
                CharBuffer charBufferAllocate = CharBuffer.allocate(i3);
                ByteBuffer byteBufferM17408c = Memory.m17408c(abstractInputSharedState.f47334a, abstractInput.m17440k().f47348a.f47352a, i3);
                CoderResult rc = charsetDecoderNewDecoder.decode(byteBufferM17408c, charBufferAllocate, true);
                Intrinsics.m18598f(rc, "rc");
                if (rc.isMalformed() || rc.isUnmappable()) {
                    CharsetJVMKt.m17417e(rc);
                }
                charBufferAllocate.flip();
                abstractInput.m17433b(byteBufferM17408c.position());
                String string = charBufferAllocate.toString();
                Intrinsics.m18598f(string, "cb.toString()");
                return string;
            }
            CharBuffer charBufferAllocate2 = CharBuffer.allocate(i3);
            ChunkBuffer chunkBufferM17528c = UnsafeKt.m17528c(abstractInput, 1);
            if (chunkBufferM17528c != null) {
                iPosition = i3;
                ?? r93 = 1;
                ?? r133 = 1;
                boolean z15 = false;
                while (true) {
                    BufferSharedState bufferSharedState = chunkBufferM17528c.f47348a;
                    try {
                        int i4 = bufferSharedState.f47353b - bufferSharedState.f47352a;
                        if (i4 >= r93) {
                            try {
                                if (charBufferAllocate2.hasRemaining() && iPosition != 0) {
                                    ByteBuffer byteBuffer2 = chunkBufferM17528c.f47350c;
                                    int i5 = bufferSharedState.f47352a;
                                    int i6 = bufferSharedState.f47353b - i5;
                                    ByteBuffer byteBufferM17408c2 = Memory.m17408c(byteBuffer2, i5, i6);
                                    int iLimit = byteBufferM17408c2.limit();
                                    int iPosition3 = byteBufferM17408c2.position();
                                    z10 = z14;
                                    boolean z16 = iLimit - iPosition3 >= iPosition ? z10 : false;
                                    if (z16) {
                                        try {
                                            byteBufferM17408c2.limit(iPosition3 + iPosition);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    CoderResult rc2 = charsetDecoderNewDecoder.decode(byteBufferM17408c2, charBufferAllocate2, z16);
                                    Intrinsics.m18598f(rc2, "rc");
                                    if (rc2.isMalformed() || rc2.isUnmappable()) {
                                        CharsetJVMKt.m17417e(rc2);
                                    }
                                    ?? r134 = (rc2.isUnderflow() && byteBufferM17408c2.hasRemaining()) ? r133 + 1 : z10;
                                    byteBufferM17408c2.limit(iLimit);
                                    iPosition -= byteBufferM17408c2.position() - iPosition3;
                                    if (byteBufferM17408c2.limit() != i6) {
                                        break;
                                    }
                                    chunkBufferM17528c.m17461d(byteBufferM17408c2.position());
                                    z15 = z16;
                                    r9 = r134;
                                    r13 = r134;
                                } else {
                                    z10 = z14;
                                    r9 = 0;
                                    r13 = r133;
                                }
                                try {
                                    i4 = bufferSharedState.f47353b - bufferSharedState.f47352a;
                                    r92 = r9;
                                    r132 = r13;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z12 = z10;
                                    if (z12) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } else {
                            z10 = z14;
                            r92 = r93;
                            r132 = r133;
                        }
                        if (i4 == 0) {
                            try {
                                chunkBufferM17529d2 = UnsafeKt.m17529d(abstractInput, chunkBufferM17528c);
                            } catch (Throwable th4) {
                                th = th4;
                                z12 = false;
                                if (z12) {
                                    UnsafeKt.m17527b(abstractInput, chunkBufferM17528c);
                                }
                                throw th;
                            }
                        } else if (i4 < r92 || chunkBufferM17528c.f47349b - bufferSharedState.f47355d < 8) {
                            UnsafeKt.m17527b(abstractInput, chunkBufferM17528c);
                            chunkBufferM17529d2 = UnsafeKt.m17528c(abstractInput, r92 == true ? 1 : 0);
                        } else {
                            chunkBufferM17529d2 = chunkBufferM17528c;
                        }
                        if (chunkBufferM17529d2 == null) {
                            z13 = false;
                            break;
                        }
                        chunkBufferM17528c = chunkBufferM17529d2;
                        if (r92 <= 0) {
                            z13 = z10;
                            break;
                        }
                        z14 = z10;
                        r93 = r92;
                        r133 = r132;
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = z14;
                    }
                }
                if (z13) {
                    UnsafeKt.m17527b(abstractInput, chunkBufferM17528c);
                }
                z11 = z15;
            } else {
                z10 = true;
                iPosition = i3;
                z11 = false;
            }
            if (charBufferAllocate2.hasRemaining() && !z11) {
                CoderResult rc3 = charsetDecoderNewDecoder.decode(CharsetJVMKt.f47326b, charBufferAllocate2, z10);
                Intrinsics.m18598f(rc3, "rc");
                if (rc3.isMalformed() || rc3.isUnmappable()) {
                    CharsetJVMKt.m17417e(rc3);
                }
            }
            if (iPosition > 0) {
                throw new EOFException("Not enough bytes available: had only " + (i3 - iPosition) + " instead of " + i3);
            }
            if (iPosition < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            charBufferAllocate2.flip();
            String string2 = charBufferAllocate2.toString();
            Intrinsics.m18598f(string2, "cb.toString()");
            return string2;
        }
        int i7 = 0;
        StringBuilder sb = new StringBuilder(16);
        if (!abstractInput.mo17435f0()) {
            ChunkBuffer chunkBufferM17528c2 = UnsafeKt.m17528c(abstractInput, 1);
            boolean z17 = false;
            int i8 = 0;
            if (chunkBufferM17528c2 != null) {
                while (true) {
                    try {
                        ByteBuffer byteBuffer3 = chunkBufferM17528c2.f47350c;
                        BufferSharedState bufferSharedState2 = chunkBufferM17528c2.f47348a;
                        int i9 = bufferSharedState2.f47352a;
                        int i10 = bufferSharedState2.f47353b;
                        for (int i11 = i9; i11 < i10; i11++) {
                            byte b2 = byteBuffer3.get(i11);
                            int i12 = b2 & UnsignedBytes.MAX_VALUE;
                            if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                                char c4 = (char) i12;
                                if (i8 == Integer.MAX_VALUE) {
                                    z5 = false;
                                } else {
                                    sb.append(c4);
                                    i8++;
                                    z5 = true;
                                }
                                if (z5) {
                                }
                            }
                            chunkBufferM17528c2.m17461d(i11 - i9);
                            z3 = false;
                            break;
                        }
                        chunkBufferM17528c2.m17461d(i10 - i9);
                        z3 = true;
                        if (z3) {
                            z4 = true;
                        } else if (i8 == Integer.MAX_VALUE) {
                            z4 = false;
                        } else {
                            z4 = false;
                            z17 = true;
                        }
                        if (!z4) {
                            UnsafeKt.m17527b(abstractInput, chunkBufferM17528c2);
                            break;
                        }
                        try {
                            chunkBufferM17528c2 = UnsafeKt.m17529d(abstractInput, chunkBufferM17528c2);
                            if (chunkBufferM17528c2 == null) {
                                break;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z2 = false;
                            if (z2) {
                                UnsafeKt.m17527b(abstractInput, chunkBufferM17528c2);
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z2 = true;
                    }
                }
            }
            if (z17) {
                int i13 = 0 - i8;
                int i14 = Integer.MAX_VALUE - i8;
                ChunkBuffer chunkBufferM17528c3 = UnsafeKt.m17528c(abstractInput, 1);
                int i15 = 0;
                if (chunkBufferM17528c3 != null) {
                    int i16 = 1;
                    while (true) {
                        BufferSharedState bufferSharedState3 = chunkBufferM17528c3.f47348a;
                        try {
                            int i17 = bufferSharedState3.f47353b;
                            int i18 = bufferSharedState3.f47352a;
                            int i19 = i17 - i18;
                            if (i19 >= i16) {
                                try {
                                    ByteBuffer byteBuffer4 = chunkBufferM17528c3.f47350c;
                                    c2 = c3;
                                    int i20 = i18;
                                    int i21 = 0;
                                    int i22 = 0;
                                    int i23 = 0;
                                    while (i20 < i17) {
                                        byte b3 = byteBuffer4.get(i20);
                                        int i24 = b3 & UnsignedBytes.MAX_VALUE;
                                        ByteBuffer byteBuffer5 = byteBuffer4;
                                        if ((b3 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                                            if (i21 == 0) {
                                                i22 = i24;
                                                int i25 = 128;
                                                for (int i26 = 1; i26 <= 6 && (i22 & i25) != 0; i26++) {
                                                    i22 &= ~i25;
                                                    i25 >>= 1;
                                                    i21++;
                                                }
                                                int i27 = i21 - 1;
                                                if (i21 > i17 - i20) {
                                                    chunkBufferM17528c3.m17461d(i20 - i18);
                                                    i = 1;
                                                    break;
                                                }
                                                i23 = i21;
                                                i21 = i27;
                                            } else {
                                                int i28 = (i22 << 6) | (b3 & Ascii.DEL);
                                                i21--;
                                                if (i21 != 0) {
                                                    i22 = i28;
                                                } else {
                                                    if ((i28 >>> 16) != 0) {
                                                        if (i28 > 1114111) {
                                                            UTF8Kt.m17525b(i28);
                                                            throw null;
                                                        }
                                                        char c5 = (char) ((i28 >>> 10) + 55232);
                                                        if (i15 == i14) {
                                                            z6 = false;
                                                        } else {
                                                            sb.append(c5);
                                                            i15++;
                                                            z6 = true;
                                                        }
                                                        if (z6) {
                                                            char c6 = (char) ((i28 & 1023) + 56320);
                                                            if (i15 == i14) {
                                                                z7 = false;
                                                            } else {
                                                                sb.append(c6);
                                                                i15++;
                                                                z7 = true;
                                                            }
                                                            if (!z7) {
                                                            }
                                                            i22 = 0;
                                                        }
                                                        chunkBufferM17528c3.m17461d(((i20 - i18) - i23) + 1);
                                                        i21 = -1;
                                                        i = 1;
                                                        break;
                                                    }
                                                    char c7 = (char) i28;
                                                    if (i15 == i14) {
                                                        z8 = false;
                                                    } else {
                                                        sb.append(c7);
                                                        i15++;
                                                        z8 = true;
                                                    }
                                                    if (!z8) {
                                                        chunkBufferM17528c3.m17461d(((i20 - i18) - i23) + 1);
                                                        i21 = -1;
                                                        i = 1;
                                                        break;
                                                    }
                                                    i22 = 0;
                                                }
                                            }
                                            i20++;
                                            byteBuffer4 = byteBuffer5;
                                        } else {
                                            if (i21 != 0) {
                                                throw new MalformedUTF8InputException("Expected " + i21 + " more character bytes");
                                            }
                                            char c8 = (char) i24;
                                            if (i15 == i14) {
                                                z9 = false;
                                            } else {
                                                sb.append(c8);
                                                i15++;
                                                z9 = true;
                                            }
                                            if (!z9) {
                                                chunkBufferM17528c3.m17461d(i20 - i18);
                                                i21 = -1;
                                                i = 1;
                                                break;
                                            }
                                            i20++;
                                            byteBuffer4 = byteBuffer5;
                                        }
                                    }
                                    i = 1;
                                    try {
                                        chunkBufferM17528c3.m17461d(i19);
                                        i21 = 0;
                                        if (i21 == 0) {
                                            i21 = i;
                                        } else if (i21 <= 0) {
                                            i21 = 0;
                                        }
                                        try {
                                            i19 = bufferSharedState3.f47353b - bufferSharedState3.f47352a;
                                            i16 = i21;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            i2 = i;
                                            if (i2 != 0) {
                                                UnsafeKt.m17527b(abstractInput, chunkBufferM17528c3);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th9) {
                                        throw th9;
                                    }
                                } catch (Throwable th10) {
                                    throw th10;
                                }
                            } else {
                                c2 = c3;
                                i = 1;
                            }
                            if (i19 == 0) {
                                try {
                                    chunkBufferM17529d = UnsafeKt.m17529d(abstractInput, chunkBufferM17528c3);
                                } catch (Throwable th11) {
                                    th = th11;
                                    i2 = 0;
                                    if (i2 != 0) {
                                    }
                                    throw th;
                                }
                            } else if (i19 < i16 || chunkBufferM17528c3.f47349b - bufferSharedState3.f47355d < 8) {
                                UnsafeKt.m17527b(abstractInput, chunkBufferM17528c3);
                                chunkBufferM17529d = UnsafeKt.m17528c(abstractInput, i16);
                            } else {
                                chunkBufferM17529d = chunkBufferM17528c3;
                            }
                            if (chunkBufferM17529d == null) {
                                break;
                            }
                            chunkBufferM17528c3 = chunkBufferM17529d;
                            if (i16 <= 0) {
                                i7 = i;
                                break;
                            }
                            c3 = c2;
                        } catch (Throwable th12) {
                            th = th12;
                            i = 1;
                        }
                    }
                    if (i7 != 0) {
                        UnsafeKt.m17527b(abstractInput, chunkBufferM17528c3);
                    }
                }
                if (i15 < i13) {
                    throw new MalformedUTF8InputException(AbstractC0455a.m2237l(i13, i15, "Premature end of stream: expected at least ", " chars but had only "));
                }
            } else if (i8 < 0) {
                throw new MalformedUTF8InputException(AbstractC0000a.m9f(i8, "Premature end of stream: expected at least 0 chars but had only "));
            }
        }
        String string3 = sb.toString();
        Intrinsics.m18598f(string3, "StringBuilder(capacity).…builderAction).toString()");
        return string3;
    }

    @Override // io.ktor.utils.p043io.core.Input
    /* JADX INFO: renamed from: F */
    public final long mo17428F(ByteBuffer byteBuffer, long j, long j2, long j3, long j4) {
        ByteBuffer destination = byteBuffer;
        Intrinsics.m18599g(destination, "destination");
        long j5 = j3 + j2;
        if (j5 > 0) {
            AbstractInputSharedState abstractInputSharedState = this.f47330a;
            long j6 = abstractInputSharedState.f47336c - abstractInputSharedState.f47335b;
            if (j6 < j5 && j6 + abstractInputSharedState.f47337d < j5) {
                ChunkBuffer chunkBufferM17478a = BuffersKt.m17478a(abstractInputSharedState.f47338e);
                long j7 = ((long) (abstractInputSharedState.f47336c - abstractInputSharedState.f47335b)) + abstractInputSharedState.f47337d;
                while (true) {
                    ChunkBuffer chunkBufferMo17437h = mo17437h();
                    if (chunkBufferMo17437h == null) {
                        this.f47331b = true;
                        break;
                    }
                    BufferSharedState bufferSharedState = chunkBufferMo17437h.f47348a;
                    int i = bufferSharedState.f47353b - bufferSharedState.f47352a;
                    ChunkBuffer.f47375o.getClass();
                    if (chunkBufferM17478a == IoBuffer.f47367r) {
                        m17431M(chunkBufferMo17437h);
                        chunkBufferM17478a = chunkBufferMo17437h;
                    } else {
                        chunkBufferM17478a.m17517S(chunkBufferMo17437h);
                        m17430L(abstractInputSharedState.f47337d + ((long) i));
                    }
                    j7 += (long) i;
                    if (j7 >= j5) {
                        break;
                    }
                }
            }
        }
        ChunkBuffer chunkBufferM17440k = m17440k();
        long jMin = Math.min(j4, ((long) destination.limit()) - j);
        long j8 = j;
        ChunkBuffer chunkBufferM17512C = chunkBufferM17440k;
        long j9 = 0;
        long j10 = j2;
        while (j9 < j3 && j9 < jMin) {
            BufferSharedState bufferSharedState2 = chunkBufferM17512C.f47348a;
            long j11 = bufferSharedState2.f47353b - bufferSharedState2.f47352a;
            if (j11 > j10) {
                long jMin2 = Math.min(j11 - j10, jMin - j9);
                Memory.m17407b(chunkBufferM17512C.f47350c, destination, ((long) bufferSharedState2.f47352a) + j10, jMin2, j8);
                j9 += jMin2;
                j8 += jMin2;
                j10 = 0;
            } else {
                j10 -= j11;
            }
            chunkBufferM17512C = chunkBufferM17512C.m17512C();
            if (chunkBufferM17512C == null) {
                break;
            }
            destination = byteBuffer;
        }
        return j9;
    }

    /* JADX INFO: renamed from: H */
    public final void m17429H(ChunkBuffer chunkBuffer) {
        ChunkBuffer chunkBufferM17521x = chunkBuffer.m17521x();
        if (chunkBufferM17521x == null) {
            ChunkBuffer.f47375o.getClass();
            chunkBufferM17521x = IoBuffer.f47367r;
        }
        m17431M(chunkBufferM17521x);
        long j = this.f47330a.f47337d;
        BufferSharedState bufferSharedState = chunkBufferM17521x.f47348a;
        m17430L(j - ((long) (bufferSharedState.f47353b - bufferSharedState.f47352a)));
        chunkBuffer.mo17494M(this.f47332c);
    }

    /* JADX INFO: renamed from: L */
    public final void m17430L(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "tailRemaining shouldn't be negative: "));
        }
        this.f47330a.f47337d = j;
    }

    /* JADX INFO: renamed from: M */
    public final void m17431M(ChunkBuffer chunkBuffer) {
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        abstractInputSharedState.getClass();
        Intrinsics.m18599g(chunkBuffer, "<set-?>");
        abstractInputSharedState.f47338e = chunkBuffer;
        abstractInputSharedState.getClass();
        ByteBuffer byteBuffer = chunkBuffer.f47350c;
        Intrinsics.m18599g(byteBuffer, "<set-?>");
        abstractInputSharedState.f47334a = byteBuffer;
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        abstractInputSharedState.f47335b = bufferSharedState.f47352a;
        abstractInputSharedState.f47336c = bufferSharedState.f47353b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17432a();

    /* JADX INFO: renamed from: b */
    public final void m17433b(int i) throws EOFException {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Negative discard is not allowed: "));
        }
        int i2 = 0;
        int i3 = i;
        while (i3 != 0) {
            ChunkBuffer chunkBufferM17443u = m17443u();
            if (chunkBufferM17443u == null) {
                break;
            }
            BufferSharedState bufferSharedState = chunkBufferM17443u.f47348a;
            int iMin = Math.min(bufferSharedState.f47353b - bufferSharedState.f47352a, i3);
            chunkBufferM17443u.m17461d(iMin);
            this.f47330a.f47335b += iMin;
            if (bufferSharedState.f47353b - bufferSharedState.f47352a == 0) {
                m17429H(chunkBufferM17443u);
            }
            i3 -= iMin;
            i2 += iMin;
        }
        if (i2 != i) {
            throw new EOFException(AbstractC0000a.m10g(i, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
        if (!this.f47331b) {
            this.f47331b = true;
        }
        mo17432a();
    }

    /* JADX INFO: renamed from: d */
    public final ChunkBuffer m17434d() {
        if (this.f47331b) {
            return null;
        }
        ChunkBuffer chunkBufferMo17437h = mo17437h();
        if (chunkBufferMo17437h == null) {
            this.f47331b = true;
            return null;
        }
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        ChunkBuffer chunkBufferM17478a = BuffersKt.m17478a(abstractInputSharedState.f47338e);
        ChunkBuffer.f47375o.getClass();
        if (chunkBufferM17478a != IoBuffer.f47367r) {
            chunkBufferM17478a.m17517S(chunkBufferMo17437h);
            m17430L(BuffersKt.m17479b(chunkBufferMo17437h) + abstractInputSharedState.f47337d);
            return chunkBufferMo17437h;
        }
        m17431M(chunkBufferMo17437h);
        if (abstractInputSharedState.f47337d != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        ChunkBuffer chunkBufferM17512C = chunkBufferMo17437h.m17512C();
        m17430L(chunkBufferM17512C != null ? BuffersKt.m17479b(chunkBufferM17512C) : 0L);
        return chunkBufferMo17437h;
    }

    @Override // io.ktor.utils.p043io.core.Input
    /* JADX INFO: renamed from: f0 */
    public final boolean mo17435f0() {
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        if (abstractInputSharedState.f47336c - abstractInputSharedState.f47335b == 0 && abstractInputSharedState.f47337d == 0) {
            return this.f47331b || m17434d() == null;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final ChunkBuffer m17436g(ChunkBuffer current) {
        Intrinsics.m18599g(current, "current");
        ChunkBuffer.f47375o.getClass();
        IoBuffer ioBuffer = IoBuffer.f47367r;
        while (current != ioBuffer) {
            ChunkBuffer chunkBufferM17521x = current.m17521x();
            current.mo17494M(this.f47332c);
            if (chunkBufferM17521x == null) {
                m17431M(ioBuffer);
                m17430L(0L);
                current = ioBuffer;
            } else {
                BufferSharedState bufferSharedState = chunkBufferM17521x.f47348a;
                if (bufferSharedState.f47353b > bufferSharedState.f47352a) {
                    m17431M(chunkBufferM17521x);
                    m17430L(this.f47330a.f47337d - ((long) (bufferSharedState.f47353b - bufferSharedState.f47352a)));
                    return chunkBufferM17521x;
                }
                current = chunkBufferM17521x;
            }
        }
        return m17434d();
    }

    /* JADX INFO: renamed from: h */
    public ChunkBuffer mo17437h() {
        ObjectPool objectPool = this.f47332c;
        ChunkBuffer chunkBuffer = (ChunkBuffer) objectPool.mo17488G();
        try {
            chunkBuffer.m17465j();
            BufferSharedState bufferSharedState = chunkBuffer.f47348a;
            ByteBuffer byteBuffer = chunkBuffer.f47350c;
            int i = bufferSharedState.f47353b;
            int iMo17438i = mo17438i(byteBuffer, i, bufferSharedState.f47355d - i);
            if (iMo17438i == 0) {
                this.f47331b = true;
                if (bufferSharedState.f47353b <= bufferSharedState.f47352a) {
                    chunkBuffer.mo17494M(objectPool);
                    return null;
                }
            }
            chunkBuffer.m17459a(iMo17438i);
            return chunkBuffer;
        } catch (Throwable th) {
            chunkBuffer.mo17494M(objectPool);
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo17438i(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: j */
    public final void m17439j(ChunkBuffer chunkBuffer) {
        boolean z2 = this.f47331b;
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        if (z2 && chunkBuffer.m17512C() == null) {
            int i = bufferSharedState.f47352a;
            AbstractInputSharedState abstractInputSharedState = this.f47330a;
            abstractInputSharedState.f47335b = i;
            abstractInputSharedState.f47336c = bufferSharedState.f47353b;
            m17430L(0L);
            return;
        }
        int i2 = bufferSharedState.f47353b - bufferSharedState.f47352a;
        int iMin = Math.min(i2, 8 - (chunkBuffer.f47349b - bufferSharedState.f47355d));
        ObjectPool objectPool = this.f47332c;
        if (i2 > iMin) {
            ChunkBuffer chunkBuffer2 = (ChunkBuffer) objectPool.mo17488G();
            ChunkBuffer chunkBuffer3 = (ChunkBuffer) objectPool.mo17488G();
            chunkBuffer2.m17465j();
            chunkBuffer3.m17465j();
            chunkBuffer2.m17517S(chunkBuffer3);
            chunkBuffer3.m17517S(chunkBuffer.m17521x());
            BufferAppendKt.m17469a(chunkBuffer2, chunkBuffer, i2 - iMin);
            BufferAppendKt.m17469a(chunkBuffer3, chunkBuffer, iMin);
            m17431M(chunkBuffer2);
            m17430L(BuffersKt.m17479b(chunkBuffer3));
        } else {
            ChunkBuffer chunkBuffer4 = (ChunkBuffer) objectPool.mo17488G();
            chunkBuffer4.m17465j();
            chunkBuffer4.m17517S(chunkBuffer.m17521x());
            BufferAppendKt.m17469a(chunkBuffer4, chunkBuffer, i2);
            m17431M(chunkBuffer4);
        }
        chunkBuffer.mo17494M(objectPool);
    }

    /* JADX INFO: renamed from: k */
    public final ChunkBuffer m17440k() {
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        ChunkBuffer chunkBuffer = abstractInputSharedState.f47338e;
        chunkBuffer.m17462g(abstractInputSharedState.f47335b);
        return chunkBuffer;
    }

    /* JADX INFO: renamed from: n */
    public final long m17441n() {
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        return ((long) (abstractInputSharedState.f47336c - abstractInputSharedState.f47335b)) + abstractInputSharedState.f47337d;
    }

    @Override // io.ktor.utils.p043io.core.Input
    /* JADX INFO: renamed from: p0 */
    public final long mo17442p0(long j) throws EOFException {
        ChunkBuffer chunkBufferM17443u;
        if (j <= 0) {
            return 0L;
        }
        long j2 = 0;
        while (j != 0 && (chunkBufferM17443u = m17443u()) != null) {
            BufferSharedState bufferSharedState = chunkBufferM17443u.f47348a;
            int iMin = (int) Math.min(bufferSharedState.f47353b - bufferSharedState.f47352a, j);
            chunkBufferM17443u.m17461d(iMin);
            this.f47330a.f47335b += iMin;
            if (bufferSharedState.f47353b - bufferSharedState.f47352a == 0) {
                m17429H(chunkBufferM17443u);
            }
            long j3 = iMin;
            j -= j3;
            j2 += j3;
        }
        return j2;
    }

    public final void release() {
        ChunkBuffer chunkBufferM17440k = m17440k();
        ChunkBuffer.f47375o.getClass();
        IoBuffer ioBuffer = IoBuffer.f47367r;
        if (chunkBufferM17440k == ioBuffer) {
            return;
        }
        m17431M(ioBuffer);
        m17430L(0L);
        while (true) {
            ObjectPool pool = this.f47332c;
            Intrinsics.m18599g(pool, "pool");
            if (chunkBufferM17440k == null) {
                return;
            }
            ChunkBuffer chunkBufferM17521x = chunkBufferM17440k.m17521x();
            chunkBufferM17440k.mo17494M(pool);
            chunkBufferM17440k = chunkBufferM17521x;
        }
    }

    /* JADX INFO: renamed from: u */
    public final ChunkBuffer m17443u() {
        ChunkBuffer chunkBufferM17440k = m17440k();
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        return abstractInputSharedState.f47336c - abstractInputSharedState.f47335b >= 1 ? chunkBufferM17440k : m17444x(1, chunkBufferM17440k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        return r10;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChunkBuffer m17444x(int i, ChunkBuffer chunkBuffer) {
        while (true) {
            AbstractInputSharedState abstractInputSharedState = this.f47330a;
            int i2 = abstractInputSharedState.f47336c - abstractInputSharedState.f47335b;
            if (i2 >= i) {
                break;
            }
            ChunkBuffer chunkBufferM17512C = chunkBuffer.m17512C();
            if (chunkBufferM17512C == null) {
                chunkBufferM17512C = m17434d();
            }
            if (chunkBufferM17512C == null) {
                return null;
            }
            if (i2 == 0) {
                ChunkBuffer.f47375o.getClass();
                if (chunkBuffer != IoBuffer.f47367r) {
                    m17429H(chunkBuffer);
                }
                chunkBuffer = chunkBufferM17512C;
            } else {
                int iM17469a = BufferAppendKt.m17469a(chunkBuffer, chunkBufferM17512C, i - i2);
                BufferSharedState bufferSharedState = chunkBuffer.f47348a;
                abstractInputSharedState.f47336c = bufferSharedState.f47353b;
                m17430L(abstractInputSharedState.f47337d - ((long) iM17469a));
                BufferSharedState bufferSharedState2 = chunkBufferM17512C.f47348a;
                int i3 = bufferSharedState2.f47353b;
                int i4 = bufferSharedState2.f47352a;
                if (i3 <= i4) {
                    chunkBuffer.m17521x();
                    chunkBuffer.m17517S(chunkBufferM17512C.m17521x());
                    chunkBufferM17512C.mo17494M(this.f47332c);
                } else {
                    if (iM17469a < 0) {
                        throw new IllegalArgumentException(AbstractC0000a.m9f(iM17469a, "startGap shouldn't be negative: "));
                    }
                    if (i4 >= iM17469a) {
                        bufferSharedState2.f47354c = iM17469a;
                    } else {
                        if (i4 != i3) {
                            StringBuilder sbM20q = AbstractC0000a.m20q(iM17469a, "Unable to reserve ", " start gap: there are already ");
                            sbM20q.append(bufferSharedState2.f47353b - bufferSharedState2.f47352a);
                            sbM20q.append(" content bytes starting at offset ");
                            sbM20q.append(bufferSharedState2.f47352a);
                            throw new IllegalStateException(sbM20q.toString());
                        }
                        if (iM17469a > bufferSharedState2.f47355d) {
                            int i5 = chunkBufferM17512C.f47349b;
                            if (iM17469a > i5) {
                                throw new IllegalArgumentException(AbstractC0455a.m2237l(iM17469a, i5, "Start gap ", " is bigger than the capacity "));
                            }
                            StringBuilder sbM20q2 = AbstractC0000a.m20q(iM17469a, "Unable to reserve ", " start gap: there are already ");
                            sbM20q2.append(i5 - bufferSharedState2.f47355d);
                            sbM20q2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbM20q2.toString());
                        }
                        bufferSharedState2.f47353b = iM17469a;
                        bufferSharedState2.f47352a = iM17469a;
                        bufferSharedState2.f47354c = iM17469a;
                    }
                }
                if (bufferSharedState.f47353b - bufferSharedState.f47352a >= i) {
                    break;
                }
                if (i > 8) {
                    throw new IllegalStateException(AbstractC0000a.m10g(i, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final byte m17445z() throws EOFException {
        AbstractInputSharedState abstractInputSharedState = this.f47330a;
        int i = abstractInputSharedState.f47335b;
        int i2 = i + 1;
        int i3 = abstractInputSharedState.f47336c;
        if (i2 < i3) {
            abstractInputSharedState.f47335b = i2;
            return abstractInputSharedState.f47334a.get(i);
        }
        if (i < i3) {
            byte b2 = abstractInputSharedState.f47334a.get(i);
            abstractInputSharedState.f47335b = i;
            ChunkBuffer chunkBuffer = abstractInputSharedState.f47338e;
            chunkBuffer.m17462g(i);
            m17436g(chunkBuffer);
            return b2;
        }
        ChunkBuffer chunkBufferM17443u = m17443u();
        if (chunkBufferM17443u == null) {
            StringsKt.m17507a(1);
            throw null;
        }
        byte bM17463h = chunkBufferM17443u.m17463h();
        UnsafeKt.m17527b(this, chunkBufferM17443u);
        return bM17463h;
    }
}
