package androidx.work;

import androidx.compose.animation.AbstractC0455a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/work/ConfigurationKt$createDefaultExecutor$factory$1", "Ljava/util/concurrent/ThreadFactory;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConfigurationKt$createDefaultExecutor$factory$1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f32541a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f32542b;

    public ConfigurationKt$createDefaultExecutor$factory$1(boolean z2) {
        this.f32542b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.m18599g(runnable, "runnable");
        StringBuilder sbM2244s = AbstractC0455a.m2244s(this.f32542b ? "WM.task-" : "androidx.work-");
        sbM2244s.append(this.f32541a.incrementAndGet());
        return new Thread(runnable, sbM2244s.toString());
    }
}
