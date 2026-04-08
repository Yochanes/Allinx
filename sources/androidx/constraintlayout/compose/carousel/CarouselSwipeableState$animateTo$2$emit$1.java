package androidx.constraintlayout.compose.carousel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2", m18559f = "CarouselSwipeable.kt", m18560l = {315}, m18561m = "emit")
final class CarouselSwipeableState$animateTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f21093a;

    /* JADX INFO: renamed from: b */
    public Map f21094b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21095c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CarouselSwipeableState$animateTo$2 f21096d;

    /* JADX INFO: renamed from: f */
    public int f21097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$animateTo$2$emit$1(CarouselSwipeableState$animateTo$2 carouselSwipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.f21096d = carouselSwipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21095c = obj;
        this.f21097f |= Integer.MIN_VALUE;
        return this.f21096d.m6795a(null, this);
    }
}
