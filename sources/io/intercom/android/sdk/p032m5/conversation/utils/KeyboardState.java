package io.intercom.android.sdk.p032m5.conversation.utils;

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
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "", "isAnimating", "", "bottomDiff", "", "isVisible", "isDismissed", "keyboardHeight", "<init>", "(ZIZZI)V", "()Z", "getBottomDiff", "()I", "getKeyboardHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class KeyboardState {
    public static final int $stable = 0;
    private final int bottomDiff;
    private final boolean isAnimating;
    private final boolean isDismissed;
    private final boolean isVisible;
    private final int keyboardHeight;

    public KeyboardState() {
        this(false, 0, false, false, 0, 31, null);
    }

    public static /* synthetic */ KeyboardState copy$default(KeyboardState keyboardState, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = keyboardState.isAnimating;
        }
        if ((i3 & 2) != 0) {
            i = keyboardState.bottomDiff;
        }
        if ((i3 & 4) != 0) {
            z3 = keyboardState.isVisible;
        }
        if ((i3 & 8) != 0) {
            z4 = keyboardState.isDismissed;
        }
        if ((i3 & 16) != 0) {
            i2 = keyboardState.keyboardHeight;
        }
        int i4 = i2;
        boolean z5 = z3;
        return keyboardState.copy(z2, i, z5, z4, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    @NotNull
    public final KeyboardState copy(boolean isAnimating, int bottomDiff, boolean isVisible, boolean isDismissed, int keyboardHeight) {
        return new KeyboardState(isAnimating, bottomDiff, isVisible, isDismissed, keyboardHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardState)) {
            return false;
        }
        KeyboardState keyboardState = (KeyboardState) other;
        return this.isAnimating == keyboardState.isAnimating && this.bottomDiff == keyboardState.bottomDiff && this.isVisible == keyboardState.isVisible && this.isDismissed == keyboardState.isDismissed && this.keyboardHeight == keyboardState.keyboardHeight;
    }

    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.keyboardHeight) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.bottomDiff, Boolean.hashCode(this.isAnimating) * 31, 31), 31, this.isVisible), 31, this.isDismissed);
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("KeyboardState(isAnimating=");
        sb.append(this.isAnimating);
        sb.append(", bottomDiff=");
        sb.append(this.bottomDiff);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", isDismissed=");
        sb.append(this.isDismissed);
        sb.append(", keyboardHeight=");
        return AbstractC0000a.m17n(sb, this.keyboardHeight, ')');
    }

    public KeyboardState(boolean z2, int i, boolean z3, boolean z4, int i2) {
        this.isAnimating = z2;
        this.bottomDiff = i;
        this.isVisible = z3;
        this.isDismissed = z4;
        this.keyboardHeight = i2;
    }

    public /* synthetic */ KeyboardState(boolean z2, int i, boolean z3, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? 0 : i2);
    }
}
