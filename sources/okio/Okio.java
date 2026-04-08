package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt", "okio/Okio__ZlibOkioKt"}, m18303k = 4, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Okio {
    /* JADX INFO: renamed from: a */
    public static final Sink m21668a(File file) {
        Logger logger = Okio__JvmOkioKt.f57879a;
        Intrinsics.m18599g(file, "<this>");
        return new OutputStreamSink(new FileOutputStream(file, true), new Timeout());
    }

    /* JADX INFO: renamed from: b */
    public static final Sink m21669b() {
        return new BlackholeSink();
    }

    /* JADX INFO: renamed from: c */
    public static final RealBufferedSink m21670c(Sink sink) {
        Intrinsics.m18599g(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    /* JADX INFO: renamed from: d */
    public static final RealBufferedSource m21671d(Source source) {
        Intrinsics.m18599g(source, "<this>");
        return new RealBufferedSource(source);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m21672e(AssertionError assertionError) {
        Logger logger = Okio__JvmOkioKt.f57879a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.m20434j(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final AsyncTimeout$sink$1 m21673f(Socket socket) throws IOException {
        Logger logger = Okio__JvmOkioKt.f57879a;
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.m18598f(outputStream, "getOutputStream(...)");
        return new AsyncTimeout$sink$1(socketAsyncTimeout, new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    /* JADX INFO: renamed from: g */
    public static Sink m21674g(File file) {
        Logger logger = Okio__JvmOkioKt.f57879a;
        Intrinsics.m18599g(file, "<this>");
        return new OutputStreamSink(new FileOutputStream(file, false), new Timeout());
    }

    /* JADX INFO: renamed from: h */
    public static final AsyncTimeout$source$1 m21675h(Socket socket) throws IOException {
        Logger logger = Okio__JvmOkioKt.f57879a;
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.m18598f(inputStream, "getInputStream(...)");
        return new AsyncTimeout$source$1(socketAsyncTimeout, new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    /* JADX INFO: renamed from: i */
    public static final Source m21676i(File file) {
        Logger logger = Okio__JvmOkioKt.f57879a;
        Intrinsics.m18599g(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.f57912d);
    }

    /* JADX INFO: renamed from: j */
    public static final Source m21677j(InputStream inputStream) {
        Logger logger = Okio__JvmOkioKt.f57879a;
        Intrinsics.m18599g(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }
}
