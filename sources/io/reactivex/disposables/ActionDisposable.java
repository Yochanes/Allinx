package io.reactivex.disposables;

import io.reactivex.functions.Action;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17603a(Object obj) {
        try {
            ((Action) obj).run();
        } catch (Throwable th) {
            throw ExceptionHelper.m17889c(th);
        }
    }
}
