package com.king.logx;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.king.logx.logger.CompositeLogger;
import com.king.logx.logger.DefaultLogger;
import com.king.logx.logger.ILogger;
import com.king.logx.logger.Logger;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18302d2 = {"Lcom/king/logx/LogX;", "", "()V", "Companion", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final class LogX {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isDebug = true;

    @NotNull
    private static final List<String> internalIgnore = CollectionsKt.m18414O(LogX.class.getName(), Companion.class.getName(), ILogger.class.getName(), DefaultLogger.class.getName(), CompositeLogger.class.getName(), Logger.class.getName());

    @NotNull
    private static Logger logger = new DefaultLogger(false, 0, 0, 7, null);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010\u0018\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!J/\u0010\"\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010\"\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!J/\u0010#\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010#\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010#\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0017J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J$\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0004H\u0017J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010)\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\fH\u0017J/\u0010*\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010*\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010*\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!J/\u0010+\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010+\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010+\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!J/\u0010,\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010,\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J9\u0010,\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0002\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002¨\u0006-"}, m18302d2 = {"Lcom/king/logx/LogX$Companion;", "Lcom/king/logx/logger/ILogger;", "()V", "ASSERT", "", "DEBUG", "ERROR", "INFO", "VERBOSE", "WARN", "internalIgnore", "", "", "getInternalIgnore$logx_release", "()Ljava/util/List;", "isDebug", "", "isDebug$logx_release", "()Z", "setDebug$logx_release", "(Z)V", "logger", "Lcom/king/logx/logger/Logger;", "getLogger$annotations", "d", "", "message", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "i", "log", "priority", "offset", "methodOffset", "setLogger", MTPushConstants.Operation.KEY_TAG, "v", "w", "wtf", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
    public static final class Companion implements ILogger {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: d */
        public void mo15357d(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15357d(message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: e */
        public void mo15360e(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15360e(message, Arrays.copyOf(args, args.length));
        }

        public final /* synthetic */ List getInternalIgnore$logx_release() {
            return LogX.access$getInternalIgnore$cp();
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: i */
        public void mo15363i(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15363i(message, Arrays.copyOf(args, args.length));
        }

        public final /* synthetic */ boolean isDebug$logx_release() {
            return LogX.access$isDebug$cp();
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void log(int priority, @Nullable String message) {
            LogX.access$getLogger$cp().log(priority, message);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        @NotNull
        public ILogger offset(int methodOffset) {
            LogX.access$getLogger$cp().offset(methodOffset);
            return this;
        }

        public final void setDebug$logx_release(boolean z2) {
            LogX.access$setDebug$cp(z2);
        }

        @JvmStatic
        public final void setLogger(@NotNull Logger logger) {
            Intrinsics.m18599g(logger, "logger");
            LogX.access$setLogger$cp(logger);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        @NotNull
        public ILogger tag(@NotNull String tag) {
            Intrinsics.m18599g(tag, "tag");
            LogX.access$getLogger$cp().tag(tag);
            return this;
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: v */
        public void mo15366v(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15366v(message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: w */
        public void mo15369w(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15369w(message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void wtf(@Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().wtf(message, Arrays.copyOf(args, args.length));
        }

        private Companion() {
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: d */
        public void mo15359d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15359d(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: e */
        public void mo15362e(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15362e(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: i */
        public void mo15365i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15365i(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void log(int priority, @Nullable Throwable t, @Nullable String message) {
            LogX.access$getLogger$cp().log(priority, message);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: v */
        public void mo15368v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15368v(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: w */
        public void mo15371w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15371w(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void wtf(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            Intrinsics.m18599g(args, "args");
            LogX.access$getLogger$cp().mo15371w(t, message, Arrays.copyOf(args, args.length));
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: d */
        public void mo15358d(@Nullable Throwable t) {
            LogX.access$getLogger$cp().mo15358d(t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: e */
        public void mo15361e(@Nullable Throwable t) {
            LogX.access$getLogger$cp().mo15361e(t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: i */
        public void mo15364i(@Nullable Throwable t) {
            LogX.access$getLogger$cp().mo15364i(t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void log(int priority, @Nullable Throwable t) {
            LogX.access$getLogger$cp().log(priority, t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: v */
        public void mo15367v(@Nullable Throwable t) {
            LogX.access$getLogger$cp().mo15367v(t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        /* JADX INFO: renamed from: w */
        public void mo15370w(@Nullable Throwable t) {
            LogX.access$getLogger$cp().mo15370w(t);
        }

        @Override // com.king.logx.logger.ILogger
        @JvmStatic
        public void wtf(@Nullable Throwable t) {
            LogX.access$getLogger$cp().wtf(t);
        }

        @JvmStatic
        private static /* synthetic */ void getLogger$annotations() {
        }
    }

    private LogX() {
        throw new AssertionError();
    }

    public static final /* synthetic */ List access$getInternalIgnore$cp() {
        return internalIgnore;
    }

    public static final /* synthetic */ Logger access$getLogger$cp() {
        return logger;
    }

    public static final /* synthetic */ boolean access$isDebug$cp() {
        return isDebug;
    }

    public static final /* synthetic */ void access$setDebug$cp(boolean z2) {
        isDebug = z2;
    }

    public static final /* synthetic */ void access$setLogger$cp(Logger logger2) {
        logger = logger2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static void m15342d(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15357d(str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static void m15345e(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15360e(str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static void m15348i(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15363i(str, objArr);
    }

    @JvmStatic
    public static void log(int i, @Nullable String str) {
        INSTANCE.log(i, str);
    }

    @JvmStatic
    @NotNull
    public static ILogger offset(int i) {
        return INSTANCE.offset(i);
    }

    @JvmStatic
    public static final void setLogger(@NotNull Logger logger2) {
        INSTANCE.setLogger(logger2);
    }

    @JvmStatic
    @NotNull
    public static ILogger tag(@NotNull String str) {
        return INSTANCE.tag(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static void m15351v(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15366v(str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static void m15354w(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15369w(str, objArr);
    }

    @JvmStatic
    public static void wtf(@Nullable String str, @NotNull Object... objArr) {
        INSTANCE.wtf(str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static void m15343d(@Nullable Throwable th) {
        INSTANCE.mo15358d(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static void m15346e(@Nullable Throwable th) {
        INSTANCE.mo15361e(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static void m15349i(@Nullable Throwable th) {
        INSTANCE.mo15364i(th);
    }

    @JvmStatic
    public static void log(int i, @Nullable Throwable th) {
        INSTANCE.log(i, th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static void m15352v(@Nullable Throwable th) {
        INSTANCE.mo15367v(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static void m15355w(@Nullable Throwable th) {
        INSTANCE.mo15370w(th);
    }

    @JvmStatic
    public static void wtf(@Nullable Throwable th) {
        INSTANCE.wtf(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static void m15344d(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15359d(th, str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static void m15347e(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15362e(th, str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static void m15350i(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15365i(th, str, objArr);
    }

    @JvmStatic
    public static void log(int i, @Nullable Throwable th, @Nullable String str) {
        INSTANCE.log(i, th, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static void m15353v(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15368v(th, str, objArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static void m15356w(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.mo15371w(th, str, objArr);
    }

    @JvmStatic
    public static void wtf(@Nullable Throwable th, @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.wtf(th, str, objArr);
    }
}
