package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class TypeIntersectionScope$getContributedDescriptors$2 extends Lambda implements Function1<CallableDescriptor, CallableDescriptor> {

    /* JADX INFO: renamed from: a */
    public static final TypeIntersectionScope$getContributedDescriptors$2 f54472a = new TypeIntersectionScope$getContributedDescriptors$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableDescriptor selectMostSpecificInEachOverridableGroup = (CallableDescriptor) obj;
        Intrinsics.m18599g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
