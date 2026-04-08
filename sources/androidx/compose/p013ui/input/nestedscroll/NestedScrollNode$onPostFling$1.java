package androidx.compose.p013ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m18559f = "NestedScrollNode.kt", m18560l = {103, 113}, m18561m = "onPostFling-RZ2iAVY")
final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public NestedScrollNode f18230a;

    /* JADX INFO: renamed from: b */
    public long f18231b;

    /* JADX INFO: renamed from: c */
    public long f18232c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18233d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NestedScrollNode f18234f;

    /* JADX INFO: renamed from: g */
    public int f18235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18234f = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18233d = obj;
        this.f18235g |= Integer.MIN_VALUE;
        return this.f18234f.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
