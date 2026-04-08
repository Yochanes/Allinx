package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "ModalBottomSheet.kt", m18560l = {570}, m18561m = "onPostFling-RZ2iAVY")
final class C0892x8f227701 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10715a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0891x58e3e91b f10717c;

    /* JADX INFO: renamed from: d */
    public int f10718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892x8f227701(C0891x58e3e91b c0891x58e3e91b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10717c = c0891x58e3e91b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10716b = obj;
        this.f10718d |= Integer.MIN_VALUE;
        return this.f10717c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
