package io.ktor.utils.p043io.bits;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/bits/DefaultAllocator;", "Lio/ktor/utils/io/bits/Allocator;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
@PublishedApi
public final class DefaultAllocator implements Allocator {

    /* JADX INFO: renamed from: a */
    public static final DefaultAllocator f47322a = new DefaultAllocator();

    @Override // io.ktor.utils.p043io.bits.Allocator
    /* JADX INFO: renamed from: a */
    public final void mo17404a(ByteBuffer instance) {
        Intrinsics.m18599g(instance, "instance");
    }

    @Override // io.ktor.utils.p043io.bits.Allocator
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo17405b(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        Intrinsics.m18598f(byteBufferAllocate, "ByteBuffer.allocate(size)");
        ByteBuffer byteBuffer = Memory.f47323b;
        return byteBufferAllocate;
    }
}
