package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzcp implements SharedPreferences.Editor {
    private boolean zza;
    private Set<String> zzb;
    private Map<String, Object> zzc;
    private final /* synthetic */ zzcq zzd;

    public /* synthetic */ zzcp(zzcq zzcqVar, zzcs zzcsVar) {
        this(zzcqVar);
    }

    private final void zza(String str, Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.zza) {
            zzcq.zza(this.zzd).clear();
        }
        zzcq.zza(this.zzd).keySet().removeAll(this.zzb);
        for (Map.Entry<String, Object> entry : this.zzc.entrySet()) {
            zzcq.zza(this.zzd).put(entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcq.zzb(this.zzd)) {
            UnmodifiableIterator it = Sets.union(this.zzb, this.zzc.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.zzd, (String) it.next());
            }
        }
        return (!this.zza && this.zzb.isEmpty() && this.zzc.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        zza(str, Boolean.valueOf(z2));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        zza(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        zza(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        zza(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.zzb.add(str);
        return this;
    }

    private zzcp(zzcq zzcqVar) {
        this.zzd = zzcqVar;
        this.zza = false;
        this.zzb = new HashSet();
        this.zzc = new HashMap();
    }
}
