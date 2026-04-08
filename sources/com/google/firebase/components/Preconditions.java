package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    public static void checkArgument(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
