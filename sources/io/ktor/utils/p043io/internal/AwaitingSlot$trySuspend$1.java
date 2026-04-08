package io.ktor.utils.p043io.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@"}, m18302d2 = {"trySuspend", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.internal.AwaitingSlot", m18559f = "AwaitingSlot.kt", m18560l = {61}, m18561m = "trySuspend")
final class AwaitingSlot$trySuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47391a;

    /* JADX INFO: renamed from: b */
    public int f47392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AwaitingSlot f47393c;

    /* JADX INFO: renamed from: d */
    public int f47394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitingSlot$trySuspend$1(AwaitingSlot awaitingSlot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47393c = awaitingSlot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47391a = obj;
        this.f47392b |= Integer.MIN_VALUE;
        return this.f47393c.m17531a(this);
    }
}
