package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.shimmer.Shimmer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint mContentPaint;
    private final ShimmerDrawable mShimmerDrawable;
    private boolean mShowShimmer;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        m14315a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m14315a(Context context, AttributeSet attributeSet) {
        Shimmer.Builder alphaHighlightBuilder;
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new Shimmer.AlphaHighlightBuilder().m14307a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f42127a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                alphaHighlightBuilder = new Shimmer.ColorHighlightBuilder();
                alphaHighlightBuilder.f42148a.f42143p = false;
            } else {
                alphaHighlightBuilder = new Shimmer.AlphaHighlightBuilder();
            }
            setShimmer(alphaHighlightBuilder.mo14308b(typedArrayObtainStyledAttributes).m14307a());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mShimmerDrawable.f42153e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.m14313a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public ShimmerFrameLayout setShimmer(@Nullable Shimmer shimmer) {
        boolean zIsStarted;
        ShimmerDrawable shimmerDrawable = this.mShimmerDrawable;
        shimmerDrawable.f42154f = shimmer;
        if (shimmer != null) {
            shimmerDrawable.f42150b.setXfermode(new PorterDuffXfermode(shimmerDrawable.f42154f.f42143p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        shimmerDrawable.m14314b();
        if (shimmerDrawable.f42154f != null) {
            ValueAnimator valueAnimator = shimmerDrawable.f42153e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                shimmerDrawable.f42153e.cancel();
                shimmerDrawable.f42153e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            Shimmer shimmer2 = shimmerDrawable.f42154f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (shimmer2.f42147t / shimmer2.f42146s) + 1.0f);
            shimmerDrawable.f42153e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(shimmerDrawable.f42154f.f42145r);
            shimmerDrawable.f42153e.setRepeatCount(shimmerDrawable.f42154f.f42144q);
            ValueAnimator valueAnimator2 = shimmerDrawable.f42153e;
            Shimmer shimmer3 = shimmerDrawable.f42154f;
            valueAnimator2.setDuration(shimmer3.f42146s + shimmer3.f42147t);
            shimmerDrawable.f42153e.addUpdateListener(shimmerDrawable.f42149a);
            if (zIsStarted) {
                shimmerDrawable.f42153e.start();
            }
        }
        shimmerDrawable.invalidateSelf();
        if (shimmer == null || !shimmer.f42141n) {
            setLayerType(0, null);
            return this;
        }
        setLayerType(2, this.mContentPaint);
        return this;
    }

    public void showShimmer(boolean z2) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z2) {
            startShimmer();
        }
    }

    public void startShimmer() {
        ShimmerDrawable shimmerDrawable = this.mShimmerDrawable;
        ValueAnimator valueAnimator = shimmerDrawable.f42153e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && shimmerDrawable.getCallback() != null) {
                shimmerDrawable.f42153e.start();
            }
        }
    }

    public void stopShimmer() {
        ShimmerDrawable shimmerDrawable = this.mShimmerDrawable;
        ValueAnimator valueAnimator = shimmerDrawable.f42153e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        shimmerDrawable.f42153e.cancel();
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        m14315a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        m14315a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ShimmerDrawable();
        this.mShowShimmer = true;
        m14315a(context, attributeSet);
    }
}
