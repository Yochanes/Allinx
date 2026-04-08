package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ClassConstructorDescriptor extends ConstructorDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    ClassConstructorDescriptor mo18872a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    ClassConstructorDescriptor mo18887b(TypeSubstitutor typeSubstitutor);
}
