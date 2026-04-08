package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface VariableDescriptor extends ValueDescriptor {
    /* JADX INFO: renamed from: R */
    ConstantValue mo18981R();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    VariableDescriptor mo18887b(TypeSubstitutor typeSubstitutor);

    /* JADX INFO: renamed from: d0 */
    boolean mo18982d0();

    boolean isConst();

    /* JADX INFO: renamed from: m0 */
    boolean mo18983m0();
}
