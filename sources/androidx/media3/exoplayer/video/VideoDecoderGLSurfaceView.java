package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {

    /* JADX INFO: renamed from: a */
    public final Renderer f27924a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Renderer implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: o */
        public static final float[] f27925o = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: p */
        public static final String[] f27926p = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: q */
        public static final FloatBuffer f27927q = GlUtil.m9484d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a */
        public final VideoDecoderGLSurfaceView f27928a;

        /* JADX INFO: renamed from: b */
        public final int[] f27929b = new int[3];

        /* JADX INFO: renamed from: c */
        public final int[] f27930c = new int[3];

        /* JADX INFO: renamed from: d */
        public final int[] f27931d = new int[3];

        /* JADX INFO: renamed from: f */
        public final int[] f27932f = new int[3];

        /* JADX INFO: renamed from: g */
        public final AtomicReference f27933g = new AtomicReference();

        /* JADX INFO: renamed from: i */
        public GlProgram f27934i;

        /* JADX INFO: renamed from: j */
        public int f27935j;

        /* JADX INFO: renamed from: n */
        public VideoDecoderOutputBuffer f27936n;

        public Renderer(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
            this.f27928a = videoDecoderGLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f27931d;
                this.f27932f[i] = -1;
                iArr[i] = -1;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m10740a() {
            int[] iArr = this.f27929b;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    GlProgram glProgram = this.f27934i;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(glProgram.f25599a, f27926p[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.m9481a(3553, iArr[i]);
                }
                GlUtil.m9482b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.f27933g.getAndSet(null);
            if (videoDecoderOutputBuffer == null && this.f27936n == null) {
                return;
            }
            if (videoDecoderOutputBuffer != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.f27936n;
                if (videoDecoderOutputBuffer2 != null) {
                    videoDecoderOutputBuffer2.getClass();
                    throw null;
                }
                this.f27936n = videoDecoderOutputBuffer;
            }
            this.f27936n.getClass();
            GLES20.glUniformMatrix3fv(this.f27935j, 1, false, f27925o, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f27930c;
            try {
                GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f27934i = glProgram;
                GLES20.glVertexAttribPointer(glProgram.m9480b("in_pos"), 2, 5126, false, 0, (Buffer) f27927q);
                iArr[0] = this.f27934i.m9480b("in_tc_y");
                iArr[1] = this.f27934i.m9480b("in_tc_u");
                iArr[2] = this.f27934i.m9480b("in_tc_v");
                this.f27935j = GLES20.glGetUniformLocation(this.f27934i.f25599a, "mColorConversion");
                GlUtil.m9482b();
                m10740a();
                GlUtil.m9482b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        super(context, null);
        Renderer renderer = new Renderer(this);
        this.f27924a = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        Renderer renderer = this.f27924a;
        if (((VideoDecoderOutputBuffer) renderer.f27933g.getAndSet(videoDecoderOutputBuffer)) != null) {
            throw null;
        }
        renderer.f27928a.requestRender();
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
