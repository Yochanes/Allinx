package io.reactivex.rxjava3.internal.operators.completable;

import autodispose2.C2351a;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDefer extends Completable {

    /* JADX INFO: renamed from: a */
    public final C2351a f49516a;

    public CompletableDefer(C2351a c2351a) {
        this.f49516a = c2351a;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        try {
            ((CompletableSource) this.f49516a.get()).mo12368a(completableObserver);
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17958b(th, completableObserver);
        }
    }
}
