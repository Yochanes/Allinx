package io.ktor.utils.p043io.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Ljava/io/Closeable;", "Closeable", "ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CloseableJVMKt {

    /* JADX INFO: renamed from: a */
    public static final Lazy f47361a = LazyKt.m18299b(CloseableJVMKt$AddSuppressedMethod$2.f47362a);

    /* JADX INFO: renamed from: a */
    public static final void m17486a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = (Method) f47361a.getValue();
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
