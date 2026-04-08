package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
enum zzal {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzal(char c2) {
        this.zzl = c2;
    }

    public static /* bridge */ /* synthetic */ char zza(zzal zzalVar) {
        return zzalVar.zzl;
    }

    public static zzal zza(char c2) {
        for (zzal zzalVar : values()) {
            if (zzalVar.zzl == c2) {
                return zzalVar;
            }
        }
        return UNSET;
    }
}
