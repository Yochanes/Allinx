package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ConstructorDescriptor extends FunctionDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    ConstructorDescriptor mo18887b(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    ClassifierDescriptorWithTypeParameters mo18828e();

    /* JADX INFO: renamed from: u */
    boolean mo18894u();

    /* JADX INFO: renamed from: v */
    ClassDescriptor mo18895v();
}
