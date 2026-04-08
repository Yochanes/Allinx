package io.intercom.android.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m18302d2 = {"io/intercom/android/sdk/IntercomStatusCallbackKt$noStatusCallback$1", "Lio/intercom/android/sdk/IntercomStatusCallback;", "onSuccess", "", "onFailure", "intercomError", "Lio/intercom/android/sdk/IntercomError;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomStatusCallbackKt$noStatusCallback$1 implements IntercomStatusCallback {
    @Override // io.intercom.android.sdk.IntercomStatusCallback
    public void onFailure(IntercomError intercomError) {
        Intrinsics.m18599g(intercomError, "intercomError");
    }

    @Override // io.intercom.android.sdk.IntercomStatusCallback
    public void onSuccess() {
    }
}
