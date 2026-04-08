package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@"}, m18302d2 = {"awaitClosed", "", "Lio/ktor/network/sockets/ASocket;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.network.sockets.SocketsKt", m18559f = "Sockets.kt", m18560l = {39}, m18561m = "awaitClosed")
final class SocketsKt$awaitClosed$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46108a;

    /* JADX INFO: renamed from: b */
    public int f46109b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46108a = obj;
        int i = (this.f46109b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f46109b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }
}
