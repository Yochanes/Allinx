package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class LongSparseArray<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f3722a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f3723b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f3724c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f3725d;

    public LongSparseArray(int i) {
        if (i == 0) {
            this.f3723b = ContainerHelpersKt.f3906b;
            this.f3724c = ContainerHelpersKt.f3907c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3723b = new long[i5];
        this.f3724c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m1999a() {
        int i = this.f3725d;
        Object[] objArr = this.f3724c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3725d = 0;
        this.f3722a = false;
    }

    /* JADX INFO: renamed from: b */
    public final LongSparseArray m2000b() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.m18597e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) objClone;
        longSparseArray.f3723b = (long[]) this.f3723b.clone();
        longSparseArray.f3724c = (Object[]) this.f3724c.clone();
        return longSparseArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2001c(long j) {
        Object obj;
        int iM2142b = ContainerHelpersKt.m2142b(this.f3723b, this.f3725d, j);
        if (iM2142b < 0 || (obj = this.f3724c[iM2142b]) == LongSparseArrayKt.f3726a) {
            return null;
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m2000b();
    }

    /* JADX INFO: renamed from: d */
    public final Object m2002d(long j) {
        Object obj;
        int iM2142b = ContainerHelpersKt.m2142b(this.f3723b, this.f3725d, j);
        if (iM2142b < 0 || (obj = this.f3724c[iM2142b]) == LongSparseArrayKt.f3726a) {
            return -1L;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final int m2003e(long j) {
        if (this.f3722a) {
            int i = this.f3725d;
            long[] jArr = this.f3723b;
            Object[] objArr = this.f3724c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.f3726a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f3722a = false;
            this.f3725d = i2;
        }
        return ContainerHelpersKt.m2142b(this.f3723b, this.f3725d, j);
    }

    /* JADX INFO: renamed from: f */
    public final long m2004f(int i) {
        if (!(i >= 0 && i < this.f3725d)) {
            RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f3722a) {
            int i2 = this.f3725d;
            long[] jArr = this.f3723b;
            Object[] objArr = this.f3724c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f3726a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3722a = false;
            this.f3725d = i3;
        }
        return this.f3723b[i];
    }

    /* JADX INFO: renamed from: h */
    public final void m2005h(long j, Object obj) {
        int iM2142b = ContainerHelpersKt.m2142b(this.f3723b, this.f3725d, j);
        if (iM2142b >= 0) {
            this.f3724c[iM2142b] = obj;
            return;
        }
        int i = ~iM2142b;
        int i2 = this.f3725d;
        Object obj2 = LongSparseArrayKt.f3726a;
        if (i < i2) {
            Object[] objArr = this.f3724c;
            if (objArr[i] == obj2) {
                this.f3723b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3722a) {
            long[] jArr = this.f3723b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f3724c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f3722a = false;
                this.f3725d = i3;
                i = ~ContainerHelpersKt.m2142b(this.f3723b, i3, j);
            }
        }
        int i5 = this.f3725d;
        if (i5 >= this.f3723b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f3723b, i9);
            Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
            this.f3723b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3724c, i9);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3724c = objArrCopyOf;
        }
        int i10 = this.f3725d;
        if (i10 - i != 0) {
            long[] jArr2 = this.f3723b;
            int i11 = i + 1;
            ArraysKt.m18382q(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f3724c;
            ArraysKt.m18383r(objArr3, i11, objArr3, i, this.f3725d);
        }
        this.f3723b[i] = j;
        this.f3724c[i] = obj;
        this.f3725d++;
    }

    /* JADX INFO: renamed from: i */
    public final void m2006i(long j) {
        int iM2142b = ContainerHelpersKt.m2142b(this.f3723b, this.f3725d, j);
        if (iM2142b >= 0) {
            Object[] objArr = this.f3724c;
            Object obj = objArr[iM2142b];
            Object obj2 = LongSparseArrayKt.f3726a;
            if (obj != obj2) {
                objArr[iM2142b] = obj2;
                this.f3722a = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m2007j() {
        if (this.f3722a) {
            int i = this.f3725d;
            long[] jArr = this.f3723b;
            Object[] objArr = this.f3724c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.f3726a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f3722a = false;
            this.f3725d = i2;
        }
        return this.f3725d;
    }

    /* JADX INFO: renamed from: k */
    public final Object m2008k(int i) {
        if (!(i >= 0 && i < this.f3725d)) {
            RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f3722a) {
            int i2 = this.f3725d;
            long[] jArr = this.f3723b;
            Object[] objArr = this.f3724c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f3726a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3722a = false;
            this.f3725d = i3;
        }
        return this.f3724c[i];
    }

    public final String toString() {
        if (m2007j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3725d * 28);
        sb.append('{');
        int i = this.f3725d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m2004f(i2));
            sb.append('=');
            Object objM2008k = m2008k(i2);
            if (objM2008k != sb) {
                sb.append(objM2008k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    public /* synthetic */ LongSparseArray(Object obj) {
        this(10);
    }
}
