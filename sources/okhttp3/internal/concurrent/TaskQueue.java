package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TaskQueue {

    /* JADX INFO: renamed from: a */
    public final TaskRunner f57352a;

    /* JADX INFO: renamed from: b */
    public final String f57353b;

    /* JADX INFO: renamed from: c */
    public boolean f57354c;

    /* JADX INFO: renamed from: d */
    public Task f57355d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f57356e;

    /* JADX INFO: renamed from: f */
    public boolean f57357f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class AwaitIdleTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        /* JADX INFO: renamed from: a */
        public final long mo21366a() {
            throw null;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        Intrinsics.m18599g(taskRunner, "taskRunner");
        Intrinsics.m18599g(name, "name");
        this.f57352a = taskRunner;
        this.f57353b = name;
        this.f57356e = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21369d(TaskQueue taskQueue, Task task) {
        taskQueue.m21372c(task, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m21370a() {
        byte[] bArr = Util.f57274a;
        synchronized (this.f57352a) {
            if (m21371b()) {
                this.f57352a.m21378d(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21371b() {
        Task task = this.f57355d;
        if (task != null && task.f57349b) {
            this.f57357f = true;
        }
        ArrayList arrayList = this.f57356e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).f57349b) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.Companion companion = TaskRunner.f57359h;
                if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.m21367a(task2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m21372c(Task task, long j) {
        Intrinsics.m18599g(task, "task");
        synchronized (this.f57352a) {
            if (!this.f57354c) {
                if (m21373e(task, j, false)) {
                    this.f57352a.m21378d(this);
                }
            } else if (task.f57349b) {
                TaskRunner.Companion companion = TaskRunner.f57359h;
                if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.m21367a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.Companion companion2 = TaskRunner.f57359h;
                if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.m21367a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m21373e(Task task, long j, boolean z2) {
        Iterator it;
        int size;
        Intrinsics.m18599g(task, "task");
        TaskQueue taskQueue = task.f57350c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f57350c = this;
        }
        TaskRunner.RealBackend realBackend = this.f57352a.f57362a;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f57356e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f57351d = j2;
            TaskRunner.Companion companion = TaskRunner.f57359h;
            if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
                TaskLoggerKt.m21367a(task, this, z2 ? "run again after ".concat(TaskLoggerKt.m21368b(j2 - jNanoTime)) : "scheduled after ".concat(TaskLoggerKt.m21368b(j2 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).f57351d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size != 0) {
                return true;
            }
        } else if (task.f57351d <= j2) {
            TaskRunner.Companion companion2 = TaskRunner.f57359h;
            if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
                TaskLoggerKt.m21367a(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f57351d = j2;
            TaskRunner.Companion companion3 = TaskRunner.f57359h;
            if (TaskRunner.f57361j.isLoggable(Level.FINE)) {
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                }
                size++;
            }
            if (size == -1) {
            }
            arrayList.add(size, task);
            if (size != 0) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21374f() {
        byte[] bArr = Util.f57274a;
        synchronized (this.f57352a) {
            this.f57354c = true;
            if (m21371b()) {
                this.f57352a.m21378d(this);
            }
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF57353b() {
        return this.f57353b;
    }
}
