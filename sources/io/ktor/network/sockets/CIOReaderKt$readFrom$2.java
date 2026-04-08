package io.ktor.network.sockets;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "buffer", "Ljava/nio/ByteBuffer;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CIOReaderKt$readFrom$2 extends Lambda implements Function1<ByteBuffer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.IntRef f46029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReadableByteChannel f46030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOReaderKt$readFrom$2(Ref.IntRef intRef, ReadableByteChannel readableByteChannel) {
        super(1);
        this.f46029a = intRef;
        this.f46030b = readableByteChannel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ByteBuffer buffer = (ByteBuffer) obj;
        Intrinsics.m18599g(buffer, "buffer");
        this.f46029a.f51657a = this.f46030b.read(buffer);
        return Unit.f51459a;
    }
}
