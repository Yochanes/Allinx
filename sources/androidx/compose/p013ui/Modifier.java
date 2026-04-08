package androidx.compose.p013ui;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.ObserverNodeOwnerScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/Modifier;", "", "Companion", "Element", "Node", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Modifier {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.p013ui.Modifier
        default boolean all(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.p013ui.Modifier
        default Object foldIn(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }
    }

    boolean all(Function1 function1);

    Object foldIn(Object obj, Function2 function2);

    default Modifier then(Modifier modifier) {
        return modifier == Companion.f17180a ? this : new CombinedModifier(this, modifier);
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class Node implements DelegatableNode {

        /* JADX INFO: renamed from: b */
        public ContextScope f17182b;

        /* JADX INFO: renamed from: c */
        public int f17183c;

        /* JADX INFO: renamed from: f */
        public Node f17185f;

        /* JADX INFO: renamed from: g */
        public Node f17186g;

        /* JADX INFO: renamed from: i */
        public ObserverNodeOwnerScope f17187i;

        /* JADX INFO: renamed from: j */
        public NodeCoordinator f17188j;

        /* JADX INFO: renamed from: n */
        public boolean f17189n;

        /* JADX INFO: renamed from: o */
        public boolean f17190o;

        /* JADX INFO: renamed from: p */
        public boolean f17191p;

        /* JADX INFO: renamed from: q */
        public boolean f17192q;

        /* JADX INFO: renamed from: r */
        public Function0 f17193r;

        /* JADX INFO: renamed from: s */
        public boolean f17194s;

        /* JADX INFO: renamed from: a */
        public Node f17181a = this;

        /* JADX INFO: renamed from: d */
        public int f17184d = -1;

        @Override // androidx.compose.p013ui.node.DelegatableNode
        /* JADX INFO: renamed from: C, reason: from getter */
        public final Node getF17181a() {
            return this.f17181a;
        }

        /* JADX INFO: renamed from: L1 */
        public final CoroutineScope m4865L1() {
            ContextScope contextScope = this.f17182b;
            if (contextScope != null) {
                return contextScope;
            }
            ContextScope contextScopeM20560a = CoroutineScopeKt.m20560a(DelegatableNodeKt.m5744h(this).getCoroutineContext().mo2465z(new JobImpl((Job) DelegatableNodeKt.m5744h(this).getCoroutineContext().mo2464u(Job.Key.f55324a))));
            this.f17182b = contextScopeM20560a;
            return contextScopeM20560a;
        }

        /* JADX INFO: renamed from: M1 */
        public boolean mo2398M1() {
            return !(this instanceof FocusableNode);
        }

        /* JADX INFO: renamed from: N1 */
        public void mo4866N1() {
            if (this.f17194s) {
                InlineClassHelperKt.m5597b("node attached multiple times");
            }
            if (this.f17188j == null) {
                InlineClassHelperKt.m5597b("attach invoked on a node without a coordinator");
            }
            this.f17194s = true;
            this.f17191p = true;
        }

        /* JADX INFO: renamed from: O1 */
        public void mo4867O1() {
            if (!this.f17194s) {
                InlineClassHelperKt.m5597b("Cannot detach a node that is not attached");
            }
            if (this.f17191p) {
                InlineClassHelperKt.m5597b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f17192q) {
                InlineClassHelperKt.m5597b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f17194s = false;
            ContextScope contextScope = this.f17182b;
            if (contextScope != null) {
                CoroutineScopeKt.m20562c(contextScope, new ModifierNodeDetachedCancellationException("The Modifier.Node was detached"));
                this.f17182b = null;
            }
        }

        /* JADX INFO: renamed from: S1 */
        public void mo4868S1() {
            if (!this.f17194s) {
                InlineClassHelperKt.m5597b("reset() called on an unattached node");
            }
            mo2161R1();
        }

        /* JADX INFO: renamed from: T1 */
        public void mo4869T1() {
            if (!this.f17194s) {
                InlineClassHelperKt.m5597b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f17191p) {
                InlineClassHelperKt.m5597b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f17191p = false;
            mo2174P1();
            this.f17192q = true;
        }

        /* JADX INFO: renamed from: U1 */
        public void mo4870U1() {
            if (!this.f17194s) {
                InlineClassHelperKt.m5597b("node detached multiple times");
            }
            if (this.f17188j == null) {
                InlineClassHelperKt.m5597b("detach invoked on a node without a coordinator");
            }
            if (!this.f17192q) {
                InlineClassHelperKt.m5597b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f17192q = false;
            Function0 function0 = this.f17193r;
            if (function0 != null) {
                function0.invoke();
            }
            mo2208Q1();
        }

        /* JADX INFO: renamed from: V1 */
        public void mo4871V1(Node node) {
            this.f17181a = node;
        }

        /* JADX INFO: renamed from: W1 */
        public void mo4872W1(NodeCoordinator nodeCoordinator) {
            this.f17188j = nodeCoordinator;
        }

        /* JADX INFO: renamed from: P1 */
        public void mo2174P1() {
        }

        /* JADX INFO: renamed from: Q1 */
        public void mo2208Q1() {
        }

        /* JADX INFO: renamed from: R1 */
        public void mo2161R1() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion implements Modifier {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f17180a = new Companion();

        @Override // androidx.compose.p013ui.Modifier
        public final boolean all(Function1 function1) {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.p013ui.Modifier
        public final Modifier then(Modifier modifier) {
            return modifier;
        }

        @Override // androidx.compose.p013ui.Modifier
        public final Object foldIn(Object obj, Function2 function2) {
            return obj;
        }
    }
}
