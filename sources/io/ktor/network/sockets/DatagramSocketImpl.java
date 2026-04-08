package io.ktor.network.sockets;

import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/sockets/DatagramSocketImpl;", "Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "Lio/ktor/network/sockets/NIOSocketImpl;", "Ljava/nio/channels/DatagramChannel;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DatagramSocketImpl extends NIOSocketImpl<DatagramChannel> implements BoundDatagramSocket, ConnectedDatagramSocket {
    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ SelectableChannel mo17086e() {
        return null;
    }
}
