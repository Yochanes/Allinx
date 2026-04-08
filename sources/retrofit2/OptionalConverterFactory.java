package retrofit2;

import android.annotation.TargetApi;
import com.google.android.gms.common.ConnectionResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
@IgnoreJRERequirement
public final class OptionalConverterFactory extends Converter.Factory {

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a */
        public final Converter f59346a;

        public OptionalConverter(Converter converter) {
            this.f59346a = converter;
        }

        @Override // retrofit2.Converter
        public final Object convert(Object obj) {
            return Optional.ofNullable(this.f59346a.convert((ResponseBody) obj));
        }
    }

    @Override // retrofit2.Converter.Factory
    /* JADX INFO: renamed from: b */
    public final Converter mo15318b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils.m21897e(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.m21888d(Utils.m21896d(0, (ParameterizedType) type), annotationArr));
    }
}
