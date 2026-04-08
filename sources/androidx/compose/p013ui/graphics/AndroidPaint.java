package androidx.compose.p013ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidPaint implements Paint {

    /* JADX INFO: renamed from: a */
    public final Paint f17548a;

    /* JADX INFO: renamed from: b */
    public int f17549b = 3;

    /* JADX INFO: renamed from: c */
    public Shader f17550c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f17551d;

    /* JADX INFO: renamed from: e */
    public PathEffect f17552e;

    public AndroidPaint(Paint paint) {
        this.f17548a = paint;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: a */
    public final float mo5120a() {
        return this.f17548a.getAlpha() / 255.0f;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: b */
    public final void mo5121b(float f) {
        this.f17548a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: c */
    public final long mo5122c() {
        return ColorKt.m5193b(this.f17548a.getColor());
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Paint getF17548a() {
        return this.f17548a;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: e */
    public final void mo5124e(Shader shader) {
        this.f17550c = shader;
        this.f17548a.setShader(shader);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Shader getF17550c() {
        return this.f17550c;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: g */
    public final void mo5126g(ColorFilter colorFilter) {
        this.f17551d = colorFilter;
        this.f17548a.setColorFilter(colorFilter != null ? colorFilter.f17586a : null);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* JADX INFO: renamed from: h */
    public final void mo5127h(long j) {
        this.f17548a.setColor(ColorKt.m5201j(j));
    }

    /* JADX INFO: renamed from: i */
    public final int m5128i() {
        Paint.Cap strokeCap = this.f17548a.getStrokeCap();
        int i = strokeCap == null ? -1 : AndroidPaint_androidKt.WhenMappings.f17553a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final int m5129j() {
        Paint.Join strokeJoin = this.f17548a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AndroidPaint_androidKt.WhenMappings.f17554b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public final void m5130k(int i) {
        if (this.f17549b == i) {
            return;
        }
        this.f17549b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.f17548a;
        if (i2 >= 29) {
            AbstractC1221b.m5292f(paint, AndroidBlendMode_androidKt.m5088a(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m5089b(i)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5131l(int i) {
        this.f17548a.setFilterBitmap(!(i == 0));
    }

    /* JADX INFO: renamed from: m */
    public final void m5132m(PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        this.f17548a.setPathEffect(androidPathEffect != null ? androidPathEffect.f17559a : null);
        this.f17552e = pathEffect;
    }

    /* JADX INFO: renamed from: n */
    public final void m5133n(int i) {
        this.f17548a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: o */
    public final void m5134o(int i) {
        this.f17548a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: p */
    public final void m5135p(float f) {
        this.f17548a.setStrokeMiter(f);
    }

    /* JADX INFO: renamed from: q */
    public final void m5136q(float f) {
        this.f17548a.setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: r */
    public final void m5137r(int i) {
        this.f17548a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
