package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m18559f = "Drawer.kt", m18560l = {817}, m18561m = "onPreFling-QWom1Mo")
final class C0871x425444c4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10524a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0869xfccf8785 f10526c;

    /* JADX INFO: renamed from: d */
    public int f10527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0871x425444c4(C0869xfccf8785 c0869xfccf8785, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10526c = c0869xfccf8785;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10525b = obj;
        this.f10527d |= Integer.MIN_VALUE;
        return this.f10526c.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
