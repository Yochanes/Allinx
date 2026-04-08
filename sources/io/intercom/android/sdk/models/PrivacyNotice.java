package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/models/PrivacyNotice;", "", "isDismissed", "", AttributeType.TEXT, "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class PrivacyNotice {
    public static final int $stable = 0;

    @SerializedName("is_dismissed")
    private final boolean isDismissed;

    @SerializedName("paragraph")
    @NotNull
    private final String text;

    public PrivacyNotice(boolean z2, @NotNull String text) {
        Intrinsics.m18599g(text, "text");
        this.isDismissed = z2;
        this.text = text;
    }

    public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = privacyNotice.isDismissed;
        }
        if ((i & 2) != 0) {
            str = privacyNotice.text;
        }
        return privacyNotice.copy(z2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final PrivacyNotice copy(boolean isDismissed, @NotNull String text) {
        Intrinsics.m18599g(text, "text");
        return new PrivacyNotice(isDismissed, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyNotice)) {
            return false;
        }
        PrivacyNotice privacyNotice = (PrivacyNotice) other;
        return this.isDismissed == privacyNotice.isDismissed && Intrinsics.m18594b(this.text, privacyNotice.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (Boolean.hashCode(this.isDismissed) * 31);
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PrivacyNotice(isDismissed=");
        sb.append(this.isDismissed);
        sb.append(", text=");
        return AbstractC0455a.m2241p(sb, this.text, ')');
    }
}
