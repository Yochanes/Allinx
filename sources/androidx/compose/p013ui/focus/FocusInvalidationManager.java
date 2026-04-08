package androidx.compose.p013ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: a */
    public final Function1 f17441a;

    /* JADX INFO: renamed from: b */
    public final Function0 f17442b;

    /* JADX INFO: renamed from: c */
    public final Function0 f17443c;

    /* JADX INFO: renamed from: d */
    public final Function0 f17444d;

    /* JADX INFO: renamed from: e */
    public final MutableScatterSet f17445e;

    /* JADX INFO: renamed from: f */
    public final MutableScatterSet f17446f;

    /* JADX INFO: renamed from: g */
    public boolean f17447g;

    public FocusInvalidationManager(Function1 function1, Function0 function0, Function0 function02, Function0 function03) {
        this.f17441a = function1;
        this.f17442b = function0;
        this.f17443c = function02;
        this.f17444d = function03;
        int i = ScatterSetKt.f3851a;
        this.f17445e = new MutableScatterSet();
        this.f17446f = new MutableScatterSet();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4973a(FocusInvalidationManager focusInvalidationManager) {
        NodeChain nodeChain;
        char c2;
        long j;
        char c3;
        long j2;
        FocusTargetNode focusTargetNode = (FocusTargetNode) ((MutablePropertyReference0) focusInvalidationManager.f17444d).get();
        MutableScatterSet mutableScatterSet = focusInvalidationManager.f17445e;
        char c4 = 7;
        long j3 = -9187201950435737472L;
        MutableScatterSet mutableScatterSet2 = focusInvalidationManager.f17446f;
        if (focusTargetNode == null) {
            Object[] objArr = mutableScatterSet2.f3847b;
            long[] jArr = mutableScatterSet2.f3846a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << c4) & j4 & j3) != j3) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j4 & 255) < 128) {
                                c3 = c4;
                                j2 = j3;
                                ((FocusEventModifierNode) objArr[(i << 3) + i3]).mo2488A(FocusStateImpl.f17497d);
                            } else {
                                c3 = c4;
                                j2 = j3;
                            }
                            j4 >>= 8;
                            i3++;
                            c4 = c3;
                            j3 = j2;
                        }
                        c2 = c4;
                        j = j3;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        c2 = c4;
                        j = j3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    c4 = c2;
                    j3 = j;
                }
            }
        } else if (focusTargetNode.f17194s) {
            if (mutableScatterSet.m2117b(focusTargetNode)) {
                focusTargetNode.m5017a2();
            }
            FocusStateImpl focusStateImplM5016Z1 = focusTargetNode.m5016Z1();
            if (!focusTargetNode.f17181a.f17194s) {
                InlineClassHelperKt.m5597b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNode.f17181a;
            LayoutNode layoutNodeM5743g = DelegatableNodeKt.m5743g(focusTargetNode);
            int i4 = 0;
            while (layoutNodeM5743g != null) {
                if ((layoutNodeM5743g.f18721M.f18909e.f17184d & 5120) != 0) {
                    while (node != null) {
                        int i5 = node.f17183c;
                        if ((i5 & 5120) != 0) {
                            if ((i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                i4++;
                            }
                            if ((node instanceof FocusEventModifierNode) && mutableScatterSet2.m2117b(node)) {
                                if (i4 <= 1) {
                                    ((FocusEventModifierNode) node).mo2488A(focusStateImplM5016Z1);
                                } else {
                                    ((FocusEventModifierNode) node).mo2488A(FocusStateImpl.f17495b);
                                }
                                mutableScatterSet2.m2091n(node);
                            }
                        }
                        node = node.f17185f;
                    }
                }
                layoutNodeM5743g = layoutNodeM5743g.m5789H();
                node = (layoutNodeM5743g == null || (nodeChain = layoutNodeM5743g.f18721M) == null) ? null : nodeChain.f18908d;
            }
            Object[] objArr2 = mutableScatterSet2.f3847b;
            long[] jArr2 = mutableScatterSet2.f3846a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j5 = jArr2[i6];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j5 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i6 << 3) + i8]).mo2488A(FocusStateImpl.f17497d);
                            }
                            j5 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 == length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        ((FocusOwnerImpl$focusInvalidationManager$1) focusInvalidationManager.f17442b).invoke();
        mutableScatterSet.m2084g();
        mutableScatterSet2.m2084g();
        focusInvalidationManager.f17447g = false;
    }
}
