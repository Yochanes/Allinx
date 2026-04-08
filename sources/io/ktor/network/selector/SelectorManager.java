package io.ktor.network.selector;

import io.ktor.network.sockets.NIOSocketImpl;
import java.io.Closeable;
import java.nio.channels.spi.SelectorProvider;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/selector/SelectorManager;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Companion", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface SelectorManager extends CoroutineScope, Closeable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/selector/SelectorManager$Companion;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: renamed from: D */
    SelectorProvider mo17089D();

    /* JADX INFO: renamed from: E */
    Object mo17090E(Selectable selectable, SelectInterest selectInterest, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: M0 */
    void mo17068M0(NIOSocketImpl nIOSocketImpl);
}
