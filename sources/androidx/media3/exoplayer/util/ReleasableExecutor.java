package androidx.media3.exoplayer.util;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.C1918c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ReleasableExecutor extends Executor {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.util.ReleasableExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    class C19241 implements ReleasableExecutor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExecutorService f27761a;

        public C19241(ExecutorService executorService, C1918c c1918c) {
            this.f27761a = executorService;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f27761a.execute(runnable);
        }

        @Override // androidx.media3.exoplayer.util.ReleasableExecutor
        public final void release() {
            this.f27761a.shutdown();
        }
    }

    /* JADX INFO: renamed from: M */
    static ReleasableExecutor m10682M(ExecutorService executorService, C1918c c1918c) {
        return new C19241(executorService, c1918c);
    }

    void release();
}
