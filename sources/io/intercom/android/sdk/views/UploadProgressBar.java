package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UploadProgressBar extends View {
    private static final int MAX = 100;
    private static final int START_ANGLE = -90;
    private static final int STROKE_WIDTH = 8;
    private final Paint backgroundPaint;
    private final Paint foregroundPaint;
    private int progress;
    private final RectF rectF;
    private final Twig twig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.UploadProgressBar$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C58591 extends AnimatorListenerAdapter {
        public C58591() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UploadProgressBar.this.hideBar();
        }
    }

    public UploadProgressBar(Context context) {
        this(context, null);
    }

    private ObjectAnimator getObjectAnimator() {
        this.twig.internal("animation", "starting upload end animation");
        return ObjectAnimator.ofInt(this, "progress", 90, 99).setDuration(1000L);
    }

    private void showBar() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.start();
    }

    public void hideBar() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f).setDuration(300L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (this.progress * 360) / 100;
        canvas.drawOval(this.rectF, this.backgroundPaint);
        canvas.drawArc(this.rectF, -90.0f, f, false, this.foregroundPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        float f = iMin - 4;
        this.rectF.set(4.0f, 4.0f, f, f);
    }

    public void setProgress(int i) {
        this.twig.internal("animation", "received progress of  " + i);
        if (i > this.progress) {
            this.progress = i;
            invalidate();
        }
    }

    public void smoothEndAnimation() {
        ObjectAnimator objectAnimator = getObjectAnimator();
        objectAnimator.addListener(new C58591());
        objectAnimator.start();
    }

    public void smoothStartAnimation() {
        if (getAlpha() < 1.0f) {
            showBar();
        }
        this.twig.internal("animation", "starting upload start animation");
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", 0, 10);
        objectAnimatorOfInt.setDuration(1000L);
        objectAnimatorOfInt.start();
    }

    public UploadProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
        this.progress = 0;
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        paint.setColor(-2013265920);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(8.0f);
        Paint paint2 = new Paint(1);
        this.foregroundPaint = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(8.0f);
    }

    public void smoothEndAnimation(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator = getObjectAnimator();
        objectAnimator.addListener(animatorListener);
        objectAnimator.start();
    }
}
