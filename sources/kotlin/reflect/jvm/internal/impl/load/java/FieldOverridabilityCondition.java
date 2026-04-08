package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: a */
    public final ExternalOverridabilityCondition.Contract mo19186a() {
        return ExternalOverridabilityCondition.Contract.f54331c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /* JADX INFO: renamed from: b */
    public final ExternalOverridabilityCondition.Result mo19187b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.m18599g(superDescriptor, "superDescriptor");
        Intrinsics.m18599g(subDescriptor, "subDescriptor");
        boolean z2 = subDescriptor instanceof PropertyDescriptor;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.f54335c;
        if (!z2 || !(superDescriptor instanceof PropertyDescriptor)) {
            return result;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
        return !Intrinsics.m18594b(propertyDescriptor.getName(), propertyDescriptor2.getName()) ? result : (JavaDescriptorUtilKt.m19243a(propertyDescriptor) && JavaDescriptorUtilKt.m19243a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.f54333a : (JavaDescriptorUtilKt.m19243a(propertyDescriptor) || JavaDescriptorUtilKt.m19243a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.f54334b : result;
    }
}
