package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "", "<init>", "()V", "ShowUploadSizeLimitDialog", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$ShowUploadSizeLimitDialog;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ConversationUiEffect {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$ShowUploadSizeLimitDialog;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "uploadSizeLimitMB", "", "<init>", "(Ljava/lang/String;)V", "getUploadSizeLimitMB", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ShowUploadSizeLimitDialog extends ConversationUiEffect {
        public static final int $stable = 0;

        @NotNull
        private final String uploadSizeLimitMB;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadSizeLimitDialog(@NotNull String uploadSizeLimitMB) {
            super(null);
            Intrinsics.m18599g(uploadSizeLimitMB, "uploadSizeLimitMB");
            this.uploadSizeLimitMB = uploadSizeLimitMB;
        }

        public static /* synthetic */ ShowUploadSizeLimitDialog copy$default(ShowUploadSizeLimitDialog showUploadSizeLimitDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showUploadSizeLimitDialog.uploadSizeLimitMB;
            }
            return showUploadSizeLimitDialog.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        @NotNull
        public final ShowUploadSizeLimitDialog copy(@NotNull String uploadSizeLimitMB) {
            Intrinsics.m18599g(uploadSizeLimitMB, "uploadSizeLimitMB");
            return new ShowUploadSizeLimitDialog(uploadSizeLimitMB);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowUploadSizeLimitDialog) && Intrinsics.m18594b(this.uploadSizeLimitMB, ((ShowUploadSizeLimitDialog) other).uploadSizeLimitMB);
        }

        @NotNull
        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        public int hashCode() {
            return this.uploadSizeLimitMB.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("ShowUploadSizeLimitDialog(uploadSizeLimitMB="), this.uploadSizeLimitMB, ')');
        }
    }

    public /* synthetic */ ConversationUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationUiEffect() {
    }
}
