package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.zxing.aztec.encoder.Encoder;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.HashMap;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdj extends zzbx implements zzdk {
    public zzdj() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface : new zzdm(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzdl zzdnVar = null;
        zzdl zzdnVar2 = null;
        zzdl zzdnVar3 = null;
        zzdl zzdnVar4 = null;
        zzdq zzdsVar = null;
        zzdq zzdsVar2 = null;
        zzdq zzdsVar3 = null;
        zzdl zzdnVar5 = null;
        zzdl zzdnVar6 = null;
        zzdl zzdnVar7 = null;
        zzdl zzdnVar8 = null;
        zzdl zzdnVar9 = null;
        zzdl zzdnVar10 = null;
        zzdr zzduVar = null;
        zzdl zzdnVar11 = null;
        zzdl zzdnVar12 = null;
        zzdl zzdnVar13 = null;
        zzdl zzdnVar14 = null;
        zzdl zzdnVar15 = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzdt zzdtVar = (zzdt) zzbw.zza(parcel, zzdt.CREATOR);
                long j = parcel.readLong();
                zzbw.zzb(parcel);
                initialize(iObjectWrapperAsInterface, zzdtVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                boolean zZzc = zzbw.zzc(parcel);
                boolean zZzc2 = zzbw.zzc(parcel);
                long j2 = parcel.readLong();
                zzbw.zzb(parcel);
                logEvent(string, string2, bundle, zZzc, zZzc2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar = iInterfaceQueryLocalInterface instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface : new zzdn(strongBinder);
                }
                long j3 = parcel.readLong();
                zzbw.zzb(parcel);
                logEventAndBundle(string3, string4, bundle2, zzdnVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzc3 = zzbw.zzc(parcel);
                long j4 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserProperty(string5, string6, iObjectWrapperAsInterface2, zZzc3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzc4 = zzbw.zzc(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar15 = iInterfaceQueryLocalInterface2 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface2 : new zzdn(strongBinder2);
                }
                zzbw.zzb(parcel);
                getUserProperties(string7, string8, zZzc4, zzdnVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar14 = iInterfaceQueryLocalInterface3 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface3 : new zzdn(strongBinder3);
                }
                zzbw.zzb(parcel);
                getMaxUserProperties(string9, zzdnVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                zzbw.zzb(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar13 = iInterfaceQueryLocalInterface4 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface4 : new zzdn(strongBinder4);
                }
                zzbw.zzb(parcel);
                getConditionalUserProperties(string13, string14, zzdnVar13);
                break;
            case 11:
                boolean zZzc5 = zzbw.zzc(parcel);
                long j7 = parcel.readLong();
                zzbw.zzb(parcel);
                setMeasurementEnabled(zZzc5, j7);
                break;
            case TYPE_BYTES_VALUE:
                long j8 = parcel.readLong();
                zzbw.zzb(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                zzbw.zzb(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                zzbw.zzb(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                zzbw.zzb(parcel);
                setCurrentScreen(iObjectWrapperAsInterface3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar12 = iInterfaceQueryLocalInterface5 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface5 : new zzdn(strongBinder5);
                }
                zzbw.zzb(parcel);
                getCurrentScreenName(zzdnVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar11 = iInterfaceQueryLocalInterface6 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface6 : new zzdn(strongBinder6);
                }
                zzbw.zzb(parcel);
                getCurrentScreenClass(zzdnVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzduVar = iInterfaceQueryLocalInterface7 instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface7 : new zzdu(strongBinder7);
                }
                zzbw.zzb(parcel);
                setInstanceIdProvider(zzduVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar10 = iInterfaceQueryLocalInterface8 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface8 : new zzdn(strongBinder8);
                }
                zzbw.zzb(parcel);
                getCachedAppInstanceId(zzdnVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar9 = iInterfaceQueryLocalInterface9 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface9 : new zzdn(strongBinder9);
                }
                zzbw.zzb(parcel);
                getAppInstanceId(zzdnVar9);
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar8 = iInterfaceQueryLocalInterface10 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface10 : new zzdn(strongBinder10);
                }
                zzbw.zzb(parcel);
                getGmpAppId(zzdnVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar7 = iInterfaceQueryLocalInterface11 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface11 : new zzdn(strongBinder11);
                }
                zzbw.zzb(parcel);
                generateEventId(zzdnVar7);
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                zzbw.zzb(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                zzbw.zzb(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStarted(iObjectWrapperAsInterface4, j14);
                break;
            case 26:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStopped(iObjectWrapperAsInterface5, j15);
                break;
            case 27:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityCreated(iObjectWrapperAsInterface6, bundle5, j16);
                break;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityDestroyed(iObjectWrapperAsInterface7, j17);
                break;
            case 29:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityPaused(iObjectWrapperAsInterface8, j18);
                break;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityResumed(iObjectWrapperAsInterface9, j19);
                break;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar6 = iInterfaceQueryLocalInterface12 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface12 : new zzdn(strongBinder12);
                }
                long j20 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivitySaveInstanceState(iObjectWrapperAsInterface10, zzdnVar6, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar5 = iInterfaceQueryLocalInterface13 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface13 : new zzdn(strongBinder13);
                }
                long j21 = parcel.readLong();
                zzbw.zzb(parcel);
                performAction(bundle6, zzdnVar5, j21);
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                int i3 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                logHealthData(i3, string19, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12, iObjectWrapperAsInterface13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdsVar3 = iInterfaceQueryLocalInterface14 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface14 : new zzds(strongBinder14);
                }
                zzbw.zzb(parcel);
                setEventInterceptor(zzdsVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdsVar2 = iInterfaceQueryLocalInterface15 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface15 : new zzds(strongBinder15);
                }
                zzbw.zzb(parcel);
                registerOnMeasurementEventListener(zzdsVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdsVar = iInterfaceQueryLocalInterface16 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface16 : new zzds(strongBinder16);
                }
                zzbw.zzb(parcel);
                unregisterOnMeasurementEventListener(zzdsVar);
                break;
            case 37:
                HashMap mapZza = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                initForTests(mapZza);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar4 = iInterfaceQueryLocalInterface17 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface17 : new zzdn(strongBinder17);
                }
                int i4 = parcel.readInt();
                zzbw.zzb(parcel);
                getTestFlag(zzdnVar4, i4);
                break;
            case 39:
                boolean zZzc6 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                setDataCollectionEnabled(zZzc6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar3 = iInterfaceQueryLocalInterface18 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface18 : new zzdn(strongBinder18);
                }
                zzbw.zzb(parcel);
                isDataCollectionEnabled(zzdnVar3);
                break;
            case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                zzbw.zzb(parcel);
                clearMeasurementEnabled(j22);
                break;
            case Carousel.ENTITY_TYPE /* 44 */:
                Bundle bundle8 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdnVar2 = iInterfaceQueryLocalInterface19 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface19 : new zzdn(strongBinder19);
                }
                zzbw.zzb(parcel);
                getSessionId(zzdnVar2);
                break;
            case 48:
                Intent intent = (Intent) zzbw.zza(parcel, Intent.CREATOR);
                zzbw.zzb(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 49:
                Bundle bundle10 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                setDefaultEventParametersWithBackfill(bundle10);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
