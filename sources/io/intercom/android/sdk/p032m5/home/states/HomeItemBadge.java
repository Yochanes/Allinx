package io.intercom.android.sdk.p032m5.home.states;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "", "None", "IconWithIndicator", "IndicatorWithCount", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IconWithIndicator;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IndicatorWithCount;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$None;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface HomeItemBadge {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IconWithIndicator;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class IconWithIndicator implements HomeItemBadge {
        public static final int $stable = 0;

        @NotNull
        public static final IconWithIndicator INSTANCE = new IconWithIndicator();

        private IconWithIndicator() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IndicatorWithCount;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", MTPushConstants.Geofence.KEY_COUNT, "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class IndicatorWithCount implements HomeItemBadge {
        public static final int $stable = 0;
        private final int count;

        public IndicatorWithCount(int i) {
            this.count = i;
        }

        public static /* synthetic */ IndicatorWithCount copy$default(IndicatorWithCount indicatorWithCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indicatorWithCount.count;
            }
            return indicatorWithCount.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final IndicatorWithCount copy(int count) {
            return new IndicatorWithCount(count);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IndicatorWithCount) && this.count == ((IndicatorWithCount) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        @NotNull
        public String toString() {
            return AbstractC0000a.m17n(new StringBuilder("IndicatorWithCount(count="), this.count, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$None;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class None implements HomeItemBadge {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}
