package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "ResultRecord", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    /* JADX INFO: renamed from: b */
    public final Function0 f16342b;

    /* JADX INFO: renamed from: c */
    public final SnapshotMutationPolicy f16343c;

    /* JADX INFO: renamed from: d */
    public ResultRecord f16344d = new ResultRecord(SnapshotKt.m4813k().getF17019b());

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* JADX INFO: renamed from: h */
        public static final Object f16345h = new Object();

        /* JADX INFO: renamed from: c */
        public long f16346c;

        /* JADX INFO: renamed from: d */
        public int f16347d;

        /* JADX INFO: renamed from: e */
        public MutableObjectIntMap f16348e;

        /* JADX INFO: renamed from: f */
        public Object f16349f;

        /* JADX INFO: renamed from: g */
        public int f16350g;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public ResultRecord(long j) {
            super(j);
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f3817a;
            Intrinsics.m18597e(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f16348e = mutableObjectIntMap;
            this.f16349f = f16345h;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: a */
        public final void mo3365a(StateRecord stateRecord) {
            Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.f16348e = resultRecord.f16348e;
            this.f16349f = resultRecord.f16349f;
            this.f16350g = resultRecord.f16350g;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: b */
        public final StateRecord mo3366b() {
            return new ResultRecord(SnapshotKt.m4813k().getF17019b());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* JADX INFO: renamed from: c */
        public final StateRecord mo4364c(long j) {
            return new ResultRecord(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m4365d(DerivedState derivedState, Snapshot snapshot) {
            boolean z2;
            boolean z3;
            Object obj = SnapshotKt.f17043c;
            synchronized (obj) {
                z2 = true;
                if (this.f16346c == snapshot.getF17019b()) {
                    z3 = this.f16347d != snapshot.mo4769h();
                }
            }
            if (this.f16349f == f16345h || (z3 && this.f16350g != m4366e(derivedState, snapshot))) {
                z2 = false;
            }
            if (!z2 || !z3) {
                return z2;
            }
            synchronized (obj) {
                this.f16346c = snapshot.getF17019b();
                this.f16347d = snapshot.mo4769h();
            }
            return z2;
        }

        /* JADX INFO: renamed from: e */
        public final int m4366e(DerivedState derivedState, Snapshot snapshot) throws Throwable {
            MutableObjectIntMap mutableObjectIntMap;
            int i;
            int i2;
            int iIdentityHashCode;
            int i3;
            int i4;
            StateRecord stateRecordM4812j;
            synchronized (SnapshotKt.f17043c) {
                mutableObjectIntMap = this.f16348e;
            }
            int i5 = 1;
            int i6 = 7;
            if (!(mutableObjectIntMap.f3816e != 0)) {
                return 7;
            }
            MutableVector mutableVectorM4521c = SnapshotStateKt.m4521c();
            Object[] objArr = mutableVectorM4521c.f16734a;
            int i7 = mutableVectorM4521c.f16736c;
            for (int i8 = 0; i8 < i7; i8++) {
                ((DerivedStateObserver) objArr[i8]).start();
            }
            try {
                Object[] objArr2 = mutableObjectIntMap.f3813b;
                int[] iArr = mutableObjectIntMap.f3814c;
                long[] jArr = mutableObjectIntMap.f3812a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            i3 = i6;
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j & 255) < 128) {
                                    int i13 = (i9 << 3) + i12;
                                    i4 = i10;
                                    StateObject stateObject = (StateObject) objArr2[i13];
                                    if (iArr[i13] == i5) {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) stateObject;
                                            i = 0;
                                            try {
                                                stateRecordM4812j = derivedSnapshotState.m4361B((ResultRecord) SnapshotKt.m4812j(derivedSnapshotState.f16344d, snapshot), snapshot, false, derivedSnapshotState.f16342b);
                                            } catch (Throwable th) {
                                                th = th;
                                                Object[] objArr3 = mutableVectorM4521c.f16734a;
                                                int i14 = mutableVectorM4521c.f16736c;
                                                for (int i15 = i; i15 < i14; i15++) {
                                                    ((DerivedStateObserver) objArr3[i15]).mo4313a();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = 0;
                                            stateRecordM4812j = SnapshotKt.m4812j(stateObject.mo3363g(), snapshot);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(stateRecordM4812j)) * 31) + Long.hashCode(stateRecordM4812j.f17121a);
                                        j >>= i4;
                                        i12++;
                                        i10 = i4;
                                        i5 = 1;
                                    }
                                } else {
                                    i4 = i10;
                                }
                                j >>= i4;
                                i12++;
                                i10 = i4;
                                i5 = 1;
                            }
                            i2 = 0;
                            if (i11 != i10) {
                                break;
                            }
                        } else {
                            i3 = i6;
                            i2 = 0;
                        }
                        if (i9 == length) {
                            i6 = iIdentityHashCode;
                            break;
                        }
                        i9++;
                        i6 = i3;
                        i5 = 1;
                    }
                } else {
                    i2 = 0;
                }
                iIdentityHashCode = i6;
                Object[] objArr4 = mutableVectorM4521c.f16734a;
                int i16 = mutableVectorM4521c.f16736c;
                for (int i17 = i2; i17 < i16; i17++) {
                    ((DerivedStateObserver) objArr4[i17]).mo4313a();
                }
                return iIdentityHashCode;
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
        }
    }

    public DerivedSnapshotState(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        this.f16342b = function0;
        this.f16343c = snapshotMutationPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ResultRecord m4361B(ResultRecord resultRecord, Snapshot snapshot, boolean z2, Function0 function0) {
        MutableVector mutableVectorM4521c;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i;
        ResultRecord resultRecord2 = resultRecord;
        if (resultRecord2.m4365d(this, snapshot)) {
            if (z2) {
                mutableVectorM4521c = SnapshotStateKt.m4521c();
                Object[] objArr = mutableVectorM4521c.f16734a;
                int i2 = mutableVectorM4521c.f16736c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((DerivedStateObserver) objArr[i3]).start();
                }
                try {
                    MutableObjectIntMap mutableObjectIntMap = resultRecord2.f16348e;
                    SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f16618a;
                    IntRef intRef = (IntRef) snapshotThreadLocal.m4743a();
                    if (intRef == null) {
                        intRef = new IntRef();
                        snapshotThreadLocal.m4744b(intRef);
                    }
                    int i4 = intRef.f16929a;
                    Object[] objArr2 = mutableObjectIntMap.f3813b;
                    int[] iArr = mutableObjectIntMap.f3814c;
                    long[] jArr = mutableObjectIntMap.f3812a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        StateObject stateObject = (StateObject) objArr2[i9];
                                        intRef.f16929a = i4 + iArr[i9];
                                        Function1 function1Mo4767e = snapshot.mo4767e();
                                        if (function1Mo4767e != null) {
                                            function1Mo4767e.invoke(stateObject);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    intRef.f16929a = i4;
                    Object[] objArr3 = mutableVectorM4521c.f16734a;
                    int i10 = mutableVectorM4521c.f16736c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((DerivedStateObserver) objArr3[i11]).mo4313a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return resultRecord2;
        }
        MutableObjectIntMap mutableObjectIntMap2 = new MutableObjectIntMap();
        SnapshotThreadLocal snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.f16618a;
        IntRef intRef2 = (IntRef) snapshotThreadLocal2.m4743a();
        if (intRef2 == null) {
            intRef2 = new IntRef();
            snapshotThreadLocal2.m4744b(intRef2);
        }
        int i12 = intRef2.f16929a;
        mutableVectorM4521c = SnapshotStateKt.m4521c();
        Object[] objArr4 = mutableVectorM4521c.f16734a;
        int i13 = mutableVectorM4521c.f16736c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((DerivedStateObserver) objArr4[i14]).start();
        }
        try {
            intRef2.f16929a = i12 + 1;
            Object objM4788c = Snapshot.Companion.m4788c(function0, new DerivedSnapshotState$currentRecord$result$1$1$result$1(this, intRef2, mutableObjectIntMap2, i12));
            intRef2.f16929a = i12;
            Object[] objArr5 = mutableVectorM4521c.f16734a;
            int i15 = mutableVectorM4521c.f16736c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((DerivedStateObserver) objArr5[i16]).mo4313a();
            }
            Object obj = SnapshotKt.f17043c;
            synchronized (obj) {
                try {
                    Snapshot snapshotM4813k = SnapshotKt.m4813k();
                    Object obj2 = resultRecord2.f16349f;
                    if (obj2 == ResultRecord.f16345h || (snapshotMutationPolicy = this.f16343c) == null || !snapshotMutationPolicy.mo3367a(objM4788c, obj2)) {
                        ResultRecord resultRecord3 = this.f16344d;
                        synchronized (obj) {
                            StateRecord stateRecordM4815m = SnapshotKt.m4815m(resultRecord3, this);
                            stateRecordM4815m.mo3365a(resultRecord3);
                            stateRecordM4815m.f17121a = snapshotM4813k.getF17019b();
                            resultRecord2 = (ResultRecord) stateRecordM4815m;
                            resultRecord2.f16348e = mutableObjectIntMap2;
                            resultRecord2.f16350g = resultRecord2.m4366e(this, snapshotM4813k);
                            resultRecord2.f16349f = objM4788c;
                        }
                        return resultRecord2;
                    }
                    resultRecord2.f16348e = mutableObjectIntMap2;
                    resultRecord2.f16350g = resultRecord2.m4366e(this, snapshotM4813k);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.f16618a.m4743a();
            if (intRef3 == null || intRef3.f16929a != 0) {
                return resultRecord2;
            }
            SnapshotKt.m4813k().mo4761m();
            synchronized (obj) {
                Snapshot snapshotM4813k2 = SnapshotKt.m4813k();
                resultRecord2.f16346c = snapshotM4813k2.getF17019b();
                resultRecord2.f16347d = snapshotM4813k2.mo4769h();
                return resultRecord2;
            }
        } finally {
            Object[] objArr6 = mutableVectorM4521c.f16734a;
            int i17 = mutableVectorM4521c.f16736c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((DerivedStateObserver) objArr6[i18]).mo4313a();
            }
        }
    }

    @Override // androidx.compose.runtime.DerivedState
    /* JADX INFO: renamed from: F */
    public final ResultRecord mo4362F() {
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        return m4361B((ResultRecord) SnapshotKt.m4812j(this.f16344d, snapshotM4813k), snapshotM4813k, false, this.f16342b);
    }

    @Override // androidx.compose.runtime.DerivedState
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SnapshotMutationPolicy getF16343c() {
        return this.f16343c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: e */
    public final void mo3362e(StateRecord stateRecord) {
        Intrinsics.m18597e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f16344d = (ResultRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: g */
    public final StateRecord mo3363g() {
        return this.f16344d;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        Function1 function1Mo4767e = SnapshotKt.m4813k().mo4767e();
        if (function1Mo4767e != null) {
            function1Mo4767e.invoke(this);
        }
        Snapshot snapshotM4813k = SnapshotKt.m4813k();
        return m4361B((ResultRecord) SnapshotKt.m4812j(this.f16344d, snapshotM4813k), snapshotM4813k, true, this.f16342b).f16349f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.m4811i(this.f16344d);
        sb.append(resultRecord.m4365d(this, SnapshotKt.m4813k()) ? String.valueOf(resultRecord.f16349f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
