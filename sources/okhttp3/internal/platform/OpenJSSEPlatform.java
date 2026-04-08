package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform;", "Lokhttp3/internal/platform/Platform;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class OpenJSSEPlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f57699d;

    /* JADX INFO: renamed from: c */
    public final Provider f57700c = new OpenJSSE();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        boolean z2 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, Companion.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f57699d = z2;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: d */
    public final void mo21506d(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: f */
    public final String mo21507f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: l */
    public final SSLContext mo21514l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f57700c);
        Intrinsics.m18598f(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo21515n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f57700c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m18596d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.m18597e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        Intrinsics.m18598f(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
