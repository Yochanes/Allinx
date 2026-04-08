package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import androidx.core.app.ActivityRecreator;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.app.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1425a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f23113a;

    public /* synthetic */ RunnableC1425a(Activity activity) {
        this.f23113a = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r4;
        ?? r3;
        Activity activity = this.f23113a;
        if (activity.isFinishing()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            Class cls = ActivityRecreator.f22945a;
            activity.recreate();
            return;
        }
        Class cls2 = ActivityRecreator.f22945a;
        ?? r32 = 1;
        r32 = 1;
        ?? r42 = 27;
        ?? r52 = 26;
        boolean z2 = i == 26 || i == 27;
        Method method = ActivityRecreator.f22950f;
        if ((!z2 || method != null) && (ActivityRecreator.f22949e != null || ActivityRecreator.f22948d != null)) {
            try {
                Object obj2 = ActivityRecreator.f22947c.get(activity);
                if (obj2 != null && (obj = ActivityRecreator.f22946b.get(activity)) != null) {
                    Application application = activity.getApplication();
                    ActivityRecreator.LifecycleCheckCallbacks lifecycleCheckCallbacks = new ActivityRecreator.LifecycleCheckCallbacks(activity);
                    application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    Handler handler = ActivityRecreator.f22951g;
                    handler.post(new ActivityRecreator.RunnableC14201(lifecycleCheckCallbacks, obj2));
                    if (i != 26 && i != 27) {
                        r32 = 0;
                    }
                    try {
                        if (r32 != 0) {
                            try {
                                Boolean bool = Boolean.FALSE;
                                r32 = application;
                                r42 = lifecycleCheckCallbacks;
                                r52 = handler;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            } catch (Throwable th) {
                                th = th;
                                r3 = application;
                                r4 = lifecycleCheckCallbacks;
                                r5 = handler;
                                r5.post(new ActivityRecreator.RunnableC14212(r3, r4));
                                throw th;
                            }
                        } else {
                            r32 = application;
                            r42 = lifecycleCheckCallbacks;
                            r52 = handler;
                            activity.recreate();
                        }
                        r52.post(new ActivityRecreator.RunnableC14212(r32, r42));
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = r32;
                        r4 = r42;
                        r5 = r52;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        activity.recreate();
    }
}
