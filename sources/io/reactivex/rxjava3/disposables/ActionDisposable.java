package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17941a(Object obj) {
        try {
            ((Action) obj).run();
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "ActionDisposable(disposed=" + mo12353d() + ", " + get() + ")";
    }
}
