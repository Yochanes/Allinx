package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TypesJVMKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51735a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f51719a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f51719a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f51719a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51735a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m18667a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceM20368j = SequencesKt.m20368j(type, TypesJVMKt$typeToString$unwrap$1.f51736a);
        return ((Class) SequencesKt.m20371m(sequenceM20368j)).getName() + StringsKt.m20409G("[]", SequencesKt.m20361c(sequenceM20368j));
    }

    /* JADX INFO: renamed from: b */
    public static final Type m18668b(KType kType, boolean z2) {
        KClassifier kClassifierMo18637g = kType.mo18637g();
        if (kClassifierMo18637g instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) kClassifierMo18637g);
        }
        if (!(kClassifierMo18637g instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) kClassifierMo18637g;
        Class clsM18573c = z2 ? JvmClassMappingKt.m18573c(kClass) : JvmClassMappingKt.m18572b(kClass);
        List listMo18635e = kType.mo18635e();
        if (listMo18635e.isEmpty()) {
            return clsM18573c;
        }
        if (!clsM18573c.isArray()) {
            return m18669c(listMo18635e, clsM18573c);
        }
        if (clsM18573c.getComponentType().isPrimitive()) {
            return clsM18573c;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.m18441l0(listMo18635e);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance kVariance = kTypeProjection.f51716a;
        int i = kVariance == null ? -1 : WhenMappings.f51735a[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM18573c;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        KTypeImpl kTypeImpl = kTypeProjection.f51717b;
        Intrinsics.m18596d(kTypeImpl);
        Type typeM18668b = m18668b(kTypeImpl, false);
        return typeM18668b instanceof Class ? clsM18573c : new GenericArrayTypeImpl(typeM18668b);
    }

    /* JADX INFO: renamed from: c */
    public static final Type m18669c(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(m18670d((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m18670d((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM18669c = m18669c(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m18670d((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeM18669c, arrayList3);
    }

    /* JADX INFO: renamed from: d */
    public static final Type m18670d(KTypeProjection kTypeProjection) {
        KVariance kVariance = kTypeProjection.f51716a;
        if (kVariance == null) {
            return WildcardTypeImpl.f51737c;
        }
        KTypeImpl kTypeImpl = kTypeProjection.f51717b;
        Intrinsics.m18596d(kTypeImpl);
        int iOrdinal = kVariance.ordinal();
        if (iOrdinal == 0) {
            return m18668b(kTypeImpl, true);
        }
        if (iOrdinal == 1) {
            return new WildcardTypeImpl(null, m18668b(kTypeImpl, true));
        }
        if (iOrdinal == 2) {
            return new WildcardTypeImpl(m18668b(kTypeImpl, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
