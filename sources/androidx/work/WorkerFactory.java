package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/WorkerFactory;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class WorkerFactory {
    /* JADX INFO: renamed from: a */
    public abstract ListenableWorker mo12098a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public final ListenableWorker m12113b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.m18599g(appContext, "appContext");
        Intrinsics.m18599g(workerClassName, "workerClassName");
        Intrinsics.m18599g(workerParameters, "workerParameters");
        ListenableWorker listenableWorkerMo12098a = mo12098a(appContext, workerClassName, workerParameters);
        if (listenableWorkerMo12098a == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
                Intrinsics.m18598f(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    Intrinsics.m18598f(objNewInstance, "{\n                val co…Parameters)\n            }");
                    listenableWorkerMo12098a = (ListenableWorker) objNewInstance;
                } catch (Throwable th) {
                    Logger.m12100e().mo12105d(WorkerFactoryKt.f32634a, "Could not instantiate ".concat(workerClassName), th);
                    throw th;
                }
            } catch (Throwable th2) {
                Logger.m12100e().mo12105d(WorkerFactoryKt.f32634a, "Invalid class: ".concat(workerClassName), th2);
                throw th2;
            }
        }
        if (!listenableWorkerMo12098a.isUsed()) {
            return listenableWorkerMo12098a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
