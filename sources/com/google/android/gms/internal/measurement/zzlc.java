package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzlc.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlc<MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzji<MessageType, BuilderType> {
    private static Map<Class<?>, zzlc<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznw zzb = zznw.zzc();

    /* JADX INFO: compiled from: Proguard */
    public static class zza<T extends zzlc<T, ?>> extends zzjj<T> {
        public zza(T t) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class zzb<MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzjh<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzco()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzce();
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzkp zzkpVar) throws zzlk {
            if (!this.zza.zzco()) {
                zzal();
            }
            try {
                zzmz.zza().zza(this.zza).zza(this.zza, bArr, 0, i2, new zzjn(zzkpVar));
                return this;
            } catch (zzlk e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzlk.zzi();
            }
        }

        private final BuilderType zzc(zzkg zzkgVar, zzkp zzkpVar) throws IOException {
            if (!this.zza.zzco()) {
                zzal();
            }
            try {
                zzmz.zza().zza(this.zza).zza(this.zza, zzkk.zza(zzkgVar), zzkpVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzaj();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public final /* synthetic */ zzjh zza(zzkg zzkgVar, zzkp zzkpVar) {
            return (zzb) zzb(zzkgVar, zzkpVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public final /* synthetic */ zzjh zzaf() {
            return (zzb) clone();
        }

        public final MessageType zzag() {
            MessageType messagetype = (MessageType) zzaj();
            if (zzlc.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zznu(messagetype);
        }

        public MessageType zzah() {
            if (!this.zza.zzco()) {
                return this.zza;
            }
            this.zza.zzcl();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzmk
        public /* synthetic */ zzml zzai() {
            return zzag();
        }

        @Override // com.google.android.gms.internal.measurement.zzmk
        public /* synthetic */ zzml zzaj() {
            return zzah();
        }

        public final void zzak() {
            if (this.zza.zzco()) {
                return;
            }
            zzal();
        }

        public void zzal() {
            MessageType messagetype = (MessageType) this.zzb.zzce();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzmn
        public final /* synthetic */ zzml zzck() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzmn
        public final boolean zzcn() {
            return zzlc.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public final /* synthetic */ zzjh zza(byte[] bArr, int i, int i2) {
            return zzb(bArr, 0, i2, zzkp.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public final /* synthetic */ zzjh zza(byte[] bArr, int i, int i2, zzkp zzkpVar) {
            return zzb(bArr, 0, i2, zzkpVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzco()) {
                zzal();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.zzjh
        public final /* synthetic */ zzmk zzb(zzkg zzkgVar, zzkp zzkpVar) {
            return zzc(zzkgVar, zzkpVar);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzmz.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzc implements zzkx<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final zzof zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final zzop zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final zzmk zza(zzmk zzmkVar, zzml zzmlVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzkx
        public final zzmq zza(zzmq zzmqVar, zzmq zzmqVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzlc<MessageType, BuilderType> implements zzmn {
        protected zzkv<zzc> zzc = zzkv.zzb();

        public final zzkv<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzkv) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class zzf<ContainingType extends zzml, Type> extends zzkq<ContainingType, Type> {
    }

    private final int zza() {
        return zzmz.zza().zza(this).zzb(this);
    }

    private final int zzb(zznd<?> zzndVar) {
        return zzndVar == null ? zzmz.zza().zza(this).zza(this) : zzndVar.zza(this);
    }

    public static zzlj zzcf() {
        return zzlf.zzd();
    }

    public static zzli zzcg() {
        return zzlw.zzd();
    }

    public static <E> zzll<E> zzch() {
        return zzmy.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzmz.zza().zza(this).zzb(this, (zzlc) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzco()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzmm.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzji
    public final int zzby() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzji
    public final void zzc(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC0000a.m9f(i, "serialized size must be non-negative, was "));
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final int zzcb() {
        return zza((zznd) null);
    }

    public final <MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzcc() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzcd() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzce() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ zzmk zzci() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ zzmk zzcj() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ zzml zzck() {
        return (zzlc) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzcl() {
        zzmz.zza().zza(this).zzd(this);
        zzcm();
    }

    public final void zzcm() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final boolean zzcn() {
        return zza(this, true);
    }

    public final boolean zzco() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzji
    public final int zza(zznd zzndVar) {
        if (zzco()) {
            int iZzb = zzb(zzndVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException(AbstractC0000a.m9f(iZzb, "serialized size must be non-negative, was "));
        }
        if (zzby() != Integer.MAX_VALUE) {
            return zzby();
        }
        int iZzb2 = zzb(zzndVar);
        zzc(iZzb2);
        return iZzb2;
    }

    public final <MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zza(MessageType messagetype) {
        return (BuilderType) zzcc().zza(messagetype);
    }

    public static <T extends zzlc<?, ?>> T zza(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((zzlc) zzny.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
        if (t2 != null) {
            zzc.put((Class<?>) cls, t2);
            return t2;
        }
        throw new IllegalStateException();
    }

    public static zzli zza(zzli zzliVar) {
        int size = zzliVar.size();
        return zzliVar.zzc(size == 0 ? 10 : size << 1);
    }

    public static <E> zzll<E> zza(zzll<E> zzllVar) {
        int size = zzllVar.size();
        return zzllVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzml zzmlVar, String str, Object[] objArr) {
        return new zznb(zzmlVar, str, objArr);
    }

    public static <T extends zzlc<?, ?>> void zza(Class<T> cls, T t) {
        t.zzcm();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final void zza(zzkl zzklVar) {
        zzmz.zza().zza(this).zza(this, zzko.zza(zzklVar));
    }

    public static final <T extends zzlc<T, ?>> boolean zza(T t, boolean z2) {
        byte bByteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzmz.zza().zza(t).zze(t);
        if (z2) {
            t.zza(zze.zzb, zZze ? t : null, null);
        }
        return zZze;
    }
}
