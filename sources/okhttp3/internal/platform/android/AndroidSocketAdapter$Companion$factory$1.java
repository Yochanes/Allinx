package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/internal/platform/android/AndroidSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    /* JADX INFO: renamed from: a */
    public final boolean mo21527a(SSLSocket sSLSocket) {
        return StringsKt.m20416N(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    /* JADX INFO: renamed from: b */
    public final SocketAdapter mo21528b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new AndroidSocketAdapter(superclass);
    }
}
