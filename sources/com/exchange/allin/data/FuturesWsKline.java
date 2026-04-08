package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesWsKline;", "", "period", "", "data", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPeriod", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesWsKline {
    public static final int $stable = 8;

    @NotNull
    private final List<List<String>> data;

    @NotNull
    private final String period;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesWsKline(@NotNull String period, @NotNull List<? extends List<String>> data) {
        Intrinsics.m18599g(period, "period");
        Intrinsics.m18599g(data, "data");
        this.period = period;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWsKline copy$default(FuturesWsKline futuresWsKline, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresWsKline.period;
        }
        if ((i & 2) != 0) {
            list = futuresWsKline.data;
        }
        return futuresWsKline.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @NotNull
    public final List<List<String>> component2() {
        return this.data;
    }

    @NotNull
    public final FuturesWsKline copy(@NotNull String period, @NotNull List<? extends List<String>> data) {
        Intrinsics.m18599g(period, "period");
        Intrinsics.m18599g(data, "data");
        return new FuturesWsKline(period, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWsKline)) {
            return false;
        }
        FuturesWsKline futuresWsKline = (FuturesWsKline) other;
        return Intrinsics.m18594b(this.period, futuresWsKline.period) && Intrinsics.m18594b(this.data, futuresWsKline.data);
    }

    @NotNull
    public final List<List<String>> getData() {
        return this.data;
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.period.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesWsKline(period=");
        sb.append(this.period);
        sb.append(", data=");
        return AbstractC0455a.m2242q(sb, this.data, ')');
    }
}
