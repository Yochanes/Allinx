package com.google.gson.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class GsonPreconditions {
    private GsonPreconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
