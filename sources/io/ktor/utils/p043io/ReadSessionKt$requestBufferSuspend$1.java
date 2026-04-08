package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082@"}, m18302d2 = {"requestBufferSuspend", "", "Lio/ktor/utils/io/SuspendableReadSession;", "desiredSize", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/core/Buffer;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.ReadSessionKt", m18559f = "ReadSession.kt", m18560l = {124}, m18561m = "requestBufferSuspend")
final class ReadSessionKt$requestBufferSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47309a;

    /* JADX INFO: renamed from: b */
    public int f47310b;

    /* JADX INFO: renamed from: c */
    public SuspendableReadSession f47311c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47309a = obj;
        this.f47310b |= Integer.MIN_VALUE;
        return ReadSessionKt.m17399d(null, 0, this);
    }
}
