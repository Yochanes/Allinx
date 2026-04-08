package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final boolean f34238a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f34239b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ShapeTrimPath.Type f34240c;

    /* JADX INFO: renamed from: d */
    public final FloatKeyframeAnimation f34241d;

    /* JADX INFO: renamed from: e */
    public final FloatKeyframeAnimation f34242e;

    /* JADX INFO: renamed from: f */
    public final FloatKeyframeAnimation f34243f;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f34238a = shapeTrimPath.f34641e;
        this.f34240c = shapeTrimPath.f34637a;
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j = shapeTrimPath.f34638b.mo12648j();
        this.f34241d = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j;
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j2 = shapeTrimPath.f34639c.mo12648j();
        this.f34242e = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j2;
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j3 = shapeTrimPath.f34640d.mo12648j();
        this.f34243f = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j3;
        baseLayer.m12656e(baseKeyframeAnimationMo12648j);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j2);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j3);
        baseKeyframeAnimationMo12648j.m12597a(this);
        baseKeyframeAnimationMo12648j2.m12597a(this);
        baseKeyframeAnimationMo12648j3.m12597a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* JADX INFO: renamed from: a */
    public final void mo12584a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34239b;
            if (i >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i)).mo12584a();
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12596e(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.f34239b.add(animationListener);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* JADX INFO: renamed from: b */
    public final void mo12585b(List list, List list2) {
    }
}
