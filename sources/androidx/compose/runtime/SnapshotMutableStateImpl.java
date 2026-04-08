package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
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
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "StateStateRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {

    /* JADX INFO: renamed from: b */
    public final SnapshotMutationPolicy f16615b;

    /* JADX INFO: renamed from: c */
    public StateStateRecord f16616c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class StateStateRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: c */
        public Object f16617c;

        public StateStateRecord(long j, Object obj) {
            super(j);
            this.f16617c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f16617c = ((StateStateRecord) stateRecord).f16617c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return new StateStateRecord(SnapshotKt.m4813k().getF17019b(), this.f16617c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new StateStateRecord(SnapshotKt.m4813k().getF17019b(), this.f16617c);
        }
    }

    public SnapshotMutableStateImpl(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.f16615b = snapshotMutationPolicy;
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        StateStateRecord stateStateRecord = new StateStateRecord(snapshotM4813k.getF17019b(), obj);
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            stateStateRecord.f17122b = new StateStateRecord(1, obj);
        }
        this.f16616c = stateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SnapshotMutationPolicy getF16615b() {
        return this.f16615b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f16616c = (StateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f16616c;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        return ((StateStateRecord) SnapshotKt.m4822t(this.f16616c, this)).f16617c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: m */
    public final StateRecord mo3364m(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (this.f16615b.mo3367a(((StateStateRecord) stateRecord2).f16617c, ((StateStateRecord) stateRecord3).f16617c)) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        Snapshot snapshotM4813k;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.m4811i(this.f16616c);
        if (this.f16615b.mo3367a(stateStateRecord.f16617c, obj)) {
            return;
        }
        StateStateRecord stateStateRecord2 = this.f16616c;
        synchronized (SnapshotKt.f17043c) {
            snapshotM4813k = SnapshotKt.m4813k();
            ((StateStateRecord) SnapshotKt.m4817o(stateStateRecord2, this, snapshotM4813k, stateStateRecord)).f16617c = obj;
        }
        SnapshotKt.m4816n(snapshotM4813k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.m4811i(this.f16616c)).f16617c + ")@" + hashCode();
    }
}
