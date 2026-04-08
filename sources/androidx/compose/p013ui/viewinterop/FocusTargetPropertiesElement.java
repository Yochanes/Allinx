package androidx.compose.p013ui.viewinterop;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/viewinterop/FocusTargetPropertiesNode;", "<init>", "()V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusTargetPropertiesElement extends ModifierNodeElement<FocusTargetPropertiesNode> {

    /* JADX INFO: renamed from: a */
    public static final FocusTargetPropertiesElement f20679a = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return new FocusTargetPropertiesNode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2160b(Modifier.Node node) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -659549572;
    }
}
