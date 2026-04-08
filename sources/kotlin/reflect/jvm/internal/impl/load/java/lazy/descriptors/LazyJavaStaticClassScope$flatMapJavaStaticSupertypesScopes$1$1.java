package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends Lambda implements Function1<KotlinType, ClassDescriptor> {

    /* JADX INFO: renamed from: a */
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 f53071a = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassifierDescriptor classifierDescriptorMo18838b = ((KotlinType) obj).mo19953I0().mo18838b();
        if (classifierDescriptorMo18838b instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo18838b;
        }
        return null;
    }
}
