package retrofit2;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Response<T> {

    /* JADX INFO: renamed from: a */
    public final okhttp3.Response f59450a;

    /* JADX INFO: renamed from: b */
    public final Object f59451b;

    /* JADX INFO: renamed from: c */
    public final ResponseBody$Companion$asResponseBody$1 f59452c;

    public Response(okhttp3.Response response, Object obj, ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        this.f59450a = response;
        this.f59451b = obj;
        this.f59452c = responseBody$Companion$asResponseBody$1;
    }

    /* JADX INFO: renamed from: a */
    public static Response m21883a(NetworkResponse networkResponse) {
        Response.Builder builder = new Response.Builder();
        builder.f57245c = 200;
        builder.f57246d = "OK";
        builder.f57244b = Protocol.HTTP_1_1;
        Request.Builder builder2 = new Request.Builder();
        builder2.m21302g("http://localhost/");
        builder.f57243a = builder2.m21297b();
        return m21884b(networkResponse, builder.m21311a());
    }

    /* JADX INFO: renamed from: b */
    public static Response m21884b(Object obj, okhttp3.Response response) {
        if (response.m21308d()) {
            return new Response(response, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f59450a.toString();
    }
}
