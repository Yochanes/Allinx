package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = create();

    /* JADX INFO: renamed from: com.google.gson.internal.UnsafeAllocator$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48081 extends UnsafeAllocator {
        final /* synthetic */ Method val$allocateInstance;
        final /* synthetic */ Object val$unsafe;

        public C48081(Method method, Object obj) {
            this.val$allocateInstance = method;
            this.val$unsafe = obj;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.access$000(cls);
            return (T) this.val$allocateInstance.invoke(this.val$unsafe, cls);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.UnsafeAllocator$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C48092 extends UnsafeAllocator {
        final /* synthetic */ int val$constructorId;
        final /* synthetic */ Method val$newInstance;

        public C48092(Method method, int i) {
            this.val$newInstance = method;
            this.val$constructorId = i;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.access$000(cls);
            return (T) this.val$newInstance.invoke(null, cls, Integer.valueOf(this.val$constructorId));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.UnsafeAllocator$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C48103 extends UnsafeAllocator {
        final /* synthetic */ Method val$newInstance;

        public C48103(Method method) {
            this.val$newInstance = method;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
            UnsafeAllocator.access$000(cls);
            return (T) this.val$newInstance.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.UnsafeAllocator$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C48114 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static /* synthetic */ void access$000(Class cls) {
        assertInstantiable(cls);
    }

    private static void assertInstantiable(Class<?> cls) {
        String strCheckInstantiable = ConstructorConstructor.checkInstantiable(cls);
        if (strCheckInstantiable != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strCheckInstantiable));
        }
    }

    private static UnsafeAllocator create() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C48081(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new C48114();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new C48103(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new C48092(declaredMethod3, iIntValue);
        }
    }

    public abstract <T> T newInstance(Class<T> cls);
}
