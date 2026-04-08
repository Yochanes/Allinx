package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/internal/platform/android/ConscryptSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    /* JADX INFO: renamed from: a */
    public final boolean mo21527a(SSLSocket sSLSocket) {
        return ConscryptPlatform.f57687d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    /* JADX INFO: renamed from: b */
    public final SocketAdapter mo21528b(SSLSocket sSLSocket) {
        return new ConscryptSocketAdapter();
    }
}
