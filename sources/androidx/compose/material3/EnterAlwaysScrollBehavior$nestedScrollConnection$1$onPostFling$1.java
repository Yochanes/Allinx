package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", m18559f = "AppBar.kt", m18560l = {2386, 2388}, m18561m = "onPostFling-RZ2iAVY")
final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1 f13309a;

    /* JADX INFO: renamed from: b */
    public long f13310b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f13311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 f13312d;

    /* JADX INFO: renamed from: f */
    public int f13313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13312d = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13311c = obj;
        this.f13313f |= Integer.MIN_VALUE;
        return this.f13312d.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
