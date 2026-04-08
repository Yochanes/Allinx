package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zav implements Runnable {
    final /* synthetic */ zaaa zaa;

    public zav(zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zap(this.zaa);
        } finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }
}
