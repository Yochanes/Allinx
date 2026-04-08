package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6174xd7e650be extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallableDescriptor f54325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallableDescriptor f54326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6174xd7e650be(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.f54325a = callableDescriptor;
        this.f54326b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.m18594b((DeclarationDescriptor) obj, this.f54325a) && Intrinsics.m18594b((DeclarationDescriptor) obj2, this.f54326b));
    }
}
