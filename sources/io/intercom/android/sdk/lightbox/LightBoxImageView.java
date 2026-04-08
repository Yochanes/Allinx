package io.intercom.android.sdk.lightbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LightBoxImageView extends AppCompatImageView {
    GestureDetector gestureDetector;
    LightBoxListener lightBoxListener;

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightbox.LightBoxImageView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnTouchListenerC52561 implements View.OnTouchListener {
        public ViewOnTouchListenerC52561() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return LightBoxImageView.this.gestureDetector.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            LightBoxListener lightBoxListener = LightBoxImageView.this.lightBoxListener;
            if (lightBoxListener != null) {
                lightBoxListener.closeLightBox();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public LightBoxImageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureListener());
        setOnTouchListener(new ViewOnTouchListenerC52561());
    }

    public void setLightBoxListener(LightBoxListener lightBoxListener) {
        this.lightBoxListener = lightBoxListener;
    }

    public LightBoxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        init();
    }
}
