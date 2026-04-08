package androidx.compose.runtime.snapshots;

import androidx.activity.compose.C0044a;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Snapshot {

    /* JADX INFO: renamed from: a */
    public SnapshotIdSet f17018a;

    /* JADX INFO: renamed from: b */
    public long f17019b;

    /* JADX INFO: renamed from: c */
    public boolean f17020c;

    /* JADX INFO: renamed from: d */
    public int f17021d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Snapshot m4786a() {
            return (Snapshot) SnapshotKt.f17042b.m4743a();
        }

        /* JADX INFO: renamed from: b */
        public static Snapshot m4787b(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.f17139t == Thread_jvmKt.m4747a()) {
                    transparentObserverMutableSnapshot.f17137r = null;
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.f17143h == Thread_jvmKt.m4747a()) {
                    transparentObserverSnapshot.f17142g = null;
                    return snapshot;
                }
            }
            Snapshot snapshotM4810h = SnapshotKt.m4810h(snapshot, null, false);
            snapshotM4810h.m4782j();
            return snapshotM4810h;
        }

        /* JADX INFO: renamed from: c */
        public static Object m4788c(Function0 function0, Function1 function1) {
            Snapshot transparentObserverMutableSnapshot;
            if (function1 == null) {
                return function0.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.f17042b.m4743a();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.f17139t == Thread_jvmKt.m4747a()) {
                    Function1 function12 = transparentObserverMutableSnapshot2.f17137r;
                    Function1 function13 = transparentObserverMutableSnapshot2.f17138s;
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).f17137r = SnapshotKt.m4814l(function1, function12, true);
                        ((TransparentObserverMutableSnapshot) snapshot).f17138s = function13;
                        return function0.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.f17137r = function12;
                        transparentObserverMutableSnapshot2.f17138s = function13;
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, function1, null, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.mo4762u(function1);
            }
            try {
                Snapshot snapshotM4782j = transparentObserverMutableSnapshot.m4782j();
                try {
                    Object objInvoke = function0.invoke();
                    Snapshot.m4778q(snapshotM4782j);
                    return objInvoke;
                } catch (Throwable th) {
                    Snapshot.m4778q(snapshotM4782j);
                    throw th;
                }
            } finally {
                transparentObserverMutableSnapshot.mo4758c();
            }
        }

        /* JADX INFO: renamed from: d */
        public static C0044a m4789d(Function2 function2) {
            Function1 function1 = SnapshotKt.f17041a;
            SnapshotKt.m4808f(SnapshotKt$emptyLambda$1.f17052a);
            synchronized (SnapshotKt.f17043c) {
                SnapshotKt.f17048h = CollectionsKt.m18426a0((Collection) SnapshotKt.f17048h, function2);
            }
            return new C0044a(function2);
        }

        /* JADX INFO: renamed from: e */
        public static void m4790e(Snapshot snapshot, Snapshot snapshot2, Function1 function1) {
            if (snapshot != snapshot2) {
                snapshot2.getClass();
                Snapshot.m4778q(snapshot);
                snapshot2.mo4758c();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).f17137r = function1;
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).f17142g = function1;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m4791f() {
            boolean z2;
            synchronized (SnapshotKt.f17043c) {
                MutableScatterSet mutableScatterSet = SnapshotKt.f17050j.f17006h;
                z2 = false;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.m2119d()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                SnapshotKt.m4803a();
            }
        }

        /* JADX INFO: renamed from: g */
        public static MutableSnapshot m4792g(Function1 function1, Function1 function12) {
            MutableSnapshot mutableSnapshotMo4757C;
            Snapshot snapshotM4813k = SnapshotKt.m4813k();
            MutableSnapshot mutableSnapshot = snapshotM4813k instanceof MutableSnapshot ? (MutableSnapshot) snapshotM4813k : null;
            if (mutableSnapshot == null || (mutableSnapshotMo4757C = mutableSnapshot.mo4757C(function1, function12)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotMo4757C;
        }
    }

    public Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        int iM4795a;
        int iNumberOfTrailingZeros;
        this.f17018a = snapshotIdSet;
        this.f17019b = j;
        Function1 function1 = SnapshotKt.f17041a;
        if (j != 0) {
            SnapshotIdSet f17018a = getF17018a();
            long[] jArr = f17018a.f17034d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j2 = f17018a.f17032b;
                long j3 = f17018a.f17033c;
                if (j2 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                } else {
                    long j4 = f17018a.f17031a;
                    if (j4 != 0) {
                        j3 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j3;
            }
            synchronized (SnapshotKt.f17043c) {
                iM4795a = SnapshotKt.f17046f.m4795a(j);
            }
        } else {
            iM4795a = -1;
        }
        this.f17021d = iM4795a;
    }

    /* JADX INFO: renamed from: q */
    public static void m4778q(Snapshot snapshot) {
        SnapshotKt.f17042b.m4744b(snapshot);
    }

    /* JADX INFO: renamed from: a */
    public final void m4779a() {
        synchronized (SnapshotKt.f17043c) {
            mo4766b();
            mo4772p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo4766b() {
        SnapshotKt.f17044d = SnapshotKt.f17044d.m4798e(getF17019b());
    }

    /* JADX INFO: renamed from: c */
    public void mo4758c() {
        this.f17020c = true;
        synchronized (SnapshotKt.f17043c) {
            m4783o();
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public SnapshotIdSet getF17018a() {
        return this.f17018a;
    }

    /* JADX INFO: renamed from: e */
    public abstract Function1 getF17142g();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo4768f();

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getF17019b() {
        return this.f17019b;
    }

    /* JADX INFO: renamed from: h */
    public int getF17005g() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract Function1 getF17138s();

    /* JADX INFO: renamed from: j */
    public final Snapshot m4782j() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.f17042b;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.m4743a();
        snapshotThreadLocal.m4744b(this);
        return snapshot;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo4759k();

    /* JADX INFO: renamed from: l */
    public abstract void mo4760l();

    /* JADX INFO: renamed from: m */
    public abstract void mo4761m();

    /* JADX INFO: renamed from: n */
    public abstract void mo4771n(StateObject stateObject);

    /* JADX INFO: renamed from: o */
    public final void m4783o() {
        int i = this.f17021d;
        if (i >= 0) {
            SnapshotKt.m4823u(i);
            this.f17021d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo4772p() {
        m4783o();
    }

    /* JADX INFO: renamed from: r */
    public void mo4784r(SnapshotIdSet snapshotIdSet) {
        this.f17018a = snapshotIdSet;
    }

    /* JADX INFO: renamed from: s */
    public void mo4785s(long j) {
        this.f17019b = j;
    }

    /* JADX INFO: renamed from: t */
    public void mo4773t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract Snapshot mo4762u(Function1 function1);
}
