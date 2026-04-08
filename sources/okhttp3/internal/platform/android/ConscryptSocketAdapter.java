package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final ConscryptSocketAdapter$Companion$factory$1 f57718a = new ConscryptSocketAdapter$Companion$factory$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public final boolean mo21523a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public final String mo21524b(SSLSocket sSLSocket) {
        if (mo21523a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public final void mo21525c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.m18599g(protocols, "protocols");
        if (mo21523a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform platform = Platform.f57701a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.m21521a(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        boolean z2 = ConscryptPlatform.f57687d;
        return ConscryptPlatform.f57687d;
    }
}
