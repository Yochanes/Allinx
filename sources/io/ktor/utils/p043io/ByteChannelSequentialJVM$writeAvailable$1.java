package io.ktor.utils.p043io;

import com.google.zxing.aztec.encoder.Encoder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@"}, m18302d2 = {"writeAvailable", "", "src", "Ljava/nio/ByteBuffer;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ByteChannelSequentialJVM", m18559f = "ByteChannelSequentialJVM.kt", m18560l = {Encoder.DEFAULT_EC_PERCENT}, m18561m = "writeAvailable")
final class ByteChannelSequentialJVM$writeAvailable$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47175a;

    /* JADX INFO: renamed from: b */
    public int f47176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteChannelSequentialJVM f47177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialJVM$writeAvailable$1(ByteChannelSequentialJVM byteChannelSequentialJVM, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47177c = byteChannelSequentialJVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47175a = obj;
        this.f47176b |= Integer.MIN_VALUE;
        return this.f47177c.m17375h0(null, this);
    }
}
