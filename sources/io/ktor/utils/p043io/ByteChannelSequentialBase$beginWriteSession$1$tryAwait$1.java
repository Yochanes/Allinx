package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@"}, m18302d2 = {"tryAwait", "", "n", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ByteChannelSequentialBase$beginWriteSession$1", m18559f = "ByteChannelSequential.kt", m18560l = {320}, m18561m = "tryAwait")
final class ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46987a;

    /* JADX INFO: renamed from: b */
    public int f46988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteChannelSequentialBase$beginWriteSession$1 f46989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1(ByteChannelSequentialBase$beginWriteSession$1 byteChannelSequentialBase$beginWriteSession$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46989c = byteChannelSequentialBase$beginWriteSession$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46987a = obj;
        this.f46988b |= Integer.MIN_VALUE;
        this.f46989c.mo17372b(0, this);
        return Unit.f51459a;
    }
}
