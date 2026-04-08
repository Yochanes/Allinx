package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 3;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final String ON_DEMAND_DROPPED_KEY = "com.crashlytics.on-demand.dropped-exceptions";
    private static final String ON_DEMAND_RECORDED_KEY = "com.crashlytics.on-demand.recorded-exceptions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private final CrashlyticsBackgroundWorker backgroundWorker;

    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private final ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final FileStore fileStore;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime = System.currentTimeMillis();
    private final OnDemandCounter onDemandCounter = new OnDemandCounter();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$1 */
    /* JADX INFO: compiled from: Proguard */
    public class CallableC46531 implements Callable<Task<Void>> {
        final /* synthetic */ SettingsProvider val$settingsProvider;

        public CallableC46531(SettingsProvider settingsProvider) {
            this.val$settingsProvider = settingsProvider;
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Task<Void> call() {
            return call();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Task<Void> call() {
            return CrashlyticsCore.access$000(CrashlyticsCore.this, this.val$settingsProvider);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC46542 implements Runnable {
        final /* synthetic */ SettingsProvider val$settingsProvider;

        public RunnableC46542(SettingsProvider settingsProvider) {
            this.val$settingsProvider = settingsProvider;
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsCore.access$000(CrashlyticsCore.this, this.val$settingsProvider);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$3 */
    /* JADX INFO: compiled from: Proguard */
    public class CallableC46553 implements Callable<Boolean> {
        public CallableC46553() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() {
            return call();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            try {
                boolean zRemove = CrashlyticsCore.access$100(CrashlyticsCore.this).remove();
                if (!zRemove) {
                    Logger.getLogger().m15169w("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zRemove);
            } catch (Exception e) {
                Logger.getLogger().m15164e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$4 */
    /* JADX INFO: compiled from: Proguard */
    public class CallableC46564 implements Callable<Boolean> {
        public CallableC46564() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() {
            return call();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(CrashlyticsCore.access$200(CrashlyticsCore.this).didCrashOnPreviousExecution());
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.crashHandlerExecutor = executorService;
        this.fileStore = fileStore;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
    }

    public static /* synthetic */ Task access$000(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        return crashlyticsCore.doBackgroundInitialization(settingsProvider);
    }

    public static /* synthetic */ CrashlyticsFileMarker access$100(CrashlyticsCore crashlyticsCore) {
        return crashlyticsCore.initializationMarker;
    }

    public static /* synthetic */ CrashlyticsController access$200(CrashlyticsCore crashlyticsCore) {
        return crashlyticsCore.controller;
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submit(new CallableC46564())));
        } catch (Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    @CanIgnoreReturnValue
    private Task<Void> doBackgroundInitialization(SettingsProvider settingsProvider) {
        markInitializationStarted();
        try {
            this.breadcrumbSource.registerBreadcrumbHandler(new C4661c(this));
            this.controller.saveVersionControlInfo();
            if (!settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                Logger.getLogger().m15161d("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.controller.finalizeSessions(settingsProvider)) {
                Logger.getLogger().m15169w("Previous sessions could not be finalized.");
            }
            return this.controller.submitAllReports(settingsProvider.getSettingsAsync());
        } catch (Exception e) {
            Logger.getLogger().m15164e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.forException(e);
        } finally {
            markInitializationComplete();
        }
    }

    private void finishInitSynchronously(SettingsProvider settingsProvider) {
        Future<?> futureSubmit = this.crashHandlerExecutor.submit(new RunnableC46542(settingsProvider));
        Logger.getLogger().m15161d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().m15164e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.getLogger().m15164e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().m15164e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isBuildIdValid(String str, boolean z2) {
        if (!z2) {
            Logger.getLogger().m15167v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".     |  | ");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".   \\ |  | /");
        Log.e(Logger.TAG, ".    \\    /");
        Log.e(Logger.TAG, ".     \\  /");
        Log.e(Logger.TAG, ".      \\/");
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, MISSING_BUILD_ID_MSG);
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".      /\\");
        Log.e(Logger.TAG, ".     /  \\");
        Log.e(Logger.TAG, ".    /    \\");
        Log.e(Logger.TAG, ".   / |  | \\");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".");
        return false;
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.controller.checkForUnsentReports();
    }

    public Task<Void> deleteUnsentReports() {
        return this.controller.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    @CanIgnoreReturnValue
    public Task<Void> doBackgroundInitializationAsync(SettingsProvider settingsProvider) {
        return Utils.callTask(this.crashHandlerExecutor, new CallableC46531(settingsProvider));
    }

    public CrashlyticsController getController() {
        return this.controller;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void log(String str) {
        this.controller.writeToLog(System.currentTimeMillis() - this.startTime, str);
    }

    public void logException(@NonNull Throwable th) {
        this.controller.writeNonFatalException(Thread.currentThread(), th);
    }

    public void logFatalException(Throwable th) throws Throwable {
        Logger.getLogger().m15161d("Recorded on-demand fatal events: " + this.onDemandCounter.getRecordedOnDemandExceptions());
        Logger.getLogger().m15161d("Dropped on-demand fatal events: " + this.onDemandCounter.getDroppedOnDemandExceptions());
        this.controller.setInternalKey(ON_DEMAND_RECORDED_KEY, Integer.toString(this.onDemandCounter.getRecordedOnDemandExceptions()));
        this.controller.setInternalKey(ON_DEMAND_DROPPED_KEY, Integer.toString(this.onDemandCounter.getDroppedOnDemandExceptions()));
        this.controller.logFatalException(Thread.currentThread(), th);
    }

    public void markInitializationComplete() {
        this.backgroundWorker.submit(new CallableC46553());
    }

    public void markInitializationStarted() {
        this.backgroundWorker.checkRunningOnThread();
        this.initializationMarker.create();
        Logger.getLogger().m15167v("Initialization marker file was created.");
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        if (!isBuildIdValid(appData.buildId, CommonUtils.getBooleanResourceValue(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            throw new IllegalStateException(MISSING_BUILD_ID_MSG);
        }
        String sessionId = new CLSUUID().getSessionId();
        try {
            this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, this.fileStore);
            this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, this.fileStore);
            UserMetadata userMetadata = new UserMetadata(sessionId, this.fileStore, this.backgroundWorker);
            LogFileManager logFileManager = new LogFileManager(this.fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
            this.remoteConfigDeferredProxy.setupListener(userMetadata);
            this.controller = new CrashlyticsController(this.context, this.backgroundWorker, this.idManager, this.dataCollectionArbiter, this.fileStore, this.crashMarker, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.context, this.idManager, this.fileStore, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.onDemandCounter, this.sessionsSubscriber), this.nativeComponent, this.analyticsEventLogger, this.sessionsSubscriber);
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(sessionId, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (!zDidPreviousInitializationFail || !CommonUtils.canTryConnection(this.context)) {
                Logger.getLogger().m15161d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().m15161d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(settingsProvider);
            return false;
        } catch (Exception e) {
            Logger.getLogger().m15164e("Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    public Task<Void> sendUnsentReports() {
        return this.controller.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        this.controller.setCustomKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.controller.setCustomKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        this.controller.setInternalKey(str, str2);
    }

    public void setUserId(String str) {
        this.controller.setUserId(str);
    }
}
