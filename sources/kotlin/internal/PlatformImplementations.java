package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/internal/PlatformImplementations;", "", "ReflectThrowable", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public class PlatformImplementations {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class ReflectThrowable {

        /* JADX INFO: renamed from: a */
        public static final Method f51609a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.m18596d(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (Intrinsics.m18594b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.m18598f(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.m18594b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f51609a = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !Intrinsics.m18594b(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo18564a(Throwable cause, Throwable exception) {
        Intrinsics.m18599g(cause, "cause");
        Intrinsics.m18599g(exception, "exception");
        Method method = ReflectThrowable.f51609a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
