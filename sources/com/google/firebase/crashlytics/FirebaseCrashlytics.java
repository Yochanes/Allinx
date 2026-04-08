package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";

    @VisibleForTesting
    final CrashlyticsCore core;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C46271 implements Continuation<Void, Object> {
        @Override // com.google.android.gms.tasks.Continuation
        public Object then(@NonNull Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            Logger.getLogger().m15164e("Error fetching settings.", task.getException());
            return null;
        }
    }

    private FirebaseCrashlytics(@NonNull CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Nullable
    public static FirebaseCrashlytics init(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Deferred<CrashlyticsNativeComponent> deferred, @NonNull Deferred<AnalyticsConnector> deferred2, @NonNull Deferred<FirebaseRemoteConfigInterop> deferred3, @Background ExecutorService executorService, @Blocking ExecutorService executorService2) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Logger.getLogger().m15165i("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        ExecutorService executorServiceBuildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler");
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, executorServiceBuildSingleThreadExecutorService, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3));
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
        List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
        Logger.getLogger().m15161d("Mapping file ID is: " + mappingFileId);
        for (BuildIdInfo buildIdInfo2 : buildIdInfo) {
            Logger logger = Logger.getLogger();
            String libraryName = buildIdInfo2.getLibraryName();
            String arch = buildIdInfo2.getArch();
            String buildId = buildIdInfo2.getBuildId();
            StringBuilder sbM25v = AbstractC0000a.m25v("Build id for ", libraryName, " on ", arch, ": ");
            sbM25v.append(buildId);
            logger.m15161d(sbM25v.toString());
        }
        try {
            AppData appDataCreate = AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
            Logger.getLogger().m15167v("Installer package name is: " + appDataCreate.installerPackageName);
            Executor executorBuildSequentialExecutor = ExecutorUtils.buildSequentialExecutor(executorService);
            SettingsController settingsControllerCreate = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
            settingsControllerCreate.loadSettingsData(executorBuildSequentialExecutor).continueWith(executorBuildSequentialExecutor, new C46271());
            if (crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate)) {
                crashlyticsCore.doBackgroundInitializationAsync(settingsControllerCreate);
            }
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().m15164e("Error retrieving app package info.", e);
            return null;
        }
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void log(@NonNull String str) {
        this.core.log(str);
    }

    public void recordException(@NonNull Throwable th) {
        if (th == null) {
            Logger.getLogger().m15169w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z2) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z2));
    }

    public void setCustomKey(@NonNull String str, boolean z2) {
        this.core.setCustomKey(str, Boolean.toString(z2));
    }

    public void setCustomKeys(@NonNull CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.keysAndValues);
    }

    public void setUserId(@NonNull String str) {
        this.core.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(@NonNull String str, double d) {
        this.core.setCustomKey(str, Double.toString(d));
    }

    public void setCustomKey(@NonNull String str, float f) {
        this.core.setCustomKey(str, Float.toString(f));
    }

    public void setCustomKey(@NonNull String str, int i) {
        this.core.setCustomKey(str, Integer.toString(i));
    }

    public void setCustomKey(@NonNull String str, long j) {
        this.core.setCustomKey(str, Long.toString(j));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.core.setCustomKey(str, str2);
    }
}
