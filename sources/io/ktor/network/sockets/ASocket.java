package io.ktor.network.sockets;

import java.io.Closeable;
import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/network/sockets/ASocket;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lkotlinx/coroutines/DisposableHandle;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface ASocket extends Closeable, DisposableHandle {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    @Override // kotlinx.coroutines.DisposableHandle
    void dispose();
}
