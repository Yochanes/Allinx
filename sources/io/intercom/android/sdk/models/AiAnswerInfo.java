package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Parcelize
@kotlin.Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/models/AiAnswerInfo;", "Landroid/os/Parcelable;", AttributeType.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "isEmpty", "", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AiAnswerInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AiAnswerInfo> CREATOR = new Creator();

    @NotNull
    private final String text;

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AiAnswerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnswerInfo createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AiAnswerInfo(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnswerInfo[] newArray(int i) {
            return new AiAnswerInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AiAnswerInfo createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AiAnswerInfo[] newArray(int i) {
            return newArray(i);
        }
    }

    public AiAnswerInfo(@NotNull String text) {
        Intrinsics.m18599g(text, "text");
        this.text = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final boolean isEmpty() {
        return this.text.length() == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.text);
    }
}
