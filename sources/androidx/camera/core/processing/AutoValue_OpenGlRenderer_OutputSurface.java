package androidx.camera.core.processing;

import android.opengl.EGLSurface;
import androidx.camera.core.processing.OpenGlRenderer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_OpenGlRenderer_OutputSurface extends OpenGlRenderer.OutputSurface {

    /* JADX INFO: renamed from: a */
    public final EGLSurface f3042a;

    /* JADX INFO: renamed from: b */
    public final int f3043b;

    /* JADX INFO: renamed from: c */
    public final int f3044c;

    public AutoValue_OpenGlRenderer_OutputSurface(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f3042a = eGLSurface;
        this.f3043b = i;
        this.f3044c = i2;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    /* JADX INFO: renamed from: a */
    public final EGLSurface mo1668a() {
        return this.f3042a;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    /* JADX INFO: renamed from: b */
    public final int mo1669b() {
        return this.f3044c;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.OutputSurface
    /* JADX INFO: renamed from: c */
    public final int mo1670c() {
        return this.f3043b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenGlRenderer.OutputSurface)) {
            return false;
        }
        OpenGlRenderer.OutputSurface outputSurface = (OpenGlRenderer.OutputSurface) obj;
        return this.f3042a.equals(outputSurface.mo1668a()) && this.f3043b == outputSurface.mo1670c() && this.f3044c == outputSurface.mo1669b();
    }

    public final int hashCode() {
        return ((((this.f3042a.hashCode() ^ 1000003) * 1000003) ^ this.f3043b) * 1000003) ^ this.f3044c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f3042a);
        sb.append(", width=");
        sb.append(this.f3043b);
        sb.append(", height=");
        return AbstractC0000a.m11h(this.f3044c, "}", sb);
    }
}
