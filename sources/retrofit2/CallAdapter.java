package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CallAdapter<R, T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Factory {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.m21896d(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return Utils.m21897e(type);
        }

        public abstract CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    Object adapt(Call call);

    Type responseType();
}
