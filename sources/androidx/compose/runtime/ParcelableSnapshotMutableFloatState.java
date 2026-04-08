package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroid/os/Parcelable;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableFloatState extends SnapshotMutableFloatStateImpl implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new ParcelableSnapshotMutableFloatState$Companion$CREATOR$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = new SnapshotMutableFloatStateImpl.FloatStateStateRecord(f, snapshotM4813k.getF17019b());
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            floatStateStateRecord.f17122b = new SnapshotMutableFloatStateImpl.FloatStateStateRecord(f, 1);
        }
        this.f16609b = floatStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(mo4376c());
    }
}
