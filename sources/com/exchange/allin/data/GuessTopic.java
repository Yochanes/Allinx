package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u0014HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J¿\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0006\u0010N\u001a\u00020\nJ\u0013\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\nHÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001f\"\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010)\"\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u00106R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001dR\u0011\u00109\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b;\u0010\u001f¨\u0006Y"}, m18302d2 = {"Lcom/exchange/allin/data/GuessTopic;", "Landroid/os/Parcelable;", "id", "", "title", "", "titleTranslate", "description", "descriptionTranslate", "participants", "", "status", "isTranslate", "", "options", "", "Lcom/exchange/allin/data/GuessTopicOption;", "coverUrl", "canVote", "minAmount", "", "cutoffTime", "startTime", "endTime", "createdAt", "updatedAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ljava/lang/String;ZDJJJJJ)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getTitleTranslate", "setTitleTranslate", "(Ljava/lang/String;)V", "getDescription", "getDescriptionTranslate", "setDescriptionTranslate", "getParticipants", "()I", "getStatus", "()Z", "setTranslate", "(Z)V", "getOptions", "()Ljava/util/List;", "getCoverUrl", "getCanVote", "getMinAmount", "()D", "getCutoffTime", "getStartTime", "getEndTime", "setEndTime", "(J)V", "getCreatedAt", "getUpdatedAt", "isInProgress", "statusExt", "getStatusExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class GuessTopic implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GuessTopic> CREATOR = new Creator();

    @SerializedName("can_vote")
    private final boolean canVote;

    @SerializedName("cover_url")
    @NotNull
    private final String coverUrl;

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("cutoff_time")
    private final long cutoffTime;

    @NotNull
    private final String description;

    @Nullable
    private String descriptionTranslate;

    @SerializedName("end_time")
    private long endTime;
    private final long id;
    private boolean isTranslate;

    @SerializedName("min_amount")
    private final double minAmount;

    @Nullable
    private final List<GuessTopicOption> options;
    private final int participants;

    @SerializedName("start_time")
    private final long startTime;
    private final int status;

    @NotNull
    private final String title;

    @Nullable
    private String titleTranslate;

    @SerializedName("updated_at")
    private final long updatedAt;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<GuessTopic> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GuessTopic createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.m18599g(parcel, "parcel");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z2 = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = i; i5 != i4; i5++) {
                    arrayList2.add(GuessTopicOption.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GuessTopic(j, string, string2, string3, string4, i2, i3, z2, arrayList, parcel.readString(), parcel.readInt() != 0 ? 1 : i, parcel.readDouble(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GuessTopic[] newArray(int i) {
            return new GuessTopic[i];
        }
    }

    public GuessTopic(long j, @NotNull String title, @Nullable String str, @NotNull String description, @Nullable String str2, int i, int i2, boolean z2, @Nullable List<GuessTopicOption> list, @NotNull String coverUrl, boolean z3, double d, long j2, long j3, long j4, long j5, long j6) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(description, "description");
        Intrinsics.m18599g(coverUrl, "coverUrl");
        this.id = j;
        this.title = title;
        this.titleTranslate = str;
        this.description = description;
        this.descriptionTranslate = str2;
        this.participants = i;
        this.status = i2;
        this.isTranslate = z2;
        this.options = list;
        this.coverUrl = coverUrl;
        this.canVote = z3;
        this.minAmount = d;
        this.cutoffTime = j2;
        this.startTime = j3;
        this.endTime = j4;
        this.createdAt = j5;
        this.updatedAt = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuessTopic copy$default(GuessTopic guessTopic, long j, String str, String str2, String str3, String str4, int i, int i2, boolean z2, List list, String str5, boolean z3, double d, long j2, long j3, long j4, long j5, long j6, int i3, Object obj) {
        long j7;
        long j8;
        long j9 = (i3 & 1) != 0 ? guessTopic.id : j;
        String str6 = (i3 & 2) != 0 ? guessTopic.title : str;
        String str7 = (i3 & 4) != 0 ? guessTopic.titleTranslate : str2;
        String str8 = (i3 & 8) != 0 ? guessTopic.description : str3;
        String str9 = (i3 & 16) != 0 ? guessTopic.descriptionTranslate : str4;
        int i4 = (i3 & 32) != 0 ? guessTopic.participants : i;
        int i5 = (i3 & 64) != 0 ? guessTopic.status : i2;
        boolean z4 = (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? guessTopic.isTranslate : z2;
        List list2 = (i3 & 256) != 0 ? guessTopic.options : list;
        String str10 = (i3 & 512) != 0 ? guessTopic.coverUrl : str5;
        boolean z5 = (i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? guessTopic.canVote : z3;
        double d2 = (i3 & 2048) != 0 ? guessTopic.minAmount : d;
        long j10 = j9;
        long j11 = (i3 & 4096) != 0 ? guessTopic.cutoffTime : j2;
        long j12 = (i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? guessTopic.startTime : j3;
        long j13 = (i3 & 16384) != 0 ? guessTopic.endTime : j4;
        long j14 = (i3 & 32768) != 0 ? guessTopic.createdAt : j5;
        if ((i3 & 65536) != 0) {
            j8 = j14;
            j7 = guessTopic.updatedAt;
        } else {
            j7 = j6;
            j8 = j14;
        }
        return guessTopic.copy(j10, str6, str7, str8, str9, i4, i5, z4, list2, str10, z5, d2, j11, j12, j13, j8, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCanVote() {
        return this.canVote;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCutoffTime() {
        return this.cutoffTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleTranslate() {
        return this.titleTranslate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionTranslate() {
        return this.descriptionTranslate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsTranslate() {
        return this.isTranslate;
    }

    @Nullable
    public final List<GuessTopicOption> component9() {
        return this.options;
    }

    @NotNull
    public final GuessTopic copy(long id, @NotNull String title, @Nullable String titleTranslate, @NotNull String description, @Nullable String descriptionTranslate, int participants, int status, boolean isTranslate, @Nullable List<GuessTopicOption> options, @NotNull String coverUrl, boolean canVote, double minAmount, long cutoffTime, long startTime, long endTime, long createdAt, long updatedAt) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(description, "description");
        Intrinsics.m18599g(coverUrl, "coverUrl");
        return new GuessTopic(id, title, titleTranslate, description, descriptionTranslate, participants, status, isTranslate, options, coverUrl, canVote, minAmount, cutoffTime, startTime, endTime, createdAt, updatedAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuessTopic)) {
            return false;
        }
        GuessTopic guessTopic = (GuessTopic) other;
        return this.id == guessTopic.id && Intrinsics.m18594b(this.title, guessTopic.title) && Intrinsics.m18594b(this.titleTranslate, guessTopic.titleTranslate) && Intrinsics.m18594b(this.description, guessTopic.description) && Intrinsics.m18594b(this.descriptionTranslate, guessTopic.descriptionTranslate) && this.participants == guessTopic.participants && this.status == guessTopic.status && this.isTranslate == guessTopic.isTranslate && Intrinsics.m18594b(this.options, guessTopic.options) && Intrinsics.m18594b(this.coverUrl, guessTopic.coverUrl) && this.canVote == guessTopic.canVote && Double.compare(this.minAmount, guessTopic.minAmount) == 0 && this.cutoffTime == guessTopic.cutoffTime && this.startTime == guessTopic.startTime && this.endTime == guessTopic.endTime && this.createdAt == guessTopic.createdAt && this.updatedAt == guessTopic.updatedAt;
    }

    public final boolean getCanVote() {
        return this.canVote;
    }

    @NotNull
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getCutoffTime() {
        return this.cutoffTime;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionTranslate() {
        return this.descriptionTranslate;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.id;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final List<GuessTopicOption> getOptions() {
        return this.options;
    }

    public final int getParticipants() {
        return this.participants;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStatusExt() {
        int i = this.status;
        return i != 1 ? (i == 2 || i == 3) ? StringExtKt.m14217f("guess_detail_text_status_closed") : i != 4 ? "" : StringExtKt.m14217f("guess_detail_text_status_pending") : StringExtKt.m14217f("guess_detail_text_status_in_progress");
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleTranslate() {
        return this.titleTranslate;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.titleTranslate;
        int iM5b2 = AbstractC0000a.m5b((iM5b + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        String str2 = this.descriptionTranslate;
        int iM2230e = AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.status, AbstractC0455a.m2228c(this.participants, (iM5b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.isTranslate);
        List<GuessTopicOption> list = this.options;
        return Long.hashCode(this.updatedAt) + AbstractC0455a.m2231f(this.createdAt, AbstractC0455a.m2231f(this.endTime, AbstractC0455a.m2231f(this.startTime, AbstractC0455a.m2231f(this.cutoffTime, AbstractC0455a.m2227b(AbstractC0455a.m2230e(AbstractC0000a.m5b((iM2230e + (list != null ? list.hashCode() : 0)) * 31, 31, this.coverUrl), 31, this.canVote), 31, this.minAmount), 31), 31), 31), 31);
    }

    public final boolean isInProgress() {
        return this.status == 1;
    }

    public final boolean isTranslate() {
        return this.isTranslate;
    }

    public final void setDescriptionTranslate(@Nullable String str) {
        this.descriptionTranslate = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setTitleTranslate(@Nullable String str) {
        this.titleTranslate = str;
    }

    public final void setTranslate(boolean z2) {
        this.isTranslate = z2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GuessTopic(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", titleTranslate=");
        sb.append(this.titleTranslate);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", descriptionTranslate=");
        sb.append(this.descriptionTranslate);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isTranslate=");
        sb.append(this.isTranslate);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", canVote=");
        sb.append(this.canVote);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", cutoffTime=");
        sb.append(this.cutoffTime);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        return AbstractC0455a.m2240o(sb, this.updatedAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.title);
        dest.writeString(this.titleTranslate);
        dest.writeString(this.description);
        dest.writeString(this.descriptionTranslate);
        dest.writeInt(this.participants);
        dest.writeInt(this.status);
        dest.writeInt(this.isTranslate ? 1 : 0);
        List<GuessTopicOption> list = this.options;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<GuessTopicOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.coverUrl);
        dest.writeInt(this.canVote ? 1 : 0);
        dest.writeDouble(this.minAmount);
        dest.writeLong(this.cutoffTime);
        dest.writeLong(this.startTime);
        dest.writeLong(this.endTime);
        dest.writeLong(this.createdAt);
        dest.writeLong(this.updatedAt);
    }

    public /* synthetic */ GuessTopic(long j, String str, String str2, String str3, String str4, int i, int i2, boolean z2, List list, String str5, boolean z3, double d, long j2, long j3, long j4, long j5, long j6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, i, i2, (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z2, (i3 & 256) != 0 ? EmptyList.f51496a : list, str5, z3, d, j2, j3, j4, j5, j6);
    }
}
