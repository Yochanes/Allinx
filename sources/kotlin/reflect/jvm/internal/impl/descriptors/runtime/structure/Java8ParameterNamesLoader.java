package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
final class Java8ParameterNamesLoader {

    /* JADX INFO: renamed from: a */
    public static final Java8ParameterNamesLoader f52639a = new Java8ParameterNamesLoader();

    /* JADX INFO: renamed from: b */
    public static Cache f52640b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Cache {

        /* JADX INFO: renamed from: a */
        public final Method f52641a;

        /* JADX INFO: renamed from: b */
        public final Method f52642b;

        public Cache(Method method, Method method2) {
            this.f52641a = method;
            this.f52642b = method2;
        }
    }
}
