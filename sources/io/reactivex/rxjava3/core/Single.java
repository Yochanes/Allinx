package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Single<T> implements SingleSource<T> {
    @Override // io.reactivex.rxjava3.core.SingleSource
    /* JADX INFO: renamed from: a */
    public final void mo17939a(SingleObserver singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        try {
            mo12362d(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m17940b() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver(1);
        mo17939a(blockingMultiObserver);
        if (blockingMultiObserver.getCount() != 0) {
            try {
                blockingMultiObserver.await();
            } catch (InterruptedException e) {
                blockingMultiObserver.f49477d = true;
                Disposable disposable = blockingMultiObserver.f49476c;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ExceptionHelper.m18251f(e);
            }
        }
        Throwable th = blockingMultiObserver.f49475b;
        if (th == null) {
            return blockingMultiObserver.f49474a;
        }
        throw ExceptionHelper.m18251f(th);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo12362d(SingleObserver singleObserver);
}
