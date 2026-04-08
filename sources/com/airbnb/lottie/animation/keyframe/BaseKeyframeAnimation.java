package com.airbnb.lottie.animation.keyframe;

import android.view.animation.BaseInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: c */
    public final KeyframesWrapper f34246c;

    /* JADX INFO: renamed from: a */
    public final ArrayList f34244a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f34245b = false;

    /* JADX INFO: renamed from: d */
    public float f34247d = 0.0f;

    /* JADX INFO: renamed from: e */
    public Object f34248e = null;

    /* JADX INFO: renamed from: f */
    public float f34249f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f34250g = -1.0f;

    /* JADX INFO: compiled from: Proguard */
    public interface AnimationListener {
        /* JADX INFO: renamed from: a */
        void mo12584a();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: a */
        public final boolean mo12606a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: b */
        public final Keyframe mo12607b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: c */
        public final boolean mo12608c(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: d */
        public final float mo12609d() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: e */
        public final float mo12610e() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface KeyframesWrapper<T> {
        /* JADX INFO: renamed from: a */
        boolean mo12606a(float f);

        /* JADX INFO: renamed from: b */
        Keyframe mo12607b();

        /* JADX INFO: renamed from: c */
        boolean mo12608c(float f);

        /* JADX INFO: renamed from: d */
        float mo12609d();

        /* JADX INFO: renamed from: e */
        float mo12610e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {

        /* JADX INFO: renamed from: a */
        public final List f34251a;

        /* JADX INFO: renamed from: c */
        public Keyframe f34253c = null;

        /* JADX INFO: renamed from: d */
        public float f34254d = -1.0f;

        /* JADX INFO: renamed from: b */
        public Keyframe f34252b = m12611f(0.0f);

        public KeyframesWrapperImpl(List list) {
            this.f34251a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: a */
        public final boolean mo12606a(float f) {
            Keyframe keyframe = this.f34253c;
            Keyframe keyframe2 = this.f34252b;
            if (keyframe == keyframe2 && this.f34254d == f) {
                return true;
            }
            this.f34253c = keyframe2;
            this.f34254d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: b */
        public final Keyframe mo12607b() {
            return this.f34252b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: c */
        public final boolean mo12608c(float f) {
            Keyframe keyframe = this.f34252b;
            if (f >= keyframe.m12785b() && f < keyframe.m12784a()) {
                return !this.f34252b.m12786c();
            }
            this.f34252b = m12611f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: d */
        public final float mo12609d() {
            return ((Keyframe) AbstractC1610a.m8729g(1, this.f34251a)).m12784a();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: e */
        public final float mo12610e() {
            return ((Keyframe) this.f34251a.get(0)).m12785b();
        }

        /* JADX INFO: renamed from: f */
        public final Keyframe m12611f(float f) {
            List list = this.f34251a;
            Keyframe keyframe = (Keyframe) AbstractC1610a.m8729g(1, list);
            if (f >= keyframe.m12785b()) {
                return keyframe;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                Keyframe keyframe2 = (Keyframe) list.get(size);
                if (this.f34252b != keyframe2 && f >= keyframe2.m12785b() && f < keyframe2.m12784a()) {
                    return keyframe2;
                }
            }
            return (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {

        /* JADX INFO: renamed from: a */
        public final Keyframe f34255a;

        /* JADX INFO: renamed from: b */
        public float f34256b = -1.0f;

        public SingleKeyframeWrapper(List list) {
            this.f34255a = (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: a */
        public final boolean mo12606a(float f) {
            if (this.f34256b == f) {
                return true;
            }
            this.f34256b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: b */
        public final Keyframe mo12607b() {
            return this.f34255a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: c */
        public final boolean mo12608c(float f) {
            return !this.f34255a.m12786c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: d */
        public final float mo12609d() {
            return this.f34255a.m12784a();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* JADX INFO: renamed from: e */
        public final float mo12610e() {
            return this.f34255a.m12785b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List list) {
        KeyframesWrapper singleKeyframeWrapper;
        if (list.isEmpty()) {
            singleKeyframeWrapper = new EmptyKeyframeWrapper();
        } else {
            singleKeyframeWrapper = list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
        }
        this.f34246c = singleKeyframeWrapper;
    }

    /* JADX INFO: renamed from: a */
    public final void m12597a(AnimationListener animationListener) {
        this.f34244a.add(animationListener);
    }

    /* JADX INFO: renamed from: b */
    public float mo12598b() {
        if (this.f34250g == -1.0f) {
            this.f34250g = this.f34246c.mo12609d();
        }
        return this.f34250g;
    }

    /* JADX INFO: renamed from: c */
    public final float m12599c() {
        Keyframe keyframeMo12607b = this.f34246c.mo12607b();
        if (keyframeMo12607b == null || keyframeMo12607b.m12786c()) {
            return 0.0f;
        }
        return keyframeMo12607b.f34887d.getInterpolation(m12600d());
    }

    /* JADX INFO: renamed from: d */
    public final float m12600d() {
        if (this.f34245b) {
            return 0.0f;
        }
        Keyframe keyframeMo12607b = this.f34246c.mo12607b();
        if (keyframeMo12607b.m12786c()) {
            return 0.0f;
        }
        return (this.f34247d - keyframeMo12607b.m12785b()) / (keyframeMo12607b.m12784a() - keyframeMo12607b.m12785b());
    }

    /* JADX INFO: renamed from: e */
    public Object mo12601e() {
        BaseInterpolator baseInterpolator;
        float fM12600d = m12600d();
        KeyframesWrapper keyframesWrapper = this.f34246c;
        if (keyframesWrapper.mo12606a(fM12600d)) {
            return this.f34248e;
        }
        Keyframe keyframeMo12607b = keyframesWrapper.mo12607b();
        BaseInterpolator baseInterpolator2 = keyframeMo12607b.f34888e;
        Object objMo12602f = (baseInterpolator2 == null || (baseInterpolator = keyframeMo12607b.f34889f) == null) ? mo12602f(keyframeMo12607b, m12599c()) : mo12603g(keyframeMo12607b, fM12600d, baseInterpolator2.getInterpolation(fM12600d), baseInterpolator.getInterpolation(fM12600d));
        this.f34248e = objMo12602f;
        return objMo12602f;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo12602f(Keyframe keyframe, float f);

    /* JADX INFO: renamed from: g */
    public Object mo12603g(Keyframe keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: h */
    public void mo12604h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34244a;
            if (i >= arrayList.size()) {
                return;
            }
            ((AnimationListener) arrayList.get(i)).mo12584a();
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo12605i(float f) {
        KeyframesWrapper keyframesWrapper = this.f34246c;
        if (keyframesWrapper.isEmpty()) {
            return;
        }
        if (this.f34249f == -1.0f) {
            this.f34249f = keyframesWrapper.mo12610e();
        }
        float f2 = this.f34249f;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f34249f = keyframesWrapper.mo12610e();
            }
            f = this.f34249f;
        } else if (f > mo12598b()) {
            f = mo12598b();
        }
        if (f == this.f34247d) {
            return;
        }
        this.f34247d = f;
        if (keyframesWrapper.mo12608c(f)) {
            mo12604h();
        }
    }
}
