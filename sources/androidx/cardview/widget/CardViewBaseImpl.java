package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class CardViewBaseImpl implements CardViewImpl {

    /* JADX INFO: renamed from: androidx.cardview.widget.CardViewBaseImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C04191 implements RoundRectDrawableWithShadow.RoundRectHelper {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: a */
    public final void mo1956a(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        if (f < 0.0f) {
            roundRectDrawableWithShadow.getClass();
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (roundRectDrawableWithShadow.f3623f != f2) {
            roundRectDrawableWithShadow.f3623f = f2;
            roundRectDrawableWithShadow.f3629l = true;
            roundRectDrawableWithShadow.invalidateSelf();
        }
        mo1963h(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: b */
    public final float mo1957b(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.mo1953d()).f3627j;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: c */
    public final float mo1958c(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.mo1953d()).f3623f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: e */
    public final void mo1960e(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        roundRectDrawableWithShadow.m1974c(f, roundRectDrawableWithShadow.f3625h);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: f */
    public final float mo1961f(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.mo1953d()).f3625h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: g */
    public final ColorStateList mo1962g(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawableWithShadow) cardViewDelegate.mo1953d()).f3628k;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: h */
    public final void mo1963h(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        ((RoundRectDrawableWithShadow) cardViewDelegate.mo1953d()).getPadding(rect);
        cardViewDelegate.mo1950a((int) Math.ceil(mo1965j(cardViewDelegate)), (int) Math.ceil(mo1964i(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: i */
    public final float mo1964i(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        float f = roundRectDrawableWithShadow.f3625h;
        float f2 = roundRectDrawableWithShadow.f3623f;
        float f3 = roundRectDrawableWithShadow.f3618a;
        return (((roundRectDrawableWithShadow.f3625h * 1.5f) + f3) * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + f2 + f3) * 2.0f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: j */
    public final float mo1965j(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        float f = roundRectDrawableWithShadow.f3625h;
        float f2 = roundRectDrawableWithShadow.f3623f;
        float f3 = roundRectDrawableWithShadow.f3618a;
        return ((roundRectDrawableWithShadow.f3625h + f3) * 2.0f) + (Math.max(f, (f / 2.0f) + f2 + f3) * 2.0f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: k */
    public final void mo1966k(CardView.C04171 c04171, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f, f2, f3);
        roundRectDrawableWithShadow.f3632o = CardView.this.getPreventCornerOverlap();
        roundRectDrawableWithShadow.invalidateSelf();
        c04171.m1955f(roundRectDrawableWithShadow);
        mo1963h(c04171);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: l */
    public final void mo1967l(CardViewDelegate cardViewDelegate) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        roundRectDrawableWithShadow.f3632o = cardViewDelegate.mo1951b();
        roundRectDrawableWithShadow.invalidateSelf();
        mo1963h(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: m */
    public final void mo1968m(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        if (colorStateList == null) {
            roundRectDrawableWithShadow.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawableWithShadow.f3628k = colorStateList;
        roundRectDrawableWithShadow.f3619b.setColor(colorStateList.getColorForState(roundRectDrawableWithShadow.getState(), roundRectDrawableWithShadow.f3628k.getDefaultColor()));
        roundRectDrawableWithShadow.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: n */
    public final void mo1969n(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow = (RoundRectDrawableWithShadow) cardViewDelegate.mo1953d();
        roundRectDrawableWithShadow.m1974c(roundRectDrawableWithShadow.f3627j, f);
        mo1963h(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: d */
    public final void mo1959d(CardViewDelegate cardViewDelegate) {
    }
}
