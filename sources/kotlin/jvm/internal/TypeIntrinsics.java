package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TypeIntrinsics {
    /* JADX INFO: renamed from: a */
    public static Collection m18625a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            m18632h(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            Intrinsics.m18603k(e, TypeIntrinsics.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List m18626b(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            m18632h(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            Intrinsics.m18603k(e, TypeIntrinsics.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map m18627c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            m18632h(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.m18603k(e, TypeIntrinsics.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Set m18628d(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            m18632h(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.m18603k(e, TypeIntrinsics.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18629e(int i, Object obj) {
        if (obj == null || m18630f(i, obj)) {
            return;
        }
        m18632h(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18630f(int i, Object obj) {
        if (obj instanceof Function) {
            if ((obj instanceof FunctionBase ? ((FunctionBase) obj).getF51607a() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof Function3 ? 3 : obj instanceof Function4 ? 4 : obj instanceof Function5 ? 5 : obj instanceof Function6 ? 6 : obj instanceof Function7 ? 7 : obj instanceof Function8 ? 8 : obj instanceof Function9 ? 9 : obj instanceof Function10 ? 10 : obj instanceof Function11 ? 11 : obj instanceof Function12 ? 12 : obj instanceof Function13 ? 13 : obj instanceof Function14 ? 14 : obj instanceof Function15 ? 15 : obj instanceof Function16 ? 16 : obj instanceof Function17 ? 17 : obj instanceof Function18 ? 18 : obj instanceof Function19 ? 19 : obj instanceof Function20 ? 20 : obj instanceof Function21 ? 21 : obj instanceof Function22 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18631g(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableMap.Entry);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m18632h(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC0000a.m14k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.m18603k(classCastException, TypeIntrinsics.class.getName());
        throw classCastException;
    }
}
