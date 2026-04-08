package com.king.logx.logger;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.king.logx.LogX;
import com.king.logx.util.Utils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010\u0012\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010\u001c\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bJ+\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016H\u0014¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0016H\u0004¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u0016H\u0014¢\u0006\u0002\u0010$J/\u0010%\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010%\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010%\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bJ\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0014J\u001a\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J.\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u001a\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016JA\u0010*\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010+J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010,\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010,\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010,\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010-\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010-\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010-\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bJ/\u0010.\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010.\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J9\u0010.\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u001bR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00068BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00060"}, m18302d2 = {"Lcom/king/logx/logger/Logger;", "Lcom/king/logx/logger/ILogger;", "methodOffset", "", "(I)V", "explicitOffset", "Ljava/lang/ThreadLocal;", "explicitTag", "", "lastOffset", "getLastOffset$logx_release", "()I", "setLastOffset$logx_release", "offset", "getOffset", MTPushConstants.Operation.KEY_TAG, "getTag", "()Ljava/lang/String;", "d", "", "message", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getStackOffset", "trace", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)I", "getStackTrace", "()[Ljava/lang/StackTraceElement;", "i", "isLoggable", "", "priority", "log", "prepareLog", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "v", "w", "wtf", "Companion", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public abstract class Logger implements ILogger {

    @NotNull
    public static final String BOTTOM_BORDER = "└──────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char BOTTOM_LEFT_CORNER = 9492;

    @NotNull
    private static final String DOUBLE_DIVIDER = "─────────────────────────────────────────────────";
    public static final char HORIZONTAL_LINE = 9474;

    @NotNull
    public static final String INDENT = "    ";
    public static final int MAX_LOG_LENGTH = 4000;

    @NotNull
    public static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char MIDDLE_CORNER = 9500;
    public static final int MIN_STACK_OFFSET = 5;

    @NotNull
    private static final String SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    @NotNull
    public static final String TOP_BORDER = "┌──────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char TOP_LEFT_CORNER = 9484;

    @NotNull
    private final ThreadLocal<Integer> explicitOffset;

    @NotNull
    private final ThreadLocal<String> explicitTag;
    private volatile int lastOffset;
    private final int methodOffset;

    @JvmOverloads
    public Logger() {
        this(0, 1, null);
    }

    private final /* synthetic */ int getOffset() {
        Integer num = this.explicitOffset.get();
        if (num == null) {
            return this.methodOffset;
        }
        this.explicitOffset.remove();
        return num.intValue();
    }

    private final /* synthetic */ String getTag() {
        String str = this.explicitTag.get();
        if (str != null) {
            this.explicitTag.remove();
            return str;
        }
        StackTraceElement[] stackTrace = getStackTrace();
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.m18341H(getStackOffset(stackTrace) + 1 + this.lastOffset, stackTrace);
        if (stackTraceElement != null) {
            return Utils.INSTANCE.createStackElementTag(stackTraceElement);
        }
        return null;
    }

    private final synchronized void prepareLog(int priority, Throwable t, String message, Object... args) {
        this.lastOffset = getOffset();
        String tag = getTag();
        if (isLoggable(priority, tag)) {
            log(priority, tag, formatMessage(message, args), t);
        }
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15357d(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(3, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15360e(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(6, null, message, Arrays.copyOf(args, args.length));
    }

    @Nullable
    public String formatMessage(@Nullable String message, @NotNull Object[] args) {
        Intrinsics.m18599g(args, "args");
        if (message == null) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: getLastOffset$logx_release, reason: from getter */
    public final int getLastOffset() {
        return this.lastOffset;
    }

    public final int getStackOffset(@NotNull StackTraceElement[] trace) {
        Intrinsics.m18599g(trace, "trace");
        for (int i = 5; i < trace.length; i++) {
            if (!LogX.INSTANCE.getInternalIgnore$logx_release().contains(trace[i].getClassName())) {
                return i - 1;
            }
        }
        return -1;
    }

    @NotNull
    public StackTraceElement[] getStackTrace() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.m18598f(stackTrace, "Throwable().stackTrace");
        return stackTrace;
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15363i(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(4, null, message, Arrays.copyOf(args, args.length));
    }

    public boolean isLoggable(int priority, @Nullable String tag) {
        return true;
    }

    @Override // com.king.logx.logger.ILogger
    public void log(int priority, @Nullable String message) {
        prepareLog(priority, null, message, new Object[0]);
    }

    public abstract void log(int priority, @Nullable String tag, @Nullable String message, @Nullable Throwable t);

    @Override // com.king.logx.logger.ILogger
    @NotNull
    public ILogger offset(int methodOffset) {
        this.explicitOffset.set(Integer.valueOf(methodOffset));
        return this;
    }

    public final void setLastOffset$logx_release(int i) {
        this.lastOffset = i;
    }

    @Override // com.king.logx.logger.ILogger
    @NotNull
    public ILogger tag(@NotNull String tag) {
        Intrinsics.m18599g(tag, "tag");
        this.explicitTag.set(tag);
        return this;
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15366v(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(2, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15369w(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(5, null, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    public void wtf(@Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(7, null, message, Arrays.copyOf(args, args.length));
    }

    @JvmOverloads
    public Logger(int i) {
        this.methodOffset = i;
        this.explicitOffset = new ThreadLocal<>();
        this.lastOffset = i;
        this.explicitTag = new ThreadLocal<>();
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15359d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(3, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15362e(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(6, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15365i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(4, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    public void log(int priority, @Nullable Throwable t, @Nullable String message) {
        prepareLog(priority, t, message, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15368v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(2, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15371w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(5, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    public void wtf(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        Intrinsics.m18599g(args, "args");
        prepareLog(7, t, message, Arrays.copyOf(args, args.length));
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: d */
    public void mo15358d(@Nullable Throwable t) {
        prepareLog(3, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: e */
    public void mo15361e(@Nullable Throwable t) {
        prepareLog(6, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: i */
    public void mo15364i(@Nullable Throwable t) {
        prepareLog(4, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    public void log(int priority, @Nullable Throwable t) {
        prepareLog(priority, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: v */
    public void mo15367v(@Nullable Throwable t) {
        prepareLog(2, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    /* JADX INFO: renamed from: w */
    public void mo15370w(@Nullable Throwable t) {
        prepareLog(5, t, null, new Object[0]);
    }

    @Override // com.king.logx.logger.ILogger
    public void wtf(@Nullable Throwable t) {
        prepareLog(7, t, null, new Object[0]);
    }

    public /* synthetic */ Logger(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
