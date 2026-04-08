package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class ClassesInfoCache {

    /* JADX INFO: renamed from: c */
    public static final ClassesInfoCache f24840c = new ClassesInfoCache();

    /* JADX INFO: renamed from: a */
    public final HashMap f24841a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f24842b = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public static class CallbackInfo {

        /* JADX INFO: renamed from: a */
        public final HashMap f24843a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final HashMap f24844b;

        public CallbackInfo(HashMap map) {
            this.f24844b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f24843a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f24843a.put(event, arrayList);
                }
                arrayList.add((MethodReference) entry.getKey());
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m9113a(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, LifecycleObserver lifecycleObserver) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    methodReference.getClass();
                    try {
                        int i = methodReference.f24845a;
                        Method method = methodReference.f24846b;
                        if (i == 0) {
                            method.invoke(lifecycleObserver, new Object[0]);
                        } else if (i == 1) {
                            method.invoke(lifecycleObserver, lifecycleOwner);
                        } else if (i == 2) {
                            method.invoke(lifecycleObserver, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public static final class MethodReference {

        /* JADX INFO: renamed from: a */
        public final int f24845a;

        /* JADX INFO: renamed from: b */
        public final Method f24846b;

        public MethodReference(Method method, int i) {
            this.f24845a = i;
            this.f24846b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f24845a == methodReference.f24845a && this.f24846b.getName().equals(methodReference.f24846b.getName());
        }

        public final int hashCode() {
            return this.f24846b.getName().hashCode() + (this.f24845a * 31);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9111b(HashMap map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + methodReference.f24846b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    /* JADX INFO: renamed from: a */
    public final CallbackInfo m9112a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f24841a;
        if (superclass != null) {
            CallbackInfo callbackInfoM9112a = (CallbackInfo) map2.get(superclass);
            if (callbackInfoM9112a == null) {
                callbackInfoM9112a = m9112a(superclass, null);
            }
            map.putAll(callbackInfoM9112a.f24844b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfoM9112a2 = (CallbackInfo) map2.get(cls2);
            if (callbackInfoM9112a2 == null) {
                callbackInfoM9112a2 = m9112a(cls2, null);
            }
            for (Map.Entry entry : callbackInfoM9112a2.f24844b.entrySet()) {
                m9111b(map, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m9111b(map, new MethodReference(method, i), eventValue, cls);
                z2 = true;
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(map);
        map2.put(cls, callbackInfo);
        this.f24842b.put(cls, Boolean.valueOf(z2));
        return callbackInfo;
    }
}
