package okhttp3.internal.platform;

import android.util.Log;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/Platform;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class Platform {

    /* JADX INFO: renamed from: a */
    public static volatile Platform f57701a;

    /* JADX INFO: renamed from: b */
    public static final Logger f57702b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m18302d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", MTPushConstants.PlatformNode.KEY_PLATFORM, "Lokhttp3/internal/platform/Platform;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ArrayList m21521a(List protocols) {
            Intrinsics.m18599g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f57209a);
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m21522b(List protocols) {
            Intrinsics.m18599g(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m21521a(protocols)) {
                buffer.m21563C0(str.length());
                buffer.m21578S0(str);
            }
            return buffer.m21566H(buffer.f57830b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    static {
        Platform jdk9Platform;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            for (Map.Entry entry : AndroidLog.f57706b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AndroidLog.f57705a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f57707a);
                }
            }
            jdk9Platform = Android10Platform.f57678d ? new Android10Platform() : null;
            if (jdk9Platform == null) {
                jdk8WithJettyBootPlatform = AndroidPlatform.f57680e ? new AndroidPlatform() : null;
                Intrinsics.m18596d(jdk8WithJettyBootPlatform);
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            jdk9Platform = ConscryptPlatform.f57687d ? new ConscryptPlatform() : null;
            if (jdk9Platform == null) {
            }
        } else if ("BC".equals(Security.getProviders()[0].getName())) {
            jdk9Platform = BouncyCastlePlatform.f57685d ? new BouncyCastlePlatform() : null;
            if (jdk9Platform == null) {
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            jdk9Platform = OpenJSSEPlatform.f57699d ? new OpenJSSEPlatform() : null;
            if (jdk9Platform == null) {
            }
        } else {
            jdk9Platform = Jdk9Platform.f57698c ? new Jdk9Platform() : null;
            if (jdk9Platform == null) {
                String jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    Intrinsics.m18598f(jvmVersion, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
                if (Integer.parseInt(jvmVersion) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                        Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                        Intrinsics.m18598f(putMethod, "putMethod");
                        Intrinsics.m18598f(getMethod, "getMethod");
                        Intrinsics.m18598f(removeMethod, "removeMethod");
                        Intrinsics.m18598f(clientProviderClass, "clientProviderClass");
                        Intrinsics.m18598f(serverProviderClass, "serverProviderClass");
                        jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    }
                }
                jdk9Platform = jdk8WithJettyBootPlatform != null ? jdk8WithJettyBootPlatform : new Platform();
            }
        }
        f57701a = jdk9Platform;
        f57702b = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* JADX INFO: renamed from: i */
    public static void m21519i(int i, String message, Throwable th) {
        Intrinsics.m18599g(message, "message");
        f57702b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m21520j(Platform platform, String str, int i) {
        int i2 = (i & 2) != 0 ? 4 : 5;
        platform.getClass();
        m21519i(i2, str, null);
    }

    /* JADX INFO: renamed from: b */
    public CertificateChainCleaner mo21505b(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(mo21509c(x509TrustManager));
    }

    /* JADX INFO: renamed from: c */
    public TrustRootIndex mo21509c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics.m18598f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: d */
    public void mo21506d(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
    }

    /* JADX INFO: renamed from: e */
    public void mo21510e(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.m18599g(address, "address");
        socket.connect(address, i);
    }

    /* JADX INFO: renamed from: f */
    public String mo21507f(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Object mo21511g() {
        if (f57702b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo21508h(String hostname) {
        Intrinsics.m18599g(hostname, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void mo21512k(Object obj, String message) {
        Intrinsics.m18599g(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m21519i(5, message, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public SSLContext mo21514l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.m18598f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX INFO: renamed from: m */
    public SSLSocketFactory mo21516m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo21514l = mo21514l();
            sSLContextMo21514l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo21514l.getSocketFactory();
            Intrinsics.m18598f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* JADX INFO: renamed from: n */
    public X509TrustManager mo21515n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public void mo21518a(SSLSocket sSLSocket) {
    }
}
