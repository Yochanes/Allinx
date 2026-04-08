package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.Format;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {

    /* JADX INFO: renamed from: n */
    public int f28062n;

    /* JADX INFO: renamed from: o */
    public SurfaceTexture f28063o;

    /* JADX INFO: renamed from: r */
    public byte[] f28066r;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f28054a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f28055b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final ProjectionRenderer f28056c = new ProjectionRenderer();

    /* JADX INFO: renamed from: d */
    public final FrameRotationQueue f28057d = new FrameRotationQueue();

    /* JADX INFO: renamed from: f */
    public final TimedValueQueue f28058f = new TimedValueQueue();

    /* JADX INFO: renamed from: g */
    public final TimedValueQueue f28059g = new TimedValueQueue();

    /* JADX INFO: renamed from: i */
    public final float[] f28060i = new float[16];

    /* JADX INFO: renamed from: j */
    public final float[] f28061j = new float[16];

    /* JADX INFO: renamed from: p */
    public volatile int f28064p = 0;

    /* JADX INFO: renamed from: q */
    public int f28065q = -1;

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m10760a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.m9482b();
            this.f28056c.m10759a();
            GlUtil.m9482b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.m9482b();
            int i = iArr[0];
            GlUtil.m9481a(36197, i);
            this.f28062n = i;
        } catch (GlUtil.GlException e) {
            Log.m9508d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28062n);
        this.f28063o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C1944a(this));
        return this.f28063o;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    /* JADX INFO: renamed from: d */
    public final void mo9869d() {
        this.f28058f.m9579b();
        FrameRotationQueue frameRotationQueue = this.f28057d;
        frameRotationQueue.f28021c.m9579b();
        frameRotationQueue.f28022d = false;
        this.f28055b.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    /* JADX INFO: renamed from: e */
    public final void mo9870e(long j, long j2, Format format, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListM10757a;
        int iM9554g;
        this.f28058f.m9578a(j2, Long.valueOf(j));
        byte[] bArr = format.f25173z;
        int i2 = format.f25134A;
        byte[] bArr2 = this.f28066r;
        int i3 = this.f28065q;
        this.f28066r = bArr;
        if (i2 == -1) {
            i2 = this.f28064p;
        }
        this.f28065q = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f28066r)) {
            return;
        }
        byte[] bArr3 = this.f28066r;
        Projection projection = null;
        if (bArr3 != null) {
            int i4 = this.f28065q;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3);
            try {
                parsableByteArray.m9547H(4);
                iM9554g = parsableByteArray.m9554g();
                parsableByteArray.m9546G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iM9554g == 1886547818) {
                parsableByteArray.m9547H(8);
                int i5 = parsableByteArray.f25645b;
                int i6 = parsableByteArray.f25646c;
                while (i5 < i6) {
                    int iM9554g2 = parsableByteArray.m9554g() + i5;
                    if (iM9554g2 > i5 && iM9554g2 <= i6) {
                        int iM9554g3 = parsableByteArray.m9554g();
                        if (iM9554g3 != 2037673328 && iM9554g3 != 1836279920) {
                            parsableByteArray.m9546G(iM9554g2);
                            i5 = iM9554g2;
                        }
                        parsableByteArray.m9545F(iM9554g2);
                        arrayListM10757a = ProjectionDecoder.m10757a(parsableByteArray);
                        break;
                    }
                    break;
                }
                arrayListM10757a = null;
            } else {
                arrayListM10757a = ProjectionDecoder.m10757a(parsableByteArray);
            }
            if (arrayListM10757a != null) {
                int size = arrayListM10757a.size();
                if (size == 1) {
                    Projection.Mesh mesh = (Projection.Mesh) arrayListM10757a.get(0);
                    projection = new Projection(mesh, mesh, i4);
                } else if (size == 2) {
                    projection = new Projection((Projection.Mesh) arrayListM10757a.get(0), (Projection.Mesh) arrayListM10757a.get(1), i4);
                }
            }
        }
        if (projection == null || !ProjectionRenderer.m10758b(projection)) {
            int i7 = this.f28065q;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    float f6 = f5;
                    int i14 = i12;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 2;
                    int i18 = 0;
                    while (i18 < i17) {
                        float f8 = i18 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double dSin = Math.sin(d2) * d;
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * dSin));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d2) * d * Math.cos(d3));
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i18) * f12) / f7;
                        if ((i13 == 0 && i18 == 0) || (i13 == 72 && i18 == 1)) {
                            System.arraycopy(fArr, i15, fArr, i19, 3);
                            i15 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i16, fArr2, i20, 2);
                            i16 += 4;
                        } else {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                        }
                        i18++;
                        i17 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    f5 = f6;
                    i12 = i14;
                    radians = f7;
                    f = f;
                }
                i8 = i12;
            }
            Projection.Mesh mesh2 = new Projection.Mesh(new Projection.SubMesh(0, 1, fArr, fArr2));
            projection = new Projection(mesh2, mesh2, i7);
        }
        this.f28059g.m9578a(j2, projection);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    /* JADX INFO: renamed from: g */
    public final void mo9871g(float[] fArr, long j) {
        this.f28057d.f28021c.m9578a(j, fArr);
    }
}
