package com.google.accompanist.insets;

import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.core.view.AbstractC1473i;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimationKt$createFloatValueHolder$1;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;
import androidx.work.impl.utils.AbstractC2335a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010L.AbstractC0020a;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0019J/\u0010\u001a\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017H\u0002J\u0006\u0010\u001f\u001a\u00020\u0013J\u0006\u0010 \u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\u000eJ\u0006\u0010'\u001a\u00020\u000eJ\u0006\u0010(\u001a\u00020\u000eJ\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\u0013H\u0002J=\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J&\u00102\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, m18302d2 = {"Lcom/google/accompanist/insets/SimpleImeAnimationController;", "", "()V", "animationControlListener", "Landroid/view/WindowInsetsAnimationControlListener;", "getAnimationControlListener", "()Landroid/view/WindowInsetsAnimationControlListener;", "animationControlListener$delegate", "Lkotlin/Lazy;", "currentSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "insetsAnimationController", "Landroid/view/WindowInsetsAnimationController;", "isImeShownAtStart", "", "pendingRequestCancellationSignal", "Landroid/os/CancellationSignal;", "pendingRequestOnReady", "Lkotlin/Function1;", "", "animateImeToVisibility", "visible", "velocityY", "", "onFinished", "(ZLjava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "animateToFinish", "(Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "calculateFlingDistance", "velocity", "friction", "cancel", OpsMetricTracker.FINISH, "insetBy", "", "dy", "insetTo", "inset", "isInsetAnimationFinishing", "isInsetAnimationInProgress", "isInsetAnimationRequestPending", "onRequestReady", "controller", MetricTracker.Object.RESET, "startAndFling", "view", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "remainingVelocity", "startControlRequest", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SimpleImeAnimationController {

    /* JADX INFO: renamed from: animationControlListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animationControlListener = LazyKt.m18299b(new SimpleImeAnimationController$animationControlListener$2(this));

    @Nullable
    private SpringAnimation currentSpringAnimation;

    @Nullable
    private WindowInsetsAnimationController insetsAnimationController;
    private boolean isImeShownAtStart;

    @Nullable
    private CancellationSignal pendingRequestCancellationSignal;

    @Nullable
    private Function1<? super WindowInsetsAnimationController, Unit> pendingRequestOnReady;

    /* JADX INFO: renamed from: com.google.accompanist.insets.SimpleImeAnimationController$animateImeToVisibility$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class C36451 extends Lambda implements Function1<Float, Unit> {
        public C36451() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return Unit.f51459a;
        }

        public final void invoke(float f) {
            SimpleImeAnimationController.this.insetTo(MathKt.m18640b(f));
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.insets.SimpleImeAnimationController$animateImeToVisibility$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class C36462 extends Lambda implements Function0<Float> {
        final /* synthetic */ WindowInsetsAnimationController $controller;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36462(WindowInsetsAnimationController windowInsetsAnimationController) {
            super(0);
            this.$controller = windowInsetsAnimationController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(AbstractC0020a.m69w(AbstractC0025b.m113e(this.$controller)));
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.insets.SimpleImeAnimationController$startAndFling$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroid/view/WindowInsetsAnimationController;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class C36481 extends Lambda implements Function1<WindowInsetsAnimationController, Unit> {
        final /* synthetic */ Function1<Float, Unit> $onFinished;
        final /* synthetic */ float $velocityY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C36481(float f, Function1<? super Float, Unit> function1) {
            super(1);
            this.$velocityY = f;
            this.$onFinished = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(AbstractC0025b.m117i(obj));
            return Unit.f51459a;
        }

        public final void invoke(@NotNull WindowInsetsAnimationController it) {
            Intrinsics.m18599g(it, "it");
            SimpleImeAnimationController.this.animateToFinish(Float.valueOf(this.$velocityY), this.$onFinished);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14404a(SimpleImeAnimationController simpleImeAnimationController, Function1 function1, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        animateImeToVisibility$lambda$3$lambda$2(simpleImeAnimationController, function1, dynamicAnimation, z2, f, f2);
    }

    public static final /* synthetic */ void access$onRequestReady(SimpleImeAnimationController simpleImeAnimationController, WindowInsetsAnimationController windowInsetsAnimationController) {
        simpleImeAnimationController.onRequestReady(windowInsetsAnimationController);
    }

    public static final /* synthetic */ void access$reset(SimpleImeAnimationController simpleImeAnimationController) {
        simpleImeAnimationController.reset();
    }

    private final void animateImeToVisibility(boolean visible, Float velocityY, Function1<? super Float, Unit> onFinished) {
        SpringAnimation springAnimation;
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        C36451 c36451 = new C36451();
        C36462 c36462 = new C36462(windowInsetsAnimationController);
        float fM69w = visible ? AbstractC0020a.m69w(AbstractC0025b.m108D(windowInsetsAnimationController)) : AbstractC0020a.m69w(AbstractC0025b.m105A(windowInsetsAnimationController));
        DynamicAnimationKt$createFloatValueHolder$1 dynamicAnimationKt$createFloatValueHolder$1 = new DynamicAnimationKt$createFloatValueHolder$1(c36462, c36451);
        if (Float.isNaN(fM69w)) {
            springAnimation = new SpringAnimation(dynamicAnimationKt$createFloatValueHolder$1);
        } else {
            SpringAnimation springAnimation2 = new SpringAnimation(dynamicAnimationKt$createFloatValueHolder$1);
            springAnimation2.f24262s = null;
            springAnimation2.f24263t = Float.MAX_VALUE;
            springAnimation2.f24264u = false;
            springAnimation2.f24262s = new SpringForce(fM69w);
            springAnimation = springAnimation2;
        }
        if (springAnimation.f24262s == null) {
            springAnimation.f24262s = new SpringForce();
        }
        SpringForce spring = springAnimation.f24262s;
        Intrinsics.m18595c(spring, "spring");
        spring.m8774a();
        spring.m8775b(1500.0f);
        if (velocityY != null) {
            springAnimation.f24243a = velocityY.floatValue();
        }
        C3652a c3652a = new C3652a(this, onFinished);
        ArrayList arrayList = springAnimation.f24253k;
        if (!arrayList.contains(c3652a)) {
            arrayList.add(c3652a);
        }
        springAnimation.m8773h();
        this.currentSpringAnimation = springAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateImeToVisibility$default(SimpleImeAnimationController simpleImeAnimationController, boolean z2, Float f, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.animateImeToVisibility(z2, f, function1);
    }

    private static final void animateImeToVisibility$lambda$3$lambda$2(SimpleImeAnimationController this$0, Function1 function1, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        Intrinsics.m18599g(this$0, "this$0");
        if (Intrinsics.m18594b(dynamicAnimation, this$0.currentSpringAnimation)) {
            this$0.currentSpringAnimation = null;
        }
        this$0.finish();
        if (function1 != null) {
            function1.invoke(Float.valueOf(f2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateToFinish$default(SimpleImeAnimationController simpleImeAnimationController, Float f, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.animateToFinish(f, function1);
    }

    private final float calculateFlingDistance(float velocity, float friction) {
        return velocity / (friction * (-4.2f));
    }

    public static /* synthetic */ float calculateFlingDistance$default(SimpleImeAnimationController simpleImeAnimationController, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return simpleImeAnimationController.calculateFlingDistance(f, f2);
    }

    private final WindowInsetsAnimationControlListener getAnimationControlListener() {
        return AbstractC0025b.m116h(this.animationControlListener.getValue());
    }

    private final void onRequestReady(WindowInsetsAnimationController controller) {
        this.pendingRequestCancellationSignal = null;
        this.insetsAnimationController = controller;
        Function1<? super WindowInsetsAnimationController, Unit> function1 = this.pendingRequestOnReady;
        if (function1 != null) {
            function1.invoke(controller);
        }
        this.pendingRequestOnReady = null;
    }

    private final void reset() {
        this.insetsAnimationController = null;
        this.pendingRequestCancellationSignal = null;
        this.isImeShownAtStart = false;
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.m8771f();
        }
        this.currentSpringAnimation = null;
        this.pendingRequestOnReady = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startAndFling$default(SimpleImeAnimationController simpleImeAnimationController, View view, float f, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startAndFling(view, f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startControlRequest$default(SimpleImeAnimationController simpleImeAnimationController, View view, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startControlRequest(view, function1);
    }

    public final void animateToFinish(@Nullable Float velocityY, @Nullable Function1<? super Float, Unit> onFinished) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int iM69w = AbstractC0020a.m69w(AbstractC0025b.m113e(windowInsetsAnimationController));
        int iM69w2 = AbstractC0020a.m69w(AbstractC0025b.m108D(windowInsetsAnimationController));
        int iM69w3 = AbstractC0020a.m69w(AbstractC0025b.m105A(windowInsetsAnimationController));
        if (velocityY != null && calculateFlingDistance$default(this, velocityY.floatValue(), 0.0f, 2, null) > Math.abs(iM69w2 - iM69w3)) {
            animateImeToVisibility$default(this, velocityY.floatValue() < 0.0f, velocityY, null, 4, null);
            return;
        }
        if (iM69w == iM69w2) {
            AbstractC2335a.m12309r(windowInsetsAnimationController);
            if (onFinished != null) {
                onFinished.invoke(Float.valueOf(0.0f));
                return;
            }
            return;
        }
        if (iM69w == iM69w3) {
            AbstractC2335a.m12290A(windowInsetsAnimationController);
            if (onFinished != null) {
                onFinished.invoke(Float.valueOf(0.0f));
                return;
            }
            return;
        }
        if (AbstractC2335a.m12292a(windowInsetsAnimationController) >= 0.15f) {
            animateImeToVisibility$default(this, !this.isImeShownAtStart, null, onFinished, 2, null);
        } else {
            animateImeToVisibility$default(this, this.isImeShownAtStart, null, onFinished, 2, null);
        }
    }

    public final void cancel() {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            AbstractC0025b.m126r(windowInsetsAnimationController, this.isImeShownAtStart);
        }
        CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.m8771f();
        }
        reset();
    }

    public final void finish() {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int iM69w = AbstractC0020a.m69w(AbstractC0025b.m113e(windowInsetsAnimationController));
        int iM69w2 = AbstractC0020a.m69w(AbstractC0025b.m108D(windowInsetsAnimationController));
        int iM69w3 = AbstractC0020a.m69w(AbstractC0025b.m105A(windowInsetsAnimationController));
        if (iM69w == iM69w2) {
            AbstractC2335a.m12309r(windowInsetsAnimationController);
            return;
        }
        if (iM69w == iM69w3) {
            AbstractC2335a.m12290A(windowInsetsAnimationController);
        } else if (AbstractC2335a.m12292a(windowInsetsAnimationController) >= 0.15f) {
            AbstractC0025b.m126r(windowInsetsAnimationController, !this.isImeShownAtStart);
        } else {
            AbstractC0025b.m126r(windowInsetsAnimationController, this.isImeShownAtStart);
        }
    }

    public final int insetBy(int dy) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            return insetTo(AbstractC0020a.m69w(AbstractC0025b.m113e(windowInsetsAnimationController)) - dy);
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int insetTo(int inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int iM69w = AbstractC0020a.m69w(AbstractC0025b.m105A(windowInsetsAnimationController));
        int iM69w2 = AbstractC0020a.m69w(AbstractC0025b.m108D(windowInsetsAnimationController));
        boolean z2 = this.isImeShownAtStart;
        int i = z2 ? iM69w2 : iM69w;
        int i2 = z2 ? iM69w : iM69w2;
        int iM18656c = RangesKt.m18656c(inset, iM69w, iM69w2);
        int iM69w3 = AbstractC0020a.m69w(AbstractC0025b.m113e(windowInsetsAnimationController)) - iM18656c;
        AbstractC2335a.m12310s(windowInsetsAnimationController, AbstractC1895a.m10603i(iM18656c), (iM18656c - i) / (i2 - i));
        return iM69w3;
    }

    public final boolean isInsetAnimationFinishing() {
        return this.currentSpringAnimation != null;
    }

    public final boolean isInsetAnimationInProgress() {
        return this.insetsAnimationController != null;
    }

    public final boolean isInsetAnimationRequestPending() {
        return this.pendingRequestCancellationSignal != null;
    }

    public final void startAndFling(@NotNull View view, float velocityY, @Nullable Function1<? super Float, Unit> onFinished) {
        Intrinsics.m18599g(view, "view");
        startControlRequest(view, new C36481(velocityY, onFinished));
    }

    public final void startControlRequest(@NotNull View view, @Nullable Function1<? super WindowInsetsAnimationController, Unit> onRequestReady) {
        Intrinsics.m18599g(view, "view");
        if (isInsetAnimationInProgress()) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
        }
        this.isImeShownAtStart = AbstractC1473i.m8098p(view.getRootWindowInsets(), AbstractC0025b.m134z());
        this.pendingRequestCancellationSignal = new CancellationSignal();
        this.pendingRequestOnReady = onRequestReady;
        WindowInsetsController windowInsetsControllerM118j = AbstractC0025b.m118j(view);
        if (windowInsetsControllerM118j != null) {
            AbstractC2335a.m12311t(windowInsetsControllerM118j, AbstractC0025b.m134z(), SimpleImeAnimationControllerKt.access$getLinearInterpolator$p(), this.pendingRequestCancellationSignal, getAnimationControlListener());
        }
    }
}
