package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Parcelize
@kotlin.Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m18302d2 = {"Lio/intercom/android/sdk/models/Reaction;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.INDEX, "", "_imageUrl", "", "<init>", "(ILjava/lang/String;)V", "getIndex", "()I", "imageUrl", "getImageUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Reaction implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("image_url")
    @Nullable
    private final String _imageUrl;

    @SerializedName(FirebaseAnalytics.Param.INDEX)
    private final int index;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m18302d2 = {"Lio/intercom/android/sdk/models/Reaction$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/models/Reaction;", FirebaseAnalytics.Param.INDEX, "", "imageUrl", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Reaction create(int index, @NotNull String imageUrl) {
            Intrinsics.m18599g(imageUrl, "imageUrl");
            return new Reaction(index, imageUrl);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<Reaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new Reaction(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction[] newArray(int i) {
            return new Reaction[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Reaction createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Reaction[] newArray(int i) {
            return newArray(i);
        }
    }

    public Reaction() {
        this(0, null, 3, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String get_imageUrl() {
        return this._imageUrl;
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reaction.index;
        }
        if ((i2 & 2) != 0) {
            str = reaction._imageUrl;
        }
        return reaction.copy(i, str);
    }

    @JvmStatic
    @NotNull
    public static final Reaction create(int i, @NotNull String str) {
        return INSTANCE.create(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Reaction copy(int index, @Nullable String _imageUrl) {
        return new Reaction(index, _imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) other;
        return this.index == reaction.index && Intrinsics.m18594b(this._imageUrl, reaction._imageUrl);
    }

    @NotNull
    public final String getImageUrl() {
        String str = this._imageUrl;
        return str == null ? "" : str;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this._imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Reaction(index=");
        sb.append(this.index);
        sb.append(", _imageUrl=");
        return AbstractC0455a.m2241p(sb, this._imageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeInt(this.index);
        dest.writeString(this._imageUrl);
    }

    public Reaction(int i, @Nullable String str) {
        this.index = i;
        this._imageUrl = str;
    }

    public /* synthetic */ Reaction(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
