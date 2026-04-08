package io.ktor.network.sockets;

import io.ktor.network.sockets.SocketOptions;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class JavaSocketOptionsKt {
    /* JADX INFO: renamed from: a */
    public static final void m17104a(SocketChannel assignOptions, SocketOptions.TCPClientSocketOptions options) throws SocketException {
        Intrinsics.m18599g(assignOptions, "$this$assignOptions");
        Intrinsics.m18599g(options, "options");
        java.net.Socket socket = assignOptions.socket();
        Intrinsics.m18596d(socket);
        socket.setReuseAddress(false);
        int i = options.f46104c;
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            socket.setSoLinger(true, numValueOf.intValue());
        }
        socket.setTcpNoDelay(options.f46103b);
    }
}
