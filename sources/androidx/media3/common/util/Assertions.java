package androidx.media3.common.util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Assertions {
    /* JADX INFO: renamed from: a */
    public static void m9460a(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9461b(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9462c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9463d(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static void m9464e(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m9465f(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9466g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
