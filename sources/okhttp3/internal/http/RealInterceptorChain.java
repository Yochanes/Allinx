package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a */
    public final RealCall f57474a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f57475b;

    /* JADX INFO: renamed from: c */
    public final int f57476c;

    /* JADX INFO: renamed from: d */
    public final Exchange f57477d;

    /* JADX INFO: renamed from: e */
    public final Request f57478e;

    /* JADX INFO: renamed from: f */
    public final int f57479f;

    /* JADX INFO: renamed from: g */
    public final int f57480g;

    /* JADX INFO: renamed from: h */
    public final int f57481h;

    /* JADX INFO: renamed from: i */
    public int f57482i;

    public RealInterceptorChain(RealCall call, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        Intrinsics.m18599g(call, "call");
        Intrinsics.m18599g(request, "request");
        this.f57474a = call;
        this.f57475b = arrayList;
        this.f57476c = i;
        this.f57477d = exchange;
        this.f57478e = request;
        this.f57479f = i2;
        this.f57480g = i3;
        this.f57481h = i4;
    }

    /* JADX INFO: renamed from: b */
    public static RealInterceptorChain m21434b(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.f57476c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            exchange = realInterceptorChain.f57477d;
        }
        Exchange exchange2 = exchange;
        if ((i2 & 4) != 0) {
            request = realInterceptorChain.f57478e;
        }
        Request request2 = request;
        Intrinsics.m18599g(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f57474a, realInterceptorChain.f57475b, i3, exchange2, request2, realInterceptorChain.f57479f, realInterceptorChain.f57480g, realInterceptorChain.f57481h);
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: a */
    public final Response mo21281a(Request request) {
        Intrinsics.m18599g(request, "request");
        ArrayList arrayList = this.f57475b;
        int size = arrayList.size();
        int i = this.f57476c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f57482i++;
        Exchange exchange = this.f57477d;
        if (exchange != null) {
            if (!exchange.f57378c.m21391b(request.f57210a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f57482i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainM21434b = m21434b(this, i2, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseIntercept = interceptor.intercept(realInterceptorChainM21434b);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i2 < arrayList.size() && realInterceptorChainM21434b.f57482i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.f57235i != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: request, reason: from getter */
    public final Request getF57478e() {
        return this.f57478e;
    }
}
