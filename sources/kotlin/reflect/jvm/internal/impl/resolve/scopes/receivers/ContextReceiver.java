package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    public final DeclarationDescriptorNonRootImpl f54479c;

    /* JADX INFO: renamed from: d */
    public final Name f54480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContextReceiver(CallableDescriptor callableDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.m18599g(receiverType, "receiverType");
        this.f54479c = (DeclarationDescriptorNonRootImpl) callableDescriptor;
        this.f54480d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    /* JADX INFO: renamed from: a */
    public final Name mo20007a() {
        return this.f54480d;
    }

    public final String toString() {
        return "Cxt { " + this.f54479c + " }";
    }
}
