package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: a */
    public final TrustRootIndex f57729a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner$Companion;", "", "", "MAX_SIGNERS", "I", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        Intrinsics.m18599g(trustRootIndex, "trustRootIndex");
        this.f57729a = trustRootIndex;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public final List mo21526a(String hostname, List chain) throws SSLPeerUnverifiedException {
        Intrinsics.m18599g(chain, "chain");
        Intrinsics.m18599g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics.m18598f(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z2 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo21513a = this.f57729a.mo21513a(x509Certificate);
            if (x509CertificateMo21513a == null) {
                Iterator it = arrayDeque.iterator();
                Intrinsics.m18598f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.m18597e(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (Intrinsics.m18594b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo21513a)) {
                arrayList.add(x509CertificateMo21513a);
            }
            if (Intrinsics.m18594b(x509CertificateMo21513a.getIssuerDN(), x509CertificateMo21513a.getSubjectDN())) {
                try {
                    x509CertificateMo21513a.verify(x509CertificateMo21513a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && Intrinsics.m18594b(((BasicCertificateChainCleaner) obj).f57729a, this.f57729a);
    }

    public final int hashCode() {
        return this.f57729a.hashCode();
    }
}
