package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    /* JADX INFO: compiled from: Proguard */
    public interface CopyBuilder<D extends FunctionDescriptor> {
        /* JADX INFO: renamed from: a */
        CopyBuilder mo18926a(List list);

        /* JADX INFO: renamed from: b */
        CopyBuilder mo18927b(ClassConstructorDescriptor classConstructorDescriptor);

        FunctionDescriptor build();

        /* JADX INFO: renamed from: c */
        CopyBuilder mo18928c(Modality modality);

        /* JADX INFO: renamed from: d */
        CopyBuilder mo18929d(ReceiverParameterDescriptor receiverParameterDescriptor);

        /* JADX INFO: renamed from: e */
        CopyBuilder mo18930e();

        /* JADX INFO: renamed from: f */
        CopyBuilder mo18931f(KotlinType kotlinType);

        /* JADX INFO: renamed from: g */
        CopyBuilder mo18932g();

        /* JADX INFO: renamed from: h */
        CopyBuilder mo18933h();

        /* JADX INFO: renamed from: i */
        CopyBuilder mo18934i();

        /* JADX INFO: renamed from: j */
        CopyBuilder mo18935j(TypeSubstitution typeSubstitution);

        /* JADX INFO: renamed from: k */
        CopyBuilder mo18936k(DescriptorVisibility descriptorVisibility);

        /* JADX INFO: renamed from: l */
        CopyBuilder mo18937l();

        /* JADX INFO: renamed from: m */
        CopyBuilder mo18938m();

        /* JADX INFO: renamed from: n */
        CopyBuilder mo18939n(CallableMemberDescriptor.Kind kind);

        /* JADX INFO: renamed from: o */
        CopyBuilder mo18940o(Annotations annotations);

        /* JADX INFO: renamed from: p */
        CopyBuilder mo18941p(ClassDescriptor classDescriptor);

        /* JADX INFO: renamed from: q */
        CopyBuilder mo18942q(Name name);

        /* JADX INFO: renamed from: r */
        CopyBuilder mo18943r();
    }

    /* JADX INFO: renamed from: K */
    boolean mo18848K();

    /* JADX INFO: renamed from: X */
    FunctionDescriptor mo18922X();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    FunctionDescriptor mo18872a();

    /* JADX INFO: renamed from: b */
    FunctionDescriptor mo18887b(TypeSubstitutor typeSubstitutor);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* JADX INFO: renamed from: q0 */
    boolean mo18923q0();

    /* JADX INFO: renamed from: w0 */
    boolean mo18924w0();

    /* JADX INFO: renamed from: x0 */
    CopyBuilder mo18925x0();
}
