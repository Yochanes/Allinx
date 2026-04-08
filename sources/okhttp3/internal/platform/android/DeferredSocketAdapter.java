package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public final Factory f57719a;

    /* JADX INFO: renamed from: b */
    public SocketAdapter f57720b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Factory {
        /* JADX INFO: renamed from: a */
        boolean mo21527a(SSLSocket sSLSocket);

        /* JADX INFO: renamed from: b */
        SocketAdapter mo21528b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        this.f57719a = factory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public final boolean mo21523a(SSLSocket sSLSocket) {
        return this.f57719a.mo21527a(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public final String mo21524b(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterM21529d = m21529d(sSLSocket);
        if (socketAdapterM21529d != null) {
            return socketAdapterM21529d.mo21524b(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public final void mo21525c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
        SocketAdapter socketAdapterM21529d = m21529d(sSLSocket);
        if (socketAdapterM21529d != null) {
            socketAdapterM21529d.mo21525c(sSLSocket, str, protocols);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized SocketAdapter m21529d(SSLSocket sSLSocket) {
        try {
            if (this.f57720b == null && this.f57719a.mo21527a(sSLSocket)) {
                this.f57720b = this.f57719a.mo21528b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f57720b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return true;
    }
}
