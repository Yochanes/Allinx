package io.ktor.network.sockets;

import io.ktor.network.selector.SelectorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SocketBuilder implements Configurable<SocketBuilder, SocketOptions> {

    /* JADX INFO: renamed from: a */
    public final SelectorManager f46094a;

    /* JADX INFO: renamed from: b */
    public SocketOptions f46095b;

    public SocketBuilder(SelectorManager selector, SocketOptions socketOptions) {
        Intrinsics.m18599g(selector, "selector");
        this.f46094a = selector;
        this.f46095b = socketOptions;
    }

    @Override // io.ktor.network.sockets.Configurable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SocketOptions getF46095b() {
        return this.f46095b;
    }

    @Override // io.ktor.network.sockets.Configurable
    /* JADX INFO: renamed from: b */
    public final void mo17100b(SocketOptions socketOptions) {
        this.f46095b = socketOptions;
    }
}
