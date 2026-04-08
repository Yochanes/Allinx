package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "Drawer.kt", m18560l = {826}, m18561m = "onPostFling-RZ2iAVY")
final class C0870x1c3b93eb extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10520a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0869xfccf8785 f10522c;

    /* JADX INFO: renamed from: d */
    public int f10523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0870x1c3b93eb(C0869xfccf8785 c0869xfccf8785, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10522c = c0869xfccf8785;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10521b = obj;
        this.f10523d |= Integer.MIN_VALUE;
        return this.f10522c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
