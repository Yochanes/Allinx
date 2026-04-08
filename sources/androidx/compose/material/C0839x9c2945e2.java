package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", m18559f = "BackdropScaffold.kt", m18560l = {680}, m18561m = "onPostFling-RZ2iAVY")
final class C0839x9c2945e2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10201a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 f10203c;

    /* JADX INFO: renamed from: d */
    public int f10204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839x9c2945e2(BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10203c = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10202b = obj;
        this.f10204d |= Integer.MIN_VALUE;
        return this.f10203c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
