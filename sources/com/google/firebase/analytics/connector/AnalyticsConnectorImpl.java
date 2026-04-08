package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzb;

    @VisibleForTesting
    final Map<String, com.google.firebase.analytics.connector.internal.zza> zza;

    @VisibleForTesting
    private final AppMeasurementSdk zzc;

    /* JADX INFO: renamed from: com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C45991 implements AnalyticsConnector.AnalyticsConnectorHandle {
        private final /* synthetic */ String zza;
        private final /* synthetic */ AnalyticsConnectorImpl zzb;

        public C45991(AnalyticsConnectorImpl analyticsConnectorImpl, String str) {
            this.zza = str;
            this.zzb = analyticsConnectorImpl;
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        @KeepForSdk
        public void registerEventNames(Set<String> set) {
            if (!AnalyticsConnectorImpl.zza(this.zzb, this.zza) || !this.zza.equals(AppMeasurement.FIAM_ORIGIN) || set == null || set.isEmpty()) {
                return;
            }
            this.zzb.zza.get(this.zza).zza(set);
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregister() {
            if (AnalyticsConnectorImpl.zza(this.zzb, this.zza)) {
                AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = this.zzb.zza.get(this.zza).zza();
                if (analyticsConnectorListenerZza != null) {
                    analyticsConnectorListenerZza.onMessageTriggered(0, null);
                }
                this.zzb.zza.remove(this.zza);
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        @KeepForSdk
        public void unregisterEventNames() {
            if (AnalyticsConnectorImpl.zza(this.zzb, this.zza) && this.zza.equals(AppMeasurement.FIAM_ORIGIN)) {
                this.zzb.zza.get(this.zza).zzb();
            }
        }
    }

    private AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.zzc = appMeasurementSdk;
        this.zza = new ConcurrentHashMap();
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static /* bridge */ /* synthetic */ boolean zza(AnalyticsConnectorImpl analyticsConnectorImpl, String str) {
        return analyticsConnectorImpl.zza(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || zzd.zza(str2, bundle)) {
            this.zzc.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.zzc.getConditionalUserProperties(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(zzd.zza(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size String str) {
        return this.zzc.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public Map<String, Object> getUserProperties(boolean z2) {
        return this.zzc.getUserProperties(null, null, z2);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzd.zzf(str) && zzd.zza(str2, bundle) && zzd.zzb(str, str2, bundle)) {
            zzd.zza(str, str2, bundle);
            this.zzc.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzd.zzf(str) || zza(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.zzc;
        com.google.firebase.analytics.connector.internal.zza zzcVar = AppMeasurement.FIAM_ORIGIN.equals(str) ? new zzc(appMeasurementSdk, analyticsConnectorListener) : "clx".equals(str) ? new zze(appMeasurementSdk, analyticsConnectorListener) : null;
        if (zzcVar == null) {
            return null;
        }
        this.zza.put(str, zzcVar);
        return new C45991(this, str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzd.zzb(conditionalUserProperty)) {
            this.zzc.setConditionalUserProperty(zzd.zza(conditionalUserProperty));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (zzd.zzf(str) && zzd.zza(str, str2)) {
            this.zzc.setUserProperty(str, str2, obj);
        }
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static /* synthetic */ void zza(Event event) {
        boolean z2 = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(zzb)).zzc.zza(z2);
        }
    }

    @NonNull
    @RequiresPermission
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp, @NonNull Context context, @NonNull Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (zzb == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, new zzb(), new zza());
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        zzb = new AnalyticsConnectorImpl(zzdv.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    private final boolean zza(@NonNull String str) {
        return (str.isEmpty() || !this.zza.containsKey(str) || this.zza.get(str) == null) ? false : true;
    }
}
