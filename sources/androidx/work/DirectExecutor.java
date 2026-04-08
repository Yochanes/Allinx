package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/DirectExecutor;", "", "Ljava/util/concurrent/Executor;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: a */
    public static final DirectExecutor f32569a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DirectExecutor[] f32570b;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        f32569a = directExecutor;
        f32570b = new DirectExecutor[]{directExecutor};
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f32570b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.m18599g(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
