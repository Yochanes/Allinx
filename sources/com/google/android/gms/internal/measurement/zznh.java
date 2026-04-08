package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zznh extends zzne {
    public zznh() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd() {
        if (!zze()) {
            for (int i = 0; i < zza(); i++) {
                Map.Entry entryZza = zza(i);
                if (((zzkx) entryZza.getKey()).zze()) {
                    entryZza.setValue(Collections.unmodifiableList((List) entryZza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzkx) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
