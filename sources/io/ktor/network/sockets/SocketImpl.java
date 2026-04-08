package io.ktor.network.sockets;

import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/sockets/SocketImpl;", "Ljava/nio/channels/SocketChannel;", "S", "Lio/ktor/network/sockets/NIOSocketImpl;", "Lio/ktor/network/sockets/Socket;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SocketImpl<S extends SocketChannel> extends NIOSocketImpl<S> implements Socket {

    /* JADX INFO: renamed from: q */
    public final SocketChannel f46096q;

    /* JADX INFO: renamed from: r */
    public final java.net.Socket f46097r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl(SocketChannel socketChannel, java.net.Socket socket, SelectorManager selector, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(socketChannel, selector, tCPClientSocketOptions);
        Intrinsics.m18599g(selector, "selector");
        this.f46096q = socketChannel;
        this.f46097r = socket;
        if (socketChannel.isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: e */
    public final SelectableChannel mo17086e() {
        return this.f46096q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0108, code lost:
    
        r13.mo17088t0(io.ktor.network.selector.SelectInterest.CONNECT, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010d, code lost:
    
        return r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17107k(SocketAddress socketAddress, ContinuationImpl continuationImpl) throws IOException {
        SocketImpl$connect$1 socketImpl$connect$1;
        SocketImpl<S> socketImpl;
        String hostAddress;
        InetAddress address;
        InetAddress address2;
        String hostAddress2;
        InetAddress address3;
        if (continuationImpl instanceof SocketImpl$connect$1) {
            socketImpl$connect$1 = (SocketImpl$connect$1) continuationImpl;
            int i = socketImpl$connect$1.f46099b;
            if ((i & Integer.MIN_VALUE) != 0) {
                socketImpl$connect$1.f46099b = i - Integer.MIN_VALUE;
            } else {
                socketImpl$connect$1 = new SocketImpl$connect$1(this, continuationImpl);
            }
        }
        Object obj = socketImpl$connect$1.f46098a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = socketImpl$connect$1.f46099b;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (this.f46096q.connect(socketAddress)) {
                return this;
            }
            SelectInterest selectInterest = SelectInterest.CONNECT;
            mo17088t0(selectInterest, true);
            socketImpl$connect$1.f46101d = this;
            socketImpl$connect$1.f46099b = 1;
            if (this.f46085n.mo17090E(this, selectInterest, socketImpl$connect$1) != coroutineSingletons) {
                socketImpl = this;
            }
            return coroutineSingletons;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        socketImpl = socketImpl$connect$1.f46101d;
        ResultKt.m18313b(obj);
        while (true) {
            if (socketImpl.f46096q.finishConnect()) {
                java.net.Socket socket = socketImpl.f46097r;
                Intrinsics.m18598f(socket.getLocalSocketAddress(), "socket.localSocketAddress");
                Intrinsics.m18598f(socket.getRemoteSocketAddress(), "socket.remoteSocketAddress");
                SocketAddress localSocketAddress = socket.getLocalSocketAddress();
                Intrinsics.m18598f(localSocketAddress, "socket.localSocketAddress");
                if (!(localSocketAddress instanceof InetSocketAddress)) {
                    localSocketAddress = null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) localSocketAddress;
                String str = "";
                if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (hostAddress = address3.getHostAddress()) == null) {
                    hostAddress = "";
                }
                SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
                Intrinsics.m18598f(remoteSocketAddress, "socket.remoteSocketAddress");
                if (!(remoteSocketAddress instanceof InetSocketAddress)) {
                    remoteSocketAddress = null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) remoteSocketAddress;
                if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress2 = address2.getHostAddress()) != null) {
                    str = hostAddress2;
                }
                SocketAddress remoteSocketAddress2 = socket.getRemoteSocketAddress();
                Intrinsics.m18598f(remoteSocketAddress2, "socket.remoteSocketAddress");
                if (!(remoteSocketAddress2 instanceof InetSocketAddress)) {
                    remoteSocketAddress2 = null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) remoteSocketAddress2;
                boolean zIsAnyLocalAddress = (inetSocketAddress3 == null || (address = inetSocketAddress3.getAddress()) == null) ? false : address.isAnyLocalAddress();
                SocketAddress localSocketAddress2 = socket.getLocalSocketAddress();
                Intrinsics.m18598f(localSocketAddress2, "socket.localSocketAddress");
                if (!(localSocketAddress2 instanceof InetSocketAddress)) {
                    localSocketAddress2 = null;
                }
                InetSocketAddress inetSocketAddress4 = (InetSocketAddress) localSocketAddress2;
                int port = inetSocketAddress4 != null ? inetSocketAddress4.getPort() : 0;
                SocketAddress remoteSocketAddress3 = socket.getRemoteSocketAddress();
                Intrinsics.m18598f(remoteSocketAddress3, "socket.remoteSocketAddress");
                InetSocketAddress inetSocketAddress5 = (InetSocketAddress) (remoteSocketAddress3 instanceof InetSocketAddress ? remoteSocketAddress3 : null);
                if (port != (inetSocketAddress5 != null ? inetSocketAddress5.getPort() : 0) || (!zIsAnyLocalAddress && !hostAddress.equals(str))) {
                    break;
                }
                socket.close();
            } else {
                SelectInterest selectInterest2 = SelectInterest.CONNECT;
                socketImpl.mo17088t0(selectInterest2, true);
                socketImpl$connect$1.f46101d = socketImpl;
                socketImpl$connect$1.f46099b = 2;
                if (socketImpl.f46085n.mo17090E(socketImpl, selectInterest2, socketImpl$connect$1) == coroutineSingletons) {
                    break;
                }
            }
        }
        return coroutineSingletons;
    }
}
