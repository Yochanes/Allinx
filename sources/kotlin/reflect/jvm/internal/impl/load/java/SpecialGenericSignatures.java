package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.animation.AbstractC0455a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public class SpecialGenericSignatures {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f52808a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f52809b;

    /* JADX INFO: renamed from: c */
    public static final Object f52810c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f52811d;

    /* JADX INFO: renamed from: e */
    public static final Set f52812e;

    /* JADX INFO: renamed from: f */
    public static final Set f52813f;

    /* JADX INFO: renamed from: g */
    public static final Companion.NameAndSignature f52814g;

    /* JADX INFO: renamed from: h */
    public static final Object f52815h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f52816i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList f52817j;

    /* JADX INFO: renamed from: k */
    public static final LinkedHashMap f52818k;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a */
            public final Name f52819a;

            /* JADX INFO: renamed from: b */
            public final String f52820b;

            public NameAndSignature(Name name, String signature) {
                Intrinsics.m18599g(signature, "signature");
                this.f52819a = name;
                this.f52820b = signature;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.m18594b(this.f52819a, nameAndSignature.f52819a) && Intrinsics.m18594b(this.f52820b, nameAndSignature.f52820b);
            }

            public final int hashCode() {
                return this.f52820b.hashCode() + (this.f52819a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.f52819a);
                sb.append(", signature=");
                return AbstractC0455a.m2241p(sb, this.f52820b, ')');
            }
        }

        /* JADX INFO: renamed from: a */
        public static final NameAndSignature m19203a(String str, String str2, String str3, String str4) {
            ArrayList arrayList = SpecialGenericSignatures.f52808a;
            return new NameAndSignature(Name.m19605e(str2), SignatureBuildingComponents.m19412f(str, str2 + '(' + str3 + ')' + str4));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class SpecialSignatureInfo {

        /* JADX INFO: renamed from: a */
        public static final SpecialSignatureInfo f52821a;

        /* JADX INFO: renamed from: b */
        public static final SpecialSignatureInfo f52822b;

        /* JADX INFO: renamed from: c */
        public static final SpecialSignatureInfo f52823c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ SpecialSignatureInfo[] f52824d;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            f52821a = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            f52822b = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            f52823c = specialSignatureInfo3;
            f52824d = new SpecialSignatureInfo[]{specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) f52824d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class TypeSafeBarrierDescription {

        /* JADX INFO: renamed from: b */
        public static final TypeSafeBarrierDescription f52825b;

        /* JADX INFO: renamed from: c */
        public static final TypeSafeBarrierDescription f52826c;

        /* JADX INFO: renamed from: d */
        public static final TypeSafeBarrierDescription f52827d;

        /* JADX INFO: renamed from: f */
        public static final TypeSafeBarrierDescription f52828f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ TypeSafeBarrierDescription[] f52829g;

        /* JADX INFO: renamed from: a */
        public final Object f52830a;

        /* JADX INFO: compiled from: Proguard */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            f52825b = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            f52826c = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            f52827d = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3, null);
            f52828f = map_get_or_default;
            f52829g = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        public TypeSafeBarrierDescription(String str, int i, Object obj) {
            this.f52830a = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f52829g.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM18372h0 = ArraysKt.m18372h0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(setM18372h0, 10));
        for (String str : setM18372h0) {
            String strM19991c = JvmPrimitiveType.BOOLEAN.m19991c();
            Intrinsics.m18598f(strM19991c, "BOOLEAN.desc");
            arrayList.add(Companion.m19203a("java/util/Collection", str, "Ljava/util/Collection;", strM19991c));
        }
        f52808a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).f52820b);
        }
        f52809b = arrayList2;
        ArrayList arrayList3 = f52808a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.m18452r(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).f52819a.m19608b());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String strM19991c2 = jvmPrimitiveType.m19991c();
        Intrinsics.m18598f(strM19991c2, "BOOLEAN.desc");
        Companion.NameAndSignature nameAndSignatureM19203a = Companion.m19203a(strConcat, "contains", "Ljava/lang/Object;", strM19991c2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.f52827d;
        Pair pair = new Pair(nameAndSignatureM19203a, typeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String strM19991c3 = jvmPrimitiveType.m19991c();
        Intrinsics.m18598f(strM19991c3, "BOOLEAN.desc");
        Pair pair2 = new Pair(Companion.m19203a(strConcat2, "remove", "Ljava/lang/Object;", strM19991c3), typeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String strM19991c4 = jvmPrimitiveType.m19991c();
        Intrinsics.m18598f(strM19991c4, "BOOLEAN.desc");
        Pair pair3 = new Pair(Companion.m19203a(strConcat3, "containsKey", "Ljava/lang/Object;", strM19991c4), typeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String strM19991c5 = jvmPrimitiveType.m19991c();
        Intrinsics.m18598f(strM19991c5, "BOOLEAN.desc");
        Pair pair4 = new Pair(Companion.m19203a(strConcat4, "containsValue", "Ljava/lang/Object;", strM19991c5), typeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String strM19991c6 = jvmPrimitiveType.m19991c();
        Intrinsics.m18598f(strM19991c6, "BOOLEAN.desc");
        Pair pair5 = new Pair(Companion.m19203a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM19991c6), typeSafeBarrierDescription);
        Pair pair6 = new Pair(Companion.m19203a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f52828f);
        Companion.NameAndSignature nameAndSignatureM19203a2 = Companion.m19203a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f52825b;
        Pair pair7 = new Pair(nameAndSignatureM19203a2, typeSafeBarrierDescription2);
        Pair pair8 = new Pair(Companion.m19203a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String strM19991c7 = jvmPrimitiveType2.m19991c();
        Intrinsics.m18598f(strM19991c7, "INT.desc");
        Companion.NameAndSignature nameAndSignatureM19203a3 = Companion.m19203a(strConcat6, "indexOf", "Ljava/lang/Object;", strM19991c7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f52826c;
        Pair pair9 = new Pair(nameAndSignatureM19203a3, typeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String strM19991c8 = jvmPrimitiveType2.m19991c();
        Intrinsics.m18598f(strM19991c8, "INT.desc");
        Map mapM18486i = MapsKt.m18486i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Companion.m19203a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strM19991c8), typeSafeBarrierDescription3));
        f52810c = mapM18486i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m18484g(mapM18486i.size()));
        for (Map.Entry entry : mapM18486i.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).f52820b, entry.getValue());
        }
        f52811d = linkedHashMap;
        LinkedHashSet linkedHashSetM18501e = SetsKt.m18501e(f52810c.keySet(), f52808a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.m18452r(linkedHashSetM18501e, 10));
        Iterator it3 = linkedHashSetM18501e.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it3.next()).f52819a);
        }
        f52812e = CollectionsKt.m18399B0(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.m18452r(linkedHashSetM18501e, 10));
        Iterator it4 = linkedHashSetM18501e.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it4.next()).f52820b);
        }
        f52813f = CollectionsKt.m18399B0(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String strM19991c9 = jvmPrimitiveType3.m19991c();
        Intrinsics.m18598f(strM19991c9, "INT.desc");
        Companion.NameAndSignature nameAndSignatureM19203a4 = Companion.m19203a("java/util/List", "removeAt", strM19991c9, "Ljava/lang/Object;");
        f52814g = nameAndSignatureM19203a4;
        String strConcat8 = "java/lang/".concat("Number");
        String strM19991c10 = JvmPrimitiveType.BYTE.m19991c();
        Intrinsics.m18598f(strM19991c10, "BYTE.desc");
        Pair pair10 = new Pair(Companion.m19203a(strConcat8, "toByte", "", strM19991c10), Name.m19605e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strM19991c11 = JvmPrimitiveType.SHORT.m19991c();
        Intrinsics.m18598f(strM19991c11, "SHORT.desc");
        Pair pair11 = new Pair(Companion.m19203a(strConcat9, "toShort", "", strM19991c11), Name.m19605e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strM19991c12 = jvmPrimitiveType3.m19991c();
        Intrinsics.m18598f(strM19991c12, "INT.desc");
        Pair pair12 = new Pair(Companion.m19203a(strConcat10, "toInt", "", strM19991c12), Name.m19605e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strM19991c13 = JvmPrimitiveType.LONG.m19991c();
        Intrinsics.m18598f(strM19991c13, "LONG.desc");
        Pair pair13 = new Pair(Companion.m19203a(strConcat11, "toLong", "", strM19991c13), Name.m19605e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strM19991c14 = JvmPrimitiveType.FLOAT.m19991c();
        Intrinsics.m18598f(strM19991c14, "FLOAT.desc");
        Pair pair14 = new Pair(Companion.m19203a(strConcat12, "toFloat", "", strM19991c14), Name.m19605e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strM19991c15 = JvmPrimitiveType.DOUBLE.m19991c();
        Intrinsics.m18598f(strM19991c15, "DOUBLE.desc");
        Pair pair15 = new Pair(Companion.m19203a(strConcat13, "toDouble", "", strM19991c15), Name.m19605e("doubleValue"));
        Pair pair16 = new Pair(nameAndSignatureM19203a4, Name.m19605e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strM19991c16 = jvmPrimitiveType3.m19991c();
        Intrinsics.m18598f(strM19991c16, "INT.desc");
        String strM19991c17 = JvmPrimitiveType.CHAR.m19991c();
        Intrinsics.m18598f(strM19991c17, "CHAR.desc");
        Map mapM18486i2 = MapsKt.m18486i(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(Companion.m19203a(strConcat14, "get", strM19991c16, strM19991c17), Name.m19605e("charAt")));
        f52815h = mapM18486i2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.m18484g(mapM18486i2.size()));
        for (Map.Entry entry2 : mapM18486i2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).f52820b, entry2.getValue());
        }
        f52816i = linkedHashMap2;
        Set setKeySet = f52815h.keySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.m18452r(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((Companion.NameAndSignature) it5.next()).f52819a);
        }
        f52817j = arrayList7;
        Set<Map.Entry> setEntrySet = f52815h.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(CollectionsKt.m18452r(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new Pair(((Companion.NameAndSignature) entry3.getKey()).f52819a, entry3.getValue()));
        }
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(arrayList8, 10));
        if (iM18484g < 16) {
            iM18484g = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM18484g);
        for (Pair pair17 : arrayList8) {
            linkedHashMap3.put((Name) pair17.f51427b, (Name) pair17.f51426a);
        }
        f52818k = linkedHashMap3;
    }
}
