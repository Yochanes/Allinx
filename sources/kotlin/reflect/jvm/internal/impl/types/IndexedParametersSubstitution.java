package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    public final TypeParameterDescriptor[] f54814b;

    /* JADX INFO: renamed from: c */
    public final TypeProjection[] f54815c;

    /* JADX INFO: renamed from: d */
    public final boolean f54816d;

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z2) {
        Intrinsics.m18599g(parameters, "parameters");
        Intrinsics.m18599g(arguments, "arguments");
        this.f54814b = parameters;
        this.f54815c = arguments;
        this.f54816d = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public final boolean mo19957b() {
        return this.f54816d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: d */
    public final TypeProjection mo19297d(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo18838b = kotlinType.mo19953I0().mo18838b();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo18838b instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo18838b : null;
        if (typeParameterDescriptor != null) {
            int index = typeParameterDescriptor.getIndex();
            TypeParameterDescriptor[] typeParameterDescriptorArr = this.f54814b;
            if (index < typeParameterDescriptorArr.length && Intrinsics.m18594b(typeParameterDescriptorArr[index].mo18830h(), typeParameterDescriptor.mo18830h())) {
                return this.f54815c[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: e */
    public final boolean mo20129e() {
        return this.f54815c.length == 0;
    }
}
