package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface zzdk extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zzdl zzdlVar);

    void getAppInstanceId(zzdl zzdlVar);

    void getCachedAppInstanceId(zzdl zzdlVar);

    void getConditionalUserProperties(String str, String str2, zzdl zzdlVar);

    void getCurrentScreenClass(zzdl zzdlVar);

    void getCurrentScreenName(zzdl zzdlVar);

    void getGmpAppId(zzdl zzdlVar);

    void getMaxUserProperties(String str, zzdl zzdlVar);

    void getSessionId(zzdl zzdlVar);

    void getTestFlag(zzdl zzdlVar, int i);

    void getUserProperties(String str, String str2, boolean z2, zzdl zzdlVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdt zzdtVar, long j);

    void isDataCollectionEnabled(zzdl zzdlVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdl zzdlVar, long j);

    void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdl zzdlVar, long j);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j);

    void performAction(Bundle bundle, zzdl zzdlVar, long j);

    void registerOnMeasurementEventListener(zzdq zzdqVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setDefaultEventParametersWithBackfill(Bundle bundle);

    void setEventInterceptor(zzdq zzdqVar);

    void setInstanceIdProvider(zzdr zzdrVar);

    void setMeasurementEnabled(boolean z2, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j);

    void unregisterOnMeasurementEventListener(zzdq zzdqVar);
}
