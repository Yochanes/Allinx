package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Route;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Route {

    /* JADX INFO: renamed from: a */
    public final Address f57264a;

    /* JADX INFO: renamed from: b */
    public final Proxy f57265b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f57266c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.m18599g(socketAddress, "socketAddress");
        this.f57264a = address;
        this.f57265b = proxy;
        this.f57266c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return Intrinsics.m18594b(route.f57264a, this.f57264a) && Intrinsics.m18594b(route.f57265b, this.f57265b) && Intrinsics.m18594b(route.f57266c, this.f57266c);
    }

    public final int hashCode() {
        return this.f57266c.hashCode() + ((this.f57265b.hashCode() + ((this.f57264a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f57266c + '}';
    }
}
