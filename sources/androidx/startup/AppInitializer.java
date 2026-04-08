package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AppInitializer {

    /* JADX INFO: renamed from: d */
    public static volatile AppInitializer f32149d;

    /* JADX INFO: renamed from: e */
    public static final Object f32150e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f32153c;

    /* JADX INFO: renamed from: b */
    public final HashSet f32152b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f32151a = new HashMap();

    public AppInitializer(Context context) {
        this.f32153c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static AppInitializer m11945c(Context context) {
        if (f32149d == null) {
            synchronized (f32150e) {
                try {
                    if (f32149d == null) {
                        f32149d = new AppInitializer(context);
                    }
                } finally {
                }
            }
        }
        return f32149d;
    }

    /* JADX INFO: renamed from: a */
    public final void m11946a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f32153c.getString(com.exchange.allin.R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f32152b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m11947b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m11947b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (Trace.m11951d()) {
            try {
                android.os.Trace.beginSection(Trace.m11952e(cls.getSimpleName()));
            } catch (Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f32151a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = initializer.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            m11947b(cls2, hashSet);
                        }
                    }
                }
                objCreate = initializer.create(this.f32153c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        android.os.Trace.endSection();
        return objCreate;
    }
}
