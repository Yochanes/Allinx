package autodispose2;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposeEndConsumerHelper {
    /* JADX INFO: renamed from: a */
    public static boolean m12358a(AtomicReference atomicReference, Disposable disposable, Class cls) {
        if (disposable == null) {
            throw new NullPointerException("next is null");
        }
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == AutoDisposableHelper.f33195a) {
                    return false;
                }
                String name = cls.getName();
                RxJavaPlugins.m18275b(new ProtocolViolationException(AbstractC0000a.m15l("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
                return false;
            }
        }
        return true;
    }
}
