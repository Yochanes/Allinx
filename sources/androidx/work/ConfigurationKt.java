package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConfigurationKt {
    /* JADX INFO: renamed from: a */
    public static final ExecutorService m12087a(boolean z2) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ConfigurationKt$createDefaultExecutor$factory$1(z2));
        Intrinsics.m18598f(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }
}
