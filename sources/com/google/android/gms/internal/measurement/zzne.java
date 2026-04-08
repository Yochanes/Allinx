package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class zzne<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zznp zze;
    private Map<K, V> zzf;

    public /* synthetic */ zzne(zznr zznrVar) {
        this();
    }

    public static /* bridge */ /* synthetic */ int zza(zzne zzneVar) {
        return zzneVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzne zzneVar) {
        return zzneVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzne zzneVar) {
        return zzneVar.zzf;
    }

    public static /* synthetic */ void zzd(zzne zzneVar) {
        zzneVar.zzg();
    }

    public static /* bridge */ /* synthetic */ Object[] zze(zzne zzneVar) {
        return zzneVar.zza;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    private final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zznp(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzne)) {
            return super.equals(obj);
        }
        zzne zzneVar = (zzne) obj;
        int size = size();
        if (size != zzneVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzneVar.zzb) {
            return entrySet().equals(zzneVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zza(i2).equals(zzneVar.zza(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzneVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) ((zznk) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = this.zzb;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.zza[i2].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzne() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    public static /* synthetic */ Object zza(zzne zzneVar, int i) {
        return zzneVar.zzb(i);
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzni(this, null);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(K k) {
        int i;
        int i2;
        int i3 = this.zzb;
        int i4 = i3 - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                int i5 = (i + i4) / 2;
                int iCompareTo = k.compareTo((Comparable) ((zznk) this.zza[i5]).getKey());
                if (iCompareTo < 0) {
                    i4 = i5 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i5;
                    }
                    i = i5 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo((Comparable) ((zznk) this.zza[i4]).getKey());
            if (iCompareTo2 > 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    private final V zzb(int i) {
        zzg();
        V v = (V) ((zznk) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zznk(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzg();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) ((zznk) this.zza[iZza]).setValue(v);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(iZza + 1);
        if (i >= 16) {
            return zzf().put(k, v);
        }
        int i2 = this.zzb;
        if (i2 == 16) {
            zznk zznkVar = (zznk) this.zza[15];
            this.zzb = i2 - 1;
            zzf().put((Comparable) zznkVar.getKey(), zznkVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.zza[i] = new zznk(this, k, v);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i) {
        if (i < this.zzb) {
            return (zznk) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }
}
