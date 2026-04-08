package io.intercom.android.sdk.p041ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "Delete", "Remove", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$Delete;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$None;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType$Remove;", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class DeleteType implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$Delete;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Delete extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final Delete INSTANCE = new Delete();

        @NotNull
        public static final Parcelable.Creator<Delete> CREATOR = new Creator();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Creator implements Parcelable.Creator<Delete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete createFromParcel(Parcel parcel) {
                Intrinsics.m18599g(parcel, "parcel");
                parcel.readInt();
                return Delete.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete[] newArray(int i) {
                return new Delete[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Delete createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Delete[] newArray(int i) {
                return newArray(i);
            }
        }

        private Delete() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.m18599g(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$None;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class None extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.m18599g(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ None createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ None[] newArray(int i) {
                return newArray(i);
            }
        }

        private None() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.m18599g(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/ui/preview/data/DeleteType$Remove;", "Lio/intercom/android/sdk/ui/preview/data/DeleteType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Remove extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final Remove INSTANCE = new Remove();

        @NotNull
        public static final Parcelable.Creator<Remove> CREATOR = new Creator();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Creator implements Parcelable.Creator<Remove> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove createFromParcel(Parcel parcel) {
                Intrinsics.m18599g(parcel, "parcel");
                parcel.readInt();
                return Remove.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove[] newArray(int i) {
                return new Remove[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Remove createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Remove[] newArray(int i) {
                return newArray(i);
            }
        }

        private Remove() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.m18599g(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ DeleteType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeleteType() {
    }
}
