package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m18302d2 = {"canStartNewConversation", "", "Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(@NotNull AppConfig appConfig) {
        Intrinsics.m18599g(appConfig, "<this>");
        boolean zIsInboundMessages = appConfig.isInboundMessages();
        return appConfig.isPreventMultipleInboundConversationsEnabled() ? zIsInboundMessages && !appConfig.getHasOpenConversations() : zIsInboundMessages;
    }
}
