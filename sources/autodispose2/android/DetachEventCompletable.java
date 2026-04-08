package autodispose2.android;

import android.os.Looper;
import android.view.View;
import androidx.annotation.RestrictTo;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
final class DetachEventCompletable implements CompletableSource {
    @Override // io.reactivex.rxjava3.core.CompletableSource
    /* JADX INFO: renamed from: a */
    public final void mo12368a(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new Listener(completableObserver));
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw null;
            }
            completableObserver.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Listener extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final CompletableObserver f33231b;

        public Listener(CompletableObserver completableObserver) {
            this.f33231b = completableObserver;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        /* JADX INFO: renamed from: a */
        public final void mo12369a() {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.f49347a.get()) {
                return;
            }
            this.f33231b.onComplete();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
