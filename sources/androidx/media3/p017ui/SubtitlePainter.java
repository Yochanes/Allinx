package androidx.media3.p017ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SubtitlePainter {

    /* JADX INFO: renamed from: A */
    public int f30073A;

    /* JADX INFO: renamed from: B */
    public int f30074B;

    /* JADX INFO: renamed from: C */
    public int f30075C;

    /* JADX INFO: renamed from: D */
    public int f30076D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f30077E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f30078F;

    /* JADX INFO: renamed from: G */
    public int f30079G;

    /* JADX INFO: renamed from: H */
    public int f30080H;

    /* JADX INFO: renamed from: I */
    public int f30081I;

    /* JADX INFO: renamed from: J */
    public Rect f30082J;

    /* JADX INFO: renamed from: a */
    public final float f30083a;

    /* JADX INFO: renamed from: b */
    public final float f30084b;

    /* JADX INFO: renamed from: c */
    public final float f30085c;

    /* JADX INFO: renamed from: d */
    public final float f30086d;

    /* JADX INFO: renamed from: e */
    public final float f30087e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f30088f;

    /* JADX INFO: renamed from: g */
    public final Paint f30089g;

    /* JADX INFO: renamed from: h */
    public final Paint f30090h;

    /* JADX INFO: renamed from: i */
    public CharSequence f30091i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f30092j;

    /* JADX INFO: renamed from: k */
    public Bitmap f30093k;

    /* JADX INFO: renamed from: l */
    public float f30094l;

    /* JADX INFO: renamed from: m */
    public int f30095m;

    /* JADX INFO: renamed from: n */
    public int f30096n;

    /* JADX INFO: renamed from: o */
    public float f30097o;

    /* JADX INFO: renamed from: p */
    public int f30098p;

    /* JADX INFO: renamed from: q */
    public float f30099q;

    /* JADX INFO: renamed from: r */
    public float f30100r;

    /* JADX INFO: renamed from: s */
    public int f30101s;

    /* JADX INFO: renamed from: t */
    public int f30102t;

    /* JADX INFO: renamed from: u */
    public int f30103u;

    /* JADX INFO: renamed from: v */
    public int f30104v;

    /* JADX INFO: renamed from: w */
    public int f30105w;

    /* JADX INFO: renamed from: x */
    public float f30106x;

    /* JADX INFO: renamed from: y */
    public float f30107y;

    /* JADX INFO: renamed from: z */
    public float f30108z;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f30087e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f30086d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f30083a = fRound;
        this.f30084b = fRound;
        this.f30085c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f30088f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f30089g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f30090h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m11175a(Canvas canvas, boolean z2) {
        Canvas canvas2;
        if (!z2) {
            this.f30082J.getClass();
            this.f30093k.getClass();
            canvas.drawBitmap(this.f30093k, (Rect) null, this.f30082J, this.f30090h);
            return;
        }
        StaticLayout staticLayout = this.f30077E;
        StaticLayout staticLayout2 = this.f30078F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f30079G, this.f30080H);
        if (Color.alpha(this.f30103u) > 0) {
            Paint paint = this.f30089g;
            paint.setColor(this.f30103u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f30081I, 0.0f, staticLayout.getWidth() + this.f30081I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i = this.f30105w;
        TextPaint textPaint = this.f30088f;
        if (i == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f30083a);
            textPaint.setColor(this.f30104v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f30084b;
            if (i == 2) {
                float f2 = this.f30085c;
                textPaint.setShadowLayer(f, f2, f2, this.f30104v);
            } else if (i == 3 || i == 4) {
                boolean z3 = i == 3;
                int i2 = z3 ? -1 : this.f30104v;
                int i3 = z3 ? this.f30104v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f30101s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i2);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i3);
            }
        }
        textPaint.setColor(this.f30101s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
