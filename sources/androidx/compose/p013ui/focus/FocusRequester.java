package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FocusRequester {

    /* JADX INFO: renamed from: b */
    public static final FocusRequester f17481b = new FocusRequester();

    /* JADX INFO: renamed from: c */
    public static final FocusRequester f17482c = new FocusRequester();

    /* JADX INFO: renamed from: d */
    public static final FocusRequester f17483d = new FocusRequester();

    /* JADX INFO: renamed from: a */
    public final MutableVector f17484a = new MutableVector(new FocusRequesterModifierNode[16], 0);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "FocusRequesterFactory", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class FocusRequesterFactory {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5001c(FocusRequester focusRequester) {
        focusRequester.getClass();
        focusRequester.m5002a(new FocusRequester$requestFocus$1(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0044, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5002a(Function1 function1) {
        if (this == f17481b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f17482c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        MutableVector mutableVector = this.f17484a;
        int i = mutableVector.f16736c;
        if (i == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        Object[] objArr = mutableVector.f16734a;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i2];
            if (!focusRequesterModifierNode.getF17181a().f17194s) {
                InlineClassHelperKt.m5597b("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node node = focusRequesterModifierNode.getF17181a().f17186g;
            if (node == null) {
                DelegatableNodeKt.m5737a(mutableVector2, focusRequesterModifierNode.getF17181a());
            } else {
                mutableVector2.m4568b(node);
            }
            while (true) {
                int i3 = mutableVector2.f16736c;
                if (i3 != 0) {
                    Modifier.Node nodeM5738b = (Modifier.Node) mutableVector2.m4577k(i3 - 1);
                    if ((nodeM5738b.f17184d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                        DelegatableNodeKt.m5737a(mutableVector2, nodeM5738b);
                    } else {
                        while (true) {
                            if (nodeM5738b == null) {
                                break;
                            }
                            if ((nodeM5738b.f17183c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodeM5738b != null) {
                                    if (nodeM5738b instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) nodeM5738b;
                                        if (focusTargetNode.m5015Y1().f17468a ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : TwoDimensionalFocusSearchKt.m5038e(focusTargetNode, 7, function1)) {
                                            z2 = true;
                                            break;
                                        }
                                    } else if (((nodeM5738b.f17183c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) && (nodeM5738b instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node node2 = ((DelegatingNode) nodeM5738b).f18661u; node2 != null; node2 = node2.f17186g) {
                                            if ((node2.f17183c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nodeM5738b = node2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeM5738b != null) {
                                                        mutableVector3.m4568b(nodeM5738b);
                                                        nodeM5738b = null;
                                                    }
                                                    mutableVector3.m4568b(node2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    nodeM5738b = DelegatableNodeKt.m5738b(mutableVector3);
                                }
                            } else {
                                nodeM5738b = nodeM5738b.f17186g;
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m5003b() {
        m5002a(new FocusRequester$requestFocus$1(1));
    }
}
