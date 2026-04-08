package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class Task implements Runnable {

    /* JADX INFO: renamed from: a */
    public long f56477a;

    /* JADX INFO: renamed from: b */
    public boolean f56478b;

    public Task(long j, boolean z2) {
        this.f56477a = j;
        this.f56478b = z2;
    }
}
