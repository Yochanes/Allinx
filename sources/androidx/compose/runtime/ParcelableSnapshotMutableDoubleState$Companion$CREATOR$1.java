package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
        double d = parcel.readDouble();
        ParcelableSnapshotMutableDoubleState parcelableSnapshotMutableDoubleState = new ParcelableSnapshotMutableDoubleState();
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord = new SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(snapshotM4813k.getF17019b(), d);
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            doubleStateStateRecord.f17122b = new SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(1, d);
        }
        parcelableSnapshotMutableDoubleState.f16607b = doubleStateStateRecord;
        return parcelableSnapshotMutableDoubleState;
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableDoubleState[] newArray(int i) {
        return new ParcelableSnapshotMutableDoubleState[i];
    }
}
