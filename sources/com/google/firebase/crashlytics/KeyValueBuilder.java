package com.google.firebase.crashlytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m18302d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "key", "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        Intrinsics.m18599g(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    public final void key(@NotNull String key, boolean value) {
        Intrinsics.m18599g(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, double value) {
        Intrinsics.m18599g(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, float value) {
        Intrinsics.m18599g(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, int value) {
        Intrinsics.m18599g(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, long value) {
        Intrinsics.m18599g(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, @NotNull String value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
