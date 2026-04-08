package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Platform_commonKt {

    /* JADX INFO: renamed from: a */
    public static final SerialDescriptor[] f56734a = new SerialDescriptor[0];

    /* JADX INFO: renamed from: a */
    public static final Set m21017a(SerialDescriptor serialDescriptor) {
        Intrinsics.m18599g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).mo20947b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getF56737c());
        int f56737c = serialDescriptor.getF56737c();
        for (int i = 0; i < f56737c; i++) {
            hashSet.add(serialDescriptor.mo20943f(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final SerialDescriptor[] m21018b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f56734a : serialDescriptorArr;
    }

    /* JADX INFO: renamed from: c */
    public static final KClass m21019c(KType kType) {
        KClassifier kClassifierMo18637g = kType.mo18637g();
        if (kClassifierMo18637g instanceof KClass) {
            return (KClass) kClassifierMo18637g;
        }
        if (!(kClassifierMo18637g instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + kClassifierMo18637g);
        }
        throw new IllegalArgumentException("Captured type parameter " + kClassifierMo18637g + " from generic non-reified function. Such functionality cannot be supported because " + kClassifierMo18637g + " is erased, either specify serializer explicitly or make calling function inline with reified " + kClassifierMo18637g + '.');
    }

    /* JADX INFO: renamed from: d */
    public static final String m21020d(KClass kClass) {
        Intrinsics.m18599g(kClass, "<this>");
        String strMo18588i = kClass.mo18588i();
        if (strMo18588i == null) {
            strMo18588i = "<local class name not available>";
        }
        return AbstractC0000a.m3D("Serializer for class '", strMo18588i, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }
}
