package com.exchange.allin.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesUserPreference;", "", "markets", "", "", "merges", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getMarkets", "()Ljava/util/List;", "getMerges", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesUserPreference {
    public static final int $stable = 8;

    @NotNull
    private final List<String> markets;

    @NotNull
    private final Map<String, String> merges;

    public FuturesUserPreference(@NotNull List<String> markets, @NotNull Map<String, String> merges) {
        Intrinsics.m18599g(markets, "markets");
        Intrinsics.m18599g(merges, "merges");
        this.markets = markets;
        this.merges = merges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesUserPreference copy$default(FuturesUserPreference futuresUserPreference, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = futuresUserPreference.markets;
        }
        if ((i & 2) != 0) {
            map = futuresUserPreference.merges;
        }
        return futuresUserPreference.copy(list, map);
    }

    @NotNull
    public final List<String> component1() {
        return this.markets;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.merges;
    }

    @NotNull
    public final FuturesUserPreference copy(@NotNull List<String> markets, @NotNull Map<String, String> merges) {
        Intrinsics.m18599g(markets, "markets");
        Intrinsics.m18599g(merges, "merges");
        return new FuturesUserPreference(markets, merges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesUserPreference)) {
            return false;
        }
        FuturesUserPreference futuresUserPreference = (FuturesUserPreference) other;
        return Intrinsics.m18594b(this.markets, futuresUserPreference.markets) && Intrinsics.m18594b(this.merges, futuresUserPreference.merges);
    }

    @NotNull
    public final List<String> getMarkets() {
        return this.markets;
    }

    @NotNull
    public final Map<String, String> getMerges() {
        return this.merges;
    }

    public int hashCode() {
        return this.merges.hashCode() + (this.markets.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FuturesUserPreference(markets=" + this.markets + ", merges=" + this.merges + ')';
    }
}
