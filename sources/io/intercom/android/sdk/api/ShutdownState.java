package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ShutdownState {
    private static final String PREFS_SHUTDOWN_EXPIRY = "ShutdownExpiry";
    private static final String PREFS_SHUTDOWN_FINGERPRINT = "ShutdownFingerprint";
    private static final String PREFS_SHUTDOWN_REASON = "ShutdownReason";
    private final AppIdentity appIdentity;
    private final Context context;
    private final SharedPreferences prefs;

    @VisibleForTesting
    long shutdownExpiry;

    @VisibleForTesting
    String shutdownFingerprint;
    private String shutdownReason;
    private final TimeProvider timeProvider;

    public ShutdownState(Context context, AppIdentity appIdentity, TimeProvider timeProvider) {
        this.context = context;
        this.appIdentity = appIdentity;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_SHUTDOWN_PREFS, 0);
        this.prefs = sharedPreferences;
        this.timeProvider = timeProvider;
        this.shutdownExpiry = sharedPreferences.getLong(PREFS_SHUTDOWN_EXPIRY, timeProvider.currentTimeMillis());
        this.shutdownReason = sharedPreferences.getString(PREFS_SHUTDOWN_REASON, "");
        this.shutdownFingerprint = sharedPreferences.getString(PREFS_SHUTDOWN_FINGERPRINT, generateAppFingerprint(context, appIdentity));
    }

    private static String generateAppFingerprint(Context context, AppIdentity appIdentity) {
        return context.getPackageName() + "-" + DeviceUtils.getAppVersion(context) + "-" + appIdentity.appId() + "-17.0.1";
    }

    private void persistCachedAttributes() {
        this.prefs.edit().putString(PREFS_SHUTDOWN_FINGERPRINT, this.shutdownFingerprint).putString(PREFS_SHUTDOWN_REASON, this.shutdownReason).putLong(PREFS_SHUTDOWN_EXPIRY, this.shutdownExpiry).apply();
    }

    public boolean canSendNetworkRequests() {
        return ((this.shutdownExpiry > this.timeProvider.currentTimeMillis() ? 1 : (this.shutdownExpiry == this.timeProvider.currentTimeMillis() ? 0 : -1)) <= 0) || !this.shutdownFingerprint.equals(generateAppFingerprint(this.context, this.appIdentity));
    }

    public String getShutdownReason() {
        return this.shutdownReason;
    }

    public void updateShutdownState(long j, String str) {
        this.shutdownExpiry = this.timeProvider.currentTimeMillis() + j;
        this.shutdownReason = str;
        this.shutdownFingerprint = generateAppFingerprint(this.context, this.appIdentity);
        persistCachedAttributes();
    }
}
