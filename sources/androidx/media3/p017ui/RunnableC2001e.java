package androidx.media3.p017ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.exchange.allin.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.media3.ui.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2001e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayerControlViewLayoutManager f30151b;

    public /* synthetic */ RunnableC2001e(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i) {
        this.f30150a = i;
        this.f30151b = playerControlViewLayoutManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f30150a) {
            case 0:
                this.f30151b.m11155k();
                break;
            case 1:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f30151b;
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f29987e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(playerControlViewLayoutManager.f29980A ? 0 : 4);
                }
                View view = playerControlViewLayoutManager.f29992j;
                if (view != null) {
                    int dimensionPixelSize = playerControlViewLayoutManager.f29983a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (playerControlViewLayoutManager.f29980A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        boolean z2 = playerControlViewLayoutManager.f29980A;
                        Rect rect = defaultTimeBar.f29843a;
                        if (z2) {
                            ValueAnimator valueAnimator = defaultTimeBar.f29832J;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.f29834L = true;
                            defaultTimeBar.f29833K = 0.0f;
                            defaultTimeBar.invalidate(rect);
                        } else {
                            int i = playerControlViewLayoutManager.f30008z;
                            if (i == 1) {
                                ValueAnimator valueAnimator2 = defaultTimeBar.f29832J;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                defaultTimeBar.f29834L = false;
                                defaultTimeBar.f29833K = 0.0f;
                                defaultTimeBar.invalidate(rect);
                            } else if (i != 3) {
                                ValueAnimator valueAnimator3 = defaultTimeBar.f29832J;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                defaultTimeBar.f29834L = false;
                                defaultTimeBar.f29833K = 1.0f;
                                defaultTimeBar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : playerControlViewLayoutManager.f30007y) {
                    view2.setVisibility((playerControlViewLayoutManager.f29980A && PlayerControlViewLayoutManager.m11147j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager2 = this.f30151b;
                ViewGroup viewGroup3 = playerControlViewLayoutManager2.f29988f;
                if (viewGroup3 != null && (viewGroup = playerControlViewLayoutManager2.f29989g) != null) {
                    PlayerControlView playerControlView = playerControlViewLayoutManager2.f29983a;
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (true) {
                        if (viewGroup.getChildCount() <= 1) {
                            View view3 = playerControlViewLayoutManager2.f29993k;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iM11145c = PlayerControlViewLayoutManager.m11145c(playerControlViewLayoutManager2.f29991i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                iM11145c += PlayerControlViewLayoutManager.m11145c(viewGroup3.getChildAt(i2));
                            }
                            if (iM11145c <= width) {
                                ViewGroup viewGroup4 = playerControlViewLayoutManager2.f29990h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
                                    ValueAnimator valueAnimator4 = playerControlViewLayoutManager2.f30000r;
                                    if (!valueAnimator4.isStarted()) {
                                        playerControlViewLayoutManager2.f29999q.cancel();
                                        valueAnimator4.start();
                                    }
                                    break;
                                }
                            } else {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iM11145c += PlayerControlViewLayoutManager.m11145c(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup3.getChildAt(i3);
                                    iM11145c -= PlayerControlViewLayoutManager.m11145c(childAt);
                                    arrayList.add(childAt);
                                    if (iM11145c <= width) {
                                        if (arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                                viewGroup.addView((View) arrayList.get(i4), viewGroup.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (arrayList.isEmpty()) {
                                }
                            }
                        } else {
                            int childCount2 = viewGroup.getChildCount() - 2;
                            View childAt2 = viewGroup.getChildAt(childCount2);
                            viewGroup.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f30151b.f29996n.start();
                break;
            case 4:
                this.f30151b.f29995m.start();
                break;
            case 5:
                PlayerControlViewLayoutManager playerControlViewLayoutManager3 = this.f30151b;
                playerControlViewLayoutManager3.f29994l.start();
                playerControlViewLayoutManager3.m11150e(playerControlViewLayoutManager3.f30003u, 2000L);
                break;
            default:
                this.f30151b.m11154i(2);
                break;
        }
    }
}
