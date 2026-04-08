package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.concurrent.C4623g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";

    @GuardedBy
    private static Store store;

    @GuardedBy
    @VisibleForTesting
    static ScheduledExecutorService syncExecutor;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;

    @Nullable
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;

    @GuardedBy
    private boolean syncScheduledOrRunning;
    private final Task<TopicsSubscriber> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);

    @VisibleForTesting
    static Provider<TransportFactory> transportFactory = new C4623g(5);

    /* JADX INFO: compiled from: Proguard */
    public class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";

        @Nullable
        @GuardedBy
        private Boolean autoInitEnabled;

        @Nullable
        @GuardedBy
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;

        @GuardedBy
        private boolean initialized;
        private final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15245a(AutoInit autoInit, Event event) {
            autoInit.lambda$initialize$0(event);
        }

        private /* synthetic */ void lambda$initialize$0(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.access$100(FirebaseMessaging.this);
            }
        }

        @Nullable
        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.access$000(FirebaseMessaging.this).getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(AUTO_INIT_PREF)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(AUTO_INIT_PREF, false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void initialize() {
            try {
                if (this.initialized) {
                    return;
                }
                Boolean enabled = readEnabled();
                this.autoInitEnabled = enabled;
                if (enabled == null) {
                    C4747j c4747j = new C4747j(this);
                    this.dataCollectionDefaultChangeEventHandler = c4747j;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, c4747j);
                }
                this.initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean isEnabled() {
            Boolean bool;
            try {
                initialize();
                bool = this.autoInitEnabled;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.access$000(FirebaseMessaging.this).isDataCollectionDefaultEnabled();
        }

        public synchronized void setEnabled(boolean z2) {
            try {
                initialize();
                EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
                if (eventHandler != null) {
                    this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.access$000(FirebaseMessaging.this).getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean(AUTO_INIT_PREF, z2);
                editorEdit.apply();
                if (z2) {
                    FirebaseMessaging.access$100(FirebaseMessaging.this);
                }
                this.autoInitEnabled = Boolean.valueOf(z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15230a(FirebaseMessaging firebaseMessaging, Void r1) {
        firebaseMessaging.lambda$setNotificationDelegationEnabled$6(r1);
    }

    public static /* synthetic */ FirebaseApp access$000(FirebaseMessaging firebaseMessaging) {
        return firebaseMessaging.firebaseApp;
    }

    public static /* synthetic */ void access$100(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.startSyncIfNecessary();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m15231b(FirebaseMessaging firebaseMessaging, String str, Store.Token token, String str2) {
        return firebaseMessaging.lambda$blockingGetToken$13(str, token, str2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15232c(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.lambda$new$2();
    }

    @VisibleForTesting
    public static synchronized void clearStoreForTest() {
        store = null;
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new C4623g(4);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15233d(FirebaseMessaging firebaseMessaging, String str) {
        firebaseMessaging.lambda$new$1(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15234e(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$getToken$7(taskCompletionSource);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15235f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$deleteToken$8(taskCompletionSource);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Task m15236g(String str, TopicsSubscriber topicsSubscriber) {
        return lambda$unsubscribeFromTopic$11(str, topicsSubscriber);
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    private static synchronized Store getStore(Context context) {
        try {
            if (store == null) {
                store = new Store(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return store;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    @Nullable
    public static TransportFactory getTransportFactory() {
        return transportFactory.get();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ TransportFactory m15237h() {
        return lambda$static$0();
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().addOnSuccessListener(this.initExecutor, new C4745h(this, 3));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15238i(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.lambda$new$4();
    }

    private void initializeProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    private void invokeOnTokenRefresh(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.firebaseApp.getName());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15239j(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.lambda$handleProxiedNotificationData$5(cloudMessage);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ TransportFactory m15240k() {
        return lambda$clearTransportFactoryForTest$12();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Task m15241l(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        return firebaseMessaging.lambda$blockingGetToken$14(str, token);
    }

    private /* synthetic */ Task lambda$blockingGetToken$13(String str, Store.Token token, String str2) {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            invokeOnTokenRefresh(str2);
        }
        return Tasks.forResult(str2);
    }

    private /* synthetic */ Task lambda$blockingGetToken$14(String str, Store.Token token) {
        return this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new C4746i(this, str, token));
    }

    private static /* synthetic */ TransportFactory lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    private /* synthetic */ void lambda$deleteToken$8(TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.deleteToken(Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private /* synthetic */ void lambda$deleteToken$9(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private /* synthetic */ void lambda$getToken$7(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private /* synthetic */ void lambda$handleProxiedNotificationData$5(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            MessagingAnalytics.logNotificationReceived(cloudMessage.getIntent());
            handleProxiedNotificationData();
        }
    }

    private /* synthetic */ void lambda$new$1(String str) {
        invokeOnTokenRefresh(str);
    }

    private /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    private /* synthetic */ void lambda$new$3(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    private /* synthetic */ void lambda$new$4() {
        initializeProxyNotifications();
    }

    private /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r3) {
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    private static /* synthetic */ TransportFactory lambda$static$0() {
        return null;
    }

    private static /* synthetic */ Task lambda$subscribeToTopic$10(String str, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.subscribeToTopic(str);
    }

    private static /* synthetic */ Task lambda$unsubscribeFromTopic$11(String str, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.unsubscribeFromTopic(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m15242m(FirebaseMessaging firebaseMessaging, TopicsSubscriber topicsSubscriber) {
        firebaseMessaging.lambda$new$3(topicsSubscriber);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Task m15243n(String str, TopicsSubscriber topicsSubscriber) {
        return lambda$subscribeToTopic$10(str, topicsSubscriber);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15244o(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$deleteToken$9(taskCompletionSource);
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        if (!ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    private void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new C4746i(this, defaultSenderId, tokenWithoutTriggeringSync)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (this.iid != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new RunnableC4743f(this, taskCompletionSource, 2));
            return taskCompletionSource.getTask();
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        FcmExecutors.newNetworkIOExecutor().execute(new RunnableC4743f(this, taskCompletionSource2, 0));
        return taskCompletionSource2.getTask();
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    @NonNull
    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new RunnableC4743f(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Nullable
    @VisibleForTesting
    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    public Task<TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    @Deprecated
    public void send(@NonNull RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        remoteMessage.populateSendMessageIntent(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z2) {
        this.autoInit.setEnabled(z2);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z2) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z2);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z2) {
        return ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z2).addOnSuccessListener(new ExecutorC0154a(1), new C4745h(this, 2));
    }

    public synchronized void setSyncScheduledOrRunning(boolean z2) {
        this.syncScheduledOrRunning = z2;
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull String str) {
        return this.topicsSubscriberTask.onSuccessTask(new C4742e(str, 0));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    @VisibleForTesting
    public boolean tokenNeedsRefresh(@Nullable Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull String str) {
        return this.topicsSubscriberTask.onSuccessTask(new C4742e(str, 1));
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<TransportFactory> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new C4745h(this, 1));
        }
        executor2.execute(new RunnableC4744g(this, 0));
        Task<TopicsSubscriber> taskCreateInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = taskCreateInstance;
        taskCreateInstance.addOnSuccessListener(executor2, new C4745h(this, 0));
        executor2.execute(new RunnableC4744g(this, 1));
    }
}
