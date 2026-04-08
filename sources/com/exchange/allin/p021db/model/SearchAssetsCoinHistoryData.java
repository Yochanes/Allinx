package com.exchange.allin.p021db.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m18302d2 = {"Lcom/exchange/allin/db/model/SearchAssetsCoinHistoryData;", "", "coinName", "", "id", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getCoinName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/exchange/allin/db/model/SearchAssetsCoinHistoryData;", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@Entity
@IgnoredOnProguard
public final /* data */ class SearchAssetsCoinHistoryData {
    public static final int $stable = 8;

    @ColumnInfo
    @NotNull
    private final String coinName;

    @PrimaryKey
    @Nullable
    private Integer id;

    public SearchAssetsCoinHistoryData() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SearchAssetsCoinHistoryData copy$default(SearchAssetsCoinHistoryData searchAssetsCoinHistoryData, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchAssetsCoinHistoryData.coinName;
        }
        if ((i & 2) != 0) {
            num = searchAssetsCoinHistoryData.id;
        }
        return searchAssetsCoinHistoryData.copy(str, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @NotNull
    public final SearchAssetsCoinHistoryData copy(@NotNull String coinName, @Nullable Integer id) {
        Intrinsics.m18599g(coinName, "coinName");
        return new SearchAssetsCoinHistoryData(coinName, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAssetsCoinHistoryData)) {
            return false;
        }
        SearchAssetsCoinHistoryData searchAssetsCoinHistoryData = (SearchAssetsCoinHistoryData) other;
        return Intrinsics.m18594b(this.coinName, searchAssetsCoinHistoryData.coinName) && Intrinsics.m18594b(this.id, searchAssetsCoinHistoryData.id);
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.coinName.hashCode() * 31;
        Integer num = this.id;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    @NotNull
    public String toString() {
        return "SearchAssetsCoinHistoryData(coinName=" + this.coinName + ", id=" + this.id + ')';
    }

    public SearchAssetsCoinHistoryData(@NotNull String coinName, @Nullable Integer num) {
        Intrinsics.m18599g(coinName, "coinName");
        this.coinName = coinName;
        this.id = num;
    }

    public /* synthetic */ SearchAssetsCoinHistoryData(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
    }
}
