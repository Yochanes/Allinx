package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    public static final Companion f54868b = new Companion();

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public final TypeSubstitution m20180a(TypeConstructor typeConstructor, List arguments) {
            Intrinsics.m18599g(typeConstructor, "typeConstructor");
            Intrinsics.m18599g(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            Intrinsics.m18598f(parameters, "typeConstructor.parameters");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.m18412M(parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.mo18883i0()) {
                return new IndexedParametersSubstitution((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) arguments.toArray(new TypeProjection[0]), false);
            }
            List parameters2 = typeConstructor.getParameters();
            Intrinsics.m18598f(parameters2, "typeConstructor.parameters");
            List list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).mo18830h());
            }
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(MapsKt.m18489l(CollectionsKt.m18403D0(arrayList, arguments)));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: d */
    public final TypeProjection mo19297d(KotlinType kotlinType) {
        return mo20163g(kotlinType.mo19953I0());
    }

    /* JADX INFO: renamed from: g */
    public abstract TypeProjection mo20163g(TypeConstructor typeConstructor);
}
