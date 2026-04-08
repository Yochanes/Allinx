package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@"}, m18302d2 = {"acceptSuspend", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/network/sockets/Socket;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.network.sockets.ServerSocketImpl", m18559f = "ServerSocketImpl.kt", m18560l = {34}, m18561m = "acceptSuspend")
final class ServerSocketImpl$acceptSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46092a;

    /* JADX INFO: renamed from: b */
    public int f46093b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46092a = obj;
        this.f46093b |= Integer.MIN_VALUE;
        throw null;
    }
}
