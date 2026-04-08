package androidx.media3.p017ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.media3.ui.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2002f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30153b;

    public /* synthetic */ C2002f(Object obj, int i) {
        this.f30152a = i;
        this.f30153b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f30153b;
        switch (this.f30152a) {
            case 0:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = playerControlViewLayoutManager.f29984b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = playerControlViewLayoutManager.f29985c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f29987e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                break;
            case 1:
                PlayerControlViewLayoutManager playerControlViewLayoutManager2 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager2.getClass();
                playerControlViewLayoutManager2.m11148a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager3 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager3.getClass();
                playerControlViewLayoutManager3.m11148a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                PlayerControlViewLayoutManager playerControlViewLayoutManager4 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = playerControlViewLayoutManager4.f29984b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager4.f29985c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = playerControlViewLayoutManager4.f29987e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                }
                break;
            default:
                int i = DefaultTimeBar.f29822U;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                defaultTimeBar.getClass();
                defaultTimeBar.f29833K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f29843a);
                break;
        }
    }
}
