package kotlin.jvm.internal;

import java.util.Objects;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(KClass kClass, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kClass).mo18585f(), str, str2, !Objects.nonNull(kClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }
}
