package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    PropertyDescriptor mo18872a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    PropertyDescriptor mo18887b(TypeSubstitutor typeSubstitutor);

    /* JADX INFO: renamed from: d */
    PropertySetterDescriptor mo18965d();

    /* JADX INFO: renamed from: g0 */
    FieldDescriptor mo18966g0();

    PropertyGetterDescriptorImpl getGetter();

    /* JADX INFO: renamed from: k0 */
    FieldDescriptor mo18967k0();

    /* JADX INFO: renamed from: s */
    ArrayList mo18968s();
}
