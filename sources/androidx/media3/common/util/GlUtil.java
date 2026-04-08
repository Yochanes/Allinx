package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GlUtil {

    /* JADX INFO: compiled from: Proguard */
    public static final class GlException extends Exception {
    }

    /* JADX INFO: renamed from: a */
    public static void m9481a(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        m9482b();
        GLES20.glTexParameteri(i, 10240, 9729);
        m9482b();
        GLES20.glTexParameteri(i, 10241, 9729);
        m9482b();
        GLES20.glTexParameteri(i, 10242, 33071);
        m9482b();
        GLES20.glTexParameteri(i, 10243, 33071);
        m9482b();
    }

    /* JADX INFO: renamed from: b */
    public static void m9482b() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z2 = true;
        }
        if (z2) {
            throw new GlException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9483c(String str, boolean z2) throws GlException {
        if (!z2) {
            throw new GlException(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static FloatBuffer m9484d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
