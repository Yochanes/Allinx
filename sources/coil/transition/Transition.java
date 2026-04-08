package coil.transition;

import coil.request.ImageResult;
import coil.transition.NoneTransition;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Lcoil/transition/Transition;", "", "Factory", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface Transition {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Lcoil/transition/Transition$Factory;", "", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Factory {

        /* JADX INFO: renamed from: a */
        public static final NoneTransition.Factory f33984a = new NoneTransition.Factory();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m18302d2 = {"Lcoil/transition/Transition$Factory$Companion;", "", "Lcoil/transition/Transition$Factory;", "NONE", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        /* JADX INFO: renamed from: a */
        Transition mo12521a(TransitionTarget transitionTarget, ImageResult imageResult);
    }

    /* JADX INFO: renamed from: a */
    void mo12520a();
}
