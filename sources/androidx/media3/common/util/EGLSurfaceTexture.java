package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: i */
    public static final int[] f25592i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f25593a;

    /* JADX INFO: renamed from: b */
    public final int[] f25594b = new int[1];

    /* JADX INFO: renamed from: c */
    public EGLDisplay f25595c;

    /* JADX INFO: renamed from: d */
    public EGLContext f25596d;

    /* JADX INFO: renamed from: f */
    public EGLSurface f25597f;

    /* JADX INFO: renamed from: g */
    public SurfaceTexture f25598g;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TextureImageListener {
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f25593a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f25593a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f25598g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
