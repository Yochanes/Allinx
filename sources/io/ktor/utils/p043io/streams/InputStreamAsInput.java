package io.ktor.utils.p043io.streams;

import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.core.AbstractInput;
import io.ktor.utils.p043io.core.BuffersKt;
import io.ktor.utils.p043io.core.IoBuffer;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/streams/InputStreamAsInput;", "Lio/ktor/utils/io/core/AbstractInput;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class InputStreamAsInput extends AbstractInput {

    /* JADX INFO: renamed from: d */
    public final InputStream f47529d;

    /* JADX WARN: Illegal instructions before constructor call */
    public InputStreamAsInput(InputStream inputStream, ObjectPool objectPool) {
        ChunkBuffer.f47375o.getClass();
        IoBuffer ioBuffer = IoBuffer.f47367r;
        super(ioBuffer, BuffersKt.m17479b(ioBuffer), objectPool);
        this.f47529d = inputStream;
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: a */
    public final void mo17432a() throws IOException {
        this.f47529d.close();
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: i */
    public final int mo17438i(ByteBuffer destination, int i, int i2) throws IOException {
        Intrinsics.m18599g(destination, "destination");
        boolean zHasArray = destination.hasArray();
        InputStream inputStream = this.f47529d;
        if (zHasArray && !destination.isReadOnly()) {
            int i3 = inputStream.read(destination.array(), destination.arrayOffset() + i, i2);
            if (i3 < 0) {
                return 0;
            }
            return i3;
        }
        ByteArraysKt$ByteArrayPool$1 byteArraysKt$ByteArrayPool$1 = ByteArraysKt.f47528a;
        byte[] bArr = (byte[]) byteArraysKt$ByteArrayPool$1.mo17488G();
        try {
            int i4 = inputStream.read(bArr, 0, Math.min(bArr.length, i2));
            if (i4 == -1) {
                byteArraysKt$ByteArrayPool$1.mo17522N0(bArr);
                return 0;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i4).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.m18598f(byteBufferOrder, "ByteBuffer.wrap(this, of…der(ByteOrder.BIG_ENDIAN)");
            Memory.m17406a(byteBufferOrder, destination, 0, i4, i);
            byteArraysKt$ByteArrayPool$1.mo17522N0(bArr);
            return i4;
        } catch (Throwable th) {
            ByteArraysKt.f47528a.mo17522N0(bArr);
            throw th;
        }
    }
}
