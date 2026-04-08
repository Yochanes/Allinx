package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzii {
    public static <V> V zza(zzih<V> zzihVar) {
        try {
            return zzihVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzihVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
