package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57730a;

    public BasicTrustRootIndex(X509Certificate... caCerts) {
        Intrinsics.m18599g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.m18598f(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f57730a = linkedHashMap;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo21513a(X509Certificate x509Certificate) {
        Set set = (Set) this.f57730a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof BasicTrustRootIndex) && Intrinsics.m18594b(((BasicTrustRootIndex) obj).f57730a, this.f57730a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f57730a.hashCode();
    }
}
