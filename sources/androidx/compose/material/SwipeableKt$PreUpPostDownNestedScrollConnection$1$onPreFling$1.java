package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", m18559f = "Swipeable.kt", m18560l = {859}, m18561m = "onPreFling-QWom1Mo")
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 f11335b;

    /* JADX INFO: renamed from: c */
    public int f11336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11335b = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11334a = obj;
        this.f11336c |= Integer.MIN_VALUE;
        return this.f11335b.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
