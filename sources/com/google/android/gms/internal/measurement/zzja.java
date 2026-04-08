package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzja implements zzif {

    @GuardedBy
    private static final Map<String, zzja> zza = new ArrayMap(0);
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map<String, ?> zzf;

    @GuardedBy
    private final List<zzid> zzg;

    private zzja(SharedPreferences sharedPreferences, Runnable runnable) {
        zzjd zzjdVar = new zzjd(this);
        this.zzd = zzjdVar;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzjdVar);
    }

    private static SharedPreferences zza(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferencesZza = zzcr.zza(context, str, 0, zzcn.zza);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferencesZza;
            }
            if (zzia.zza()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferencesZza2 = zzcr.zza(context, str.substring(12), 0, zzcn.zza);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferencesZza2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    @Nullable
    public static zzja zza(Context context, String str, Runnable runnable) {
        zzja zzjaVar;
        if (!((!zzia.zza() || str.startsWith("direct_boot:")) ? true : zzia.zzb(context))) {
            return null;
        }
        synchronized (zzja.class) {
            try {
                Map<String, zzja> map = zza;
                zzjaVar = map.get(str);
                if (zzjaVar == null) {
                    zzjaVar = new zzja(zza(context, str), runnable);
                    map.put(str, zzjaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    @Nullable
    public final Object zza(String str) {
        Map<String, ?> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                try {
                    map = this.zzf;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.zzb.getAll();
                            this.zzf = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static synchronized void zza() {
        try {
            for (zzja zzjaVar : zza.values()) {
                zzjaVar.zzb.unregisterOnSharedPreferenceChangeListener(zzjaVar.zzd);
            }
            zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            try {
                Iterator<zzid> it = this.zzg.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
