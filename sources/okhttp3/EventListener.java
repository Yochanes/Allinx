package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/EventListener;", "", "Companion", "Factory", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class EventListener {

    /* JADX INFO: renamed from: a */
    public static final EventListener$Companion$NONE$1 f57093a = new EventListener$Companion$NONE$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/EventListener$Companion;", "", "Lokhttp3/EventListener;", "NONE", "Lokhttp3/EventListener;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/EventListener$Factory;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Factory {
    }

    /* JADX INFO: renamed from: A */
    public void mo21208A(Call call, Response response) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: B */
    public void mo21209B(Call call, Handshake handshake) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: C */
    public void mo21210C(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: a */
    public void mo21211a(Call call, Response cachedResponse) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(cachedResponse, "cachedResponse");
    }

    /* JADX INFO: renamed from: b */
    public void mo21212b(Call call, Response response) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: c */
    public void mo21213c(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: h */
    public void mo21218h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(inetSocketAddress, "inetSocketAddress");
    }

    /* JADX INFO: renamed from: i */
    public void mo21219i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(inetSocketAddress, "inetSocketAddress");
    }

    /* JADX INFO: renamed from: j */
    public void mo21220j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(inetSocketAddress, "inetSocketAddress");
    }

    /* JADX INFO: renamed from: k */
    public void mo21221k(Call call, Connection connection) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(connection, "connection");
    }

    /* JADX INFO: renamed from: l */
    public void mo21222l(Call call, Connection connection) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(connection, "connection");
    }

    /* JADX INFO: renamed from: m */
    public void mo21223m(Call call, String str, List list) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: n */
    public void mo21224n(Call call, String str) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: o */
    public void mo21225o(Call call, HttpUrl url, List list) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(url, "url");
    }

    /* JADX INFO: renamed from: p */
    public void mo21226p(Call call, HttpUrl url) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(url, "url");
    }

    /* JADX INFO: renamed from: q */
    public void mo21227q(Call call, long j) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: r */
    public void mo21228r(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: s */
    public void mo21229s(Call call, IOException ioe) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(ioe, "ioe");
    }

    /* JADX INFO: renamed from: t */
    public void mo21230t(Call call, Request request) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(request, "request");
    }

    /* JADX INFO: renamed from: u */
    public void mo21231u(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: v */
    public void mo21232v(Call call, long j) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: w */
    public void mo21233w(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: x */
    public void mo21234x(Call call, IOException ioe) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(ioe, "ioe");
    }

    /* JADX INFO: renamed from: y */
    public void mo21235y(Call call, Response response) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: z */
    public void mo21236z(Call call) {
        Intrinsics.m18599g(call, "call");
    }

    /* JADX INFO: renamed from: d */
    public void mo21214d(RealCall realCall) {
    }

    /* JADX INFO: renamed from: f */
    public void mo21216f(RealCall realCall) {
    }

    /* JADX INFO: renamed from: g */
    public void mo21217g(RealCall realCall) {
    }

    /* JADX INFO: renamed from: e */
    public void mo21215e(RealCall realCall, IOException iOException) {
    }
}
