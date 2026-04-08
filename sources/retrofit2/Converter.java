package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Converter<F, T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Factory {
        /* JADX INFO: renamed from: a */
        public Converter mo15317a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public Converter mo15318b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    Object convert(Object obj);
}
