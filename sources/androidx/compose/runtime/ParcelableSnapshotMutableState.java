package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new ParcelableSnapshotMutableState$Companion$CREATOR$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getF20325a());
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.f16415a;
        SnapshotMutationPolicy snapshotMutationPolicy = this.f16615b;
        if (Intrinsics.m18594b(snapshotMutationPolicy, neverEqualPolicy)) {
            i2 = 0;
        } else if (Intrinsics.m18594b(snapshotMutationPolicy, StructuralEqualityPolicy.f16666a)) {
            i2 = 1;
        } else {
            if (!Intrinsics.m18594b(snapshotMutationPolicy, ReferentialEqualityPolicy.f16546a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
