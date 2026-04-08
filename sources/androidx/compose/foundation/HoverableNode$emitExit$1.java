package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.HoverableNode", m18559f = "Hoverable.kt", m18560l = {114}, m18561m = "emitExit")
final class HoverableNode$emitExit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f5013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HoverableNode f5015c;

    /* JADX INFO: renamed from: d */
    public int f5016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5015c = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5014b = obj;
        this.f5016d |= Integer.MIN_VALUE;
        return HoverableNode.m2475Y1(this.f5015c, this);
    }
}
