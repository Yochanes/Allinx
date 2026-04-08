package io.intercom.android.sdk.lightcompressor.video;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/InputSurface;", "", "surface", "Landroid/view/Surface;", "<init>", "(Landroid/view/Surface;)V", "eglRecordableAndroid", "", "eglOpenGlES2Bit", "mEGLDisplay", "Landroid/opengl/EGLDisplay;", "mEGLContext", "Landroid/opengl/EGLContext;", "mEGLSurface", "Landroid/opengl/EGLSurface;", "mSurface", "eglSetup", "", "release", "makeCurrent", "swapBuffers", "", "setPresentationTime", "nsecs", "", "checkEglError", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class InputSurface {

    @Nullable
    private EGLContext mEGLContext;

    @Nullable
    private EGLDisplay mEGLDisplay;

    @Nullable
    private EGLSurface mEGLSurface;

    @Nullable
    private Surface mSurface;
    private final int eglRecordableAndroid = 12610;
    private final int eglOpenGlES2Bit = 4;

    public InputSurface(@Nullable Surface surface) {
        surface.getClass();
        this.mSurface = surface;
        eglSetup();
    }

    private final void checkEglError() {
        boolean z2 = false;
        while (EGL14.eglGetError() != 12288) {
            z2 = true;
        }
        if (z2) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private final void eglSetup() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, this.eglOpenGlES2Bit, this.eglRecordableAndroid, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.mEGLContext = EGL14.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        checkEglError();
        if (this.mEGLContext == null) {
            throw new RuntimeException("null context");
        }
        this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, eGLConfigArr[0], this.mSurface, new int[]{12344}, 0);
        checkEglError();
        if (this.mEGLSurface == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public final void makeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void release() {
        if (Intrinsics.m18594b(EGL14.eglGetCurrentContext(), this.mEGLContext)) {
            EGLDisplay eGLDisplay = this.mEGLDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
        EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mSurface = null;
    }

    public final void setPresentationTime(long nsecs) {
        EGLExt.eglPresentationTimeANDROID(this.mEGLDisplay, this.mEGLSurface, nsecs);
    }

    public final boolean swapBuffers() {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    }
}
