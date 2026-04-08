package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableHelper implements Disposable {

    /* JADX INFO: renamed from: a */
    public static final DisposableHelper f49380a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DisposableHelper[] f49381b;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        f49380a = disposableHelper;
        f49381b = new DisposableHelper[]{disposableHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17952a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = f49380a;
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
    public static boolean m17953b(Disposable disposable) {
        return disposable == f49380a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17954c(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == f49380a) {
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
    public static boolean m17955e(AtomicReference atomicReference, Disposable disposable) {
        Objects.requireNonNull(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == f49380a) {
                    return false;
                }
                RxJavaPlugins.m18275b(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17956f(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.m18275b(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        RxJavaPlugins.m18275b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f49381b.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }
}
