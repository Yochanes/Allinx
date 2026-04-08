package retrofit2;

import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DefaultMethodSupport {

    /* JADX INFO: renamed from: a */
    public static Constructor f59307a;

    /* JADX INFO: renamed from: a */
    public static Object m21864a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f59307a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC5852a.m16776j().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f59307a = declaredConstructor;
        }
        return AbstractC6428b.m21908a(AbstractC5852a.m16780n(AbstractC5852a.m16781o(AbstractC5852a.m16782p(declaredConstructor.newInstance(cls, -1)), method, cls), obj), objArr);
    }
}
