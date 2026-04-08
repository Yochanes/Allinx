package com.google.common.base;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
public final class Throwables {

    @J2ktIncompatible
    @GwtIncompatible
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @VisibleForTesting
    @J2ktIncompatible
    @GwtIncompatible
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static final Method getStackTraceDepthMethod;

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static final Method getStackTraceElementMethod;

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static final Object jla;

    /* JADX INFO: renamed from: com.google.common.base.Throwables$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41241 extends AbstractList<StackTraceElement> {
        final /* synthetic */ Throwable val$t;

        public C41241(Throwable th) {
            this.val$t = th;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method methodAccess$300 = Throwables.access$300();
            java.util.Objects.requireNonNull(methodAccess$300);
            Object objAccess$100 = Throwables.access$100();
            java.util.Objects.requireNonNull(objAccess$100);
            return ((Integer) Throwables.access$200(methodAccess$300, objAccess$100, new Object[]{this.val$t})).intValue();
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int i) {
            Method methodAccess$000 = Throwables.access$000();
            java.util.Objects.requireNonNull(methodAccess$000);
            Object objAccess$100 = Throwables.access$100();
            java.util.Objects.requireNonNull(objAccess$100);
            return (StackTraceElement) Throwables.access$200(methodAccess$000, objAccess$100, new Object[]{this.val$t, Integer.valueOf(i)});
        }
    }

    static {
        Object jla2 = getJLA();
        jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod(jla2) : null;
    }

    private Throwables() {
    }

    public static /* synthetic */ Method access$000() {
        return getStackTraceElementMethod;
    }

    public static /* synthetic */ Object access$100() {
        return jla;
    }

    public static /* synthetic */ Object access$200(Method method, Object obj, Object[] objArr) {
        return invokeAccessibleNonThrowingMethod(method, obj, objArr);
    }

    public static /* synthetic */ Method access$300() {
        return getStackTraceDepthMethod;
    }

    public static List<Throwable> getCausalChain(Throwable th) {
        Preconditions.checkNotNull(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z2 = false;
        Throwable cause = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z2) {
                cause = cause.getCause();
            }
            z2 = !z2;
        }
    }

    @CheckForNull
    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static Method getJlaMethod(String str, Class<?>... clsArr) {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        boolean z2 = false;
        Throwable cause = th;
        while (true) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                return th;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z2) {
                cause = cause.getCause();
            }
            z2 = !z2;
            th = cause2;
        }
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    private static Method getSizeMethod(Object obj) {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(obj, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static List<StackTraceElement> jlaStackTrace(Throwable th) {
        Preconditions.checkNotNull(th);
        return new C41241(th);
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th) {
        return lazyStackTraceIsLazy() ? jlaStackTrace(th) : Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable th) {
        throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(@CheckForNull Throwable th, Class<X> cls) throws X {
        if (th != null) {
            throwIfInstanceOf(th, cls);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(@CheckForNull Throwable th) {
        if (th != null) {
            throwIfUnchecked(th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th, Class<X> cls) throws X {
        Preconditions.checkNotNull(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void throwIfUnchecked(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfPossible(@CheckForNull Throwable th, Class<X> cls) throws X {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(@CheckForNull Throwable th, Class<X1> cls, Class<X2> cls2) throws X {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }
}
