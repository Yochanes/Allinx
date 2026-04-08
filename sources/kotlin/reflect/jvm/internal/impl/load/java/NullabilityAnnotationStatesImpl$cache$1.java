package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class NullabilityAnnotationStatesImpl$cache$1 extends Lambda implements Function1<FqName, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NullabilityAnnotationStatesImpl f52799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullabilityAnnotationStatesImpl$cache$1(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        super(1);
        this.f52799a = nullabilityAnnotationStatesImpl;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        FqName it = (FqName) obj;
        Intrinsics.m18598f(it, "it");
        ?? r0 = this.f52799a.f52797b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = r0.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            FqName packageName = (FqName) entry.getKey();
            if (!it.equals(packageName)) {
                Intrinsics.m18599g(packageName, "packageName");
                if (Intrinsics.m18594b(it.m19588d() ? null : it.m19589e(), packageName)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            Iterator it3 = linkedHashMap.entrySet().iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int length = FqNamesUtilKt.m19602b((FqName) ((Map.Entry) next).getKey(), it).m19586b().length();
                    do {
                        Object next2 = it3.next();
                        int length2 = FqNamesUtilKt.m19602b((FqName) ((Map.Entry) next2).getKey(), it).m19586b().length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                return entry2.getValue();
            }
        }
        return null;
    }
}
