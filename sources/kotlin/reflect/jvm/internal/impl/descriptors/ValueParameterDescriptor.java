package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: O */
    ValueParameterDescriptor mo18976O(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i);

    /* JADX INFO: renamed from: S */
    boolean mo18977S();

    /* JADX INFO: renamed from: V */
    boolean mo18978V();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    ValueParameterDescriptor mo18872a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    CallableDescriptor mo18828e();

    /* JADX INFO: renamed from: e0 */
    KotlinType mo18979e0();

    int getIndex();

    /* JADX INFO: renamed from: o0 */
    boolean mo18980o0();
}
