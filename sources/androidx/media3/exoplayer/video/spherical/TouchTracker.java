package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {

    /* JADX INFO: renamed from: c */
    public final Listener f28091c;

    /* JADX INFO: renamed from: f */
    public final GestureDetector f28093f;

    /* JADX INFO: renamed from: a */
    public final PointF f28089a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f28090b = new PointF();

    /* JADX INFO: renamed from: d */
    public final float f28092d = 25.0f;

    /* JADX INFO: renamed from: g */
    public volatile float f28094g = 3.1415927f;

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
    }

    public TouchTracker(Context context, Listener listener) {
        this.f28091c = listener;
        this.f28093f = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    /* JADX INFO: renamed from: a */
    public final void mo10756a(float f, float[] fArr) {
        this.f28094g = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f28089a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f28089a.x) / this.f28092d;
        float y2 = motionEvent2.getY();
        PointF pointF = this.f28089a;
        float f3 = (y2 - pointF.y) / this.f28092d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f28094g;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f28090b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        Listener listener = this.f28091c;
        PointF pointF3 = this.f28090b;
        SphericalGLSurfaceView.Renderer renderer = (SphericalGLSurfaceView.Renderer) listener;
        synchronized (renderer) {
            float f5 = pointF3.y;
            renderer.f28084i = f5;
            Matrix.setRotateM(renderer.f28082f, 0, -f5, (float) Math.cos(renderer.f28085j), (float) Math.sin(renderer.f28085j), 0.0f);
            Matrix.setRotateM(renderer.f28083g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f28093f.onTouchEvent(motionEvent);
    }
}
