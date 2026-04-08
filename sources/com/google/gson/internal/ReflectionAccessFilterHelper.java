package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class ReflectionAccessFilterHelper {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AccessChecker {
        public static final AccessChecker INSTANCE;

        /* JADX INFO: renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C48051 extends AccessChecker {
            final /* synthetic */ Method val$canAccessMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48051(Method method) {
                super(null);
                this.val$canAccessMethod = method;
            }

            @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
            public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.val$canAccessMethod.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C48062 extends AccessChecker {
            public C48062() {
                super(null);
            }

            @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
            public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            AccessChecker c48051;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    c48051 = new C48051(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    c48051 = null;
                }
            } else {
                c48051 = null;
            }
            if (c48051 == null) {
                c48051 = new C48062();
            }
            INSTANCE = c48051;
        }

        private AccessChecker() {
        }

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);

        public /* synthetic */ AccessChecker(C48041 c48041) {
            this();
        }
    }

    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult filterResultCheck = it.next().check(cls);
            if (filterResultCheck != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return filterResultCheck;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean isAndroidType(Class<?> cls) {
        return isAndroidType(cls.getName());
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return isAndroidType(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean isJavaType(Class<?> cls) {
        return isJavaType(cls.getName());
    }

    private static boolean isAndroidType(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
    }

    private static boolean isJavaType(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
