package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
abstract class zabg {
    private final zabf zaa;

    public zabg(zabf zabfVar) {
        this.zaa = zabfVar;
    }

    public abstract void zaa();

    public final void zab(zabi zabiVar) {
        Lock lockZah;
        zabi.zah(zabiVar).lock();
        try {
            if (zabi.zag(zabiVar) != this.zaa) {
                lockZah = zabi.zah(zabiVar);
            } else {
                zaa();
                lockZah = zabi.zah(zabiVar);
            }
            lockZah.unlock();
        } catch (Throwable th) {
            zabi.zah(zabiVar).unlock();
            throw th;
        }
    }
}
