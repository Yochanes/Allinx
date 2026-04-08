package androidx.core.app;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class PendingIntentCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GatedCallback implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }
}
