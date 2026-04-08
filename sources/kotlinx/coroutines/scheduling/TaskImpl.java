package kotlinx.coroutines.scheduling;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class TaskImpl extends Task {

    /* JADX INFO: renamed from: c */
    public final Runnable f56479c;

    public TaskImpl(Runnable runnable, long j, boolean z2) {
        super(j, z2);
        this.f56479c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56479c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f56479c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(DebugStringsKt.m20565a(runnable));
        sb.append(", ");
        sb.append(this.f56477a);
        sb.append(", ");
        boolean z2 = this.f56478b;
        String str = TasksKt.f56480a;
        return AbstractC0455a.m2241p(sb, z2 ? "Blocking" : "Non-blocking", ']');
    }
}
