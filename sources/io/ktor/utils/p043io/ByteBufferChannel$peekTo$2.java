package io.ktor.utils.p043io;

import io.ktor.utils.p043io.bits.MemoryJvmKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "nioBuffer", "Ljava/nio/ByteBuffer;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class ByteBufferChannel$peekTo$2 extends Lambda implements Function1<ByteBuffer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f46724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteBuffer f46725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f46726c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.IntRef f46727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$peekTo$2(long j, ByteBuffer byteBuffer, long j2, Ref.IntRef intRef) {
        super(1);
        this.f46724a = j;
        this.f46725b = byteBuffer;
        this.f46726c = j2;
        this.f46727d = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ByteBuffer nioBuffer = (ByteBuffer) obj;
        Intrinsics.m18599g(nioBuffer, "nioBuffer");
        if (nioBuffer.remaining() > 0) {
            ByteBuffer byteBufferDuplicate = nioBuffer.duplicate();
            Intrinsics.m18596d(byteBufferDuplicate);
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) 0));
            int iLimit = byteBufferDuplicate.limit();
            ByteBuffer byteBuffer = this.f46725b;
            long jLimit = byteBuffer.limit();
            long j = this.f46726c;
            byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(this.f46724a, jLimit - j)));
            this.f46727d.f51657a = byteBufferDuplicate.remaining();
            MemoryJvmKt.m17411b(byteBufferDuplicate, byteBuffer, (int) j);
            byteBufferDuplicate.limit(iLimit);
        }
        return Unit.f51459a;
    }
}
