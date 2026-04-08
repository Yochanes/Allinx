package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final BouncyCastleSocketAdapter$Companion$factory$1 f57714a = new BouncyCastleSocketAdapter$Companion$factory$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public final boolean mo21523a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public final String mo21524b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public final void mo21525c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
        if (mo21523a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform platform = Platform.f57701a;
            parameters.setApplicationProtocols((String[]) Platform.Companion.m21521a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        boolean z2 = BouncyCastlePlatform.f57685d;
        return BouncyCastlePlatform.f57685d;
    }
}
