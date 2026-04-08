package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class Java16RecordComponentsLoader {

    /* JADX INFO: renamed from: a */
    public static Cache f52631a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Cache {

        /* JADX INFO: renamed from: a */
        public final Method f52632a;

        /* JADX INFO: renamed from: b */
        public final Method f52633b;

        public Cache(Method method, Method method2) {
            this.f52632a = method;
            this.f52633b = method2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Cache m19115a(Object obj) {
        Cache cache = f52631a;
        if (cache == null) {
            Class<?> cls = obj.getClass();
            try {
                cache = new Cache(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Cache(null, null);
            }
            f52631a = cache;
        }
        return cache;
    }
}
