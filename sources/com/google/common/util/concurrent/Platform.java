package com.google.common.util.concurrent;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(@CheckForNull Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
