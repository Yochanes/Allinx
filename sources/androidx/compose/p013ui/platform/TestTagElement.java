package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/platform/TestTagNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TestTagElement extends ModifierNodeElement<TestTagNode> {

    /* JADX INFO: renamed from: a */
    public final String f19529a;

    public TestTagElement(String str) {
        this.f19529a = str;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        TestTagNode testTagNode = new TestTagNode();
        testTagNode.f19530t = this.f19529a;
        return testTagNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((TestTagNode) node).f19530t = this.f19529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.m18594b(this.f19529a, ((TestTagElement) obj).f19529a);
    }

    public final int hashCode() {
        return this.f19529a.hashCode();
    }
}
