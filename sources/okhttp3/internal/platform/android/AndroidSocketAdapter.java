package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: f */
    public static final AndroidSocketAdapter$Companion$factory$1 f57708f = new AndroidSocketAdapter$Companion$factory$1();

    /* JADX INFO: renamed from: a */
    public final Class f57709a;

    /* JADX INFO: renamed from: b */
    public final Method f57710b;

    /* JADX INFO: renamed from: c */
    public final Method f57711c;

    /* JADX INFO: renamed from: d */
    public final Method f57712d;

    /* JADX INFO: renamed from: e */
    public final Method f57713e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException {
        this.f57709a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.m18598f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f57710b = declaredMethod;
        this.f57711c = cls.getMethod("setHostname", String.class);
        this.f57712d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f57713e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public final boolean mo21523a(SSLSocket sSLSocket) {
        return this.f57709a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public final String mo21524b(SSLSocket sSLSocket) {
        if (!this.f57709a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f57712d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.f55167a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.m18594b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public final void mo21525c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
        if (this.f57709a.isInstance(sSLSocket)) {
            try {
                this.f57710b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f57711c.invoke(sSLSocket, str);
                }
                Method method = this.f57713e;
                Platform platform = Platform.f57701a;
                method.invoke(sSLSocket, Platform.Companion.m21522b(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        boolean z2 = AndroidPlatform.f57680e;
        return AndroidPlatform.f57680e;
    }
}
