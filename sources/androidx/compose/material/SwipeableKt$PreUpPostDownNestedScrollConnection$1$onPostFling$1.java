package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", m18559f = "Swipeable.kt", m18560l = {868}, m18561m = "onPostFling-RZ2iAVY")
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f11330a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 f11332c;

    /* JADX INFO: renamed from: d */
    public int f11333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11332c = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11331b = obj;
        this.f11333d |= Integer.MIN_VALUE;
        return this.f11332c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
