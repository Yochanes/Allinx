package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzji;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzji<MessageType extends zzji<MessageType, BuilderType>, BuilderType extends zzjh<MessageType, BuilderType>> implements zzml {
    protected int zza = 0;

    public int zza(zznd zzndVar) {
        int iZzby = zzby();
        if (iZzby != -1) {
            return iZzby;
        }
        int iZza = zzndVar.zza(this);
        zzc(iZza);
        return iZza;
    }

    public int zzby() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final zzjs zzbz() {
        try {
            zzjx zzjxVarZzc = zzjs.zzc(zzcb());
            zza(zzjxVarZzc.zzb());
            return zzjxVarZzc.zza();
        } catch (IOException e) {
            throw new RuntimeException(AbstractC0000a.m3D("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzca() {
        try {
            byte[] bArr = new byte[zzcb()];
            zzkl zzklVarZzb = zzkl.zzb(bArr);
            zza(zzklVarZzb);
            zzklVarZzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(AbstractC0000a.m3D("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzle.zza(iterable);
        if (iterable instanceof zzls) {
            List<?> listZza = ((zzls) iterable).zza();
            zzls zzlsVar = (zzls) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String strM10g = AbstractC0000a.m10g(zzlsVar.size() - size, "Element at index ", " is null.");
                    for (int size2 = zzlsVar.size() - 1; size2 >= size; size2--) {
                        zzlsVar.remove(size2);
                    }
                    throw new NullPointerException(strM10g);
                }
                if (obj instanceof zzjs) {
                    zzlsVar.zza((zzjs) obj);
                } else if (obj instanceof byte[]) {
                    zzlsVar.zza(zzjs.zza((byte[]) obj));
                } else {
                    zzlsVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzmx) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String strM10g2 = AbstractC0000a.m10g(list.size() - size3, "Element at index ", " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(strM10g2);
            }
            list.add(t);
        }
    }
}
