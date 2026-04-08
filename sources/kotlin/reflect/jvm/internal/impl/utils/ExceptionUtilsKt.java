package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m20342a(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!Intrinsics.m18594b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }
}
