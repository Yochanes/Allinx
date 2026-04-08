package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ArchTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: b */
    public static volatile ArchTaskExecutor f1498b;

    /* JADX INFO: renamed from: c */
    public static final ExecutorC0154a f1499c = new ExecutorC0154a(0);

    /* JADX INFO: renamed from: a */
    public final DefaultTaskExecutor f1500a = new DefaultTaskExecutor();

    /* JADX INFO: renamed from: a */
    public static ArchTaskExecutor m803a() {
        if (f1498b != null) {
            return f1498b;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f1498b == null) {
                    f1498b = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1498b;
    }
}
