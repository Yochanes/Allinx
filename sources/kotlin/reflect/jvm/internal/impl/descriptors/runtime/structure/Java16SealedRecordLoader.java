package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class Java16SealedRecordLoader {

    /* JADX INFO: renamed from: a */
    public static Cache f52634a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Cache {

        /* JADX INFO: renamed from: a */
        public final Method f52635a;

        /* JADX INFO: renamed from: b */
        public final Method f52636b;

        /* JADX INFO: renamed from: c */
        public final Method f52637c;

        /* JADX INFO: renamed from: d */
        public final Method f52638d;

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f52635a = method;
            this.f52636b = method2;
            this.f52637c = method3;
            this.f52638d = method4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Cache m19116a() {
        Cache cache;
        Cache cache2 = f52634a;
        if (cache2 != null) {
            return cache2;
        }
        try {
            cache = new Cache(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            cache = new Cache(null, null, null, null);
        }
        f52634a = cache;
        return cache;
    }
}
