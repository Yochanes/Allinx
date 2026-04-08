package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DescriptorUtilsKt$parentsWithSelf$1 extends Lambda implements Function1<DeclarationDescriptor, DeclarationDescriptor> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorUtilsKt$parentsWithSelf$1 f54393a = new DescriptorUtilsKt$parentsWithSelf$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo18828e();
    }
}
