package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzla<T extends zzkp> {
    private static String zza = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static <T extends zzkp> T zza(Class<T> cls) {
        String str;
        ClassLoader classLoader = zzla.class.getClassLoader();
        if (cls.equals(zzkp.class)) {
            str = zza;
        } else {
            if (!cls.getPackage().equals(zzla.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = cls.getPackage().getName() + ".BlazeGenerated" + cls.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    return cls.cast(((zzla) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzla.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzla) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(zzkl.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract T zza();
}
