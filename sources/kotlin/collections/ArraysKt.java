package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class ArraysKt extends ArraysKt___ArraysKt {
    /* JADX INFO: renamed from: A */
    public static ArrayList m18334A(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static Object m18335B(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: C */
    public static Object m18336C(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: D */
    public static IntRange m18337D(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: E */
    public static int m18338E(long[] jArr) {
        Intrinsics.m18599g(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: F */
    public static int m18339F(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* JADX INFO: renamed from: G */
    public static Integer m18340G(int i, int[] iArr) {
        Intrinsics.m18599g(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* JADX INFO: renamed from: H */
    public static Object m18341H(int i, Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: I */
    public static int m18342I(byte[] bArr, byte b2) {
        Intrinsics.m18599g(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b2 == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: J */
    public static int m18343J(int[] iArr, int i) {
        Intrinsics.m18599g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: K */
    public static int m18344K(long[] jArr, long j) {
        Intrinsics.m18599g(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public static int m18345L(Object[] objArr, Object obj) {
        Intrinsics.m18599g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public static int m18346M(short[] sArr, short s) {
        Intrinsics.m18599g(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18347N(Object[] objArr, StringBuilder sb, Function1 function1) {
        ArraysKt___ArraysKt.m18393b(objArr, sb, ", ", "<", ">", "...", function1);
    }

    /* JADX INFO: renamed from: O */
    public static String m18348O(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b2 : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) String.valueOf((int) b2));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static String m18349P(Object[] objArr, String str, String str2, Function1 function1, int i) {
        String str3 = (i & 1) != 0 ? ", " : "";
        String str4 = (i & 2) != 0 ? "" : str;
        String str5 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        ArraysKt___ArraysKt.m18393b(objArr, sb, str3, str4, str5, "...", function1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static Object m18350Q(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: R */
    public static int m18351R(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: S */
    public static Integer m18352S(int[] iArr) {
        Intrinsics.m18599g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: T */
    public static byte[] m18353T(byte[] bArr, byte[] elements) {
        Intrinsics.m18599g(bArr, "<this>");
        Intrinsics.m18599g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.m18596d(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: U */
    public static int[] m18354U(int[] iArr, int[] elements) {
        Intrinsics.m18599g(iArr, "<this>");
        Intrinsics.m18599g(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.m18596d(iArrCopyOf);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: V */
    public static Object[] m18355V(Object[] objArr, Object[] elements) {
        Intrinsics.m18599g(objArr, "<this>");
        Intrinsics.m18599g(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        Intrinsics.m18596d(objArrCopyOf);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: W */
    public static char m18356W(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: X */
    public static Object m18357X(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: Y */
    public static List m18358Y(Comparator comparator, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.m18598f(objArr, "copyOf(...)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return m18365e(objArr);
    }

    /* JADX INFO: renamed from: Z */
    public static List m18359Z(double[] dArr) {
        Intrinsics.m18599g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return EmptyList.f51496a;
        }
        if (length == 1) {
            return CollectionsKt.m18413N(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    public static List m18360a0(float[] fArr) {
        Intrinsics.m18599g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.f51496a;
        }
        if (length == 1) {
            return CollectionsKt.m18413N(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public static List m18361b0(int[] iArr) {
        Intrinsics.m18599g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m18368f0(iArr) : CollectionsKt.m18413N(Integer.valueOf(iArr[0])) : EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: c0 */
    public static List m18362c0(long[] jArr) {
        Intrinsics.m18599g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.f51496a;
        }
        if (length == 1) {
            return CollectionsKt.m18413N(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static Iterable m18363d(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        return objArr.length == 0 ? EmptyList.f51496a : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(objArr);
    }

    /* JADX INFO: renamed from: d0 */
    public static List m18364d0(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m18370g0(objArr) : CollectionsKt.m18413N(objArr[0]) : EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: e */
    public static List m18365e(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.m18598f(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: e0 */
    public static List m18366e0(boolean[] zArr) {
        Intrinsics.m18599g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.f51496a;
        }
        if (length == 1) {
            return CollectionsKt.m18413N(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Sequence m18367f(Object[] objArr) {
        return objArr.length == 0 ? SequencesKt.m20363e() : new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(objArr);
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m18368f0(int[] iArr) {
        Intrinsics.m18599g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18369g(byte[] bArr, byte b2) {
        Intrinsics.m18599g(bArr, "<this>");
        return m18342I(bArr, b2) >= 0;
    }

    /* JADX INFO: renamed from: g0 */
    public static ArrayList m18370g0(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        return new ArrayList(new ArrayAsCollection(objArr, false));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18371h(char[] cArr, char c2) {
        Intrinsics.m18599g(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c2 == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    /* JADX INFO: renamed from: h0 */
    public static Set m18372h0(Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.f51498a;
        }
        if (length == 1) {
            return SetsKt.m18503g(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(objArr.length));
        ArraysKt___ArraysKt.m18394c(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18373i(int[] iArr, int i) {
        Intrinsics.m18599g(iArr, "<this>");
        return m18343J(iArr, i) >= 0;
    }

    /* JADX INFO: renamed from: i0 */
    public static ArrayList m18374i0(Object[] objArr, Object[] other) {
        Intrinsics.m18599g(objArr, "<this>");
        Intrinsics.m18599g(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], other[i]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18375j(long[] jArr, long j) {
        Intrinsics.m18599g(jArr, "<this>");
        return m18344K(jArr, j) >= 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18376k(Object[] objArr, Object obj) {
        Intrinsics.m18599g(objArr, "<this>");
        return m18345L(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m18377l(short[] sArr, short s) {
        Intrinsics.m18599g(sArr, "<this>");
        return m18346M(sArr, s) >= 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m18378m(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!m18378m((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof UByteArray) && (obj2 instanceof UByteArray)) {
                            UByteArray uByteArray = (UByteArray) obj2;
                            byte[] bArr = ((UByteArray) obj).f51443a;
                            if (bArr == null) {
                                bArr = null;
                            }
                            byte[] bArr2 = uByteArray.f51443a;
                            if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                            }
                        } else if ((obj instanceof UShortArray) && (obj2 instanceof UShortArray)) {
                            UShortArray uShortArray = (UShortArray) obj2;
                            short[] sArr = ((UShortArray) obj).f51456a;
                            if (sArr == null) {
                                sArr = null;
                            }
                            short[] sArr2 = uShortArray.f51456a;
                            if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                            }
                        } else if ((obj instanceof UIntArray) && (obj2 instanceof UIntArray)) {
                            UIntArray uIntArray = (UIntArray) obj2;
                            int[] iArr = ((UIntArray) obj).f51447a;
                            if (iArr == null) {
                                iArr = null;
                            }
                            int[] iArr2 = uIntArray.f51447a;
                            if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                            }
                        } else if ((obj instanceof ULongArray) && (obj2 instanceof ULongArray)) {
                            ULongArray uLongArray = (ULongArray) obj2;
                            long[] jArr = ((ULongArray) obj).f51451a;
                            if (jArr == null) {
                                jArr = null;
                            }
                            long[] jArr2 = uLongArray.f51451a;
                            if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m18379n(int i, int i2, int[] iArr, int[] destination, int i3) {
        Intrinsics.m18599g(iArr, "<this>");
        Intrinsics.m18599g(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m18380o(byte[] bArr, int i, byte[] destination, int i2, int i3) {
        Intrinsics.m18599g(bArr, "<this>");
        Intrinsics.m18599g(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    /* JADX INFO: renamed from: p */
    public static void m18381p(char[] cArr, char[] destination, int i, int i2, int i3) {
        Intrinsics.m18599g(cArr, "<this>");
        Intrinsics.m18599g(destination, "destination");
        System.arraycopy(cArr, i2, destination, i, i3 - i2);
    }

    /* JADX INFO: renamed from: q */
    public static void m18382q(long[] jArr, long[] destination, int i, int i2, int i3) {
        Intrinsics.m18599g(jArr, "<this>");
        Intrinsics.m18599g(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
    }

    /* JADX INFO: renamed from: r */
    public static void m18383r(Object[] objArr, int i, Object[] destination, int i2, int i3) {
        Intrinsics.m18599g(objArr, "<this>");
        Intrinsics.m18599g(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m18384s(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m18379n(i, 0, iArr, iArr2, i2);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m18385t(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        m18383r(objArr, 0, objArr2, i, i2);
    }

    /* JADX INFO: renamed from: u */
    public static byte[] m18386u(byte[] bArr, int i, int i2) {
        Intrinsics.m18599g(bArr, "<this>");
        ArraysKt__ArraysJVMKt.m18392a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.m18598f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: v */
    public static Object[] m18387v(int i, int i2, Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        ArraysKt__ArraysJVMKt.m18392a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        Intrinsics.m18598f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: w */
    public static void m18388w(Object[] objArr, Symbol symbol, int i, int i2) {
        Intrinsics.m18599g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, symbol);
    }

    /* JADX INFO: renamed from: x */
    public static void m18389x(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Intrinsics.m18599g(iArr, "<this>");
        Arrays.fill(iArr, 0, i2, i);
    }

    /* JADX INFO: renamed from: y */
    public static void m18390y(long[] jArr, long j) {
        int length = jArr.length;
        Intrinsics.m18599g(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m18391z(Object[] objArr, Symbol symbol) {
        m18388w(objArr, symbol, 0, objArr.length);
    }
}
