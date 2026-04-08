package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class Preconditions {
    /* JADX INFO: renamed from: a */
    public static void m7694a(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7695b(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7696c(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    /* JADX INFO: renamed from: d */
    public static void m7697d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7698e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7699f(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }
}
