package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzic implements zzif {

    @GuardedBy
    private static final Map<Uri, zzic> zza = new ArrayMap(0);
    private static final String[] zzb = {"key", "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;

    @GuardedBy
    private final List<zzid> zzi;

    private zzic(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzie zzieVar = new zzie(this, null);
        this.zzf = zzieVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzieVar);
    }

    public static zzic zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzic zzicVar;
        synchronized (zzic.class) {
            Map<Uri, zzic> map = zza;
            zzicVar = map.get(uri);
            if (zzicVar == null) {
                try {
                    zzic zzicVar2 = new zzic(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzicVar2);
                    } catch (SecurityException unused) {
                    }
                    zzicVar = zzicVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzicVar;
    }

    public static synchronized void zzc() {
        try {
            for (zzic zzicVar : zza.values()) {
                zzicVar.zzc.unregisterContentObserver(zzicVar.zzf);
            }
            zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzii.zza(new zzib(this));
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (SQLiteException | IllegalStateException | SecurityException e) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
            return Collections.EMPTY_MAP;
        }
    }

    public final Map zzb() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.zzc.acquireUnstableContentProviderClient(this.zzd);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.zzd, zzb, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map map = Collections.EMPTY_MAP;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return map;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map2 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map2;
                }
                Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return arrayMap;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map3 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map3;
            } finally {
            }
        } catch (RemoteException e) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator<zzid> it = this.zzi.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> mapZze = this.zzh;
        if (mapZze == null) {
            synchronized (this.zzg) {
                try {
                    mapZze = this.zzh;
                    if (mapZze == null) {
                        mapZze = zze();
                        this.zzh = mapZze;
                    }
                } finally {
                }
            }
        }
        return mapZze != null ? mapZze : Collections.EMPTY_MAP;
    }
}
