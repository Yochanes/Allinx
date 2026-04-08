package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "BottomSheetScaffold.kt", m18560l = {581}, m18561m = "onPostFling-RZ2iAVY")
final class C0853x8eaee744 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10303a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0852x7deaba9e f10305c;

    /* JADX INFO: renamed from: d */
    public int f10306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853x8eaee744(C0852x7deaba9e c0852x7deaba9e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10305c = c0852x7deaba9e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10304b = obj;
        this.f10306d |= Integer.MIN_VALUE;
        return this.f10305c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
