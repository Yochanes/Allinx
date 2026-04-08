package com.google.android.gms.internal.measurement;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjs implements Serializable, Iterable<Byte> {
    public static final zzjs zza = new zzkb(zzle.zzb);
    private static final zzjv zzb = new zzke(null);
    private int zzc = 0;

    static {
        new zzju();
    }

    public static /* synthetic */ int zza(byte b2) {
        return b2 & UnsignedBytes.MAX_VALUE;
    }

    public static zzjs zzb(byte[] bArr) {
        return new zzkb(bArr);
    }

    public static zzjx zzc(int i) {
        return new zzjx(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzjr(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        String strZza = zzb() <= 50 ? zznt.zza(this) : AbstractC0000a.m2C(zznt.zza(zza(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzb);
        sb.append(" contents=\"");
        return AbstractC0000a.m19p(sb, strZza, "\">");
    }

    public abstract byte zza(int i);

    public abstract zzjs zza(int i, int i2);

    public abstract void zza(zzjp zzjpVar);

    public abstract byte zzb(int i);

    public abstract int zzb();

    public abstract int zzb(int i, int i2, int i3);

    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m10g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i2, i3, "End index: ", " >= "));
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzjs zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzjs zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzkb(zzb.zza(bArr, i, i2));
    }

    public static zzjs zza(String str) {
        return new zzkb(str.getBytes(zzle.zza));
    }
}
