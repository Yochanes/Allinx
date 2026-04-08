package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzlm implements Runnable {
    private final /* synthetic */ zzlg zza;

    public zzlm(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg.zza(this.zza, (zzlh) null);
    }
}
