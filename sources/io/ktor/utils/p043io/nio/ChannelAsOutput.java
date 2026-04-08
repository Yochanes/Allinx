package io.ktor.utils.p043io.nio;

import io.ktor.utils.p043io.bits.MemoryJvmKt;
import io.ktor.utils.p043io.core.AbstractOutput;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/nio/ChannelAsOutput;", "Lio/ktor/utils/io/core/AbstractOutput;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
final class ChannelAsOutput extends AbstractOutput {
    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: j */
    public final void mo17453j() {
        throw null;
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: k */
    public final void mo17454k(ByteBuffer source, int i, int i2) {
        Intrinsics.m18599g(source, "source");
        if (MemoryJvmKt.m17412c(source, i, i2).hasRemaining()) {
            throw null;
        }
    }
}
