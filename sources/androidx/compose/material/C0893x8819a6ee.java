package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "ModalBottomSheet.kt", m18560l = {561}, m18561m = "onPreFling-QWom1Mo")
final class C0893x8819a6ee extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10719a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0891x58e3e91b f10721c;

    /* JADX INFO: renamed from: d */
    public int f10722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893x8819a6ee(C0891x58e3e91b c0891x58e3e91b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10721c = c0891x58e3e91b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10720b = obj;
        this.f10722d |= Integer.MIN_VALUE;
        return this.f10721c.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
