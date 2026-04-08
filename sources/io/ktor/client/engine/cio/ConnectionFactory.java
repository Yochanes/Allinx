package io.ktor.client.engine.cio;

import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.BuildersKt;
import io.ktor.network.sockets.Configurable;
import io.ktor.network.sockets.ConnectUtilsJvmKt;
import io.ktor.network.sockets.Socket;
import io.ktor.network.sockets.SocketBuilder;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.network.sockets.TcpSocketBuilder;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/engine/cio/ConnectionFactory;", "", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConnectionFactory {

    /* JADX INFO: renamed from: a */
    public final Semaphore f45000a;

    /* JADX INFO: renamed from: b */
    public final SelectorManager f45001b;

    public ConnectionFactory(SelectorManager selector, int i) {
        Intrinsics.m18599g(selector, "selector");
        this.f45001b = selector;
        this.f45000a = SemaphoreKt.m20916a(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16873a(InetSocketAddress inetSocketAddress, Function1 function1, ContinuationImpl continuationImpl) {
        ConnectionFactory$connect$1 connectionFactory$connect$1;
        Function1 function12;
        SocketAddress socketAddress;
        ConnectionFactory connectionFactory;
        if (continuationImpl instanceof ConnectionFactory$connect$1) {
            connectionFactory$connect$1 = (ConnectionFactory$connect$1) continuationImpl;
            int i = connectionFactory$connect$1.f45003b;
            if ((i & Integer.MIN_VALUE) != 0) {
                connectionFactory$connect$1.f45003b = i - Integer.MIN_VALUE;
            } else {
                connectionFactory$connect$1 = new ConnectionFactory$connect$1(this, continuationImpl);
            }
        }
        Object objM17102a = connectionFactory$connect$1.f45002a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = connectionFactory$connect$1.f45003b;
        try {
            if (i2 == 0) {
                ResultKt.m18313b(objM17102a);
                Object obj = this.f45000a;
                connectionFactory$connect$1.f45005d = this;
                connectionFactory$connect$1.f45006f = inetSocketAddress;
                connectionFactory$connect$1.f45007g = function1;
                connectionFactory$connect$1.f45003b = 1;
                if (((SemaphoreAndMutexImpl) obj).m20914d(connectionFactory$connect$1) != coroutineSingletons) {
                    function12 = function1;
                    socketAddress = inetSocketAddress;
                    connectionFactory = this;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ConnectionFactory connectionFactory2 = connectionFactory$connect$1.f45005d;
                ResultKt.m18313b(objM17102a);
                inetSocketAddress = connectionFactory2;
                return (Socket) objM17102a;
            }
            Function1 function13 = connectionFactory$connect$1.f45007g;
            SocketAddress socketAddress2 = connectionFactory$connect$1.f45006f;
            ConnectionFactory connectionFactory3 = connectionFactory$connect$1.f45005d;
            ResultKt.m18313b(objM17102a);
            function12 = function13;
            socketAddress = socketAddress2;
            connectionFactory = connectionFactory3;
            SocketBuilder socketBuilderM17097a = BuildersKt.m17097a(connectionFactory.f45001b);
            Configurable.DefaultImpls.m17101a(socketBuilderM17097a);
            SocketOptions socketOptions = socketBuilderM17097a.f46095b;
            HashMap map = new HashMap(socketOptions.f46102a);
            SocketOptions.PeerSocketOptions peerSocketOptions = new SocketOptions.PeerSocketOptions(map);
            socketOptions.mo17109b(socketOptions);
            SelectorManager selectorManager = socketBuilderM17097a.f46094a;
            new TcpSocketBuilder(selectorManager, peerSocketOptions);
            connectionFactory$connect$1.f45005d = connectionFactory;
            connectionFactory$connect$1.f45006f = null;
            connectionFactory$connect$1.f45007g = null;
            connectionFactory$connect$1.f45003b = 2;
            HashMap map2 = new HashMap(map);
            SocketOptions peerSocketOptions2 = new SocketOptions.PeerSocketOptions(map2);
            peerSocketOptions.mo17109b(peerSocketOptions);
            SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = new SocketOptions.TCPClientSocketOptions(new HashMap(map2));
            peerSocketOptions2.mo17109b(peerSocketOptions2);
            function12.invoke(tCPClientSocketOptions);
            objM17102a = ConnectUtilsJvmKt.m17102a(selectorManager, socketAddress, tCPClientSocketOptions, connectionFactory$connect$1);
            inetSocketAddress = connectionFactory;
        } catch (Throwable th) {
            ((SemaphoreAndMutexImpl) inetSocketAddress.f45000a).release();
            throw th;
        }
    }
}
