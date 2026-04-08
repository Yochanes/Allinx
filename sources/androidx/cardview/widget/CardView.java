package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL = new CardViewApi21Impl();
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C04171 implements CardViewDelegate {

        /* JADX INFO: renamed from: a */
        public Drawable f3604a;

        public C04171() {
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* JADX INFO: renamed from: a */
        public final void mo1950a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.mUserSetMinWidth) {
                CardView.access$101(cardView, i);
            }
            if (i2 > cardView.mUserSetMinHeight) {
                CardView.access$201(cardView, i2);
            }
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* JADX INFO: renamed from: b */
        public final boolean mo1951b() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* JADX INFO: renamed from: c */
        public final boolean mo1952c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* JADX INFO: renamed from: d */
        public final Drawable mo1953d() {
            return this.f3604a;
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* JADX INFO: renamed from: e */
        public final CardView mo1954e() {
            return CardView.this;
        }

        /* JADX INFO: renamed from: f */
        public final void m1955f(Drawable drawable) {
            this.f3604a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.mShadowBounds.set(i, i2, i3, i4);
            Rect rect = cardView.mContentPadding;
            CardView.access$001(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C04171 c04171 = new C04171();
        this.mCardViewDelegate = c04171;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.f3603a, i, com.exchange.allin.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.exchange.allin.R.color.cardview_light_background) : getResources().getColor(com.exchange.allin.R.color.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.mo1966k(c04171, context, colorStateList, dimension, dimension2, f);
    }

    public static /* synthetic */ void access$001(CardView cardView, int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void access$101(CardView cardView, int i) {
        super.setMinimumWidth(i);
    }

    public static /* synthetic */ void access$201(CardView cardView, int i) {
        super.setMinimumHeight(i);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo1962g(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo1957b(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo1961f(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo1958c(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (IMPL instanceof CardViewApi21Impl) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1965j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo1964i(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        IMPL.mo1968m(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo1960e(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo1963h(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo1969n(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z2;
            IMPL.mo1967l(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo1956a(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.mCompatPadding != z2) {
            this.mCompatPadding = z2;
            IMPL.mo1959d(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.mo1968m(this.mCardViewDelegate, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
