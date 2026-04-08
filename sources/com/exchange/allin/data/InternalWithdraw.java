package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, m18302d2 = {"Lcom/exchange/allin/data/InternalWithdraw;", "Landroid/os/Parcelable;", "isPayOut", "", "leastPayOut", "", "mostPayOut", "payOutTime", "", "payOutFee", "<init>", "(IDDJD)V", "()I", "getLeastPayOut", "()D", "getMostPayOut", "getPayOutTime", "()J", "getPayOutFee", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class InternalWithdraw implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InternalWithdraw> CREATOR = new Creator();

    @SerializedName("is_pay_out")
    private final int isPayOut;

    @SerializedName("least_pay_out")
    private final double leastPayOut;

    @SerializedName("most_pay_out")
    private final double mostPayOut;

    @SerializedName("pay_out_fee")
    private final double payOutFee;

    @SerializedName("pay_out_time")
    private final long payOutTime;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<InternalWithdraw> {
        @Override // android.os.Parcelable.Creator
        public final InternalWithdraw createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new InternalWithdraw(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final InternalWithdraw[] newArray(int i) {
            return new InternalWithdraw[i];
        }
    }

    public InternalWithdraw(int i, double d, double d2, long j, double d3) {
        this.isPayOut = i;
        this.leastPayOut = d;
        this.mostPayOut = d2;
        this.payOutTime = j;
        this.payOutFee = d3;
    }

    public static /* synthetic */ InternalWithdraw copy$default(InternalWithdraw internalWithdraw, int i, double d, double d2, long j, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = internalWithdraw.isPayOut;
        }
        if ((i2 & 2) != 0) {
            d = internalWithdraw.leastPayOut;
        }
        if ((i2 & 4) != 0) {
            d2 = internalWithdraw.mostPayOut;
        }
        if ((i2 & 8) != 0) {
            j = internalWithdraw.payOutTime;
        }
        if ((i2 & 16) != 0) {
            d3 = internalWithdraw.payOutFee;
        }
        double d4 = d3;
        long j2 = j;
        return internalWithdraw.copy(i, d, d2, j2, d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsPayOut() {
        return this.isPayOut;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLeastPayOut() {
        return this.leastPayOut;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMostPayOut() {
        return this.mostPayOut;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPayOutTime() {
        return this.payOutTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPayOutFee() {
        return this.payOutFee;
    }

    @NotNull
    public final InternalWithdraw copy(int isPayOut, double leastPayOut, double mostPayOut, long payOutTime, double payOutFee) {
        return new InternalWithdraw(isPayOut, leastPayOut, mostPayOut, payOutTime, payOutFee);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalWithdraw)) {
            return false;
        }
        InternalWithdraw internalWithdraw = (InternalWithdraw) other;
        return this.isPayOut == internalWithdraw.isPayOut && Double.compare(this.leastPayOut, internalWithdraw.leastPayOut) == 0 && Double.compare(this.mostPayOut, internalWithdraw.mostPayOut) == 0 && this.payOutTime == internalWithdraw.payOutTime && Double.compare(this.payOutFee, internalWithdraw.payOutFee) == 0;
    }

    public final double getLeastPayOut() {
        return this.leastPayOut;
    }

    public final double getMostPayOut() {
        return this.mostPayOut;
    }

    public final double getPayOutFee() {
        return this.payOutFee;
    }

    public final long getPayOutTime() {
        return this.payOutTime;
    }

    public int hashCode() {
        return Double.hashCode(this.payOutFee) + AbstractC0455a.m2231f(this.payOutTime, AbstractC0455a.m2227b(AbstractC0455a.m2227b(Integer.hashCode(this.isPayOut) * 31, 31, this.leastPayOut), 31, this.mostPayOut), 31);
    }

    public final int isPayOut() {
        return this.isPayOut;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InternalWithdraw(isPayOut=");
        sb.append(this.isPayOut);
        sb.append(", leastPayOut=");
        sb.append(this.leastPayOut);
        sb.append(", mostPayOut=");
        sb.append(this.mostPayOut);
        sb.append(", payOutTime=");
        sb.append(this.payOutTime);
        sb.append(", payOutFee=");
        return AbstractC0455a.m2239n(sb, this.payOutFee, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeInt(this.isPayOut);
        dest.writeDouble(this.leastPayOut);
        dest.writeDouble(this.mostPayOut);
        dest.writeLong(this.payOutTime);
        dest.writeDouble(this.payOutFee);
    }
}
