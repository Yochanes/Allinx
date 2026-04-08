package kotlin.collections;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.navigation.internal.C2036f;
import io.intercom.android.sdk.p032m5.inbox.C5555a;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.ranges.IntRange;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    /* JADX INFO: renamed from: A */
    public static Object m18396A(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            return m18398B((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: A0 */
    public static LinkedHashSet m18397A0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.m18476g(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: B */
    public static Object m18398B(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: B0 */
    public static Set m18399B0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        EmptySet emptySet = EmptySet.f51498a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return SetsKt.m18503g(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(collection.size()));
                CollectionsKt___CollectionsKt.m18476g(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            CollectionsKt___CollectionsKt.m18476g(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : SetsKt.m18503g(linkedHashSet2.iterator().next());
            }
        }
        return emptySet;
    }

    /* JADX INFO: renamed from: C */
    public static Object m18400C(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: C0 */
    public static IndexingIterable m18401C0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        return new IndexingIterable(new C5555a(iterable, 4));
    }

    /* JADX INFO: renamed from: D */
    public static Object m18402D(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: D0 */
    public static ArrayList m18403D0(Iterable iterable, Iterable other) {
        Intrinsics.m18599g(iterable, "<this>");
        Intrinsics.m18599g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m18452r(iterable, 10), m18452r(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static IntRange m18404E(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: F */
    public static int m18405F(List list) {
        Intrinsics.m18599g(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: G */
    public static Object m18406G(int i, List list) {
        Intrinsics.m18599g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: H */
    public static int m18407H(Iterable iterable, Object obj) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                m18455s0();
                throw null;
            }
            if (Intrinsics.m18594b(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m18408I(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.m18475f(iterable, sb, str4, str5, str6, "...", function1);
    }

    /* JADX INFO: renamed from: J */
    public static String m18409J(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.m18599g(iterable, "<this>");
        Intrinsics.m18599g(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.m18475f(iterable, sb, str4, prefix, str5, "...", function1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: K */
    public static Object m18410K(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            return m18411L((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: L */
    public static Object m18411L(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m18405F(list));
    }

    /* JADX INFO: renamed from: M */
    public static Object m18412M(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return AbstractC1610a.m8729g(1, list);
    }

    /* JADX INFO: renamed from: N */
    public static List m18413N(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.m18598f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: O */
    public static List m18414O(Object... elements) {
        Intrinsics.m18599g(elements, "elements");
        return elements.length > 0 ? ArraysKt.m18365e(elements) : EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: P */
    public static List m18415P(Object obj) {
        return obj != null ? m18413N(obj) : EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: Q */
    public static Comparable m18416Q(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: R */
    public static Float m18417R(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: S */
    public static double m18418S(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: T */
    public static Float m18419T(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: U */
    public static double m18420U(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: V */
    public static ArrayList m18421V(Iterable iterable, Object obj) {
        Intrinsics.m18599g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(m18452r(iterable, 10));
        boolean z2 = false;
        for (Object obj2 : iterable) {
            boolean z3 = true;
            if (!z2 && Intrinsics.m18594b(obj2, obj)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: W */
    public static ArrayList m18422W(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    /* JADX INFO: renamed from: X */
    public static ArrayList m18423X(Iterable iterable, Iterable iterable2) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m18425Z((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        m18434i(arrayList, iterable);
        m18434i(arrayList, iterable2);
        return arrayList;
    }

    /* JADX INFO: renamed from: Y */
    public static ArrayList m18424Y(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m18426a0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        m18434i(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static ArrayList m18425Z(Collection collection, Iterable elements) {
        Intrinsics.m18599g(collection, "<this>");
        Intrinsics.m18599g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m18434i(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: a0 */
    public static ArrayList m18426a0(Collection collection, Object obj) {
        Intrinsics.m18599g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m18427b0(Iterable iterable, C2036f c2036f) {
        Intrinsics.m18599g(iterable, "<this>");
        CollectionsKt__MutableCollectionsKt.m18472c(iterable, c2036f, true);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m18428c0(List list, Function1 predicate) {
        int iM18405F;
        Intrinsics.m18599g(list, "<this>");
        Intrinsics.m18599g(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableIterable)) {
                TypeIntrinsics.m18632h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                CollectionsKt__MutableCollectionsKt.m18472c(list, predicate, true);
                return;
            } catch (ClassCastException e) {
                Intrinsics.m18603k(e, TypeIntrinsics.class.getName());
                throw e;
            }
        }
        int iM18405F2 = m18405F(list);
        int i = 0;
        if (iM18405F2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM18405F2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iM18405F = m18405F(list))) {
            return;
        }
        while (true) {
            list.remove(iM18405F);
            if (iM18405F == i) {
                return;
            } else {
                iM18405F--;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static Object m18429d0(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: e0 */
    public static Object m18430e0(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(m18405F(list));
    }

    /* JADX INFO: renamed from: f0 */
    public static void m18431f0(Iterable iterable, Function1 function1) {
        CollectionsKt__MutableCollectionsKt.m18472c(iterable, function1, false);
    }

    /* JADX INFO: renamed from: g0 */
    public static List m18432g0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m18465x0(iterable);
        }
        List listM18477h = CollectionsKt___CollectionsKt.m18477h(iterable);
        Collections.reverse(listM18477h);
        return listM18477h;
    }

    /* JADX INFO: renamed from: h0 */
    public static List m18433h0(ArrayList arrayList, SecureRandom secureRandom) {
        List listM18477h = CollectionsKt___CollectionsKt.m18477h(arrayList);
        Collections.shuffle(listM18477h, secureRandom);
        return listM18477h;
    }

    /* JADX INFO: renamed from: i */
    public static void m18434i(Collection collection, Iterable elements) {
        Intrinsics.m18599g(collection, "<this>");
        Intrinsics.m18599g(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Object m18435i0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            return m18437j0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: j */
    public static void m18436j(List list, Object[] elements) {
        Intrinsics.m18599g(list, "<this>");
        Intrinsics.m18599g(elements, "elements");
        list.addAll(ArraysKt.m18365e(elements));
    }

    /* JADX INFO: renamed from: j0 */
    public static Object m18437j0(List list) {
        Intrinsics.m18599g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m18438k(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    /* JADX INFO: renamed from: k0 */
    public static Object m18439k0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: l */
    public static List m18440l(List list) {
        return new ReversedListReadOnly(list);
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m18441l0(List list) {
        Intrinsics.m18599g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static List m18442m(ArrayList arrayList) {
        return new ReversedList(arrayList);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m18443m0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: n */
    public static CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 m18444n(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(iterable);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m18445n0(List list, Comparator comparator) {
        Intrinsics.m18599g(list, "<this>");
        Intrinsics.m18599g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m18446o(List list, int i, Function1 function1) {
        Intrinsics.m18599g(list, "<this>");
        CollectionsKt__CollectionsKt.m18471b(list.size(), i);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iIntValue = ((Number) function1.invoke(list.get(i4))).intValue();
            if (iIntValue < 0) {
                i3 = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: o0 */
    public static List m18447o0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM18477h = CollectionsKt___CollectionsKt.m18477h(iterable);
            m18443m0(listM18477h);
            return listM18477h;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m18465x0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.m18599g(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt.m18365e(array);
    }

    /* JADX INFO: renamed from: p */
    public static int m18448p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.m18599g(arrayList, "<this>");
        CollectionsKt__CollectionsKt.m18471b(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iM18545a = ComparisonsKt.m18545a((Comparable) arrayList.get(i3), comparable);
            if (iM18545a < 0) {
                i2 = i3 + 1;
            } else {
                if (iM18545a <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: p0 */
    public static List m18449p0(Iterable iterable, Comparator comparator) {
        Intrinsics.m18599g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM18477h = CollectionsKt___CollectionsKt.m18477h(iterable);
            m18445n0(listM18477h, comparator);
            return listM18477h;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m18465x0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.m18599g(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return ArraysKt.m18365e(array);
    }

    /* JADX INFO: renamed from: q */
    public static ListBuilder m18450q(List builder) {
        Intrinsics.m18599g(builder, "builder");
        ListBuilder listBuilder = (ListBuilder) builder;
        listBuilder.m18512k();
        listBuilder.f51528c = true;
        return listBuilder.f51527b > 0 ? listBuilder : ListBuilder.f51525d;
    }

    /* JADX INFO: renamed from: q0 */
    public static List m18451q0(Iterable iterable, int i) {
        Intrinsics.m18599g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.f51496a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m18465x0(iterable);
            }
            if (i == 1) {
                return m18413N(m18396A(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.m18470a(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public static int m18452r(Iterable iterable, int i) {
        Intrinsics.m18599g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m18453r0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m18454s(Iterable iterable, Object obj) {
        Intrinsics.m18599g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m18407H(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: s0 */
    public static void m18455s0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: t */
    public static Collection m18456t(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : m18465x0(iterable);
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean[] m18457t0(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: u */
    public static int m18458u(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                m18453r0();
                throw null;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: u0 */
    public static float[] m18459u0(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: v */
    public static ListBuilder m18460v() {
        return new ListBuilder(10);
    }

    /* JADX INFO: renamed from: v0 */
    public static HashSet m18461v0(ArrayList arrayList) {
        Intrinsics.m18599g(arrayList, "<this>");
        HashSet hashSet = new HashSet(MapsKt.m18484g(m18452r(arrayList, 12)));
        CollectionsKt___CollectionsKt.m18476g(arrayList, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: w */
    public static List m18462w(Iterable iterable) {
        ArrayList arrayList;
        Intrinsics.m18599g(iterable, "<this>");
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return EmptyList.f51496a;
            }
            if (size == 1) {
                return m18413N(m18410K(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(list.get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return CollectionsKt__CollectionsKt.m18470a(arrayList);
    }

    /* JADX INFO: renamed from: w0 */
    public static int[] m18463w0(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x */
    public static List m18464x(List list) {
        Intrinsics.m18599g(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m18451q0(list2, size);
    }

    /* JADX INFO: renamed from: x0 */
    public static List m18465x0(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.m18470a(CollectionsKt___CollectionsKt.m18477h(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f51496a;
        }
        if (size != 1) {
            return m18469z0(collection);
        }
        return m18413N(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList m18466y(Collection collection, Function1 function1) {
        Intrinsics.m18599g(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static long[] m18467y0(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList m18468z(Iterable iterable) {
        Intrinsics.m18599g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z0 */
    public static ArrayList m18469z0(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        return new ArrayList(collection);
    }
}
