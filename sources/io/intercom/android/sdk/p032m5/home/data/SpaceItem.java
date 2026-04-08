package io.intercom.android.sdk.p032m5.home.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/data/SpaceItem;", "", MetricTracker.Object.BADGE, "Lio/intercom/android/sdk/m5/home/data/Badge;", Constants.ScionAnalytics.PARAM_LABEL, "", "type", "Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "<init>", "(Lio/intercom/android/sdk/m5/home/data/Badge;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/SpaceItemType;)V", "getBadge", "()Lio/intercom/android/sdk/m5/home/data/Badge;", "getLabel", "()Ljava/lang/String;", "getType", "()Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SpaceItem {
    public static final int $stable = 0;

    @SerializedName(MetricTracker.Object.BADGE)
    @Nullable
    private final Badge badge;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    @NotNull
    private final String label;

    @SerializedName("type")
    @NotNull
    private final SpaceItemType type;

    public SpaceItem(@Nullable Badge badge, @NotNull String label, @NotNull SpaceItemType type) {
        Intrinsics.m18599g(label, "label");
        Intrinsics.m18599g(type, "type");
        this.badge = badge;
        this.label = label;
        this.type = type;
    }

    public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, Badge badge, String str, SpaceItemType spaceItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            badge = spaceItem.badge;
        }
        if ((i & 2) != 0) {
            str = spaceItem.label;
        }
        if ((i & 4) != 0) {
            spaceItemType = spaceItem.type;
        }
        return spaceItem.copy(badge, str, spaceItemType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SpaceItemType getType() {
        return this.type;
    }

    @NotNull
    public final SpaceItem copy(@Nullable Badge badge, @NotNull String label, @NotNull SpaceItemType type) {
        Intrinsics.m18599g(label, "label");
        Intrinsics.m18599g(type, "type");
        return new SpaceItem(badge, label, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpaceItem)) {
            return false;
        }
        SpaceItem spaceItem = (SpaceItem) other;
        return Intrinsics.m18594b(this.badge, spaceItem.badge) && Intrinsics.m18594b(this.label, spaceItem.label) && this.type == spaceItem.type;
    }

    @Nullable
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final SpaceItemType getType() {
        return this.type;
    }

    public int hashCode() {
        Badge badge = this.badge;
        return this.type.hashCode() + AbstractC0000a.m5b((badge == null ? 0 : badge.hashCode()) * 31, 31, this.label);
    }

    @NotNull
    public String toString() {
        return "SpaceItem(badge=" + this.badge + ", label=" + this.label + ", type=" + this.type + ')';
    }
}
