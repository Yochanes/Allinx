package androidx.camera.core.processing;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@WorkerThread
public final class OpenGlRenderer {

    /* JADX INFO: renamed from: n */
    public static final String f3074n;

    /* JADX INFO: renamed from: o */
    public static final String f3075o;

    /* JADX INFO: renamed from: p */
    public static final String f3076p;

    /* JADX INFO: renamed from: q */
    public static final String f3077q;

    /* JADX INFO: renamed from: r */
    public static final FloatBuffer f3078r;

    /* JADX INFO: renamed from: s */
    public static final FloatBuffer f3079s;

    /* JADX INFO: renamed from: t */
    public static final AutoValue_OpenGlRenderer_OutputSurface f3080t;

    /* JADX INFO: renamed from: c */
    public Thread f3083c;

    /* JADX INFO: renamed from: f */
    public EGLConfig f3086f;

    /* JADX INFO: renamed from: h */
    public Surface f3088h;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f3081a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final HashMap f3082b = new HashMap();

    /* JADX INFO: renamed from: d */
    public EGLDisplay f3084d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e */
    public EGLContext f3085e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: g */
    public EGLSurface f3087g = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: i */
    public int f3089i = -1;

    /* JADX INFO: renamed from: j */
    public int f3090j = -1;

    /* JADX INFO: renamed from: k */
    public int f3091k = -1;

    /* JADX INFO: renamed from: l */
    public int f3092l = -1;

    /* JADX INFO: renamed from: m */
    public int f3093m = -1;

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class OutputSurface {
        /* JADX INFO: renamed from: a */
        public abstract EGLSurface mo1668a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1669b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1670c();
    }

    static {
        Locale locale = Locale.US;
        f3074n = "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3075o = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3076p = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        f3077q = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}";
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f3078r = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f3079s = floatBufferAsFloatBuffer2;
        f3080t = new AutoValue_OpenGlRenderer_OutputSurface(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m1694a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM21r = AbstractC0000a.m21r(str, ": EGL error: 0x");
        sbM21r.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbM21r.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m1695b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbM21r = AbstractC0000a.m21r(str, ": GL error 0x");
        sbM21r.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbM21r.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m1696e(int i, String str) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC0000a.m3D("Unable to locate '", str, "' in program"));
        }
    }

    /* JADX INFO: renamed from: j */
    public static EGLSurface m1697j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        m1694a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: n */
    public static int m1698n(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m1695b("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.m1288i("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Could not compile shader type ", ":");
        sbM20q.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbM20q.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m1699c() {
        Preconditions.m7699f(this.f3083c == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* JADX INFO: renamed from: d */
    public final void m1700d(boolean z2) {
        Preconditions.m7699f(z2 == this.f3081a.get(), z2 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* JADX INFO: renamed from: f */
    public final void m1701f(DynamicRange dynamicRange) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f3084d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f3084d, iArr, 0, iArr, 1)) {
            this.f3084d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        int i = dynamicRange.m1230a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f3084d, new int[]{12324, i, 12323, i, 12322, i, 12321, dynamicRange.m1230a() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.m1230a() ? 64 : 4, 12610, !dynamicRange.m1230a() ? 1 : 0, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f3084d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.m1230a() ? 3 : 2, 12344}, 0);
        m1694a("eglCreateContext");
        this.f3086f = eGLConfig;
        this.f3085e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f3084d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1702g(DynamicRange dynamicRange) throws Throwable {
        int i;
        int iM1698n;
        int iGlCreateProgram;
        try {
            iM1698n = m1698n(35633, dynamicRange.m1230a() ? f3075o : f3074n);
            try {
                int iM1698n2 = m1698n(35632, dynamicRange.m1230a() ? f3077q : f3076p);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        m1695b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iM1698n);
                        m1695b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iM1698n2);
                        m1695b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f3090j = iGlCreateProgram;
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        Throwable th = e;
                        i = iM1698n2;
                        e = th;
                        if (iM1698n != -1) {
                            GLES20.glDeleteShader(iM1698n);
                        }
                        if (i != -1) {
                            GLES20.glDeleteShader(i);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        Throwable th2 = e;
                        i = iM1698n2;
                        e = th2;
                        if (iM1698n != -1) {
                        }
                        if (i != -1) {
                        }
                        if (iGlCreateProgram != -1) {
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    i = iM1698n2;
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                i = -1;
                iGlCreateProgram = -1;
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
            i = -1;
            iM1698n = -1;
            iGlCreateProgram = -1;
            if (iM1698n != -1) {
            }
            if (i != -1) {
            }
            if (iGlCreateProgram != -1) {
            }
            throw e;
        } catch (IllegalStateException e6) {
            e = e6;
            i = -1;
            iM1698n = -1;
            iGlCreateProgram = -1;
            if (iM1698n != -1) {
            }
            if (i != -1) {
            }
            if (iGlCreateProgram != -1) {
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1703h() {
        EGLDisplay eGLDisplay = this.f3084d;
        EGLConfig eGLConfig = this.f3086f;
        Objects.requireNonNull(eGLConfig);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        m1694a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f3087g = eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX INFO: renamed from: i */
    public final void m1704i() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m1695b("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m1695b("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m1695b("glTexParameter");
        this.f3089i = i;
    }

    /* JADX INFO: renamed from: k */
    public final String m1705k(DynamicRange dynamicRange) {
        m1700d(false);
        try {
            m1701f(dynamicRange);
            m1703h();
            m1708o(this.f3087g);
            String strGlGetString = GLES20.glGetString(7939);
            return strGlGetString != null ? strGlGetString : "";
        } catch (IllegalStateException e) {
            Logger.m1289j("OpenGlRenderer", "Failed to get GL extensions: " + e.getMessage(), e);
            return "";
        } finally {
            m1709p();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1706l(DynamicRange dynamicRange) throws Throwable {
        m1700d(false);
        try {
            if (dynamicRange.m1230a() && !m1705k(dynamicRange).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                dynamicRange = DynamicRange.f2247d;
            }
            m1701f(dynamicRange);
            m1703h();
            m1708o(this.f3087g);
            m1702g(dynamicRange);
            m1707m();
            m1704i();
            m1712s();
            this.f3083c = Thread.currentThread();
            this.f3081a.set(true);
        } catch (IllegalArgumentException e) {
            e = e;
            m1709p();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            m1709p();
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1707m() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f3090j, "aPosition");
        this.f3092l = iGlGetAttribLocation;
        m1696e(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f3090j, "aTextureCoord");
        this.f3093m = iGlGetAttribLocation2;
        m1696e(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f3090j, "uTexMatrix");
        this.f3091k = iGlGetUniformLocation;
        m1696e(iGlGetUniformLocation, "uTexMatrix");
    }

    /* JADX INFO: renamed from: o */
    public final void m1708o(EGLSurface eGLSurface) {
        this.f3084d.getClass();
        this.f3085e.getClass();
        if (!EGL14.eglMakeCurrent(this.f3084d, eGLSurface, eGLSurface, this.f3085e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1709p() {
        int i = this.f3090j;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.f3090j = -1;
        }
        if (!Objects.equals(this.f3084d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f3084d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.f3082b;
            for (OutputSurface outputSurface : map.values()) {
                if (!Objects.equals(outputSurface.mo1668a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f3084d, outputSurface.mo1668a())) {
                    try {
                        m1694a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        Logger.m1283d("OpenGlRenderer", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.f3087g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f3084d, this.f3087g);
                this.f3087g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f3085e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f3084d, this.f3085e);
                this.f3085e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f3084d);
            this.f3084d = EGL14.EGL_NO_DISPLAY;
        }
        this.f3086f = null;
        this.f3090j = -1;
        this.f3091k = -1;
        this.f3092l = -1;
        this.f3093m = -1;
        this.f3089i = -1;
        this.f3088h = null;
        this.f3083c = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m1710q(Surface surface, boolean z2) {
        if (this.f3088h == surface) {
            this.f3088h = null;
            m1708o(this.f3087g);
        }
        HashMap map = this.f3082b;
        AutoValue_OpenGlRenderer_OutputSurface autoValue_OpenGlRenderer_OutputSurface = f3080t;
        OutputSurface outputSurface = z2 ? (OutputSurface) map.remove(surface) : (OutputSurface) map.put(surface, autoValue_OpenGlRenderer_OutputSurface);
        if (outputSurface == null || outputSurface == autoValue_OpenGlRenderer_OutputSurface) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f3084d, outputSurface.mo1668a());
        } catch (RuntimeException e) {
            Logger.m1289j("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1711r(long j, float[] fArr, Surface surface) {
        m1700d(true);
        m1699c();
        HashMap map = this.f3082b;
        Preconditions.m7699f(map.containsKey(surface), "The surface is not registered.");
        OutputSurface autoValue_OpenGlRenderer_OutputSurface = (OutputSurface) map.get(surface);
        Objects.requireNonNull(autoValue_OpenGlRenderer_OutputSurface);
        if (autoValue_OpenGlRenderer_OutputSurface == f3080t) {
            try {
                EGLDisplay eGLDisplay = this.f3084d;
                EGLConfig eGLConfig = this.f3086f;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceM1697j = m1697j(eGLDisplay, eGLConfig, surface);
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(this.f3084d, eGLSurfaceM1697j, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(this.f3084d, eGLSurfaceM1697j, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                autoValue_OpenGlRenderer_OutputSurface = new AutoValue_OpenGlRenderer_OutputSurface(eGLSurfaceM1697j, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e) {
                Logger.m1289j("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                autoValue_OpenGlRenderer_OutputSurface = null;
            }
            if (autoValue_OpenGlRenderer_OutputSurface == null) {
                return;
            } else {
                map.put(surface, autoValue_OpenGlRenderer_OutputSurface);
            }
        }
        if (surface != this.f3088h) {
            m1708o(autoValue_OpenGlRenderer_OutputSurface.mo1668a());
            this.f3088h = surface;
            GLES20.glViewport(0, 0, autoValue_OpenGlRenderer_OutputSurface.mo1670c(), autoValue_OpenGlRenderer_OutputSurface.mo1669b());
            GLES20.glScissor(0, 0, autoValue_OpenGlRenderer_OutputSurface.mo1670c(), autoValue_OpenGlRenderer_OutputSurface.mo1669b());
        }
        GLES20.glUniformMatrix4fv(this.f3091k, 1, false, fArr, 0);
        m1695b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m1695b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f3084d, autoValue_OpenGlRenderer_OutputSurface.mo1668a(), j);
        if (EGL14.eglSwapBuffers(this.f3084d, autoValue_OpenGlRenderer_OutputSurface.mo1668a())) {
            return;
        }
        Logger.m1288i("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m1710q(surface, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m1712s() {
        GLES20.glUseProgram(this.f3090j);
        m1695b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f3089i);
        GLES20.glEnableVertexAttribArray(this.f3092l);
        m1695b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3092l, 2, 5126, false, 0, (Buffer) f3078r);
        m1695b("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f3093m);
        m1695b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3093m, 2, 5126, false, 0, (Buffer) f3079s);
        m1695b("glVertexAttribPointer");
    }
}
