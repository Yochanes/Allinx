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
@Metadata(m18301d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, m18302d2 = {"Lcom/exchange/allin/data/Announcement;", "Landroid/os/Parcelable;", "id", "", "title", "", "detailUrl", "sort", "", "language", "publishAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getDetailUrl", "getSort", "()I", "getLanguage", "getPublishAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class Announcement implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Announcement> CREATOR = new Creator();

    @SerializedName("detail_url")
    @NotNull
    private final String detailUrl;
    private final long id;

    @NotNull
    private final String language;

    @SerializedName("publish_at")
    private final long publishAt;
    private final int sort;

    @NotNull
    private final String title;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<Announcement> {
        @Override // android.os.Parcelable.Creator
        public final Announcement createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new Announcement(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Announcement[] newArray(int i) {
            return new Announcement[i];
        }
    }

    public Announcement(long j, @NotNull String title, @NotNull String detailUrl, int i, @NotNull String language, long j2) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(detailUrl, "detailUrl");
        Intrinsics.m18599g(language, "language");
        this.id = j;
        this.title = title;
        this.detailUrl = detailUrl;
        this.sort = i;
        this.language = language;
        this.publishAt = j2;
    }

    public static /* synthetic */ Announcement copy$default(Announcement announcement, long j, String str, String str2, int i, String str3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = announcement.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = announcement.title;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = announcement.detailUrl;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = announcement.sort;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = announcement.language;
        }
        return announcement.copy(j3, str4, str5, i3, str3, (i2 & 32) != 0 ? announcement.publishAt : j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPublishAt() {
        return this.publishAt;
    }

    @NotNull
    public final Announcement copy(long id, @NotNull String title, @NotNull String detailUrl, int sort, @NotNull String language, long publishAt) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(detailUrl, "detailUrl");
        Intrinsics.m18599g(language, "language");
        return new Announcement(id, title, detailUrl, sort, language, publishAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) other;
        return this.id == announcement.id && Intrinsics.m18594b(this.title, announcement.title) && Intrinsics.m18594b(this.detailUrl, announcement.detailUrl) && this.sort == announcement.sort && Intrinsics.m18594b(this.language, announcement.language) && this.publishAt == announcement.publishAt;
    }

    @NotNull
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    public final long getPublishAt() {
        return this.publishAt;
    }

    public final int getSort() {
        return this.sort;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.publishAt) + AbstractC0000a.m5b(AbstractC0455a.m2228c(this.sort, AbstractC0000a.m5b(AbstractC0000a.m5b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.detailUrl), 31), 31, this.language);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Announcement(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", sort=");
        sb.append(this.sort);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", publishAt=");
        return AbstractC0455a.m2240o(sb, this.publishAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.title);
        dest.writeString(this.detailUrl);
        dest.writeInt(this.sort);
        dest.writeString(this.language);
        dest.writeLong(this.publishAt);
    }
}
