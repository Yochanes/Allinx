package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lcom/exchange/allin/data/SpotWsTickerDepth;", "", "data", "Lcom/exchange/allin/data/SpotTickerDepth;", "merge", "", "<init>", "(Lcom/exchange/allin/data/SpotTickerDepth;Ljava/lang/String;)V", "getData", "()Lcom/exchange/allin/data/SpotTickerDepth;", "getMerge", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotWsTickerDepth {
    public static final int $stable = 8;

    @NotNull
    private final SpotTickerDepth data;

    @NotNull
    private final String merge;

    public SpotWsTickerDepth(@NotNull SpotTickerDepth data, @NotNull String merge) {
        Intrinsics.m18599g(data, "data");
        Intrinsics.m18599g(merge, "merge");
        this.data = data;
        this.merge = merge;
    }

    public static /* synthetic */ SpotWsTickerDepth copy$default(SpotWsTickerDepth spotWsTickerDepth, SpotTickerDepth spotTickerDepth, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            spotTickerDepth = spotWsTickerDepth.data;
        }
        if ((i & 2) != 0) {
            str = spotWsTickerDepth.merge;
        }
        return spotWsTickerDepth.copy(spotTickerDepth, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SpotTickerDepth getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerge() {
        return this.merge;
    }

    @NotNull
    public final SpotWsTickerDepth copy(@NotNull SpotTickerDepth data, @NotNull String merge) {
        Intrinsics.m18599g(data, "data");
        Intrinsics.m18599g(merge, "merge");
        return new SpotWsTickerDepth(data, merge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotWsTickerDepth)) {
            return false;
        }
        SpotWsTickerDepth spotWsTickerDepth = (SpotWsTickerDepth) other;
        return Intrinsics.m18594b(this.data, spotWsTickerDepth.data) && Intrinsics.m18594b(this.merge, spotWsTickerDepth.merge);
    }

    @NotNull
    public final SpotTickerDepth getData() {
        return this.data;
    }

    @NotNull
    public final String getMerge() {
        return this.merge;
    }

    public int hashCode() {
        return this.merge.hashCode() + (this.data.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotWsTickerDepth(data=");
        sb.append(this.data);
        sb.append(", merge=");
        return AbstractC0455a.m2241p(sb, this.merge, ')');
    }
}
