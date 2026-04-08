package io.ktor.utils.p043io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ReadWriteBufferStateKt {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f47423a;

    /* JADX INFO: renamed from: b */
    public static final RingBufferCapacity f47424b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.m18598f(byteBufferAllocate, "ByteBuffer.allocate(0)");
        f47423a = byteBufferAllocate;
        f47424b = new RingBufferCapacity(0);
    }
}
