package io.intercom.android.sdk.p032m5.conversation.usecase;

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
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "", "scrolled", "", "scrollToPosition", "", "isLandscape", "isLargeFont", "lastSeenItemIndex", "<init>", "(ZIZZI)V", "getScrolled", "()Z", "getScrollToPosition", "()I", "getLastSeenItemIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final boolean scrolled;

    public ConversationScrolledState(boolean z2, int i, boolean z3, boolean z4, int i2) {
        this.scrolled = z2;
        this.scrollToPosition = i;
        this.isLandscape = z3;
        this.isLargeFont = z4;
        this.lastSeenItemIndex = i2;
    }

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = conversationScrolledState.scrolled;
        }
        if ((i3 & 2) != 0) {
            i = conversationScrolledState.scrollToPosition;
        }
        if ((i3 & 4) != 0) {
            z3 = conversationScrolledState.isLandscape;
        }
        if ((i3 & 8) != 0) {
            z4 = conversationScrolledState.isLargeFont;
        }
        if ((i3 & 16) != 0) {
            i2 = conversationScrolledState.lastSeenItemIndex;
        }
        int i4 = i2;
        boolean z5 = z3;
        return conversationScrolledState.copy(z2, i, z5, z4, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getScrolled() {
        return this.scrolled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLandscape() {
        return this.isLandscape;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLargeFont() {
        return this.isLargeFont;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    @NotNull
    public final ConversationScrolledState copy(boolean scrolled, int scrollToPosition, boolean isLandscape, boolean isLargeFont, int lastSeenItemIndex) {
        return new ConversationScrolledState(scrolled, scrollToPosition, isLandscape, isLargeFont, lastSeenItemIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) other;
        return this.scrolled == conversationScrolledState.scrolled && this.scrollToPosition == conversationScrolledState.scrollToPosition && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.scrollToPosition, Boolean.hashCode(this.scrolled) * 31, 31), 31, this.isLandscape), 31, this.isLargeFont);
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationScrolledState(scrolled=");
        sb.append(this.scrolled);
        sb.append(", scrollToPosition=");
        sb.append(this.scrollToPosition);
        sb.append(", isLandscape=");
        sb.append(this.isLandscape);
        sb.append(", isLargeFont=");
        sb.append(this.isLargeFont);
        sb.append(", lastSeenItemIndex=");
        return AbstractC0000a.m17n(sb, this.lastSeenItemIndex, ')');
    }

    public /* synthetic */ ConversationScrolledState(boolean z2, int i, boolean z3, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i, z3, z4, (i3 & 16) != 0 ? 0 : i2);
    }
}
