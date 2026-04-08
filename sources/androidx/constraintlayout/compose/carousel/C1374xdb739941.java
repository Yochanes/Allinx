package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", m18559f = "CarouselSwipeable.kt", m18560l = {833}, m18561m = "onPreFling-QWom1Mo")
final class C1374xdb739941 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 f21052b;

    /* JADX INFO: renamed from: c */
    public int f21053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374xdb739941(CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f21052b = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21051a = obj;
        this.f21053c |= Integer.MIN_VALUE;
        return this.f21052b.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
