package retrofit2;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class Reflection {

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    @IgnoreJRERequirement
    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        /* JADX INFO: renamed from: b */
        public final Object mo21875b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return DefaultMethodSupport.m21864a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // retrofit2.Reflection
        /* JADX INFO: renamed from: c */
        public final boolean mo21876c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        /* JADX INFO: renamed from: a */
        public final String mo21874a(Method method, int i) {
            Parameter parameter = AbstractC6428b.m21911d(method)[i];
            if (!AbstractC6428b.m21910c(parameter)) {
                return super.mo21874a(method, i);
            }
            return "parameter '" + AbstractC6428b.m21909b(parameter) + '\'';
        }

        @Override // retrofit2.Reflection
        /* JADX INFO: renamed from: b */
        public final Object mo21875b(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.m21864a(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        /* JADX INFO: renamed from: c */
        public final boolean mo21876c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: renamed from: a */
    public String mo21874a(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: b */
    public Object mo21875b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo21876c(Method method) {
        return false;
    }
}
