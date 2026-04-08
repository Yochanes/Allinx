package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ReflectProperties {

    /* JADX INFO: compiled from: Proguard */
    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* JADX INFO: renamed from: b */
        public final Lambda f51946b;

        /* JADX INFO: renamed from: c */
        public volatile SoftReference f51947c;

        /* JADX WARN: Multi-variable type inference failed */
        public LazySoftVal(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
            if (function0 == 0) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.f51947c = null;
            this.f51946b = (Lambda) function0;
            if (callableMemberDescriptor != null) {
                this.f51947c = new SoftReference(callableMemberDescriptor);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj;
            SoftReference softReference = this.f51947c;
            Object obj2 = Val.f51950a;
            if (softReference != null && (obj = softReference.get()) != null) {
                if (obj == obj2) {
                    return null;
                }
                return obj;
            }
            Object objInvoke = this.f51946b.invoke();
            if (objInvoke != null) {
                obj2 = objInvoke;
            }
            this.f51947c = new SoftReference(obj2);
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LazyVal<T> extends Val<T> {

        /* JADX INFO: renamed from: b */
        public final Lambda f51948b;

        /* JADX INFO: renamed from: c */
        public volatile Object f51949c = null;

        /* JADX WARN: Multi-variable type inference failed */
        public LazyVal(Function0 function0) {
            this.f51948b = (Lambda) function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        public final Object invoke() {
            Object obj = this.f51949c;
            Object obj2 = Val.f51950a;
            if (obj != null) {
                if (obj == obj2) {
                    return null;
                }
                return obj;
            }
            Object objInvoke = this.f51948b.invoke();
            if (objInvoke != null) {
                obj2 = objInvoke;
            }
            this.f51949c = obj2;
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Val<T> {

        /* JADX INFO: renamed from: a */
        public static final Object f51950a = new C60001();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C60001 {
        }
    }

    /* JADX INFO: renamed from: a */
    public static LazySoftVal m18726a(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
        if (function0 != null) {
            return new LazySoftVal(callableMemberDescriptor, function0);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
