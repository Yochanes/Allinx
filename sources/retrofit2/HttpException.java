package retrofit2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    public HttpException(Response response) {
        StringBuilder sb = new StringBuilder("HTTP ");
        okhttp3.Response response2 = response.f59450a;
        sb.append(response2.f57232d);
        sb.append(" ");
        sb.append(response2.f57231c);
        super(sb.toString());
    }
}
