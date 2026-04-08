package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1 extends Lambda implements Function1<SimpleFunctionDescriptor, CallableDescriptor> {

    /* JADX INFO: renamed from: a */
    public static final LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1 f53063a = new LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj;
        Intrinsics.m18599g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
