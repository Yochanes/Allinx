package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", m18559f = "CarouselSwipeable.kt", m18560l = {299}, m18561m = "emit")
final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f21112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21113b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselSwipeableState$snapTo$2 f21114c;

    /* JADX INFO: renamed from: d */
    public int f21115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState$snapTo$2 carouselSwipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.f21114c = carouselSwipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21113b = obj;
        this.f21115d |= Integer.MIN_VALUE;
        return this.f21114c.m6796a(null, this);
    }
}
