package androidx.compose.runtime.snapshots;

import androidx.activity.compose.C0044a;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "ObservedScopeMap", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SnapshotStateObserver {

    /* JADX INFO: renamed from: a */
    public final Lambda f17074a;

    /* JADX INFO: renamed from: c */
    public boolean f17076c;

    /* JADX INFO: renamed from: h */
    public C0044a f17081h;

    /* JADX INFO: renamed from: i */
    public ObservedScopeMap f17082i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f17075b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final Function2 f17077d = new SnapshotStateObserver$applyObserver$1(this);

    /* JADX INFO: renamed from: e */
    public final Function1 f17078e = new SnapshotStateObserver$readObserver$1(this);

    /* JADX INFO: renamed from: f */
    public final MutableVector f17079f = new MutableVector(new ObservedScopeMap[16], 0);

    /* JADX INFO: renamed from: g */
    public final Object f17080g = new Object();

    /* JADX INFO: renamed from: j */
    public long f17083j = -1;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ObservedScopeMap {

        /* JADX INFO: renamed from: a */
        public final Function1 f17084a;

        /* JADX INFO: renamed from: b */
        public Object f17085b;

        /* JADX INFO: renamed from: c */
        public MutableObjectIntMap f17086c;

        /* JADX INFO: renamed from: j */
        public int f17093j;

        /* JADX INFO: renamed from: d */
        public int f17087d = -1;

        /* JADX INFO: renamed from: e */
        public final MutableScatterMap f17088e = ScopeMap.m4589c();

        /* JADX INFO: renamed from: f */
        public final MutableScatterMap f17089f = new MutableScatterMap();

        /* JADX INFO: renamed from: g */
        public final MutableScatterSet f17090g = new MutableScatterSet();

        /* JADX INFO: renamed from: h */
        public final MutableVector f17091h = new MutableVector(new DerivedState[16], 0);

        /* JADX INFO: renamed from: i */
        public final SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 f17092i = new SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1(this);

        /* JADX INFO: renamed from: k */
        public final MutableScatterMap f17094k = ScopeMap.m4589c();

        /* JADX INFO: renamed from: l */
        public final HashMap f17095l = new HashMap();

        public ObservedScopeMap(Function1 function1) {
            this.f17084a = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m4840a(Object obj, Function1 function1, Function0 function0) {
            boolean z2;
            int i;
            int i2;
            Object obj2 = this.f17085b;
            MutableObjectIntMap mutableObjectIntMap = this.f17086c;
            int i3 = this.f17087d;
            this.f17085b = obj;
            this.f17086c = (MutableObjectIntMap) this.f17089f.m2109e(obj);
            if (this.f17087d == -1) {
                this.f17087d = Long.hashCode(SnapshotKt.m4813k().getF17019b());
            }
            SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 = this.f17092i;
            MutableVector mutableVectorM4521c = SnapshotStateKt.m4521c();
            boolean z3 = true;
            try {
                mutableVectorM4521c.m4568b(snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1);
                Snapshot.Companion.m4788c(function0, function1);
                mutableVectorM4521c.m4577k(mutableVectorM4521c.f16736c - 1);
                Object obj3 = this.f17085b;
                Intrinsics.m18596d(obj3);
                int i4 = this.f17087d;
                MutableObjectIntMap mutableObjectIntMap2 = this.f17086c;
                if (mutableObjectIntMap2 != null) {
                    long[] jArr = mutableObjectIntMap2.f3812a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                z2 = z3;
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i2 = i6;
                                        Object obj4 = mutableObjectIntMap2.f3813b[i9];
                                        i = i8;
                                        boolean z4 = mutableObjectIntMap2.f3814c[i9] != i4 ? z2 : false;
                                        if (z4) {
                                            m4843d(obj3, obj4);
                                        }
                                        if (z4) {
                                            mutableObjectIntMap2.m2056g(i9);
                                        }
                                    } else {
                                        i = i8;
                                        i2 = i6;
                                    }
                                    j >>= i2;
                                    i8 = i + 1;
                                    i6 = i2;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                z2 = z3;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                            z3 = z2;
                        }
                    }
                }
                this.f17085b = obj2;
                this.f17086c = mutableObjectIntMap;
                this.f17087d = i3;
            } catch (Throwable th) {
                mutableVectorM4521c.m4577k(mutableVectorM4521c.f16736c - 1);
                throw th;
            }
        }

        /*  JADX ERROR: Type inference failed with stack overflow
            jadx.core.utils.exceptions.JadxOverflowException
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        /* JADX INFO: renamed from: b */
        public final boolean m4841b(java.util.Set r46) {
            /*
                Method dump skipped, instruction units count: 1569
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.m4841b(java.util.Set):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m4842c(Object obj, int i, Object obj2, MutableObjectIntMap mutableObjectIntMap) {
            int i2;
            if (this.f17093j > 0) {
                return;
            }
            int iM2054e = mutableObjectIntMap.m2054e(obj);
            if (iM2054e < 0) {
                iM2054e = ~iM2054e;
                i2 = -1;
            } else {
                i2 = mutableObjectIntMap.f3814c[iM2054e];
            }
            mutableObjectIntMap.f3813b[iM2054e] = obj;
            mutableObjectIntMap.f3814c[iM2054e] = i;
            if ((obj instanceof DerivedState) && i2 != i) {
                DerivedSnapshotState.ResultRecord resultRecordMo4362F = ((DerivedState) obj).mo4362F();
                this.f17095l.put(obj, resultRecordMo4362F.f16349f);
                MutableObjectIntMap mutableObjectIntMap2 = resultRecordMo4362F.f16348e;
                MutableScatterMap mutableScatterMap = this.f17094k;
                ScopeMap.m4591e(mutableScatterMap, obj);
                Object[] objArr = mutableObjectIntMap2.f3813b;
                long[] jArr = mutableObjectIntMap2.f3812a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i3 << 3) + i5];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m4851x(2);
                                    }
                                    ScopeMap.m4587a(mutableScatterMap, stateObject, obj);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            } else if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).m4851x(2);
                }
                ScopeMap.m4587a(this.f17088e, obj, obj2);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m4843d(Object obj, Object obj2) {
            MutableScatterMap mutableScatterMap = this.f17088e;
            ScopeMap.m4590d(mutableScatterMap, obj2, obj);
            if (!(obj2 instanceof DerivedState) || mutableScatterMap.m2107c(obj2)) {
                return;
            }
            ScopeMap.m4591e(this.f17094k, obj2);
            this.f17095l.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m4844e(Function1 function1) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c2;
            long j2;
            int i;
            long j3;
            MutableScatterMap mutableScatterMap = this.f17089f;
            long[] jArr3 = mutableScatterMap.f3839a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c3 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c2 = c3;
                            Object obj = mutableScatterMap.f3840b[i6];
                            j2 = j5;
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.f3841c[i6];
                            Boolean bool = (Boolean) function1.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.f3813b;
                                int[] iArr = mutableObjectIntMap.f3814c;
                                long[] jArr4 = mutableObjectIntMap.f3812a;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c2) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    m4843d(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                            if (i8 == length2) {
                                                break;
                                            }
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j = j4;
                                }
                                if (bool.booleanValue()) {
                                    mutableScatterMap.m2080l(i6);
                                }
                                i = 8;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c2 = c3;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c3 = c2;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1 function1) {
        this.f17074a = (Lambda) function1;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4834a(SnapshotStateObserver snapshotStateObserver) {
        boolean z2;
        Set set;
        synchronized (snapshotStateObserver.f17080g) {
            z2 = snapshotStateObserver.f17076c;
        }
        if (z2) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            AtomicReference atomicReference = snapshotStateObserver.f17075b;
            Object obj = atomicReference.get();
            Set set2 = null;
            Object obj2 = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.m4317d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z3;
            }
            synchronized (snapshotStateObserver.f17080g) {
                MutableVector mutableVector = snapshotStateObserver.f17079f;
                Object[] objArr = mutableVector.f16734a;
                int i = mutableVector.f16736c;
                for (int i2 = 0; i2 < i; i2++) {
                    z3 = ((ObservedScopeMap) objArr[i2]).m4841b(set2) || z3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4835b() {
        synchronized (this.f17080g) {
            MutableVector mutableVector = this.f17079f;
            Object[] objArr = mutableVector.f16734a;
            int i = mutableVector.f16736c;
            for (int i2 = 0; i2 < i; i2++) {
                ObservedScopeMap observedScopeMap = (ObservedScopeMap) objArr[i2];
                observedScopeMap.f17088e.m2075g();
                observedScopeMap.f17089f.m2075g();
                observedScopeMap.f17094k.m2075g();
                observedScopeMap.f17095l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4836c(Object obj) {
        int i;
        synchronized (this.f17080g) {
            try {
                MutableVector mutableVector = this.f17079f;
                int i2 = mutableVector.f16736c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.f16734a[i3];
                    MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) observedScopeMap.f17089f.m2079k(obj);
                    if (mutableObjectIntMap == null) {
                        i = i3;
                    } else {
                        Object[] objArr = mutableObjectIntMap.f3813b;
                        int[] iArr = mutableObjectIntMap.f3814c;
                        long[] jArr = mutableObjectIntMap.f3812a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                i = i3;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j & 255) < 128) {
                                            int i8 = (i5 << 3) + i7;
                                            Object obj2 = objArr[i8];
                                            int i9 = iArr[i8];
                                            observedScopeMap.m4843d(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        break;
                                    }
                                    if (i5 == length) {
                                        break;
                                    }
                                    i5++;
                                    i3 = i;
                                }
                            }
                        }
                    }
                    if (!(observedScopeMap.f17089f.f3843e != 0)) {
                        i4++;
                    } else if (i4 > 0) {
                        Object[] objArr2 = mutableVector.f16734a;
                        objArr2[i - i4] = objArr2[i];
                    }
                    i3 = i + 1;
                }
                int i10 = i2 - i4;
                Arrays.fill(mutableVector.f16734a, i10, i2, (Object) null);
                mutableVector.f16736c = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4837d(Function1 function1) {
        synchronized (this.f17080g) {
            try {
                MutableVector mutableVector = this.f17079f;
                int i = mutableVector.f16736c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.f16734a[i3];
                    observedScopeMap.m4844e(function1);
                    if (!(observedScopeMap.f17089f.f3843e != 0)) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.f16734a;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i4 = i - i2;
                Arrays.fill(mutableVector.f16734a, i4, i, (Object) null);
                mutableVector.f16736c = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4838e(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        ObservedScopeMap observedScopeMap;
        synchronized (this.f17080g) {
            MutableVector mutableVector = this.f17079f;
            Object[] objArr = mutableVector.f16734a;
            int i = mutableVector.f16736c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((ObservedScopeMap) obj2).f17084a == function1) {
                    break;
                } else {
                    i2++;
                }
            }
            observedScopeMap = (ObservedScopeMap) obj2;
            if (observedScopeMap == null) {
                Intrinsics.m18597e(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                TypeIntrinsics.m18629e(1, function1);
                observedScopeMap = new ObservedScopeMap(function1);
                mutableVector.m4568b(observedScopeMap);
            }
        }
        ObservedScopeMap observedScopeMap2 = this.f17082i;
        long j = this.f17083j;
        if (j != -1 && j != Thread_jvmKt.m4747a()) {
            StringBuilder sbM22s = AbstractC0000a.m22s("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=", j);
            sbM22s.append(Thread_jvmKt.m4747a());
            sbM22s.append(", name=");
            sbM22s.append(Thread.currentThread().getName());
            sbM22s.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            PreconditionsKt.m4402a(sbM22s.toString());
        }
        try {
            this.f17082i = observedScopeMap;
            this.f17083j = Thread_jvmKt.m4747a();
            observedScopeMap.m4840a(obj, this.f17078e, function0);
        } finally {
            this.f17082i = observedScopeMap2;
            this.f17083j = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4839f() {
        this.f17081h = Snapshot.Companion.m4789d(this.f17077d);
    }
}
