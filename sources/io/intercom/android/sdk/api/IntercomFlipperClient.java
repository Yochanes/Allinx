package io.intercom.android.sdk.api;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/api/IntercomFlipperClient;", "", "<init>", "()V", "addInterceptor", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "context", "Landroid/content/Context;", "addDefaultFlipperInterceptor", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomFlipperClient {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomFlipperClient INSTANCE = new IntercomFlipperClient();

    private IntercomFlipperClient() {
    }

    public final void addDefaultFlipperInterceptor(@NotNull OkHttpClient.Builder builder, @NotNull Context context) {
        Intrinsics.m18599g(builder, "builder");
        Intrinsics.m18599g(context, "context");
    }

    public final void addInterceptor(@NotNull OkHttpClient.Builder builder, @NotNull Context context) {
        Intrinsics.m18599g(builder, "builder");
        Intrinsics.m18599g(context, "context");
    }
}
