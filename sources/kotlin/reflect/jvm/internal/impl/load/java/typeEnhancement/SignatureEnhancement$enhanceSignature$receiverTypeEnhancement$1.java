package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {

    /* JADX INFO: renamed from: a */
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 f53176a = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        ReceiverParameterDescriptor receiverParameterDescriptorMo18875f0 = it.mo18875f0();
        Intrinsics.m18596d(receiverParameterDescriptorMo18875f0);
        KotlinType type = receiverParameterDescriptorMo18875f0.getType();
        Intrinsics.m18598f(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
