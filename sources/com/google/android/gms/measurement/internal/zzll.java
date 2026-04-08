package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzll implements Runnable {
    private final /* synthetic */ zzlg zza;

    public zzll(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar = this.zza;
        zzlgVar.zza = zzlg.zza(zzlgVar);
    }
}
