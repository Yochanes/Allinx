package io.intercom.android.sdk.p041ui.component;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;", "", "iconRes", "", "contentDescription", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getIconRes", "()I", "getContentDescription", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class IntercomTopBarIcon {
    public static final int $stable = 0;

    @Nullable
    private final String contentDescription;
    private final int iconRes;

    @NotNull
    private final Function0<Unit> onClick;

    public IntercomTopBarIcon(@DrawableRes int i, @Nullable String str, @NotNull Function0<Unit> onClick) {
        Intrinsics.m18599g(onClick, "onClick");
        this.iconRes = i;
        this.contentDescription = str;
        this.onClick = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomTopBarIcon copy$default(IntercomTopBarIcon intercomTopBarIcon, int i, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomTopBarIcon.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = intercomTopBarIcon.contentDescription;
        }
        if ((i2 & 4) != 0) {
            function0 = intercomTopBarIcon.onClick;
        }
        return intercomTopBarIcon.copy(i, str, function0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onClick;
    }

    @NotNull
    public final IntercomTopBarIcon copy(@DrawableRes int iconRes, @Nullable String contentDescription, @NotNull Function0<Unit> onClick) {
        Intrinsics.m18599g(onClick, "onClick");
        return new IntercomTopBarIcon(iconRes, contentDescription, onClick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomTopBarIcon)) {
            return false;
        }
        IntercomTopBarIcon intercomTopBarIcon = (IntercomTopBarIcon) other;
        return this.iconRes == intercomTopBarIcon.iconRes && Intrinsics.m18594b(this.contentDescription, intercomTopBarIcon.contentDescription) && Intrinsics.m18594b(this.onClick, intercomTopBarIcon.onClick);
    }

    @Nullable
    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.iconRes) * 31;
        String str = this.contentDescription;
        return this.onClick.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "IntercomTopBarIcon(iconRes=" + this.iconRes + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }
}
