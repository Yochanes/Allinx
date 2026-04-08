package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CardViewApi21Impl implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: a */
    public final void mo1956a(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.mo1953d();
        if (f == roundRectDrawable.f3606a) {
            return;
        }
        roundRectDrawable.f3606a = f;
        roundRectDrawable.m1971b(null);
        roundRectDrawable.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: b */
    public final float mo1957b(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.mo1954e().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: c */
    public final float mo1958c(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.mo1953d()).f3606a;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: d */
    public final void mo1959d(CardViewDelegate cardViewDelegate) {
        mo1969n(cardViewDelegate, mo1961f(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: e */
    public final void mo1960e(CardViewDelegate cardViewDelegate, float f) {
        cardViewDelegate.mo1954e().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: f */
    public final float mo1961f(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.mo1953d()).f3610e;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: g */
    public final ColorStateList mo1962g(CardViewDelegate cardViewDelegate) {
        return ((RoundRectDrawable) cardViewDelegate.mo1953d()).f3613h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: h */
    public final void mo1963h(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.mo1952c()) {
            cardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float f = ((RoundRectDrawable) cardViewDelegate.mo1953d()).f3610e;
        float f2 = ((RoundRectDrawable) cardViewDelegate.mo1953d()).f3606a;
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.m1972a(f, f2, cardViewDelegate.mo1951b()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.m1973b(f, f2, cardViewDelegate.mo1951b()));
        cardViewDelegate.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: i */
    public final float mo1964i(CardViewDelegate cardViewDelegate) {
        return mo1958c(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: j */
    public final float mo1965j(CardViewDelegate cardViewDelegate) {
        return mo1958c(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: k */
    public final void mo1966k(CardView.C04171 c04171, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c04171.m1955f(new RoundRectDrawable(f, colorStateList));
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo1969n(c04171, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: l */
    public final void mo1967l(CardViewDelegate cardViewDelegate) {
        mo1969n(cardViewDelegate, mo1961f(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: m */
    public final void mo1968m(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.mo1953d();
        if (colorStateList == null) {
            roundRectDrawable.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawable.f3613h = colorStateList;
        roundRectDrawable.f3607b.setColor(colorStateList.getColorForState(roundRectDrawable.getState(), roundRectDrawable.f3613h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: n */
    public final void mo1969n(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) cardViewDelegate.mo1953d();
        boolean zMo1952c = cardViewDelegate.mo1952c();
        boolean zMo1951b = cardViewDelegate.mo1951b();
        if (f != roundRectDrawable.f3610e || roundRectDrawable.f3611f != zMo1952c || roundRectDrawable.f3612g != zMo1951b) {
            roundRectDrawable.f3610e = f;
            roundRectDrawable.f3611f = zMo1952c;
            roundRectDrawable.f3612g = zMo1951b;
            roundRectDrawable.m1971b(null);
            roundRectDrawable.invalidateSelf();
        }
        mo1963h(cardViewDelegate);
    }
}
