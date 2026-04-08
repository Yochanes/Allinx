package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ThreadFactoryBuilder {

    @CheckForNull
    private String nameFormat = null;

    @CheckForNull
    private Boolean daemon = null;

    @CheckForNull
    private Integer priority = null;

    @CheckForNull
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;

    @CheckForNull
    private ThreadFactory backingThreadFactory = null;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ThreadFactoryBuilder$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC45711 implements ThreadFactory {
        final /* synthetic */ ThreadFactory val$backingThreadFactory;
        final /* synthetic */ AtomicLong val$count;
        final /* synthetic */ Boolean val$daemon;
        final /* synthetic */ String val$nameFormat;
        final /* synthetic */ Integer val$priority;
        final /* synthetic */ Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler;

        public ThreadFactoryC45711(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.val$backingThreadFactory = threadFactory;
            this.val$nameFormat = str;
            this.val$count = atomicLong;
            this.val$daemon = bool;
            this.val$priority = num;
            this.val$uncaughtExceptionHandler = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.val$backingThreadFactory.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.val$nameFormat;
            if (str != null) {
                AtomicLong atomicLong = this.val$count;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(ThreadFactoryBuilder.access$000(str, new Object[]{Long.valueOf(atomicLong.getAndIncrement())}));
            }
            Boolean bool = this.val$daemon;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.val$priority;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.val$uncaughtExceptionHandler;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static /* synthetic */ String access$000(String str, Object[] objArr) {
        return format(str, objArr);
    }

    private static ThreadFactory doBuild(ThreadFactoryBuilder threadFactoryBuilder) {
        String str = threadFactoryBuilder.nameFormat;
        Boolean bool = threadFactoryBuilder.daemon;
        Integer num = threadFactoryBuilder.priority;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.uncaughtExceptionHandler;
        ThreadFactory threadFactoryDefaultThreadFactory = threadFactoryBuilder.backingThreadFactory;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new ThreadFactoryC45711(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory build() {
        return doBuild(this);
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setDaemon(boolean z2) {
        this.daemon = Boolean.valueOf(z2);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setNameFormat(String str) {
        format(str, 0);
        this.nameFormat = str;
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setPriority(int i) {
        Preconditions.checkArgument(i >= 1, "Thread priority (%s) must be >= %s", i, 1);
        Preconditions.checkArgument(i <= 10, "Thread priority (%s) must be <= %s", i, 10);
        this.priority = Integer.valueOf(i);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.backingThreadFactory = (ThreadFactory) Preconditions.checkNotNull(threadFactory);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
