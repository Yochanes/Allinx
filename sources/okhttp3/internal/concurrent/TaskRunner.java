package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import p001A.AbstractC0000a;
import p009K.ThreadFactoryC0019a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Backend", "Companion", "RealBackend", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TaskRunner {

    /* JADX INFO: renamed from: h */
    public static final Companion f57359h = new Companion();

    /* JADX INFO: renamed from: i */
    public static final TaskRunner f57360i;

    /* JADX INFO: renamed from: j */
    public static final Logger f57361j;

    /* JADX INFO: renamed from: a */
    public final RealBackend f57362a;

    /* JADX INFO: renamed from: c */
    public boolean f57364c;

    /* JADX INFO: renamed from: d */
    public long f57365d;

    /* JADX INFO: renamed from: b */
    public int f57363b = 10000;

    /* JADX INFO: renamed from: e */
    public final ArrayList f57366e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f57367f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final TaskRunner$runnable$1 f57368g = new TaskRunner$runnable$1(this);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Backend {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a */
        public final ThreadPoolExecutor f57369a;

        public RealBackend(ThreadFactoryC0019a threadFactoryC0019a) {
            this.f57369a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC0019a);
        }

        /* JADX INFO: renamed from: a */
        public final void m21380a(TaskRunner$runnable$1 runnable) {
            Intrinsics.m18599g(runnable, "runnable");
            this.f57369a.execute(runnable);
        }
    }

    static {
        String name = Util.f57280g + " TaskRunner";
        Intrinsics.m18599g(name, "name");
        f57360i = new TaskRunner(new RealBackend(new ThreadFactoryC0019a(name, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.m18598f(logger, "getLogger(TaskRunner::class.java.name)");
        f57361j = logger;
    }

    public TaskRunner(RealBackend realBackend) {
        this.f57362a = realBackend;
    }

    /* JADX INFO: renamed from: a */
    public static final void m21375a(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        byte[] bArr = Util.f57274a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.f57348a);
        try {
            long jMo21366a = task.mo21366a();
            synchronized (taskRunner) {
                taskRunner.m21376b(task, jMo21366a);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (taskRunner) {
                taskRunner.m21376b(task, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21376b(Task task, long j) {
        byte[] bArr = Util.f57274a;
        TaskQueue taskQueue = task.f57350c;
        Intrinsics.m18596d(taskQueue);
        if (taskQueue.f57355d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = taskQueue.f57357f;
        taskQueue.f57357f = false;
        taskQueue.f57355d = null;
        this.f57366e.remove(taskQueue);
        if (j != -1 && !z2 && !taskQueue.f57354c) {
            taskQueue.m21373e(task, j, true);
        }
        if (taskQueue.f57356e.isEmpty()) {
            return;
        }
        this.f57367f.add(taskQueue);
    }

    /* JADX INFO: renamed from: c */
    public final Task m21377c() {
        long j;
        Task task;
        boolean z2;
        byte[] bArr = Util.f57274a;
        while (true) {
            ArrayList arrayList = this.f57367f;
            if (arrayList.isEmpty()) {
                return null;
            }
            RealBackend realBackend = this.f57362a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    task = null;
                    z2 = false;
                    break;
                }
                Task task3 = (Task) ((TaskQueue) it.next()).f57356e.get(0);
                j = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f57351d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z2 = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.f57366e;
            if (task2 != null) {
                byte[] bArr2 = Util.f57274a;
                task2.f57351d = -1L;
                TaskQueue taskQueue = task2.f57350c;
                Intrinsics.m18596d(taskQueue);
                taskQueue.f57356e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f57355d = task2;
                arrayList2.add(taskQueue);
                if (z2 || (!this.f57364c && !arrayList.isEmpty())) {
                    realBackend.m21380a(this.f57368g);
                }
                return task2;
            }
            if (this.f57364c) {
                if (jMin >= this.f57365d - j) {
                    return task;
                }
                notify();
                return task;
            }
            this.f57364c = true;
            this.f57365d = j + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((TaskQueue) arrayList2.get(size)).m21371b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                        taskQueue2.m21371b();
                        if (taskQueue2.f57356e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f57364c = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21378d(TaskQueue taskQueue) {
        Intrinsics.m18599g(taskQueue, "taskQueue");
        byte[] bArr = Util.f57274a;
        if (taskQueue.f57355d == null) {
            boolean zIsEmpty = taskQueue.f57356e.isEmpty();
            ArrayList arrayList = this.f57367f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.m18599g(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f57364c;
        RealBackend realBackend = this.f57362a;
        if (z2) {
            notify();
        } else {
            realBackend.m21380a(this.f57368g);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TaskQueue m21379e() {
        int i;
        synchronized (this) {
            i = this.f57363b;
            this.f57363b = i + 1;
        }
        return new TaskQueue(this, AbstractC0000a.m9f(i, "Q"));
    }
}
