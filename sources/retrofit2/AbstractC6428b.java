package retrofit2;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: retrofit2.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6428b {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Object m21908a(MethodHandle methodHandle, Object[] objArr) {
        return methodHandle.invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ String m21909b(Parameter parameter) {
        return parameter.getName();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m21910c(Parameter parameter) {
        return parameter.isNamePresent();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Parameter[] m21911d(Method method) {
        return method.getParameters();
    }
}
