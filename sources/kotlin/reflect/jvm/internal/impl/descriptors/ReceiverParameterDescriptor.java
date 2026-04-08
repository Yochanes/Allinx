package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    AbstractReceiverParameterDescriptor mo18887b(TypeSubstitutor typeSubstitutor);

    ReceiverValue getValue();
}
