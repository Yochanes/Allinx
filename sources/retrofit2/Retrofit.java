package retrofit2;

import java.io.EOFException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Retrofit {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f59453a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Call.Factory f59454b;

    /* JADX INFO: renamed from: c */
    public final HttpUrl f59455c;

    /* JADX INFO: renamed from: d */
    public final List f59456d;

    /* JADX INFO: renamed from: e */
    public final List f59457e;

    /* JADX INFO: renamed from: f */
    public final Executor f59458f;

    /* JADX INFO: renamed from: retrofit2.Retrofit$1 */
    /* JADX INFO: compiled from: Proguard */
    class C64261 implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Object[] f59459a = new Object[0];

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f59460b;

        public C64261(Class cls) {
            this.f59460b = cls;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        
            r1 = retrofit2.ServiceMethod.m21892b(r0, r2, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r0.f59453a.put(r6, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
        
            r6 = (retrofit2.ServiceMethod) r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            ServiceMethod serviceMethodM21892b;
            ServiceMethod serviceMethod;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f59459a;
            }
            Reflection reflection = Platform.f59395b;
            boolean zMo21876c = reflection.mo21876c(method);
            Class cls = this.f59460b;
            if (zMo21876c) {
                return reflection.mo21875b(method, cls, obj, objArr);
            }
            Retrofit retrofit = Retrofit.this;
            while (true) {
                Object objPutIfAbsent = retrofit.f59453a.get(method);
                if (objPutIfAbsent instanceof ServiceMethod) {
                    serviceMethodM21892b = (ServiceMethod) objPutIfAbsent;
                    break;
                }
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        try {
                            objPutIfAbsent = retrofit.f59453a.putIfAbsent(method, obj2);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        Object obj3 = retrofit.f59453a.get(method);
                                        if (obj3 != null) {
                                            break;
                                        }
                                    } finally {
                                    }
                                }
                                serviceMethodM21892b = serviceMethod;
                                break;
                            }
                            try {
                                break;
                            } catch (Throwable th) {
                                retrofit.f59453a.remove(method);
                                throw th;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                }
            }
            return serviceMethodM21892b.mo21865a(obj, objArr);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public OkHttpClient f59462a;

        /* JADX INFO: renamed from: b */
        public HttpUrl f59463b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f59464c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f59465d = new ArrayList();

        /* JADX INFO: renamed from: a */
        public final void m21890a(String str) throws EOFException {
            Objects.requireNonNull(str, "baseUrl == null");
            HttpUrl httpUrlM21276c = HttpUrl.Companion.m21276c(str);
            if ("".equals(httpUrlM21276c.f57114f.get(r0.size() - 1))) {
                this.f59463b = httpUrlM21276c;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlM21276c);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Retrofit m21891b() {
            if (this.f59463b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            OkHttpClient okHttpClient = this.f59462a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            OkHttpClient okHttpClient2 = okHttpClient;
            Executor executor = Platform.f59394a;
            BuiltInFactories builtInFactories = Platform.f59396c;
            ArrayList arrayList = new ArrayList(this.f59465d);
            List listMo21862a = builtInFactories.mo21862a(executor);
            arrayList.addAll(listMo21862a);
            List listMo21863b = builtInFactories.mo21863b();
            int size = listMo21863b.size();
            ArrayList arrayList2 = this.f59464c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new BuiltInConverters());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(listMo21863b);
            HttpUrl httpUrl = this.f59463b;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listMo21862a.size();
            return new Retrofit(okHttpClient2, httpUrl, listUnmodifiableList, listUnmodifiableList2, executor);
        }
    }

    public Retrofit(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.f59454b = factory;
        this.f59455c = httpUrl;
        this.f59456d = list;
        this.f59457e = list2;
        this.f59458f = executor;
    }

    /* JADX INFO: renamed from: a */
    public final CallAdapter m21885a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f59457e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter callAdapter = ((CallAdapter.Factory) list.get(i)).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((CallAdapter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Object m21886b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C64261(cls));
    }

    /* JADX INFO: renamed from: c */
    public final Converter m21887c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f59456d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterMo15317a = ((Converter.Factory) list.get(i)).mo15317a(type, annotationArr, annotationArr2, this);
            if (converterMo15317a != null) {
                return converterMo15317a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public final Converter m21888d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f59456d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterMo15318b = ((Converter.Factory) list.get(i)).mo15318b(type, annotationArr, this);
            if (converterMo15318b != null) {
                return converterMo15318b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m21889e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f59456d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Converter.Factory) list.get(i)).getClass();
        }
    }
}
