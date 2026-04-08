package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroid/os/Parcelable;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableIntState extends SnapshotMutableIntStateImpl implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new ParcelableSnapshotMutableIntState$Companion$CREATOR$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ParcelableSnapshotMutableIntState(int i) {
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        SnapshotMutableIntStateImpl.IntStateStateRecord intStateStateRecord = new SnapshotMutableIntStateImpl.IntStateStateRecord(snapshotM4813k.getF17019b(), i);
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            intStateStateRecord.f17122b = new SnapshotMutableIntStateImpl.IntStateStateRecord(1, i);
        }
        this.f16611b = intStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo4383f());
    }
}
