package androidx.compose.p013ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRect;
import androidx.compose.p013ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidPath implements Path {

    /* JADX INFO: renamed from: a */
    public final Path f17555a;

    /* JADX INFO: renamed from: b */
    public RectF f17556b;

    /* JADX INFO: renamed from: c */
    public float[] f17557c;

    /* JADX INFO: renamed from: d */
    public Matrix f17558d;

    public AndroidPath(Path path) {
        this.f17555a = path;
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: a */
    public final void mo5139a(float f, float f2, float f3, float f4) {
        this.f17555a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: b */
    public final boolean mo5140b() {
        return this.f17555a.isConvex();
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: c */
    public final void mo5141c(float f, float f2) {
        this.f17555a.rMoveTo(f, f2);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    public final void close() {
        this.f17555a.close();
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: d */
    public final void mo5142d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f17555a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: e */
    public final void mo5143e(float f, float f2, float f3, float f4) {
        this.f17555a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: f */
    public final void mo5144f(float f, float f2, float f3, float f4) {
        this.f17555a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: g */
    public final void mo5145g(int i) {
        this.f17555a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: h */
    public final void mo5146h(float f, float f2, float f3, float f4) {
        this.f17555a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: i */
    public final int mo5147i() {
        return this.f17555a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: j */
    public final void mo5148j(Rect rect) {
        Path.Direction[] directionArr = Path.Direction.f17616a;
        boolean zIsNaN = Float.isNaN(rect.f17526a);
        float f = rect.f17529d;
        float f2 = rect.f17528c;
        float f3 = rect.f17527b;
        if (zIsNaN || Float.isNaN(f3) || Float.isNaN(f2) || Float.isNaN(f)) {
            AndroidPath_androidKt.m5162b("Invalid rectangle, make sure no value is NaN");
        }
        if (this.f17556b == null) {
            this.f17556b = new RectF();
        }
        RectF rectF = this.f17556b;
        Intrinsics.m18596d(rectF);
        rectF.set(rect.f17526a, f3, f2, f);
        RectF rectF2 = this.f17556b;
        Intrinsics.m18596d(rectF2);
        this.f17555a.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: k */
    public final void mo5149k(float f, float f2) {
        this.f17555a.moveTo(f, f2);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: l */
    public final void mo5150l(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f17555a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: n */
    public final void mo5151n() {
        this.f17555a.rewind();
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: o */
    public final void mo5152o(RoundRect roundRect) {
        Path.Direction[] directionArr = Path.Direction.f17616a;
        if (this.f17556b == null) {
            this.f17556b = new RectF();
        }
        RectF rectF = this.f17556b;
        Intrinsics.m18596d(rectF);
        rectF.set(roundRect.f17530a, roundRect.f17531b, roundRect.f17532c, roundRect.f17533d);
        if (this.f17557c == null) {
            this.f17557c = new float[8];
        }
        float[] fArr = this.f17557c;
        Intrinsics.m18596d(fArr);
        long j = roundRect.f17534e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = roundRect.f17535f;
        fArr[2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = roundRect.f17536g;
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = roundRect.f17537h;
        fArr[6] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        RectF rectF2 = this.f17556b;
        Intrinsics.m18596d(rectF2);
        float[] fArr2 = this.f17557c;
        Intrinsics.m18596d(fArr2);
        this.f17555a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: p */
    public final void mo5153p(long j) {
        Matrix matrix = this.f17558d;
        if (matrix == null) {
            this.f17558d = new Matrix();
        } else {
            Intrinsics.m18596d(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f17558d;
        Intrinsics.m18596d(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.f17558d;
        Intrinsics.m18596d(matrix3);
        this.f17555a.transform(matrix3);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: q */
    public final void mo5154q(float f, float f2) {
        this.f17555a.rLineTo(f, f2);
    }

    @Override // androidx.compose.p013ui.graphics.Path
    public final void reset() {
        this.f17555a.reset();
    }

    @Override // androidx.compose.p013ui.graphics.Path
    /* JADX INFO: renamed from: s */
    public final void mo5155s(float f, float f2) {
        this.f17555a.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: t */
    public final void m5156t(Path path, long j) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f17555a.addPath(((AndroidPath) path).f17555a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: u */
    public final Rect m5157u() {
        if (this.f17556b == null) {
            this.f17556b = new RectF();
        }
        RectF rectF = this.f17556b;
        Intrinsics.m18596d(rectF);
        this.f17555a.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5158v(Path path, Path path2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath) path).f17555a;
        if (path2 instanceof AndroidPath) {
            return this.f17555a.op(path3, ((AndroidPath) path2).f17555a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
