package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: renamed from: b */
    public final Function f48354b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48355a;

        /* JADX INFO: renamed from: b */
        public final Function f48356b;

        /* JADX INFO: renamed from: c */
        public Disposable f48357c;

        public MapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f48355a = maybeObserver;
            this.f48356b = function;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48357c, disposable)) {
                this.f48357c = disposable;
                this.f48355a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48357c.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f48357c;
            this.f48357c = DisposableHelper.f47552a;
            disposable.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48355a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48355a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.f48355a;
            try {
                Object objApply = this.f48356b.apply(obj);
                ObjectHelper.m17628b(objApply, "The mapper returned a null item");
                maybeObserver.onSuccess(objApply);
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public MaybeMap(Maybe maybe, Function function) {
        super(maybe);
        this.f48354b = function;
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new MapMaybeObserver(maybeObserver, this.f48354b));
    }
}
