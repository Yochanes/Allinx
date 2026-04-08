package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.CallableC2401b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";

    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;

    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;

    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;

    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(MAX_ROLLOUT_ASSIGNMENTS);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: compiled from: Proguard */
    public class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Callable<Void>> queuedSerializer = new AtomicReference<>(null);

        public SerializeableKeysMap(boolean z2) {
            this.isInternal = z2;
            this.map = new AtomicMarkableReference<>(new KeysMap(64, z2 ? UserMetadata.MAX_INTERNAL_KEY_SIZE : UserMetadata.MAX_ATTRIBUTE_SIZE), false);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Void m15186a(SerializeableKeysMap serializeableKeysMap) {
            return serializeableKeysMap.lambda$scheduleSerializationTaskIfNeeded$0();
        }

        private /* synthetic */ Void lambda$scheduleSerializationTaskIfNeeded$0() throws Throwable {
            this.queuedSerializer.set(null);
            serializeIfMarked();
            return null;
        }

        private void scheduleSerializationTaskIfNeeded() {
            CallableC4667a callableC4667a = new CallableC4667a(this, 0);
            AtomicReference<Callable<Void>> atomicReference = this.queuedSerializer;
            while (!atomicReference.compareAndSet(null, callableC4667a)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            UserMetadata.access$000(UserMetadata.this).submit(callableC4667a);
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                try {
                    if (this.map.isMarked()) {
                        keys = this.map.getReference().getKeys();
                        AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        keys = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (keys != null) {
                UserMetadata.access$200(UserMetadata.this).writeKeyData(UserMetadata.access$100(UserMetadata.this), keys, this.isInternal);
            }
        }

        public Map<String, String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.map.getReference().setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.backgroundWorker = crashlyticsBackgroundWorker;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m15184a(UserMetadata userMetadata, List list) {
        return userMetadata.lambda$updateRolloutsState$1(list);
    }

    public static /* synthetic */ CrashlyticsBackgroundWorker access$000(UserMetadata userMetadata) {
        return userMetadata.backgroundWorker;
    }

    public static /* synthetic */ String access$100(UserMetadata userMetadata) {
        return userMetadata.sessionIdentifier;
    }

    public static /* synthetic */ MetaDataStore access$200(UserMetadata userMetadata) {
        return userMetadata.metaDataStore;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m15185b(UserMetadata userMetadata) {
        return userMetadata.lambda$setUserId$0();
    }

    private /* synthetic */ Object lambda$setUserId$0() throws Throwable {
        serializeUserDataIfNeeded();
        return null;
    }

    private /* synthetic */ Object lambda$updateRolloutsState$1(List list) throws Throwable {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
        return null;
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    private void serializeUserDataIfNeeded() throws Throwable {
        boolean z2;
        String userId;
        synchronized (this.userId) {
            try {
                z2 = false;
                if (this.userId.isMarked()) {
                    userId = getUserId();
                    this.userId.set(userId, false);
                    z2 = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.userId.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            try {
                this.sessionIdentifier = str;
                Map<String, String> keys = this.customKeys.getKeys();
                List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                if (getUserId() != null) {
                    this.metaDataStore.writeUserData(str, getUserId());
                }
                if (!keys.isEmpty()) {
                    this.metaDataStore.writeKeyData(str, keys);
                }
                if (!rolloutAssignmentList.isEmpty()) {
                    this.metaDataStore.writeRolloutState(str, rolloutAssignmentList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, MAX_ATTRIBUTE_SIZE);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                    return;
                }
                this.userId.set(strSanitizeString, true);
                this.backgroundWorker.submit(new CallableC4667a(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                this.backgroundWorker.submit(new CallableC2401b(2, this, this.rolloutsState.getRolloutAssignmentList()));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
