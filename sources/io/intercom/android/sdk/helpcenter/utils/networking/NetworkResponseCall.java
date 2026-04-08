package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "S", "", "Lretrofit2/Call;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "delegate", "<init>", "(Lretrofit2/Call;)V", "enqueue", "", "callback", "Lretrofit2/Callback;", "isExecuted", "", "clone", "kotlin.jvm.PlatformType", "isCanceled", "cancel", "execute", "Lretrofit2/Response;", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NetworkResponseCall<S> implements Call<NetworkResponse<? extends S>> {
    public static final int $stable = 8;

    @NotNull
    private final Call<S> delegate;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall$enqueue$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m18302d2 = {"io/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall$enqueue$1", "Lretrofit2/Callback;", "onResponse", "", "call", "Lretrofit2/Call;", "response", "Lretrofit2/Response;", "onFailure", "throwable", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class C52521 implements Callback<S> {
        final /* synthetic */ Callback<NetworkResponse<S>> $callback;
        final /* synthetic */ NetworkResponseCall<S> this$0;

        public C52521(Callback<NetworkResponse<S>> callback, NetworkResponseCall<S> networkResponseCall) {
            this.$callback = callback;
            this.this$0 = networkResponseCall;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<S> call, Throwable throwable) {
            Intrinsics.m18599g(call, "call");
            Intrinsics.m18599g(throwable, "throwable");
            this.$callback.onResponse(this.this$0, Response.m21883a(throwable instanceof IOException ? new NetworkResponse.NetworkError((IOException) throwable) : new NetworkResponse.ClientError(throwable)));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<S> call, Response<S> response) {
            Intrinsics.m18599g(call, "call");
            Intrinsics.m18599g(response, "response");
            okhttp3.Response response2 = response.f59450a;
            if (!response2.m21308d()) {
                this.$callback.onResponse(this.this$0, Response.m21883a(new NetworkResponse.ServerError(response2.f57232d)));
                return;
            }
            Object obj = response.f59451b;
            if (obj != null) {
                this.$callback.onResponse(this.this$0, Response.m21883a(new NetworkResponse.Success(obj)));
            } else {
                this.$callback.onResponse(this.this$0, Response.m21883a(new NetworkResponse.ClientError(new Throwable())));
            }
        }
    }

    public NetworkResponseCall(@NotNull Call<S> delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.delegate.cancel();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m22095clone() {
        return mo22754clone();
    }

    @Override // retrofit2.Call
    public void enqueue(@NotNull Callback<NetworkResponse<S>> callback) {
        Intrinsics.m18599g(callback, "callback");
        this.delegate.enqueue(new C52521(callback, this));
    }

    @NotNull
    public Response<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.Call
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // retrofit2.Call
    @NotNull
    public Request request() {
        Request request = this.delegate.request();
        Intrinsics.m18598f(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    @NotNull
    public Timeout timeout() {
        Timeout timeout = this.delegate.timeout();
        Intrinsics.m18598f(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Call mo22754clone() {
        return mo22754clone();
    }

    @Override // retrofit2.Call
    @NotNull
    /* JADX INFO: renamed from: clone */
    public NetworkResponseCall<S> mo22754clone() {
        Call callMo22754clone = this.delegate.mo22754clone();
        Intrinsics.m18598f(callMo22754clone, "clone(...)");
        return new NetworkResponseCall<>(callMo22754clone);
    }
}
