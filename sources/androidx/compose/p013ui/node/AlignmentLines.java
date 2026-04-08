package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.AlignmentLineKt;
import androidx.compose.p013ui.layout.HorizontalAlignmentLine;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a */
    public final Placeable f18615a;

    /* JADX INFO: renamed from: c */
    public boolean f18617c;

    /* JADX INFO: renamed from: d */
    public boolean f18618d;

    /* JADX INFO: renamed from: e */
    public boolean f18619e;

    /* JADX INFO: renamed from: f */
    public boolean f18620f;

    /* JADX INFO: renamed from: g */
    public boolean f18621g;

    /* JADX INFO: renamed from: h */
    public AlignmentLinesOwner f18622h;

    /* JADX INFO: renamed from: b */
    public boolean f18616b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f18623i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.f18615a = (Placeable) alignmentLinesOwner;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    /* JADX INFO: renamed from: a */
    public static final void m5700a(AlignmentLines alignmentLines, AlignmentLine alignmentLine, int i, NodeCoordinator nodeCoordinator) {
        long jMo5701b;
        alignmentLines.getClass();
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jMo5701b = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo5701b = alignmentLines.mo5701b(nodeCoordinator, jMo5701b);
                nodeCoordinator = nodeCoordinator.f18947v;
                Intrinsics.m18596d(nodeCoordinator);
                if (nodeCoordinator.equals(alignmentLines.f18615a.mo5709A())) {
                    break loop0;
                }
            } while (!alignmentLines.mo5702c(nodeCoordinator).containsKey(alignmentLine));
            float fMo5703d = alignmentLines.mo5703d(nodeCoordinator, alignmentLine);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo5703d);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo5703d);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (jMo5701b & 4294967295L)) : Float.intBitsToFloat((int) (jMo5701b >> 32)));
        HashMap map = alignmentLines.f18623i;
        if (map.containsKey(alignmentLine)) {
            int iIntValue = ((Number) MapsKt.m18482e(alignmentLine, map)).intValue();
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f18421a;
            iRound = ((Number) alignmentLine.f18420a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo5701b(NodeCoordinator nodeCoordinator, long j);

    /* JADX INFO: renamed from: c */
    public abstract Map mo5702c(NodeCoordinator nodeCoordinator);

    /* JADX INFO: renamed from: d */
    public abstract int mo5703d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    /* JADX INFO: renamed from: e */
    public final boolean m5704e() {
        return this.f18617c || this.f18619e || this.f18620f || this.f18621g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5705f() {
        m5708i();
        return this.f18622h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    /* JADX INFO: renamed from: g */
    public final void m5706g() {
        this.f18616b = true;
        ?? r0 = this.f18615a;
        AlignmentLinesOwner alignmentLinesOwnerMo5710I = r0.mo5710I();
        if (alignmentLinesOwnerMo5710I == null) {
            return;
        }
        if (this.f18617c) {
            alignmentLinesOwnerMo5710I.mo5713o0();
        } else if (this.f18619e || this.f18618d) {
            alignmentLinesOwnerMo5710I.requestLayout();
        }
        if (this.f18620f) {
            r0.mo5713o0();
        }
        if (this.f18621g) {
            r0.requestLayout();
        }
        alignmentLinesOwnerMo5710I.mo5714p().m5706g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    /* JADX INFO: renamed from: h */
    public final void m5707h() {
        HashMap map = this.f18623i;
        map.clear();
        AlignmentLines$recalculate$1 alignmentLines$recalculate$1 = new AlignmentLines$recalculate$1(this);
        ?? r2 = this.f18615a;
        r2.mo5712h0(alignmentLines$recalculate$1);
        map.putAll(mo5702c(r2.mo5709A()));
        this.f18616b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.AlignmentLinesOwner] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5708i() {
        AlignmentLines alignmentLinesMo5714p;
        AlignmentLines alignmentLinesMo5714p2;
        boolean zM5704e = m5704e();
        ?? r1 = this.f18615a;
        ?? r12 = r1;
        if (!zM5704e) {
            AlignmentLinesOwner alignmentLinesOwnerMo5710I = r1.mo5710I();
            if (alignmentLinesOwnerMo5710I == null) {
                return;
            }
            AlignmentLinesOwner alignmentLinesOwner = alignmentLinesOwnerMo5710I.mo5714p().f18622h;
            if (alignmentLinesOwner != null) {
                boolean zM5704e2 = alignmentLinesOwner.mo5714p().m5704e();
                r12 = alignmentLinesOwner;
                if (!zM5704e2) {
                    AlignmentLinesOwner alignmentLinesOwner2 = this.f18622h;
                    if (alignmentLinesOwner2 == null || alignmentLinesOwner2.mo5714p().m5704e()) {
                        return;
                    }
                    AlignmentLinesOwner alignmentLinesOwnerMo5710I2 = alignmentLinesOwner2.mo5710I();
                    if (alignmentLinesOwnerMo5710I2 != null && (alignmentLinesMo5714p2 = alignmentLinesOwnerMo5710I2.mo5714p()) != null) {
                        alignmentLinesMo5714p2.m5708i();
                    }
                    AlignmentLinesOwner alignmentLinesOwnerMo5710I3 = alignmentLinesOwner2.mo5710I();
                    r12 = (alignmentLinesOwnerMo5710I3 == null || (alignmentLinesMo5714p = alignmentLinesOwnerMo5710I3.mo5714p()) == null) ? 0 : alignmentLinesMo5714p.f18622h;
                }
            }
        }
        this.f18622h = r12;
    }
}
