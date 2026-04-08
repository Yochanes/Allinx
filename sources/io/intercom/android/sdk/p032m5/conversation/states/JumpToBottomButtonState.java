package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "", "unreadMessages", "", "scrollToPosition", "lastSeenItemIndex", "<init>", "(III)V", "getUnreadMessages", "()I", "getScrollToPosition", "getLastSeenItemIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class JumpToBottomButtonState {
    public static final int $stable = 0;
    public static final int UNKNOWN_SCROLL_TO_POSITION = -1;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final int unreadMessages;

    public JumpToBottomButtonState() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ JumpToBottomButtonState copy$default(JumpToBottomButtonState jumpToBottomButtonState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = jumpToBottomButtonState.unreadMessages;
        }
        if ((i4 & 2) != 0) {
            i2 = jumpToBottomButtonState.scrollToPosition;
        }
        if ((i4 & 4) != 0) {
            i3 = jumpToBottomButtonState.lastSeenItemIndex;
        }
        return jumpToBottomButtonState.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    @NotNull
    public final JumpToBottomButtonState copy(int unreadMessages, int scrollToPosition, int lastSeenItemIndex) {
        return new JumpToBottomButtonState(unreadMessages, scrollToPosition, lastSeenItemIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumpToBottomButtonState)) {
            return false;
        }
        JumpToBottomButtonState jumpToBottomButtonState = (JumpToBottomButtonState) other;
        return this.unreadMessages == jumpToBottomButtonState.unreadMessages && this.scrollToPosition == jumpToBottomButtonState.scrollToPosition && this.lastSeenItemIndex == jumpToBottomButtonState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + AbstractC0455a.m2228c(this.scrollToPosition, Integer.hashCode(this.unreadMessages) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("JumpToBottomButtonState(unreadMessages=");
        sb.append(this.unreadMessages);
        sb.append(", scrollToPosition=");
        sb.append(this.scrollToPosition);
        sb.append(", lastSeenItemIndex=");
        return AbstractC0000a.m17n(sb, this.lastSeenItemIndex, ')');
    }

    public JumpToBottomButtonState(int i, int i2, int i3) {
        this.unreadMessages = i;
        this.scrollToPosition = i2;
        this.lastSeenItemIndex = i3;
    }

    public /* synthetic */ JumpToBottomButtonState(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
