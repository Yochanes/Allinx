package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/PreferKeepClearNode;", "Landroidx/compose/foundation/RectListNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class PreferKeepClearNode extends RectListNode {
    @Override // androidx.compose.foundation.RectListNode
    /* JADX INFO: renamed from: X1 */
    public final MutableVector mo2459X1() {
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        mutableVector.m4570d(mutableVector.f16736c, AbstractC0024a.m96r(DelegatableNode_androidKt.m5745a(this)));
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    /* JADX INFO: renamed from: Y1 */
    public final void mo2460Y1(MutableVector mutableVector) {
        AbstractC0024a.m99u(DelegatableNode_androidKt.m5745a(this), mutableVector.m4572f());
    }
}
