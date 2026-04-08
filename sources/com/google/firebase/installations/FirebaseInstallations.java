package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.CallableC2336b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C4608b;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private final ExecutorService backgroundExecutor;

    @GuardedBy
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;

    @GuardedBy
    private Set<FidListener> fidListeners;
    private final FirebaseApp firebaseApp;
    private final Lazy<IidStore> iidStore;

    @GuardedBy
    private final List<StateListener> listeners;
    private final Object lock;
    private final Executor networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;
    private static final Object lockGenerateFid = new Object();
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactoryC47181();

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC47181 implements ThreadFactory {
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.mCount.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C47192 implements FidListenerHandle {
        final /* synthetic */ FidListener val$listener;

        public C47192(FidListener fidListener) {
            this.val$listener = fidListener;
        }

        @Override // com.google.firebase.installations.internal.FidListenerHandle
        public void unregister() {
            synchronized (FirebaseInstallations.this) {
                FirebaseInstallations.access$000(FirebaseInstallations.this).remove(this.val$listener);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$3 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C47203 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode */
        static final /* synthetic */ int[] f42819xc38d2559;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode */
        static final /* synthetic */ int[] f42820xe5baa01a;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f42820xe5baa01a = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42820xe5baa01a[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42820xe5baa01a[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f42819xc38d2559 = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42819xc38d2559[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new PersistedInstallation(firebaseApp), Utils.getInstance(), new Lazy((Provider) new C4608b(firebaseApp, 1)), new RandomFidGenerator());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m15217a(FirebaseInstallations firebaseInstallations) {
        return firebaseInstallations.deleteFirebaseInstallationId();
    }

    public static /* synthetic */ Set access$000(FirebaseInstallations firebaseInstallations) {
        return firebaseInstallations.fidListeners;
    }

    private Task<InstallationTokenResult> addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetAuthTokenListener(this.utils, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> addGetIdListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void addStateListeners(StateListener stateListener) {
        synchronized (this.lock) {
            this.listeners.add(stateListener);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15218b(FirebaseInstallations firebaseInstallations, boolean z2) {
        firebaseInstallations.lambda$getToken$2(z2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15219c(FirebaseInstallations firebaseInstallations, boolean z2) {
        firebaseInstallations.lambda$doRegistrationOrRefresh$3(z2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15220d(FirebaseInstallations firebaseInstallations) {
        firebaseInstallations.lambda$getId$1();
    }

    private Void deleteFirebaseInstallationId() {
        updateCacheFid(null);
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    private void doNetworkCallIfNecessary(boolean z2) {
        PersistedInstallationEntry persistedInstallationEntryRegisterFidWithServer;
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        try {
            if (multiProcessSafePrefs.isErrored() || multiProcessSafePrefs.isUnregistered()) {
                persistedInstallationEntryRegisterFidWithServer = registerFidWithServer(multiProcessSafePrefs);
            } else {
                if (!z2 && !this.utils.isAuthTokenExpired(multiProcessSafePrefs)) {
                    return;
                }
                persistedInstallationEntryRegisterFidWithServer = fetchAuthTokenFromServer(multiProcessSafePrefs);
            }
            insertOrUpdatePrefs(persistedInstallationEntryRegisterFidWithServer);
            updateFidListener(multiProcessSafePrefs, persistedInstallationEntryRegisterFidWithServer);
            if (persistedInstallationEntryRegisterFidWithServer.isRegistered()) {
                updateCacheFid(persistedInstallationEntryRegisterFidWithServer.getFirebaseInstallationId());
            }
            if (persistedInstallationEntryRegisterFidWithServer.isErrored()) {
                triggerOnException(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
            } else if (persistedInstallationEntryRegisterFidWithServer.isNotGenerated()) {
                triggerOnException(new IOException(AUTH_ERROR_MSG));
            } else {
                triggerOnStateReached(persistedInstallationEntryRegisterFidWithServer);
            }
        } catch (FirebaseInstallationsException e) {
            triggerOnException(e);
        }
    }

    private final void doRegistrationOrRefresh(boolean z2) {
        PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        if (z2) {
            prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
        this.networkExecutor.execute(new RunnableC4722a(this, z2, 0));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ IidStore m15221e(FirebaseApp firebaseApp) {
        return lambda$new$0(firebaseApp);
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult tokenResultGenerateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i = C47203.f42820xe5baa01a[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        updateCacheFid(null);
        return persistedInstallationEntry.withNoGeneratedFid();
    }

    private synchronized String getCacheFid() {
        return this.cachedFid;
    }

    private IidStore getIidStore() {
        return this.iidStore.get();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* JADX WARN: Finally extract failed */
    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            try {
                CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
                try {
                    persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                } catch (Throwable th) {
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            try {
                CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
                try {
                    persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        persistedInstallationEntryValue = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(persistedInstallationEntryValue)));
                    }
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                } catch (Throwable th) {
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            try {
                CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
                try {
                    this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                } catch (Throwable th) {
                    if (crossProcessLockAcquire != null) {
                        crossProcessLockAcquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private /* synthetic */ void lambda$doRegistrationOrRefresh$3(boolean z2) {
        doNetworkCallIfNecessary(z2);
    }

    private /* synthetic */ void lambda$getId$1() {
        doRegistrationOrRefresh(false);
    }

    private /* synthetic */ void lambda$getToken$2(boolean z2) {
        doRegistrationOrRefresh(z2);
    }

    private static /* synthetic */ IidStore lambda$new$0(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    private void preConditionChecks() {
        Preconditions.checkNotEmpty(getApplicationId(), APP_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getApiKey(), API_KEY_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidAppIdFormat(getApplicationId()), APP_ID_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidApiKeyFormat(getApiKey()), API_KEY_VALIDATION_MSG);
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) && !this.firebaseApp.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.fidGenerator.createRandomFid();
        }
        String iid = getIidStore().readIid();
        return TextUtils.isEmpty(iid) ? this.fidGenerator.createRandomFid() : iid;
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse installationResponseCreateFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
        int i = C47203.f42819xc38d2559[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void triggerOnException(Exception exc) {
        synchronized (this.lock) {
            try {
                Iterator<StateListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    if (it.next().onException(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            try {
                Iterator<StateListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    if (it.next().onStateReached(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void updateCacheFid(String str) {
        this.cachedFid = str;
    }

    private synchronized void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.fidListeners.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
            Iterator<FidListener> it = this.fidListeners.iterator();
            while (it.hasNext()) {
                it.next().onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.backgroundExecutor, new CallableC2336b(this, 1));
    }

    @Nullable
    public String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    @VisibleForTesting
    public String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        preConditionChecks();
        String cacheFid = getCacheFid();
        if (cacheFid != null) {
            return Tasks.forResult(cacheFid);
        }
        Task<String> taskAddGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(new RunnableC0015a(this, 23));
        return taskAddGetIdListener;
    }

    @VisibleForTesting
    public String getName() {
        return this.firebaseApp.getName();
    }

    @Nullable
    public String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(boolean z2) {
        preConditionChecks();
        Task<InstallationTokenResult> taskAddGetAuthTokenListener = addGetAuthTokenListener();
        this.backgroundExecutor.execute(new RunnableC4722a(this, z2, 1));
        return taskAddGetAuthTokenListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public synchronized FidListenerHandle registerFidListener(@NonNull FidListener fidListener) {
        this.fidListeners.add(fidListener);
        return new C47192(fidListener);
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy<IidStore> lazy, RandomFidGenerator randomFidGenerator) {
        this.lock = new Object();
        this.fidListeners = new HashSet();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = executor;
    }
}
