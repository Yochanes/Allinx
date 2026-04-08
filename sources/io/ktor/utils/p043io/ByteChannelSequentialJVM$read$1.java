package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0096@"}, m18302d2 = {"read", "", "min", "", "consumer", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "continuation", "Lkotlin/coroutines/Continuation;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ByteChannelSequentialJVM", m18559f = "ByteChannelSequentialJVM.kt", m18560l = {185}, m18561m = "read")
final class ByteChannelSequentialJVM$read$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47161a;

    /* JADX INFO: renamed from: b */
    public int f47162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteChannelSequentialJVM f47163c;

    /* JADX INFO: renamed from: d */
    public ByteChannelSequentialJVM f47164d;

    /* JADX INFO: renamed from: f */
    public Function1 f47165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialJVM$read$1(ByteChannelSequentialJVM byteChannelSequentialJVM, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47163c = byteChannelSequentialJVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47161a = obj;
        this.f47162b |= Integer.MIN_VALUE;
        this.f47163c.mo17247A(0, null, this);
        throw null;
    }
}
