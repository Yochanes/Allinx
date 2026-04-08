package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.os.Build;
import com.google.android.material.snackbar.AbstractC3999a;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"NewApi"})
@SourceDebugExtension
public final class Android10SocketAdapter implements SocketAdapter {

    /* JADX INFO: compiled from: Proguard */
    @SuppressSignatureCheck
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public final boolean mo21523a(SSLSocket sSLSocket) {
        return AbstractC0020a.m58l(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public final String mo21524b(SSLSocket sSLSocket) {
        String strM14726f = AbstractC3999a.m14726f(sSLSocket);
        if (strM14726f == null ? true : strM14726f.equals("")) {
            return null;
        }
        return strM14726f;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public final void mo21525c(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        Intrinsics.m18599g(protocols, "protocols");
        try {
            AbstractC0020a.m56j(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Platform platform = Platform.f57701a;
            AbstractC3999a.m14729i(sSLParameters, (String[]) Platform.Companion.m21521a(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        Platform platform = Platform.f57701a;
        return "Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }
}
