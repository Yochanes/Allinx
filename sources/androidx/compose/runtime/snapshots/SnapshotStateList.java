package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "StateListStateRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, KMutableList {

    /* JADX INFO: renamed from: a */
    public StateListStateRecord f17059a;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class StateListStateRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: c */
        public PersistentList f17060c;

        /* JADX INFO: renamed from: d */
        public int f17061d;

        /* JADX INFO: renamed from: e */
        public int f17062e;

        public StateListStateRecord(long j, PersistentList persistentList) {
            super(j);
            this.f17060c = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            synchronized (SnapshotStateListKt.f17066a) {
                Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.f17060c = ((StateListStateRecord) stateRecord).f17060c;
                this.f17061d = ((StateListStateRecord) stateRecord).f17061d;
                this.f17062e = ((StateListStateRecord) stateRecord).f17062e;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return mo4364c(SnapshotKt.m4813k().getF17019b());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new StateListStateRecord(j, this.f17060c);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C12051 extends Lambda implements Function1<List<Object>, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f17063a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collection f17064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12051(int i, Collection collection) {
            super(1);
            this.f17063a = i;
            this.f17064b = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f17063a, this.f17064b));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C12061 extends Lambda implements Function1<List<Object>, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f17065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12061(Collection collection) {
            super(1);
            this.f17065a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f17065a));
        }
    }

    public SnapshotStateList() {
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.f16783b;
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(snapshotM4813k.getF17019b(), smallPersistentVector);
        if (!(snapshotM4813k instanceof GlobalSnapshot)) {
            stateListStateRecord.f17122b = new StateListStateRecord(1, smallPersistentVector);
        }
        this.f17059a = stateListStateRecord;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4826c(StateListStateRecord stateListStateRecord, int i, PersistentList persistentList, boolean z2) {
        boolean z3;
        synchronized (SnapshotStateListKt.f17066a) {
            try {
                int i2 = stateListStateRecord.f17061d;
                if (i2 == i) {
                    stateListStateRecord.f17060c = persistentList;
                    z3 = true;
                    if (z2) {
                        stateListStateRecord.f17062e++;
                    }
                    stateListStateRecord.f17061d = i2 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListAdd = persistentList.add(obj);
            if (persistentListAdd.equals(persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i, persistentListAdd, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return m4829k(new C12051(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot snapshotM4813k;
        StateListStateRecord stateListStateRecord = this.f17059a;
        Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (SnapshotKt.f17043c) {
            snapshotM4813k = SnapshotKt.m4813k();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord, this, snapshotM4813k);
            synchronized (SnapshotStateListKt.f17066a) {
                stateListStateRecord2.f17060c = SmallPersistentVector.f16783b;
                stateListStateRecord2.f17061d++;
                stateListStateRecord2.f17062e++;
            }
        }
        SnapshotKt.m4816n(snapshotM4813k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return m4827f().f17060c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return m4827f().f17060c.containsAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        stateRecord.f17122b = this.f17059a;
        this.f17059a = (StateListStateRecord) stateRecord;
    }

    /* JADX INFO: renamed from: f */
    public final StateListStateRecord m4827f() {
        StateListStateRecord stateListStateRecord = this.f17059a;
        Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.m4822t(stateListStateRecord, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f17059a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return m4827f().f17060c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m4827f().f17060c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return m4827f().f17060c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX INFO: renamed from: j */
    public final int m4828j() {
        StateListStateRecord stateListStateRecord = this.f17059a;
        Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord)).f17062e;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4829k(Function1 function1) {
        int i;
        PersistentList persistentList;
        Object objInvoke;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentVectorBuilder persistentVectorBuilderMo4593b = persistentList.mo4593b();
            objInvoke = function1.invoke(persistentVectorBuilderMo4593b);
            PersistentList persistentListM4622f = persistentVectorBuilderMo4593b.m4622f();
            if (Intrinsics.m18594b(persistentListM4622f, persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i, persistentListM4622f, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return m4827f().f17060c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        Object obj = get(i);
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i2 = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListMo4594x = persistentList.mo4594x(i);
            if (persistentListMo4594x.equals(persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i2, persistentListMo4594x, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListRemoveAll = persistentList.removeAll(collection);
            if (Intrinsics.m18594b(persistentListRemoveAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i, persistentListRemoveAll, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return m4829k(new C12061(collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        Object obj2 = get(i);
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i2 = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentList2 = persistentList.set(i, obj);
            if (persistentList2.equals(persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i2, persistentList2, false);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return m4827f().f17060c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            PreconditionsKt.m4402a("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        StateListStateRecord stateListStateRecord = this.f17059a;
        Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord)).f17060c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListAddAll = persistentList.addAll(collection);
            if (Intrinsics.m18594b(persistentListAddAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i, persistentListAddAll, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new StateListIterator(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i2 = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListAdd = persistentList.add(i, obj);
            if (persistentListAdd.equals(persistentList)) {
                return;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i2, persistentListAdd, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotM4813k;
        boolean zM4826c;
        do {
            synchronized (SnapshotStateListKt.f17066a) {
                StateListStateRecord stateListStateRecord = this.f17059a;
                Intrinsics.m18597e(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.m4811i(stateListStateRecord);
                i = stateListStateRecord2.f17061d;
                persistentList = stateListStateRecord2.f17060c;
            }
            Intrinsics.m18596d(persistentList);
            PersistentList persistentListRemove = persistentList.remove(obj);
            if (Intrinsics.m18594b(persistentListRemove, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f17059a;
            Intrinsics.m18597e(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f17043c) {
                snapshotM4813k = SnapshotKt.m4813k();
                zM4826c = m4826c((StateListStateRecord) SnapshotKt.m4825w(stateListStateRecord3, this, snapshotM4813k), i, persistentListRemove, true);
            }
            SnapshotKt.m4816n(snapshotM4813k, this);
        } while (!zM4826c);
        return true;
    }
}
