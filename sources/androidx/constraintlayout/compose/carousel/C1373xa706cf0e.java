package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", m18559f = "CarouselSwipeable.kt", m18560l = {842}, m18561m = "onPostFling-RZ2iAVY")
final class C1373xa706cf0e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f21047a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 f21049c;

    /* JADX INFO: renamed from: d */
    public int f21050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373xa706cf0e(CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f21049c = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21048b = obj;
        this.f21050d |= Integer.MIN_VALUE;
        return this.f21049c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
