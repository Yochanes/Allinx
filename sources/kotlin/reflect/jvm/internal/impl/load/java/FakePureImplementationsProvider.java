package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class FakePureImplementationsProvider {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f52725a;

    /* JADX INFO: renamed from: b */
    public static final Map f52726b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f52725a = linkedHashMap;
        m19189b(StandardClassIds.f54064r, m19188a("java.util.ArrayList", "java.util.LinkedList"));
        m19189b(StandardClassIds.f54065s, m19188a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m19189b(StandardClassIds.f54066t, m19188a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        m19189b(ClassId.m19576j(new FqName("java.util.function.Function")), m19188a("java.util.function.UnaryOperator"));
        m19189b(ClassId.m19576j(new FqName("java.util.function.BiFunction")), m19188a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ClassId) entry.getKey()).m19577b(), ((ClassId) entry.getValue()).m19577b()));
        }
        f52726b = MapsKt.m18489l(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m19188a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.m19576j(new FqName(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m19189b(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f52725a.put(obj, classId);
        }
    }
}
