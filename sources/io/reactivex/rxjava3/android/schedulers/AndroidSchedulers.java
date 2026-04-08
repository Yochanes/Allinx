package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSchedulers {

    /* JADX INFO: renamed from: a */
    public static final Scheduler f49348a;

    /* JADX INFO: compiled from: Proguard */
    public static final class MainHolder {

        /* JADX INFO: renamed from: a */
        public static final Scheduler f49349a;

        static {
            Looper mainLooper = Looper.getMainLooper();
            Scheduler scheduler = AndroidSchedulers.f49348a;
            f49349a = new HandlerScheduler(new Handler(mainLooper));
        }
    }

    static {
        try {
            Scheduler scheduler = (Scheduler) new CallableC5968a().call();
            if (scheduler == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f49348a = scheduler;
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Scheduler m17919a() {
        Scheduler scheduler = f49348a;
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("scheduler == null");
    }
}
