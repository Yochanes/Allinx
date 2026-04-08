package androidx.camera.core.impl.utils.executor;

import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f2915b;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f2914a = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final QueueWorker f2916c = new QueueWorker();

    /* JADX INFO: renamed from: d */
    public WorkerRunningState f2917d = WorkerRunningState.f2921a;

    /* JADX INFO: renamed from: f */
    public long f2918f = 0;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC02951 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2919a;

        public RunnableC02951(Runnable runnable) {
            this.f2919a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2919a.run();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class QueueWorker implements Runnable {
        public QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            androidx.camera.core.Logger.m1283d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m1621a() {
            Runnable runnable;
            boolean z2 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.this.f2914a) {
                        if (z2) {
                            runnable = (Runnable) SequentialExecutor.this.f2914a.poll();
                            if (runnable != null) {
                            }
                        } else {
                            SequentialExecutor sequentialExecutor = SequentialExecutor.this;
                            WorkerRunningState workerRunningState = sequentialExecutor.f2917d;
                            WorkerRunningState workerRunningState2 = WorkerRunningState.f2924d;
                            if (workerRunningState != workerRunningState2) {
                                sequentialExecutor.f2918f++;
                                sequentialExecutor.f2917d = workerRunningState2;
                                z2 = true;
                                runnable = (Runnable) SequentialExecutor.this.f2914a.poll();
                                if (runnable != null) {
                                    SequentialExecutor.this.f2917d = WorkerRunningState.f2921a;
                                }
                            }
                        }
                    }
                    if (!zInterrupted) {
                        return;
                    }
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                m1621a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f2914a) {
                    SequentialExecutor.this.f2917d = WorkerRunningState.f2921a;
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class WorkerRunningState {

        /* JADX INFO: renamed from: a */
        public static final WorkerRunningState f2921a;

        /* JADX INFO: renamed from: b */
        public static final WorkerRunningState f2922b;

        /* JADX INFO: renamed from: c */
        public static final WorkerRunningState f2923c;

        /* JADX INFO: renamed from: d */
        public static final WorkerRunningState f2924d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ WorkerRunningState[] f2925f;

        static {
            WorkerRunningState workerRunningState = new WorkerRunningState("IDLE", 0);
            f2921a = workerRunningState;
            WorkerRunningState workerRunningState2 = new WorkerRunningState("QUEUING", 1);
            f2922b = workerRunningState2;
            WorkerRunningState workerRunningState3 = new WorkerRunningState("QUEUED", 2);
            f2923c = workerRunningState3;
            WorkerRunningState workerRunningState4 = new WorkerRunningState("RUNNING", 3);
            f2924d = workerRunningState4;
            f2925f = new WorkerRunningState[]{workerRunningState, workerRunningState2, workerRunningState3, workerRunningState4};
        }

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) f2925f.clone();
        }
    }

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.f2915b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z2;
        runnable.getClass();
        synchronized (this.f2914a) {
            WorkerRunningState workerRunningState2 = this.f2917d;
            if (workerRunningState2 != WorkerRunningState.f2924d && workerRunningState2 != (workerRunningState = WorkerRunningState.f2923c)) {
                long j = this.f2918f;
                RunnableC02951 runnableC02951 = new RunnableC02951(runnable);
                this.f2914a.add(runnableC02951);
                WorkerRunningState workerRunningState3 = WorkerRunningState.f2922b;
                this.f2917d = workerRunningState3;
                try {
                    this.f2915b.execute(this.f2916c);
                    if (this.f2917d != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f2914a) {
                        try {
                            if (this.f2918f == j && this.f2917d == workerRunningState3) {
                                this.f2917d = workerRunningState;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f2914a) {
                        try {
                            WorkerRunningState workerRunningState4 = this.f2917d;
                            if (workerRunningState4 == WorkerRunningState.f2921a || workerRunningState4 == WorkerRunningState.f2922b) {
                                z2 = this.f2914a.removeLastOccurrence(runnableC02951);
                            }
                            if (!(e instanceof RejectedExecutionException) || z2) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2914a.add(runnable);
        }
    }
}
