package okhttp3;

import com.google.common.net.HttpHeaders;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.p047ws.RealWebSocket;
import okhttp3.internal.p047ws.RealWebSocket$connect$1;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import p006H.C0014a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Builder", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: G */
    public static final List f57146G = Util.m21329l(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: H */
    public static final List f57147H = Util.m21329l(ConnectionSpec.f57062e, ConnectionSpec.f57063f);

    /* JADX INFO: renamed from: A */
    public final CertificateChainCleaner f57148A;

    /* JADX INFO: renamed from: B */
    public final int f57149B;

    /* JADX INFO: renamed from: C */
    public final int f57150C;

    /* JADX INFO: renamed from: D */
    public final int f57151D;

    /* JADX INFO: renamed from: E */
    public final long f57152E;

    /* JADX INFO: renamed from: F */
    public final RouteDatabase f57153F;

    /* JADX INFO: renamed from: a */
    public final Dispatcher f57154a;

    /* JADX INFO: renamed from: b */
    public final ConnectionPool f57155b;

    /* JADX INFO: renamed from: c */
    public final List f57156c;

    /* JADX INFO: renamed from: d */
    public final List f57157d;

    /* JADX INFO: renamed from: f */
    public final C0014a f57158f;

    /* JADX INFO: renamed from: g */
    public final boolean f57159g;

    /* JADX INFO: renamed from: i */
    public final Authenticator f57160i;

    /* JADX INFO: renamed from: j */
    public final boolean f57161j;

    /* JADX INFO: renamed from: n */
    public final boolean f57162n;

    /* JADX INFO: renamed from: o */
    public final CookieJar f57163o;

    /* JADX INFO: renamed from: p */
    public final Cache f57164p;

    /* JADX INFO: renamed from: q */
    public final Dns f57165q;

    /* JADX INFO: renamed from: r */
    public final ProxySelector f57166r;

    /* JADX INFO: renamed from: s */
    public final Authenticator f57167s;

    /* JADX INFO: renamed from: t */
    public final SocketFactory f57168t;

    /* JADX INFO: renamed from: u */
    public final SSLSocketFactory f57169u;

    /* JADX INFO: renamed from: v */
    public final X509TrustManager f57170v;

    /* JADX INFO: renamed from: w */
    public final List f57171w;

    /* JADX INFO: renamed from: x */
    public final List f57172x;

    /* JADX INFO: renamed from: y */
    public final OkHostnameVerifier f57173y;

    /* JADX INFO: renamed from: z */
    public final CertificatePinner f57174z;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: A */
        public RouteDatabase f57175A;

        /* JADX INFO: renamed from: a */
        public Dispatcher f57176a = new Dispatcher();

        /* JADX INFO: renamed from: b */
        public ConnectionPool f57177b = new ConnectionPool();

        /* JADX INFO: renamed from: c */
        public final ArrayList f57178c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f57179d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public C0014a f57180e = new C0014a(1);

        /* JADX INFO: renamed from: f */
        public boolean f57181f = true;

        /* JADX INFO: renamed from: g */
        public Authenticator f57182g;

        /* JADX INFO: renamed from: h */
        public boolean f57183h;

        /* JADX INFO: renamed from: i */
        public boolean f57184i;

        /* JADX INFO: renamed from: j */
        public CookieJar f57185j;

        /* JADX INFO: renamed from: k */
        public Cache f57186k;

        /* JADX INFO: renamed from: l */
        public Dns f57187l;

        /* JADX INFO: renamed from: m */
        public ProxySelector f57188m;

        /* JADX INFO: renamed from: n */
        public Authenticator f57189n;

        /* JADX INFO: renamed from: o */
        public SocketFactory f57190o;

        /* JADX INFO: renamed from: p */
        public SSLSocketFactory f57191p;

        /* JADX INFO: renamed from: q */
        public X509TrustManager f57192q;

        /* JADX INFO: renamed from: r */
        public List f57193r;

        /* JADX INFO: renamed from: s */
        public List f57194s;

        /* JADX INFO: renamed from: t */
        public OkHostnameVerifier f57195t;

        /* JADX INFO: renamed from: u */
        public CertificatePinner f57196u;

        /* JADX INFO: renamed from: v */
        public CertificateChainCleaner f57197v;

        /* JADX INFO: renamed from: w */
        public int f57198w;

        /* JADX INFO: renamed from: x */
        public int f57199x;

        /* JADX INFO: renamed from: y */
        public int f57200y;

        /* JADX INFO: renamed from: z */
        public long f57201z;

        public Builder() {
            Authenticator authenticator = Authenticator.f56986a;
            this.f57182g = authenticator;
            this.f57183h = true;
            this.f57184i = true;
            this.f57185j = CookieJar.f57085a;
            this.f57187l = Dns.f57092a;
            this.f57189n = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.m18598f(socketFactory, "getDefault()");
            this.f57190o = socketFactory;
            this.f57193r = OkHttpClient.f57147H;
            this.f57194s = OkHttpClient.f57146G;
            this.f57195t = OkHostnameVerifier.f57731a;
            this.f57196u = CertificatePinner.f57032c;
            this.f57198w = 10000;
            this.f57199x = 10000;
            this.f57200y = 10000;
            this.f57201z = 1024L;
        }

        /* JADX INFO: renamed from: a */
        public final void m21291a(Interceptor interceptor) {
            Intrinsics.m18599g(interceptor, "interceptor");
            this.f57178c.add(interceptor);
        }

        /* JADX INFO: renamed from: b */
        public final void m21292b(TaggingSocketFactory taggingSocketFactory) {
            if (!taggingSocketFactory.equals(this.f57190o)) {
                this.f57175A = null;
            }
            this.f57190o = taggingSocketFactory;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public OkHttpClient(Builder builder) {
        this.f57154a = builder.f57176a;
        this.f57155b = builder.f57177b;
        this.f57156c = Util.m21342y(builder.f57178c);
        this.f57157d = Util.m21342y(builder.f57179d);
        this.f57158f = builder.f57180e;
        this.f57159g = builder.f57181f;
        this.f57160i = builder.f57182g;
        this.f57161j = builder.f57183h;
        this.f57162n = builder.f57184i;
        this.f57163o = builder.f57185j;
        this.f57164p = builder.f57186k;
        this.f57165q = builder.f57187l;
        ProxySelector proxySelector = builder.f57188m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f57166r = proxySelector == null ? NullProxySelector.f57721a : proxySelector;
        this.f57167s = builder.f57189n;
        this.f57168t = builder.f57190o;
        List list = builder.f57193r;
        this.f57171w = list;
        this.f57172x = builder.f57194s;
        this.f57173y = builder.f57195t;
        this.f57149B = builder.f57198w;
        this.f57150C = builder.f57199x;
        this.f57151D = builder.f57200y;
        this.f57152E = builder.f57201z;
        RouteDatabase routeDatabase = builder.f57175A;
        this.f57153F = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f57169u = null;
            this.f57148A = null;
            this.f57170v = null;
            this.f57174z = CertificatePinner.f57032c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f57064a) {
                    SSLSocketFactory sSLSocketFactory = builder.f57191p;
                    if (sSLSocketFactory != null) {
                        this.f57169u = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.f57197v;
                        Intrinsics.m18596d(certificateChainCleaner);
                        this.f57148A = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f57192q;
                        Intrinsics.m18596d(x509TrustManager);
                        this.f57170v = x509TrustManager;
                        CertificatePinner certificatePinner = builder.f57196u;
                        certificatePinner.getClass();
                        this.f57174z = Intrinsics.m18594b(certificatePinner.f57034b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f57033a, certificateChainCleaner);
                    } else {
                        Platform platform = Platform.f57701a;
                        X509TrustManager x509TrustManagerMo21515n = Platform.f57701a.mo21515n();
                        this.f57170v = x509TrustManagerMo21515n;
                        this.f57169u = Platform.f57701a.mo21516m(x509TrustManagerMo21515n);
                        CertificateChainCleaner certificateChainCleanerMo21505b = Platform.f57701a.mo21505b(x509TrustManagerMo21515n);
                        this.f57148A = certificateChainCleanerMo21505b;
                        CertificatePinner certificatePinner2 = builder.f57196u;
                        certificatePinner2.getClass();
                        this.f57174z = Intrinsics.m18594b(certificatePinner2.f57034b, certificateChainCleanerMo21505b) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f57033a, certificateChainCleanerMo21505b);
                    }
                }
            }
            this.f57169u = null;
            this.f57148A = null;
            this.f57170v = null;
            this.f57174z = CertificatePinner.f57032c;
        }
        List list3 = this.f57156c;
        Intrinsics.m18597e(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f57157d;
        Intrinsics.m18597e(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f57171w;
        boolean z2 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f57170v;
        CertificateChainCleaner certificateChainCleaner2 = this.f57148A;
        SSLSocketFactory sSLSocketFactory2 = this.f57169u;
        if (!z2 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f57064a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.m18594b(this.f57174z, CertificatePinner.f57032c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    /* JADX INFO: renamed from: a */
    public final RealCall mo21188a(Request request) {
        Intrinsics.m18599g(request, "request");
        return new RealCall(this, request, false);
    }

    /* JADX INFO: renamed from: b */
    public final RealWebSocket m21290b(Request request, WebSocketListener listener) {
        Intrinsics.m18599g(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.f57360i, request, listener, new Random(), 0, this.f57152E);
        if (request.f57212c.m21240c(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            realWebSocket.m21538b(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return realWebSocket;
        }
        Builder builder = new Builder();
        builder.f57176a = this.f57154a;
        builder.f57177b = this.f57155b;
        CollectionsKt.m18434i(builder.f57178c, this.f57156c);
        CollectionsKt.m18434i(builder.f57179d, this.f57157d);
        builder.f57181f = this.f57159g;
        builder.f57182g = this.f57160i;
        builder.f57183h = this.f57161j;
        builder.f57184i = this.f57162n;
        builder.f57185j = this.f57163o;
        builder.f57186k = this.f57164p;
        builder.f57187l = this.f57165q;
        builder.f57188m = this.f57166r;
        builder.f57189n = this.f57167s;
        builder.f57190o = this.f57168t;
        builder.f57191p = this.f57169u;
        builder.f57192q = this.f57170v;
        builder.f57193r = this.f57171w;
        builder.f57194s = this.f57172x;
        builder.f57195t = this.f57173y;
        builder.f57196u = this.f57174z;
        builder.f57197v = this.f57148A;
        builder.f57198w = this.f57149B;
        builder.f57199x = this.f57150C;
        builder.f57200y = this.f57151D;
        builder.f57201z = this.f57152E;
        builder.f57175A = this.f57153F;
        builder.f57180e = new C0014a(1);
        List protocols = RealWebSocket.f57741x;
        Intrinsics.m18599g(protocols, "protocols");
        ArrayList arrayListM18469z0 = CollectionsKt.m18469z0(protocols);
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!arrayListM18469z0.contains(protocol) && !arrayListM18469z0.contains(Protocol.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListM18469z0).toString());
        }
        if (arrayListM18469z0.contains(protocol) && arrayListM18469z0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListM18469z0).toString());
        }
        if (arrayListM18469z0.contains(Protocol.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListM18469z0).toString());
        }
        if (arrayListM18469z0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListM18469z0.remove(Protocol.SPDY_3);
        if (!arrayListM18469z0.equals(builder.f57194s)) {
            builder.f57175A = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListM18469z0);
        Intrinsics.m18598f(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        builder.f57194s = listUnmodifiableList;
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        Request.Builder builderM21295b = request.m21295b();
        builderM21295b.m21299d(HttpHeaders.UPGRADE, "websocket");
        builderM21295b.m21299d(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        builderM21295b.m21299d(HttpHeaders.SEC_WEBSOCKET_KEY, realWebSocket.f57748g);
        builderM21295b.m21299d(HttpHeaders.SEC_WEBSOCKET_VERSION, "13");
        builderM21295b.m21299d(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate");
        Request requestM21297b = builderM21295b.m21297b();
        RealCall realCall = new RealCall(okHttpClient, requestM21297b, true);
        realWebSocket.f57749h = realCall;
        realCall.mo21187g(new RealWebSocket$connect$1(realWebSocket, requestM21297b));
        return realWebSocket;
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
