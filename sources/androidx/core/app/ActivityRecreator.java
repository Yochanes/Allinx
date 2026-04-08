package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
final class ActivityRecreator {

    /* JADX INFO: renamed from: a */
    public static final Class f22945a;

    /* JADX INFO: renamed from: b */
    public static final Field f22946b;

    /* JADX INFO: renamed from: c */
    public static final Field f22947c;

    /* JADX INFO: renamed from: d */
    public static final Method f22948d;

    /* JADX INFO: renamed from: e */
    public static final Method f22949e;

    /* JADX INFO: renamed from: f */
    public static final Method f22950f;

    /* JADX INFO: renamed from: g */
    public static final Handler f22951g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.core.app.ActivityRecreator$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14201 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LifecycleCheckCallbacks f22952a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f22953b;

        public RunnableC14201(LifecycleCheckCallbacks lifecycleCheckCallbacks, Object obj) {
            this.f22952a = lifecycleCheckCallbacks;
            this.f22953b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22952a.f22958a = this.f22953b;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ActivityRecreator$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14212 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Application f22954a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LifecycleCheckCallbacks f22955b;

        public RunnableC14212(Application application, LifecycleCheckCallbacks lifecycleCheckCallbacks) {
            this.f22954a = application;
            this.f22955b = lifecycleCheckCallbacks;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22954a.unregisterActivityLifecycleCallbacks(this.f22955b);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ActivityRecreator$3 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14223 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f22956a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f22957b;

        public RunnableC14223(Object obj, Object obj2) {
            this.f22956a = obj;
            this.f22957b = obj2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Method method = ActivityRecreator.f22948d;
                Object obj = this.f22957b;
                Object obj2 = this.f22956a;
                if (method != null) {
                    method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                } else {
                    ActivityRecreator.f22949e.invoke(obj2, obj, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f22945a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f22946b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f22947c = declaredField2;
        Class cls2 = f22945a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f22948d = declaredMethod;
        Class cls4 = f22945a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f22949e = declaredMethod2;
        Class cls5 = f22945a;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f22950f = method;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f22958a;

        /* JADX INFO: renamed from: b */
        public Activity f22959b;

        /* JADX INFO: renamed from: c */
        public final int f22960c;

        /* JADX INFO: renamed from: d */
        public boolean f22961d = false;

        /* JADX INFO: renamed from: f */
        public boolean f22962f = false;

        /* JADX INFO: renamed from: g */
        public boolean f22963g = false;

        public LifecycleCheckCallbacks(Activity activity) {
            this.f22959b = activity;
            this.f22960c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f22959b == activity) {
                this.f22959b = null;
                this.f22962f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f22962f || this.f22963g || this.f22961d) {
                return;
            }
            Object obj = this.f22958a;
            try {
                Object obj2 = ActivityRecreator.f22947c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f22960c) {
                    ActivityRecreator.f22951g.postAtFrontOfQueue(new RunnableC14223(ActivityRecreator.f22946b.get(activity), obj2));
                    this.f22963g = true;
                    this.f22958a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f22959b == activity) {
                this.f22961d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
