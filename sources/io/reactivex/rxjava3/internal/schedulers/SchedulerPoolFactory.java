package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SchedulerPoolFactory {

    /* JADX INFO: renamed from: a */
    public static final boolean f51142a;

    /* JADX INFO: compiled from: Proguard */
    public static final class SystemPropertyAccessor implements Function<String, String> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return System.getProperty((String) obj);
        }
    }

    static {
        boolean zEquals = true;
        try {
            String str = (String) new SystemPropertyAccessor().apply("rx3.purge-enabled");
            if (str != null) {
                zEquals = "true".equals(str);
            }
        } catch (Throwable th) {
            Exceptions.m17950a(th);
        }
        f51142a = zEquals;
    }
}
