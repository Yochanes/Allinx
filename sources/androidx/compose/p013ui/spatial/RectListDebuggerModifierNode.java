package androidx.compose.p013ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {

    /* JADX INFO: renamed from: t */
    public Paint f19850t;

    /* JADX INFO: renamed from: u */
    public Object f19851u;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        RectManager rectManager = DelegatableNodeKt.m5744h(this).getRectManager();
        RectListDebuggerModifierNode$onAttach$1 rectListDebuggerModifierNode$onAttach$1 = new RectListDebuggerModifierNode$onAttach$1(this);
        rectManager.f19855c.m2058g(rectListDebuggerModifierNode$onAttach$1);
        this.f19851u = rectListDebuggerModifierNode$onAttach$1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        RectManager rectManager = DelegatableNodeKt.m5744h(this).getRectManager();
        Object obj = this.f19851u;
        rectManager.getClass();
        if ((TypeIntrinsics.m18630f(0, obj) ? (Function0) obj : null) == null) {
            return;
        }
        rectManager.f19855c.m2062k(obj);
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    /* JADX INFO: renamed from: z */
    public final void mo2209z(LayoutNodeDrawScope layoutNodeDrawScope) {
        RectList rectList = DelegatableNodeKt.m5744h(this).getRectManager().f19853a;
        Canvas canvasM5111b = AndroidCanvas_androidKt.m5111b(layoutNodeDrawScope.f18771a.f17768b.m5355a());
        long[] jArr = rectList.f19847a;
        int i = rectList.f19849c;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            canvasM5111b.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, this.f19850t);
        }
    }
}
