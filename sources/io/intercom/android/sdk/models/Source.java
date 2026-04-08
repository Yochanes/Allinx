package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Parcelize
@kotlin.Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/models/Source;", "Landroid/os/Parcelable;", "id", "", "type", "title", ImagesContract.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTitle", "getUrl", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Source implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Source> CREATOR = new Creator();

    @NotNull
    private final String id;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new Source(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i) {
            return new Source[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Source createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Source[] newArray(int i) {
            return newArray(i);
        }
    }

    public Source(@NotNull String id, @NotNull String type, @NotNull String title, @NotNull String url) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(type, "type");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(url, "url");
        this.id = id;
        this.type = type;
        this.title = title;
        this.url = url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.url);
    }
}
