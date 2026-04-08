package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class SimpleArrayMap<K, V> {

    /* JADX INFO: renamed from: a */
    public int[] f3882a;

    /* JADX INFO: renamed from: b */
    public Object[] f3883b;

    /* JADX INFO: renamed from: c */
    public int f3884c;

    public SimpleArrayMap(int i) {
        this.f3882a = i == 0 ? ContainerHelpersKt.f3905a : new int[i];
        this.f3883b = i == 0 ? ContainerHelpersKt.f3907c : new Object[i << 1];
    }

    /* JADX INFO: renamed from: c */
    public final int m2123c(Object obj) {
        int i = this.f3884c * 2;
        Object[] objArr = this.f3883b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.f3884c > 0) {
            this.f3882a = ContainerHelpersKt.f3905a;
            this.f3883b = ContainerHelpersKt.f3907c;
            this.f3884c = 0;
        }
        if (this.f3884c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2126g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m2123c(obj) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m2124e(int i) {
        int i2 = this.f3884c;
        int[] iArr = this.f3882a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3882a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3883b, i * 2);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3883b = objArrCopyOf;
        }
        if (this.f3884c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                int i = this.f3884c;
                if (i != ((SimpleArrayMap) obj).f3884c) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM2128j = m2128j(i2);
                    Object objM2131m = m2131m(i2);
                    Object obj2 = simpleArrayMap.get(objM2128j);
                    if (objM2131m == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(objM2128j)) {
                            return false;
                        }
                    } else if (!objM2131m.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f3884c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f3884c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM2128j2 = m2128j(i4);
                Object objM2131m2 = m2131m(i4);
                Object obj3 = ((Map) obj).get(objM2128j2);
                if (objM2131m2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM2128j2)) {
                        return false;
                    }
                } else if (!objM2131m2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m2125f(int i, Object obj) {
        int i2 = this.f3884c;
        if (i2 == 0) {
            return -1;
        }
        int iM2141a = ContainerHelpersKt.m2141a(i2, i, this.f3882a);
        if (iM2141a < 0 || Intrinsics.m18594b(obj, this.f3883b[iM2141a << 1])) {
            return iM2141a;
        }
        int i3 = iM2141a + 1;
        while (i3 < i2 && this.f3882a[i3] == i) {
            if (Intrinsics.m18594b(obj, this.f3883b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2141a - 1; i4 >= 0 && this.f3882a[i4] == i; i4--) {
            if (Intrinsics.m18594b(obj, this.f3883b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: g */
    public final int m2126g(Object obj) {
        return obj == null ? m2127h() : m2125f(obj.hashCode(), obj);
    }

    public Object get(Object obj) {
        int iM2126g = m2126g(obj);
        if (iM2126g >= 0) {
            return this.f3883b[(iM2126g << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2126g = m2126g(obj);
        return iM2126g >= 0 ? this.f3883b[(iM2126g << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final int m2127h() {
        int i = this.f3884c;
        if (i == 0) {
            return -1;
        }
        int iM2141a = ContainerHelpersKt.m2141a(i, 0, this.f3882a);
        if (iM2141a < 0 || this.f3883b[iM2141a << 1] == null) {
            return iM2141a;
        }
        int i2 = iM2141a + 1;
        while (i2 < i && this.f3882a[i2] == 0) {
            if (this.f3883b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM2141a - 1; i3 >= 0 && this.f3882a[i3] == 0; i3--) {
            if (this.f3883b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int hashCode() {
        int[] iArr = this.f3882a;
        Object[] objArr = this.f3883b;
        int i = this.f3884c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f3884c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m2128j(int i) {
        boolean z2 = false;
        if (i >= 0 && i < this.f3884c) {
            z2 = true;
        }
        if (z2) {
            return this.f3883b[i << 1];
        }
        RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public Object mo2129k(int i) {
        if (!(i >= 0 && i < this.f3884c)) {
            RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f3883b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f3884c;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f3882a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ArraysKt.m18379n(i, i5, iArr, iArr, i3);
                Object[] objArr2 = this.f3883b;
                ArraysKt.m18383r(objArr2, i2, objArr2, i5 << 1, i3 << 1);
            }
            Object[] objArr3 = this.f3883b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3882a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3883b, i7 << 1);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3883b = objArrCopyOf;
            if (i3 != this.f3884c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ArraysKt.m18379n(0, 0, iArr, this.f3882a, i);
                ArraysKt.m18383r(objArr, 0, this.f3883b, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                ArraysKt.m18379n(i, i8, iArr, this.f3882a, i3);
                ArraysKt.m18383r(objArr, i2, this.f3883b, i8 << 1, i3 << 1);
            }
        }
        if (i3 != this.f3884c) {
            throw new ConcurrentModificationException();
        }
        this.f3884c = i4;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public Object mo2130l(int i, Object obj) {
        boolean z2 = false;
        if (i >= 0 && i < this.f3884c) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f3883b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: m */
    public final Object m2131m(int i) {
        boolean z2 = false;
        if (i >= 0 && i < this.f3884c) {
            z2 = true;
        }
        if (z2) {
            return this.f3883b[(i << 1) + 1];
        }
        RuntimeHelpersKt.m2143a("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f3884c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2125f = obj != null ? m2125f(iHashCode, obj) : m2127h();
        if (iM2125f >= 0) {
            int i2 = (iM2125f << 1) + 1;
            Object[] objArr = this.f3883b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM2125f;
        int[] iArr = this.f3882a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3882a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3883b, i4 << 1);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            this.f3883b = objArrCopyOf;
            if (i != this.f3884c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f3882a;
            int i5 = i3 + 1;
            ArraysKt.m18379n(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.f3883b;
            ArraysKt.m18383r(objArr2, i5 << 1, objArr2, i3 << 1, this.f3884c << 1);
        }
        int i6 = this.f3884c;
        if (i == i6) {
            int[] iArr3 = this.f3882a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f3883b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f3884c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM2126g = m2126g(obj);
        if (iM2126g >= 0) {
            return mo2129k(iM2126g);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2126g = m2126g(obj);
        if (iM2126g >= 0) {
            return mo2130l(iM2126g, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final int getF3884c() {
        return this.f3884c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3884c * 28);
        sb.append('{');
        int i = this.f3884c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2128j = m2128j(i2);
            if (objM2128j != sb) {
                sb.append(objM2128j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2131m = m2131m(i2);
            if (objM2131m != sb) {
                sb.append(objM2131m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2126g = m2126g(obj);
        if (iM2126g < 0 || !Intrinsics.m18594b(obj2, m2131m(iM2126g))) {
            return false;
        }
        mo2129k(iM2126g);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2126g = m2126g(obj);
        if (iM2126g < 0 || !Intrinsics.m18594b(obj2, m2131m(iM2126g))) {
            return false;
        }
        mo2130l(iM2126g, obj3);
        return true;
    }
}
