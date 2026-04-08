package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2639a(ScrollableState scrollableState, float f, FiniteAnimationSpec finiteAnimationSpec, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref.FloatRef floatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuationImpl;
            int i = scrollExtensionsKt$animateScrollBy$1.f5850c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.f5850c = i - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
            }
        }
        Object obj = scrollExtensionsKt$animateScrollBy$1.f5849b;
        Object obj2 = CoroutineSingletons.f51584a;
        int i2 = scrollExtensionsKt$animateScrollBy$1.f5850c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f, finiteAnimationSpec, floatRef2, null);
            scrollExtensionsKt$animateScrollBy$1.f5848a = floatRef2;
            scrollExtensionsKt$animateScrollBy$1.f5850c = 1;
            if (scrollableState.mo2509c(MutatePriority.f5091a, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                return obj2;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = scrollExtensionsKt$animateScrollBy$1.f5848a;
            ResultKt.m18313b(obj);
        }
        return new Float(floatRef.f51656a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2640b(ScrollableState scrollableState, float f, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref.FloatRef floatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuationImpl;
            int i = scrollExtensionsKt$scrollBy$1.f5860c;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.f5860c = i - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
            }
        }
        Object obj = scrollExtensionsKt$scrollBy$1.f5859b;
        Object obj2 = CoroutineSingletons.f51584a;
        int i2 = scrollExtensionsKt$scrollBy$1.f5860c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(floatRef2, f, null);
            scrollExtensionsKt$scrollBy$1.f5858a = floatRef2;
            scrollExtensionsKt$scrollBy$1.f5860c = 1;
            if (scrollableState.mo2509c(MutatePriority.f5091a, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == obj2) {
                return obj2;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = scrollExtensionsKt$scrollBy$1.f5858a;
            ResultKt.m18313b(obj);
        }
        return new Float(floatRef.f51656a);
    }

    /* JADX INFO: renamed from: c */
    public static Object m2641c(ScrollableState scrollableState, SuspendLambda suspendLambda) {
        Object objMo2509c = scrollableState.mo2509c(MutatePriority.f5091a, new ScrollExtensionsKt$stopScroll$2(2, null), suspendLambda);
        return objMo2509c == CoroutineSingletons.f51584a ? objMo2509c : Unit.f51459a;
    }
}
