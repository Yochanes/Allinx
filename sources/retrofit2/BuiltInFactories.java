package retrofit2;

import android.annotation.TargetApi;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class BuiltInFactories {

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static final class Java8 extends BuiltInFactories {
        @Override // retrofit2.BuiltInFactories
        /* JADX INFO: renamed from: a */
        public final List mo21862a(Executor executor) {
            return Arrays.asList(new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(executor));
        }

        @Override // retrofit2.BuiltInFactories
        /* JADX INFO: renamed from: b */
        public final List mo21863b() {
            return Collections.singletonList(new OptionalConverterFactory());
        }
    }

    /* JADX INFO: renamed from: a */
    public List mo21862a(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    /* JADX INFO: renamed from: b */
    public List mo21863b() {
        return Collections.EMPTY_LIST;
    }
}
