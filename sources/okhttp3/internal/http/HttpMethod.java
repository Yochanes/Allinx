package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class HttpMethod {
    /* JADX INFO: renamed from: a */
    public static boolean m21432a(String method) {
        Intrinsics.m18599g(method, "method");
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m21433b(String method) {
        Intrinsics.m18599g(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
