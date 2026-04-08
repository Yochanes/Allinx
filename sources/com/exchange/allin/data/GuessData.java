package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0015HÆ\u0003J\u009b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0006\u00102\u001a\u00020\rJ\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\t\u00108\u001a\u00020\u0013HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006>"}, m18302d2 = {"Lcom/exchange/allin/data/GuessData;", "Landroid/os/Parcelable;", "balance", "Lcom/exchange/allin/data/GuessBalance;", "topics", "", "Lcom/exchange/allin/data/GuessTopic;", "topic", "votes", "Lcom/exchange/allin/data/GuessTopicVote;", "transaction", "Lcom/exchange/allin/data/GuessTransactions;", "total", "", "records", "Lcom/exchange/allin/data/GuessRecord;", "categories", "Lcom/exchange/allin/data/GuessCategories;", AttributeType.TEXT, "", "totalAmount", "", "<init>", "(Lcom/exchange/allin/data/GuessBalance;Ljava/util/List;Lcom/exchange/allin/data/GuessTopic;Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;Ljava/util/List;D)V", "getBalance", "()Lcom/exchange/allin/data/GuessBalance;", "getTopics", "()Ljava/util/List;", "getTopic", "()Lcom/exchange/allin/data/GuessTopic;", "getVotes", "getTransaction", "getTotal", "()I", "getRecords", "getCategories", "getText", "getTotalAmount", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class GuessData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GuessData> CREATOR = new Creator();

    @NotNull
    private final GuessBalance balance;

    @Nullable
    private final List<GuessCategories> categories;

    @Nullable
    private final List<GuessRecord> records;

    @NotNull
    private final List<String> text;

    @NotNull
    private final GuessTopic topic;

    @Nullable
    private final List<GuessTopic> topics;
    private final int total;

    @SerializedName("total_amount")
    private final double totalAmount;

    @Nullable
    private final List<GuessTransactions> transaction;

    @Nullable
    private final List<GuessTopicVote> votes;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<GuessData> {
        @Override // android.os.Parcelable.Creator
        public final GuessData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.m18599g(parcel, "parcel");
            GuessBalance guessBalanceCreateFromParcel = GuessBalance.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(GuessTopic.CREATOR.createFromParcel(parcel));
                }
            }
            GuessTopic guessTopicCreateFromParcel = GuessTopic.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList6.add(GuessTopicVote.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList7.add(GuessTransactions.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList7;
            }
            int i7 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList8.add(GuessRecord.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i10 = parcel.readInt();
                arrayList5 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList5.add(GuessCategories.CREATOR.createFromParcel(parcel));
                }
            }
            return new GuessData(guessBalanceCreateFromParcel, arrayList, guessTopicCreateFromParcel, arrayList2, arrayList3, i7, arrayList4, arrayList5, parcel.createStringArrayList(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final GuessData[] newArray(int i) {
            return new GuessData[i];
        }
    }

    public GuessData(@NotNull GuessBalance balance, @Nullable List<GuessTopic> list, @NotNull GuessTopic topic, @Nullable List<GuessTopicVote> list2, @Nullable List<GuessTransactions> list3, int i, @Nullable List<GuessRecord> list4, @Nullable List<GuessCategories> list5, @NotNull List<String> text, double d) {
        Intrinsics.m18599g(balance, "balance");
        Intrinsics.m18599g(topic, "topic");
        Intrinsics.m18599g(text, "text");
        this.balance = balance;
        this.topics = list;
        this.topic = topic;
        this.votes = list2;
        this.transaction = list3;
        this.total = i;
        this.records = list4;
        this.categories = list5;
        this.text = text;
        this.totalAmount = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuessData copy$default(GuessData guessData, GuessBalance guessBalance, List list, GuessTopic guessTopic, List list2, List list3, int i, List list4, List list5, List list6, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            guessBalance = guessData.balance;
        }
        if ((i2 & 2) != 0) {
            list = guessData.topics;
        }
        if ((i2 & 4) != 0) {
            guessTopic = guessData.topic;
        }
        if ((i2 & 8) != 0) {
            list2 = guessData.votes;
        }
        if ((i2 & 16) != 0) {
            list3 = guessData.transaction;
        }
        if ((i2 & 32) != 0) {
            i = guessData.total;
        }
        if ((i2 & 64) != 0) {
            list4 = guessData.records;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list5 = guessData.categories;
        }
        if ((i2 & 256) != 0) {
            list6 = guessData.text;
        }
        if ((i2 & 512) != 0) {
            d = guessData.totalAmount;
        }
        double d2 = d;
        List list7 = list5;
        List list8 = list6;
        int i3 = i;
        List list9 = list4;
        List list10 = list3;
        GuessTopic guessTopic2 = guessTopic;
        return guessData.copy(guessBalance, list, guessTopic2, list2, list10, i3, list9, list7, list8, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GuessBalance getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final List<GuessTopic> component2() {
        return this.topics;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GuessTopic getTopic() {
        return this.topic;
    }

    @Nullable
    public final List<GuessTopicVote> component4() {
        return this.votes;
    }

    @Nullable
    public final List<GuessTransactions> component5() {
        return this.transaction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    @Nullable
    public final List<GuessRecord> component7() {
        return this.records;
    }

    @Nullable
    public final List<GuessCategories> component8() {
        return this.categories;
    }

    @NotNull
    public final List<String> component9() {
        return this.text;
    }

    @NotNull
    public final GuessData copy(@NotNull GuessBalance balance, @Nullable List<GuessTopic> topics, @NotNull GuessTopic topic, @Nullable List<GuessTopicVote> votes, @Nullable List<GuessTransactions> transaction, int total, @Nullable List<GuessRecord> records, @Nullable List<GuessCategories> categories, @NotNull List<String> text, double totalAmount) {
        Intrinsics.m18599g(balance, "balance");
        Intrinsics.m18599g(topic, "topic");
        Intrinsics.m18599g(text, "text");
        return new GuessData(balance, topics, topic, votes, transaction, total, records, categories, text, totalAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuessData)) {
            return false;
        }
        GuessData guessData = (GuessData) other;
        return Intrinsics.m18594b(this.balance, guessData.balance) && Intrinsics.m18594b(this.topics, guessData.topics) && Intrinsics.m18594b(this.topic, guessData.topic) && Intrinsics.m18594b(this.votes, guessData.votes) && Intrinsics.m18594b(this.transaction, guessData.transaction) && this.total == guessData.total && Intrinsics.m18594b(this.records, guessData.records) && Intrinsics.m18594b(this.categories, guessData.categories) && Intrinsics.m18594b(this.text, guessData.text) && Double.compare(this.totalAmount, guessData.totalAmount) == 0;
    }

    @NotNull
    public final GuessBalance getBalance() {
        return this.balance;
    }

    @Nullable
    public final List<GuessCategories> getCategories() {
        return this.categories;
    }

    @Nullable
    public final List<GuessRecord> getRecords() {
        return this.records;
    }

    @NotNull
    public final List<String> getText() {
        return this.text;
    }

    @NotNull
    public final GuessTopic getTopic() {
        return this.topic;
    }

    @Nullable
    public final List<GuessTopic> getTopics() {
        return this.topics;
    }

    public final int getTotal() {
        return this.total;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final List<GuessTransactions> getTransaction() {
        return this.transaction;
    }

    @Nullable
    public final List<GuessTopicVote> getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int iHashCode = this.balance.hashCode() * 31;
        List<GuessTopic> list = this.topics;
        int iHashCode2 = (this.topic.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        List<GuessTopicVote> list2 = this.votes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GuessTransactions> list3 = this.transaction;
        int iM2228c = AbstractC0455a.m2228c(this.total, (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        List<GuessRecord> list4 = this.records;
        int iHashCode4 = (iM2228c + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<GuessCategories> list5 = this.categories;
        return Double.hashCode(this.totalAmount) + AbstractC0455a.m2233h(this.text, (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GuessData(balance=");
        sb.append(this.balance);
        sb.append(", topics=");
        sb.append(this.topics);
        sb.append(", topic=");
        sb.append(this.topic);
        sb.append(", votes=");
        sb.append(this.votes);
        sb.append(", transaction=");
        sb.append(this.transaction);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", records=");
        sb.append(this.records);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", totalAmount=");
        return AbstractC0455a.m2239n(sb, this.totalAmount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        this.balance.writeToParcel(dest, flags);
        List<GuessTopic> list = this.topics;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<GuessTopic> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        this.topic.writeToParcel(dest, flags);
        List<GuessTopicVote> list2 = this.votes;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<GuessTopicVote> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        List<GuessTransactions> list3 = this.transaction;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<GuessTransactions> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.total);
        List<GuessRecord> list4 = this.records;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator<GuessRecord> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
        }
        List<GuessCategories> list5 = this.categories;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list5.size());
            Iterator<GuessCategories> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(dest, flags);
            }
        }
        dest.writeStringList(this.text);
        dest.writeDouble(this.totalAmount);
    }
}
