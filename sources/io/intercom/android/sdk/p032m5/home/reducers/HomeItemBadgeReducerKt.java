package io.intercom.android.sdk.p032m5.home.reducers;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.p032m5.home.data.Badge;
import io.intercom.android.sdk.p032m5.home.data.BadgeType;
import io.intercom.android.sdk.p032m5.home.states.HomeItemBadge;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m18302d2 = {"reduceHomeItemBadge", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", MetricTracker.Object.BADGE, "Lio/intercom/android/sdk/m5/home/data/Badge;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class HomeItemBadgeReducerKt {
    @NotNull
    public static final HomeItemBadge reduceHomeItemBadge(@Nullable Badge badge) {
        return badge == null ? HomeItemBadge.None.INSTANCE : badge.getBadgeType() == BadgeType.PASSIVE ? HomeItemBadge.IconWithIndicator.INSTANCE : (badge.getBadgeType() != BadgeType.UNREAD || badge.getLabel() == null) ? HomeItemBadge.None.INSTANCE : new HomeItemBadge.IndicatorWithCount(Integer.parseInt(badge.getLabel()));
    }
}
