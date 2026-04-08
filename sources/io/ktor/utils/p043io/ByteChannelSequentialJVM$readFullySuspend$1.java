package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0082@"}, m18302d2 = {"readFullySuspend", "", "dst", "Ljava/nio/ByteBuffer;", "rc0", "", "continuation", "Lkotlin/coroutines/Continuation;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ByteChannelSequentialJVM", m18559f = "ByteChannelSequentialJVM.kt", m18560l = {124}, m18561m = "readFullySuspend")
final class ByteChannelSequentialJVM$readFullySuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47170a;

    /* JADX INFO: renamed from: b */
    public int f47171b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47170a = obj;
        this.f47171b |= Integer.MIN_VALUE;
        throw null;
    }
}
