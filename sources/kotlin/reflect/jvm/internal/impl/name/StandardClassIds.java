package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class StandardClassIds {

    /* JADX INFO: renamed from: a */
    public static final FqName f54047a;

    /* JADX INFO: renamed from: b */
    public static final FqName f54048b;

    /* JADX INFO: renamed from: c */
    public static final FqName f54049c;

    /* JADX INFO: renamed from: d */
    public static final FqName f54050d;

    /* JADX INFO: renamed from: e */
    public static final FqName f54051e;

    /* JADX INFO: renamed from: f */
    public static final FqName f54052f;

    /* JADX INFO: renamed from: g */
    public static final FqName f54053g;

    /* JADX INFO: renamed from: h */
    public static final Set f54054h;

    /* JADX INFO: renamed from: i */
    public static final ClassId f54055i;

    /* JADX INFO: renamed from: j */
    public static final ClassId f54056j;

    /* JADX INFO: renamed from: k */
    public static final ClassId f54057k;

    /* JADX INFO: renamed from: l */
    public static final ClassId f54058l;

    /* JADX INFO: renamed from: m */
    public static final ClassId f54059m;

    /* JADX INFO: renamed from: n */
    public static final ClassId f54060n;

    /* JADX INFO: renamed from: o */
    public static final ClassId f54061o;

    /* JADX INFO: renamed from: p */
    public static final Set f54062p;

    /* JADX INFO: renamed from: q */
    public static final Set f54063q;

    /* JADX INFO: renamed from: r */
    public static final ClassId f54064r;

    /* JADX INFO: renamed from: s */
    public static final ClassId f54065s;

    /* JADX INFO: renamed from: t */
    public static final ClassId f54066t;

    /* JADX INFO: renamed from: u */
    public static final ClassId f54067u;

    static {
        FqName fqName = new FqName("kotlin");
        f54047a = fqName;
        FqName fqNameM19587c = fqName.m19587c(Name.m19605e("reflect"));
        f54048b = fqNameM19587c;
        FqName fqNameM19587c2 = fqName.m19587c(Name.m19605e("collections"));
        f54049c = fqNameM19587c2;
        FqName fqNameM19587c3 = fqName.m19587c(Name.m19605e("ranges"));
        f54050d = fqNameM19587c3;
        fqName.m19587c(Name.m19605e("jvm")).m19587c(Name.m19605e("internal"));
        FqName fqNameM19587c4 = fqName.m19587c(Name.m19605e("annotation"));
        f54051e = fqNameM19587c4;
        FqName fqNameM19587c5 = fqName.m19587c(Name.m19605e("internal"));
        fqNameM19587c5.m19587c(Name.m19605e("ir"));
        FqName fqNameM19587c6 = fqName.m19587c(Name.m19605e("coroutines"));
        f54052f = fqNameM19587c6;
        f54053g = fqName.m19587c(Name.m19605e("enums"));
        f54054h = ArraysKt.m18372h0(new FqName[]{fqName, fqNameM19587c2, fqNameM19587c3, fqNameM19587c4, fqNameM19587c, fqNameM19587c5, fqNameM19587c6});
        StandardClassIdsKt.m19610a("Nothing");
        StandardClassIdsKt.m19610a("Unit");
        StandardClassIdsKt.m19610a("Any");
        StandardClassIdsKt.m19610a("Enum");
        StandardClassIdsKt.m19610a("Annotation");
        f54055i = StandardClassIdsKt.m19610a("Array");
        ClassId classIdM19610a = StandardClassIdsKt.m19610a("Boolean");
        ClassId classIdM19610a2 = StandardClassIdsKt.m19610a("Char");
        ClassId classIdM19610a3 = StandardClassIdsKt.m19610a("Byte");
        ClassId classIdM19610a4 = StandardClassIdsKt.m19610a("Short");
        ClassId classIdM19610a5 = StandardClassIdsKt.m19610a("Int");
        ClassId classIdM19610a6 = StandardClassIdsKt.m19610a("Long");
        ClassId classIdM19610a7 = StandardClassIdsKt.m19610a("Float");
        ClassId classIdM19610a8 = StandardClassIdsKt.m19610a("Double");
        f54056j = StandardClassIdsKt.m19615f(classIdM19610a3);
        f54057k = StandardClassIdsKt.m19615f(classIdM19610a4);
        f54058l = StandardClassIdsKt.m19615f(classIdM19610a5);
        f54059m = StandardClassIdsKt.m19615f(classIdM19610a6);
        StandardClassIdsKt.m19610a("CharSequence");
        f54060n = StandardClassIdsKt.m19610a("String");
        StandardClassIdsKt.m19610a("Throwable");
        StandardClassIdsKt.m19610a("Cloneable");
        StandardClassIdsKt.m19614e("KProperty");
        StandardClassIdsKt.m19614e("KMutableProperty");
        StandardClassIdsKt.m19614e("KProperty0");
        StandardClassIdsKt.m19614e("KMutableProperty0");
        StandardClassIdsKt.m19614e("KProperty1");
        StandardClassIdsKt.m19614e("KMutableProperty1");
        StandardClassIdsKt.m19614e("KProperty2");
        StandardClassIdsKt.m19614e("KMutableProperty2");
        f54061o = StandardClassIdsKt.m19614e("KFunction");
        StandardClassIdsKt.m19614e("KClass");
        StandardClassIdsKt.m19614e("KCallable");
        StandardClassIdsKt.m19610a("Comparable");
        StandardClassIdsKt.m19610a("Number");
        StandardClassIdsKt.m19610a("Function");
        Set setM18372h0 = ArraysKt.m18372h0(new ClassId[]{classIdM19610a, classIdM19610a2, classIdM19610a3, classIdM19610a4, classIdM19610a5, classIdM19610a6, classIdM19610a7, classIdM19610a8});
        f54062p = setM18372h0;
        Set set = setM18372h0;
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(set, 10));
        if (iM18484g < 16) {
            iM18484g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
        for (Object obj : set) {
            Name nameM19583i = ((ClassId) obj).m19583i();
            Intrinsics.m18598f(nameM19583i, "id.shortClassName");
            linkedHashMap.put(obj, StandardClassIdsKt.m19613d(nameM19583i));
        }
        StandardClassIdsKt.m19612c(linkedHashMap);
        Set setM18372h02 = ArraysKt.m18372h0(new ClassId[]{f54056j, f54057k, f54058l, f54059m});
        f54063q = setM18372h02;
        Set set2 = setM18372h02;
        int iM18484g2 = MapsKt.m18484g(CollectionsKt.m18452r(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM18484g2 >= 16 ? iM18484g2 : 16);
        for (Object obj2 : set2) {
            Name nameM19583i2 = ((ClassId) obj2).m19583i();
            Intrinsics.m18598f(nameM19583i2, "id.shortClassName");
            linkedHashMap2.put(obj2, StandardClassIdsKt.m19613d(nameM19583i2));
        }
        StandardClassIdsKt.m19612c(linkedHashMap2);
        SetsKt.m18502f(SetsKt.m18501e(f54062p, f54063q), f54060n);
        new ClassId(f54052f, Name.m19605e("Continuation"));
        StandardClassIdsKt.m19611b("Iterator");
        StandardClassIdsKt.m19611b("Iterable");
        StandardClassIdsKt.m19611b("Collection");
        StandardClassIdsKt.m19611b("List");
        StandardClassIdsKt.m19611b("ListIterator");
        StandardClassIdsKt.m19611b("Set");
        ClassId classIdM19611b = StandardClassIdsKt.m19611b("Map");
        StandardClassIdsKt.m19611b("MutableIterator");
        StandardClassIdsKt.m19611b("CharIterator");
        StandardClassIdsKt.m19611b("MutableIterable");
        StandardClassIdsKt.m19611b("MutableCollection");
        f54064r = StandardClassIdsKt.m19611b("MutableList");
        StandardClassIdsKt.m19611b("MutableListIterator");
        f54065s = StandardClassIdsKt.m19611b("MutableSet");
        ClassId classIdM19611b2 = StandardClassIdsKt.m19611b("MutableMap");
        f54066t = classIdM19611b2;
        classIdM19611b.m19579d(Name.m19605e("Entry"));
        classIdM19611b2.m19579d(Name.m19605e("MutableEntry"));
        StandardClassIdsKt.m19610a("Result");
        FqName fqName2 = f54050d;
        new ClassId(fqName2, Name.m19605e("IntRange"));
        new ClassId(fqName2, Name.m19605e("LongRange"));
        new ClassId(fqName2, Name.m19605e("CharRange"));
        FqName fqName3 = f54051e;
        new ClassId(fqName3, Name.m19605e("AnnotationRetention"));
        new ClassId(fqName3, Name.m19605e("AnnotationTarget"));
        f54067u = new ClassId(f54053g, Name.m19605e("EnumEntries"));
    }
}
