package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m18302d2 = {"Lcom/exchange/allin/data/FlashClosing;", "Landroid/os/Parcelable;", "amount", "", "feeAmount", FirebaseAnalytics.Param.PRICE, "time", "", "<init>", "(DDDJ)V", "getAmount", "()D", "getFeeAmount", "getPrice", "getTime", "()J", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FlashClosing implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FlashClosing> CREATOR = new Creator();
    private final double amount;
    private final double feeAmount;
    private final double price;
    private final long time;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<FlashClosing> {
        @Override // android.os.Parcelable.Creator
        public final FlashClosing createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new FlashClosing(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final FlashClosing[] newArray(int i) {
            return new FlashClosing[i];
        }
    }

    public FlashClosing(double d, double d2, double d3, long j) {
        this.amount = d;
        this.feeAmount = d2;
        this.price = d3;
        this.time = j;
    }

    public static /* synthetic */ FlashClosing copy$default(FlashClosing flashClosing, double d, double d2, double d3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            d = flashClosing.amount;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = flashClosing.feeAmount;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = flashClosing.price;
        }
        return flashClosing.copy(d4, d5, d3, (i & 8) != 0 ? flashClosing.time : j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final FlashClosing copy(double amount, double feeAmount, double price, long time) {
        return new FlashClosing(amount, feeAmount, price, time);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashClosing)) {
            return false;
        }
        FlashClosing flashClosing = (FlashClosing) other;
        return Double.compare(this.amount, flashClosing.amount) == 0 && Double.compare(this.feeAmount, flashClosing.feeAmount) == 0 && Double.compare(this.price, flashClosing.price) == 0 && this.time == flashClosing.time;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getFeeAmount() {
        return this.feeAmount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(Double.hashCode(this.amount) * 31, 31, this.feeAmount), 31, this.price);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FlashClosing(amount=");
        sb.append(this.amount);
        sb.append(", feeAmount=");
        sb.append(this.feeAmount);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", time=");
        return AbstractC0455a.m2240o(sb, this.time, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeDouble(this.amount);
        dest.writeDouble(this.feeAmount);
        dest.writeDouble(this.price);
        dest.writeLong(this.time);
    }
}
