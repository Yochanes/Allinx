package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d */
    public static int f27873d;

    /* JADX INFO: renamed from: f */
    public static boolean f27874f;

    /* JADX INFO: renamed from: a */
    public final boolean f27875a;

    /* JADX INFO: renamed from: b */
    public final PlaceholderSurfaceThread f27876b;

    /* JADX INFO: renamed from: c */
    public boolean f27877c;

    /* JADX INFO: compiled from: Proguard */
    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public EGLSurfaceTexture f27878a;

        /* JADX INFO: renamed from: b */
        public Handler f27879b;

        /* JADX INFO: renamed from: c */
        public Error f27880c;

        /* JADX INFO: renamed from: d */
        public RuntimeException f27881d;

        /* JADX INFO: renamed from: f */
        public PlaceholderSurface f27882f;

        /* JADX INFO: renamed from: a */
        public final void m10723a(int i) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f27878a.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f27878a;
            eGLSurfaceTexture.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.m9483c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.m9483c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            eGLSurfaceTexture.f25595c = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.f25592i, 0, eGLConfigArr, 0, 1, iArr2, 0);
            boolean z2 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i2 = Util.f25665a;
            GlUtil.m9483c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f25595c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.m9483c("eglCreateContext failed", eGLContextEglCreateContext != null);
            eGLSurfaceTexture.f25596d = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f25595c;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.m9483c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.m9483c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            eGLSurfaceTexture.f25597f = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = eGLSurfaceTexture.f25594b;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.m9482b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            eGLSurfaceTexture.f25598g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f27878a.f25598g;
            surfaceTexture2.getClass();
            this.f27882f = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m10724b() {
            this.f27878a.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f27878a;
            eGLSurfaceTexture.f25593a.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f25598g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f25594b, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f25595c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f25595c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f25597f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f25595c, eGLSurfaceTexture.f25597f);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f25596d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f25595c, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f25595c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f25595c);
                }
                eGLSurfaceTexture.f25595c = null;
                eGLSurfaceTexture.f25596d = null;
                eGLSurfaceTexture.f25597f = null;
                eGLSurfaceTexture.f25598g = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        m10723a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e) {
                        Log.m9508d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.f27881d = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        Log.m9508d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.f27880c = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e3) {
                        Log.m9508d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.f27881d = e3;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i == 2) {
                    try {
                        m10724b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            Log.m9508d("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f27876b = placeholderSurfaceThread;
        this.f27875a = z2;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m10722a(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!f27874f) {
                int i2 = Util.f25665a;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                f27873d = i;
                f27874f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27873d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f27876b) {
            try {
                if (!this.f27877c) {
                    PlaceholderSurfaceThread placeholderSurfaceThread = this.f27876b;
                    placeholderSurfaceThread.f27879b.getClass();
                    placeholderSurfaceThread.f27879b.sendEmptyMessage(2);
                    this.f27877c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
