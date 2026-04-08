package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzkv<T extends zzkx<T>> {
    private static final zzkv<?> zzb = new zzkv<>(true);
    final zzne<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzkv() {
        this.zza = new zznh();
    }

    public static int zza(zzof zzofVar, int i, Object obj) {
        int iZzi = zzkl.zzi(i);
        if (zzofVar == zzof.zzj) {
            zzle.zza((zzml) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzofVar, obj);
    }

    public static <T extends zzkx<T>> zzkv<T> zzb() {
        return (zzkv<T>) zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzkv zzkvVar = new zzkv();
        int iZza = this.zza.zza();
        for (int i = 0; i < iZza; i++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i);
            zzkvVar.zzb((zzkx) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzkvVar.zzb((zzkx) entry.getKey(), entry.getValue());
        }
        zzkvVar.zzd = this.zzd;
        return zzkvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkv) {
            return this.zza.equals(((zzkv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzlq(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzlq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZza = this.zza.zza();
        for (int i = 0; i < iZza; i++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i);
            if (entryZza.getValue() instanceof zzlc) {
                ((zzlc) entryZza.getValue()).zzcl();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZza = this.zza.zza();
        for (int i = 0; i < iZza; i++) {
            if (!zzc(this.zza.zza(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzlp;
        if (key.zze()) {
            if (z2) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzkx) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i = 0; i < size; i++) {
                list2.add(zza(list.get(i)));
            }
            this.zza.zza(key, objZza);
            return;
        }
        if (key.zzc() != zzop.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzkx) key);
        if (objZza2 != null) {
            if (z2) {
                throw new NoSuchMethodError();
            }
            this.zza.zza(key, objZza2 instanceof zzmq ? key.zza((zzmq) objZza2, (zzmq) value) : key.zza(((zzml) objZza2).zzcj(), (zzml) value).zzai());
        } else {
            this.zza.zza(key, zza(value));
            if (z2) {
                this.zzd = true;
            }
        }
    }

    private zzkv(zzne<T, Object> zzneVar) {
        this.zza = zzneVar;
        zze();
    }

    private static int zza(zzof zzofVar, Object obj) {
        switch (zzku.zzb[zzofVar.ordinal()]) {
            case 1:
                return zzkl.zza(((Double) obj).doubleValue());
            case 2:
                return zzkl.zza(((Float) obj).floatValue());
            case 3:
                return zzkl.zzd(((Long) obj).longValue());
            case 4:
                return zzkl.zzg(((Long) obj).longValue());
            case 5:
                return zzkl.zzf(((Integer) obj).intValue());
            case 6:
                return zzkl.zzc(((Long) obj).longValue());
            case 7:
                return zzkl.zze(((Integer) obj).intValue());
            case 8:
                return zzkl.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzkl.zzb((zzml) obj);
            case 10:
                if (obj instanceof zzlp) {
                    return zzkl.zza((zzlp) obj);
                }
                return zzkl.zzc((zzml) obj);
            case 11:
                if (obj instanceof zzjs) {
                    return zzkl.zzb((zzjs) obj);
                }
                return zzkl.zzb((String) obj);
            case TYPE_BYTES_VALUE:
                if (obj instanceof zzjs) {
                    return zzkl.zzb((zzjs) obj);
                }
                return zzkl.zza((byte[]) obj);
            case 13:
                return zzkl.zzj(((Integer) obj).intValue());
            case 14:
                return zzkl.zzg(((Integer) obj).intValue());
            case 15:
                return zzkl.zze(((Long) obj).longValue());
            case 16:
                return zzkl.zzh(((Integer) obj).intValue());
            case 17:
                return zzkl.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzlh) {
                    return zzkl.zzd(((zzlh) obj).zza());
                }
                return zzkl.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void zzc(T t, Object obj) {
        zzof zzofVarZzb = t.zzb();
        zzle.zza(obj);
        boolean z2 = true;
        switch (zzku.zza[zzofVarZzb.zzb().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzjs) && !(obj instanceof byte[])) {
                    z2 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzlh)) {
                    z2 = false;
                }
                break;
            case 9:
                if (!(obj instanceof zzml) && !(obj instanceof zzlp)) {
                    z2 = false;
                }
                break;
            default:
                z2 = false;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzkv(boolean z2) {
        this(new zznh());
        zze();
    }

    private static <T extends zzkx<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzop.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!zzb(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    zzc(t, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzlp) {
            this.zzd = true;
        }
        this.zza.zza(t, obj);
    }

    public static int zza(zzkx<?> zzkxVar, Object obj) {
        zzof zzofVarZzb = zzkxVar.zzb();
        int iZza = zzkxVar.zza();
        if (zzkxVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (!zzkxVar.zzd()) {
                int iZza2 = 0;
                while (i < size) {
                    iZza2 += zza(zzofVarZzb, iZza, list.get(i));
                    i++;
                }
                return iZza2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iZza3 = 0;
            while (i < size) {
                iZza3 += zza(zzofVarZzb, list.get(i));
                i++;
            }
            return zzkl.zzj(iZza3) + zzkl.zzi(iZza) + iZza3;
        }
        return zza(zzofVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzmn) {
            return ((zzmn) obj).zzcn();
        }
        if (obj instanceof zzlp) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZza = this.zza.zza();
        int iZza2 = 0;
        for (int i = 0; i < iZza; i++) {
            iZza2 += zza((Map.Entry) this.zza.zza(i));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza2 += zza((Map.Entry) it.next());
        }
        return iZza2;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzop.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzlp) {
                return zzkl.zza(entry.getKey().zza(), (zzlp) value);
            }
            return zzkl.zzb(entry.getKey().zza(), (zzml) value);
        }
        return zza((zzkx<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzmq) {
            return ((zzmq) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzlp) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzkv<T> zzkvVar) {
        int iZza = zzkvVar.zza.zza();
        for (int i = 0; i < iZza; i++) {
            zzb((Map.Entry) zzkvVar.zza.zza(i));
        }
        Iterator it = zzkvVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzkl zzklVar, zzof zzofVar, int i, Object obj) {
        if (zzofVar == zzof.zzj) {
            zzml zzmlVar = (zzml) obj;
            zzle.zza(zzmlVar);
            zzklVar.zzc(i, 3);
            zzmlVar.zza(zzklVar);
            zzklVar.zzc(i, 4);
        }
        zzklVar.zzc(i, zzofVar.zza());
        switch (zzku.zzb[zzofVar.ordinal()]) {
            case 1:
                zzklVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzklVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzklVar.zzb(((Long) obj).longValue());
                break;
            case 4:
                zzklVar.zzb(((Long) obj).longValue());
                break;
            case 5:
                zzklVar.zzb(((Integer) obj).intValue());
                break;
            case 6:
                zzklVar.zza(((Long) obj).longValue());
                break;
            case 7:
                zzklVar.zza(((Integer) obj).intValue());
                break;
            case 8:
                zzklVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzml) obj).zza(zzklVar);
                break;
            case 10:
                zzklVar.zza((zzml) obj);
                break;
            case 11:
                if (obj instanceof zzjs) {
                    zzklVar.zza((zzjs) obj);
                } else {
                    zzklVar.zza((String) obj);
                }
                break;
            case TYPE_BYTES_VALUE:
                if (obj instanceof zzjs) {
                    zzklVar.zza((zzjs) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzklVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzklVar.zzc(((Integer) obj).intValue());
                break;
            case 14:
                zzklVar.zza(((Integer) obj).intValue());
                break;
            case 15:
                zzklVar.zza(((Long) obj).longValue());
                break;
            case 16:
                zzklVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzklVar.zzh(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzlh) {
                    zzklVar.zzb(((zzlh) obj).zza());
                } else {
                    zzklVar.zzb(((Integer) obj).intValue());
                }
                break;
        }
    }
}
