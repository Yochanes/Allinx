package okhttp3;

import androidx.compose.animation.AbstractC0455a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Address;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Address {

    /* JADX INFO: renamed from: a */
    public final Dns f56976a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f56977b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f56978c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f56979d;

    /* JADX INFO: renamed from: e */
    public final CertificatePinner f56980e;

    /* JADX INFO: renamed from: f */
    public final Authenticator f56981f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f56982g;

    /* JADX INFO: renamed from: h */
    public final HttpUrl f56983h;

    /* JADX INFO: renamed from: i */
    public final List f56984i;

    /* JADX INFO: renamed from: j */
    public final List f56985j;

    public Address(String uriHost, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.m18599g(uriHost, "uriHost");
        Intrinsics.m18599g(dns, "dns");
        Intrinsics.m18599g(socketFactory, "socketFactory");
        Intrinsics.m18599g(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.m18599g(protocols, "protocols");
        Intrinsics.m18599g(connectionSpecs, "connectionSpecs");
        Intrinsics.m18599g(proxySelector, "proxySelector");
        this.f56976a = dns;
        this.f56977b = socketFactory;
        this.f56978c = sSLSocketFactory;
        this.f56979d = hostnameVerifier;
        this.f56980e = certificatePinner;
        this.f56981f = proxyAuthenticator;
        this.f56982g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.m21273i(sSLSocketFactory != null ? "https" : "http");
        builder.m21267c(uriHost);
        builder.m21269e(i);
        this.f56983h = builder.m21265a();
        this.f56984i = Util.m21342y(protocols);
        this.f56985j = Util.m21342y(connectionSpecs);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21170a(Address that) {
        Intrinsics.m18599g(that, "that");
        return Intrinsics.m18594b(this.f56976a, that.f56976a) && Intrinsics.m18594b(this.f56981f, that.f56981f) && Intrinsics.m18594b(this.f56984i, that.f56984i) && Intrinsics.m18594b(this.f56985j, that.f56985j) && Intrinsics.m18594b(this.f56982g, that.f56982g) && Intrinsics.m18594b(this.f56978c, that.f56978c) && Intrinsics.m18594b(this.f56979d, that.f56979d) && Intrinsics.m18594b(this.f56980e, that.f56980e) && this.f56983h.f57113e == that.f56983h.f57113e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.m18594b(this.f56983h, address.f56983h) && m21170a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f56980e) + ((Objects.hashCode(this.f56979d) + ((Objects.hashCode(this.f56978c) + ((this.f56982g.hashCode() + AbstractC0455a.m2233h(this.f56985j, AbstractC0455a.m2233h(this.f56984i, (this.f56981f.hashCode() + ((this.f56976a.hashCode() + AbstractC0000a.m5b(527, 31, this.f56983h.f57117i)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f56983h;
        sb.append(httpUrl.f57112d);
        sb.append(':');
        sb.append(httpUrl.f57113e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f56982g);
        sb.append('}');
        return sb.toString();
    }
}
