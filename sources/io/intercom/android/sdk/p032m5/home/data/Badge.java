package io.intercom.android.sdk.p032m5.home.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/data/Badge;", "", "badgeType", "Lio/intercom/android/sdk/m5/home/data/BadgeType;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Lio/intercom/android/sdk/m5/home/data/BadgeType;Ljava/lang/String;)V", "getBadgeType", "()Lio/intercom/android/sdk/m5/home/data/BadgeType;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Badge {
    public static final int $stable = 0;

    @SerializedName("badge_type")
    @NotNull
    private final BadgeType badgeType;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    @Nullable
    private final String label;

    public Badge(@NotNull BadgeType badgeType, @Nullable String str) {
        Intrinsics.m18599g(badgeType, "badgeType");
        this.badgeType = badgeType;
        this.label = str;
    }

    public static /* synthetic */ Badge copy$default(Badge badge, BadgeType badgeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            badgeType = badge.badgeType;
        }
        if ((i & 2) != 0) {
            str = badge.label;
        }
        return badge.copy(badgeType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Badge copy(@NotNull BadgeType badgeType, @Nullable String label) {
        Intrinsics.m18599g(badgeType, "badgeType");
        return new Badge(badgeType, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) other;
        return this.badgeType == badge.badgeType && Intrinsics.m18594b(this.label, badge.label);
    }

    @NotNull
    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.badgeType.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Badge(badgeType=");
        sb.append(this.badgeType);
        sb.append(", label=");
        return AbstractC0455a.m2241p(sb, this.label, ')');
    }
}
