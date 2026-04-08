package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class StateObjectImpl implements StateObject {

    /* JADX INFO: renamed from: a */
    public final AtomicInt f17120a = new AtomicInt(0);

    /* JADX INFO: renamed from: h */
    public final boolean m4850h(int i) {
        return (i & this.f17120a.get()) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m4851x(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.f17120a;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
