package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "StateMapStateRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {

    /* JADX INFO: renamed from: a */
    public StateMapStateRecord f17067a;

    /* JADX INFO: renamed from: b */
    public final Set f17068b;

    /* JADX INFO: renamed from: c */
    public final Set f17069c;

    /* JADX INFO: renamed from: d */
    public final Collection f17070d;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        /* JADX INFO: renamed from: c */
        public PersistentMap f17071c;

        /* JADX INFO: renamed from: d */
        public int f17072d;

        public StateMapStateRecord(long j, PersistentMap persistentMap) {
            super(j);
            this.f17071c = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.f17073a) {
                this.f17071c = stateMapStateRecord.f17071c;
                this.f17072d = stateMapStateRecord.f17072d;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return new StateMapStateRecord(SnapshotKt.m4813k().getF17019b(), this.f17071c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new StateMapStateRecord(j, this.f17071c);
        }
    }

    public SnapshotStateMap() {
        PersistentHashMap persistentHashMap = PersistentHashMap.f16792f;
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(snapshotM4813k.getF17019b(), persistentHashMap);
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            stateMapStateRecord.f17122b = new StateMapStateRecord(1, persistentHashMap);
        }
        this.f17067a = stateMapStateRecord;
        this.f17068b = new SnapshotMapEntrySet(this);
        this.f17069c = new SnapshotMapKeySet(this);
        this.f17070d = new SnapshotMapValueSet(this);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4831c(SnapshotStateMap snapshotStateMap, StateMapStateRecord stateMapStateRecord, int i, PersistentMap persistentMap) {
        boolean z2;
        snapshotStateMap.getClass();
        synchronized (SnapshotStateMapKt.f17073a) {
            int i2 = stateMapStateRecord.f17072d;
            if (i2 == i) {
                stateMapStateRecord.f17071c = persistentMap;
                z2 = true;
                stateMapStateRecord.f17072d = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot snapshotM4813k;
        StateMapStateRecord stateMapStateRecord = this.f17067a;
        Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.m4811i(stateMapStateRecord);
        PersistentHashMap persistentHashMap = PersistentHashMap.f16792f;
        if (persistentHashMap != stateMapStateRecord2.f17071c) {
            StateMapStateRecord stateMapStateRecord3 = this.f17067a;
            Intrinsics.m18597e(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.m4825w(stateMapStateRecord3, this, snapshotM4813k);
                synchronized (SnapshotStateMapKt.f17073a) {
                    stateMapStateRecord4.f17071c = persistentHashMap;
                    stateMapStateRecord4.f17072d++;
                }
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m4832f().f17071c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m4832f().f17071c.containsValue(obj);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f17067a = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f17068b;
    }

    /* JADX INFO: renamed from: f */
    public final StateMapStateRecord m4832f() {
        StateMapStateRecord stateMapStateRecord = this.f17067a;
        Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.m4822t(stateMapStateRecord, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f17067a;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m4832f().f17071c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m4832f().f17071c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f17069c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentMap persistentMap;
        int i;
        V vPut;
        Snapshot snapshotM4813k;
        boolean zM4831c;
        do {
            synchronized (SnapshotStateMapKt.f17073a) {
                StateMapStateRecord stateMapStateRecord = this.f17067a;
                Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.m4811i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f17071c;
                i = stateMapStateRecord2.f17072d;
            }
            Intrinsics.m18596d(persistentMap);
            PersistentMap.Builder builderMo4400b = persistentMap.mo4400b();
            vPut = builderMo4400b.put(obj, obj2);
            PersistentMap persistentMapBuild = builderMo4400b.build();
            if (Intrinsics.m18594b(persistentMapBuild, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f17067a;
            Intrinsics.m18597e(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4831c = m4831c(this, (StateMapStateRecord) SnapshotKt.m4825w(stateMapStateRecord3, this, snapshotM4813k), i, persistentMapBuild);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4831c);
        return vPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        PersistentMap persistentMap;
        int i;
        Snapshot snapshotM4813k;
        boolean zM4831c;
        do {
            synchronized (SnapshotStateMapKt.f17073a) {
                StateMapStateRecord stateMapStateRecord = this.f17067a;
                Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.m4811i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f17071c;
                i = stateMapStateRecord2.f17072d;
            }
            Intrinsics.m18596d(persistentMap);
            PersistentMap.Builder builderMo4400b = persistentMap.mo4400b();
            builderMo4400b.putAll(map);
            PersistentMap persistentMapBuild = builderMo4400b.build();
            if (Intrinsics.m18594b(persistentMapBuild, persistentMap)) {
                return;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f17067a;
            Intrinsics.m18597e(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4831c = m4831c(this, (StateMapStateRecord) SnapshotKt.m4825w(stateMapStateRecord3, this, snapshotM4813k), i, persistentMapBuild);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4831c);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PersistentMap persistentMap;
        int i;
        V vRemove;
        Snapshot snapshotM4813k;
        boolean zM4831c;
        do {
            synchronized (SnapshotStateMapKt.f17073a) {
                StateMapStateRecord stateMapStateRecord = this.f17067a;
                Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.m4811i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f17071c;
                i = stateMapStateRecord2.f17072d;
            }
            Intrinsics.m18596d(persistentMap);
            PersistentMap.Builder builderMo4400b = persistentMap.mo4400b();
            vRemove = builderMo4400b.remove(obj);
            PersistentMap persistentMapBuild = builderMo4400b.build();
            if (Intrinsics.m18594b(persistentMapBuild, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f17067a;
            Intrinsics.m18597e(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4831c = m4831c(this, (StateMapStateRecord) SnapshotKt.m4825w(stateMapStateRecord3, this, snapshotM4813k), i, persistentMapBuild);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4831c);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return m4832f().f17071c.size();
    }

    public final String toString() {
        StateMapStateRecord stateMapStateRecord = this.f17067a;
        Intrinsics.m18597e(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.m4811i(stateMapStateRecord)).f17071c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f17070d;
    }
}
