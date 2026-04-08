package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    public static void verify(boolean z2) {
        if (!z2) {
            throw new VerifyException();
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t) {
        return (T) verifyNotNull(t, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z2, String str, @CheckForNull Object... objArr) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t, String str, @CheckForNull Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new VerifyException(Strings.lenientFormat(str, objArr));
    }

    public static void verify(boolean z2, String str, char c2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z2, String str, int i) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z2, String str, long j) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j)));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj));
        }
    }

    public static void verify(boolean z2, String str, char c2, char c3) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void verify(boolean z2, String str, int i, char c2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z2, String str, long j, char c2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j), Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, char c2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z2, String str, char c2, int i) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z2, String str, int i, int i2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void verify(boolean z2, String str, long j, int i) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, int i) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z2, String str, char c2, long j) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j)));
        }
    }

    public static void verify(boolean z2, String str, int i, long j) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j)));
        }
    }

    public static void verify(boolean z2, String str, long j, long j2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, long j) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Long.valueOf(j)));
        }
    }

    public static void verify(boolean z2, String str, char c2, @CheckForNull Object obj) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), obj));
        }
    }

    public static void verify(boolean z2, String str, int i, @CheckForNull Object obj) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), obj));
        }
    }

    public static void verify(boolean z2, String str, long j, @CheckForNull Object obj) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j), obj));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void verify(boolean z2, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z2) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
