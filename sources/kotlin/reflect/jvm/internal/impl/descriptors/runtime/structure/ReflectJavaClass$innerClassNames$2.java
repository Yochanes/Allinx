package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
final class ReflectJavaClass$innerClassNames$2 extends Lambda implements Function1<Class<?>, Name> {

    /* JADX INFO: renamed from: a */
    public static final ReflectJavaClass$innerClassNames$2 f52662a = new ReflectJavaClass$innerClassNames$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Name.m19606f(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.m19605e(simpleName);
        }
        return null;
    }
}
