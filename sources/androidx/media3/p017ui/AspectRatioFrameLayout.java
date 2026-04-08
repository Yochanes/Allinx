package androidx.media3.p017ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AspectRatioUpdateDispatcher f29804a;

    /* JADX INFO: renamed from: b */
    public AspectRatioListener f29805b;

    /* JADX INFO: renamed from: c */
    public float f29806c;

    /* JADX INFO: renamed from: d */
    public int f29807d;

    /* JADX INFO: compiled from: Proguard */
    public interface AspectRatioListener {
        /* JADX INFO: renamed from: a */
        void m11094a();
    }

    /* JADX INFO: compiled from: Proguard */
    public final class AspectRatioUpdateDispatcher implements Runnable {

        /* JADX INFO: renamed from: a */
        public boolean f29808a;

        public AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29808a = false;
            AspectRatioListener aspectRatioListener = AspectRatioFrameLayout.this.f29805b;
            if (aspectRatioListener == null) {
                return;
            }
            aspectRatioListener.m11094a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29807d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f30061a, 0, 0);
            try {
                this.f29807d = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f29804a = new AspectRatioUpdateDispatcher();
    }

    public int getResizeMode() {
        return this.f29807d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f29806c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f29806c / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher = this.f29804a;
        if (fAbs <= 0.01f) {
            aspectRatioUpdateDispatcher.getClass();
            if (aspectRatioUpdateDispatcher.f29808a) {
                return;
            }
            aspectRatioUpdateDispatcher.f29808a = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
            return;
        }
        int i3 = this.f29807d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f29806c;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.f29806c;
                    } else {
                        f2 = this.f29806c;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f29806c;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.f29806c;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f29806c;
            measuredWidth = (int) (f4 * f);
        }
        aspectRatioUpdateDispatcher.getClass();
        if (!aspectRatioUpdateDispatcher.f29808a) {
            aspectRatioUpdateDispatcher.f29808a = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO));
    }

    public void setAspectRatio(float f) {
        if (this.f29806c != f) {
            this.f29806c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.f29805b = aspectRatioListener;
    }

    public void setResizeMode(int i) {
        if (this.f29807d != i) {
            this.f29807d = i;
            requestLayout();
        }
    }
}
