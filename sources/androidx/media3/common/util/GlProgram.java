package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GlProgram {

    /* JADX INFO: renamed from: a */
    public final int f25599a;

    /* JADX INFO: renamed from: b */
    public final Attribute[] f25600b;

    /* JADX INFO: renamed from: c */
    public final Uniform[] f25601c;

    /* JADX INFO: renamed from: d */
    public final HashMap f25602d;

    /* JADX INFO: renamed from: e */
    public final HashMap f25603e;

    /* JADX INFO: compiled from: Proguard */
    public static final class Attribute {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Uniform {
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f25599a = iGlCreateProgram;
        GlUtil.m9482b();
        m9479a(iGlCreateProgram, 35633, str);
        m9479a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.m9483c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f25602d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f25600b = new Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.f25599a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            Attribute attribute = new Attribute();
            this.f25600b[i] = attribute;
            this.f25602d.put(str3, attribute);
        }
        this.f25603e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f25599a, 35718, iArr4, 0);
        this.f25601c = new Uniform[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.f25599a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            Uniform uniform = new Uniform();
            this.f25601c[i5] = uniform;
            this.f25603e.put(str4, uniform);
        }
        GlUtil.m9482b();
    }

    /* JADX INFO: renamed from: a */
    public static void m9479a(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.m9483c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.m9482b();
    }

    /* JADX INFO: renamed from: b */
    public final int m9480b(String str) throws GlUtil.GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f25599a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GlUtil.m9482b();
        return iGlGetAttribLocation;
    }
}
