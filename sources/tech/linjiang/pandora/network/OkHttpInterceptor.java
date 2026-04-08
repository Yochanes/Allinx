package tech.linjiang.pandora.network;

import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return realInterceptorChain.mo21281a(realInterceptorChain.f57478e);
    }
}
