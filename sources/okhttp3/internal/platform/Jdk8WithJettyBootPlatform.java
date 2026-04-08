package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "AlpnProvider", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* JADX INFO: renamed from: c */
    public final Method f57690c;

    /* JADX INFO: renamed from: d */
    public final Method f57691d;

    /* JADX INFO: renamed from: e */
    public final Method f57692e;

    /* JADX INFO: renamed from: f */
    public final Class f57693f;

    /* JADX INFO: renamed from: g */
    public final Class f57694g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class AlpnProvider implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final ArrayList f57695a;

        /* JADX INFO: renamed from: b */
        public boolean f57696b;

        /* JADX INFO: renamed from: c */
        public String f57697c;

        public AlpnProvider(ArrayList arrayList) {
            this.f57695a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.m18599g(proxy, "proxy");
            Intrinsics.m18599g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.m18594b(name, "supports") && Intrinsics.m18594b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.m18594b(name, "unsupported") && Intrinsics.m18594b(Void.TYPE, returnType)) {
                this.f57696b = true;
                return null;
            }
            boolean zM18594b = Intrinsics.m18594b(name, "protocols");
            ArrayList arrayList = this.f57695a;
            if (zM18594b && objArr.length == 0) {
                return arrayList;
            }
            if ((Intrinsics.m18594b(name, "selectProtocol") || Intrinsics.m18594b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj2 = list.get(i);
                            Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!arrayList.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f57697c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f57697c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.m18594b(name, "protocolSelected") && !Intrinsics.m18594b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f57697c = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f57690c = method;
        this.f57691d = method2;
        this.f57692e = method3;
        this.f57693f = cls;
        this.f57694g = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: a */
    public final void mo21518a(SSLSocket sSLSocket) {
        try {
            this.f57692e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: d */
    public final void mo21506d(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
        try {
            this.f57690c.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f57693f, this.f57694g}, new AlpnProvider(Platform.Companion.m21521a(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: f */
    public final String mo21507f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f57691d.invoke(null, sSLSocket));
            Intrinsics.m18597e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z2 = alpnProvider.f57696b;
            if (!z2 && alpnProvider.f57697c == null) {
                Platform.m21520j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z2) {
                return null;
            }
            return alpnProvider.f57697c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
