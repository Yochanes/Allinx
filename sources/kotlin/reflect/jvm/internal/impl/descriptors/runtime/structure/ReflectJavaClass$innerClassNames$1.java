package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ReflectJavaClass$innerClassNames$1 extends Lambda implements Function1<Class<?>, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final ReflectJavaClass$innerClassNames$1 f52661a = new ReflectJavaClass$innerClassNames$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
    }
}
