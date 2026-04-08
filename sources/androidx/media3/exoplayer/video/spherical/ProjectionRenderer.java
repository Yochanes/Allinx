package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ProjectionRenderer {

    /* JADX INFO: renamed from: i */
    public static final float[] f28039i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f28040j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f28041k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f28042a;

    /* JADX INFO: renamed from: b */
    public MeshData f28043b;

    /* JADX INFO: renamed from: c */
    public GlProgram f28044c;

    /* JADX INFO: renamed from: d */
    public int f28045d;

    /* JADX INFO: renamed from: e */
    public int f28046e;

    /* JADX INFO: renamed from: f */
    public int f28047f;

    /* JADX INFO: renamed from: g */
    public int f28048g;

    /* JADX INFO: renamed from: h */
    public int f28049h;

    /* JADX INFO: compiled from: Proguard */
    public static class MeshData {

        /* JADX INFO: renamed from: a */
        public final int f28050a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f28051b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f28052c;

        /* JADX INFO: renamed from: d */
        public final int f28053d;

        public MeshData(Projection.SubMesh subMesh) {
            float[] fArr = subMesh.f28037c;
            this.f28050a = fArr.length / 3;
            this.f28051b = GlUtil.m9484d(fArr);
            this.f28052c = GlUtil.m9484d(subMesh.f28038d);
            int i = subMesh.f28036b;
            if (i == 1) {
                this.f28053d = 5;
            } else if (i != 2) {
                this.f28053d = 4;
            } else {
                this.f28053d = 6;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10758b(Projection projection) {
        Projection.SubMesh[] subMeshArr = projection.f28030a.f28034a;
        if (subMeshArr.length == 1 && subMeshArr[0].f28035a == 0) {
            Projection.SubMesh[] subMeshArr2 = projection.f28031b.f28034a;
            if (subMeshArr2.length == 1 && subMeshArr2[0].f28035a == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m10759a() {
        try {
            GlProgram glProgram = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f28044c = glProgram;
            this.f28045d = GLES20.glGetUniformLocation(glProgram.f25599a, "uMvpMatrix");
            this.f28046e = GLES20.glGetUniformLocation(this.f28044c.f25599a, "uTexMatrix");
            this.f28047f = this.f28044c.m9480b("aPosition");
            this.f28048g = this.f28044c.m9480b("aTexCoords");
            this.f28049h = GLES20.glGetUniformLocation(this.f28044c.f25599a, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
