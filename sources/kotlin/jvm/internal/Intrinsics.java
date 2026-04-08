package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Intrinsics {

    /* JADX INFO: compiled from: Proguard */
    @SinceKotlin
    public static class Kotlin {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18593a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18594b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static void m18595c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m18603k(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: d */
    public static void m18596d(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m18603k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m18597e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m18603k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: f */
    public static void m18598f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m18603k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: g */
    public static void m18599g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m18602j(str));
        m18603k(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: h */
    public static void m18600h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m18602j(str));
        m18603k(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: i */
    public static int m18601i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: j */
    public static String m18602j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM25v = AbstractC0000a.m25v("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM25v.append(str);
        return sbM25v.toString();
    }

    /* JADX INFO: renamed from: k */
    public static void m18603k(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: l */
    public static String m18604l(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: m */
    public static void m18605m() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: n */
    public static void m18606n(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(AbstractC0000a.m3D("lateinit property ", str, " has not been initialized"));
        m18603k(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
