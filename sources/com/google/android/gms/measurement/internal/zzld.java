package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
final class zzld implements Runnable {
    private final URL zza;
    private final zzla zzb;
    private final String zzc;
    private final Map<String, String> zzd;
    private final /* synthetic */ zzlb zze;

    public zzld(zzlb zzlbVar, String str, URL url, byte[] bArr, Map<String, String> map, zzla zzlaVar) {
        this.zze = zzlbVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzlaVar);
        this.zza = url;
        this.zzb = zzlaVar;
        this.zzc = str;
        this.zzd = null;
    }

    private final void zzb(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.zze.zzl().zzb(new zzlc(this, i, exc, bArr, map));
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.zze.zzr();
        int responseCode = 0;
        try {
            URLConnection uRLConnectionZza = com.google.android.gms.internal.measurement.zzcv.zza().zza(this.zza, "client-measurement");
            if (!(uRLConnectionZza instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionZza;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    byte[] bArrZza = zzlb.zza(this.zze, httpURLConnection);
                    httpURLConnection.disconnect();
                    zzb(responseCode, null, bArrZza, headerFields);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }

    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzb.zza(this.zzc, i, exc, bArr, map);
    }
}
