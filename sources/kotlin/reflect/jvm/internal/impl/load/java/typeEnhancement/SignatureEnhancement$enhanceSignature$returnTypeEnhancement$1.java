package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {

    /* JADX INFO: renamed from: a */
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 f53177a = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.m18596d(returnType);
        return returnType;
    }
}
