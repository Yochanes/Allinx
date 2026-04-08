package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.PerformanceTracker;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: A */
    public float f34645A;

    /* JADX INFO: renamed from: B */
    public BlurMaskFilter f34646B;

    /* JADX INFO: renamed from: a */
    public final Path f34647a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f34648b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f34649c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final LPaint f34650d = new LPaint(1);

    /* JADX INFO: renamed from: e */
    public final LPaint f34651e;

    /* JADX INFO: renamed from: f */
    public final LPaint f34652f;

    /* JADX INFO: renamed from: g */
    public final LPaint f34653g;

    /* JADX INFO: renamed from: h */
    public final LPaint f34654h;

    /* JADX INFO: renamed from: i */
    public final RectF f34655i;

    /* JADX INFO: renamed from: j */
    public final RectF f34656j;

    /* JADX INFO: renamed from: k */
    public final RectF f34657k;

    /* JADX INFO: renamed from: l */
    public final RectF f34658l;

    /* JADX INFO: renamed from: m */
    public final RectF f34659m;

    /* JADX INFO: renamed from: n */
    public final Matrix f34660n;

    /* JADX INFO: renamed from: o */
    public final LottieDrawable f34661o;

    /* JADX INFO: renamed from: p */
    public final Layer f34662p;

    /* JADX INFO: renamed from: q */
    public final MaskKeyframeAnimation f34663q;

    /* JADX INFO: renamed from: r */
    public final FloatKeyframeAnimation f34664r;

    /* JADX INFO: renamed from: s */
    public BaseLayer f34665s;

    /* JADX INFO: renamed from: t */
    public BaseLayer f34666t;

    /* JADX INFO: renamed from: u */
    public List f34667u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f34668v;

    /* JADX INFO: renamed from: w */
    public final TransformKeyframeAnimation f34669w;

    /* JADX INFO: renamed from: x */
    public boolean f34670x;

    /* JADX INFO: renamed from: y */
    public boolean f34671y;

    /* JADX INFO: renamed from: z */
    public LPaint f34672z;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.BaseLayer$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C24171 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34673a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f34674b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f34674b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34674b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34674b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34674b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f34673a = iArr2;
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34673a[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34673a[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34673a[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34673a[3] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34673a[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34673a[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f34651e = new LPaint(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f34652f = new LPaint(mode2);
        LPaint lPaint = new LPaint(1);
        this.f34653g = lPaint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        LPaint lPaint2 = new LPaint();
        lPaint2.setXfermode(new PorterDuffXfermode(mode3));
        this.f34654h = lPaint2;
        this.f34655i = new RectF();
        this.f34656j = new RectF();
        this.f34657k = new RectF();
        this.f34658l = new RectF();
        this.f34659m = new RectF();
        this.f34660n = new Matrix();
        this.f34668v = new ArrayList();
        this.f34670x = true;
        this.f34645A = 0.0f;
        this.f34661o = lottieDrawable;
        this.f34662p = layer;
        if (layer.f34707u == Layer.MatteType.f34716b) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        AnimatableTransform animatableTransform = layer.f34695i;
        animatableTransform.getClass();
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f34669w = transformKeyframeAnimation;
        transformKeyframeAnimation.m12623b(this);
        List list = layer.f34694h;
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(list);
            this.f34663q = maskKeyframeAnimation;
            Iterator it = maskKeyframeAnimation.f34265a.iterator();
            while (it.hasNext()) {
                ((BaseKeyframeAnimation) it.next()).m12597a(this);
            }
            for (BaseKeyframeAnimation baseKeyframeAnimation : this.f34663q.f34266b) {
                m12656e(baseKeyframeAnimation);
                baseKeyframeAnimation.m12597a(this);
            }
        }
        Layer layer2 = this.f34662p;
        if (layer2.f34706t.isEmpty()) {
            if (true != this.f34670x) {
                this.f34670x = true;
                this.f34661o.invalidateSelf();
                return;
            }
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(layer2.f34706t);
        this.f34664r = floatKeyframeAnimation;
        floatKeyframeAnimation.f34245b = true;
        floatKeyframeAnimation.m12597a(new C2422a(this));
        boolean z2 = ((Float) this.f34664r.mo12601e()).floatValue() == 1.0f;
        if (z2 != this.f34670x) {
            this.f34670x = z2;
            this.f34661o.invalidateSelf();
        }
        m12656e(this.f34664r);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* JADX INFO: renamed from: a */
    public final void mo12584a() {
        this.f34661o.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo12586d(RectF rectF, Matrix matrix, boolean z2) {
        this.f34655i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m12657g();
        Matrix matrix2 = this.f34660n;
        matrix2.set(matrix);
        if (z2) {
            List list = this.f34667u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((BaseLayer) this.f34667u.get(size)).f34669w.m12625d());
                }
            } else {
                BaseLayer baseLayer = this.f34666t;
                if (baseLayer != null) {
                    matrix2.preConcat(baseLayer.f34669w.m12625d());
                }
            }
        }
        matrix2.preConcat(this.f34669w.m12625d());
    }

    /* JADX INFO: renamed from: e */
    public final void m12656e(BaseKeyframeAnimation baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.f34668v.add(baseKeyframeAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo12587f(Canvas canvas, Matrix matrix, int i) {
        int i2;
        float f;
        int i3;
        LPaint lPaint;
        MaskKeyframeAnimation maskKeyframeAnimation;
        Integer num;
        int i4 = 1;
        if (this.f34670x) {
            Layer layer = this.f34662p;
            if (layer.f34708v) {
                return;
            }
            m12657g();
            Matrix matrix2 = this.f34648b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f34667u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((BaseLayer) this.f34667u.get(size)).f34669w.m12625d());
            }
            TransformKeyframeAnimation transformKeyframeAnimation = this.f34669w;
            BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.f34292j;
            int iIntValue = (int) ((((i / 255.0f) * ((baseKeyframeAnimation == null || (num = (Integer) baseKeyframeAnimation.mo12601e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (!(this.f34665s != null) && !m12662l()) {
                matrix2.preConcat(transformKeyframeAnimation.m12625d());
                mo12659i(canvas, matrix2, iIntValue);
                m12663m();
                return;
            }
            RectF rectF = this.f34655i;
            mo12586d(rectF, matrix2, false);
            if (this.f34665s != null && layer.f34707u != Layer.MatteType.f34716b) {
                RectF rectF2 = this.f34658l;
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f34665s.mo12586d(rectF2, matrix, true);
                if (!rectF.intersect(rectF2)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(transformKeyframeAnimation.m12625d());
            RectF rectF3 = this.f34657k;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM12662l = m12662l();
            Path path = this.f34647a;
            MaskKeyframeAnimation maskKeyframeAnimation2 = this.f34663q;
            int i5 = 3;
            int i6 = 2;
            if (zM12662l) {
                int size2 = maskKeyframeAnimation2.f34267c.size();
                int i7 = 0;
                while (i7 < size2) {
                    Mask mask = (Mask) maskKeyframeAnimation2.f34267c.get(i7);
                    Path path2 = (Path) ((BaseKeyframeAnimation) maskKeyframeAnimation2.f34265a.get(i7)).mo12601e();
                    if (path2 == null) {
                        i3 = i4;
                    } else {
                        path.set(path2);
                        path.transform(matrix2);
                        int iOrdinal = mask.f34563a.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != i4) {
                                if (iOrdinal != i6) {
                                    if (iOrdinal == i5) {
                                    }
                                    RectF rectF4 = this.f34659m;
                                    path.computeBounds(rectF4, false);
                                    if (i7 != 0) {
                                        rectF3.set(rectF4);
                                        i3 = i4;
                                    } else {
                                        i3 = i4;
                                        rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                    }
                                }
                            }
                            i2 = i4;
                            break;
                        }
                        if (mask.f34566d) {
                            i2 = i4;
                            break;
                        }
                        RectF rectF42 = this.f34659m;
                        path.computeBounds(rectF42, false);
                        if (i7 != 0) {
                        }
                    }
                    i7++;
                    i4 = i3;
                    i5 = 3;
                    i6 = 2;
                }
                i2 = i4;
                if (rectF.intersect(rectF3)) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            } else {
                i2 = 1;
                f = 0.0f;
            }
            RectF rectF5 = this.f34656j;
            rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.f34649c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(f, f, f, f);
            }
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                LPaint lPaint2 = this.f34650d;
                lPaint2.setAlpha(255);
                ThreadLocal threadLocal = Utils.f34879a;
                canvas.saveLayer(rectF, lPaint2);
                m12658h(canvas);
                mo12659i(canvas, matrix2, iIntValue);
                if (m12662l()) {
                    LPaint lPaint3 = this.f34651e;
                    canvas.saveLayer(rectF, lPaint3);
                    if (Build.VERSION.SDK_INT < 28) {
                        m12658h(canvas);
                    }
                    int i8 = 0;
                    while (i8 < maskKeyframeAnimation2.f34267c.size()) {
                        List list = maskKeyframeAnimation2.f34267c;
                        Mask mask2 = (Mask) list.get(i8);
                        ArrayList arrayList = maskKeyframeAnimation2.f34265a;
                        BaseKeyframeAnimation baseKeyframeAnimation2 = (BaseKeyframeAnimation) arrayList.get(i8);
                        BaseKeyframeAnimation baseKeyframeAnimation3 = (BaseKeyframeAnimation) maskKeyframeAnimation2.f34266b.get(i8);
                        int iOrdinal2 = mask2.f34563a.ordinal();
                        int i9 = i8;
                        LPaint lPaint4 = this.f34652f;
                        boolean z2 = mask2.f34566d;
                        if (iOrdinal2 != 0) {
                            maskKeyframeAnimation = maskKeyframeAnimation2;
                            if (iOrdinal2 == i2) {
                                if (i9 == 0) {
                                    lPaint2.setColor(-16777216);
                                    lPaint2.setAlpha(255);
                                    canvas.drawRect(rectF, lPaint2);
                                }
                                if (z2) {
                                    ThreadLocal threadLocal2 = Utils.f34879a;
                                    canvas.saveLayer(rectF, lPaint4);
                                    canvas.drawRect(rectF, lPaint2);
                                    lPaint4.setAlpha((int) (((Integer) baseKeyframeAnimation3.mo12601e()).intValue() * 2.55f));
                                    path.set((Path) baseKeyframeAnimation2.mo12601e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, lPaint4);
                                    canvas.restore();
                                } else {
                                    path.set((Path) baseKeyframeAnimation2.mo12601e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, lPaint4);
                                }
                            } else if (iOrdinal2 != 2) {
                                if (iOrdinal2 == 3 && !arrayList.isEmpty()) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= list.size()) {
                                            lPaint2.setAlpha(255);
                                            canvas.drawRect(rectF, lPaint2);
                                            break;
                                        } else if (((Mask) list.get(i10)).f34563a != Mask.MaskMode.f34570d) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            } else if (z2) {
                                ThreadLocal threadLocal3 = Utils.f34879a;
                                canvas.saveLayer(rectF, lPaint3);
                                canvas.drawRect(rectF, lPaint2);
                                lPaint4.setAlpha((int) (((Integer) baseKeyframeAnimation3.mo12601e()).intValue() * 2.55f));
                                path.set((Path) baseKeyframeAnimation2.mo12601e());
                                path.transform(matrix2);
                                canvas.drawPath(path, lPaint4);
                                canvas.restore();
                            } else {
                                ThreadLocal threadLocal4 = Utils.f34879a;
                                canvas.saveLayer(rectF, lPaint3);
                                path.set((Path) baseKeyframeAnimation2.mo12601e());
                                path.transform(matrix2);
                                lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.mo12601e()).intValue() * 2.55f));
                                canvas.drawPath(path, lPaint2);
                                canvas.restore();
                            }
                        } else {
                            maskKeyframeAnimation = maskKeyframeAnimation2;
                            if (z2) {
                                ThreadLocal threadLocal5 = Utils.f34879a;
                                canvas.saveLayer(rectF, lPaint2);
                                canvas.drawRect(rectF, lPaint2);
                                path.set((Path) baseKeyframeAnimation2.mo12601e());
                                path.transform(matrix2);
                                lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.mo12601e()).intValue() * 2.55f));
                                canvas.drawPath(path, lPaint4);
                                canvas.restore();
                            } else {
                                path.set((Path) baseKeyframeAnimation2.mo12601e());
                                path.transform(matrix2);
                                lPaint2.setAlpha((int) (((Integer) baseKeyframeAnimation3.mo12601e()).intValue() * 2.55f));
                                canvas.drawPath(path, lPaint2);
                            }
                        }
                        i2 = 1;
                        i8 = i9 + 1;
                        maskKeyframeAnimation2 = maskKeyframeAnimation;
                    }
                    canvas.restore();
                }
                if (this.f34665s != null) {
                    canvas.saveLayer(rectF, this.f34653g);
                    m12658h(canvas);
                    this.f34665s.mo12587f(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f34671y && (lPaint = this.f34672z) != null) {
                lPaint.setStyle(Paint.Style.STROKE);
                this.f34672z.setColor(-251901);
                this.f34672z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.f34672z);
                this.f34672z.setStyle(Paint.Style.FILL);
                this.f34672z.setColor(1357638635);
                canvas.drawRect(rectF, this.f34672z);
            }
            m12663m();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12657g() {
        if (this.f34667u != null) {
            return;
        }
        if (this.f34666t == null) {
            this.f34667u = Collections.EMPTY_LIST;
            return;
        }
        this.f34667u = new ArrayList();
        for (BaseLayer baseLayer = this.f34666t; baseLayer != null; baseLayer = baseLayer.f34666t) {
            this.f34667u.add(baseLayer);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12658h(Canvas canvas) {
        RectF rectF = this.f34655i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f34654h);
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo12659i(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: renamed from: j */
    public BlurEffect mo12660j() {
        return this.f34662p.f34709w;
    }

    /* JADX INFO: renamed from: k */
    public DropShadowEffect mo12661k() {
        return this.f34662p.f34710x;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12662l() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.f34663q;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.f34265a.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final void m12663m() {
        PerformanceTracker performanceTracker = this.f34661o.f34071a.f34039a;
        String str = this.f34662p.f34689c;
        performanceTracker.getClass();
    }

    /* JADX INFO: renamed from: n */
    public void mo12664n(boolean z2) {
        if (z2 && this.f34672z == null) {
            this.f34672z = new LPaint();
        }
        this.f34671y = z2;
    }

    /* JADX INFO: renamed from: o */
    public void mo12665o(float f) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f34669w;
        BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.f34292j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = transformKeyframeAnimation.f34295m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = transformKeyframeAnimation.f34296n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = transformKeyframeAnimation.f34288f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = transformKeyframeAnimation.f34289g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = transformKeyframeAnimation.f34290h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.mo12605i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = transformKeyframeAnimation.f34291i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.mo12605i(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = transformKeyframeAnimation.f34293k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.mo12605i(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = transformKeyframeAnimation.f34294l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.mo12605i(f);
        }
        MaskKeyframeAnimation maskKeyframeAnimation = this.f34663q;
        if (maskKeyframeAnimation != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = maskKeyframeAnimation.f34265a;
                if (i >= arrayList.size()) {
                    break;
                }
                ((BaseKeyframeAnimation) arrayList.get(i)).mo12605i(f);
                i++;
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.f34664r;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.mo12605i(f);
        }
        BaseLayer baseLayer = this.f34665s;
        if (baseLayer != null) {
            baseLayer.mo12665o(f);
        }
        ArrayList arrayList2 = this.f34668v;
        arrayList2.size();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((BaseKeyframeAnimation) arrayList2.get(i2)).mo12605i(f);
        }
        arrayList2.size();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* JADX INFO: renamed from: b */
    public final void mo12585b(List list, List list2) {
    }
}
