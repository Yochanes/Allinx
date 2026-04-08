package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdm extends zzbu implements zzdk {
    public zzdm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeLong(j);
        zzb(23, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, bundle);
        zzb(9, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeLong(j);
        zzb(43, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeLong(j);
        zzb(24, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void generateEventId(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(22, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getAppInstanceId(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(20, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getCachedAppInstanceId(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(19, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getConditionalUserProperties(String str, String str2, zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(10, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getCurrentScreenClass(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(17, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getCurrentScreenName(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(16, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getGmpAppId(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(21, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getMaxUserProperties(String str, zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(6, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getSessionId(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(46, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getTestFlag(zzdl zzdlVar, int i) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        parcelM14490a_.writeInt(i);
        zzb(38, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void getUserProperties(String str, String str2, boolean z2, zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, z2);
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(5, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void initForTests(Map map) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeMap(map);
        zzb(37, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void initialize(IObjectWrapper iObjectWrapper, zzdt zzdtVar, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        zzbw.zza(parcelM14490a_, zzdtVar);
        parcelM14490a_.writeLong(j);
        zzb(1, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void isDataCollectionEnabled(zzdl zzdlVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdlVar);
        zzb(40, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, bundle);
        zzbw.zza(parcelM14490a_, z2);
        zzbw.zza(parcelM14490a_, z3);
        parcelM14490a_.writeLong(j);
        zzb(2, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdl zzdlVar, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, bundle);
        zzbw.zza(parcelM14490a_, zzdlVar);
        parcelM14490a_.writeLong(j);
        zzb(3, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeInt(i);
        parcelM14490a_.writeString(str);
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        zzbw.zza(parcelM14490a_, iObjectWrapper2);
        zzbw.zza(parcelM14490a_, iObjectWrapper3);
        zzb(33, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        zzbw.zza(parcelM14490a_, bundle);
        parcelM14490a_.writeLong(j);
        zzb(27, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeLong(j);
        zzb(28, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeLong(j);
        zzb(29, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeLong(j);
        zzb(30, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdl zzdlVar, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        zzbw.zza(parcelM14490a_, zzdlVar);
        parcelM14490a_.writeLong(j);
        zzb(31, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeLong(j);
        zzb(25, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeLong(j);
        zzb(26, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void performAction(Bundle bundle, zzdl zzdlVar, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        zzbw.zza(parcelM14490a_, zzdlVar);
        parcelM14490a_.writeLong(j);
        zzb(32, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void registerOnMeasurementEventListener(zzdq zzdqVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdqVar);
        zzb(35, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void resetAnalyticsData(long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeLong(j);
        zzb(12, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        parcelM14490a_.writeLong(j);
        zzb(8, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setConsent(Bundle bundle, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        parcelM14490a_.writeLong(j);
        zzb(44, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        parcelM14490a_.writeLong(j);
        zzb(45, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        parcelM14490a_.writeLong(j);
        zzb(15, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setDataCollectionEnabled(boolean z2) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, z2);
        zzb(39, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        zzb(42, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setDefaultEventParametersWithBackfill(Bundle bundle) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        zzb(49, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setEventInterceptor(zzdq zzdqVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdqVar);
        zzb(34, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setInstanceIdProvider(zzdr zzdrVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdrVar);
        zzb(18, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setMeasurementEnabled(boolean z2, long j) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, z2);
        parcelM14490a_.writeLong(j);
        zzb(11, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setMinimumSessionDuration(long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeLong(j);
        zzb(13, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeLong(j);
        zzb(14, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, intent);
        zzb(48, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setUserId(String str, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeLong(j);
        zzb(7, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, iObjectWrapper);
        zzbw.zza(parcelM14490a_, z2);
        parcelM14490a_.writeLong(j);
        zzb(4, parcelM14490a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdk
    public final void unregisterOnMeasurementEventListener(zzdq zzdqVar) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, zzdqVar);
        zzb(36, parcelM14490a_);
    }
}
