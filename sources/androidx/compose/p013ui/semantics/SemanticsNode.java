package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SemanticsNode {

    /* JADX INFO: renamed from: a */
    public final Modifier.Node f19770a;

    /* JADX INFO: renamed from: b */
    public final boolean f19771b;

    /* JADX INFO: renamed from: c */
    public final LayoutNode f19772c;

    /* JADX INFO: renamed from: d */
    public final SemanticsConfiguration f19773d;

    /* JADX INFO: renamed from: e */
    public boolean f19774e;

    /* JADX INFO: renamed from: f */
    public SemanticsNode f19775f;

    /* JADX INFO: renamed from: g */
    public final int f19776g;

    public SemanticsNode(Modifier.Node node, boolean z2, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.f19770a = node;
        this.f19771b = z2;
        this.f19772c = layoutNode;
        this.f19773d = semanticsConfiguration;
        this.f19776g = layoutNode.f18733b;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m6272h(int i, SemanticsNode semanticsNode) {
        return semanticsNode.m6279g((i & 1) != 0 ? !semanticsNode.f19771b : false, (i & 2) == 0);
    }

    /* JADX INFO: renamed from: a */
    public final SemanticsNode m6273a(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f19766c = false;
        semanticsConfiguration.f19767d = false;
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, this.f19776g + (role != null ? 1000000000 : 2000000000)), semanticsConfiguration);
        semanticsNode.f19774e = true;
        semanticsNode.f19775f = this;
        return semanticsNode;
    }

    /* JADX INFO: renamed from: b */
    public final void m6274b(LayoutNode layoutNode, ArrayList arrayList) {
        MutableVector mutableVectorM5795N = layoutNode.m5795N();
        Object[] objArr = mutableVectorM5795N.f16734a;
        int i = mutableVectorM5795N.f16736c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.mo5635m() && !layoutNode2.f18731W) {
                if (layoutNode2.f18721M.m5898d(8)) {
                    arrayList.add(SemanticsNodeKt.m6286a(layoutNode2, this.f19771b));
                } else {
                    m6274b(layoutNode2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final NodeCoordinator m6275c() {
        if (this.f19774e) {
            SemanticsNode semanticsNodeM6281j = m6281j();
            if (semanticsNodeM6281j != null) {
                return semanticsNodeM6281j.m6275c();
            }
            return null;
        }
        DelegatableNode delegatableNodeM6287b = SemanticsNodeKt.m6287b(this.f19772c);
        if (delegatableNodeM6287b == null) {
            delegatableNodeM6287b = this.f19770a;
        }
        return DelegatableNodeKt.m5741e(delegatableNodeM6287b, 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m6276d(ArrayList arrayList, ArrayList arrayList2) {
        m6285n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (semanticsNode.m6282k()) {
                arrayList2.add(semanticsNode);
            } else if (!semanticsNode.f19773d.f19767d) {
                semanticsNode.m6276d(arrayList, arrayList2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Rect m6277e() {
        NodeCoordinator nodeCoordinatorM6275c = m6275c();
        if (nodeCoordinatorM6275c != null) {
            if (!nodeCoordinatorM6275c.mo5764F1().f17194s) {
                nodeCoordinatorM6275c = null;
            }
            if (nodeCoordinatorM6275c != null) {
                return LayoutCoordinatesKt.m5631c(nodeCoordinatorM6275c).mo5620M(nodeCoordinatorM6275c, true);
            }
        }
        return Rect.f17525e;
    }

    /* JADX INFO: renamed from: f */
    public final Rect m6278f() {
        NodeCoordinator nodeCoordinatorM6275c = m6275c();
        if (nodeCoordinatorM6275c != null) {
            if (!nodeCoordinatorM6275c.mo5764F1().f17194s) {
                nodeCoordinatorM6275c = null;
            }
            if (nodeCoordinatorM6275c != null) {
                return LayoutCoordinatesKt.m5630b(nodeCoordinatorM6275c);
            }
        }
        return Rect.f17525e;
    }

    /* JADX INFO: renamed from: g */
    public final List m6279g(boolean z2, boolean z3) {
        if (!z2 && this.f19773d.f19767d) {
            return EmptyList.f51496a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m6282k()) {
            return m6285n(arrayList, z3);
        }
        ArrayList arrayList2 = new ArrayList();
        m6276d(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public final SemanticsConfiguration m6280i() {
        boolean zM6282k = m6282k();
        SemanticsConfiguration semanticsConfiguration = this.f19773d;
        if (!zM6282k) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationM6264e = semanticsConfiguration.m6264e();
        m6284m(new ArrayList(), semanticsConfigurationM6264e);
        return semanticsConfigurationM6264e;
    }

    /* JADX INFO: renamed from: j */
    public final SemanticsNode m6281j() {
        LayoutNode layoutNodeM5789H;
        SemanticsNode semanticsNode = this.f19775f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode = this.f19772c;
        boolean z2 = this.f19771b;
        if (z2) {
            layoutNodeM5789H = layoutNode.m5789H();
            while (layoutNodeM5789H != null) {
                SemanticsConfiguration semanticsConfigurationMo5790I = layoutNodeM5789H.mo5790I();
                if (semanticsConfigurationMo5790I != null && semanticsConfigurationMo5790I.f19766c) {
                    break;
                }
                layoutNodeM5789H = layoutNodeM5789H.m5789H();
            }
            layoutNodeM5789H = null;
        } else {
            layoutNodeM5789H = null;
        }
        if (layoutNodeM5789H == null) {
            LayoutNode layoutNodeM5789H2 = layoutNode.m5789H();
            while (true) {
                if (layoutNodeM5789H2 == null) {
                    layoutNodeM5789H = null;
                    break;
                }
                if (layoutNodeM5789H2.f18721M.m5898d(8)) {
                    layoutNodeM5789H = layoutNodeM5789H2;
                    break;
                }
                layoutNodeM5789H2 = layoutNodeM5789H2.m5789H();
            }
        }
        if (layoutNodeM5789H == null) {
            return null;
        }
        return SemanticsNodeKt.m6286a(layoutNodeM5789H, z2);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6282k() {
        return this.f19771b && this.f19773d.f19766c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6283l() {
        if (this.f19774e || !m6272h(4, this).isEmpty()) {
            return false;
        }
        LayoutNode layoutNodeM5789H = this.f19772c.m5789H();
        while (true) {
            if (layoutNodeM5789H == null) {
                layoutNodeM5789H = null;
                break;
            }
            SemanticsConfiguration semanticsConfigurationMo5790I = layoutNodeM5789H.mo5790I();
            if (semanticsConfigurationMo5790I != null && semanticsConfigurationMo5790I.f19766c) {
                break;
            }
            layoutNodeM5789H = layoutNodeM5789H.m5789H();
        }
        return layoutNodeM5789H == null;
    }

    /* JADX INFO: renamed from: m */
    public final void m6284m(ArrayList arrayList, SemanticsConfiguration semanticsConfiguration) {
        if (this.f19773d.f19767d) {
            return;
        }
        m6285n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (!semanticsNode.m6282k()) {
                semanticsConfiguration.m6267j(semanticsNode.f19773d);
                semanticsNode.m6284m(arrayList, semanticsConfiguration);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final List m6285n(ArrayList arrayList, boolean z2) {
        if (this.f19774e) {
            return EmptyList.f51496a;
        }
        m6274b(this.f19772c, arrayList);
        if (z2) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19819w;
            SemanticsConfiguration semanticsConfiguration = this.f19773d;
            Role role = (Role) SemanticsConfigurationKt.m6268a(semanticsConfiguration, semanticsPropertyKey);
            if (role != null && semanticsConfiguration.f19766c && !arrayList.isEmpty()) {
                arrayList.add(m6273a(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19797a;
            if (semanticsConfiguration.f19764a.m2107c(semanticsPropertyKey2) && !arrayList.isEmpty() && semanticsConfiguration.f19766c) {
                List list = (List) SemanticsConfigurationKt.m6268a(semanticsConfiguration, semanticsPropertyKey2);
                String str = list != null ? (String) CollectionsKt.m18402D(list) : null;
                if (str != null) {
                    arrayList.add(0, m6273a(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
                }
            }
        }
        return arrayList;
    }
}
