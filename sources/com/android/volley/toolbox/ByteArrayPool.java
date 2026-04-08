package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ByteArrayPool {

    /* JADX INFO: renamed from: e */
    public static final Comparator f34993e = new C24541();

    /* JADX INFO: renamed from: a */
    public final ArrayList f34994a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f34995b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    public int f34996c = 0;

    /* JADX INFO: renamed from: d */
    public final int f34997d = 4096;

    /* JADX INFO: renamed from: com.android.volley.toolbox.ByteArrayPool$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C24541 implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized byte[] m12819a(int i) {
        for (int i2 = 0; i2 < this.f34995b.size(); i2++) {
            byte[] bArr = (byte[]) this.f34995b.get(i2);
            if (bArr.length >= i) {
                this.f34996c -= bArr.length;
                this.f34995b.remove(i2);
                this.f34994a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12820b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f34997d) {
                this.f34994a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f34995b, bArr, f34993e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f34995b.add(iBinarySearch, bArr);
                this.f34996c += bArr.length;
                synchronized (this) {
                    while (this.f34996c > this.f34997d) {
                        byte[] bArr2 = (byte[]) this.f34994a.remove(0);
                        this.f34995b.remove(bArr2);
                        this.f34996c -= bArr2.length;
                    }
                }
            }
        }
    }
}
