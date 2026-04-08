package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class SparseArrayCompat<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f3885a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int[] f3886b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f3887c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f3888d;

    public SparseArrayCompat(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f3886b = new int[i5];
        this.f3887c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m2132a(int i, Object obj) {
        int i2 = this.f3888d;
        if (i2 != 0 && i <= this.f3886b[i2 - 1]) {
            m2136e(i, obj);
            return;
        }
        if (this.f3885a && i2 >= this.f3886b.length) {
            SparseArrayCompatKt.m2139a(this);
        }
        int i3 = this.f3888d;
        if (i3 >= this.f3886b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f3886b, i7);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3886b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3887c, i7);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3887c = objArrCopyOf;
        }
        this.f3886b[i3] = i;
        this.f3887c[i3] = obj;
        this.f3888d = i3 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final SparseArrayCompat m2133b() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.m18597e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.f3886b = (int[]) this.f3886b.clone();
        sparseArrayCompat.f3887c = (Object[]) this.f3887c.clone();
        return sparseArrayCompat;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2134c(int i) {
        Object obj;
        int iM2141a = ContainerHelpersKt.m2141a(this.f3888d, i, this.f3886b);
        if (iM2141a < 0 || (obj = this.f3887c[iM2141a]) == SparseArrayCompatKt.f3889a) {
            return null;
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m2133b();
    }

    /* JADX INFO: renamed from: d */
    public final int m2135d(int i) {
        if (this.f3885a) {
            SparseArrayCompatKt.m2139a(this);
        }
        return this.f3886b[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m2136e(int i, Object obj) {
        int iM2141a = ContainerHelpersKt.m2141a(this.f3888d, i, this.f3886b);
        if (iM2141a >= 0) {
            this.f3887c[iM2141a] = obj;
            return;
        }
        int i2 = ~iM2141a;
        int i3 = this.f3888d;
        if (i2 < i3) {
            Object[] objArr = this.f3887c;
            if (objArr[i2] == SparseArrayCompatKt.f3889a) {
                this.f3886b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3885a && i3 >= this.f3886b.length) {
            SparseArrayCompatKt.m2139a(this);
            i2 = ~ContainerHelpersKt.m2141a(this.f3888d, i, this.f3886b);
        }
        int i4 = this.f3888d;
        if (i4 >= this.f3886b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f3886b, i8);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3886b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3887c, i8);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3887c = objArrCopyOf;
        }
        int i9 = this.f3888d;
        if (i9 - i2 != 0) {
            int[] iArr = this.f3886b;
            int i10 = i2 + 1;
            ArraysKt.m18379n(i10, i2, iArr, iArr, i9);
            Object[] objArr2 = this.f3887c;
            ArraysKt.m18383r(objArr2, i10, objArr2, i2, this.f3888d);
        }
        this.f3886b[i2] = i;
        this.f3887c[i2] = obj;
        this.f3888d++;
    }

    /* JADX INFO: renamed from: f */
    public final int m2137f() {
        if (this.f3885a) {
            SparseArrayCompatKt.m2139a(this);
        }
        return this.f3888d;
    }

    /* JADX INFO: renamed from: h */
    public final Object m2138h(int i) {
        if (this.f3885a) {
            SparseArrayCompatKt.m2139a(this);
        }
        Object[] objArr = this.f3887c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (m2137f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3888d * 28);
        sb.append('{');
        int i = this.f3888d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m2135d(i2));
            sb.append('=');
            Object objM2138h = m2138h(i2);
            if (objM2138h != this) {
                sb.append(objM2138h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
