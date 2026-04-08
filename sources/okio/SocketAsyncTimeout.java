package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SocketAsyncTimeout extends AsyncTimeout {

    /* JADX INFO: renamed from: m */
    public final Socket f57911m;

    public SocketAsyncTimeout(Socket socket) {
        this.f57911m = socket;
    }

    @Override // okio.AsyncTimeout
    /* JADX INFO: renamed from: k */
    public final IOException mo21484k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    /* JADX INFO: renamed from: l */
    public final void mo21401l() {
        Socket socket = this.f57911m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!Okio.m21672e(e)) {
                throw e;
            }
            Okio__JvmOkioKt.f57879a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            Okio__JvmOkioKt.f57879a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
