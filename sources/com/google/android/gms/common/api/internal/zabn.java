package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    public zabn(zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq.zak(this.zab, this.zaa);
    }
}
