package io.ktor.utils.p043io.bits;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class MemoryJvmKt {
    /* JADX INFO: renamed from: a */
    public static final void m17410a(ByteBuffer copyTo, ByteBuffer destination, int i) {
        Intrinsics.m18599g(copyTo, "$this$copyTo");
        Intrinsics.m18599g(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i);
            byteBufferDuplicate.position(i);
            destination.put(byteBufferDuplicate);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17411b(ByteBuffer copyTo, ByteBuffer destination, int i) {
        Intrinsics.m18599g(copyTo, "$this$copyTo");
        Intrinsics.m18599g(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            m17412c(destination, i, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] bArrArray = copyTo.array();
        Intrinsics.m18598f(bArrArray, "array()");
        int iPosition = copyTo.position() + copyTo.arrayOffset();
        int iRemaining = copyTo.remaining();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iPosition, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.m18598f(byteBufferOrder, "ByteBuffer.wrap(this, of…der(ByteOrder.BIG_ENDIAN)");
        ByteBuffer byteBuffer = Memory.f47323b;
        Memory.m17406a(byteBufferOrder, destination, 0, iRemaining, i);
        copyTo.position(copyTo.limit());
    }

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer m17412c(ByteBuffer sliceSafe, int i, int i2) {
        Intrinsics.m18599g(sliceSafe, "$this$sliceSafe");
        ByteBuffer byteBufferDuplicate = sliceSafe.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        return byteBufferDuplicate.slice();
    }
}
