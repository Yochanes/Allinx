package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.C3734R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    public IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                this.staticDummyDrawable.setTint(this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i2 = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            if (i2 == 0) {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
                i = i2;
            } else {
                DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) AbstractC1610a.m8729g(1, this.animatorDelegate.activeIndicators);
                DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                if (drawingDelegate instanceof LinearDrawingDelegate) {
                    i = i2;
                    drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i);
                } else {
                    i = i2;
                    alpha = 0;
                    drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f + activeIndicator.startFraction, this.baseSpec.trackColor, 0, i);
                }
            }
            for (int i3 = 0; i3 < this.animatorDelegate.activeIndicators.size(); i3++) {
                DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i3);
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                if (i3 > 0 && i > 0) {
                    this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i3 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @NonNull
    public IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    @NonNull
    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Nullable
    @RestrictTo
    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange int i) {
        super.setAlpha(i);
    }

    public void setAnimatorDelegate(@NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    @RestrictTo
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z2, boolean z3, boolean z4) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z2, z3, z4);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z2, z3);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (!z2 || !z4) {
            return visibleInternal;
        }
        this.animatorDelegate.startAnimator();
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull CircularDrawingDelegate circularDrawingDelegate) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.m12030a(context.getResources(), C3734R.drawable.indeterminate_static, null));
        return indeterminateDrawable;
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull LinearDrawingDelegate linearDrawingDelegate) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3, boolean z4) {
        return super.setVisible(z2, z3, z4);
    }
}
