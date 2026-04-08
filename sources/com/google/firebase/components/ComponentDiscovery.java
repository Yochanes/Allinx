package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;

    /* JADX INFO: compiled from: Proguard */
    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private final Class<? extends Service> discoveryService;

        public /* synthetic */ MetadataRegistrarNameRetriever(Class cls, C46031 c46031) {
            this(cls);
        }

        private Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(ComponentDiscovery.TAG, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.discoveryService), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(ComponentDiscovery.TAG, this.discoveryService + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(ComponentDiscovery.TAG, "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public /* bridge */ /* synthetic */ List retrieve(Context context) {
            return retrieve2(context);
        }

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.discoveryService = cls;
        }

        /* JADX INFO: renamed from: retrieve, reason: avoid collision after fix types in other method */
        public List<String> retrieve2(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                Log.w(ComponentDiscovery.TAG, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : metadata.keySet()) {
                if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str)) && str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    @VisibleForTesting
    public ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t;
        this.retriever = registrarNameRetriever;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ComponentRegistrar m15112a(String str) {
        return lambda$discoverLazy$0(str);
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls, null));
    }

    @Nullable
    private static ComponentRegistrar instantiate(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
        } catch (ClassNotFoundException unused) {
            Log.w(TAG, "Class " + str + " is not an found.");
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(AbstractC0000a.m3D("Could not instantiate ", str, "."), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(AbstractC0000a.m3D("Could not instantiate ", str, "."), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(AbstractC0000a.m13j("Could not instantiate ", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(AbstractC0000a.m13j("Could not instantiate ", str), e4);
        }
    }

    private static /* synthetic */ ComponentRegistrar lambda$discoverLazy$0(String str) {
        return instantiate(str);
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    arrayList.add(componentRegistrarInstantiate);
                }
            } catch (InvalidRegistrarException e) {
                Log.w(TAG, "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            arrayList.add(new C4608b(it.next(), 0));
        }
        return arrayList;
    }
}
