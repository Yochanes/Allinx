package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", m18559f = "AppBar.kt", m18560l = {2467, 2469}, m18561m = "onPostFling-RZ2iAVY")
final class C1014x78ae0263 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 f13321a;

    /* JADX INFO: renamed from: b */
    public long f13322b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f13323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 f13324d;

    /* JADX INFO: renamed from: f */
    public int f13325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1014x78ae0263(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13324d = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13323c = obj;
        this.f13325f |= Integer.MIN_VALUE;
        return this.f13324d.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
