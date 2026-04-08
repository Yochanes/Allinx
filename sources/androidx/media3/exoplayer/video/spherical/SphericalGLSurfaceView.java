package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.motion.widget.RunnableC1407a;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.media3.exoplayer.video.spherical.ProjectionRenderer;
import androidx.media3.exoplayer.video.spherical.TouchTracker;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f28067a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f28068b;

    /* JADX INFO: renamed from: c */
    public final Sensor f28069c;

    /* JADX INFO: renamed from: d */
    public final OrientationListener f28070d;

    /* JADX INFO: renamed from: f */
    public final Handler f28071f;

    /* JADX INFO: renamed from: g */
    public final SceneRenderer f28072g;

    /* JADX INFO: renamed from: i */
    public SurfaceTexture f28073i;

    /* JADX INFO: renamed from: j */
    public Surface f28074j;

    /* JADX INFO: renamed from: n */
    public boolean f28075n;

    /* JADX INFO: renamed from: o */
    public boolean f28076o;

    /* JADX INFO: renamed from: p */
    public boolean f28077p;

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {

        /* JADX INFO: renamed from: a */
        public final SceneRenderer f28078a;

        /* JADX INFO: renamed from: d */
        public final float[] f28081d;

        /* JADX INFO: renamed from: f */
        public final float[] f28082f;

        /* JADX INFO: renamed from: g */
        public final float[] f28083g;

        /* JADX INFO: renamed from: i */
        public float f28084i;

        /* JADX INFO: renamed from: j */
        public float f28085j;

        /* JADX INFO: renamed from: b */
        public final float[] f28079b = new float[16];

        /* JADX INFO: renamed from: c */
        public final float[] f28080c = new float[16];

        /* JADX INFO: renamed from: n */
        public final float[] f28086n = new float[16];

        /* JADX INFO: renamed from: o */
        public final float[] f28087o = new float[16];

        public Renderer(SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.f28081d = fArr;
            float[] fArr2 = new float[16];
            this.f28082f = fArr2;
            float[] fArr3 = new float[16];
            this.f28083g = fArr3;
            this.f28078a = sceneRenderer;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f28085j = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        /* JADX INFO: renamed from: a */
        public final synchronized void mo10756a(float f, float[] fArr) {
            float[] fArr2 = this.f28081d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f28085j = f2;
            Matrix.setRotateM(this.f28082f, 0, -this.f28084i, (float) Math.cos(f2), (float) Math.sin(this.f28085j), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Object objM9581d;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f28087o, 0, this.f28081d, 0, this.f28083g, 0);
                Matrix.multiplyMM(this.f28086n, 0, this.f28082f, 0, this.f28087o, 0);
            }
            Matrix.multiplyMM(this.f28080c, 0, this.f28079b, 0, this.f28086n, 0);
            SceneRenderer sceneRenderer = this.f28078a;
            float[] fArr2 = this.f28080c;
            GLES20.glClear(16384);
            try {
                GlUtil.m9482b();
            } catch (GlUtil.GlException e) {
                Log.m9508d("SceneRenderer", "Failed to draw a frame", e);
            }
            if (sceneRenderer.f28054a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = sceneRenderer.f28063o;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.m9482b();
                } catch (GlUtil.GlException e2) {
                    Log.m9508d("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (sceneRenderer.f28055b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(sceneRenderer.f28060i, 0);
                }
                long timestamp = sceneRenderer.f28063o.getTimestamp();
                TimedValueQueue timedValueQueue = sceneRenderer.f28058f;
                synchronized (timedValueQueue) {
                    objM9581d = timedValueQueue.m9581d(timestamp, false);
                }
                Long l = (Long) objM9581d;
                if (l != null) {
                    FrameRotationQueue frameRotationQueue = sceneRenderer.f28057d;
                    float[] fArr3 = sceneRenderer.f28060i;
                    float[] fArr4 = (float[]) frameRotationQueue.f28021c.m9583f(l.longValue());
                    if (fArr4 != null) {
                        float f = fArr4[0];
                        float f2 = -fArr4[1];
                        float f3 = -fArr4[2];
                        float length = Matrix.length(f, f2, f3);
                        float[] fArr5 = frameRotationQueue.f28020b;
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!frameRotationQueue.f28022d) {
                            FrameRotationQueue.m10755a(frameRotationQueue.f28019a, frameRotationQueue.f28020b);
                            frameRotationQueue.f28022d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, frameRotationQueue.f28019a, 0, frameRotationQueue.f28020b, 0);
                    }
                }
                Projection projection = (Projection) sceneRenderer.f28059g.m9583f(timestamp);
                if (projection != null) {
                    ProjectionRenderer projectionRenderer = sceneRenderer.f28056c;
                    projectionRenderer.getClass();
                    if (ProjectionRenderer.m10758b(projection)) {
                        projectionRenderer.f28042a = projection.f28032c;
                        projectionRenderer.f28043b = new ProjectionRenderer.MeshData(projection.f28030a.f28034a[0]);
                        if (!projection.f28033d) {
                            new ProjectionRenderer.MeshData(projection.f28031b.f28034a[0]);
                        }
                    }
                }
            }
            Matrix.multiplyMM(sceneRenderer.f28061j, 0, fArr2, 0, sceneRenderer.f28060i, 0);
            ProjectionRenderer projectionRenderer2 = sceneRenderer.f28056c;
            int i = sceneRenderer.f28062n;
            float[] fArr6 = sceneRenderer.f28061j;
            ProjectionRenderer.MeshData meshData = projectionRenderer2.f28043b;
            if (meshData == null) {
                return;
            }
            int i2 = projectionRenderer2.f28042a;
            GLES20.glUniformMatrix3fv(projectionRenderer2.f28046e, 1, false, i2 == 1 ? ProjectionRenderer.f28040j : i2 == 2 ? ProjectionRenderer.f28041k : ProjectionRenderer.f28039i, 0);
            GLES20.glUniformMatrix4fv(projectionRenderer2.f28045d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(projectionRenderer2.f28049h, 0);
            try {
                GlUtil.m9482b();
            } catch (GlUtil.GlException e3) {
                android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.f28047f, 3, 5126, false, 12, (Buffer) meshData.f28051b);
            try {
                GlUtil.m9482b();
            } catch (GlUtil.GlException e4) {
                android.util.Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.f28048g, 2, 5126, false, 8, (Buffer) meshData.f28052c);
            try {
                GlUtil.m9482b();
            } catch (GlUtil.GlException e5) {
                android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(meshData.f28053d, 0, meshData.f28050a);
            try {
                GlUtil.m9482b();
            } catch (GlUtil.GlException e6) {
                android.util.Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f28079b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f28071f.post(new RunnableC1407a(11, sphericalGLSurfaceView, this.f28078a.m10760a()));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VideoSurfaceListener {
        /* JADX INFO: renamed from: B */
        void mo9842B();

        /* JADX INFO: renamed from: C */
        void mo9843C(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        super(context, null);
        this.f28067a = new CopyOnWriteArrayList();
        this.f28071f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f28068b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f28069c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        SceneRenderer sceneRenderer = new SceneRenderer();
        this.f28072g = sceneRenderer;
        Renderer renderer = new Renderer(sceneRenderer);
        View.OnTouchListener touchTracker = new TouchTracker(context, renderer);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f28070d = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.f28075n = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    /* JADX INFO: renamed from: a */
    public final void m10761a() {
        boolean z2 = this.f28075n && this.f28076o;
        Sensor sensor = this.f28069c;
        if (sensor == null || z2 == this.f28077p) {
            return;
        }
        OrientationListener orientationListener = this.f28070d;
        SensorManager sensorManager = this.f28068b;
        if (z2) {
            sensorManager.registerListener(orientationListener, sensor, 0);
        } else {
            sensorManager.unregisterListener(orientationListener);
        }
        this.f28077p = z2;
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.f28072g;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.f28072g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f28074j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28071f.post(new RunnableC1945b(this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f28076o = false;
        m10761a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f28076o = true;
        m10761a();
    }

    public void setDefaultStereoMode(int i) {
        this.f28072g.f28064p = i;
    }

    public void setUseSensorRotation(boolean z2) {
        this.f28075n = z2;
        m10761a();
    }
}
