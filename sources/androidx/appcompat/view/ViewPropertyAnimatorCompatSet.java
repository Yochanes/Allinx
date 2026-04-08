package androidx.appcompat.view;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ViewPropertyAnimatorCompatSet {

    /* JADX INFO: renamed from: c */
    public BaseInterpolator f720c;

    /* JADX INFO: renamed from: d */
    public ViewPropertyAnimatorListenerAdapter f721d;

    /* JADX INFO: renamed from: e */
    public boolean f722e;

    /* JADX INFO: renamed from: b */
    public long f719b = -1;

    /* JADX INFO: renamed from: f */
    public final ViewPropertyAnimatorListenerAdapter f723f = new C00881();

    /* JADX INFO: renamed from: a */
    public final ArrayList f718a = new ArrayList();

    /* JADX INFO: renamed from: androidx.appcompat.view.ViewPropertyAnimatorCompatSet$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C00881 extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f724a = false;

        /* JADX INFO: renamed from: b */
        public int f725b = 0;

        public C00881() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: a */
        public final void mo314a() {
            if (this.f724a) {
                return;
            }
            this.f724a = true;
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = ViewPropertyAnimatorCompatSet.this.f721d;
            if (viewPropertyAnimatorListenerAdapter != null) {
                viewPropertyAnimatorListenerAdapter.mo314a();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            int i = this.f725b + 1;
            this.f725b = i;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = ViewPropertyAnimatorCompatSet.this;
            if (i == viewPropertyAnimatorCompatSet.f718a.size()) {
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = viewPropertyAnimatorCompatSet.f721d;
                if (viewPropertyAnimatorListenerAdapter != null) {
                    viewPropertyAnimatorListenerAdapter.onAnimationEnd();
                }
                this.f725b = 0;
                this.f724a = false;
                viewPropertyAnimatorCompatSet.f722e = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m426a() {
        if (this.f722e) {
            Iterator it = this.f718a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).m7869b();
            }
            this.f722e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m427b() {
        View view;
        if (this.f722e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f718a) {
            long j = this.f719b;
            if (j >= 0) {
                viewPropertyAnimatorCompat.m7870c(j);
            }
            BaseInterpolator baseInterpolator = this.f720c;
            if (baseInterpolator != null && (view = (View) viewPropertyAnimatorCompat.f23433a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f721d != null) {
                viewPropertyAnimatorCompat.m7871d(this.f723f);
            }
            View view2 = (View) viewPropertyAnimatorCompat.f23433a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f722e = true;
    }
}
