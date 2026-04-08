package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    zzs(int i) {
    }

    public static zzs zza(int i) {
        return i != 2 ? i != 3 ? i != 5 ? i != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
