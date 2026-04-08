package io.ktor.network.sockets;

import io.ktor.network.selector.InterestSuspensionsMap;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.Selectable;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/sockets/ServerSocketImpl;", "Lio/ktor/network/sockets/ServerSocket;", "Lio/ktor/network/selector/Selectable;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ServerSocketImpl implements ServerSocket, Selectable {
    @Override // io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: A */
    public final InterestSuspensionsMap mo17085A() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw null;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        throw null;
    }

    @Override // io.ktor.network.sockets.ASocket, kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ SelectableChannel mo17086e() {
        return null;
    }

    @Override // io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: k0 */
    public final int mo17087k0() {
        throw null;
    }

    @Override // io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: t0 */
    public final void mo17088t0(SelectInterest selectInterest, boolean z2) {
        throw null;
    }
}
