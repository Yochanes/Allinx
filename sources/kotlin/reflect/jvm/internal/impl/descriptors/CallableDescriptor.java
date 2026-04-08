package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    /* JADX INFO: compiled from: Proguard */
    public interface UserDataKey<V> {
    }

    /* JADX INFO: renamed from: Z */
    ReceiverParameterDescriptor mo18871Z();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    CallableDescriptor mo18872a();

    /* JADX INFO: renamed from: c0 */
    Object mo18873c0(UserDataKey userDataKey);

    /* JADX INFO: renamed from: f */
    List mo18874f();

    /* JADX INFO: renamed from: f0 */
    ReceiverParameterDescriptor mo18875f0();

    KotlinType getReturnType();

    List getTypeParameters();

    /* JADX INFO: renamed from: l0 */
    List mo18876l0();

    /* JADX INFO: renamed from: m */
    Collection mo18877m();

    /* JADX INFO: renamed from: z */
    boolean mo18878z();
}
