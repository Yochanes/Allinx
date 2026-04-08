package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor f54477c;

    /* JADX INFO: renamed from: d */
    public final Name f54478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name) {
        super(receiverType, null);
        Intrinsics.m18599g(receiverType, "receiverType");
        this.f54477c = classDescriptor;
        this.f54478d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    /* JADX INFO: renamed from: a */
    public final Name mo20007a() {
        return this.f54478d;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.f54477c + " }";
    }
}
