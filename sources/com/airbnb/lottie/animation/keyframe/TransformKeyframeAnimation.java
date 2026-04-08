package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.ScaleXY;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TransformKeyframeAnimation {

    /* JADX INFO: renamed from: a */
    public final Matrix f34283a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f34284b;

    /* JADX INFO: renamed from: c */
    public final Matrix f34285c;

    /* JADX INFO: renamed from: d */
    public final Matrix f34286d;

    /* JADX INFO: renamed from: e */
    public final float[] f34287e;

    /* JADX INFO: renamed from: f */
    public final BaseKeyframeAnimation f34288f;

    /* JADX INFO: renamed from: g */
    public final BaseKeyframeAnimation f34289g;

    /* JADX INFO: renamed from: h */
    public final BaseKeyframeAnimation f34290h;

    /* JADX INFO: renamed from: i */
    public final BaseKeyframeAnimation f34291i;

    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation f34292j;

    /* JADX INFO: renamed from: k */
    public final FloatKeyframeAnimation f34293k;

    /* JADX INFO: renamed from: l */
    public final FloatKeyframeAnimation f34294l;

    /* JADX INFO: renamed from: m */
    public final BaseKeyframeAnimation f34295m;

    /* JADX INFO: renamed from: n */
    public final BaseKeyframeAnimation f34296n;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        AnimatablePathValue animatablePathValue = animatableTransform.f34521a;
        this.f34288f = animatablePathValue == null ? null : animatablePathValue.mo12648j();
        AnimatableValue animatableValue = animatableTransform.f34522b;
        this.f34289g = animatableValue == null ? null : animatableValue.mo12648j();
        AnimatableScaleValue animatableScaleValue = animatableTransform.f34523c;
        this.f34290h = animatableScaleValue == null ? null : animatableScaleValue.mo12648j();
        AnimatableFloatValue animatableFloatValue = animatableTransform.f34524d;
        this.f34291i = animatableFloatValue == null ? null : animatableFloatValue.mo12648j();
        AnimatableFloatValue animatableFloatValue2 = animatableTransform.f34526f;
        FloatKeyframeAnimation floatKeyframeAnimation = animatableFloatValue2 == null ? null : (FloatKeyframeAnimation) animatableFloatValue2.mo12648j();
        this.f34293k = floatKeyframeAnimation;
        if (floatKeyframeAnimation != null) {
            this.f34284b = new Matrix();
            this.f34285c = new Matrix();
            this.f34286d = new Matrix();
            this.f34287e = new float[9];
        } else {
            this.f34284b = null;
            this.f34285c = null;
            this.f34286d = null;
            this.f34287e = null;
        }
        AnimatableFloatValue animatableFloatValue3 = animatableTransform.f34527g;
        this.f34294l = animatableFloatValue3 == null ? null : (FloatKeyframeAnimation) animatableFloatValue3.mo12648j();
        AnimatableIntegerValue animatableIntegerValue = animatableTransform.f34525e;
        if (animatableIntegerValue != null) {
            this.f34292j = animatableIntegerValue.mo12648j();
        }
        AnimatableFloatValue animatableFloatValue4 = animatableTransform.f34528h;
        if (animatableFloatValue4 != null) {
            this.f34295m = animatableFloatValue4.mo12648j();
        } else {
            this.f34295m = null;
        }
        AnimatableFloatValue animatableFloatValue5 = animatableTransform.f34529i;
        if (animatableFloatValue5 != null) {
            this.f34296n = animatableFloatValue5.mo12648j();
        } else {
            this.f34296n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12622a(BaseLayer baseLayer) {
        baseLayer.m12656e(this.f34292j);
        baseLayer.m12656e(this.f34295m);
        baseLayer.m12656e(this.f34296n);
        baseLayer.m12656e(this.f34288f);
        baseLayer.m12656e(this.f34289g);
        baseLayer.m12656e(this.f34290h);
        baseLayer.m12656e(this.f34291i);
        baseLayer.m12656e(this.f34293k);
        baseLayer.m12656e(this.f34294l);
    }

    /* JADX INFO: renamed from: b */
    public final void m12623b(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.f34292j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f34295m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f34296n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f34288f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.f34289g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.f34290h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.m12597a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = this.f34291i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.m12597a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f34293k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.m12597a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f34294l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.m12597a(animationListener);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12624c() {
        for (int i = 0; i < 9; i++) {
            this.f34287e[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Matrix m12625d() {
        PointF pointF;
        PointF pointF2;
        Matrix matrix = this.f34283a;
        matrix.reset();
        BaseKeyframeAnimation baseKeyframeAnimation = this.f34289g;
        if (baseKeyframeAnimation != null && (pointF2 = (PointF) baseKeyframeAnimation.mo12601e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f34291i;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? ((Float) baseKeyframeAnimation2.mo12601e()).floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).m12615j();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f34293k != null) {
            float fCos = this.f34294l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.m12615j()) + 90.0f));
            float fSin = this.f34294l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.m12615j()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.m12615j()));
            m12624c();
            float[] fArr = this.f34287e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f34284b;
            matrix2.setValues(fArr);
            m12624c();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f34285c;
            matrix3.setValues(fArr);
            m12624c();
            fArr[0] = fCos;
            fArr[1] = f2;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f34286d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f34290h;
        if (baseKeyframeAnimation3 != null) {
            ScaleXY scaleXY = (ScaleXY) baseKeyframeAnimation3.mo12601e();
            float f3 = scaleXY.f34902a;
            if (f3 != 1.0f || scaleXY.f34903b != 1.0f) {
                matrix.preScale(f3, scaleXY.f34903b);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f34288f;
        if (baseKeyframeAnimation4 != null && (((pointF = (PointF) baseKeyframeAnimation4.mo12601e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m12626e(float f) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.f34289g;
        PointF pointF = baseKeyframeAnimation == null ? null : (PointF) baseKeyframeAnimation.mo12601e();
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f34290h;
        ScaleXY scaleXY = baseKeyframeAnimation2 == null ? null : (ScaleXY) baseKeyframeAnimation2.mo12601e();
        Matrix matrix = this.f34283a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (scaleXY != null) {
            double d = f;
            matrix.preScale((float) Math.pow(scaleXY.f34902a, d), (float) Math.pow(scaleXY.f34903b, d));
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f34291i;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation3.mo12601e()).floatValue();
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.f34288f;
            PointF pointF2 = baseKeyframeAnimation4 != null ? (PointF) baseKeyframeAnimation4.mo12601e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
