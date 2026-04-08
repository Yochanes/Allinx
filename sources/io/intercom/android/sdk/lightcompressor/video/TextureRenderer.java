package io.intercom.android.sdk.lightcompressor.video;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\fH\u0002J\b\u0010 \u001a\u00020\u0005H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/TextureRenderer;", "", "<init>", "()V", "floatSizeBytes", "", "triangleVerticesDataStrideBytes", "triangleVerticesDataPosOffset", "triangleVerticesDataUvOffset", "mTriangleVertices", "Ljava/nio/FloatBuffer;", "vertexShader", "", "fragmentShader", "mMVPMatrix", "", "mSTMatrix", "mProgram", "mTextureID", "muMVPMatrixHandle", "muSTMatrixHandle", "maPositionHandle", "maTextureHandle", "getTextureId", "drawFrame", "", "st", "Landroid/graphics/SurfaceTexture;", "surfaceCreated", "loadShader", "shaderType", "source", "createProgram", "checkGlError", "op", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextureRenderer {
    private int mProgram;

    @NotNull
    private final float[] mSTMatrix;

    @NotNull
    private FloatBuffer mTriangleVertices;
    private int maPositionHandle;
    private int maTextureHandle;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    private final int triangleVerticesDataPosOffset;
    private final int floatSizeBytes = 4;
    private final int triangleVerticesDataStrideBytes = 4 * 5;
    private final int triangleVerticesDataUvOffset = 3;

    @NotNull
    private final String vertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    @NotNull
    private final String fragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    @NotNull
    private final float[] mMVPMatrix = new float[16];
    private int mTextureID = -12345;

    public TextureRenderer() {
        float[] fArr = new float[16];
        this.mSTMatrix = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(20 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTriangleVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    private final int createProgram() {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, this.vertexShader);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, this.fragmentShader)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    private final int loadShader(int shaderType, String source) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        checkGlError("glCreateShader type=" + shaderType);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final void checkGlError(@NotNull String op) {
        Intrinsics.m18599g(op, "op");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(op + ": glError " + iGlGetError);
    }

    public final void drawFrame(@NotNull SurfaceTexture st) {
        Intrinsics.m18599g(st, "st");
        checkGlError("onDrawFrame start");
        st.getTransformMatrix(this.mSTMatrix);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mTextureID);
        this.mTriangleVertices.position(this.triangleVerticesDataPosOffset);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, this.triangleVerticesDataStrideBytes, (Buffer) this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        checkGlError("glEnableVertexAttribArray maPositionHandle");
        this.mTriangleVertices.position(this.triangleVerticesDataUvOffset);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, this.triangleVerticesDataStrideBytes, (Buffer) this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        checkGlError("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
        GLES20.glFinish();
    }

    /* JADX INFO: renamed from: getTextureId, reason: from getter */
    public final int getMTextureID() {
        return this.mTextureID;
    }

    public final void surfaceCreated() {
        int iCreateProgram = createProgram();
        this.mProgram = iCreateProgram;
        if (iCreateProgram == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(iCreateProgram, "aPosition");
        checkGlError("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        checkGlError("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        checkGlError("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        checkGlError("glGetUniformLocation uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.mTextureID = i;
        GLES20.glBindTexture(36197, i);
        checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError("glTexParameter");
    }
}
