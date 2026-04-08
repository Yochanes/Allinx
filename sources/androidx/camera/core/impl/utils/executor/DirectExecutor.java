package androidx.camera.core.impl.utils.executor;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: a */
    public static volatile DirectExecutor f2897a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
