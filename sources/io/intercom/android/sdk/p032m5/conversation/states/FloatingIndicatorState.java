package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "", "JumpToBottomIndicator", "FooterNoticeIndicator", "None", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$FooterNoticeIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$JumpToBottomIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$None;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface FloatingIndicatorState {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$FooterNoticeIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "footerNoticeState", "Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;)V", "getFooterNoticeState", "()Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class FooterNoticeIndicator implements FloatingIndicatorState {
        public static final int $stable = 8;

        @NotNull
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeIndicator(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.m18599g(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeIndicator copy$default(FooterNoticeIndicator footerNoticeIndicator, FooterNoticeState footerNoticeState, int i, Object obj) {
            if ((i & 1) != 0) {
                footerNoticeState = footerNoticeIndicator.footerNoticeState;
            }
            return footerNoticeIndicator.copy(footerNoticeState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        @NotNull
        public final FooterNoticeIndicator copy(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.m18599g(footerNoticeState, "footerNoticeState");
            return new FooterNoticeIndicator(footerNoticeState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FooterNoticeIndicator) && Intrinsics.m18594b(this.footerNoticeState, ((FooterNoticeIndicator) other).footerNoticeState);
        }

        @NotNull
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        @NotNull
        public String toString() {
            return "FooterNoticeIndicator(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$JumpToBottomIndicator;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "jumpToBottomButtonState", "Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;)V", "getJumpToBottomButtonState", "()Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class JumpToBottomIndicator implements FloatingIndicatorState {
        public static final int $stable = 0;

        @NotNull
        private final JumpToBottomButtonState jumpToBottomButtonState;

        public JumpToBottomIndicator(@NotNull JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.m18599g(jumpToBottomButtonState, "jumpToBottomButtonState");
            this.jumpToBottomButtonState = jumpToBottomButtonState;
        }

        public static /* synthetic */ JumpToBottomIndicator copy$default(JumpToBottomIndicator jumpToBottomIndicator, JumpToBottomButtonState jumpToBottomButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                jumpToBottomButtonState = jumpToBottomIndicator.jumpToBottomButtonState;
            }
            return jumpToBottomIndicator.copy(jumpToBottomButtonState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        @NotNull
        public final JumpToBottomIndicator copy(@NotNull JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.m18599g(jumpToBottomButtonState, "jumpToBottomButtonState");
            return new JumpToBottomIndicator(jumpToBottomButtonState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JumpToBottomIndicator) && Intrinsics.m18594b(this.jumpToBottomButtonState, ((JumpToBottomIndicator) other).jumpToBottomButtonState);
        }

        @NotNull
        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        public int hashCode() {
            return this.jumpToBottomButtonState.hashCode();
        }

        @NotNull
        public String toString() {
            return "JumpToBottomIndicator(jumpToBottomButtonState=" + this.jumpToBottomButtonState + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState$None;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class None implements FloatingIndicatorState {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 1010280075;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }
}
