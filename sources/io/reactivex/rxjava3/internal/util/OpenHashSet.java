package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenHashSet<T> {

    /* JADX INFO: renamed from: a */
    public int f51233a;

    /* JADX INFO: renamed from: b */
    public int f51234b;

    /* JADX INFO: renamed from: c */
    public int f51235c;

    /* JADX INFO: renamed from: d */
    public Object[] f51236d;

    /* JADX INFO: renamed from: a */
    public final void m18267a(Disposable disposable) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f51236d;
        int i = this.f51233a;
        int iHashCode = disposable.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(disposable)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(disposable));
            return;
        }
        objArr[i2] = disposable;
        int i3 = this.f51234b + 1;
        this.f51234b = i3;
        if (i3 < this.f51235c) {
            return;
        }
        Object[] objArr2 = this.f51236d;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.f51233a = i5;
                this.f51235c = (int) (i4 * 0.75f);
                this.f51236d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18268b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.f51234b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else if (i < i5 || i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
