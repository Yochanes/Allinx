package io.ktor.utils.p043io.nio;

import io.ktor.utils.p043io.bits.MemoryJvmKt;
import io.ktor.utils.p043io.core.AbstractInput;
import io.ktor.utils.p043io.core.Input;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/nio/ChannelAsInput;", "Lio/ktor/utils/io/core/AbstractInput;", "Lio/ktor/utils/io/core/Input;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
final class ChannelAsInput extends AbstractInput implements Input {
    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: a */
    public final void mo17432a() {
        throw null;
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: i */
    public final int mo17438i(ByteBuffer destination, int i, int i2) {
        Intrinsics.m18599g(destination, "destination");
        MemoryJvmKt.m17412c(destination, i, i2);
        throw null;
    }
}
