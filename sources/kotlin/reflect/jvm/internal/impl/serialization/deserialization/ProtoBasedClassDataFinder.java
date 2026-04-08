package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    public final NameResolverImpl f54598a;

    /* JADX INFO: renamed from: b */
    public final BuiltInsBinaryVersion f54599b;

    /* JADX INFO: renamed from: c */
    public final Function1 f54600c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f54601d;

    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment packageFragment, NameResolverImpl nameResolverImpl, BuiltInsBinaryVersion builtInsBinaryVersion, Function1 function1) {
        this.f54598a = nameResolverImpl;
        this.f54599b = builtInsBinaryVersion;
        this.f54600c = function1;
        List list = packageFragment.f53601i;
        Intrinsics.m18598f(list, "proto.class_List");
        List list2 = list;
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g < 16 ? 16 : iM18484g);
        for (Object obj : list2) {
            linkedHashMap.put(NameResolverUtilKt.m20028a(this.f54598a, ((ProtoBuf.Class) obj).f53407f), obj);
        }
        this.f54601d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    /* JADX INFO: renamed from: a */
    public final ClassData mo19390a(ClassId classId) {
        Intrinsics.m18599g(classId, "classId");
        ProtoBuf.Class r0 = (ProtoBuf.Class) this.f54601d.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.f54598a, r0, this.f54599b, (SourceElement) ((DeserializedPackageFragmentImpl$classDataFinder$1) this.f54600c).invoke(classId));
    }
}
