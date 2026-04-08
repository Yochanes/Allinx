package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class TypeArgument {

    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor f55014a;

    /* JADX INFO: renamed from: b */
    public final KotlinType f55015b;

    /* JADX INFO: renamed from: c */
    public final KotlinType f55016c;

    public TypeArgument(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.m18599g(typeParameter, "typeParameter");
        Intrinsics.m18599g(inProjection, "inProjection");
        Intrinsics.m18599g(outProjection, "outProjection");
        this.f55014a = typeParameter;
        this.f55015b = inProjection;
        this.f55016c = outProjection;
    }
}
