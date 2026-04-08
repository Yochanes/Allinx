package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f23388a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f23389b;

    /* JADX INFO: renamed from: c */
    public final Runnable f23390c;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.f23388a = view;
        this.f23389b = view.getViewTreeObserver();
        this.f23390c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m7759a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f23389b.isAlive();
        View view = this.f23388a;
        if (zIsAlive) {
            this.f23389b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f23390c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f23389b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f23389b.isAlive();
        View view2 = this.f23388a;
        if (zIsAlive) {
            this.f23389b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
