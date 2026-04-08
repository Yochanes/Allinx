package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "", "Connected", "Disconnected", "Reconnected", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Connected;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Disconnected;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Reconnected;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface NetworkState {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Connected;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Connected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Connected INSTANCE = new Connected();

        private Connected() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Disconnected;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Disconnected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/NetworkState$Reconnected;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Reconnected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Reconnected INSTANCE = new Reconnected();

        private Reconnected() {
        }
    }
}
