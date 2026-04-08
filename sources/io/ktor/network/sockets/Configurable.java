package io.ktor.network.sockets;

import io.ktor.network.sockets.Configurable;
import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/sockets/Configurable;", "T", "Lio/ktor/network/sockets/SocketOptions;", "Options", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Configurable<T extends Configurable<? extends T, Options>, Options extends SocketOptions> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static void m17101a(Configurable configurable) {
            BuildersKt$tcpNoDelay$1 buildersKt$tcpNoDelay$1 = BuildersKt$tcpNoDelay$1.f46005a;
            SocketOptions socketOptionsMo17108a = configurable.mo17099a().mo17108a();
            if (socketOptionsMo17108a == null) {
                throw new NullPointerException("null cannot be cast to non-null type Options");
            }
            buildersKt$tcpNoDelay$1.invoke(socketOptionsMo17108a);
            configurable.mo17100b(socketOptionsMo17108a);
        }
    }

    /* JADX INFO: renamed from: a */
    SocketOptions mo17099a();

    /* JADX INFO: renamed from: b */
    void mo17100b(SocketOptions socketOptions);
}
