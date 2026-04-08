package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapter;", "S", "", "Lretrofit2/CallAdapter;", "Lretrofit2/Call;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "successType", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "responseType", "adapt", "call", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NetworkResponseAdapter<S> implements CallAdapter<S, Call<NetworkResponse<? extends S>>> {
    public static final int $stable = 8;

    @NotNull
    private final Type successType;

    public NetworkResponseAdapter(@NotNull Type successType) {
        Intrinsics.m18599g(successType, "successType");
        this.successType = successType;
    }

    @Override // retrofit2.CallAdapter
    public /* bridge */ /* synthetic */ Object adapt(Call call) {
        return adapt(call);
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public Type getSuccessType() {
        return this.successType;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public Call<NetworkResponse<S>> adapt(@NotNull Call<S> call) {
        Intrinsics.m18599g(call, "call");
        return new NetworkResponseCall(call);
    }
}
