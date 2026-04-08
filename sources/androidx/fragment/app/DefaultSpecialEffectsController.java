package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.SpecialEffectsController;
import com.exchange.allin.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class AnimationEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: c */
        public final AnimationInfo f24490c;

        public AnimationEffect(AnimationInfo animationInfo) {
            this.f24490c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: b */
        public final void mo8908b(ViewGroup container) {
            Intrinsics.m18599g(container, "container");
            AnimationInfo animationInfo = this.f24490c;
            SpecialEffectsController.Operation operation = animationInfo.f24507a;
            View view = operation.f24775c.mView;
            view.clearAnimation();
            container.endViewTransition(view);
            animationInfo.f24507a.m9101c(this);
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: c */
        public final void mo8909c(ViewGroup container) {
            Intrinsics.m18599g(container, "container");
            AnimationInfo animationInfo = this.f24490c;
            boolean zM8916a = animationInfo.m8916a();
            SpecialEffectsController.Operation operation = animationInfo.f24507a;
            if (zM8916a) {
                operation.m9101c(this);
                return;
            }
            Context context = container.getContext();
            View view = operation.f24775c.mView;
            Intrinsics.m18598f(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorM8910b = animationInfo.m8910b(context);
            if (animationOrAnimatorM8910b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = animationOrAnimatorM8910b.f24581a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.f24773a != SpecialEffectsController.Operation.State.f24788a) {
                view.startAnimation(animation);
                operation.m9101c(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class AnimationInfo extends SpecialEffectsInfo {

        /* JADX INFO: renamed from: b */
        public final boolean f24495b;

        /* JADX INFO: renamed from: c */
        public boolean f24496c;

        /* JADX INFO: renamed from: d */
        public FragmentAnim.AnimationOrAnimator f24497d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z2) {
            super(operation);
            Intrinsics.m18599g(operation, "operation");
            this.f24495b = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final FragmentAnim.AnimationOrAnimator m8910b(Context context) {
            Animation animationLoadAnimation;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            Animator animatorLoadAnimator;
            if (this.f24496c) {
                return this.f24497d;
            }
            SpecialEffectsController.Operation operation = this.f24507a;
            Fragment fragment = operation.f24775c;
            boolean z2 = operation.f24773a == SpecialEffectsController.Operation.State.f24789b;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.f24495b ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, popEnterAnim);
                if (animationOnCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, popEnterAnim);
                    if (animatorOnCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animatorOnCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z2 ? FragmentAnim.m8940a(context, android.R.attr.activityOpenEnterAnimation) : FragmentAnim.m8940a(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? FragmentAnim.m8940a(context, android.R.attr.activityCloseEnterAnimation) : FragmentAnim.m8940a(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (zEquals) {
                                try {
                                    animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                        if (animatorLoadAnimator != null) {
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation2);
                                        }
                                    }
                                }
                                if (animationLoadAnimation != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            }
                        }
                    }
                }
            }
            this.f24497d = animationOrAnimator2;
            this.f24496c = true;
            return animationOrAnimator2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: c */
        public final AnimationInfo f24498c;

        /* JADX INFO: renamed from: d */
        public AnimatorSet f24499d;

        public AnimatorEffect(AnimationInfo animationInfo) {
            this.f24498c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: b */
        public final void mo8908b(ViewGroup container) {
            Intrinsics.m18599g(container, "container");
            AnimatorSet animatorSet = this.f24499d;
            AnimationInfo animationInfo = this.f24498c;
            if (animatorSet == null) {
                animationInfo.f24507a.m9101c(this);
                return;
            }
            SpecialEffectsController.Operation operation = animationInfo.f24507a;
            if (!operation.f24779g) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.f24506a.m8914a(animatorSet);
            }
            if (FragmentManager.m8961L(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.f24779g ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: c */
        public final void mo8909c(ViewGroup container) {
            Intrinsics.m18599g(container, "container");
            SpecialEffectsController.Operation operation = this.f24498c.f24507a;
            AnimatorSet animatorSet = this.f24499d;
            if (animatorSet == null) {
                operation.m9101c(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: d */
        public final void mo8911d(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.m18599g(backEvent, "backEvent");
            Intrinsics.m18599g(container, "container");
            SpecialEffectsController.Operation operation = this.f24498c.f24507a;
            AnimatorSet animatorSet = this.f24499d;
            if (animatorSet == null) {
                operation.m9101c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.f24775c.mTransitioning) {
                return;
            }
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jM8913a = Api24Impl.f24505a.m8913a(animatorSet);
            long j = (long) (backEvent.f60c * jM8913a);
            if (j == 0) {
                j = 1;
            }
            if (j == jM8913a) {
                j = jM8913a - 1;
            }
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.f24506a.m8915b(animatorSet, j);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: e */
        public final void mo8912e(ViewGroup container) {
            AnimatorEffect animatorEffect;
            Intrinsics.m18599g(container, "container");
            AnimationInfo animationInfo = this.f24498c;
            if (animationInfo.m8916a()) {
                return;
            }
            Context context = container.getContext();
            Intrinsics.m18598f(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorM8910b = animationInfo.m8910b(context);
            this.f24499d = animationOrAnimatorM8910b != null ? animationOrAnimatorM8910b.f24582b : null;
            SpecialEffectsController.Operation operation = animationInfo.f24507a;
            Fragment fragment = operation.f24775c;
            boolean z2 = operation.f24773a == SpecialEffectsController.Operation.State.f24790c;
            View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f24499d;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new DefaultSpecialEffectsController$AnimatorEffect$onStart$1(container, view, z2, operation, animatorEffect));
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.f24499d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api24Impl {

        /* JADX INFO: renamed from: a */
        public static final Api24Impl f24505a = new Api24Impl();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final long m8913a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.m18599g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api26Impl {

        /* JADX INFO: renamed from: a */
        public static final Api26Impl f24506a = new Api26Impl();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final void m8914a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.m18599g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public final void m8915b(@NotNull AnimatorSet animatorSet, long time) {
            Intrinsics.m18599g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class SpecialEffectsInfo {

        /* JADX INFO: renamed from: a */
        public final SpecialEffectsController.Operation f24507a;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            Intrinsics.m18599g(operation, "operation");
            this.f24507a = operation;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m8916a() {
            SpecialEffectsController.Operation operation = this.f24507a;
            View view = operation.f24775c.mView;
            SpecialEffectsController.Operation.State stateM9104a = view != null ? SpecialEffectsController.Operation.State.Companion.m9104a(view) : null;
            SpecialEffectsController.Operation.State state = operation.f24773a;
            if (stateM9104a == state) {
                return true;
            }
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f24789b;
            return (stateM9104a == state2 || state == state2) ? false : true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class TransitionEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: c */
        public final ArrayList f24508c;

        /* JADX INFO: renamed from: d */
        public final SpecialEffectsController.Operation f24509d;

        /* JADX INFO: renamed from: e */
        public final SpecialEffectsController.Operation f24510e;

        /* JADX INFO: renamed from: f */
        public final FragmentTransitionImpl f24511f;

        /* JADX INFO: renamed from: g */
        public final Object f24512g;

        /* JADX INFO: renamed from: h */
        public final ArrayList f24513h;

        /* JADX INFO: renamed from: i */
        public final ArrayList f24514i;

        /* JADX INFO: renamed from: j */
        public final ArrayMap f24515j;

        /* JADX INFO: renamed from: k */
        public final ArrayList f24516k;

        /* JADX INFO: renamed from: l */
        public final ArrayList f24517l;

        /* JADX INFO: renamed from: m */
        public final ArrayMap f24518m;

        /* JADX INFO: renamed from: n */
        public final ArrayMap f24519n;

        /* JADX INFO: renamed from: o */
        public final boolean f24520o;

        /* JADX INFO: renamed from: p */
        public final CancellationSignal f24521p = new CancellationSignal();

        /* JADX INFO: renamed from: q */
        public Object f24522q;

        /* JADX INFO: renamed from: r */
        public boolean f24523r;

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl fragmentTransitionImpl, Object obj, ArrayList arrayList2, ArrayList arrayList3, ArrayMap arrayMap, ArrayList arrayList4, ArrayList arrayList5, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z2) {
            this.f24508c = arrayList;
            this.f24509d = operation;
            this.f24510e = operation2;
            this.f24511f = fragmentTransitionImpl;
            this.f24512g = obj;
            this.f24513h = arrayList2;
            this.f24514i = arrayList3;
            this.f24515j = arrayMap;
            this.f24516k = arrayList4;
            this.f24517l = arrayList5;
            this.f24518m = arrayMap2;
            this.f24519n = arrayMap3;
            this.f24520o = z2;
        }

        /* JADX INFO: renamed from: f */
        public static void m8917f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m8917f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: a */
        public final boolean mo8918a() {
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl = this.f24511f;
            if (!fragmentTransitionImpl.mo9061l()) {
                return false;
            }
            ArrayList<TransitionInfo> arrayList = this.f24508c;
            if (!arrayList.isEmpty()) {
                for (TransitionInfo transitionInfo : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = transitionInfo.f24534b) == null || !fragmentTransitionImpl.mo9062m(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.f24512g;
            return obj2 == null || fragmentTransitionImpl.mo9062m(obj2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: b */
        public final void mo8908b(ViewGroup container) {
            Intrinsics.m18599g(container, "container");
            this.f24521p.m7645a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: c */
        public final void mo8909c(ViewGroup container) {
            Object obj;
            Intrinsics.m18599g(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList<TransitionInfo> arrayList = this.f24508c;
            if (!zIsLaidOut || this.f24523r) {
                for (TransitionInfo transitionInfo : arrayList) {
                    SpecialEffectsController.Operation operation = transitionInfo.f24507a;
                    if (FragmentManager.m8961L(2)) {
                        if (this.f24523r) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    transitionInfo.f24507a.m9101c(this);
                }
                this.f24523r = false;
                return;
            }
            Object obj2 = this.f24522q;
            FragmentTransitionImpl fragmentTransitionImpl = this.f24511f;
            SpecialEffectsController.Operation operation2 = this.f24510e;
            SpecialEffectsController.Operation operation3 = this.f24509d;
            if (obj2 != null) {
                fragmentTransitionImpl.mo9076c(obj2);
                if (FragmentManager.m8961L(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + operation3 + " to " + operation2);
                    return;
                }
                return;
            }
            Pair pairM8919g = m8919g(container, operation2, operation3);
            ArrayList arrayList2 = (ArrayList) pairM8919g.f51426a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((TransitionInfo) it.next()).f24507a);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                obj = pairM8919g.f51427b;
                if (!zHasNext) {
                    break;
                }
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
                fragmentTransitionImpl.mo9069u(operation4.f24775c, obj, this.f24521p, new RunnableC1692b(operation4, this, 1));
            }
            m8921i(arrayList2, container, new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(container, this, obj));
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + operation3 + " to " + operation2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: d */
        public final void mo8911d(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.m18599g(backEvent, "backEvent");
            Intrinsics.m18599g(container, "container");
            Object obj = this.f24522q;
            if (obj != null) {
                this.f24511f.mo9079r(obj, backEvent.f60c);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: e */
        public final void mo8912e(ViewGroup container) {
            Object obj;
            Intrinsics.m18599g(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList arrayList = this.f24508c;
            if (!zIsLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).f24507a;
                    if (FragmentManager.m8961L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            boolean zM8920h = m8920h();
            SpecialEffectsController.Operation operation2 = this.f24510e;
            SpecialEffectsController.Operation operation3 = this.f24509d;
            if (zM8920h && (obj = this.f24512g) != null && !mo8918a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + operation3 + " and " + operation2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (!mo8918a() || !m8920h()) {
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair pairM8919g = m8919g(container, operation2, operation3);
            ArrayList arrayList2 = (ArrayList) pairM8919g.f51426a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((TransitionInfo) it2.next()).f24507a);
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                Object obj2 = pairM8919g.f51427b;
                if (!zHasNext) {
                    m8921i(arrayList2, container, new DefaultSpecialEffectsController$TransitionEffect$onStart$4(this, container, obj2, objectRef));
                    return;
                }
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it3.next();
                RunnableC1694d runnableC1694d = new RunnableC1694d(objectRef, 2);
                Fragment fragment = operation4.f24775c;
                this.f24511f.mo9080v(obj2, this.f24521p, runnableC1694d, new RunnableC1692b(operation4, this, 0));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x022b  */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair m8919g(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ArrayList arrayList;
            ArrayList arrayList2;
            FragmentTransitionImpl fragmentTransitionImpl;
            Object obj;
            ArrayList arrayList3;
            Object obj2;
            TransitionInfo transitionInfo;
            Object obj3;
            ArrayList arrayList4;
            View view;
            ArrayList arrayList5;
            Iterator it;
            SpecialEffectsController.Operation operation3 = operation;
            SpecialEffectsController.Operation operation4 = operation2;
            View view2 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList6 = this.f24508c;
            Iterator it2 = arrayList6.iterator();
            View view3 = null;
            boolean z2 = false;
            while (true) {
                boolean zHasNext = it2.hasNext();
                arrayList = this.f24514i;
                arrayList2 = this.f24513h;
                fragmentTransitionImpl = this.f24511f;
                obj = this.f24512g;
                if (!zHasNext) {
                    break;
                }
                if (((TransitionInfo) it2.next()).f24536d == null || operation4 == null || operation3 == null || this.f24515j.isEmpty() || obj == null) {
                    arrayList5 = arrayList6;
                    it = it2;
                } else {
                    ArrayMap arrayMap = this.f24518m;
                    arrayList5 = arrayList6;
                    it = it2;
                    FragmentTransition.m9051a(operation3.f24775c, operation4.f24775c, this.f24520o, arrayMap);
                    OneShotPreDrawListener.m7759a(viewGroup, new RunnableC1691a(operation3, operation4, this, 1));
                    arrayList2.addAll(arrayMap.values());
                    ArrayList arrayList7 = this.f24517l;
                    if (!arrayList7.isEmpty()) {
                        Object obj4 = arrayList7.get(0);
                        Intrinsics.m18598f(obj4, "exitingNames[0]");
                        View view4 = (View) arrayMap.get((String) obj4);
                        fragmentTransitionImpl.mo9067s(view4, obj);
                        view3 = view4;
                    }
                    ArrayMap arrayMap2 = this.f24519n;
                    arrayList.addAll(arrayMap2.values());
                    ArrayList arrayList8 = this.f24516k;
                    if (!arrayList8.isEmpty()) {
                        Object obj5 = arrayList8.get(0);
                        Intrinsics.m18598f(obj5, "enteringNames[0]");
                        View view5 = (View) arrayMap2.get((String) obj5);
                        if (view5 != null) {
                            OneShotPreDrawListener.m7759a(viewGroup, new RunnableC1693c(fragmentTransitionImpl, view5, rect));
                            z2 = true;
                        }
                    }
                    fragmentTransitionImpl.mo9070w(obj, view2, arrayList2);
                    Object obj6 = this.f24512g;
                    fragmentTransitionImpl.mo9066q(obj6, null, null, obj6, arrayList);
                }
                arrayList6 = arrayList5;
                it2 = it;
            }
            ArrayList arrayList9 = arrayList6;
            ArrayList arrayList10 = arrayList;
            ArrayList arrayList11 = new ArrayList();
            Iterator it3 = arrayList9.iterator();
            Object objMo9064o = null;
            Object objMo9064o2 = null;
            while (it3.hasNext()) {
                TransitionInfo transitionInfo2 = (TransitionInfo) it3.next();
                ArrayList arrayList12 = arrayList10;
                SpecialEffectsController.Operation operation5 = transitionInfo2.f24507a;
                Iterator it4 = it3;
                Object objMo9060h = fragmentTransitionImpl.mo9060h(transitionInfo2.f24534b);
                if (objMo9060h != null) {
                    boolean z3 = z2;
                    ArrayList arrayList13 = new ArrayList();
                    arrayList3 = arrayList2;
                    View view6 = operation5.f24775c.mView;
                    Intrinsics.m18598f(view6, "operation.fragment.mView");
                    m8917f(view6, arrayList13);
                    if (obj != null && (operation5 == operation4 || operation5 == operation3)) {
                        if (operation5 == operation4) {
                            arrayList13.removeAll(CollectionsKt.m18399B0(arrayList3));
                        } else {
                            arrayList13.removeAll(CollectionsKt.m18399B0(arrayList12));
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        fragmentTransitionImpl.mo9056a(view2, objMo9060h);
                        arrayList4 = arrayList13;
                        obj2 = objMo9064o2;
                        obj3 = objMo9060h;
                        transitionInfo = transitionInfo2;
                    } else {
                        fragmentTransitionImpl.mo9057b(objMo9060h, arrayList13);
                        obj2 = objMo9064o2;
                        transitionInfo = transitionInfo2;
                        fragmentTransitionImpl.mo9066q(objMo9060h, objMo9060h, arrayList13, null, null);
                        obj3 = objMo9060h;
                        arrayList4 = arrayList13;
                        if (operation5.f24773a == SpecialEffectsController.Operation.State.f24790c) {
                            operation5.f24781i = false;
                            ArrayList arrayList14 = new ArrayList(arrayList4);
                            Fragment fragment = operation5.f24775c;
                            view = view2;
                            arrayList14.remove(fragment.mView);
                            fragmentTransitionImpl.mo9065p(obj3, fragment.mView, arrayList14);
                            OneShotPreDrawListener.m7759a(viewGroup, new RunnableC1694d(arrayList4, 3));
                        }
                        if (operation5.f24773a != SpecialEffectsController.Operation.State.f24789b) {
                            arrayList11.addAll(arrayList4);
                            if (z3) {
                                fragmentTransitionImpl.mo9068t(obj3, rect);
                            }
                            if (FragmentManager.m8961L(2)) {
                                Log.v("FragmentManager", "Entering Transition: " + obj3);
                                Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                for (Object transitioningViews : arrayList4) {
                                    Intrinsics.m18598f(transitioningViews, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                                }
                            }
                        } else {
                            fragmentTransitionImpl.mo9067s(view3, obj3);
                            if (FragmentManager.m8961L(2)) {
                                Log.v("FragmentManager", "Exiting Transition: " + obj3);
                                Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                for (Object transitioningViews2 : arrayList4) {
                                    Intrinsics.m18598f(transitioningViews2, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                                }
                            }
                        }
                        if (transitionInfo.f24535c) {
                            objMo9064o2 = fragmentTransitionImpl.mo9064o(obj2, obj3);
                            operation3 = operation;
                            operation4 = operation2;
                        } else {
                            objMo9064o = fragmentTransitionImpl.mo9064o(objMo9064o, obj3);
                            operation3 = operation;
                            operation4 = operation2;
                            objMo9064o2 = obj2;
                        }
                        view2 = view;
                        arrayList10 = arrayList12;
                        it3 = it4;
                        z2 = z3;
                    }
                    view = view2;
                    if (operation5.f24773a != SpecialEffectsController.Operation.State.f24789b) {
                    }
                    if (transitionInfo.f24535c) {
                    }
                    view2 = view;
                    arrayList10 = arrayList12;
                    it3 = it4;
                    z2 = z3;
                } else {
                    arrayList3 = arrayList2;
                    operation3 = operation;
                    operation4 = operation2;
                    arrayList10 = arrayList12;
                    it3 = it4;
                }
                arrayList2 = arrayList3;
            }
            Object objMo9063n = fragmentTransitionImpl.mo9063n(objMo9064o, objMo9064o2, obj);
            if (FragmentManager.m8961L(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objMo9063n + " for container " + viewGroup);
            }
            return new Pair(arrayList11, objMo9063n);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m8920h() {
            ArrayList arrayList = this.f24508c;
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).f24507a.f24775c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: i */
        public final void m8921i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
            FragmentTransition.m9053c(4, arrayList);
            FragmentTransitionImpl fragmentTransitionImpl = this.f24511f;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f24514i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList3.get(i);
                arrayList2.add(ViewCompat.m7796o(view));
                ViewCompat.m7778N(view, null);
            }
            boolean zM8961L = FragmentManager.m8961L(2);
            ArrayList arrayList4 = this.f24513h;
            if (zM8961L) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : arrayList4) {
                    Intrinsics.m18598f(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view2 = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.m7796o(view2));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : arrayList3) {
                    Intrinsics.m18598f(sharedElementLastInViews, "sharedElementLastInViews");
                    View view3 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view3 + " Name: " + ViewCompat.m7796o(view3));
                }
            }
            function0.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                View view4 = (View) arrayList4.get(i2);
                String strM7796o = ViewCompat.m7796o(view4);
                arrayList5.add(strM7796o);
                if (strM7796o != null) {
                    ViewCompat.m7778N(view4, null);
                    String str = (String) this.f24515j.get(strM7796o);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i3))) {
                            ViewCompat.m7778N((View) arrayList3.get(i3), strM7796o);
                            break;
                        }
                        i3++;
                    }
                }
            }
            OneShotPreDrawListener.m7759a(viewGroup, new FragmentTransitionImpl.RunnableC16881(size2, arrayList3, arrayList2, arrayList4, arrayList5));
            FragmentTransition.m9053c(0, arrayList);
            fragmentTransitionImpl.mo9071x(this.f24512g, arrayList4, arrayList3);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class TransitionInfo extends SpecialEffectsInfo {

        /* JADX INFO: renamed from: b */
        public final Object f24534b;

        /* JADX INFO: renamed from: c */
        public final boolean f24535c;

        /* JADX INFO: renamed from: d */
        public final Object f24536d;

        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z2, boolean z3) {
            super(operation);
            SpecialEffectsController.Operation.State state = operation.f24773a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f24789b;
            Fragment fragment = operation.f24775c;
            this.f24534b = state == state2 ? z2 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z2 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f24535c = operation.f24773a == state2 ? z2 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f24536d = z3 ? z2 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        /* JADX INFO: renamed from: b */
        public final FragmentTransitionImpl m8922b() {
            Object obj = this.f24534b;
            FragmentTransitionImpl fragmentTransitionImplM8923c = m8923c(obj);
            Object obj2 = this.f24536d;
            FragmentTransitionImpl fragmentTransitionImplM8923c2 = m8923c(obj2);
            if (fragmentTransitionImplM8923c == null || fragmentTransitionImplM8923c2 == null || fragmentTransitionImplM8923c == fragmentTransitionImplM8923c2) {
                return fragmentTransitionImplM8923c == null ? fragmentTransitionImplM8923c2 : fragmentTransitionImplM8923c;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f24507a.f24775c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        /* JADX INFO: renamed from: c */
        public final FragmentTransitionImpl m8923c(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f24729a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.f24730b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.mo9059g(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f24507a.f24775c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m8906n(ArrayMap arrayMap, View view) {
        String strM7796o = ViewCompat.m7796o(view);
        if (strM7796o != null) {
            arrayMap.put(strM7796o, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m8906n(arrayMap, childAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x04b4 A[LOOP:20: B:157:0x04ae->B:159:0x04b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8907b(ArrayList arrayList, boolean z2) {
        SpecialEffectsController.Operation.State state;
        Object next;
        Object objPrevious;
        Object obj;
        ArrayList<AnimationInfo> arrayList2;
        boolean z3;
        String str;
        boolean z4;
        Iterator it;
        ArrayList arrayList3;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z5;
        Object objMo9072y;
        ArrayList sharedElementSourceNames;
        ArrayList<String> sharedElementTargetNames;
        String strM9052b;
        boolean z6 = z2;
        boolean z7 = true;
        if (FragmentManager.m8961L(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            state = SpecialEffectsController.Operation.State.f24789b;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) next;
            View view = operation.f24775c.mView;
            Intrinsics.m18598f(view, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.m9104a(view) == state && operation.f24773a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) objPrevious;
            View view2 = operation3.f24775c.mView;
            Intrinsics.m18598f(view2, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.m9104a(view2) != state && operation3.f24773a == state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) objPrevious;
        if (FragmentManager.m8961L(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation2 + " to " + operation4);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.m18411L(arrayList)).f24775c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Fragment.AnimationInfo animationInfo = ((SpecialEffectsController.Operation) it3.next()).f24775c.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment.mAnimationInfo;
            animationInfo.f24559b = animationInfo2.f24559b;
            animationInfo.f24560c = animationInfo2.f24560c;
            animationInfo.f24561d = animationInfo2.f24561d;
            animationInfo.f24562e = animationInfo2.f24562e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z8 = false;
            if (!it4.hasNext()) {
                break;
            }
            SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it4.next();
            arrayList7.add(new AnimationInfo(operation5, z6));
            if (z6) {
                if (operation5 == operation2) {
                    z8 = true;
                }
            } else if (operation5 == operation4) {
            }
            arrayList8.add(new TransitionInfo(operation5, z6, z8));
            operation5.f24776d.add(new RunnableC1693c(1, this, operation5));
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj2 : arrayList8) {
            if (!((TransitionInfo) obj2).m8916a()) {
                arrayList9.add(obj2);
            }
        }
        ArrayList<TransitionInfo> arrayList10 = new ArrayList();
        for (Object obj3 : arrayList9) {
            if (((TransitionInfo) obj3).m8922b() != null) {
                arrayList10.add(obj3);
            }
        }
        ArrayList arrayList11 = arrayList10;
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (TransitionInfo transitionInfo : arrayList10) {
            FragmentTransitionImpl fragmentTransitionImplM8922b = transitionInfo.m8922b();
            if (fragmentTransitionImpl2 != null && fragmentTransitionImplM8922b != fragmentTransitionImpl2) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.f24507a.f24775c);
                sb.append(" returned Transition ");
                throw new IllegalArgumentException(AbstractC0000a.m18o(sb, transitionInfo.f24534b, " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = fragmentTransitionImplM8922b;
        }
        if (fragmentTransitionImpl2 == null) {
            arrayList2 = arrayList7;
            z4 = false;
            z3 = true;
            str = "FragmentManager";
        } else {
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = new ArrayList();
            ArrayMap arrayMap = new ArrayMap(0);
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList arrayList16 = new ArrayList();
            ArrayMap arrayMap2 = new ArrayMap(0);
            ArrayList<String> arrayList17 = arrayList15;
            ArrayMap arrayMap3 = new ArrayMap(0);
            Iterator it5 = arrayList11.iterator();
            loop10: while (true) {
                obj = null;
                while (it5.hasNext()) {
                    Object obj4 = ((TransitionInfo) it5.next()).f24536d;
                    if (obj4 == null || operation2 == null || operation4 == null) {
                        arrayList3 = arrayList11;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList14;
                        arrayList6 = arrayList13;
                        z5 = z7;
                        z6 = z2;
                    } else {
                        objMo9072y = fragmentTransitionImpl2.mo9072y(fragmentTransitionImpl2.mo9060h(obj4));
                        z5 = z7;
                        Fragment fragment2 = operation4.f24775c;
                        sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                        arrayList3 = arrayList11;
                        Intrinsics.m18598f(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                        Fragment fragment3 = operation2.f24775c;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                        arrayList4 = arrayList12;
                        Intrinsics.m18598f(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        arrayList5 = arrayList14;
                        Intrinsics.m18598f(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames2.size();
                        arrayList6 = arrayList13;
                        int i = 0;
                        while (i < size) {
                            int i2 = size;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i));
                            ArrayList<String> arrayList18 = sharedElementTargetNames2;
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i));
                            }
                            i++;
                            size = i2;
                            sharedElementTargetNames2 = arrayList18;
                        }
                        sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        Intrinsics.m18598f(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                        Pair pair = !z6 ? new Pair(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new Pair(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                        SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.f51426a;
                        SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.f51427b;
                        int size2 = sharedElementSourceNames.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            int i4 = size2;
                            Object obj5 = sharedElementSourceNames.get(i3);
                            Intrinsics.m18598f(obj5, "exitingNames[i]");
                            String str2 = sharedElementTargetNames.get(i3);
                            Intrinsics.m18598f(str2, "enteringNames[i]");
                            arrayMap.put((String) obj5, str2);
                            i3++;
                            size2 = i4;
                        }
                        if (FragmentManager.m8961L(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            Iterator<String> it6 = sharedElementTargetNames.iterator();
                            while (true) {
                                Iterator<String> it7 = it6;
                                if (!it6.hasNext()) {
                                    break;
                                }
                                Log.v("FragmentManager", "Name: " + it7.next());
                                it6 = it7;
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator it8 = sharedElementSourceNames.iterator(); it8.hasNext(); it8 = it8) {
                                Log.v("FragmentManager", "Name: " + ((String) it8.next()));
                            }
                        }
                        View view3 = fragment3.mView;
                        Intrinsics.m18598f(view3, "firstOut.fragment.mView");
                        m8906n(arrayMap2, view3);
                        arrayMap2.mo1977p(sharedElementSourceNames);
                        if (sharedElementCallback != null) {
                            if (FragmentManager.m8961L(2)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + operation2);
                            }
                            int size3 = sharedElementSourceNames.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i5 = size3 - 1;
                                    Object obj6 = sharedElementSourceNames.get(size3);
                                    Intrinsics.m18598f(obj6, "exitingNames[i]");
                                    String str3 = (String) obj6;
                                    View view4 = (View) arrayMap2.get(str3);
                                    if (view4 == null) {
                                        arrayMap.remove(str3);
                                    } else if (!str3.equals(ViewCompat.m7796o(view4))) {
                                        arrayMap.put(ViewCompat.m7796o(view4), (String) arrayMap.remove(str3));
                                    }
                                    if (i5 < 0) {
                                        break;
                                    } else {
                                        size3 = i5;
                                    }
                                }
                            }
                        } else {
                            arrayMap.mo1977p(arrayMap2.keySet());
                        }
                        View view5 = fragment2.mView;
                        Intrinsics.m18598f(view5, "lastIn.fragment.mView");
                        m8906n(arrayMap3, view5);
                        arrayMap3.mo1977p(sharedElementTargetNames);
                        arrayMap3.mo1977p(arrayMap.values());
                        if (sharedElementCallback2 != null) {
                            if (FragmentManager.m8961L(2)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + operation4);
                            }
                            int size4 = sharedElementTargetNames.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i6 = size4 - 1;
                                    String str4 = sharedElementTargetNames.get(size4);
                                    Intrinsics.m18598f(str4, "enteringNames[i]");
                                    String str5 = str4;
                                    View view6 = (View) arrayMap3.get(str5);
                                    if (view6 == null) {
                                        String strM9052b2 = FragmentTransition.m9052b(arrayMap, str5);
                                        if (strM9052b2 != null) {
                                            arrayMap.remove(strM9052b2);
                                        }
                                    } else if (!str5.equals(ViewCompat.m7796o(view6)) && (strM9052b = FragmentTransition.m9052b(arrayMap, str5)) != null) {
                                        arrayMap.put(strM9052b, ViewCompat.m7796o(view6));
                                    }
                                    if (i6 < 0) {
                                        break;
                                    } else {
                                        size4 = i6;
                                    }
                                }
                            }
                        } else {
                            FragmentTransitionImpl fragmentTransitionImpl3 = FragmentTransition.f24729a;
                            for (int i7 = arrayMap.f3884c - 1; -1 < i7; i7--) {
                                if (!arrayMap3.containsKey((String) arrayMap.m2131m(i7))) {
                                    arrayMap.mo2129k(i7);
                                }
                            }
                        }
                        CollectionsKt.m18431f0(arrayMap2.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(arrayMap.keySet()));
                        CollectionsKt.m18431f0(arrayMap3.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(arrayMap.values()));
                        if (arrayMap.isEmpty()) {
                            break;
                        }
                        z6 = z2;
                        arrayList16 = sharedElementSourceNames;
                        arrayList17 = sharedElementTargetNames;
                        obj = objMo9072y;
                    }
                    z7 = z5;
                    arrayList11 = arrayList3;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList12 = arrayList4;
                    arrayList14 = arrayList5;
                    arrayList13 = arrayList6;
                }
                Log.i("FragmentManager", "Ignoring shared elements transition " + objMo9072y + " between " + operation2 + " and " + operation4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                arrayList4.clear();
                arrayList5.clear();
                z6 = z2;
                arrayList16 = sharedElementSourceNames;
                arrayList17 = sharedElementTargetNames;
                z7 = z5;
                arrayList11 = arrayList3;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                arrayList12 = arrayList4;
                arrayList14 = arrayList5;
                arrayList13 = arrayList6;
            }
            ArrayList arrayList19 = arrayList11;
            FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
            ArrayList arrayList20 = arrayList12;
            ArrayList arrayList21 = arrayList14;
            arrayList2 = arrayList13;
            z3 = z7;
            if (obj != null) {
                str = "FragmentManager";
                z4 = false;
                TransitionEffect transitionEffect = new TransitionEffect(arrayList19, operation2, operation4, fragmentTransitionImpl4, obj, arrayList20, arrayList21, arrayMap, arrayList17, arrayList16, arrayMap2, arrayMap3, z2);
                it = arrayList19.iterator();
                while (it.hasNext()) {
                    ((TransitionInfo) it.next()).f24507a.f24782j.add(transitionEffect);
                }
            } else {
                if (!arrayList19.isEmpty()) {
                    Iterator it9 = arrayList19.iterator();
                    while (it9.hasNext()) {
                        if (((TransitionInfo) it9.next()).f24534b != null) {
                            str = "FragmentManager";
                            z4 = false;
                            TransitionEffect transitionEffect2 = new TransitionEffect(arrayList19, operation2, operation4, fragmentTransitionImpl4, obj, arrayList20, arrayList21, arrayMap, arrayList17, arrayList16, arrayMap2, arrayMap3, z2);
                            it = arrayList19.iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                str = "FragmentManager";
                z4 = false;
            }
        }
        ArrayList<AnimationInfo> arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            CollectionsKt.m18434i(arrayList23, ((AnimationInfo) it10.next()).f24507a.f24783k);
        }
        boolean zIsEmpty = arrayList23.isEmpty();
        boolean z9 = z4;
        for (AnimationInfo animationInfo3 : arrayList2) {
            Context context = this.f24764a.getContext();
            SpecialEffectsController.Operation operation6 = animationInfo3.f24507a;
            Intrinsics.m18598f(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorM8910b = animationInfo3.m8910b(context);
            if (animationOrAnimatorM8910b != null) {
                if (animationOrAnimatorM8910b.f24582b == null) {
                    arrayList22.add(animationInfo3);
                } else {
                    Fragment fragment4 = operation6.f24775c;
                    if (operation6.f24783k.isEmpty()) {
                        if (operation6.f24773a == SpecialEffectsController.Operation.State.f24790c) {
                            operation6.f24781i = z4;
                        }
                        operation6.f24782j.add(new AnimatorEffect(animationInfo3));
                        z9 = z3;
                    } else if (FragmentManager.m8961L(2)) {
                        Log.v(str, "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (AnimationInfo animationInfo4 : arrayList22) {
            SpecialEffectsController.Operation operation7 = animationInfo4.f24507a;
            Fragment fragment5 = operation7.f24775c;
            if (zIsEmpty) {
                if (!z9) {
                    operation7.f24782j.add(new AnimationEffect(animationInfo4));
                } else if (FragmentManager.m8961L(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.m8961L(2)) {
                Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
