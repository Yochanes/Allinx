package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(m18301d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m18302d2 = {"Lcom/exchange/allin/data/GuessBalance;", "Landroid/os/Parcelable;", "available", "", "<init>", "(D)V", "getAvailable", "()D", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class GuessBalance implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<GuessBalance> CREATOR = new Creator();
    private final double available;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<GuessBalance> {
        @Override // android.os.Parcelable.Creator
        public final GuessBalance createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new GuessBalance(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final GuessBalance[] newArray(int i) {
            return new GuessBalance[i];
        }
    }

    public GuessBalance(double d) {
        this.available = d;
    }

    public static /* synthetic */ GuessBalance copy$default(GuessBalance guessBalance, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = guessBalance.available;
        }
        return guessBalance.copy(d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvailable() {
        return this.available;
    }

    @NotNull
    public final GuessBalance copy(double available) {
        return new GuessBalance(available);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GuessBalance) && Double.compare(this.available, ((GuessBalance) other).available) == 0;
    }

    public final double getAvailable() {
        return this.available;
    }

    public int hashCode() {
        return Double.hashCode(this.available);
    }

    @NotNull
    public String toString() {
        return AbstractC0455a.m2239n(new StringBuilder("GuessBalance(available="), this.available, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeDouble(this.available);
    }
}
