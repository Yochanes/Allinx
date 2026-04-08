package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/ByteChannelKt$ByteChannel$1", "Lio/ktor/utils/io/ByteBufferChannel;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteChannelKt$ByteChannel$1 extends ByteBufferChannel {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Function1 f46970r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelKt$ByteChannel$1(Function1 function1) {
        super(false);
        this.f46970r = function1;
    }

    @Override // io.ktor.utils.p043io.ByteBufferChannel, io.ktor.utils.p043io.ByteWriteChannel
    /* JADX INFO: renamed from: b */
    public final boolean mo17293b(Throwable th) {
        return super.mo17293b((Throwable) this.f46970r.invoke(th));
    }
}
