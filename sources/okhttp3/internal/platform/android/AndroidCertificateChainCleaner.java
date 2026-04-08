package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f57703a;

    /* JADX INFO: renamed from: b */
    public final X509TrustManagerExtensions f57704b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f57703a = x509TrustManager;
        this.f57704b = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public final List mo21526a(String hostname, List chain) throws SSLPeerUnverifiedException {
        Intrinsics.m18599g(chain, "chain");
        Intrinsics.m18599g(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f57704b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.m18598f(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f57703a == this.f57703a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f57703a);
    }
}
