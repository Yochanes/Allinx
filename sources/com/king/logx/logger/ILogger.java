package com.king.logx.logger;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\u0002\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ/\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\r\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005H&J/\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\u0014\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\u0015\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000bJ/\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J9\u0010\u0016\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u000b¨\u0006\u0017"}, m18302d2 = {"Lcom/king/logx/logger/ILogger;", "", "d", "", "message", "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "i", "log", "priority", "", "offset", "methodOffset", MTPushConstants.Operation.KEY_TAG, "v", "w", "wtf", "logx_release"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public interface ILogger {
    /* JADX INFO: renamed from: d */
    void mo15357d(@Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: d */
    void mo15358d(@Nullable Throwable t);

    /* JADX INFO: renamed from: d */
    void mo15359d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: e */
    void mo15360e(@Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: e */
    void mo15361e(@Nullable Throwable t);

    /* JADX INFO: renamed from: e */
    void mo15362e(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: i */
    void mo15363i(@Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: i */
    void mo15364i(@Nullable Throwable t);

    /* JADX INFO: renamed from: i */
    void mo15365i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    void log(int priority, @Nullable String message);

    void log(int priority, @Nullable Throwable t);

    void log(int priority, @Nullable Throwable t, @Nullable String message);

    @NotNull
    ILogger offset(int methodOffset);

    @NotNull
    ILogger tag(@NotNull String tag);

    /* JADX INFO: renamed from: v */
    void mo15366v(@Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: v */
    void mo15367v(@Nullable Throwable t);

    /* JADX INFO: renamed from: v */
    void mo15368v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: w */
    void mo15369w(@Nullable String message, @NotNull Object... args);

    /* JADX INFO: renamed from: w */
    void mo15370w(@Nullable Throwable t);

    /* JADX INFO: renamed from: w */
    void mo15371w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    void wtf(@Nullable String message, @NotNull Object... args);

    void wtf(@Nullable Throwable t);

    void wtf(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);
}
