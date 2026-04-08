package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, KMappedMarker {

    /* JADX INFO: renamed from: b */
    public static final Companion f54853b = new Companion();

    /* JADX INFO: renamed from: c */
    public static final TypeAttributes f54854c = new TypeAttributes(EmptyList.f51496a);

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        /* JADX INFO: renamed from: c */
        public static TypeAttributes m20172c(List list) {
            return list.isEmpty() ? TypeAttributes.f54854c : new TypeAttributes(list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        /* JADX INFO: renamed from: a */
        public final int mo20173a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1) {
            int iIntValue;
            Intrinsics.m18599g(concurrentHashMap, "<this>");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object objInvoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        num2 = (Integer) objInvoke;
                    }
                    iIntValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public TypeAttributes(List list) {
        this.f55023a = EmptyArrayMap.f55035a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeAttribute typeAttribute = (TypeAttribute) it.next();
            KClass tClass = typeAttribute.mo20121b();
            Intrinsics.m18599g(tClass, "tClass");
            int iM20330b = f54853b.m20330b(tClass);
            int iMo20323c = this.f55023a.mo20323c();
            if (iMo20323c != 0) {
                if (iMo20323c == 1) {
                    ArrayMap arrayMap = this.f55023a;
                    Intrinsics.m18597e(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                    int i = oneElementArrayMap.f55043b;
                    if (i == iM20330b) {
                        this.f55023a = new OneElementArrayMap(typeAttribute, iM20330b);
                    } else {
                        ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                        arrayMapImpl.f55019a = new Object[20];
                        arrayMapImpl.f55020b = 0;
                        this.f55023a = arrayMapImpl;
                        arrayMapImpl.mo20324e(i, oneElementArrayMap.f55042a);
                    }
                }
                this.f55023a.mo20324e(iM20330b, typeAttribute);
            } else {
                this.f55023a = new OneElementArrayMap(typeAttribute, iM20330b);
            }
        }
    }
}
