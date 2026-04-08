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
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006'"}, m18302d2 = {"Lcom/exchange/allin/data/GuessTopicVote;", "Landroid/os/Parcelable;", "id", "", "optionId", "", "optionText", "amount", "", "createdAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;DJ)V", "getId", "()J", "getOptionId", "()Ljava/lang/String;", "getOptionText", "getAmount", "()D", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class GuessTopicVote implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<GuessTopicVote> CREATOR = new Creator();
    private final double amount;

    @SerializedName("created_at")
    private final long createdAt;
    private final long id;

    @SerializedName("option_id")
    @NotNull
    private final String optionId;

    @SerializedName("option_text")
    @NotNull
    private final String optionText;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<GuessTopicVote> {
        @Override // android.os.Parcelable.Creator
        public final GuessTopicVote createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new GuessTopicVote(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GuessTopicVote[] newArray(int i) {
            return new GuessTopicVote[i];
        }
    }

    public GuessTopicVote(long j, @NotNull String optionId, @NotNull String optionText, double d, long j2) {
        Intrinsics.m18599g(optionId, "optionId");
        Intrinsics.m18599g(optionText, "optionText");
        this.id = j;
        this.optionId = optionId;
        this.optionText = optionText;
        this.amount = d;
        this.createdAt = j2;
    }

    public static /* synthetic */ GuessTopicVote copy$default(GuessTopicVote guessTopicVote, long j, String str, String str2, double d, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = guessTopicVote.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = guessTopicVote.optionId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = guessTopicVote.optionText;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            d = guessTopicVote.amount;
        }
        return guessTopicVote.copy(j3, str3, str4, d, (i & 16) != 0 ? guessTopicVote.createdAt : j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOptionText() {
        return this.optionText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final GuessTopicVote copy(long id, @NotNull String optionId, @NotNull String optionText, double amount, long createdAt) {
        Intrinsics.m18599g(optionId, "optionId");
        Intrinsics.m18599g(optionText, "optionText");
        return new GuessTopicVote(id, optionId, optionText, amount, createdAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuessTopicVote)) {
            return false;
        }
        GuessTopicVote guessTopicVote = (GuessTopicVote) other;
        return this.id == guessTopicVote.id && Intrinsics.m18594b(this.optionId, guessTopicVote.optionId) && Intrinsics.m18594b(this.optionText, guessTopicVote.optionText) && Double.compare(this.amount, guessTopicVote.amount) == 0 && this.createdAt == guessTopicVote.createdAt;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getOptionId() {
        return this.optionId;
    }

    @NotNull
    public final String getOptionText() {
        return this.optionText;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(Long.hashCode(this.id) * 31, 31, this.optionId), 31, this.optionText), 31, this.amount);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GuessTopicVote(id=");
        sb.append(this.id);
        sb.append(", optionId=");
        sb.append(this.optionId);
        sb.append(", optionText=");
        sb.append(this.optionText);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", createdAt=");
        return AbstractC0455a.m2240o(sb, this.createdAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.optionId);
        dest.writeString(this.optionText);
        dest.writeDouble(this.amount);
        dest.writeLong(this.createdAt);
    }
}
