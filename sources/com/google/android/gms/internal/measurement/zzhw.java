package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhw implements zzhy {
    @Override // com.google.android.gms.internal.measurement.zzhy
    @Nullable
    public final String zza(ContentResolver contentResolver, String str) throws zzhx {
        Uri uri = zzhq.zza;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzhx("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhx("ContentProvider query returned null cursor");
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return string;
                } finally {
                }
            } catch (RemoteException e) {
                throw new zzhx("ContentProvider query failed", e);
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzhv<T> zzhvVar) throws zzhx {
        Uri uri = zzhq.zzb;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
            try {
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (cursorQuery != null) {
                            T t = (T) zzhvVar.zza(cursorQuery.getCount());
                            while (cursorQuery.moveToNext()) {
                                t.put(cursorQuery.getString(0), cursorQuery.getString(1));
                            }
                            if (cursorQuery.isAfterLast()) {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                return t;
                            }
                            throw new zzhx("Cursor read incomplete (ContentProvider dead?)");
                        }
                        throw new zzhx("ContentProvider query returned null cursor");
                    } finally {
                    }
                } catch (RemoteException e) {
                    throw new zzhx("ContentProvider query failed", e);
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        } else {
            throw new zzhx("Unable to acquire ContentProviderClient");
        }
    }
}
