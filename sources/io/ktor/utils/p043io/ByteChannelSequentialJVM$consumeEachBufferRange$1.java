package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012:\u0010\u0002\u001a6\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0097@"}, m18302d2 = {"consumeEachBufferRange", "", "visitor", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "buffer", "", "last", "Lio/ktor/utils/io/ConsumeEachBufferVisitor;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ByteChannelSequentialJVM", m18559f = "ByteChannelSequentialJVM.kt", m18560l = {166}, m18561m = "consumeEachBufferRange")
final class ByteChannelSequentialJVM$consumeEachBufferRange$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47159a;

    /* JADX INFO: renamed from: b */
    public int f47160b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47159a = obj;
        this.f47160b |= Integer.MIN_VALUE;
        throw null;
    }
}
