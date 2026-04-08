package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "StateSetStateRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, KMutableSet {

    /* JADX INFO: renamed from: a */
    public StateSetStateRecord f17100a;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class StateSetStateRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: c */
        public PersistentSet f17101c;

        /* JADX INFO: renamed from: d */
        public int f17102d;

        public StateSetStateRecord(long j, PersistentSet persistentSet) {
            super(j);
            this.f17101c = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            synchronized (SnapshotStateSetKt.f17104a) {
                Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.f17101c = ((StateSetStateRecord) stateRecord).f17101c;
                this.f17102d = ((StateSetStateRecord) stateRecord).f17102d;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return new StateSetStateRecord(SnapshotKt.m4813k().getF17019b(), this.f17101c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new StateSetStateRecord(j, this.f17101c);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateSet$retainAll$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C12071 extends Lambda implements Function1<Set<Object>, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f17103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12071(Collection collection) {
            super(1);
            this.f17103a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(((Set) obj).retainAll(CollectionsKt.m18399B0(this.f17103a)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4845c(StateSetStateRecord stateSetStateRecord, int i, PersistentSet persistentSet) {
        boolean z2;
        synchronized (SnapshotStateSetKt.f17104a) {
            int i2 = stateSetStateRecord.f17102d;
            if (i2 == i) {
                stateSetStateRecord.f17101c = persistentSet;
                z2 = true;
                stateSetStateRecord.f17102d = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotM4813k;
        boolean zM4845c;
        do {
            synchronized (SnapshotStateSetKt.f17104a) {
                StateSetStateRecord stateSetStateRecord = this.f17100a;
                Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord);
                i = stateSetStateRecord2.f17102d;
                persistentSet = stateSetStateRecord2.f17101c;
            }
            Intrinsics.m18596d(persistentSet);
            PersistentSet persistentSetAdd = persistentSet.add(obj);
            if (persistentSetAdd.equals(persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.f17100a;
            Intrinsics.m18597e(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4845c = m4845c((StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord3, this, snapshotM4813k), i, persistentSetAdd);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4845c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotM4813k;
        boolean zM4845c;
        do {
            synchronized (SnapshotStateSetKt.f17104a) {
                StateSetStateRecord stateSetStateRecord = this.f17100a;
                Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord);
                i = stateSetStateRecord2.f17102d;
                persistentSet = stateSetStateRecord2.f17101c;
            }
            Intrinsics.m18596d(persistentSet);
            PersistentSet persistentSetAddAll = persistentSet.addAll(collection);
            if (Intrinsics.m18594b(persistentSetAddAll, persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.f17100a;
            Intrinsics.m18597e(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4845c = m4845c((StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord3, this, snapshotM4813k), i, persistentSetAddAll);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4845c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        Snapshot snapshotM4813k;
        StateSetStateRecord stateSetStateRecord = this.f17100a;
        Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        synchronized (SnapshotKt.f17043c) {
            snapshotM4813k = SnapshotKt.m4813k();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord, this, snapshotM4813k);
            synchronized (SnapshotStateSetKt.f17104a) {
                stateSetStateRecord2.f17101c = PersistentOrderedSet.f16881d;
                stateSetStateRecord2.f17102d++;
            }
        }
        SnapshotKt.m4816n(snapshotM4813k, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m4847j().f17101c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return m4847j().f17101c.containsAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        stateRecord.f17122b = this.f17100a;
        this.f17100a = (StateSetStateRecord) stateRecord;
    }

    /* JADX INFO: renamed from: f */
    public final int m4846f() {
        StateSetStateRecord stateSetStateRecord = this.f17100a;
        Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord)).f17102d;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f17100a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return m4847j().f17101c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new StateSetIterator(this, m4847j().f17101c.iterator());
    }

    /* JADX INFO: renamed from: j */
    public final StateSetStateRecord m4847j() {
        StateSetStateRecord stateSetStateRecord = this.f17100a;
        Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.m4822t(stateSetStateRecord, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotM4813k;
        boolean zM4845c;
        do {
            synchronized (SnapshotStateSetKt.f17104a) {
                StateSetStateRecord stateSetStateRecord = this.f17100a;
                Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord);
                i = stateSetStateRecord2.f17102d;
                persistentSet = stateSetStateRecord2.f17101c;
            }
            Intrinsics.m18596d(persistentSet);
            PersistentSet persistentSetRemove = persistentSet.remove(obj);
            if (persistentSetRemove.equals(persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.f17100a;
            Intrinsics.m18597e(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4845c = m4845c((StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord3, this, snapshotM4813k), i, persistentSetRemove);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4845c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotM4813k;
        boolean zM4845c;
        do {
            synchronized (SnapshotStateSetKt.f17104a) {
                StateSetStateRecord stateSetStateRecord = this.f17100a;
                Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord);
                i = stateSetStateRecord2.f17102d;
                persistentSet = stateSetStateRecord2.f17101c;
            }
            Intrinsics.m18596d(persistentSet);
            PersistentSet persistentSetRemoveAll = persistentSet.removeAll(collection);
            if (Intrinsics.m18594b(persistentSetRemoveAll, persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.f17100a;
            Intrinsics.m18597e(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4845c = m4845c((StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord3, this, snapshotM4813k), i, persistentSetRemoveAll);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4845c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        PersistentSet persistentSet;
        Object objInvoke;
        Snapshot snapshotM4813k;
        boolean zM4845c;
        C12071 c12071 = new C12071(collection);
        do {
            synchronized (SnapshotStateSetKt.f17104a) {
                StateSetStateRecord stateSetStateRecord = this.f17100a;
                Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord);
                i = stateSetStateRecord2.f17102d;
                persistentSet = stateSetStateRecord2.f17101c;
            }
            if (persistentSet == null) {
                throw new IllegalStateException("No set to mutate");
            }
            PersistentSet.Builder builderMo4596b = persistentSet.mo4596b();
            objInvoke = c12071.invoke(builderMo4596b);
            PersistentSet persistentSetBuild = builderMo4596b.build();
            if (Intrinsics.m18594b(persistentSetBuild, persistentSet)) {
                break;
            }
            StateSetStateRecord stateSetStateRecord3 = this.f17100a;
            Intrinsics.m18597e(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4845c = m4845c((StateSetStateRecord) SnapshotKt.m4825w(stateSetStateRecord3, this, snapshotM4813k), i, persistentSetBuild);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4845c);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return m4847j().f17101c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        StateSetStateRecord stateSetStateRecord = this.f17100a;
        Intrinsics.m18597e(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.m4811i(stateSetStateRecord)).f17101c + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
