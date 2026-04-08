package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseApp {

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String LOG_TAG = "FirebaseApp";
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final Provider<DefaultHeartBeatController> defaultHeartBeatController;
    private final String name;
    private final FirebaseOptions options;
    private static final Object LOCK = new Object();

    @GuardedBy
    static final Map<String, FirebaseApp> INSTANCES = new ArrayMap(0);
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: Proguard */
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z2);
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(14)
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        public static /* synthetic */ void access$000(Context context) {
            ensureBackgroundStateListenerRegistered(context);
        }

        private static void ensureBackgroundStateListenerRegistered(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (INSTANCE.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    AtomicReference<GlobalBackgroundStateListener> atomicReference = INSTANCE;
                    while (!atomicReference.compareAndSet(null, globalBackgroundStateListener)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            synchronized (FirebaseApp.access$200()) {
                try {
                    for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.INSTANCES.values())) {
                        if (FirebaseApp.access$400(firebaseApp).get()) {
                            FirebaseApp.access$500(firebaseApp, z2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE = new AtomicReference<>();
        private final Context applicationContext;

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        public static /* synthetic */ void access$100(Context context) {
            ensureReceiverRegistered(context);
        }

        private static void ensureReceiverRegistered(Context context) {
            if (INSTANCE.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                AtomicReference<UserUnlockReceiver> atomicReference = INSTANCE;
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.access$200()) {
                try {
                    Iterator<FirebaseApp> it = FirebaseApp.INSTANCES.values().iterator();
                    while (it.hasNext()) {
                        FirebaseApp.access$300(it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            unregister();
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(this);
        }
    }

    public FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        this.applicationContext = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.options = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.m15111of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.m15111of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.m15111of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.m7659a(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.m15111of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.componentRuntime = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new Lazy<>((Provider) new C4598a(this, context));
        this.defaultHeartBeatController = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new C4601b(this));
        FirebaseTrace.popTrace();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15098a(FirebaseApp firebaseApp, boolean z2) {
        firebaseApp.lambda$new$1(z2);
    }

    public static /* synthetic */ Object access$200() {
        return LOCK;
    }

    public static /* synthetic */ void access$300(FirebaseApp firebaseApp) {
        firebaseApp.initializeAllApis();
    }

    public static /* synthetic */ AtomicBoolean access$400(FirebaseApp firebaseApp) {
        return firebaseApp.automaticResourceManagementEnabled;
    }

    public static /* synthetic */ void access$500(FirebaseApp firebaseApp, boolean z2) {
        firebaseApp.notifyBackgroundStateChangeListeners(z2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DataCollectionConfigStorage m15099b(FirebaseApp firebaseApp, Context context) {
        return firebaseApp.lambda$new$0(context);
    }

    private void checkNotDeleted() {
        Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            try {
                Iterator<FirebaseApp> it = INSTANCES.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    private void initializeAllApis() {
        if (!UserManagerCompat.m7659a(this.applicationContext)) {
            Log.i(LOG_TAG, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            UserUnlockReceiver.access$100(this.applicationContext);
            return;
        }
        Log.i(LOG_TAG, "Device unlocked: initializing all Firebase APIs for app " + getName());
        this.componentRuntime.initializeEagerComponents(isDefaultApp());
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (LOCK) {
            try {
                if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
                if (firebaseOptionsFromResource == null) {
                    Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, firebaseOptionsFromResource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ DataCollectionConfigStorage lambda$new$0(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.componentRuntime.get(Publisher.class));
    }

    private /* synthetic */ void lambda$new$1(boolean z2) {
        if (z2) {
            return;
        }
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    private static String normalize(@NonNull String str) {
        return str.trim();
    }

    private void notifyBackgroundStateChangeListeners(boolean z2) {
        Log.d(LOG_TAG, "Notifying background state change listeners.");
        Iterator<BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z2);
        }
    }

    private void notifyOnAppDeleted() {
        Iterator<FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.name.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    @NonNull
    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @RestrictTo
    @VisibleForTesting
    public void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z2) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z2, z2)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z2 && zIsInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z2 || !zIsInBackground) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("options", this.options).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z2) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z2));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(normalize(str));
                if (firebaseApp != null) {
                    firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
                } else {
                    List<String> allAppNames = getAllAppNames();
                    if (allAppNames.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } finally {
            }
        }
        return firebaseApp;
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.access$000(context);
        String strNormalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            Preconditions.checkState(!map.containsKey(strNormalize), "FirebaseApp name " + strNormalize + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strNormalize, firebaseOptions);
            map.put(strNormalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }
}
