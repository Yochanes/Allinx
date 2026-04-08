package coil.transition;

import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcoil/transition/NoneTransition;", "Lcoil/transition/Transition;", "Factory", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NoneTransition implements Transition {

    /* JADX INFO: renamed from: a */
    public final TransitionTarget f33982a;

    /* JADX INFO: renamed from: b */
    public final ImageResult f33983b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/transition/NoneTransition$Factory;", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Factory implements Transition.Factory {
        @Override // coil.transition.Transition.Factory
        /* JADX INFO: renamed from: a */
        public final Transition mo12521a(TransitionTarget transitionTarget, ImageResult imageResult) {
            return new NoneTransition(transitionTarget, imageResult);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public final int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public NoneTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this.f33982a = transitionTarget;
        this.f33983b = imageResult;
    }

    @Override // coil.transition.Transition
    /* JADX INFO: renamed from: a */
    public final void mo12520a() {
        ImageResult imageResult = this.f33983b;
        boolean z2 = imageResult instanceof SuccessResult;
        TransitionTarget transitionTarget = this.f33982a;
        if (z2) {
            transitionTarget.onSuccess(((SuccessResult) imageResult).f33919a);
        } else {
            if (!(imageResult instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            transitionTarget.onError(((ErrorResult) imageResult).f33829a);
        }
    }
}
