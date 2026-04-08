package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableHelper implements Disposable {

    /* JADX INFO: renamed from: a */
    public static final DisposableHelper f47552a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DisposableHelper[] f47553b;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        f47552a = disposableHelper;
        f47553b = new DisposableHelper[]{disposableHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17615a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = f47552a;
        if (disposable2 == disposableHelper || (disposable = (Disposable) atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable.dispose();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17616b(Disposable disposable) {
        return disposable == f47552a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17617c(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == f47552a) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(disposable2, disposable)) {
                if (atomicReference.get() != disposable2) {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17618e(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == f47552a) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(disposable2, disposable)) {
                if (atomicReference.get() != disposable2) {
                    break;
                }
            }
            if (disposable2 == null) {
                return true;
            }
            disposable2.dispose();
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17619f(AtomicReference atomicReference, Disposable disposable) {
        ObjectHelper.m17628b(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == f47552a) {
                    return false;
                }
                RxJavaPlugins.m17911b(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17620h(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.m17911b(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        RxJavaPlugins.m17911b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f47553b.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
