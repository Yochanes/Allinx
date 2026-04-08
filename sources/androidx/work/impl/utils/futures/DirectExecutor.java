package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ DirectExecutor[] f33146a = {new DirectExecutor("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    DirectExecutor EF5;

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f33146a.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
