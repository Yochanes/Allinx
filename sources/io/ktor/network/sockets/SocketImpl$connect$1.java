package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\n\b\u0000\u0010\u0002 \u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0080@"}, m18302d2 = {"connect", "", "S", "Ljava/nio/channels/SocketChannel;", "target", "Ljava/net/SocketAddress;", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/network/sockets/Socket;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.network.sockets.SocketImpl", m18559f = "SocketImpl.kt", m18560l = {35, 49}, m18561m = "connect$ktor_network")
final class SocketImpl$connect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46098a;

    /* JADX INFO: renamed from: b */
    public int f46099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SocketImpl f46100c;

    /* JADX INFO: renamed from: d */
    public SocketImpl f46101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl$connect$1(SocketImpl socketImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46100c = socketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46098a = obj;
        this.f46099b |= Integer.MIN_VALUE;
        return this.f46100c.m17107k(null, this);
    }
}
