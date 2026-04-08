package io.ktor.utils.p043io.bits;

import io.ktor.utils.p043io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/bits/Memory;", "", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
@JvmInline
public final class Memory {

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f47323b;

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f47324a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/bits/Memory$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.m18598f(byteBufferOrder, "ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f47323b = byteBufferOrder;
    }

    public /* synthetic */ Memory(ByteBuffer buffer) {
        Intrinsics.m18599g(buffer, "buffer");
        this.f47324a = buffer;
    }

    /* JADX INFO: renamed from: a */
    public static final void m17406a(ByteBuffer byteBuffer, ByteBuffer destination, int i, int i2, int i3) {
        Intrinsics.m18599g(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, destination.array(), destination.arrayOffset() + i3, i2);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i3);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: b */
    public static final void m17407b(ByteBuffer byteBuffer, ByteBuffer destination, long j, long j2, long j3) {
        Intrinsics.m18599g(destination, "destination");
        long j4 = Integer.MAX_VALUE;
        if (j >= j4) {
            NumbersKt.m17523a(j, "offset");
            throw null;
        }
        int i = (int) j;
        if (j2 >= j4) {
            NumbersKt.m17523a(j2, "length");
            throw null;
        }
        int i2 = (int) j2;
        if (j3 < j4) {
            m17406a(byteBuffer, destination, i, i2, (int) j3);
        } else {
            NumbersKt.m17523a(j3, "destinationOffset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer m17408c(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer buffer = MemoryJvmKt.m17412c(byteBuffer, i, i2);
        Intrinsics.m18599g(buffer, "buffer");
        return buffer;
    }

    /* JADX INFO: renamed from: d */
    public static final ByteBuffer m17409d(ByteBuffer byteBuffer, long j, long j2) {
        long j3 = Integer.MAX_VALUE;
        if (j >= j3) {
            NumbersKt.m17523a(j, "offset");
            throw null;
        }
        int i = (int) j;
        if (j2 < j3) {
            return m17408c(byteBuffer, i, (int) j2);
        }
        NumbersKt.m17523a(j2, "length");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Memory) {
            return Intrinsics.m18594b(this.f47324a, ((Memory) obj).f47324a);
        }
        return false;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.f47324a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Memory(buffer=" + this.f47324a + ")";
    }
}
