package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public enum zzcj implements zzlh {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);

    private final int zzk;

    zzcj(int i) {
        this.zzk = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzcj.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzk;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
