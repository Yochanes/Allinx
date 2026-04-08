package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: a */
    public final LPaint f34133a;

    /* JADX INFO: renamed from: b */
    public final RectF f34134b;

    /* JADX INFO: renamed from: c */
    public final Matrix f34135c;

    /* JADX INFO: renamed from: d */
    public final Path f34136d;

    /* JADX INFO: renamed from: e */
    public final RectF f34137e;

    /* JADX INFO: renamed from: f */
    public final boolean f34138f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f34139g;

    /* JADX INFO: renamed from: h */
    public final LottieDrawable f34140h;

    /* JADX INFO: renamed from: i */
    public ArrayList f34141i;

    /* JADX INFO: renamed from: j */
    public final TransformKeyframeAnimation f34142j;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup, LottieComposition lottieComposition) {
        AnimatableTransform animatableTransform;
        String str = shapeGroup.f34614a;
        List list = shapeGroup.f34615b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content contentMo12653a = ((ContentModel) list.get(i2)).mo12653a(lottieDrawable, lottieComposition, baseLayer);
            if (contentMo12653a != null) {
                arrayList.add(contentMo12653a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                animatableTransform = null;
                break;
            }
            ContentModel contentModel = (ContentModel) list.get(i);
            if (contentModel instanceof AnimatableTransform) {
                animatableTransform = (AnimatableTransform) contentModel;
                break;
            }
            i++;
        }
        this(lottieDrawable, baseLayer, str, shapeGroup.f34616c, arrayList, animatableTransform);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* JADX INFO: renamed from: a */
    public final void mo12584a() {
        this.f34140h.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* JADX INFO: renamed from: b */
    public final void mo12585b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f34139g;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            Content content = (Content) arrayList.get(size2);
            content.mo12585b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(content);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* JADX INFO: renamed from: d */
    public final void mo12586d(RectF rectF, Matrix matrix, boolean z2) {
        Matrix matrix2 = this.f34135c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f34142j;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.m12625d());
        }
        RectF rectF2 = this.f34137e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f34139g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).mo12586d(rectF2, matrix2, z2);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m12589e() {
        if (this.f34141i == null) {
            this.f34141i = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f34139g;
                if (i >= arrayList.size()) {
                    break;
                }
                Content content = (Content) arrayList.get(i);
                if (content instanceof PathContent) {
                    this.f34141i.add((PathContent) content);
                }
                i++;
            }
        }
        return this.f34141i;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* JADX INFO: renamed from: f */
    public final void mo12587f(Canvas canvas, Matrix matrix, int i) {
        if (this.f34138f) {
            return;
        }
        Matrix matrix2 = this.f34135c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f34142j;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.m12625d());
            i = (int) (((((transformKeyframeAnimation.f34292j == null ? 100 : ((Integer) r9.mo12601e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = this.f34140h.f34085t;
        ArrayList arrayList = this.f34139g;
        boolean z3 = false;
        if (z2) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i2) instanceof DrawingContent) || (i3 = i3 + 1) < 2) {
                    i2++;
                } else if (i != 255) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            RectF rectF = this.f34134b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo12586d(rectF, matrix2, true);
            LPaint lPaint = this.f34133a;
            lPaint.setAlpha(i);
            ThreadLocal threadLocal = Utils.f34879a;
            canvas.saveLayer(rectF, lPaint);
        }
        if (z3) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).mo12587f(canvas, matrix2, i);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Matrix matrix = this.f34135c;
        matrix.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f34142j;
        if (transformKeyframeAnimation != null) {
            matrix.set(transformKeyframeAnimation.m12625d());
        }
        Path path = this.f34136d;
        path.reset();
        if (!this.f34138f) {
            ArrayList arrayList = this.f34139g;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Content content = (Content) arrayList.get(size);
                if (content instanceof PathContent) {
                    path.addPath(((PathContent) content).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z2, ArrayList arrayList, AnimatableTransform animatableTransform) {
        this.f34133a = new LPaint();
        this.f34134b = new RectF();
        this.f34135c = new Matrix();
        this.f34136d = new Path();
        this.f34137e = new RectF();
        this.f34140h = lottieDrawable;
        this.f34138f = z2;
        this.f34139g = arrayList;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
            this.f34142j = transformKeyframeAnimation;
            transformKeyframeAnimation.m12622a(baseLayer);
            transformKeyframeAnimation.m12623b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof GreedyContent) {
                arrayList2.add((GreedyContent) content);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList2.get(size2)).mo12592e(arrayList.listIterator(arrayList.size()));
        }
    }
}
