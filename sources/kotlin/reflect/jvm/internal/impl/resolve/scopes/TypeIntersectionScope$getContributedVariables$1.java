package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class TypeIntersectionScope$getContributedVariables$1 extends Lambda implements Function1<PropertyDescriptor, CallableDescriptor> {

    /* JADX INFO: renamed from: a */
    public static final TypeIntersectionScope$getContributedVariables$1 f54474a = new TypeIntersectionScope$getContributedVariables$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PropertyDescriptor selectMostSpecificInEachOverridableGroup = (PropertyDescriptor) obj;
        Intrinsics.m18599g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
