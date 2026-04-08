package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$Companion$CREATOR$1", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    /* JADX INFO: renamed from: a */
    public static ParcelableSnapshotMutableState m4398a(Parcel parcel, ClassLoader classLoader) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            snapshotMutationPolicy = NeverEqualPolicy.f16415a;
        } else if (i == 1) {
            snapshotMutationPolicy = StructuralEqualityPolicy.f16666a;
        } else {
            if (i != 2) {
                throw new IllegalStateException(AbstractC0000a.m10g(i, "Unsupported MutableState policy ", " was restored"));
            }
            snapshotMutationPolicy = ReferentialEqualityPolicy.f16546a;
        }
        return new ParcelableSnapshotMutableState(value, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m4398a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m4398a(parcel, null);
    }
}
