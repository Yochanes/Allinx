package io.ktor.network.sockets;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions;", "", "AcceptorOptions", "Companion", "GeneralSocketOptions", "PeerSocketOptions", "TCPClientSocketOptions", "UDPSocketOptions", "Lio/ktor/network/sockets/SocketOptions$GeneralSocketOptions;", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class SocketOptions {

    /* JADX INFO: renamed from: a */
    public final HashMap f46102a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/SocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class AcceptorOptions extends SocketOptions {
        @Override // io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: a */
        public final SocketOptions mo17108a() {
            return new AcceptorOptions(new HashMap(this.f46102a));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$Companion;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$GeneralSocketOptions;", "Lio/ktor/network/sockets/SocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class GeneralSocketOptions extends SocketOptions {
        @Override // io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: a */
        public final SocketOptions mo17108a() {
            return new GeneralSocketOptions(new HashMap(this.f46102a));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "Lio/ktor/network/sockets/SocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static class PeerSocketOptions extends SocketOptions {
        @Override // io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ SocketOptions mo17108a() {
            return mo17110c();
        }

        @Override // io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: b */
        public void mo17109b(SocketOptions from) {
            Intrinsics.m18599g(from, "from");
            if (from instanceof PeerSocketOptions) {
            }
        }

        /* JADX INFO: renamed from: c */
        public PeerSocketOptions mo17110c() {
            PeerSocketOptions peerSocketOptions = new PeerSocketOptions(new HashMap(this.f46102a));
            peerSocketOptions.mo17109b(this);
            return peerSocketOptions;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class TCPClientSocketOptions extends PeerSocketOptions {

        /* JADX INFO: renamed from: b */
        public boolean f46103b;

        /* JADX INFO: renamed from: c */
        public int f46104c;

        /* JADX INFO: renamed from: d */
        public long f46105d;

        public TCPClientSocketOptions(HashMap map) {
            super(map);
            this.f46103b = true;
            this.f46104c = -1;
            this.f46105d = Long.MAX_VALUE;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: a */
        public final SocketOptions mo17108a() {
            TCPClientSocketOptions tCPClientSocketOptions = new TCPClientSocketOptions(new HashMap(this.f46102a));
            tCPClientSocketOptions.mo17109b(this);
            return tCPClientSocketOptions;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: b */
        public final void mo17109b(SocketOptions from) {
            Intrinsics.m18599g(from, "from");
            super.mo17109b(from);
            if (from instanceof TCPClientSocketOptions) {
                TCPClientSocketOptions tCPClientSocketOptions = (TCPClientSocketOptions) from;
                this.f46103b = tCPClientSocketOptions.f46103b;
                this.f46104c = tCPClientSocketOptions.f46104c;
            }
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions
        /* JADX INFO: renamed from: c */
        public final PeerSocketOptions mo17110c() {
            TCPClientSocketOptions tCPClientSocketOptions = new TCPClientSocketOptions(new HashMap(this.f46102a));
            tCPClientSocketOptions.mo17109b(this);
            return tCPClientSocketOptions;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class UDPSocketOptions extends PeerSocketOptions {
        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        /* JADX INFO: renamed from: a */
        public final SocketOptions mo17108a() {
            UDPSocketOptions uDPSocketOptions = new UDPSocketOptions(new HashMap(this.f46102a));
            uDPSocketOptions.mo17109b(this);
            return uDPSocketOptions;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions
        /* JADX INFO: renamed from: c */
        public final PeerSocketOptions mo17110c() {
            UDPSocketOptions uDPSocketOptions = new UDPSocketOptions(new HashMap(this.f46102a));
            uDPSocketOptions.mo17109b(this);
            return uDPSocketOptions;
        }
    }

    public SocketOptions(HashMap map) {
        this.f46102a = map;
    }

    /* JADX INFO: renamed from: a */
    public abstract SocketOptions mo17108a();

    /* JADX INFO: renamed from: b */
    public void mo17109b(SocketOptions from) {
        Intrinsics.m18599g(from, "from");
    }
}
