package autodispose2;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AtomicThrowable extends AtomicReference<Throwable> {
    /* JADX INFO: renamed from: a */
    public final boolean m12350a(Throwable th) {
        Throwable th2 = ExceptionHelper.f33229a;
        while (true) {
            Throwable th3 = get();
            if (th3 == ExceptionHelper.f33229a) {
                return false;
            }
            Throwable compositeException = th3 == null ? th : new CompositeException(th3, th);
            while (!compareAndSet(th3, compositeException)) {
                if (get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m12351b() {
        Throwable th = ExceptionHelper.f33229a;
        Throwable th2 = get();
        Throwable th3 = ExceptionHelper.f33229a;
        return th2 != th3 ? getAndSet(th3) : th2;
    }
}
