package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    /* JADX INFO: renamed from: B0 */
    List mo18888B0();

    /* JADX INFO: renamed from: C */
    Collection mo18819C();

    /* JADX INFO: renamed from: D */
    boolean mo18820D();

    /* JADX INFO: renamed from: E0 */
    boolean mo18822E0();

    /* JADX INFO: renamed from: F0 */
    ReceiverParameterDescriptor mo18889F0();

    /* JADX INFO: renamed from: L */
    ClassConstructorDescriptor mo18825L();

    /* JADX INFO: renamed from: M */
    MemberScope mo18826M();

    /* JADX INFO: renamed from: P */
    ClassDescriptor mo18827P();

    /* JADX INFO: renamed from: U */
    MemberScope mo18890U(TypeSubstitution typeSubstitution);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    ClassDescriptor mo18872a();

    ClassKind getKind();

    DescriptorVisibility getVisibility();

    /* JADX INFO: renamed from: i */
    Modality mo18831i();

    boolean isInline();

    /* JADX INFO: renamed from: j */
    Collection mo18832j();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    /* JADX INFO: renamed from: q */
    SimpleType mo18885q();

    /* JADX INFO: renamed from: r */
    List mo18833r();

    /* JADX INFO: renamed from: s0 */
    MemberScope mo18891s0();

    /* JADX INFO: renamed from: t */
    boolean mo18834t();

    /* JADX INFO: renamed from: t0 */
    ValueClassRepresentation mo18835t0();

    /* JADX INFO: renamed from: w */
    boolean mo18836w();

    /* JADX INFO: renamed from: y0 */
    MemberScope mo18892y0();
}
