package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzji;
import java.io.IOException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjh<MessageType extends zzji<MessageType, BuilderType>, BuilderType extends zzjh<MessageType, BuilderType>> implements zzmk {
    public /* synthetic */ Object clone() {
        return zzaf();
    }

    public abstract BuilderType zza(zzkg zzkgVar, zzkp zzkpVar);

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzlk {
        try {
            zzkg zzkgVarZza = zzkg.zza(bArr, 0, i2, false);
            zzb(zzkgVarZza, zzkp.zza);
            zzkgVarZza.zzb(0);
            return this;
        } catch (zzlk e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public abstract BuilderType zzaf();

    public /* synthetic */ zzmk zzb(zzkg zzkgVar, zzkp zzkpVar) {
        return zza(zzkgVar, zzkpVar);
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzkp zzkpVar) throws zzlk {
        try {
            zzkg zzkgVarZza = zzkg.zza(bArr, 0, i2, false);
            zzb(zzkgVarZza, zzkpVar);
            zzkgVarZza.zzb(0);
            return this;
        } catch (zzlk e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmk zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmk zza(byte[] bArr, zzkp zzkpVar) {
        return zza(bArr, 0, bArr.length, zzkpVar);
    }

    private final String zza(String str) {
        return AbstractC0000a.m15l("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }
}
