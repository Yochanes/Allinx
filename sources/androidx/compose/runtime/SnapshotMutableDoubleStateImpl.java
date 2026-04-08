package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "DoubleStateStateRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {

    /* JADX INFO: renamed from: b */
    public DoubleStateStateRecord f16607b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DoubleStateStateRecord extends StateRecord {

        /* JADX INFO: renamed from: c */
        public double f16608c;

        public DoubleStateStateRecord(long j, double d) {
            super(j);
            this.f16608c = d;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f16608c = ((DoubleStateStateRecord) stateRecord).f16608c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return mo4364c(this.f17121a);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new DoubleStateStateRecord(j, this.f16608c);
        }
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    /* JADX INFO: renamed from: A */
    public final void mo4389A(double d) {
        Snapshot snapshotM4813k;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.m4811i(this.f16607b);
        if (doubleStateStateRecord.f16608c == d) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.f16607b;
        synchronized (SnapshotKt.f17043c) {
            snapshotM4813k = SnapshotKt.m4813k();
            ((DoubleStateStateRecord) SnapshotKt.m4817o(doubleStateStateRecord2, this, snapshotM4813k, doubleStateStateRecord)).f16608c = d;
        }
        SnapshotKt.m4816n(snapshotM4813k, this);
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    /* JADX INFO: renamed from: b */
    public final double mo4367b() {
        return ((DoubleStateStateRecord) SnapshotKt.m4822t(this.f16607b, this)).f16608c;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* JADX INFO: renamed from: d */
    public final SnapshotMutationPolicy getF16615b() {
        return StructuralEqualityPolicy.f16666a;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f16607b = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f16607b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: m */
    public final StateRecord mo3364m(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((DoubleStateStateRecord) stateRecord2).f16608c == ((DoubleStateStateRecord) stateRecord3).f16608c) {
            return stateRecord2;
        }
        return null;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.m4811i(this.f16607b)).f16608c + ")@" + hashCode();
    }
}
