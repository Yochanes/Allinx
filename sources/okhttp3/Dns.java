package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Dns;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: a */
    public static final Dns f57092a = new Companion.DnsSystem();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/Dns$Companion;", "", "Lokhttp3/Dns;", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            /* JADX INFO: renamed from: a */
            public final List mo13381a(String hostname) throws UnknownHostException {
                Intrinsics.m18599g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.m18598f(allByName, "getAllByName(hostname)");
                    return ArraysKt.m18364d0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    List mo13381a(String str);
}
