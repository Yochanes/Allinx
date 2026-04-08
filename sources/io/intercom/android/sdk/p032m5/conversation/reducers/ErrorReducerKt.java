package io.intercom.android.sdk.p032m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.p032m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.p032m5.conversation.states.TopAppBarUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m18302d2 = {"reduceError", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "networkResponse", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ErrorReducerKt {
    @NotNull
    public static final ConversationUiState reduceError(@NotNull NetworkResponse<? extends Object> networkResponse, @NotNull TopAppBarUiState topAppBarUiState) {
        Intrinsics.m18599g(networkResponse, "networkResponse");
        Intrinsics.m18599g(topAppBarUiState, "topAppBarUiState");
        return ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) ? new ConversationUiState.Error(false, topAppBarUiState) : new ConversationUiState.Error(true, topAppBarUiState);
    }
}
