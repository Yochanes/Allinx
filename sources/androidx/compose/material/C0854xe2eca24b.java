package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "BottomSheetScaffold.kt", m18560l = {572}, m18561m = "onPreFling-QWom1Mo")
final class C0854xe2eca24b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10307a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0852x7deaba9e f10309c;

    /* JADX INFO: renamed from: d */
    public int f10310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0854xe2eca24b(C0852x7deaba9e c0852x7deaba9e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10309c = c0852x7deaba9e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10308b = obj;
        this.f10310d |= Integer.MIN_VALUE;
        return this.f10309c.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
