package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C40011();

    @NonNull
    public final SimpleArrayMap<String, Bundle> extendableStates;

    /* JADX INFO: renamed from: com.google.android.material.stateful.ExtendableSavedState$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40011 implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        public /* bridge */ /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public /* bridge */ /* synthetic */ ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C40011 c40011) {
        this(parcel, classLoader);
    }

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.extendableStates.f3884c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.extendableStates.m2128j(i3);
            bundleArr[i3] = (Bundle) this.extendableStates.m2131m(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new SimpleArrayMap<>(0);
    }

    private ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new SimpleArrayMap<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.extendableStates.put(strArr[i2], bundleArr[i2]);
        }
    }
}
