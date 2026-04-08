package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.CallAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a */
    public final Executor f59300a;

    /* JADX INFO: renamed from: retrofit2.DefaultCallAdapterFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    class C64201 implements CallAdapter<Object, Call<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f59301a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f59302b;

        public C64201(Type type, Executor executor) {
            this.f59301a = type;
            this.f59302b = executor;
        }

        @Override // retrofit2.CallAdapter
        public final Object adapt(Call call) {
            Executor executor = this.f59302b;
            return executor == null ? call : new ExecutorCallbackCall(executor, call);
        }

        @Override // retrofit2.CallAdapter
        public final Type responseType() {
            return this.f59301a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ExecutorCallbackCall<T> implements Call<T> {

        /* JADX INFO: renamed from: a */
        public final Executor f59303a;

        /* JADX INFO: renamed from: b */
        public final Call f59304b;

        /* JADX INFO: renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1 */
        /* JADX INFO: compiled from: Proguard */
        class C64211 implements Callback<Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callback f59305a;

            public C64211(Callback callback) {
                this.f59305a = callback;
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call call, Throwable th) {
                ExecutorCallbackCall.this.f59303a.execute(new RunnableC6427a(this, this.f59305a, th, 1));
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call call, Response response) {
                ExecutorCallbackCall.this.f59303a.execute(new RunnableC6427a(this, this.f59305a, response, 0));
            }
        }

        public ExecutorCallbackCall(Executor executor, Call call) {
            this.f59303a = executor;
            this.f59304b = call;
        }

        @Override // retrofit2.Call
        public final void cancel() {
            this.f59304b.cancel();
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return mo22754clone();
        }

        @Override // retrofit2.Call
        public final void enqueue(Callback callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.f59304b.enqueue(new C64211(callback));
        }

        @Override // retrofit2.Call
        public final boolean isCanceled() {
            return this.f59304b.isCanceled();
        }

        @Override // retrofit2.Call
        public final boolean isExecuted() {
            return this.f59304b.isExecuted();
        }

        @Override // retrofit2.Call
        public final Request request() {
            return this.f59304b.request();
        }

        @Override // retrofit2.Call
        public final Timeout timeout() {
            return this.f59304b.timeout();
        }

        @Override // retrofit2.Call
        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final Call mo22754clone() {
            return new ExecutorCallbackCall(this.f59303a, this.f59304b.mo22754clone());
        }
    }

    public DefaultCallAdapterFactory(Executor executor) {
        this.f59300a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C64201(Utils.m21896d(0, (ParameterizedType) type), Utils.m21900h(annotationArr, SkipCallbackExecutor.class) ? null : this.f59300a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
