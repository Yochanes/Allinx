package io.ktor.client.engine.cio;

import com.google.android.gms.common.ConnectionResult;
import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@"}, m18302d2 = {"connect", "", "address", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/NetworkAddress;", "configuration", "Lkotlin/Function1;", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "", "Lkotlin/ExtensionFunctionType;", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/network/sockets/Socket;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.client.engine.cio.ConnectionFactory", m18559f = "ConnectionFactory.kt", m18560l = {22, ConnectionResult.API_DISABLED_FOR_CONNECTION}, m18561m = "connect")
final class ConnectionFactory$connect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45002a;

    /* JADX INFO: renamed from: b */
    public int f45003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ConnectionFactory f45004c;

    /* JADX INFO: renamed from: d */
    public ConnectionFactory f45005d;

    /* JADX INFO: renamed from: f */
    public SocketAddress f45006f;

    /* JADX INFO: renamed from: g */
    public Function1 f45007g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionFactory$connect$1(ConnectionFactory connectionFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45004c = connectionFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f45002a = obj;
        this.f45003b |= Integer.MIN_VALUE;
        return this.f45004c.m16873a(null, null, this);
    }
}
