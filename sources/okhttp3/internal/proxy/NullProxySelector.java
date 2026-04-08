package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NullProxySelector extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final NullProxySelector f57721a = new NullProxySelector();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.m18413N(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
