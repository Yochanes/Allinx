package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.RunnableC0187a;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final OpenGlRenderer f3062a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f3063b;

    /* JADX INFO: renamed from: c */
    public final Executor f3064c;

    /* JADX INFO: renamed from: d */
    public final Handler f3065d;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f3066f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final float[] f3067g = new float[16];

    /* JADX INFO: renamed from: i */
    public final float[] f3068i = new float[16];

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f3069j = new LinkedHashMap();

    /* JADX INFO: renamed from: n */
    public int f3070n = 0;

    /* JADX INFO: renamed from: o */
    public boolean f3071o = false;

    /* JADX INFO: renamed from: p */
    public final ArrayList f3072p = new ArrayList();

    /* JADX INFO: compiled from: Proguard */
    public static class Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class PendingSnapshot {
        /* JADX INFO: renamed from: a */
        public abstract CallbackToFutureAdapter.Completer mo1665a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1666b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1667c();
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange) {
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f3063b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3065d = handler;
        this.f3064c = CameraXExecutors.m1619e(handler);
        this.f3062a = new OpenGlRenderer();
        try {
            try {
                CallbackToFutureAdapter.m6740a(new C0322f(this, dynamicRange)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            m1692e();
            throw e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1688a() {
        if (this.f3071o && this.f3070n == 0) {
            LinkedHashMap linkedHashMap = this.f3069j;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.f3072p.iterator();
            while (it2.hasNext()) {
                ((PendingSnapshot) it2.next()).mo1665a().m6744d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            OpenGlRenderer openGlRenderer = this.f3062a;
            if (openGlRenderer.f3081a.getAndSet(false)) {
                openGlRenderer.m1699c();
                openGlRenderer.m1709p();
            }
            this.f3063b.quit();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1689b(Runnable runnable, Runnable runnable2) {
        try {
            this.f3064c.execute(new RunnableC0320d(this, 0, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            Logger.m1289j("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1690c(Exception exc) {
        ArrayList arrayList = this.f3072p;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PendingSnapshot) it.next()).mo1665a().m6744d(exc);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m1691d(Size size, float[] fArr, int i) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        MatrixExt.m1606b(fArr2);
        MatrixExt.m1605a(i, fArr2);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        Size sizeM1614f = TransformUtils.m1614f(size, i);
        OpenGlRenderer openGlRenderer = this.f3062a;
        openGlRenderer.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM1614f.getHeight() * sizeM1614f.getWidth() * 4);
        Preconditions.m7695b(byteBufferAllocateDirect.capacity() == (sizeM1614f.getHeight() * sizeM1614f.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        Preconditions.m7695b(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        OpenGlRenderer.m1695b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glActiveTexture(33985);
        OpenGlRenderer.m1695b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        OpenGlRenderer.m1695b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeM1614f.getWidth(), sizeM1614f.getHeight(), 0, 6407, 5121, null);
        OpenGlRenderer.m1695b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        OpenGlRenderer.m1695b("glGenFramebuffers");
        int i3 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i3);
        OpenGlRenderer.m1695b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        OpenGlRenderer.m1695b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        OpenGlRenderer.m1695b("glActiveTexture");
        GLES20.glBindTexture(36197, openGlRenderer.f3089i);
        OpenGlRenderer.m1695b("glBindTexture");
        openGlRenderer.f3088h = null;
        GLES20.glViewport(0, 0, sizeM1614f.getWidth(), sizeM1614f.getHeight());
        GLES20.glScissor(0, 0, sizeM1614f.getWidth(), sizeM1614f.getHeight());
        GLES20.glUniformMatrix4fv(openGlRenderer.f3091k, 1, false, fArr2, 0);
        OpenGlRenderer.m1695b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        OpenGlRenderer.m1695b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeM1614f.getWidth(), sizeM1614f.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        OpenGlRenderer.m1695b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        OpenGlRenderer.m1695b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        OpenGlRenderer.m1695b("glDeleteFramebuffers");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, openGlRenderer.f3089i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM1614f.getWidth(), sizeM1614f.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m1274e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeM1614f.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e */
    public final void m1692e() {
        if (this.f3066f.getAndSet(true)) {
            return;
        }
        m1689b(new RunnableC0329m(this, 4), new RunnableC0187a());
    }

    /* JADX INFO: renamed from: f */
    public final void m1693f(Triple triple) {
        ArrayList arrayList = this.f3072p;
        if (arrayList.isEmpty()) {
            return;
        }
        if (triple == null) {
            m1690c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iMo1667c = -1;
                int iMo1666b = -1;
                Bitmap bitmapM1691d = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    PendingSnapshot pendingSnapshot = (PendingSnapshot) it.next();
                    if (iMo1667c != pendingSnapshot.mo1667c() || bitmapM1691d == null) {
                        iMo1667c = pendingSnapshot.mo1667c();
                        if (bitmapM1691d != null) {
                            bitmapM1691d.recycle();
                        }
                        bitmapM1691d = m1691d((Size) triple.f51440b, (float[]) triple.f51441c, iMo1667c);
                        iMo1666b = -1;
                    }
                    if (iMo1666b != pendingSnapshot.mo1666b()) {
                        byteArrayOutputStream.reset();
                        iMo1666b = pendingSnapshot.mo1666b();
                        bitmapM1691d.compress(Bitmap.CompressFormat.JPEG, iMo1666b, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) triple.f51439a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.m1277h(byteArray, surface);
                    pendingSnapshot.mo1665a().m6742b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            m1690c(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f3066f.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f3067g;
        surfaceTexture.getTransformMatrix(fArr);
        Triple triple = null;
        for (Map.Entry entry : this.f3069j.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.f3068i;
            surfaceOutput.mo1305t(fArr2, fArr);
            if (surfaceOutput.mo1303f() == 34) {
                try {
                    this.f3062a.m1711r(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e) {
                    Logger.m1283d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                Preconditions.m7699f(surfaceOutput.mo1303f() == 256, "Unsupported format: " + surfaceOutput.mo1303f());
                Preconditions.m7699f(triple == null, "Only one JPEG output is supported.");
                triple = new Triple(surface, surfaceOutput.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            m1693f(triple);
        } catch (RuntimeException e2) {
            m1690c(e2);
        }
    }
}
