package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SnapshotThreadLocal<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f16945a = new AtomicReference(SnapshotThreadLocalKt.f16948a);

    /* JADX INFO: renamed from: b */
    public final Object f16946b = new Object();

    /* JADX INFO: renamed from: c */
    public Object f16947c;

    /* JADX INFO: renamed from: a */
    public final Object m4743a() {
        long jM4747a = Thread_jvmKt.m4747a();
        if (jM4747a == Thread_androidKt.f16952a) {
            return this.f16947c;
        }
        ThreadMap threadMap = (ThreadMap) this.f16945a.get();
        int iM4745a = threadMap.m4745a(jM4747a);
        if (iM4745a >= 0) {
            return threadMap.f16951c[iM4745a];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4744b(Object obj) {
        long jM4747a = Thread_jvmKt.m4747a();
        if (jM4747a == Thread_androidKt.f16952a) {
            this.f16947c = obj;
            return;
        }
        synchronized (this.f16946b) {
            ThreadMap threadMap = (ThreadMap) this.f16945a.get();
            int iM4745a = threadMap.m4745a(jM4747a);
            if (iM4745a < 0) {
                this.f16945a.set(threadMap.m4746b(jM4747a, obj));
            } else {
                threadMap.f16951c[iM4745a] = obj;
            }
        }
    }
}
