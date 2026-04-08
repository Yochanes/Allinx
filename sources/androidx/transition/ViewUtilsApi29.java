package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.platform.AbstractC1311g;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19
    /* JADX INFO: renamed from: a */
    public final float mo12008a(View view) {
        return AbstractC1895a.m10596b(view);
    }

    @Override // androidx.transition.ViewUtilsApi19
    /* JADX INFO: renamed from: b */
    public final void mo12009b(View view, float f) {
        AbstractC1895a.m10608n(f, view);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsApi19
    /* JADX INFO: renamed from: c */
    public final void mo12010c(View view, int i) {
        AbstractC1895a.m10609o(i, view);
    }

    @Override // androidx.transition.ViewUtilsApi21
    /* JADX INFO: renamed from: d */
    public final void mo12013d(View view, Matrix matrix) {
        AbstractC1895a.m10611q(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21
    /* JADX INFO: renamed from: e */
    public final void mo12014e(View view, Matrix matrix) {
        AbstractC1311g.m6230g(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21
    /* JADX INFO: renamed from: f */
    public final void mo12015f(View view, Matrix matrix) {
        AbstractC1895a.m10618x(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22
    /* JADX INFO: renamed from: g */
    public final void mo12019g(View view, int i, int i2, int i3, int i4) {
        AbstractC1895a.m10610p(view, i, i2, i3, i4);
    }
}
