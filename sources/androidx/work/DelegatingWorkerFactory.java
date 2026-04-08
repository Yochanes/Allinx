package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/DelegatingWorkerFactory;", "Landroidx/work/WorkerFactory;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class DelegatingWorkerFactory extends WorkerFactory {
    @Override // androidx.work.WorkerFactory
    /* JADX INFO: renamed from: a */
    public final ListenableWorker mo12098a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.m18599g(appContext, "appContext");
        Intrinsics.m18599g(workerClassName, "workerClassName");
        Intrinsics.m18599g(workerParameters, "workerParameters");
        throw null;
    }
}
