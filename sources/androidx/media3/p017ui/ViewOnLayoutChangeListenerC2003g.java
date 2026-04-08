package androidx.media3.p017ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.media3.ui.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC2003g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30155b;

    public /* synthetic */ ViewOnLayoutChangeListenerC2003g(Object obj, int i) {
        this.f30154a = i;
        this.f30155b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        Object obj = this.f30155b;
        switch (this.f30154a) {
            case 0:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                PlayerControlView playerControlView = playerControlViewLayoutManager.f29983a;
                int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
                ViewGroup viewGroup = playerControlViewLayoutManager.f29985c;
                int iM11145c = PlayerControlViewLayoutManager.m11145c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iM11145c, PlayerControlViewLayoutManager.m11145c(playerControlViewLayoutManager.f29991i) + PlayerControlViewLayoutManager.m11145c(playerControlViewLayoutManager.f29993k));
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f29986d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z2 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (playerControlViewLayoutManager.f29980A != z2) {
                    playerControlViewLayoutManager.f29980A = z2;
                    view.post(new RunnableC2001e(playerControlViewLayoutManager, 1));
                }
                boolean z3 = i3 - i != i7 - i5;
                if (!playerControlViewLayoutManager.f29980A && z3) {
                    view.post(new RunnableC2001e(playerControlViewLayoutManager, 2));
                    break;
                }
                break;
            default:
                float[] fArr = PlayerControlView.f29880G0;
                PlayerControlView playerControlView2 = (PlayerControlView) obj;
                playerControlView2.getClass();
                int i9 = i4 - i2;
                int i10 = i8 - i6;
                if (i3 - i != i7 - i5 || i9 != i10) {
                    PopupWindow popupWindow = playerControlView2.f29935p;
                    if (popupWindow.isShowing()) {
                        playerControlView2.m11132p();
                        int width2 = playerControlView2.getWidth() - popupWindow.getWidth();
                        int i11 = playerControlView2.f29937q;
                        popupWindow.update(view, width2 - i11, (-popupWindow.getHeight()) - i11, -1, -1);
                    }
                }
                break;
        }
    }
}
