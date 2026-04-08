package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzky;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzc extends AppMeasurement.zza {
    private final zzky zza;

    public zzc(zzky zzkyVar) {
        super(null);
        Preconditions.checkNotNull(zzkyVar);
        this.zza = zzkyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean zzb() {
        return (Boolean) this.zza.zza(4);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double zzc() {
        return (Double) this.zza.zza(2);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer zzd() {
        return (Integer) this.zza.zza(3);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long zze() {
        return (Long) this.zza.zza(1);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final String zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final String zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String zzj() {
        return (String) this.zza.zza(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zzb(String str) {
        this.zza.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zzc(String str) {
        this.zza.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final Object zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final List<Bundle> zza(String str, String str2) {
        return this.zza.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zzb(zzjj zzjjVar) {
        this.zza.zzb(zzjjVar);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> zza(boolean z2) {
        return this.zza.zza((String) null, (String) null, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final Map<String, Object> zza(String str, String str2, boolean z2) {
        return this.zza.zza(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zza(String str, String str2, Bundle bundle, long j) {
        this.zza.zza(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zza(zzjj zzjjVar) {
        this.zza.zza(zzjjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zza(Bundle bundle) {
        this.zza.zza(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzky
    public final void zza(zzjg zzjgVar) {
        this.zza.zza(zzjgVar);
    }
}
