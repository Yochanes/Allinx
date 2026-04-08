package com.king.logx.logger;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001J\u001f\u0010\f\u001a\u00020\r2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001¢\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010\u0010\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018J/\u0010\u0019\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010\u0019\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018J/\u0010\u001a\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J.\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001J\u0010\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J/\u0010#\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018J/\u0010$\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010$\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010$\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018J/\u0010%\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0012\u0010%\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J9\u0010%\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0004\"\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0018R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00010\nj\b\u0012\u0004\u0012\u00020\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m18302d2 = {"Lcom/king/logx/logger/CompositeLogger;", "Lcom/king/logx/logger/Logger;", "()V", "loggerArray", "", "[Lcom/king/logx/logger/Logger;", "loggerCount", "", "()I", "loggers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addLogger", "", "logger", "([Lcom/king/logx/logger/Logger;)V", "d", "message", "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "i", "log", "priority", MTPushConstants.Operation.KEY_TAG, "offset", "Lcom/king/logx/logger/ILogger;", "methodOffset", "removeAllLoggers", "removeLogger", "v", "w", "wtf", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final class CompositeLogger extends Logger {

    @NotNull
    private volatile Logger[] loggerArray;

    @NotNull
    private final ArrayList<Logger> loggers;

    public CompositeLogger() {
        super(0, 1, null);
        this.loggers = new ArrayList<>();
        this.loggerArray = new Logger[0];
    }

    public final void addLogger(@NotNull Logger logger) {
        Intrinsics.m18599g(logger, "logger");
        if (logger == this) {
            throw new IllegalArgumentException(("Cannot add " + logger.getClass().getSimpleName() + " into itself.").toString());
        }
        synchronized (this.loggers) {
            this.loggers.add(logger);
            Object[] array = this.loggers.toArray(new Logger[0]);
            Intrinsics.m18597e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.loggerArray = (Logger[]) array;
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15357d(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15357d(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15360e(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15360e(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15363i(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15363i(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void log(int priority, @Nullable String message) {
        for (Logger logger : this.loggerArray) {
            logger.log(priority, message);
        }
    }

    @JvmName
    public final int loggerCount() {
        return this.loggerArray.length;
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    @NotNull
    public ILogger offset(int methodOffset) {
        for (Logger logger : this.loggerArray) {
            logger.offset(methodOffset);
        }
        return this;
    }

    public final void removeAllLoggers() {
        synchronized (this.loggers) {
            this.loggers.clear();
            this.loggerArray = new Logger[0];
        }
    }

    public final void removeLogger(@NotNull Logger logger) {
        Intrinsics.m18599g(logger, "logger");
        synchronized (this.loggers) {
            if (!this.loggers.remove(logger)) {
                throw new IllegalArgumentException(("Cannot remove logger which is not added: " + logger).toString());
            }
            Object[] array = this.loggers.toArray(new Logger[0]);
            Intrinsics.m18597e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.loggerArray = (Logger[]) array;
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    @NotNull
    public ILogger tag(@NotNull String tag) {
        Intrinsics.m18599g(tag, "tag");
        for (Logger logger : this.loggerArray) {
            logger.tag(tag);
        }
        return this;
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15366v(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15366v(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15369w(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15369w(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void wtf(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.wtf(message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15359d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15359d(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15362e(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15362e(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15365i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15365i(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void log(int priority, @Nullable Throwable t, @Nullable String message) {
        for (Logger logger : this.loggerArray) {
            logger.log(priority, t, message);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15368v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15368v(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15371w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.mo15371w(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void wtf(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        for (Logger logger : this.loggerArray) {
            logger.wtf(t, message, Arrays.copyOf(args, args.length));
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15358d(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.mo15358d(t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15361e(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.mo15361e(t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15364i(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.mo15364i(t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void log(int priority, @Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.log(priority, t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15367v(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.mo15367v(t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15370w(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.mo15370w(t);
        }
    }

    @Override // com.king.logx.logger.Logger, com.king.logx.logger.ILogger
    public void wtf(@Nullable Throwable t) {
        for (Logger logger : this.loggerArray) {
            logger.wtf(t);
        }
    }

    public final void addLogger(@NotNull Logger... loggers) {
        Intrinsics.m18599g(loggers, "loggers");
        if (loggers.length == 0) {
            return;
        }
        for (Logger logger : loggers) {
            if (logger == this) {
                throw new IllegalArgumentException(("Cannot add " + logger.getClass().getSimpleName() + " into itself.").toString());
            }
        }
        synchronized (this.loggers) {
            Collections.addAll(this.loggers, Arrays.copyOf(loggers, loggers.length));
            Object[] array = this.loggers.toArray(new Logger[0]);
            Intrinsics.m18597e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.loggerArray = (Logger[]) array;
        }
    }

    @Override // com.king.logx.logger.Logger
    public void log(int priority, @Nullable String tag, @Nullable String message, @Nullable Throwable t) {
        throw new AssertionError();
    }
}
