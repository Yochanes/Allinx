package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Projection {

    /* JADX INFO: renamed from: a */
    public final Mesh f28030a;

    /* JADX INFO: renamed from: b */
    public final Mesh f28031b;

    /* JADX INFO: renamed from: c */
    public final int f28032c;

    /* JADX INFO: renamed from: d */
    public final boolean f28033d;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Mesh {

        /* JADX INFO: renamed from: a */
        public final SubMesh[] f28034a;

        public Mesh(SubMesh... subMeshArr) {
            this.f28034a = subMeshArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubMesh {

        /* JADX INFO: renamed from: a */
        public final int f28035a;

        /* JADX INFO: renamed from: b */
        public final int f28036b;

        /* JADX INFO: renamed from: c */
        public final float[] f28037c;

        /* JADX INFO: renamed from: d */
        public final float[] f28038d;

        public SubMesh(int i, int i2, float[] fArr, float[] fArr2) {
            this.f28035a = i;
            Assertions.m9460a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f28037c = fArr;
            this.f28038d = fArr2;
            this.f28036b = i2;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.f28030a = mesh;
        this.f28031b = mesh2;
        this.f28032c = i;
        this.f28033d = mesh == mesh2;
    }
}
